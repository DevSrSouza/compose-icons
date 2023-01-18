package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.fluentuiicons.AllIcons
import compose.icons.fluentuiicons.Filled
import compose.icons.fluentuiicons.Regular
import kotlin.collections.List as ____KtList

public object FluentUiIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val FluentUiIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Filled.AllIcons + Regular.AllIcons + listOf()
    return __AllIcons!!
  }
