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

public val BrandsGroup.FontAwesomeAlt: ImageVector
    get() {
        if (_fontAwesomeAlt != null) {
            return _fontAwesomeAlt!!
        }
        _fontAwesomeAlt = Builder(name = "FontAwesomeAlt", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(339.3f, 171.2f)
                curveToRelative(-6.0f, 0.0f, -29.9f, 15.5f, -52.6f, 15.5f)
                curveToRelative(-4.2f, 0.0f, -8.4f, -0.6f, -12.5f, -2.4f)
                curveToRelative(-19.7f, -7.8f, -37.0f, -13.7f, -59.1f, -13.7f)
                curveToRelative(-20.3f, 0.0f, -41.8f, 6.6f, -59.7f, 13.7f)
                curveToRelative(-1.8f, 0.6f, -3.6f, 1.2f, -4.8f, 1.8f)
                verticalLineToRelative(-17.9f)
                curveToRelative(7.8f, -6.0f, 12.5f, -14.9f, 12.5f, -25.7f)
                curveToRelative(0.0f, -17.9f, -14.3f, -32.3f, -32.3f, -32.3f)
                reflectiveCurveToRelative(-32.3f, 14.3f, -32.3f, 32.3f)
                curveToRelative(0.0f, 10.2f, 4.8f, 19.7f, 12.5f, 25.7f)
                verticalLineToRelative(212.1f)
                curveToRelative(0.0f, 10.8f, 9.0f, 19.7f, 19.7f, 19.7f)
                curveToRelative(9.0f, 0.0f, 16.1f, -6.0f, 18.5f, -13.7f)
                lineTo(149.2f, 385.0f)
                curveToRelative(0.6f, -1.8f, 0.6f, -3.0f, 0.6f, -4.8f)
                lineTo(149.8f, 336.0f)
                curveToRelative(1.2f, 0.0f, 2.4f, -0.6f, 3.0f, -1.2f)
                curveToRelative(19.7f, -8.4f, 43.0f, -16.7f, 65.7f, -16.7f)
                curveToRelative(31.1f, 0.0f, 43.0f, 16.1f, 69.3f, 16.1f)
                curveToRelative(18.5f, 0.0f, 36.4f, -6.6f, 52.0f, -13.7f)
                curveToRelative(4.2f, -1.8f, 7.2f, -3.6f, 7.2f, -7.8f)
                lineTo(347.0f, 178.3f)
                curveToRelative(1.8f, -4.1f, -2.3f, -7.1f, -7.7f, -7.1f)
                close()
                moveTo(397.8f, 32.0f)
                lineTo(50.2f, 32.0f)
                curveTo(22.7f, 32.0f, 0.0f, 54.7f, 0.0f, 82.2f)
                verticalLineToRelative(347.6f)
                curveTo(0.0f, 457.3f, 22.7f, 480.0f, 50.2f, 480.0f)
                horizontalLineToRelative(347.6f)
                curveToRelative(27.5f, 0.0f, 50.2f, -22.7f, 50.2f, -50.2f)
                lineTo(448.0f, 82.2f)
                curveToRelative(0.0f, -27.5f, -22.7f, -50.2f, -50.2f, -50.2f)
                close()
                moveTo(412.1f, 429.7f)
                curveToRelative(0.0f, 7.8f, -6.6f, 14.3f, -14.3f, 14.3f)
                lineTo(50.2f, 444.0f)
                curveToRelative(-7.8f, 0.0f, -14.3f, -6.6f, -14.3f, -14.3f)
                lineTo(35.9f, 82.2f)
                curveToRelative(0.0f, -7.8f, 6.6f, -14.3f, 14.3f, -14.3f)
                horizontalLineToRelative(347.6f)
                verticalLineToRelative(-0.1f)
                curveToRelative(7.8f, 0.0f, 14.3f, 6.6f, 14.3f, 14.3f)
                close()
            }
        }
        .build()
        return _fontAwesomeAlt!!
    }

private var _fontAwesomeAlt: ImageVector? = null
