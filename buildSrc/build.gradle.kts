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
    compileOnly(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
    implementation("com.android.tools.build:gradle:4.0.1")
}