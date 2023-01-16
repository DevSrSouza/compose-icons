import org.jetbrains.compose.compose

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    id("org.jetbrains.compose") version Versions.composeDesktopVersion
}

group = Publish.groupJetbrains

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
        publishAllLibraryVariants()
    }
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"

        }
    }
    sourceSets {

        val commonMain by getting {
            kotlin.srcDir("../../line-awesome/src/commonMain/kotlin")
            resources.srcDir("../../line-awesome/src/commonMain/resources")
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
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
}

val javadocJar = tasks.register("javadocJar", Jar::class.java) {
    archiveClassifier.set("javadoc")
}

afterEvaluate {
    setupSigning()

    applyPomToAllMavenPublications(javadocJar)
}