package compose.icons.sample.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import compose.icons.FeatherIcons
import compose.icons.feathericons.ArrowLeft

@Composable
fun NavigationHeader() {
    val navigator = LocalNavigator.currentOrThrow

    val isNavigableBackwards = remember(navigator.items) {
        navigator.items.size > 1
    }

    if(isNavigableBackwards) {
        IconButton(
            modifier = Modifier,
            onClick = {
                navigator.pop()
            }
        ) {
            Image(
                imageVector = FeatherIcons.ArrowLeft,
                contentDescription = null,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}