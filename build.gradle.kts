buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        val kotlinVersion = property("kotlin.version")
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
    }
}

plugins {
    `maven-publish`
    signing
    kotlin("jvm").apply(false)
    kotlin("multiplatform").apply(false)
    kotlin("android").apply(false)
}

allprojects {
    plugins.apply("maven-publish")
    plugins.apply("signing")

    //group = Publish.groupId
    version = Publish.version
    description = "Compose icons is a set of open source icons packs for Jetpack Compose"

    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
        google()
        githubPackagesRepository(this@allprojects)
        maven {
            url = uri("https://jitpack.io") // maven repo where the current library resides
        }
    }

    publishing {
        repositories {
            maven {
                name = "MavenCentral"
                setUrl("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
                credentials {
                    username = MavenCentralEnv.ossrhUsername
                    password = MavenCentralEnv.ossrhPassword
                }
            }
        }
    }
}

tasks.register("publish-icons-github"){
    dependsOn(
        ":simple-icons:publishAllPublicationsToGithubPackagesRepository",
        ":feather:publishAllPublicationsToGithubPackagesRepository",
        ":tabler-icons:publishAllPublicationsToGithubPackagesRepository",
        ":eva-icons:publishAllPublicationsToGithubPackagesRepository",
        ":font-awesome:publishAllPublicationsToGithubPackagesRepository",
        ":erikflowers-weather-icons:publishAllPublicationsToGithubPackagesRepository",
        ":line-awesome:publishAllPublicationsToGithubPackagesRepository",
        ":linea:publishAllPublicationsToGithubPackagesRepository",
        ":octicons:publishAllPublicationsToGithubPackagesRepository",
        ":css-gg:publishAllPublicationsToGithubPackagesRepository",
        ":materialdesignicons:publishAllPublicationsToGithubPackagesRepository",
        ":phosphor-icons:publishAllPublicationsToGithubPackagesRepository",
        ":remix-icons:publishAllPublicationsToGithubPackagesRepository",
        ":ion-icons:publishAllPublicationsToGithubPackagesRepository",
        ":fluentui-system-icons:publishAllPublicationsToGithubPackagesRepository"
    )
}

repositories {
    mavenCentral()
}