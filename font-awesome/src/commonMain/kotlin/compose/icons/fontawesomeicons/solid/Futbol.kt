package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(417.3f, 360.1f)
                lineToRelative(-71.6f, -4.8f)
                curveToRelative(-5.2f, -0.3f, -10.3f, 1.1f, -14.5f, 4.2f)
                reflectiveCurveToRelative(-7.2f, 7.4f, -8.4f, 12.5f)
                lineToRelative(-17.6f, 69.6f)
                curveTo(289.5f, 445.8f, 273.0f, 448.0f, 256.0f, 448.0f)
                reflectiveCurveToRelative(-33.5f, -2.2f, -49.2f, -6.4f)
                lineTo(189.2f, 372.0f)
                curveToRelative(-1.3f, -5.0f, -4.3f, -9.4f, -8.4f, -12.5f)
                reflectiveCurveToRelative(-9.3f, -4.5f, -14.5f, -4.2f)
                lineToRelative(-71.6f, 4.8f)
                curveToRelative(-17.6f, -27.2f, -28.5f, -59.2f, -30.4f, -93.6f)
                lineTo(125.0f, 228.3f)
                curveToRelative(4.4f, -2.8f, 7.6f, -7.0f, 9.2f, -11.9f)
                reflectiveCurveToRelative(1.4f, -10.2f, -0.5f, -15.0f)
                lineToRelative(-26.7f, -66.6f)
                curveTo(128.0f, 109.2f, 155.3f, 89.0f, 186.7f, 76.9f)
                lineToRelative(55.2f, 46.0f)
                curveToRelative(4.0f, 3.3f, 9.0f, 5.1f, 14.1f, 5.1f)
                reflectiveCurveToRelative(10.2f, -1.8f, 14.1f, -5.1f)
                lineToRelative(55.2f, -46.0f)
                curveToRelative(31.3f, 12.1f, 58.7f, 32.3f, 79.6f, 57.9f)
                lineToRelative(-26.7f, 66.6f)
                curveToRelative(-1.9f, 4.8f, -2.1f, 10.1f, -0.5f, 15.0f)
                reflectiveCurveToRelative(4.9f, 9.1f, 9.2f, 11.9f)
                lineToRelative(60.7f, 38.2f)
                curveToRelative(-1.9f, 34.4f, -12.8f, 66.4f, -30.4f, 93.6f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(270.1f, 186.3f)
                curveToRelative(-8.4f, -6.1f, -19.8f, -6.1f, -28.2f, 0.0f)
                lineTo(194.0f, 221.0f)
                curveToRelative(-8.4f, 6.1f, -11.9f, 16.9f, -8.7f, 26.8f)
                lineToRelative(18.3f, 56.3f)
                curveToRelative(3.2f, 9.9f, 12.4f, 16.6f, 22.8f, 16.6f)
                horizontalLineToRelative(59.2f)
                curveToRelative(10.4f, 0.0f, 19.6f, -6.7f, 22.8f, -16.6f)
                lineToRelative(18.3f, -56.3f)
                curveToRelative(3.2f, -9.9f, -0.3f, -20.7f, -8.7f, -26.8f)
                lineToRelative(-47.9f, -34.8f)
                close()
            }
        }
        .build()
        return _futbol!!
    }

private var _futbol: ImageVector? = null
