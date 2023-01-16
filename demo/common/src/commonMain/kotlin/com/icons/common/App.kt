package com.icons.common

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import compose.icons.AllIcons
import compose.icons.FontAwesomeIcons
import compose.icons.SimpleIcons

enum class IconPacks(val getAllIcons: () -> List<ImageVector>) {
    SimpleIcons({ compose.icons.SimpleIcons.AllIcons }),
    Feather({ compose.icons.FeatherIcons.AllIcons }),
    TablerIcons({ compose.icons.TablerIcons.AllIcons }),
    EvaIcons({ compose.icons.EvaIcons.AllIcons }),
    FontAwesome({ compose.icons.FontAwesomeIcons.AllIcons }),
    ErikFlowersWeatherIcons({ compose.icons.WeatherIcons.AllIcons }),
    LineAwesome({ compose.icons.LineAwesomeIcons.AllIcons }),
    Linea({ compose.icons.LineaIcons.AllIcons }),
    OctIcons({ compose.icons.Octicons.AllIcons }),
    CssGG({ compose.icons.CssGgIcons.AllIcons }),
    MaterialDesignIcons({ compose.icons.MaterialDesignIcons.AllIcons }),
}

@Composable
fun App() {

    val AllIconPacks = remember { IconPacks.values() }

    var displayPack by remember { mutableStateOf<IconPacks?>(null) }

    Column(modifier = Modifier.padding(16.dp)) {
        DisplayPackSelection(
            all = AllIconPacks,
            current = displayPack,
            onUpdate = { displayPack = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Adaptive(48.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            fun displayIconPack(pack: IconPacks) {
                val icons = pack.getAllIcons()
                items(icons) { icon ->
                    Icon(
                        modifier = Modifier.fillMaxSize(),
                        imageVector = icon,
                        contentDescription = null
                    )
                }
            }

            if (displayPack == null) {
                for (pack in AllIconPacks) displayIconPack(pack)
            } else {
                displayIconPack(displayPack!!)
            }
        }
    }

}

@Composable
fun DisplayPackSelection(
    all : Array<IconPacks>,
    current : IconPacks?,
    onUpdate : (IconPacks?)->Unit
){
    Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()), horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
        SelectablePack(
            text = "All",
            isSelected = current == null,
            onClick = { onUpdate(null) }
        )
        for(pack in all){
            SelectablePack(
                text = pack.name,
                isSelected = current == pack,
                onClick = { onUpdate(pack) }
            )
        }
    }
}

@Composable
fun SelectablePack(
    modifier : Modifier = Modifier,
    text : String,
    isSelected : Boolean,
    onClick : ()->Unit,
){
    val shape = MaterialTheme.shapes.medium
    Box(modifier = modifier.clip(shape).clickable(onClick = onClick).background(
        color = if(isSelected) MaterialTheme.colors.primary else Color.Transparent,
        shape = shape
    ).border(color = MaterialTheme.colors.primary,width = 2.dp,shape = shape).padding(12.dp)){
        Text(modifier = Modifier.align(Alignment.Center),text = text)
    }
}