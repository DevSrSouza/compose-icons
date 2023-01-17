package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.fontawesomeicons.AllIcons
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.Solid
import kotlin.collections.List as ____KtList

public object FontAwesomeIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val FontAwesomeIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Brands.AllIcons + Regular.AllIcons + Solid.AllIcons + listOf()
    return __AllIcons!!
  }
