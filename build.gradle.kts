plugins {
    `maven-publish`
}

allprojects {
    plugins.apply("maven-publish")

    group = "compose.icons"
    version = "0.1.0-SNAPSHOT"

    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
        google()
    }
}
