package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hp: VectorAsset
    get() {
        if (_hp != null) {
            return _hp!!
        }
        _hp = VectorAssetBuilder(name = "Hp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                horizontalLineToRelative(-0.354f)
                lineToRelative(2.46f, -6.745f)
                horizontalLineToRelative(3.372f)
                curveToRelative(0.597f, 0.0f, 1.249f, -0.448f, 1.454f, -1.007f)
                lineToRelative(2.664f, -7.304f)
                curveToRelative(0.429f, -1.192f, -0.242f, -2.18f, -1.528f, -2.18f)
                horizontalLineToRelative(-4.695f)
                lineToRelative(-6.15f, 16.92f)
                curveTo(3.933f, 22.415f, 0.0f, 17.663f, 0.0f, 12.0f)
                curveTo(0.0f, 6.503f, 3.708f, 1.863f, 8.758f, 0.447f)
                lineTo(2.646f, 17.255f)
                lineTo(5.18f, 17.255f)
                lineToRelative(3.242f, -8.926f)
                horizontalLineToRelative(1.92f)
                lineToRelative(-3.243f, 8.926f)
                horizontalLineToRelative(2.535f)
                lineToRelative(3.037f, -8.33f)
                curveToRelative(0.428f, -1.192f, -0.242f, -2.18f, -1.528f, -2.18f)
                lineTo(9.0f, 6.745f)
                lineTo(11.46f, 0.02f)
                curveToRelative(0.186f, 0.0f, 0.354f, -0.019f, 0.54f, -0.019f)
                curveToRelative(6.634f, 0.0f, 12.0f, 5.366f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.366f, 12.0f, -12.0f, 12.0f)
                close()
                moveTo(19.267f, 8.33f)
                horizontalLineToRelative(-1.92f)
                lineToRelative(-2.682f, 7.34f)
                horizontalLineToRelative(1.919f)
                close()
            }
        }
        .build()
        return _hp!!
    }

private var _hp: VectorAsset? = null
