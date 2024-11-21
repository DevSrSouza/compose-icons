import generator.MapIconsToSvgComposeFolderResult
import generator.SvgToComposeConfig
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
    namespace = "compose.icons.fontawesome"
}

registerGeneratorTask(
    githubId = "FortAwesome/Font-Awesome",
    version = "6.6.0",
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