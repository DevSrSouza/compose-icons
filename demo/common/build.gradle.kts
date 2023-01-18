import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose").version(Versions.composeVersion)
    id("com.android.library")
}

group = "com.icons"
version = "1.0-SNAPSHOT"

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)

                implementation(project(":simple-icons"))
                implementation(project(":feather"))
                implementation(project(":tabler-icons"))
                implementation(project(":eva-icons"))
                implementation(project(":font-awesome"))
                implementation(project(":erikflowers-weather-icons"))
                implementation(project(":line-awesome"))
                implementation(project(":linea"))
                implementation(project(":octicons"))
                implementation(project(":css-gg"))
                implementation(project(":materialdesignicons"))
                implementation(project(":phosphor-icons"))
                implementation(project(":remix-icons"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                api("androidx.appcompat:appcompat:1.5.1")
                api("androidx.core:core-ktx:1.9.0")
            }
        }
        val androidTest by getting {
            dependencies {
                implementation("junit:junit:4.13.2")
            }
        }
        val desktopMain by getting {
            dependencies {
                api(compose.preview)
            }
        }
        val desktopTest by getting
    }
}

android {
    compileSdk = 33
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}