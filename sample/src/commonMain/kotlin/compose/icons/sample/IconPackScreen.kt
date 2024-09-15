package compose.icons.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import compose.icons.sample.data.IconPackModel
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import compose.icons.FeatherIcons
import compose.icons.feathericons.Image
import compose.icons.sample.components.NavigationHeader

data class IconPackScreen(
    val iconPack: IconPackModel,
) : Screen {
    override val key: ScreenKey
        get() = iconPack.packName

    @Composable
    override fun Content() {
        Column {
            var searchState by remember {
                mutableStateOf("")
            }

            TextField(
                value = searchState,
                onValueChange = { searchState = it },
                placeholder = { Text("Search Icon") },
                modifier = Modifier.padding(8.dp).fillMaxWidth()
            )

            val icons = remember(searchState) {
                iconPack.allIcons.filter {
                    it.key.contains(searchState.lowercase())
                }.toList()
            }

            LazyVerticalGrid(
                columns = GridCells.Adaptive(64.dp),
            ) {
                items(icons) { (iconName, icon) ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(4.dp)
                    ) {
                        Image(
                            imageVector = icon,
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            colorFilter = ColorFilter.tint(Color.Black)
                        )

                        Text(
                            text = iconName,
                            modifier = Modifier.padding(top = 4.dp),
                            textAlign = TextAlign.Center,
                        )
                    }
                }
            }
        }

    }
}