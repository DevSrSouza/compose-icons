@file:Repository("https://jitpack.io")
@file:Repository("https://maven.google.com")
@file:Repository("https://jetbrains.bintray.com/trove4j")

// svg-to-compose
@file:DependsOn("com.github.DevSrSouza:svg-to-compose:v0.1.0")
@file:DependsOn("com.google.guava:guava:23.0")
@file:DependsOn("com.android.tools:sdk-common:27.2.0-alpha16")
@file:DependsOn("com.android.tools:common:27.2.0-alpha16")
@file:DependsOn("com.squareup:kotlinpoet:1.7.2")
@file:DependsOn("org.ogce:xpp3:1.1.6")

// ktor
@file:DependsOn("io.ktor:ktor-client-core:1.4.0")
@file:DependsOn("io.ktor:ktor-client-core-jvm:1.4.0")
@file:DependsOn("io.ktor:ktor-client-apache:1.4.0")
@file:DependsOn("io.ktor:ktor-client-json-jvm:1.4.0")
@file:DependsOn("io.ktor:ktor-client-gson:1.4.0")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.client.features.json.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File

val ktorClient = HttpClient(Apache) {
    install(JsonFeature) {
        serializer = GsonSerializer()
        acceptContentTypes += ContentType.Text.Plain
    }

}

data class Icon(var title: String, var hex: String, var source: String)
data class SimpleIcons(var icons: List<Icon>)

val ignoredIcons = listOf(
    "Elsevier"
)

val icons = runBlocking {
    ktorClient.get<SimpleIcons>("https://raw.githubusercontent.com/simple-icons/simple-icons/develop/_data/simple-icons.json") {
        accept(ContentType.Application.Json)
    }
}.icons

val replaces2 = listOf(
    "+" to "plus",
    "." to "-dot-",
    "&" to "-and-",
    "!" to "",
    ":" to "",
    "’" to "",
    "'" to ""
)

val replaces = listOf(
    "à" to "a",
    "á" to "a",
    "â" to "a",
    "ã" to "a",
    "ä" to "a",
    "ç" to "c",
    "č" to "c",
    "ć" to "c",
    "è" to "e",
    "é" to "e",
    "ê" to "e",
    "ë" to "e",
    "ì" to "i",
    "í" to "i",
    "î" to "i",
    "ï" to "i",
    "ñ" to "n",
    "ň" to "n",
    "ń" to "n",
    "ò" to "o",
    "ó" to "o",
    "ô" to "o",
    "õ" to "o",
    "ö" to "o",
    "š" to "s",
    "ś" to "s",
    "ù" to "u",
    "ú" to "u",
    "û" to "u",
    "ü" to "u",
    "ý" to "y",
    "ÿ" to "y",
    "ž" to "z",
    "ź" to "z"
) + replaces2

val iconsNamesFixed = icons.map { it.title }
    .map { it.toLowerCase() }
    .map { replaces.fold(it) { acc, pair -> acc.replace(pair.first, pair.second, ignoreCase=true)} }
    .map { it.removePrefix("-").removeSuffix("-") }

val iconsFileNames = iconsNamesFixed
    .map {
        val sourceName = it.replace(" ", "_").replace("-", "_")
        val fileName = it.replace(" ", "")
        sourceName to fileName
    }

val svgBaseUrl = "https://raw.githubusercontent.com/simple-icons/simple-icons/master/icons/%s.svg"

val downloadDir = createTempDir(suffix = "downloaded-icons")

runBlocking {
    iconsFileNames
        .filterNot {
            ignoredIcons.any { ignored -> it.first.contains(ignored, ignoreCase = true) }
        }
        .forEach {
            async {
                val result = ktorClient.get<ByteArray>(svgBaseUrl.format(it.second))
                println("Finish download ${it.second}")
                File(downloadDir, "${it.first}.svg").writeBytes(result)
            }
        }
}

val srcDir = File("src/commonMain/kotlin").apply { mkdirs() }

println("Generating all svg to compose")

Svg2Compose.parse(
    applicationIconPackage = "compose.icons",
    accessorName = "simple_icons",
    outputSourceDirectory = srcDir,
    vectorsDirectory = downloadDir,
    type = VectorType.SVG
)

println("Downloading LICENSE from the Icon pack")

val license = runBlocking {
    ktorClient.get<String>("https://raw.githubusercontent.com/simple-icons/simple-icons/master/LICENSE.md")
}

val resDir = File("src/commonMain/resources").apply { mkdirs() }

File(resDir, "simpleicons-license.txt").writeText(license)
