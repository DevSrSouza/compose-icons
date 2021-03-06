buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0-alpha09")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}")
    }
}

plugins {
    `maven-publish`
    signing
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
