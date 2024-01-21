package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(435.4f, 361.3f)
                lineToRelative(-89.7f, -6.0f)
                curveToRelative(-5.2f, -0.3f, -10.3f, 1.1f, -14.5f, 4.2f)
                reflectiveCurveToRelative(-7.2f, 7.4f, -8.4f, 12.5f)
                lineToRelative(-22.0f, 87.2f)
                curveToRelative(-14.4f, 3.2f, -29.4f, 4.8f, -44.8f, 4.8f)
                reflectiveCurveToRelative(-30.3f, -1.7f, -44.8f, -4.8f)
                lineToRelative(-22.0f, -87.2f)
                curveToRelative(-1.3f, -5.0f, -4.3f, -9.4f, -8.4f, -12.5f)
                reflectiveCurveToRelative(-9.3f, -4.5f, -14.5f, -4.2f)
                lineToRelative(-89.7f, 6.0f)
                curveTo(61.7f, 335.9f, 51.9f, 307.0f, 49.0f, 276.2f)
                lineTo(125.0f, 228.3f)
                curveToRelative(4.4f, -2.8f, 7.6f, -7.0f, 9.2f, -11.9f)
                reflectiveCurveToRelative(1.4f, -10.2f, -0.5f, -15.0f)
                lineTo(100.4f, 118.0f)
                curveToRelative(19.9f, -22.4f, 44.6f, -40.5f, 72.4f, -52.7f)
                lineToRelative(69.1f, 57.6f)
                curveToRelative(4.0f, 3.3f, 9.0f, 5.1f, 14.1f, 5.1f)
                reflectiveCurveToRelative(10.2f, -1.8f, 14.1f, -5.1f)
                lineToRelative(69.1f, -57.6f)
                curveToRelative(27.8f, 12.2f, 52.5f, 30.3f, 72.4f, 52.7f)
                lineToRelative(-33.4f, 83.4f)
                curveToRelative(-1.9f, 4.8f, -2.1f, 10.1f, -0.5f, 15.0f)
                reflectiveCurveToRelative(4.9f, 9.1f, 9.2f, 11.9f)
                lineTo(463.0f, 276.2f)
                curveToRelative(-3.0f, 30.8f, -12.7f, 59.7f, -27.6f, 85.1f)
                close()
                moveTo(256.0f, 48.0f)
                lineToRelative(0.9f, 0.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(0.9f, 0.0f)
                close()
                moveTo(56.7f, 196.2f)
                curveToRelative(0.9f, -3.0f, 1.9f, -6.1f, 2.9f, -9.1f)
                lineToRelative(-2.9f, 9.1f)
                close()
                moveTo(132.0f, 423.0f)
                lineToRelative(3.8f, 2.7f)
                curveToRelative(-1.3f, -0.9f, -2.5f, -1.8f, -3.8f, -2.7f)
                close()
                moveTo(380.1f, 422.9f)
                curveToRelative(-1.3f, 1.0f, -2.7f, 2.0f, -4.0f, 2.9f)
                lineToRelative(4.0f, -2.9f)
                close()
                moveTo(455.3f, 196.3f)
                lineToRelative(-3.0f, -9.2f)
                curveToRelative(1.1f, 3.0f, 2.1f, 6.1f, 3.0f, 9.2f)
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
