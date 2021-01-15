plugins {
    `kotlin-dsl`
}
repositories {
    jcenter()
    google()
    gradlePluginPortal()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}
dependencies {
    val kotlinVersion = "1.4.21"
    val composeDesktopVersion = "0.3.0-build140"

    implementation(gradleApi())
    implementation(kotlin("stdlib", kotlinVersion))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("com.android.tools.build:gradle:4.0.1")
    implementation("org.jetbrains.compose:org.jetbrains.compose.gradle.plugin:$composeDesktopVersion")
}