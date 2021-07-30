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

public val BrandsGroup.Slideshare: ImageVector
    get() {
        if (_slideshare != null) {
            return _slideshare!!
        }
        _slideshare = Builder(name = "Slideshare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.7f, 153.7f)
                curveToRelative(-34.0f, 0.0f, -61.7f, 25.7f, -61.7f, 57.7f)
                curveToRelative(0.0f, 31.7f, 27.7f, 57.7f, 61.7f, 57.7f)
                reflectiveCurveToRelative(61.7f, -26.0f, 61.7f, -57.7f)
                curveToRelative(0.0f, -32.0f, -27.7f, -57.7f, -61.7f, -57.7f)
                close()
                moveTo(331.1f, 153.7f)
                curveToRelative(-34.0f, 0.0f, -61.7f, 25.7f, -61.7f, 57.7f)
                curveToRelative(0.0f, 31.7f, 27.7f, 57.7f, 61.7f, 57.7f)
                curveToRelative(34.3f, 0.0f, 61.7f, -26.0f, 61.7f, -57.7f)
                curveToRelative(0.1f, -32.0f, -27.4f, -57.7f, -61.7f, -57.7f)
                close()
                moveTo(487.7f, 243.7f)
                lineToRelative(-6.0f, 4.3f)
                lineTo(481.7f, 49.7f)
                curveToRelative(0.0f, -27.4f, -20.6f, -49.7f, -46.0f, -49.7f)
                lineTo(76.6f, 0.0f)
                curveToRelative(-25.4f, 0.0f, -46.0f, 22.3f, -46.0f, 49.7f)
                lineTo(30.6f, 248.0f)
                curveToRelative(-2.0f, -1.4f, -4.3f, -2.9f, -6.3f, -4.3f)
                curveToRelative(-15.1f, -10.6f, -25.1f, 4.0f, -16.0f, 17.7f)
                curveToRelative(18.3f, 22.6f, 53.1f, 50.3f, 106.3f, 72.0f)
                curveTo(58.3f, 525.1f, 252.0f, 555.7f, 248.9f, 457.5f)
                curveToRelative(0.0f, -0.7f, 0.3f, -56.6f, 0.3f, -96.6f)
                curveToRelative(5.1f, 1.1f, 9.4f, 2.3f, 13.7f, 3.1f)
                curveToRelative(0.0f, 39.7f, 0.3f, 92.8f, 0.3f, 93.5f)
                curveToRelative(-3.1f, 98.3f, 190.6f, 67.7f, 134.3f, -124.0f)
                curveToRelative(53.1f, -21.7f, 88.0f, -49.4f, 106.3f, -72.0f)
                curveToRelative(9.1f, -13.8f, -0.9f, -28.3f, -16.1f, -17.8f)
                close()
                moveTo(457.2f, 262.9f)
                curveToRelative(-68.9f, 37.4f, -128.3f, 31.1f, -160.6f, 29.7f)
                curveToRelative(-23.7f, -0.9f, -32.6f, 9.1f, -33.7f, 24.9f)
                curveToRelative(-10.3f, -7.7f, -18.6f, -15.5f, -20.3f, -17.1f)
                curveToRelative(-5.1f, -5.4f, -13.7f, -8.0f, -27.1f, -7.7f)
                curveToRelative(-31.7f, 1.1f, -89.7f, 7.4f, -157.4f, -28.0f)
                lineTo(58.1f, 72.3f)
                curveToRelative(0.0f, -34.9f, 8.9f, -45.7f, 40.6f, -45.7f)
                horizontalLineToRelative(317.7f)
                curveToRelative(30.3f, 0.0f, 40.9f, 12.9f, 40.9f, 45.7f)
                verticalLineToRelative(190.6f)
                close()
            }
        }
        .build()
        return _slideshare!!
    }

private var _slideshare: ImageVector? = null
