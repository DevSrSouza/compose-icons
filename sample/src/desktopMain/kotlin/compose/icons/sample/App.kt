package compose.icons.sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import compose.icons.sample.SampleApplication

public fun main() {
    application {
        Window(onCloseRequest = ::exitApplication) {
            SampleApplication()
        }
    }
}
