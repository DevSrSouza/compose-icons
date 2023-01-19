plugins {
    id("java")
}

group = "compose.icons.converter-help"
version = "1.0.0"

repositories {
    mavenCentral()
    maven {
        url = uri("https://jitpack.io") // maven repo where the current library resides
    }
//    maven {
//        url = uri("https://dl.bintray.com/unverbraucht/java9-fixed-jars") // repo for fetching `xmlpull` dependency that's java 9 enabled
//    }
}

dependencies {
    implementation("com.github.kobjects:kxml2:v2.4.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}