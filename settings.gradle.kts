pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
        maven("https://jitpack.io")
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
    "materialdesignicons"
)