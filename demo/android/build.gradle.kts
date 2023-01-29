plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group = "com.icons"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    google()
    mavenCentral()
}

dependencies {
    implementation(project(":demo:common"))
    implementation("androidx.activity:activity-compose:1.6.1")
    api(compose.runtime)
    api(compose.foundation)
    api(compose.ui)
}

android {
    compileSdk = 33
    defaultConfig {
        applicationId = "com.icons.android"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
        }
    }
}