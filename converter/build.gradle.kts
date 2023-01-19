plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose").version(Versions.composeVersion)
    id("com.android.library")
}

group = Publish.groupId

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
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.ui)

                implementation("com.squareup:kotlinpoet:1.12.0")
            }
        }
        val androidMain by getting
        val desktopMain by getting {
            dependencies {
                implementation(project(":converter-help"))
                implementation("com.github.kobjects:kxml2:v2.4.1")
            }
        }
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