plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://jetbrains.bintray.com/trove4j")
}

dependencies {
    implementation(libs.plugin.android)
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.composeMultiplatform)
    implementation(libs.generator.svgToCompose)
    implementation(libs.generator.jgit)
    implementation(libs.generator.kotlinpoet)
}