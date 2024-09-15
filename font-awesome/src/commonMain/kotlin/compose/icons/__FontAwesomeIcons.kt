package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.fontawesomeicons.AllIcons
import compose.icons.fontawesomeicons.AllIconsNamed
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.Regular
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.groupName
import kotlin.String
import kotlin.collections.List as ____KtList
import kotlin.collections.Map as ____KtMap

public object FontAwesomeIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val FontAwesomeIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Brands.AllIcons + Solid.AllIcons + Regular.AllIcons + listOf()
    return __AllIcons!!
  }

private var __AllIconsNamed: ____KtMap<String, ImageVector>? = null

public val FontAwesomeIcons.AllIconsNamed: ____KtMap<String, ImageVector>
  get() {
    if (__AllIconsNamed != null) {
      return __AllIconsNamed!!
    }
    __AllIconsNamed= Brands.AllIconsNamed.mapKeys { "${Brands.groupName}.${it.key}"} +
        Solid.AllIconsNamed.mapKeys { "${Solid.groupName}.${it.key}"} +
        Regular.AllIconsNamed.mapKeys { "${Regular.groupName}.${it.key}"} + mapOf()
    return __AllIconsNamed!!
  }
