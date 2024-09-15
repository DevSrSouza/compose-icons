package generator

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import org.gradle.api.Project
import org.jetbrains.kotlin.com.google.common.base.CaseFormat
import org.jetbrains.kotlin.com.google.gson.Gson
import java.io.File
import java.text.Normalizer

private fun File.makeDirs() = apply { mkdirs() }

data class SvgToComposeConfig(
    val accessorName: String,
    val type: VectorType = VectorType.SVG,
    val iconNameTransformer: (iconName: String, group: String) -> String = { it, _ -> it },
)

data class MapIconsToSvgComposeFolderResult(
    val iconsFolder: File, // folder ready to use SvgToCompose
    val relocatedNames: Map<String, String>, // Key = File name updated, value = previous file name
)

private data class DocumentationGroup(
    val groupName: String,
    val groupAccessingFormat: String,
    val icons: List<DocumentationIcon>,
)

private data class DocumentationIcon(
    val accessingFormat: String,
    val svgFilePathRelativeToRepository: String,
)

internal fun String.toKotlinPropertyName(): String {
    return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, this).let { name ->
        if (name.first().isDigit()) "_$name" else name
    }
}

fun Project.generate(
    githubId: String,
    version: String,
    mapSourceCodeIconsToSvgComposeFolder: (repoCloneDir: File) -> MapIconsToSvgComposeFolderResult,
    svgToComposeConfig: SvgToComposeConfig,
    licensePathAtRepo: () -> String,
    documentationHeader: String,
    gitCheckoutName: String = "refs/tags/$version"
) {
    val repository = "https://github.com/$githubId"
    val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
    val blobGithubRepository = "$repository/blob/$version"

    val repoCloneDir = createTempDir(suffix = "git-repo")

    println("Cloning repository")
    val git = Git.cloneRepository()
        .setURI(repository)
        .setDirectory(repoCloneDir)
        .call()
    git.checkout().setName(gitCheckoutName).call()

    // target code generation folder
    // TODO: update to a know commited folder
    val targetCodeGeneratorDir = File(projectDir, "src/commonMain/kotlin").apply {
        mkdirs()
        deleteRecursively()
        mkdirs()
    }

    val mapResultConfig = mapSourceCodeIconsToSvgComposeFolder(repoCloneDir)
    val mappedVectorsDir = mapResultConfig.iconsFolder

    val result = Svg2Compose.parse(
        applicationIconPackage = "compose.icons",
        accessorName = svgToComposeConfig.accessorName,
        outputSourceDirectory = targetCodeGeneratorDir,
        vectorsDirectory = mappedVectorsDir,
        type = svgToComposeConfig.type,
        allAssetsPropertyName = "AllIcons",
        iconNameTransformer = { it, g -> svgToComposeConfig.iconNameTransformer(it.toKotlinPropertyName(), g) },
        generatePreview = false,
    )

    // License copy
    val licensePath = licensePathAtRepo()
    val licenseFile = File(repoCloneDir, licensePath)
    val resDir = File(projectDir, "src/commonMain/resources").makeDirs()

    val licenseInResource = File(resDir, "${githubId.replace("/", "-")}-license.txt")
    licenseFile.copyTo(licenseInResource, overwrite = true)

    // Documentation

    fun replacePathName(path: String): String {
        return mapResultConfig.relocatedNames[path]!!
    }

    fun ParsingResult.asDocumentationGroup(
        accessingGroupFormat: String
    ): DocumentationGroup {
        return DocumentationGroup(
            groupName = groupName.second,
            groupAccessingFormat = accessingGroupFormat,
            icons = generatedIconsMemberNames.map {
                DocumentationIcon(
                    "$accessingGroupFormat.${it.value.simpleName}",
                    it.key.relativeTo(repoCloneDir).path
                )
            }
        )
    }

    fun ParsingResult.asDocumentationGroupList(
        previousAccessingGroupFormat: String? = null
    ): List<DocumentationGroup> {
        val accessingGroupFormat = if(previousAccessingGroupFormat != null)
            "$previousAccessingGroupFormat.${groupName.second}"
        else groupName.second

        return listOf(asDocumentationGroup(accessingGroupFormat)) + generatedGroups.flatMap {
            it.asDocumentationGroupList(accessingGroupFormat)
        }
    }

    fun markdownSvg(doc: DocumentationIcon): String {
        return "![](${rawGithubRepository + "/" + replacePathName(doc.svgFilePathRelativeToRepository) })"
    }

    fun markdownIconDocumentation(doc: DocumentationIcon): String {
        return "${markdownSvg(doc)} | ${doc.accessingFormat}"
    }

    val chunks = 3
    fun List<DocumentationIcon>.iconsTableDocumentation(): String = sortedBy { it.accessingFormat }
        .chunked(chunks).map {
            "| ${it.map { markdownIconDocumentation(it) }.joinToString(" | ")} |"
        }.joinToString("\n")

    val documentationGroups = result.asDocumentationGroupList()
        .filter { it.icons.isNotEmpty() }
        .map {
            """
                ## ${it.groupName}
                
                |${" Icon | In Code |".repeat(chunks)}
                |${" --- | --- |".repeat(chunks)}
            """.trimIndent() + "\n" + it.icons.iconsTableDocumentation()
        }.joinToString("\n<br /><br />\n")

    val header = """
        # $documentationHeader
        
        <br />
        
    """.trimIndent()

    val license = """
        ## [License]($blobGithubRepository/$licensePath)
        
        <br />
        
        ```
    
    """.trimIndent() + licenseFile.readText().trimEnd { it == '\n' } + "\n```\n\n<br /><br />\n\n"

    File(projectDir, "DOCUMENTATION.md").apply{
        if(exists().not()) createNewFile()
    }.writeText(
        header + "\n" + license + "\n" + documentationGroups
    )
}

fun MutableMap<String, String>.putRelocatedRelativeTo(relative: File, key: File, value: File) {
    put(key.relativeTo(relative).path, value.relativeTo(relative).path)
}

fun Project.generateCssGg() {
    generate(
        githubId = "astrit/css.gg",
        version = "2.0.0",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val iconsDir = File(repoCloneDir, "icons/svg")

            val relocatedNames = mutableMapOf<String, String>()

            // renaming to match to svg-to-compose
            iconsDir.walkTopDown().filter { it.extension == "svg" }
                .forEach {
                    val newFile = File(it.parentFile, it.name.replace("-", "_"))

                    // store the name change
                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                    // rename to conform with SVG to Compose
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames
            )
        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "CssGgIcons",
        ),
        licensePathAtRepo = { "LICENSE" },
        documentationHeader = "[css.gg](https://css.gg/)"
    )
}

fun Project.generateFeather() {
    generate(
        githubId = "feathericons/feather",
        version = "v4.28.0",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val iconsDir = File(repoCloneDir, "icons")

            val relocatedNames = mutableMapOf<String, String>()

            // renaming to match to svg-to-compose
            iconsDir.listFiles().filter { it.extension == "svg" }
                .forEach {
                    val newFile = File(it.parentFile, it.name.replace("-", "_"))

                    // store the name change
                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                    // rename to conform with SVG to Compose
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames,
            )

        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "FeatherIcons",
        ),
        licensePathAtRepo = { "LICENSE" },
        documentationHeader = "[Feather Icons](https://feathericons.com/)"
    )
}

fun Project.generateFontAwesome() {
    generate(
        githubId = "FortAwesome/Font-Awesome",
        version = "5.15.2",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val relocatedNames = mutableMapOf<String, String>()

            val iconsDir = File(repoCloneDir, "svgs")

            // renaming to match to svg-to-compose
            iconsDir.walkTopDown().filter { it.extension == "svg" }
                .forEach {
                    val newFile = File(it.parentFile, it.name.replace("-", "_"))

                    // store the name change
                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                    // rename to conform with SVG to Compose
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames,
            )

        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "FontAwesomeIcons",
        ),
        licensePathAtRepo = { "LICENSE.txt" },
        documentationHeader = "[Font Awesome](https://fontawesome.com/icons)"
    )
}

fun Project.generateLineAwesome() {
    generate(
        githubId = "icons8/line-awesome",
        version = "a60f11367584e7df157277b5ab9d1654ec91ae24",
        gitCheckoutName = "a60f11367584e7df157277b5ab9d1654ec91ae24",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val relocatedNames = mutableMapOf<String, String>()

            val iconsDir = File(repoCloneDir, "svg")

            // renaming to match to svg-to-compose
            iconsDir.listFiles().filter { it.extension == "svg" }
                .forEach {
                    val newFile = File(it.parentFile, it.name.replace("-", "_"))

                    // store the name change
                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                    // rename to conform with SVG to Compose
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames,
            )

        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "LineAwesomeIcons",
        ),
        licensePathAtRepo = { "LICENSE.md" },
        documentationHeader = "[Line Awesome](https://icons8.com/line-awesome)"
    )
}

fun Project.generateLinea() {
    generate(
        githubId = "linea-io/Linea-Iconset",
        version = "1.0",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val relocatedNames = mutableMapOf<String, String>()

            val repoIconsDirs = repoCloneDir.listFiles().filter(File::isDirectory)
                .filter { it.name.startsWith("_") }

            val iconsDir = File(repoCloneDir, "tmp-icons").apply { mkdir() }

            // renaming to match to svg-to-compose
            for(f in repoIconsDirs) {
                val svgsDir = File(f, "_SVG")
                val groupName = f.name.removePrefix("_")

                val relocateFolder = File(iconsDir, groupName).apply { mkdirs() }

                svgsDir.listFiles().filter { it.extension == "svg" }
                    .forEach {
                        val iconName = it.nameWithoutExtension.removePrefix(groupName).replace(" ", "_").replace("-","_").trim() + "." + it.extension
                        val relocateIcon = File(relocateFolder, iconName)

                        it.copyTo(relocateIcon)

                        relocatedNames.putRelocatedRelativeTo(repoCloneDir, relocateIcon, it)
                        //relocatedNames[relocateIcon.relativeTo(repoCloneDir).path] = it.relativeTo(repoCloneDir).path
                    }
            }

            iconsDir.listFiles().filter { it.extension == "svg" }
                .forEach{
                    val newFile = File(it.parentFile, it.name.removePrefix("wi-").replace("-", "_"))
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames,
            )

        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "LineaIcons",
        ),
        licensePathAtRepo = { "LICENSE" },
        documentationHeader = "[Linea](http://www.linea.io/)"
    )
}

fun Project.generateOcticons() {
    generate(
        githubId = "primer/octicons",
        version = "v12.1.0",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val relocatedNames = mutableMapOf<String, String>()

            val iconsDir = File(repoCloneDir, "icons")

            // renaming to match to svg-to-compose
            iconsDir.walkTopDown().filter { it.extension == "svg" }
                .forEach {
                    val newFile = File(it.parentFile, it.name.replace("-", "_"))

                    // store the name change
                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                    // rename to conform with SVG to Compose
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames,
            )

        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "Octicons",
        ),
        licensePathAtRepo = { "LICENSE" },
        documentationHeader = "[Octicons](https://primer.style/octicons/)"
    )
}

data class Icon(var title: String, var slug: String?, var hex: String, var source: String)
data class SimpleIcons(var icons: List<Icon>)

fun Project.generateSimpleIcons() {
    generate(
        githubId = "simple-icons/simple-icons",
        version = "4.14.0",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val relocatedNames = mutableMapOf<String, String>()

            val ignoredIcons = listOf(
                "Elsevier"
            )

            val iconsJsonFile = File(repoCloneDir, "_data/simple-icons.json")

            val icons = Gson().fromJson<SimpleIcons>(iconsJsonFile.readText(), SimpleIcons::class.java).icons

            fun String.normalize(form: Normalizer.Form): String {
                return Normalizer.normalize(this, form)
            }

            fun iconTitleToSlug(title: String): String {
                return title.toLowerCase()
                    .replace("\\+".toRegex(), "plus")
                    .replace("^\\.".toRegex(), "dot-")
                    .replace("\\.$".toRegex(), "-dot")
                    .replace("\\.".toRegex(), "-dot-")
                    .replace("^&".toRegex(), "and-")
                    .replace("&$".toRegex(), "-and")
                    .replace("&".toRegex(), "-and-")
                    .replace("đ".toRegex(), "d")
                    .replace("ħ".toRegex(), "h")
                    .replace("ı".toRegex(), "i")
                    .replace("ĸ".toRegex(), "k")
                    .replace("ŀ".toRegex(), "l")
                    .replace("ł".toRegex(), "l")
                    .replace("ß".toRegex(), "ss")
                    .replace("ŧ".toRegex(), "t")
                    .normalize(Normalizer.Form.NFD)
                    .replace("[\u0300-\u036f]".toRegex(), "")
                    .replace("[^a-z0-9\\-]".toRegex(), "")
            }

            val iconsNamesFixed = icons.map { if(it.slug != null) it.slug!! else iconTitleToSlug(it.title) }

            val iconsDir = File(repoCloneDir, "icons")

            iconsNamesFixed
                .associate {
                    val sourceName = it.replace(" ", "_").replace("-", "_") + ".svg"
                    val fileName = it.replace(" ", "") + ".svg"

                    val icon = File(iconsDir, fileName)
                    val renamed = File(iconsDir, sourceName)
                    icon.renameTo(renamed)

                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, icon, renamed)

                    sourceName to fileName
                }
                .apply {
                    forEach {
                        if (ignoredIcons.any { ignored -> it.value.contains(ignored, ignoreCase = true) }) {
                            File(iconsDir, it.value).delete()
                            println("Removed ignored icon: ${it.key}")
                        }
                    }
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames,
            )

        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "SimpleIcons",
        ),
        licensePathAtRepo = { "LICENSE.md" },
        documentationHeader = "[Simple Icons](https://simpleicons.org/)"
    )
}

fun Project.generateTablerIcons() {
    generate(
        githubId = "tabler/tabler-icons",
        version = "v1.39.1",
        mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
            val iconsDir = File(repoCloneDir, "icons")

            val relocatedNames = mutableMapOf<String, String>()

            // renaming to match to svg-to-compose
            iconsDir.listFiles().filter { it.extension == "svg" }
                .forEach {
                    val newFile = File(it.parentFile, it.name.replace("-", "_"))

                    // store the name change
                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, it)

                    // rename to conform with SVG to Compose
                    it.renameTo(newFile)
                }

            MapIconsToSvgComposeFolderResult(
                iconsFolder = iconsDir,
                relocatedNames = relocatedNames
            )
        },
        svgToComposeConfig = SvgToComposeConfig(
            accessorName = "TablerIcons",
        ),
        licensePathAtRepo = { "LICENSE" },
        documentationHeader = "[Tabler Icons](https://tabler-icons.io/)"
    )
}