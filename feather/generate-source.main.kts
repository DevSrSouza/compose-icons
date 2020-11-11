@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:0.3.0")
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
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.eclipse.jgit.api.Git
import java.io.File

fun File.makeDirs() = apply { mkdirs() }

val buildDir = File("build/").makeDirs()

val featherRepository = "https://github.com/feathericons/feather.git"

val repoCloneDir = createTempDir(suffix = "feather-git-repo")

println("Cloning feather repository")
Git.cloneRepository()
    .setURI(featherRepository)
    .setDirectory(repoCloneDir)
    .call()

val iconsDir = File(repoCloneDir, "icons")

// renaming to match to svg-to-compose
iconsDir.listFiles().filter { it.extension == "svg" }
    .forEach{
        val newFile = File(it.parentFile, it.name.replace("-", "_"))
        it.renameTo(newFile)
    }

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }

println("Generating all svg to compose")

Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "feather_icons",
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
