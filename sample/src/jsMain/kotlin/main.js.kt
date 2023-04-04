import androidx.compose.ui.window.Window
import compose.icons.sample.SampleApplication
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("Compose Icons") {
            SampleApplication()
        }
    }
}
