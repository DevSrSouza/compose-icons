@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")
@file:Repository("file:///home/devsrsouza/.m2/repository")

// svg-to-compose
//@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.5.0")
@file:DependsOn("br.com.devsrsouza:svg-to-compose:0.6.0-SNAPSHOT")
@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:3.5.0.201409260305-r")

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import com.google.gson.Gson
import org.eclipse.jgit.api.Git
import java.io.File
import java.text.Normalizer

fun File.makeDirs() = apply { mkdirs() }

data class Icon(var title: String, var slug: String?, var hex: String, var source: String)
data class SimpleIcons(var icons: List<Icon>)

val ignoredIcons = listOf(
    "Elsevier"
)

val githubId = "simple-icons/simple-icons"
val repository = "https://github.com/$githubId"
val version = "4.14.0"
val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
val blobGithubRepository = "$repository/blob/$version"

val repoCloneDir = createTempDir(suffix = "git-repo-simpleicons")

println("Cloning repository")
val git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().setName("refs/tags/$version").call()

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
val iconsFileNames = iconsNamesFixed
    .associate {
        val sourceName = it.replace(" ", "_").replace("-", "_") + ".svg"
        val fileName = it.replace(" ", "") + ".svg"

        File(iconsDir, fileName).renameTo(File(iconsDir, sourceName))

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

fun replacePathName(path: String): String {
    val iconName = path.substringAfterLast('/')
    return path.replace(iconName, iconsFileNames[iconName]!!)
}

val svgBaseUrl = "$rawGithubRepository/icons/%s.svg"

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

println("Generating all svg to compose")

val result = Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "SimpleIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons"
)

println("Copying LICENSE from the Icon pack")

val licensePath = "LICENSE.md"
val licenseFile = File(repoCloneDir, licensePath)

val resDir = File("src/commonMain/resources").makeDirs()
val licenseInResource = File(resDir, "simpleicons-license.txt")

licenseFile.copyTo(licenseInResource, overwrite = true)

println("Generating documentation")

data class DocumentationGroup(
    val groupName: String,
    val groupAccessingFormat: String,
    val icons: List<DocumentationIcon>,
)

data class DocumentationIcon(
    val accessingFormat: String,
    val svgFilePathRelativeToRepository: String,
)

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
    # [Simple Icons](https://simpleicons.org/)

    <br />

""".trimIndent()

val license = """
    ## [License]($blobGithubRepository/$licensePath)
    
    ```
    
    """.trimIndent() + licenseFile.readText().trimEnd { it == '\n' } + "\n```\n\n<br /><br />\n\n"

File("DOCUMENTATION.md").apply{
    if(exists().not()) createNewFile()
}.writeText(
    header + "\n" + license + "\n" + documentationGroups
)
