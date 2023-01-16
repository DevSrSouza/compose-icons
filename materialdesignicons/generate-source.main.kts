@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")
@file:Repository("file:///home/devsrsouza/.m2/repository")
@file:Repository("https://dl.google.com/dl/android/maven2/")
@file:Repository("https://repo.maven.apache.org/maven2/")

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1")
//@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
//@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
//@file:DependsOn("org.ogce:xpp3:1.1.6")

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:3.5.0.201409260305-r")

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val githubId = "Templarian/MaterialDesign"
val repository = "https://github.com/$githubId"
val version = ""  // there is no versioning in this library
val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
val blobGithubRepository = repository  // there is no versioning in this library

val repoCloneDir = createTempDir(suffix = "mdi-git-repo")

println("Cloning MaterialDesign repository")

val git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().call()

val iconsDir = File(repoCloneDir, "svg")

// renaming to match to svg-to-compose
iconsDir.listFiles().filter { it.extension == "svg" }
    .forEach{
        val newFile = File(it.parentFile, it.name.replace("-", "_"))
        it.renameTo(newFile)
    }

fun replacePathName(path: String): String {
    return path.replace("_", "-")
}

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

println("Generating all svg to compose")

val result = Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "MaterialDesignIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons"
)

println("Copying LICENSE from the Icon pack")

val licensePath = "LICENSE"
val licenseFile = File(repoCloneDir, licensePath)

val resDir = File("src/commonMain/resources").makeDirs()
val licenseInResource = File(resDir, "material-design-icons-license.txt")

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

val chunks = 2
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
    # [Tabler Icons](https://tabler-icons.io/)
    
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
