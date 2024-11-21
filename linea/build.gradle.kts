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
    namespace = "compose.icons.linea"
}

registerGeneratorTask(
    githubId = "linea-io/Linea-Iconset",
    version = "1.0",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val relocatedNames = mutableMapOf<String, String>()

        val repoIconsDirs = repoCloneDir.listFiles().filter(File::isDirectory)
            .filter { it.name.startsWith("_") }

        val iconsDir = File(repoCloneDir, "tmp-icons").apply { mkdir() }

        // renaming to match to svg-to-compose
        for(f in repoIconsDirs) {
            val svgsDir = File(f, "_SVG")
            val groupName = f.name.removePrefix("_")

            val relocateFolder = File(iconsDir, groupName).apply { mkdirs() }

            svgsDir.listFiles().filter { it.extension == "svg" }
                .forEach {
                    val iconName = it.nameWithoutExtension.removePrefix(groupName).replace(" ", "_").replace("-","_").trim() + "." + it.extension
                    val relocateIcon = File(relocateFolder, iconName)

                    it.copyTo(relocateIcon)

                    relocatedNames.putRelocatedRelativeTo(repoCloneDir, relocateIcon, it)
                }
        }

        iconsDir.listFiles().filter { it.extension == "svg" }
            .forEach{
                val newFile = File(it.parentFile, it.name.removePrefix("wi-").replace("-", "_"))
                it.renameTo(newFile)
            }

        MapIconsToSvgComposeFolderResult(
            iconsFolder = iconsDir,
            relocatedNames = relocatedNames,
        )

    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "LineaIcons",
    ),
    licensePathAtRepo = { "LICENSE" },
    documentationHeader = "[Linea](https://github.com/linea-io/Linea-Iconset)"
)
