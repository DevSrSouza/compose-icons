import generator.MapIconsToSvgComposeFolderResult
import generator.SimpleIcons
import generator.SvgToComposeConfig
import generator.putRelocatedRelativeTo
import generator.registerGeneratorTask
import org.jetbrains.kotlin.com.google.gson.Gson
import java.text.Normalizer
import java.util.Locale

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.simpleicons"
}

registerGeneratorTask(
    githubId = "simple-icons/simple-icons",
    version = "13.17.0",
    mapSourceCodeIconsToSvgComposeFolder = { repoCloneDir ->
        val relocatedNames = mutableMapOf<String, String>()

        val iconsJsonFile = File(repoCloneDir, "_data/simple-icons.json")

        val icons = Gson().fromJson(iconsJsonFile.readText(), SimpleIcons::class.java).icons

        fun String.normalize(form: Normalizer.Form): String {
            return Normalizer.normalize(this, form)
        }

        fun iconTitleToSlug(title: String): String {
            return title.lowercase(Locale.getDefault())
                .replace("\\+".toRegex(), "plus")
                .replace("^\\.".toRegex(), "dot-")
                .replace("\\.$".toRegex(), "-dot")
                .replace("\\.".toRegex(), "-dot-")
                .replace("^&".toRegex(), "and-")
                .replace("&$".toRegex(), "-and")
                .replace("&".toRegex(), "-and-")
                .replace("đ".toRegex(), "d")
                .replace("ħ".toRegex(), "h")
                .replace("ı".toRegex(), "i")
                .replace("ĸ".toRegex(), "k")
                .replace("ŀ".toRegex(), "l")
                .replace("ł".toRegex(), "l")
                .replace("ß".toRegex(), "ss")
                .replace("ŧ".toRegex(), "t")
                .normalize(Normalizer.Form.NFD)
                .replace("[\u0300-\u036f]".toRegex(), "")
                .replace("[^a-z0-9\\-]".toRegex(), "")
        }

        val iconsNamesFixed = icons.map { if (it.slug != null) it.slug!! else iconTitleToSlug(it.title) }

        val iconsDir = File(repoCloneDir, "icons")

        val ignoredIcons = listOf("Elsevier")

        iconsNamesFixed
            .associate {
                val sourceName = it.replace(" ", "_").replace("-", "_") + ".svg"
                val fileName = it.replace(" ", "").replace("-", "") + ".svg"

                val icon = File(iconsDir, fileName)
                val renamed = File(iconsDir, sourceName)
                icon.renameTo(renamed)

                relocatedNames.putRelocatedRelativeTo(repoCloneDir, renamed, icon)

                sourceName to fileName
            }
            .onEach {
                if (ignoredIcons.any { ignored -> it.value.contains(ignored, ignoreCase = true) }) {
                    File(iconsDir, it.value).delete()
                    println("Removed ignored icon: ${it.key}")
                }
            }

        MapIconsToSvgComposeFolderResult(
            iconsFolder = iconsDir,
            relocatedNames = relocatedNames,
        )

    },
    svgToComposeConfig = SvgToComposeConfig(
        accessorName = "SimpleIcons",
    ),
    licensePathAtRepo = { "LICENSE.md" },
    documentationHeader = "[Simple Icons](https://simpleicons.org)"
)