import org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb
import org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg
import org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi
import org.jetbrains.compose.desktop.application.tasks.AbstractNativeMacApplicationPackageTask
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
}

setupModuleForComposeMultiplatform(
    withKotlinExplicitMode = false,
    // this is required for the Compose iOS Application DSL expect a `uikit` target name.
    iosPrefixName = "uikit",
    wasm = false,
)

android {
    namespace = "br.devsrsouza.compose.icons.sample"
}

kotlin {
    val macOsConfiguation: KotlinNativeTarget.() -> Unit = {
        binaries {
            executable {
                entryPoint = "main"
                freeCompilerArgs += listOf(
                    "-linker-option", "-framework", "-linker-option", "Metal"
                )
            }
        }
    }
    macosX64(macOsConfiguation)
    macosArm64(macOsConfiguation)
    iosX64("uikitX64")
    iosArm64("uikitArm64")
    iosSimulatorArm64("uikitSimulatorArm64")

    wasmJs {
        moduleName = "composeApp"
        browser {
            commonWebpackConfig {
                outputFileName = "composeApp.js"
            }
        }
        binaries.executable()
    }

    js(IR) {
        browser()
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(projects.cssGg)
                implementation(projects.erikflowersWeatherIcons)
                implementation(projects.evaIcons)
                implementation(projects.feather)
                implementation(projects.fontAwesome)
                implementation(projects.lineAwesome)
                implementation(projects.linea)
                implementation(projects.octicons)
                implementation(projects.simpleIcons)
                implementation(projects.tablerIcons)
//                implementation("br.com.devsrsouza.compose.icons:simple-icons:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:feather:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:tabler-icons:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:eva-icons:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:font-awesome:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:octicons:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:linea:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:line-awesome:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:erikflowers-weather-icons:1.1.0")
//                implementation("br.com.devsrsouza.compose.icons:css-gg:1.1.0")

                implementation(compose.material)
                implementation(compose.runtime)

                implementation(libs.voyager.navigator)
                implementation(libs.voyager.transitions)
                implementation(libs.coroutines)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.appCompat)
                implementation(libs.compose.activity)
            }
        }

        val desktopMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
            }
        }
    }
}

android {
    defaultConfig {
        applicationId = "br.devsrsouza.compose.icons.sample"
    }
}

compose.desktop {
    application {
        mainClass = "compose.icons.sample.AppKt"
        nativeDistributions {
            targetFormats(Dmg, Msi, Deb)
            packageName = "jvm"
            packageVersion = "1.0.0"
        }
    }
}

compose.desktop.nativeApplication {
    targets(kotlin.targets.getByName("macosX64"))
    distributions {
        targetFormats(Dmg)
        packageName = "MultiplatformSample"
        packageVersion = "1.0.0"
    }
}

afterEvaluate {
    val baseTask = "createDistributableNative"
    listOf("debug", "release").forEach {
        val createAppTaskName = baseTask + it.capitalize() + "macosX64".capitalize()

        val createAppTask = tasks.findByName(createAppTaskName) as? AbstractNativeMacApplicationPackageTask?
            ?: return@forEach

        val destinationDir = createAppTask.destinationDir.get().asFile
        val packageName = createAppTask.packageName.get()

        tasks.create("runNative" + it.capitalize()) {
            group = createAppTask.group
            dependsOn(createAppTaskName)
            doLast {
                ProcessBuilder("open", destinationDir.absolutePath + "/" + packageName + ".app").start().waitFor()
            }
        }
    }
}

compose.experimental {
    web.application {}
}
