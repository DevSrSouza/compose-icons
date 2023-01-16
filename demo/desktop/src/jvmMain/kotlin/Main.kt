import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.icons.common.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
