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

public val RegularGroup.Lemon: ImageVector
    get() {
        if (_lemon != null) {
            return _lemon!!
        }
        _lemon = Builder(name = "Lemon", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 80.0f)
                curveToRelative(-3.2f, 0.0f, -6.2f, 0.4f, -8.9f, 1.3f)
                curveTo(340.0f, 86.8f, 313.0f, 91.9f, 284.8f, 84.6f)
                curveTo(227.4f, 69.7f, 160.2f, 92.0f, 110.1f, 142.1f)
                reflectiveCurveTo(37.7f, 259.4f, 52.6f, 316.8f)
                curveToRelative(7.3f, 28.2f, 2.2f, 55.2f, -3.3f, 74.3f)
                curveToRelative(-0.8f, 2.8f, -1.3f, 5.8f, -1.3f, 8.9f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                curveToRelative(3.2f, 0.0f, 6.2f, -0.4f, 8.9f, -1.3f)
                curveToRelative(19.1f, -5.5f, 46.1f, -10.7f, 74.3f, -3.3f)
                curveToRelative(57.4f, 14.9f, 124.6f, -7.4f, 174.7f, -57.5f)
                reflectiveCurveToRelative(72.4f, -117.3f, 57.5f, -174.7f)
                curveToRelative(-7.3f, -28.2f, -2.2f, -55.2f, 3.3f, -74.3f)
                curveToRelative(0.8f, -2.8f, 1.3f, -5.8f, 1.3f, -8.9f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(368.0f, 32.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 7.7f, -1.1f, 15.2f, -3.1f, 22.3f)
                curveToRelative(-4.6f, 15.8f, -7.1f, 32.9f, -3.0f, 48.9f)
                curveToRelative(20.1f, 77.6f, -10.9f, 161.5f, -70.0f, 220.7f)
                reflectiveCurveToRelative(-143.1f, 90.2f, -220.7f, 70.0f)
                curveToRelative(-16.0f, -4.1f, -33.0f, -1.6f, -48.9f, 3.0f)
                curveToRelative(-7.1f, 2.0f, -14.6f, 3.1f, -22.3f, 3.1f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -7.7f, 1.1f, -15.2f, 3.1f, -22.3f)
                curveToRelative(4.6f, -15.8f, 7.1f, -32.9f, 3.0f, -48.9f)
                curveTo(-14.0f, 251.3f, 17.0f, 167.3f, 76.2f, 108.2f)
                reflectiveCurveTo(219.3f, 18.0f, 296.8f, 38.1f)
                curveToRelative(16.0f, 4.1f, 33.0f, 1.6f, 48.9f, -3.0f)
                curveToRelative(7.1f, -2.0f, 14.6f, -3.1f, 22.3f, -3.1f)
                close()
                moveTo(246.7f, 167.0f)
                curveToRelative(-52.0f, 15.2f, -96.5f, 59.7f, -111.7f, 111.7f)
                curveToRelative(-3.7f, 12.7f, -17.1f, 20.0f, -29.8f, 16.3f)
                reflectiveCurveToRelative(-20.0f, -17.1f, -16.3f, -29.8f)
                curveToRelative(19.8f, -67.7f, 76.6f, -124.5f, 144.3f, -144.3f)
                curveToRelative(12.7f, -3.7f, 26.1f, 3.6f, 29.8f, 16.3f)
                reflectiveCurveToRelative(-3.6f, 26.1f, -16.3f, 29.8f)
                close()
            }
        }
        .build()
        return _lemon!!
    }

private var _lemon: ImageVector? = null
