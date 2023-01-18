pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
        maven("https://jitpack.io")
    }
    plugins {
        kotlin("jvm").version(extra["kotlin.version"] as String).apply(false)
        kotlin("android").version(extra["kotlin.version"] as String).apply(false)
        kotlin("multiplatform").version(extra["kotlin.version"] as String).apply(false)
    }
}


rootProject.name = "compose-icons"

include(
    "simple-icons",
    "feather",
    "tabler-icons",
    "eva-icons",
    "font-awesome",
    "erikflowers-weather-icons",
    "line-awesome",
    "linea",
    "octicons",
    "css-gg",
    "materialdesignicons",
    "phosphor-icons",
    "remix-icons",
    "ion-icons",
    "fluentui-system-icons"
)

include(
    "demo:android",
    "demo:common",
    "demo:desktop"
)
include("script-definition")
include("script-host")
include("script-definition")
