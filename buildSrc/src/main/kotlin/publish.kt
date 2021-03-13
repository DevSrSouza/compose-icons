import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar

object Publish {
    val groupId = "br.com.devsrsouza.compose.icons"
    val version = "0.1.1"

    val groupAndroid = "$groupId.android"
    val groupJetbrains = "$groupId.jetbrains"
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
