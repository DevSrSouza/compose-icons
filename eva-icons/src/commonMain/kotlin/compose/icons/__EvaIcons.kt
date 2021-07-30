package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.evaicons.AllIcons
import compose.icons.evaicons.Fill
import compose.icons.evaicons.Outline
import kotlin.collections.List as ____KtList

public object EvaIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val EvaIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= Outline.AllIcons + Fill.AllIcons + listOf()
    return __AllIcons!!
  }
