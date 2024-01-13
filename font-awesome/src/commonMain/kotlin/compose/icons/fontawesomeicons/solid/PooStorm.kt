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

public val SolidGroup.PooStorm: ImageVector
    get() {
        if (_pooStorm != null) {
            return _pooStorm!!
        }
        _pooStorm = Builder(name = "PooStorm", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.9f, 0.2f)
                curveToRelative(-5.5f, -0.7f, -11.0f, 1.4f, -14.5f, 5.7f)
                reflectiveCurveToRelative(-4.6f, 10.1f, -2.8f, 15.3f)
                curveToRelative(2.8f, 8.2f, 4.3f, 16.9f, 4.3f, 26.1f)
                curveToRelative(0.0f, 21.7f, -8.5f, 37.2f, -21.9f, 47.6f)
                curveToRelative(-13.8f, 10.8f, -34.0f, 17.0f, -57.8f, 17.0f)
                lineTo(128.0f, 111.9f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                curveToRelative(0.0f, 12.2f, 3.4f, 23.5f, 9.3f, 33.2f)
                curveTo(31.7f, 216.2f, 0.0f, 252.4f, 0.0f, 296.0f)
                curveToRelative(0.0f, 40.9f, 28.0f, 75.4f, 65.8f, 85.2f)
                curveToRelative(-5.3f, -18.5f, 1.0f, -38.5f, 16.2f, -50.7f)
                lineToRelative(160.0f, -128.0f)
                curveToRelative(17.6f, -14.1f, 42.6f, -14.0f, 60.2f, 0.2f)
                reflectiveCurveToRelative(22.8f, 38.6f, 12.8f, 58.8f)
                lineTo(285.7f, 320.0f)
                lineTo(304.0f, 320.0f)
                curveToRelative(20.4f, 0.0f, 38.5f, 12.9f, 45.3f, 32.1f)
                curveToRelative(3.7f, 10.6f, 3.5f, 21.8f, 0.0f, 31.9f)
                lineTo(360.0f, 384.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, -39.4f, 88.0f, -88.0f)
                curveToRelative(0.0f, -43.6f, -31.7f, -79.8f, -73.3f, -86.8f)
                curveToRelative(5.9f, -9.7f, 9.3f, -21.1f, 9.3f, -33.2f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineToRelative(-1.4f)
                curveToRelative(0.9f, -5.4f, 1.4f, -10.9f, 1.4f, -16.6f)
                curveToRelative(0.0f, -48.7f, -36.1f, -88.9f, -83.1f, -95.2f)
                close()
                moveTo(282.0f, 227.6f)
                curveToRelative(-5.8f, -4.7f, -14.2f, -4.7f, -20.1f, -0.1f)
                lineToRelative(-160.0f, 128.0f)
                curveToRelative(-5.3f, 4.2f, -7.4f, 11.4f, -5.1f, 17.8f)
                reflectiveCurveToRelative(8.3f, 10.7f, 15.1f, 10.7f)
                horizontalLineToRelative(70.1f)
                lineTo(129.7f, 488.8f)
                curveToRelative(-3.4f, 6.7f, -1.6f, 14.9f, 4.3f, 19.6f)
                reflectiveCurveToRelative(14.2f, 4.7f, 20.1f, 0.1f)
                lineToRelative(160.0f, -128.0f)
                curveToRelative(5.3f, -4.2f, 7.4f, -11.4f, 5.1f, -17.8f)
                reflectiveCurveToRelative(-8.3f, -10.7f, -15.1f, -10.7f)
                lineTo(233.9f, 352.0f)
                lineToRelative(52.4f, -104.8f)
                curveToRelative(3.4f, -6.7f, 1.6f, -14.9f, -4.3f, -19.6f)
                close()
            }
        }
        .build()
        return _pooStorm!!
    }

private var _pooStorm: ImageVector? = null
