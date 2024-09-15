package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.evaicons.AllIcons
import compose.icons.evaicons.AllIconsNamed
import compose.icons.evaicons.Fill
import compose.icons.evaicons.Outline
import compose.icons.evaicons.groupName
import kotlin.String
import kotlin.collections.List as ____KtList
import kotlin.collections.Map as ____KtMap

public object EvaIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val EvaIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Fill.AllIcons + Outline.AllIcons + listOf()
    return __AllIcons!!
  }

private var __AllIconsNamed: ____KtMap<String, ImageVector>? = null

public val EvaIcons.AllIconsNamed: ____KtMap<String, ImageVector>
  get() {
    if (__AllIconsNamed != null) {
      return __AllIconsNamed!!
    }
    __AllIconsNamed= Fill.AllIconsNamed.mapKeys { "${Fill.groupName}.${it.key}"} +
        Outline.AllIconsNamed.mapKeys { "${Outline.groupName}.${it.key}"} + mapOf()
    return __AllIconsNamed!!
  }
