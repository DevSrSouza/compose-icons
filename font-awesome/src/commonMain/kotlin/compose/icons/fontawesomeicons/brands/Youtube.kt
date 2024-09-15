package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(549.66f, 124.08f)
                curveToRelative(-6.28f, -23.65f, -24.79f, -42.28f, -48.28f, -48.6f)
                curveTo(458.78f, 64.0f, 288.0f, 64.0f, 288.0f, 64.0f)
                reflectiveCurveTo(117.22f, 64.0f, 74.63f, 75.49f)
                curveToRelative(-23.5f, 6.32f, -42.0f, 24.95f, -48.28f, 48.6f)
                curveToRelative(-11.41f, 42.87f, -11.41f, 132.3f, -11.41f, 132.3f)
                reflectiveCurveToRelative(0.0f, 89.44f, 11.41f, 132.3f)
                curveToRelative(6.28f, 23.65f, 24.79f, 41.5f, 48.28f, 47.82f)
                curveTo(117.22f, 448.0f, 288.0f, 448.0f, 288.0f, 448.0f)
                reflectiveCurveToRelative(170.78f, 0.0f, 213.37f, -11.49f)
                curveToRelative(23.5f, -6.32f, 42.0f, -24.17f, 48.28f, -47.82f)
                curveToRelative(11.41f, -42.87f, 11.41f, -132.3f, 11.41f, -132.3f)
                reflectiveCurveToRelative(0.0f, -89.44f, -11.41f, -132.3f)
                close()
                moveTo(232.15f, 337.59f)
                lineTo(232.15f, 175.18f)
                lineToRelative(142.74f, 81.21f)
                lineToRelative(-142.74f, 81.2f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
