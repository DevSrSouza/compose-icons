import androidx.compose.ui.window.Window
import compose.icons.sample.SampleApplication
import platform.AppKit.NSApp
import platform.AppKit.NSApplication

fun main() {
    NSApplication.sharedApplication()
    Window("Compose Icons") {
        SampleApplication()
    }
    NSApp?.run()
}

