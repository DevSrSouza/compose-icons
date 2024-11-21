import generator.MapIconsToSvgComposeFolderResult
import generator.SvgToComposeConfig
import generator.makeDirs
import generator.putRelocatedRelativeTo
import generator.registerGeneratorTask

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.evaicons"
}

registerGeneratorTask(
    githubId = "akveo/eva-icons",
    version = "v1.1.3",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val repoIcons = File(repoCloneDir, "package/icons")
        val iconsDir = File(repoCloneDir, "icons-to-build").makeDirs()

        val outputFill = File(iconsDir, "fill").makeDirs()
        File(repoIcons, "fill/svg").copyRecursively(outputFill)

        val outputOutline = File(iconsDir, "outline").makeDirs()
        File(repoIcons, "outline/svg").copyRecursively(outputOutline)

        val relocatedNames = mutableMapOf<String, String>()

        outputFill.listFiles().filter { it.extension == "svg" }
            .forEach {
                val previousFile = File(repoIcons, "fill/svg/${it.name}")
                val newFile = File(it.parentFile, it.name.replace("-", "_"))
                relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, previousFile)

                it.renameTo(newFile)
            }
        outputOutline.listFiles().filter { it.extension == "svg" }
            .forEach {
                val previousFile = File(repoIcons, "outline/svg/${it.name}")
                val newFile = File(it.parentFile, it.name.replace("-", "_"))
                relocatedNames.putRelocatedRelativeTo(repoCloneDir, newFile, previousFile)

                it.renameTo(newFile)
            }

        MapIconsToSvgComposeFolderResult(
            iconsFolder = iconsDir,
            relocatedNames = relocatedNames
        )
    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "EvaIcons",
        iconNameTransformer = { name, group ->
            fun String.removeSuffix(suffix: String, ignoreCase: Boolean): String {
                if(ignoreCase) {
                    val index = lastIndexOf(suffix, ignoreCase = true)

                    return if(index > -1) substring(0, index) else this
                } else {
                    return removeSuffix(suffix)
                }
            }

            name.removeSuffix(group, ignoreCase = true)
        }
    ),
    licensePathAtRepo = { "LICENSE.txt" },
    documentationHeader = "[Eva Icons](https://akveo.github.io/eva-icons)",
)