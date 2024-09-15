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
    namespace = "compose.icons.lineawesome"
}

registerGeneratorTask(
    githubId = "icons8/line-awesome",
    version = "a60f11367584e7df157277b5ab9d1654ec91ae24",
    gitCheckoutName = "a60f11367584e7df157277b5ab9d1654ec91ae24",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val relocatedNames = mutableMapOf<String, String>()

        val iconsDir = File(repoCloneDir, "svg")

        // renaming to match to svg-to-compose
        iconsDir.listFiles().filter { it.extension == "svg" }
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
        accessorName = "LineAwesomeIcons",
    ),
    licensePathAtRepo = { "LICENSE.md" },
    documentationHeader = "[Line Awesome](https://icons8.com/line-awesome)"
)
