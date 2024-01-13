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

public val SolidGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 256.0f)
                curveToRelative(0.0f, 22.2f, -1.2f, 43.6f, -3.3f, 64.0f)
                lineTo(163.3f, 320.0f)
                curveToRelative(-2.2f, -20.4f, -3.3f, -41.8f, -3.3f, -64.0f)
                reflectiveCurveToRelative(1.2f, -43.6f, 3.3f, -64.0f)
                lineTo(348.7f, 192.0f)
                curveToRelative(2.2f, 20.4f, 3.3f, 41.8f, 3.3f, 64.0f)
                close()
                moveTo(380.8f, 192.0f)
                lineTo(503.9f, 192.0f)
                curveToRelative(5.3f, 20.5f, 8.1f, 41.9f, 8.1f, 64.0f)
                reflectiveCurveToRelative(-2.8f, 43.5f, -8.1f, 64.0f)
                lineTo(380.8f, 320.0f)
                curveToRelative(2.1f, -20.6f, 3.2f, -42.0f, 3.2f, -64.0f)
                reflectiveCurveToRelative(-1.1f, -43.4f, -3.2f, -64.0f)
                close()
                moveTo(493.4f, 160.0f)
                lineTo(376.7f, 160.0f)
                curveToRelative(-10.0f, -63.9f, -29.8f, -117.4f, -55.3f, -151.6f)
                curveToRelative(78.3f, 20.7f, 142.0f, 77.5f, 171.9f, 151.6f)
                close()
                moveTo(344.3f, 160.0f)
                lineTo(167.7f, 160.0f)
                curveToRelative(6.1f, -36.4f, 15.5f, -68.6f, 27.0f, -94.7f)
                curveToRelative(10.5f, -23.6f, 22.2f, -40.7f, 33.5f, -51.5f)
                curveTo(239.4f, 3.2f, 248.7f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(16.6f, 3.2f, 27.8f, 13.8f)
                curveToRelative(11.3f, 10.8f, 23.0f, 27.9f, 33.5f, 51.5f)
                curveToRelative(11.6f, 26.0f, 20.9f, 58.2f, 27.0f, 94.7f)
                close()
                moveTo(135.3f, 160.0f)
                lineTo(18.6f, 160.0f)
                curveTo(48.6f, 85.9f, 112.2f, 29.1f, 190.6f, 8.4f)
                curveTo(165.1f, 42.6f, 145.3f, 96.1f, 135.3f, 160.0f)
                close()
                moveTo(8.1f, 192.0f)
                lineTo(131.2f, 192.0f)
                curveToRelative(-2.1f, 20.6f, -3.2f, 42.0f, -3.2f, 64.0f)
                reflectiveCurveToRelative(1.1f, 43.4f, 3.2f, 64.0f)
                lineTo(8.1f, 320.0f)
                curveTo(2.8f, 299.5f, 0.0f, 278.1f, 0.0f, 256.0f)
                reflectiveCurveToRelative(2.8f, -43.5f, 8.1f, -64.0f)
                close()
                moveTo(194.7f, 446.6f)
                curveToRelative(-11.6f, -26.0f, -20.9f, -58.2f, -27.0f, -94.6f)
                lineTo(344.3f, 352.0f)
                curveToRelative(-6.1f, 36.4f, -15.5f, 68.6f, -27.0f, 94.6f)
                curveToRelative(-10.5f, 23.6f, -22.2f, 40.7f, -33.5f, 51.5f)
                curveTo(272.6f, 508.8f, 263.3f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(-16.6f, -3.2f, -27.8f, -13.8f)
                curveToRelative(-11.3f, -10.8f, -23.0f, -27.9f, -33.5f, -51.5f)
                close()
                moveTo(135.3f, 352.0f)
                curveToRelative(10.0f, 63.9f, 29.8f, 117.4f, 55.3f, 151.6f)
                curveTo(112.2f, 482.9f, 48.6f, 426.1f, 18.6f, 352.0f)
                lineTo(135.3f, 352.0f)
                close()
                moveTo(493.4f, 352.0f)
                curveToRelative(-30.0f, 74.1f, -93.6f, 130.9f, -171.9f, 151.6f)
                curveToRelative(25.5f, -34.2f, 45.2f, -87.7f, 55.3f, -151.6f)
                lineTo(493.4f, 352.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
