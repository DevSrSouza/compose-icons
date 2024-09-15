package generator

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import org.eclipse.jgit.transport.RefSpec
import org.eclipse.jgit.transport.URIish
import org.gradle.api.Project
import org.jetbrains.kotlin.com.google.common.base.CaseFormat
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

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

fun Project.registerGeneratorTask(
    githubId: String,
    version: String,
    mapSourceCodeIconsToSvgComposeFolder: (repoCloneDir: File) -> MapIconsToSvgComposeFolderResult,
    svgToComposeConfig: SvgToComposeConfig,
    licensePathAtRepo: () -> String?,
    documentationHeader: String,
    gitCheckoutName: String = "refs/tags/$version",
    licenseUrl: (blobGithubRepository: String, licensePath: String) -> String = { blobGithubRepository, licensePath -> "$blobGithubRepository/$licensePath" },
) {
    tasks.register("generateIcons") {
        doFirst {
            generate(
                githubId = githubId,
                version = version,
                mapSourceCodeIconsToSvgComposeFolder = mapSourceCodeIconsToSvgComposeFolder,
                svgToComposeConfig = svgToComposeConfig,
                licensePathAtRepo = licensePathAtRepo,
                documentationHeader = documentationHeader,
                gitCheckoutName = gitCheckoutName,
                licenseUrl = licenseUrl,
            )
        }
    }
}

private fun Project.generate(
    githubId: String,
    version: String,
    mapSourceCodeIconsToSvgComposeFolder: (repoCloneDir: File) -> MapIconsToSvgComposeFolderResult,
    svgToComposeConfig: SvgToComposeConfig,
    licensePathAtRepo: () -> String?,
    documentationHeader: String,
    gitCheckoutName: String = "refs/tags/$version",
    licenseUrl: (blobGithubRepository: String, licensePath: String) -> String = { blobGithubRepository, licensePath -> "$blobGithubRepository/$licensePath" },
) {
    val repository = "https://github.com/$githubId"
    val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
    val blobGithubRepository = "$repository/blob/$version"

    val repoCloneDir = createTempDir(suffix = "git-repo")

    println("Cloning repository")
    val git = Git.init()
        .setDirectory(repoCloneDir)
        .call()
    git.remoteAdd()
        .setName("origin")
        .setUri(URIish(repository))
        .call()
    git.fetch()
        .setRemote("origin")
        .setRefSpecs(RefSpec(gitCheckoutName))
        .setDepth(1)
        .call()
    git.checkout()
        .setName(gitCheckoutName)
        .call()
    println("Finish clone repository")

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
        generateStringAccessor = true,
    )

    // License copy
    val licensePath = licensePathAtRepo()
    if(licensePath != null) {
        val licenseFile = File(repoCloneDir, licensePath)
        val resDir = File(projectDir, "src/commonMain/resources").makeDirs()

        val licenseInResource = File(resDir, "${githubId.replace("/", "-")}-license.txt")
        licenseFile.copyTo(licenseInResource, overwrite = true)
    }

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
        return "<img src=\"${rawGithubRepository + "/" + replacePathName(doc.svgFilePathRelativeToRepository) }\" width=64 height=64 /> "
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

    val license = buildString {
        append("""
            ## [License](${licenseUrl(blobGithubRepository, licensePath ?: "")})
            
            <br />
            
            ```
        
        """.trimIndent())

        if(licensePath != null) {
            val licenseFile = File(repoCloneDir, licensePath)
            append(licenseFile.readText().trimEnd { it == '\n' } + "\n```\n\n<br /><br />\n\n")
        }
    }

    File(projectDir, "DOCUMENTATION.md").apply{
        if(exists().not()) createNewFile()
    }.writeText(
        header + "\n" + license + "\n" + documentationGroups
    )
}

fun MutableMap<String, String>.putRelocatedRelativeTo(relative: File, key: File, value: File) {
    put(key.relativeTo(relative).path, value.relativeTo(relative).path)
}

data class Icon(var title: String, var slug: String?, var hex: String, var source: String)
data class SimpleIcons(var icons: List<Icon>)