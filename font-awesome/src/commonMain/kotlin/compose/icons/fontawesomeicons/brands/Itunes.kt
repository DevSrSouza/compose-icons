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

public val BrandsGroup.Itunes: ImageVector
    get() {
        if (_itunes != null) {
            return _itunes!!
        }
        _itunes = Builder(name = "Itunes", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.6f, 80.3f)
                curveTo(129.0f, 80.3f, 52.5f, 157.0f, 52.5f, 251.5f)
                reflectiveCurveTo(129.0f, 422.8f, 223.6f, 422.8f)
                reflectiveCurveToRelative(171.2f, -76.7f, 171.2f, -171.2f)
                curveToRelative(0.0f, -94.6f, -76.7f, -171.3f, -171.2f, -171.3f)
                close()
                moveTo(303.0f, 320.3f)
                curveToRelative(-3.2f, 13.6f, -13.5f, 21.2f, -27.3f, 23.8f)
                curveToRelative(-12.1f, 2.2f, -22.2f, 2.8f, -31.9f, -5.0f)
                curveToRelative(-11.8f, -10.0f, -12.0f, -26.4f, -1.4f, -36.8f)
                curveToRelative(8.4f, -8.0f, 20.3f, -9.6f, 38.0f, -12.8f)
                curveToRelative(3.0f, -0.5f, 5.6f, -1.2f, 7.7f, -3.7f)
                curveToRelative(3.2f, -3.6f, 2.2f, -2.0f, 2.2f, -80.8f)
                curveToRelative(0.0f, -5.6f, -2.7f, -7.1f, -8.4f, -6.1f)
                curveToRelative(-4.0f, 0.7f, -91.9f, 17.1f, -91.9f, 17.1f)
                curveToRelative(-5.0f, 1.1f, -6.7f, 2.6f, -6.7f, 8.3f)
                curveToRelative(0.0f, 116.1f, 0.5f, 110.8f, -1.2f, 118.5f)
                curveToRelative(-2.1f, 9.0f, -7.6f, 15.8f, -14.9f, 19.6f)
                curveToRelative(-8.3f, 4.6f, -23.4f, 6.6f, -31.4f, 5.2f)
                curveToRelative(-21.4f, -4.0f, -28.9f, -28.7f, -14.4f, -42.9f)
                curveToRelative(8.4f, -8.0f, 20.3f, -9.6f, 38.0f, -12.8f)
                curveToRelative(3.0f, -0.5f, 5.6f, -1.2f, 7.7f, -3.7f)
                curveToRelative(5.0f, -5.7f, 0.9f, -127.0f, 2.6f, -133.7f)
                curveToRelative(0.4f, -2.6f, 1.5f, -4.8f, 3.5f, -6.4f)
                curveToRelative(2.1f, -1.7f, 5.8f, -2.7f, 6.7f, -2.7f)
                curveToRelative(101.0f, -19.0f, 113.3f, -21.4f, 115.1f, -21.4f)
                curveToRelative(5.7f, -0.4f, 9.0f, 3.0f, 9.0f, 8.7f)
                curveToRelative(-0.1f, 170.6f, 0.4f, 161.4f, -1.0f, 167.6f)
                close()
                moveTo(345.2f, 32.0f)
                lineTo(102.8f, 32.0f)
                curveTo(45.9f, 32.0f, 0.0f, 77.9f, 0.0f, 134.8f)
                verticalLineToRelative(242.4f)
                curveTo(0.0f, 434.1f, 45.9f, 480.0f, 102.8f, 480.0f)
                horizontalLineToRelative(242.4f)
                curveToRelative(57.0f, 0.0f, 102.8f, -45.9f, 102.8f, -102.8f)
                lineTo(448.0f, 134.8f)
                curveTo(448.0f, 77.9f, 402.1f, 32.0f, 345.2f, 32.0f)
                close()
                moveTo(223.6f, 444.0f)
                curveToRelative(-106.3f, 0.0f, -192.5f, -86.2f, -192.5f, -192.5f)
                reflectiveCurveTo(117.3f, 59.0f, 223.6f, 59.0f)
                reflectiveCurveToRelative(192.5f, 86.2f, 192.5f, 192.5f)
                reflectiveCurveTo(329.9f, 444.0f, 223.6f, 444.0f)
                close()
            }
        }
        .build()
        return _itunes!!
    }

private var _itunes: ImageVector? = null
