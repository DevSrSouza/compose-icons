import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    `maven-publish`
    id("org.jetbrains.compose") version "0.1.0-m1-build62"
    id("com.android.library")
    id("kotlin-android-extensions")
}

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"

        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)
            }
        }
        val androidMain by getting
        val desktopMain by getting
    }
}

android {
    compileSdkVersion(29)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }
}
