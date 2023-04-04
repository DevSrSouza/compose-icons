package compose.icons.sample

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import compose.icons.sample.HomeScreen
import compose.icons.sample.components.NavigationHeader

@Composable
public fun SampleApplication() {
    Navigator(
        screen = HomeScreen,
    ) {
        Column {
            NavigationHeader()
            CurrentScreen()
        }
    }
}
