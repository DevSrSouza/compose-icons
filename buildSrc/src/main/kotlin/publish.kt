import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import java.util.*

object Publish {
    val groupId = "com.wakaztahir.compose-icons"
    val version = "1.0.0"
}

fun MavenPublication.setupPom(project: Project) {
    pom {
        name.set(project.name)
        description.set(project.description)
        url.set("https://github.com/devsrsouza/compose-icons")
        developers {
            developer {
                id.set("DevSrSouza")
                name.set("Gabriel Souza")
                email.set("devsrsouza@gmail.com")
            }
        }
        licenses {
            license {
                name.set("MIT")
                url.set("https://github.com/devsrsouza/compose-icons/blob/master/LICENSE")
            }
        }
        issueManagement {
            system.set("Github")
            url.set("https://github.com/devsrsouza/compose-icons/issues")
        }
        scm {
            connection.set("scm:git:https://github.com/devsrsouza/compose-icons.git")
            developerConnection.set("scm:git:git@github.com:devsrsouza/compose-icons.git")
            url.set("https://github.com/devsrsouza/compose-icons")
        }
    }
}

fun Project.applyPomToAllMavenPublications(javadocJar: TaskProvider<Jar>) {
    setupGithubPublication()
    (this as org.gradle.api.plugins.ExtensionAware)
        .extensions
        .configure<PublishingExtension>("publishing") {
            publications {
                filterIsInstance<MavenPublication>().forEach { publication ->
                    publication.artifact(javadocJar)
                    publication.setupPom(project)
                }
            }
        }
}

fun Project.setupGithubPublication() {
    val propertiesFile = project.rootProject.file("github.properties")
    val isGithubPropAvailable = propertiesFile.exists()

    if (isGithubPropAvailable) {

        val githubProperties = Properties().apply {
            propertiesFile.reader().use { load(it) }
        }

        (this as org.gradle.api.plugins.ExtensionAware)
            .extensions
            .configure<PublishingExtension>("publishing") {
                repositories {
                    maven {
                        name = "GithubPackages"
                        url = uri("https://maven.pkg.github.com/wakaztahir/compose-icons")
                        try {
                            credentials {
                                username = (githubProperties["gpr.usr"] ?: System.getenv("GPR_USER")).toString()
                                password = (githubProperties["gpr.key"] ?: System.getenv("GPR_API_KEY")).toString()
                            }
                        } catch (ex: Exception) {
                            ex.printStackTrace()
                        }
                    }
                }
            }
    }
}