import generator.generateCssGg

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("com.vanniktech.maven.publish")
}

setupModuleForComposeMultiplatform()

android {
    namespace = "compose.icons.cssgg"
}

tasks.register("generateIcons") {
    doFirst {
        generateCssGg()
    }
}
