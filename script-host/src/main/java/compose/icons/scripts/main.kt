package compose.icons.scripts

import java.io.File
import java.nio.file.Paths
import kotlin.script.experimental.api.EvaluationResult
import kotlin.script.experimental.api.ResultWithDiagnostics
import kotlin.script.experimental.api.ScriptDiagnostic
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost
import kotlin.script.experimental.jvmhost.createJvmCompilationConfigurationFromTemplate

fun evalFile(scriptFile: File): ResultWithDiagnostics<EvaluationResult> {

    val compilationConfiguration = createJvmCompilationConfigurationFromTemplate<ComposeIconsScript>()

    return BasicJvmScriptingHost().eval(scriptFile.toScriptSource(), compilationConfiguration, null)
}

enum class ScriptsAvailable(val projPath: String, val pathToScript: String = "$projPath/generate-source.main.kts") {
    simple_icons("simple-icons"),
    feather("feather"),
    tabler_icons("tabler-icons"),
    eva_icons("eva-icons"),
    font_awesome("font-awesome"),
    erikflowers_weather_icons("erikflowers-weather-icons"),
    line_awesome("line-awesome"),
    linea("linea"),
    octicons("octicons"),
    css_gg("css-gg"),
    materialdesignicons("materialdesignicons"),
    phosphor_icons("phosphor-icons"),
    remix_icons("remix-icons"),
    ion_icons("ion-icons"),
    fluent_ui_system_icons("fluentui-system-icons")
}

fun main(vararg args: String) {
    println("Running At : " + Paths.get("").toAbsolutePath().toString())
    if (args.size != 1) {
        val available = ScriptsAvailable.values()

        fun executeNumber(number : Int?){
            if (number == null || number < 0 || number >= available.size) {
                println("Script No $number won't be executed , Wrong number\n")
            } else {
                val script = available[number]
                executeScript(script.pathToScript)
            }
        }

        println("Enter which would you like to execute , Scripts available : \n")
        for (i in available.indices) {
            val script = available[i]
            println("$i - ${script.name.replace('_','-')}")
        }
        print("\nExecute Number : ")
        val scriptToExecute = readln()
        if(scriptToExecute.indexOf('.') < 0) {
            val number = scriptToExecute.toIntOrNull()
            executeNumber(number)
        }else {
            val numbers = scriptToExecute.split(".")
            numbers.forEach { executeNumber(it.toIntOrNull()) }
        }
    } else {
        executeScript(args[0])
    }
}

fun executeScript(path: String) {
    val scriptFile = File(path)
    println("Executing script $scriptFile")

    val res = evalFile(scriptFile)

    res.reports.forEach {
        if (it.severity > ScriptDiagnostic.Severity.DEBUG) {
            println(" : ${it.message}" + if (it.exception == null) "" else ": ${it.exception}")
        }
    }
}