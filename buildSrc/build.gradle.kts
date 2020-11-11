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
    implementation(gradleApi())
    implementation(kotlin("stdlib", "1.4.0"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
    implementation("com.android.tools.build:gradle:4.0.1")
    implementation("org.jetbrains.compose:org.jetbrains.compose.gradle.plugin:0.1.0-m1-build62")
}