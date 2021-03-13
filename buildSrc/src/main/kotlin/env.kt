fun env(key: String) = System.getenv(key)

object SigningEnv {
    val password get() = env("SIGNING_PASSWORD")
    val secretKey get() = env("SIGNING_SECRET_KEY")
}

object MavenCentralEnv {
    val ossrhUsername get() = env("OSSRH_USERNAME")
    val ossrhPassword get() = env("OSSRH_PASSWORD")
}