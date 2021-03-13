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

val githubId = "feathericons/feather"
val repository = "https://github.com/$githubId.git"
val version = "v4.28.0"
val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"

val repoCloneDir = createTempDir(suffix = "feather-git-repo")

println("Cloning feather repository")
val git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().setName("refs/tags/$version").call()

val iconsDir = File(repoCloneDir, "icons")

// renaming to match to svg-to-compose
val previousNames: List<Pair<String, String>> = iconsDir.listFiles().filter { it.extension == "svg" }
    .map{
        val name = it.name
        val newFile = File(it.parentFile, name.replace("-", "_"))
        it.renameTo(newFile)

        name to newFile.name
    }

fun replaceSvgPathWithPreviousName(svgPath: String): String {
    return previousNames.fold(svgPath) { path, (old, new) -> path.replace(new, old) }
}

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

println("Generating all svg to compose")

val result = Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "FeatherIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons"
)

println("Copying LICENSE from the Icon pack")

val licenseFile = File(repoCloneDir, "LICENSE")

val resDir = File("src/commonMain/resources").makeDirs()
val licenseInResource = File(resDir, "feather-license.txt")

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

fun List<DocumentationIcon>.iconsTableDocumentation(): String = map {
    "| ![](${rawGithubRepository + "/" + replaceSvgPathWithPreviousName(it.svgFilePathRelativeToRepository) }) | ${it.accessingFormat} |"
}.joinToString("\n")

val documentationGroups = result.asDocumentationGroupList()
    .filter { it.icons.isNotEmpty() }
    .map {
        """
            ## ${it.groupName}
            
            | Icon | In Code |
            | --- | --- |
        """.trimIndent() + "\n" + it.icons.iconsTableDocumentation()
    }.joinToString("\n<br /><br />\n")

val header = """
    # [Feather Icons](https://feathericons.com/)
    
    <br />
    
""".trimIndent()

File("DOCUMENTATION.md").apply{
    if(exists().not()) createNewFile()
}.writeText(
    header + "\n" + documentationGroups
)