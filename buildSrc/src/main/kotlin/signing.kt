import org.gradle.api.Project
import org.gradle.plugins.signing.SigningExtension

private val Project.publishingExtension get() =
    (this as org.gradle.api.plugins.ExtensionAware).extensions.getByName("publishing") as org.gradle.api.publish.PublishingExtension


fun Project.setupSigning() {
//    (this as org.gradle.api.plugins.ExtensionAware)
//        .extensions
//        .configure<SigningExtension>("signing") {
//            useInMemoryPgpKeys(
//                SigningEnv.secretKey,
//                SigningEnv.password
//            )
//
//            sign(publishingExtension.publications)
//        }
}