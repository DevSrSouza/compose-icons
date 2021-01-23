buildscript {
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    dependencies {
        val kotlinVersion = "1.4.21"
        classpath("com.android.tools.build:gradle:7.0.0-alpha04")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${kotlinVersion}")
    }
}

plugins {
    `maven-publish`
}

allprojects {
    plugins.apply("maven-publish")

    //group = "compose.icons"
    version = "0.1.0-SNAPSHOT"

    repositories {
        jcenter()
        mavenCentral()
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
        google()
    }

    publishing {
        repositories {
            maven {
                val bintrayUser = System.getenv("BINTRAY_USER")
                val bintrayKey = System.getenv("BINTRAY_KEY")
                setUrl("https://api.bintray.com/maven/devsrsouza/compose/compose-icons/;publish=1;override=0")

                credentials {
                    println(bintrayUser)
                    username = bintrayUser
                    password = bintrayKey
                }
            }
        }

        publications {
            filterIsInstance<MavenPublication>().forEach { publication ->
                publication.pom {
                    name.set(project.name)
                    description.set(project.description)
                    packaging = "jar"
                    url.set("https://github.com/devsrsouza/compose-icons")
                    developers {
                        developer {
                            id.set("DevSrSouza")
                            name.set("Gabriel Souza")
                        }
                    }
                    licenses {
                        license {
                            name.set("MIT")
                            url.set("https://github.com/devsrsouza/compose-icons/blob/master/LICENSE")
                        }
                    }
                    scm {
                        connection.set("scm:git:https://github.com/devsrsouza/compose-icons.git")
                        developerConnection.set("scm:git:git@github.com:devsrsouza/compose-icons.git")
                        url.set("https://github.com/devsrsouza/compose-icons")
                    }
                }
            }
        }
    }
}
