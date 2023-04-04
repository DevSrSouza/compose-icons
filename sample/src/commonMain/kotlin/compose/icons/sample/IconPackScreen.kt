package compose.icons.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import compose.icons.sample.data.IconPackModel
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.Modifier
import compose.icons.sample.components.NavigationHeader

data class IconPackScreen(
    val iconPack: IconPackModel,
) : Screen {
    override val key: ScreenKey
        get() = iconPack.packName

    @Composable
    override fun Content() {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(64.dp),
        ) {
            items(iconPack.allIcons) { icon ->
                Image(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
    }
}