package com.icons.common

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection

actual fun copyText(string: String) {
    val selection = StringSelection(string)
    val clipboard: Clipboard = Toolkit.getDefaultToolkit().systemClipboard
    clipboard.setContents(selection, selection)
}

@Composable
actual fun HorizontalScrollbar(modifier: Modifier, state: ScrollState) {
    androidx.compose.foundation.HorizontalScrollbar(
        modifier = modifier,
        adapter = rememberScrollbarAdapter(state)
    )
}

@Composable
actual fun GiveWindow(onDismissRequest: () -> Unit, content: @Composable () -> Unit) {
    Window(onCloseRequest = onDismissRequest){
        content()
    }
}