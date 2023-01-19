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
                implementation(project(":ion-icons"))
                implementation(project(":fluentui-system-icons"))

//                implementation("com.wakaztahir.compose-icons.jetbrains:simple-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:feather:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:tabler-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:eva-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:font-awesome:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:erikflowers-weather-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:line-awesome:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:linea:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:octicons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:css-gg:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:materialdesignicons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:phosphor-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:remix-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:ion-icons:1.0.0")
//                implementation("com.wakaztahir.compose-icons.jetbrains:fluentui-system-icons:1.0.0")

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

repositories {
    google()
    githubPackagesRepository(project)
    mavenCentral()
}