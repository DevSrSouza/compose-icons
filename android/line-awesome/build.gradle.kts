plugins {
    id("com.android.library")
    id("kotlin-android")
}

group = Publish.groupAndroid

dependencies {
    api("androidx.compose.runtime:runtime:${Versions.composeAndroidVersion}")
    api("androidx.compose.foundation:foundation:${Versions.composeAndroidVersion}")
    api("androidx.compose.ui:ui:${Versions.composeAndroidVersion}")
}

android {
    sourceSets["main"].java.srcDir("../../line-awesome/src/commonMain/kotlin")

    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeAndroidVersion
        kotlinCompilerVersion = "1.4.21"
    }

    lintOptions {
        tasks.lint.get().isEnabled = false
    }
}

val sourcesJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets["main"].java.srcDirs)
}

val javadocJar = tasks.register("javadocJar", Jar::class.java) {
    archiveClassifier.set("javadoc")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["release"])
                artifact(sourcesJar)
                artifact(javadocJar)
                setupPom(project)
            }
        }
    }

    setupSigning()
}