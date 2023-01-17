package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.lineaicons.AllIcons
import compose.icons.lineaicons.Arrows
import compose.icons.lineaicons.Basic
import compose.icons.lineaicons.BasicElaboration
import compose.icons.lineaicons.Ecommerce
import compose.icons.lineaicons.Music
import compose.icons.lineaicons.Software
import compose.icons.lineaicons.Weather
import kotlin.collections.List as ____KtList

public object LineaIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val LineaIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Arrows.AllIcons + Basic.AllIcons + BasicElaboration.AllIcons + Ecommerce.AllIcons +
        Music.AllIcons + Software.AllIcons + Weather.AllIcons + listOf()
    return __AllIcons!!
  }
