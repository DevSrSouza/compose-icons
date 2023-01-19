/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.material.icons.generator

import java.io.File

/**
 * Processes vector drawables in [iconDirectory] into a list of icons, removing any unwanted
 * attributes (such as android: attributes that reference the theme) from the XML source.
 *
 * Drawables in [iconDirectory] should match the following structure, see download_material_icons.py
 * to update icons, using this structure.
 *
 * // Top level
 * [iconDirectory]
 * // Theme name
 * ├── filled
 *     // Icon name
 *     ├── menu.xml
 *     └── zoom_out_map.xml
 * ├── outlined
 * ├── rounded
 * ├── twotone
 * └── sharp
 *
 * @param iconDirectory root directory containing the directory structure mentioned above
 * @param expectedApiFile location of the checked-in API file that contains the current list of
 * all icons processed and generated
 * @param generatedApiFile location of the to-be-generated API file in the build directory,
 * that we will write to and compare with [expectedApiFile]. This way the generated file can be
 * copied to overwrite the expected file, 'confirming' any API changes as a result of changing
 * icons in [iconDirectory].
 */
class IconProcessor(
    private val iconDirectory: File,
    private val expectedApiFile: File,
    private val generatedApiFile: File
) {
    /**
     * @return a list of processed [Icon]s, from the given [iconDirectory].
     */
    fun process(): List<Icon> {
        val icons = loadIcons()

        return icons
    }

    private fun loadIcons(): List<Icon> {
        val themeDirs = iconDirectory.listFiles()!!.filter { it.isDirectory }

        return themeDirs.flatMap { dir ->
            val theme = dir.name.toIconTheme()
            val icons = dir.walk().filter { !it.isDirectory }.toList()

            icons.map { file ->
                val filename = file.nameWithoutExtension
                val kotlinName = filename.toKotlinPropertyName()

                // Prefix the icon name with a theme so we can ensure they will be unique when
                // copied to res/drawable.
                val xmlName = "${theme.themePackageName}_$filename"

                Icon(
                    kotlinName = kotlinName,
                    xmlFileName = xmlName,
                    fileContent = processXmlFile(file.readText())
                )
            }
        }
    }
}

/**
 * Processes the given [fileContent] by removing android theme attributes and values.
 */
private fun processXmlFile(fileContent: String): String {
    // Remove any defined tint for paths that use theme attributes
    val tintAttribute = Regex.escape("""android:tint="?attr/colorControlNormal">""")
    val tintRegex = """\n.*?$tintAttribute""".toRegex(RegexOption.MULTILINE)

    return fileContent
        .replace(tintRegex, ">")
        // The imported icons have white as the default path color, so let's change it to be
        // black as is typical on Android.
        .replace("@android:color/white", "@android:color/black")
}

/**
 * Converts a snake_case name to a KotlinProperty name.
 *
 * If the first character of [this] is a digit, the resulting name will be prefixed with an `_`
 */
internal expect fun String.toKotlinPropertyName(): String
