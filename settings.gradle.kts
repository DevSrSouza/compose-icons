enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev" )
    }
}

rootProject.name = "compose-icons"

include(
    ":simple-icons",
    ":feather",
    ":tabler-icons",
    ":eva-icons",
    ":font-awesome",
    ":erikflowers-weather-icons",
    ":line-awesome",
    ":linea",
    ":octicons",
    ":css-gg"
)

include(":sample")
