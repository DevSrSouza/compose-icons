@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")
//@file:Repository("file:///home/devsrsouza/.m2/repository")

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.4.0")
@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")

// Jgit
@file:DependsOn("org.eclipse.jgit:org.eclipse.jgit:3.5.0.201409260305-r")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val repository = "https://github.com/akveo/eva-icons/"

val repoCloneDir = createTempDir(suffix = "eva-git-repo")

println("Cloning repository")
Git.cloneRepository()
    .setURI(repository)
    .setDirectory(repoCloneDir)
    .call()

val repoIcons = File(repoCloneDir, "package/icons")

val iconsDir = File(repoCloneDir, "icons-to-build").makeDirs()
File(repoIcons, "fill/svg").copyRecursively(File(iconsDir, "fill").makeDirs())
File(repoIcons, "outline/svg").copyRecursively(File(iconsDir, "outline").makeDirs())

// renaming to match to svg-to-compose
iconsDir.walkTopDown().filter { it.extension == "svg" }
    .forEach {
        val newFile = File(it.parentFile, it.name.replace("-", "_"))
        it.renameTo(newFile)
    }

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }

fun String.removeSuffix(suffix: String, ignoreCase: Boolean): String {
    if(ignoreCase) {
        val index = lastIndexOf(suffix, ignoreCase = true)

        return if(index > -1) substring(0, index) else this
    } else {
        return removeSuffix(suffix)
    }
}

println("Generating all svg to compose")

Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "EvaIcons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = iconsDir,
    type = VectorType.SVG,
    allAssetsPropertyName = "AllIcons",
    iconNameTransformer = { name, group -> name.removeSuffix(group, ignoreCase = true) }
)

println("Copying LICENSE from the Icon pack")

val licenseFile = File(repoCloneDir, "LICENSE.txt")

val resDir = File("src/commonMain/resources").makeDirs()
val licenseInResource = File(resDir, "eva-license.txt")

licenseFile.copyTo(licenseInResource, overwrite = true)
