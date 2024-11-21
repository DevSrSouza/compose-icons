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
    namespace = "compose.icons.erikflowersweathericons"
}

registerGeneratorTask(
    githubId = "erikflowers/weather-icons",
    version = "2.0.12",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val iconsDir = File(repoCloneDir, "svg")

        val relocatedNames = mutableMapOf<String, String>()

        // renaming to match to svg-to-compose
        iconsDir.walkTopDown().filter { it.extension == "svg" }
            .forEach {
                val newFile = File(it.parentFile, it.name.removePrefix("wi-").replace("-", "_"))

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
        accessorName = "WeatherIcons",
    ),
    licensePathAtRepo = { null },
    documentationHeader = "[Erik Flowers' Weather Icons](https://github.com/erikflowers/weather-icons)",
    licenseUrl = { _, _ -> "http://scripts.sil.org/OFL" }
)