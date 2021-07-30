@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")
@file:Repository("file:///home/devsrsouza/.m2/repository")

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1")
@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:3.5.0.201409260305-r")

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val githubId = "erikflowers/weather-icons"
val repository = "https://github.com/$githubId"
val version = "2.0.12"
val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
val blobGithubRepository = "$repository/blob/$version"

val repoCloneDir = createTempDir(suffix = "weather-icons-git-repo")

println("Cloning $githubId repository")
val git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().setName("refs/tags/$version").call()

val iconsDir = File(repoCloneDir, "svg")

// renaming to match to svg-to-compose
iconsDir.listFiles().filter { it.extension == "svg" }
    .forEach{
        val newFile = File(it.parentFile, it.name.removePrefix("wi-").replace("-", "_"))
        it.renameTo(newFile)
    }

fun replacePathName(path: String): String {
    val svgName = path.substringAfterLast("/")
    return path.replace(svgName, "wi-$svgName").replace("_", "-")
}

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

println("Generating all svg to compose")

val result = Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "WeatherIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons"
)

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
    return "<img src=\"${rawGithubRepository + "/" + replacePathName(doc.svgFilePathRelativeToRepository) }\" width=64 height=64 /> "
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
    # [Weather Icons by Erik Flowers](https://github.com/erikflowers/weather-icons)
    
    <br />
    
""".trimIndent()

val license = """
    ## [License](http://scripts.sil.org/OFL)
    
    <br />
    
    """.trimIndent()

File("DOCUMENTATION.md").apply{
    if(exists().not()) createNewFile()
}.writeText(
    header + "\n" + license + "\n" + documentationGroups
)
