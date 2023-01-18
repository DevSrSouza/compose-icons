package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.phosphoricons.AllIcons
import compose.icons.phosphoricons.Bold
import compose.icons.phosphoricons.Duotone
import compose.icons.phosphoricons.Fill
import compose.icons.phosphoricons.Light
import compose.icons.phosphoricons.Regular
import compose.icons.phosphoricons.Thin
import kotlin.collections.List as ____KtList

public object PhosphorIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val PhosphorIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Bold.AllIcons + Duotone.AllIcons + Fill.AllIcons + Light.AllIcons +
        Regular.AllIcons + Thin.AllIcons + listOf()
    return __AllIcons!!
  }
