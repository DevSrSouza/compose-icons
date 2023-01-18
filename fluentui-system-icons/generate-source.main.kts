@file:Repository("https://jitpack.io") @file:Repository("https://dl.google.com/dl/android/maven2/") @file:Repository("https://repo.maven.apache.org/maven2/") @file:Repository(
    "file:///home/devsrsouza/.m2/repository"
)

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.8.1") @file:DependsOn("com.google.guava:guava:23.0") @file:DependsOn(
    "com.android.tools:sdk-common:27.2.0-alpha16"
) @file:DependsOn("com.android.tools:common:27.2.0-alpha16") @file:DependsOn("com.squareup:kotlinpoet:1.7.2") @file:DependsOn(
    "org.ogce:xpp3:1.1.6"
)

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:6.4.0.202211300538-r")

import br.com.devsrsouza.svg2compose.ParsingResult
import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val githubId = "microsoft/fluentui-system-icons"
val repository = "https://github.com/$githubId"
val version = "1.1.192"
val rawGithubRepository = "https://raw.githubusercontent.com/$githubId/$version"
val blobGithubRepository = "$repository/blob/$version"

val repoCloneDir = createTempDir(suffix = "fsi-git-repo")

println("Cloning repository")
val git = Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()
git.checkout().setName("refs/tags/$version").call()

val repoIcons = File(repoCloneDir, "assets")

val iconsDir = File(repoCloneDir, "icons-to-build").makeDirs()
val filledDir = File(iconsDir, "Filled").makeDirs()
val regularDir = File(iconsDir, "Regular").makeDirs()
val regEx = Regex("[A-Za-z_]*(24|024)_(regular|filled)\$")

// renaming to match to svg-to-compose
fun replaceName(name : String): String {
    return name.replace('-', '_')
        .replace("ic_fluent_", "")
        .replace("_024_regular", "")
        .replace("_024_filled", "")
        .replace("_24_regular", "")
        .replace("_24_filled", "")
}

repoIcons.walkTopDown().forEach { file ->
    if (file.extension == "svg" && regEx.matches(file.nameWithoutExtension)) {
        try {
            if (file.nameWithoutExtension.contains("filled")) {
                file.copyTo(filledDir.resolve(replaceName(file.name)))
            } else {
                file.copyTo(regularDir.resolve(replaceName(file.name)))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

fun replacePathName(path: String): String {
    return path.replace("icons-to-build", "assets") // todo doesn't work
        .replace("_", "-")
}

val srcDir = File("fluentui-system-icons/src/commonMain/kotlin").apply { mkdirs() }
srcDir.deleteRecursively()
srcDir.mkdirs()

fun String.removeSuffix(suffix: String, ignoreCase: Boolean): String {
    if (ignoreCase) {
        val index = lastIndexOf(suffix, ignoreCase = true)

        return if (index > -1) substring(0, index) else this
    } else {
        return removeSuffix(suffix)
    }
}

println("Generating all svg to compose")

val result = Svg2Compose.parse(applicationIconPackage = "compose.icons",
    accessorName = "FluentUiIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons",
    iconNameTransformer = { name, group -> name.removeSuffix(group, ignoreCase = true) })

println("Copying LICENSE from the Icon pack")

val licensePath = "LICENSE"
val licenseFile = File(repoCloneDir, licensePath)

val resDir = File("fluentui-system-icons/src/commonMain/resources").makeDirs()
val licenseInResource = File(resDir, "fluent-ui-icons-license.txt")

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
    val accessingGroupFormat =
        if (previousAccessingGroupFormat != null) "$previousAccessingGroupFormat.${groupName.second}"
        else groupName.second

    return listOf(asDocumentationGroup(accessingGroupFormat)) + generatedGroups.flatMap {
        it.asDocumentationGroupList(accessingGroupFormat)
    }
}

fun ParsingResult.asDocumentationGroup(
    accessingGroupFormat: String
): DocumentationGroup {
    return DocumentationGroup(groupName = groupName.second,
        groupAccessingFormat = accessingGroupFormat,
        icons = generatedIconsMemberNames.map {
            DocumentationIcon(
                "$accessingGroupFormat.${it.value.simpleName}", it.key.relativeTo(repoCloneDir).path
            )
        })
}

fun markdownSvg(doc: DocumentationIcon): String {
    return "![](${rawGithubRepository + "/" + replacePathName(doc.svgFilePathRelativeToRepository)})"
}

fun markdownIconDocumentation(doc: DocumentationIcon): String {
    return "${markdownSvg(doc)} | ${doc.accessingFormat}"
}

val chunks = 2
fun List<DocumentationIcon>.iconsTableDocumentation(): String = sortedBy { it.accessingFormat }.chunked(chunks).map {
    "| ${it.map { markdownIconDocumentation(it) }.joinToString(" | ")} |"
}.joinToString("\n")

val documentationGroups = result.asDocumentationGroupList().filter { it.icons.isNotEmpty() }.map {
    """
            ## ${it.groupName}
            
            |${" Icon | In Code |".repeat(chunks)}
            |${" --- | --- |".repeat(chunks)}
        """.trimIndent() + "\n" + it.icons.iconsTableDocumentation()
}.joinToString("\n<br /><br />\n")

val header = """
    # [Fluent UI System Icons](https://github.com/microsoft/fluentui-system-icons)
    
    <br />
    
""".trimIndent()

val license = """
    ## [License]($blobGithubRepository/$licensePath)
    
    ```
    
    """.trimIndent() + licenseFile.readText().trimEnd { it == '\n' } + "\n```\n\n<br /><br />\n\n"

File("fluentui-system-icons/DOCUMENTATION.md").apply {
    if (exists().not()) createNewFile()
}.writeText(
    header + "\n" + license + "\n" + documentationGroups
)
