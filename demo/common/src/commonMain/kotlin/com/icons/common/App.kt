package com.icons.common

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.Popup
import compose.icons.*
import compose.icons.converter.IconNameTransformer
import compose.icons.converter.Svg2Compose
import compose.icons.converter.VectorType
import compose.icons.materialdesignicons.ContentCopy
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File

val DependencyGroupUrl = "com.wakaztahir.compose-icons"
val ModuleVersion = "1.0.0"

enum class IconPacks(
    val getAllIcons: () -> List<ImageVector>,
    val accessorName: String,
    val moduleName: String,
    val typeName: String? = null,
    val types: List<String> = listOf()
) {
    SimpleIcons({ compose.icons.SimpleIcons.AllIcons }, "SimpleIcons", "simple-icons"),
    Feather({ compose.icons.FeatherIcons.AllIcons }, "FeatherIcons", "feather"),
    TablerIcons({ compose.icons.TablerIcons.AllIcons }, "TablerIcons", "tabler-icons"),
    EvaIcons({ compose.icons.EvaIcons.AllIcons }, "EvaIcons", "eva-icons", "Type", listOf("Fill", "Outline")),
    FontAwesome(
        { compose.icons.FontAwesomeIcons.AllIcons },
        "FontAwesomeIcons",
        "font-awesome",
        "Type",
        listOf("Brands", "Regular", "Solid")
    ),
    ErikFlowersWeatherIcons({ compose.icons.WeatherIcons.AllIcons }, "WeatherIcons", "erikflowers-weather-icons"),
    LineAwesome({ compose.icons.LineAwesomeIcons.AllIcons }, "LineAwesomeIcons", "line-awesome"),
    Linea(
        { compose.icons.LineaIcons.AllIcons },
        "LineaIcons",
        "linea",
        "Category",
        listOf("Arrows", "Basic", "BasicElaboration", "Ecommerce", "Music", "Software", "Weather")
    ),
    OctIcons({ compose.icons.Octicons.AllIcons }, "Octicons", "octicons"),
    CssGG({ compose.icons.CssGgIcons.AllIcons }, "CssGgIcons", "css-gg"),
    MaterialDesignIcons({ compose.icons.MaterialDesignIcons.AllIcons }, "MaterialDesignIcons", "materialdesignicons"),
    PhosphorIcons(
        { compose.icons.PhosphorIcons.AllIcons },
        "PhosphorIcons",
        "phosphor-icons",
        "Weight",
        listOf("Regular", "Bold", "Duotone", "Fill", "Light", "Thin")
    ),
    RemixIcons({ compose.icons.RemixIcons.AllIcons }, "RemixIcons", "remix-icons"),
    IonIcons({ compose.icons.IonIcons.AllIcons }, "IonIcons", "ion-icons"),
    FluentUiIcons(
        { compose.icons.FluentUiIcons.AllIcons },
        "FluentUiIcons",
        "fluentui-system-icons",
        "Type",
        listOf("Regular", "Filled")
    ),
    StudioIcons(
        { compose.icons.StudioIcons.AllIcons },
        "StudioIcons",
        "studio-icons",
        "Type",
        listOf("Baseline","Outline","Round","Sharp","Twotone")
    )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun App() {

    val scope = rememberCoroutineScope()
    val AllIconPacks = remember { IconPacks.values() }

    var displayPack by remember { mutableStateOf<IconPacks?>(null) }
    var displayIcon by remember { mutableStateOf<Pair<IconPacks, ImageVector>?>(null) }
    var searchText by remember { mutableStateOf("") }
    var vectorType by remember { mutableStateOf<VectorType?>(null) }

    Box {
        Column(modifier = Modifier.padding(16.dp)) {
            Row {
                Button(onClick = { vectorType = VectorType.SVG }){
                    Text(text = "Convert SVG To Compose")
                }
                Spacer(modifier = Modifier.width(12.dp))
                Button(onClick = { vectorType = VectorType.DRAWABLE }){
                    Text(text = "Convert Drawable To Compose")
                }
            }
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

        vectorType?.let { type->
            GiveWindow(onDismissRequest = { vectorType = null }) {
                ComposeConverter(scope = scope,vectorType = type)
            }
        }

        displayIcon?.let { dIcon ->
            val pack = dIcon.first
            val icon = dIcon.second
            BoxedPopup(onDismissRequest = { displayIcon = null }) {
                Column(
                    modifier = Modifier.align(Alignment.Center),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(modifier = Modifier.size(120.dp), imageVector = icon, contentDescription = null)
                    val typeCode = if (pack.typeName != null) ".{${pack.typeName}}." else "."
                    val codeText = pack.accessorName + typeCode + icon.name
                    TextActionBlock(
                        typeText = "Code",
                        text = codeText,
                        actionIcon = MaterialDesignIcons.ContentCopy,
                        action = { copyText(codeText) }
                    )
                    if (pack.typeName != null) {
                        TextActionBlock(
                            typeText = pack.typeName,
                            text = pack.types.joinToString(separator = " | "),
                        )
                    }
                    val dependencyText = DependencyGroupUrl + ":" + pack.moduleName + ":" + ModuleVersion
                    TextActionBlock(
                        typeText = "Dependency",
                        text = dependencyText,
                        actionIcon = MaterialDesignIcons.ContentCopy,
                        action = { copyText(dependencyText) }
                    )
                    Text(
                        text = "Dependency is on Github Packages",
                        color = MaterialTheme.colors.onBackground.copy(.5f)
                    )
                }
            }
        }
    }

}

@Composable
expect fun GiveWindow(onDismissRequest: () -> Unit,content : @Composable ()->Unit)

@Composable
fun BoxScope.BoxedPopup(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    content: @Composable BoxScope.() -> Unit
) {
    Popup(alignment = Alignment.Center, onDismissRequest = onDismissRequest) {
        Box(
            modifier = modifier.align(Alignment.Center).clip(MaterialTheme.shapes.medium).padding(16.dp)
                .widthIn(min = 240.dp)
                .heightIn(min = 160.dp)
                .shadow(elevation = 16.dp)
                .background(color = MaterialTheme.colors.surface, MaterialTheme.shapes.medium)
                .padding(16.dp),
            content = {
                IconButton(modifier = Modifier.align(Alignment.TopEnd), onClick = onDismissRequest) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = null)
                }
                content()
            }
        )
    }
}

expect fun copyText(string: String)


@Composable
expect fun HorizontalScrollbar(modifier: Modifier, state: ScrollState)

@Composable
fun TextActionBlock(
    modifier: Modifier = Modifier,
    typeText: String,
    text: String,
    actionIcon: (ImageVector)? = null,
    action: () -> Unit = {}
) {
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
        if (actionIcon != null) {
            IconButton(onClick = action) {
                Icon(imageVector = actionIcon, contentDescription = null)
            }
        }
    }
}

@Composable
fun SearchField(
    modifier: Modifier,
    search: String,
    onSearch: (String) -> Unit,
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
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
    modifier: Modifier = Modifier,
    all: Array<IconPacks>,
    current: IconPacks?,
    onUpdate: (IconPacks?) -> Unit
) {
    val scrollState = rememberScrollState()
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth().horizontalScroll(scrollState),
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
        HorizontalScrollbar(modifier = Modifier.fillMaxWidth(), state = scrollState)
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

@Composable
fun ComposeConverter(
    modifier: Modifier = Modifier,
    scope: CoroutineScope = rememberCoroutineScope(),
    vectorType: VectorType,
) {
    // application package string = compose.icons
    // accessor name string = MyIcons
    // output directory
    // input directory
    // icon name transformer = {Group}.{IconName}
    // all assets property name = AllAssets

    var packageName by remember { mutableStateOf("compose.icons") }
    var accessorName by remember { mutableStateOf("MyIcons") }
    var transformer by remember { mutableStateOf("{IconName}") }
    var allAssetsPropName by remember { mutableStateOf("AllAssets") }
    var inputDir by remember { mutableStateOf<String>("") }
    var outputDir by remember { mutableStateOf<String>("") }
    var isConverting by remember { mutableStateOf(false) }

    fun convert() {
        if (inputDir.trim().isEmpty() || outputDir.trim().isEmpty()) {
            return
        }
        if (!transformer.contains("{Group}") && !transformer.contains("{IconName}")) {
            return
        }
        val inputFile = File(inputDir)
        val outputFile = File(outputDir)
        val realTransformer: IconNameTransformer = { iconName, group ->
            transformer.replace("{Group}", group).replace("{IconName}", iconName)
        }
        scope.launch(Dispatchers.IO) {
            isConverting = true
            try {
                Svg2Compose.parse(
                    applicationIconPackage = packageName,
                    accessorName = accessorName,
                    outputSourceDirectory = outputFile,
                    vectorsDirectory = inputFile,
                    type = vectorType,
                    iconNameTransformer = realTransformer,
                    allAssetsPropertyName = allAssetsPropName,
                )
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                isConverting = false
            }
        }
    }

    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "App Package Name")
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = packageName,
                onValueChange = { packageName = it },
                enabled = !isConverting,
                label = { Text(text = "Package Name") }
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Accessor Name")
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = accessorName,
                onValueChange = { accessorName = it },
                enabled = !isConverting,
                label = { Text(text = "Accessor Name") }
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Input Directory Path")
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = inputDir,
                onValueChange = { inputDir = it },
                label = { Text(text = "Input Dir Path") },
                enabled = !isConverting,
                placeholder = { Text(text = "This is where your icons are svgs/xml") }
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Output Directory Path")
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = outputDir,
                onValueChange = { outputDir = it },
                label = { Text(text = "Output Dir Path") },
                enabled = !isConverting,
                placeholder = { Text(text = "This is where they will be exported") }
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Icon Name Transformer")
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = transformer,
                onValueChange = { transformer = it },
                enabled = !isConverting,
                label = { Text(text = "Icon Name Transformer you can use {Group} & {IconName}") }
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "All Assets Property Name")
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedTextField(
                value = allAssetsPropName,
                onValueChange = { allAssetsPropName = it },
                enabled = !isConverting,
                label = { Text(text = "All Assets Property Name") }
            )
        }

        Button(onClick = { convert() },enabled = !isConverting) {
            if(isConverting){
                CircularProgressIndicator(color = MaterialTheme.colors.onBackground)
            }else {
                Text(text = "Submit")
            }
        }

    }

}