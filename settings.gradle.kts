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

//include("simple-icons", "feather", "tabler-icons", "eva-icons")
include(
    "jetbrains:simple-icons",
    "jetbrains:feather",
    "jetbrains:tabler-icons",
    "jetbrains:eva-icons",
    "jetbrains:font-awesome",
    "jetbrains:erikflowers-weather-icons",
    "jetbrains:line-awesome"
)
include(
    "android:simple-icons",
    "android:feather",
    "android:tabler-icons",
    "android:eva-icons",
    "android:font-awesome",
    "android:erikflowers-weather-icons",
    "android:line-awesome"
)
