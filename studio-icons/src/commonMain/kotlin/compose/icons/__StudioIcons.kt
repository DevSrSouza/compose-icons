package compose.icons

import androidx.compose.ui.graphics.vector.ImageVector
import compose.icons.studioicons.AllAssets
import compose.icons.studioicons.Baseline
import compose.icons.studioicons.Outline
import compose.icons.studioicons.Round
import compose.icons.studioicons.Sharp
import compose.icons.studioicons.Twotone
import kotlin.collections.List as ____KtList

public object StudioIcons

private var __AllAssets: ____KtList<ImageVector>? = null

public val StudioIcons.AllAssets: ____KtList<ImageVector>
  get() {
    if (__AllAssets != null) {
      return __AllAssets!!
    }
    __AllAssets= Baseline.AllAssets + Outline.AllAssets + Round.AllAssets + Sharp.AllAssets +
        Twotone.AllAssets + listOf()
    return __AllAssets!!
  }
