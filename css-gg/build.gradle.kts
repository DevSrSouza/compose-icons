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
    namespace = "compose.icons.cssgg"
}

registerGeneratorTask(
    githubId = "astrit/css.gg",
    version = "2.1.1",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val iconsDir = File(repoCloneDir, "icons/svg")

        val relocatedNames = mutableMapOf<String, String>()

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
            relocatedNames = relocatedNames
        )
    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "CssGgIcons",
    ),
    licensePathAtRepo = { "LICENSE" },
    documentationHeader = "[css.gg](https://css.gg)"
)

