package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Eagle: ImageVector
    get() {
        if (_eagle != null) {
            return _eagle!!
        }
        _eagle = Builder(name = "Eagle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.04f, 3.858f)
                curveToRelative(1.32f, 0.019f, 2.634f, 0.335f, 3.78f, 0.989f)
                curveToRelative(0.549f, 0.31f, 0.957f, 0.642f, 1.238f, 0.895f)
                arcToRelative(6.912f, 6.912f, 0.0f, false, false, -2.25f, 3.04f)
                curveToRelative(-0.06f, 0.165f, -0.123f, 0.354f, -0.183f, 0.546f)
                arcToRelative(6.856f, 6.856f, 0.0f, false, false, -0.252f, 1.605f)
                curveToRelative(-0.003f, 0.162f, 0.002f, 0.374f, 0.003f, 0.578f)
                curveToRelative(0.012f, 0.242f, 0.05f, 0.519f, 0.08f, 0.789f)
                arcToRelative(7.013f, 7.013f, 0.0f, false, false, 1.753f, 3.586f)
                arcToRelative(6.889f, 6.889f, 0.0f, false, false, 1.87f, 1.42f)
                arcToRelative(7.792f, 7.792f, 0.0f, false, true, -2.629f, 2.166f)
                arcToRelative(7.717f, 7.717f, 0.0f, false, true, -3.846f, 0.808f)
                arcToRelative(9.16f, 9.16f, 0.0f, false, true, -0.22f, -0.013f)
                arcToRelative(7.695f, 7.695f, 0.0f, false, true, -1.504f, -0.247f)
                arcToRelative(8.201f, 8.201f, 0.0f, false, true, -2.83f, -1.354f)
                arcToRelative(7.056f, 7.056f, 0.0f, false, true, -1.894f, -2.1f)
                curveToRelative(-0.22f, -0.38f, -1.49f, -2.644f, -0.769f, -5.452f)
                arcTo(7.261f, 7.261f, 0.0f, false, true, 5.93f, 8.18f)
                arcToRelative(5.513f, 5.513f, 0.0f, false, false, -2.105f, 1.082f)
                curveTo(4.12f, 8.573f, 5.306f, 6.0f, 8.217f, 4.66f)
                arcToRelative(8.944f, 8.944f, 0.0f, false, true, 3.823f, -0.8f)
                close()
                moveTo(17.742f, 6.366f)
                curveToRelative(0.202f, 0.126f, 0.464f, 0.309f, 0.736f, 0.572f)
                curveToRelative(0.108f, 0.103f, 0.478f, 0.468f, 0.82f, 1.054f)
                curveToRelative(0.413f, 0.703f, 0.549f, 1.327f, 0.62f, 1.65f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, true, 0.013f, 2.302f)
                arcToRelative(7.133f, 7.133f, 0.0f, false, false, -2.044f, -1.688f)
                arcToRelative(7.243f, 7.243f, 0.0f, false, false, -1.551f, 0.3f)
                arcToRelative(6.834f, 6.834f, 0.0f, false, false, -1.05f, 0.422f)
                arcToRelative(6.058f, 6.058f, 0.0f, false, true, 0.267f, -1.563f)
                arcToRelative(5.923f, 5.923f, 0.0f, false, true, 0.806f, -1.643f)
                arcToRelative(6.255f, 6.255f, 0.0f, false, true, 1.383f, -1.406f)
                close()
            }
        }
        .build()
        return _eagle!!
    }

private var _eagle: ImageVector? = null
