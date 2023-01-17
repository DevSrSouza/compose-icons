package com.icons.common

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import compose.icons.*
import compose.icons.materialdesignicons.ContentCopy

val DependencyGroupUrl = "br.com.devsrsouza.compose.icons.android"
val ModuleVersion = "1.0.0"

enum class IconPacks(val getAllIcons: () -> List<ImageVector>,val accessorName : String,val moduleName : String) {
    SimpleIcons({ compose.icons.SimpleIcons.AllIcons },"SimpleIcons","simple-icons"),
    Feather({ compose.icons.FeatherIcons.AllIcons },"FeatherIcons","feather"),
    TablerIcons({ compose.icons.TablerIcons.AllIcons },"TablerIcons","tabler-icons"),
    EvaIcons({ compose.icons.EvaIcons.AllIcons },"EvaIcons","eva-icons"),
    FontAwesome({ compose.icons.FontAwesomeIcons.AllIcons },"FontAwesomeIcons","font-awesome"),
    ErikFlowersWeatherIcons({ compose.icons.WeatherIcons.AllIcons },"WeatherIcons","erikflowers-weather-icons"),
    LineAwesome({ compose.icons.LineAwesomeIcons.AllIcons },"LineAwesomeIcons","line-awesome"),
    Linea({ compose.icons.LineaIcons.AllIcons },"LineaIcons","linea"),
    OctIcons({ compose.icons.Octicons.AllIcons },"Octicons","octicons"),
    CssGG({ compose.icons.CssGgIcons.AllIcons },"CssGgIcons","css-gg"),
    MaterialDesignIcons({ compose.icons.MaterialDesignIcons.AllIcons },"MaterialDesignIcons","materialdesignicons"),
}

@Composable
fun App() {

    val AllIconPacks = remember { IconPacks.values() }

    var displayPack by remember { mutableStateOf<IconPacks?>(null) }
    var displayIcon by remember { mutableStateOf<Pair<IconPacks, ImageVector>?>(null) }
    var searchText by remember { mutableStateOf("") }

    Box {
        Column(modifier = Modifier.padding(16.dp)) {
            SearchField(
                modifier = Modifier.fillMaxWidth(),
                search = searchText,
                onSearch = { searchText = it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            DisplayPackSelection(
                all = AllIconPacks,
                current = displayPack,
                onUpdate = { displayPack = it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyVerticalGrid(
                modifier = Modifier.fillMaxSize(),
                columns = GridCells.Adaptive(72.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                fun displayIconPack(pack: IconPacks) {
                    searchText.trim().let { stext ->
                        if (stext.isNotEmpty()) {
                            for (icon in pack.getAllIcons()) {
                                if (icon.name.indexOf(stext, ignoreCase = true) > -1) {
                                    item {
                                        DisplayIcon(
                                            modifier = Modifier.fillMaxSize(),
                                            icon = icon,
                                            onClick = { displayIcon = Pair(pack, icon) }
                                        )
                                    }
                                }
                            }
                        } else {
                            items(pack.getAllIcons()) { icon ->
                                DisplayIcon(
                                    modifier = Modifier.fillMaxSize(),
                                    icon = icon,
                                    onClick = { displayIcon = Pair(pack, icon) }
                                )
                            }
                        }
                    }
                }

                if (displayPack == null) {
                    for (pack in AllIconPacks) displayIconPack(pack)
                } else {
                    displayIconPack(displayPack!!)
                }
            }
        }

        displayIcon?.let { dIcon ->
            val pack = dIcon.first
            val icon = dIcon.second
            Popup(alignment = Alignment.Center, onDismissRequest = { displayIcon = null }) {
                Box(
                    modifier = Modifier.align(Alignment.Center).clip(MaterialTheme.shapes.medium).padding(16.dp)
                        .widthIn(min = 240.dp, max = 620.dp)
                        .heightIn(min = 160.dp, max = 440.dp)
                        .shadow(elevation = 16.dp)
                        .background(color = MaterialTheme.colors.surface, MaterialTheme.shapes.medium)
                        .padding(16.dp)
                ) {
                    IconButton(modifier = Modifier.align(Alignment.TopEnd), onClick = { displayIcon = null }) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = null)
                    }
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(modifier = Modifier.size(120.dp), imageVector = icon, contentDescription = null)
                        val codeText = pack.accessorName + "." + icon.name
                        TextActionBlock(
                            typeText = "Code",
                            text = codeText,
                            actionIcon = MaterialDesignIcons.ContentCopy,
                            action = { copyText(codeText) }
                        )
                        val dependencyText = DependencyGroupUrl + ":" + pack.moduleName + ":" + ModuleVersion
                        TextActionBlock(
                            typeText = "Dependency",
                            text = dependencyText,
                            actionIcon = MaterialDesignIcons.ContentCopy,
                            action = { copyText(dependencyText) }
                        )
                    }
                }
            }
        }
    }

}

expect fun copyText(string : String)

@Composable
fun TextActionBlock(
    modifier : Modifier = Modifier,
    typeText : String,
    text : String,
    actionIcon : ImageVector,
    action : ()->Unit
){
    Row(
        modifier = modifier.background(
            color = MaterialTheme.colors.onBackground.copy(.3f),
            shape = MaterialTheme.shapes.medium
        ).padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = typeText, color = MaterialTheme.colors.onBackground.copy(.6f))
        Spacer(modifier = Modifier.width(24.dp))
        SelectionContainer {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colors.primary
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = action) {
            Icon(imageVector = actionIcon, contentDescription = null)
        }
    }
}

@Composable
fun SearchField(
    modifier: Modifier,
    search: String,
    onSearch: (String) -> Unit,
) {
    Row(modifier = modifier) {
        OutlinedTextField(
            modifier = Modifier.weight(1f),
            value = search,
            onValueChange = onSearch,
            placeholder = {
                Text(text = "Icon name without spaces")
            },
            label = {
                Text(text = "Search")
            }
        )
        if (search.isNotEmpty()) {
            IconButton(onClick = { onSearch("") }) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = null
                )
            }
        }
    }
}

@Composable
fun DisplayIcon(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    val shape = MaterialTheme.shapes.medium
    Column(
        modifier = modifier.clip(shape).clickable(onClick = onClick)
            .border(color = MaterialTheme.colors.onBackground.copy(.3f), width = 2.dp).padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(48.dp),
            imageVector = icon,
            contentDescription = null
        )
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = icon.name,
//            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
//            softWrap = false,
        )
    }
}

@Composable
fun DisplayPackSelection(
    all: Array<IconPacks>,
    current: IconPacks?,
    onUpdate: (IconPacks?) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SelectablePack(
            text = "All",
            isSelected = current == null,
            onClick = { onUpdate(null) }
        )
        for (pack in all) {
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
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    val shape = MaterialTheme.shapes.medium
    Box(
        modifier = modifier.clip(shape).clickable(onClick = onClick).background(
            color = if (isSelected) MaterialTheme.colors.primary else Color.Transparent,
            shape = shape
        ).border(color = MaterialTheme.colors.primary, width = 2.dp, shape = shape).padding(12.dp)
    ) {
        Text(modifier = Modifier.align(Alignment.Center), text = text)
    }
}