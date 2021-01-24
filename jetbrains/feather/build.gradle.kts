import org.jetbrains.compose.compose

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose") version Versions.composeDesktopVersion
}

group = "compose.icons.jetbrains"

// https://youtrack.jetbrains.com/issue/KT-43944
android {
    configurations {
        create("androidTestApi")
        create("androidTestDebugApi")
        create("androidTestReleaseApi")
        create("testApi")
        create("testDebugApi")
        create("testReleaseApi")
    }
}

kotlin {
    android {
        publishLibraryVariants("release")
    }
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"

        }
    }
    sourceSets {

        val commonMain by getting {
            kotlin.srcDir("../../feather/src/commonMain/kotlin")
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.ui)
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
