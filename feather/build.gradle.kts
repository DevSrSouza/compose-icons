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
    namespace = "compose.icons.feather"
}

registerGeneratorTask(
    githubId = "feathericons/feather",
    version = "v4.29.2",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val iconsDir = File(repoCloneDir, "icons")

        val relocatedNames = mutableMapOf<String, String>()

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
        accessorName = "FeatherIcons",
    ),
    licensePathAtRepo = { "LICENSE" },
    documentationHeader = "[Feather Icons](https://feathericons.com)"
)
