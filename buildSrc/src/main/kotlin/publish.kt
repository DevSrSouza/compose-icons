import org.gradle.api.Project
import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.api.artifacts.repositories.PasswordCredentials
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import java.io.File
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

val githubProperties = Properties()

fun PasswordCredentials.githubCredentials(file: File): Boolean {
    if (githubProperties["gpr.usr"] == null || githubProperties["gpr.key"] == null) {
        val propertiesFile = file
        val isGithubPropAvailable = propertiesFile.exists()
        val systemUser = System.getenv("GPR_USER")
        val systemPass = System.getenv("GPR_API_KEY")
        if (!isGithubPropAvailable && (systemUser == null || systemPass == null)) {
            return false
        } else {
            file.reader().let {
                githubProperties.load(it)
                it.close()
            }
            username = (githubProperties["gpr.usr"] ?: systemUser).toString()
            password = (githubProperties["gpr.key"] ?: systemPass).toString()
            return true
        }
    } else {
        username = (githubProperties["gpr.usr"]).toString()
        password = (githubProperties["gpr.key"]).toString()
        return true
    }
}


fun Project.setupGithubPublication() {
    (this as org.gradle.api.plugins.ExtensionAware)
        .extensions
        .configure<PublishingExtension>("publishing") {
            repositories {
                githubPackagesRepository(this@setupGithubPublication)
            }
        }
}

fun RepositoryHandler.githubPackagesRepository(project: Project) {
    if (project.rootProject.file("github.properties").exists()) {
        maven {
            name = "GithubPackages"
            url = project.uri("https://maven.pkg.github.com/wakaztahir/compose-icons")
            try {
                credentials { githubCredentials(project.rootProject.file("github.properties")) }
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }
}