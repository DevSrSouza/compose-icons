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

public val SolidGroup.MapLocationDot: ImageVector
    get() {
        if (_mapLocationDot != null) {
            return _mapLocationDot!!
        }
        _mapLocationDot = Builder(name = "MapLocationDot", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 120.0f)
                curveToRelative(0.0f, 54.6f, -73.1f, 151.9f, -105.2f, 192.0f)
                curveToRelative(-7.7f, 9.6f, -22.0f, 9.6f, -29.6f, 0.0f)
                curveTo(241.1f, 271.9f, 168.0f, 174.6f, 168.0f, 120.0f)
                curveTo(168.0f, 53.7f, 221.7f, 0.0f, 288.0f, 0.0f)
                reflectiveCurveToRelative(120.0f, 53.7f, 120.0f, 120.0f)
                close()
                moveTo(416.0f, 200.4f)
                curveToRelative(3.5f, -6.9f, 6.7f, -13.8f, 9.6f, -20.6f)
                curveToRelative(0.5f, -1.2f, 1.0f, -2.5f, 1.5f, -3.7f)
                lineToRelative(116.0f, -46.4f)
                curveTo(558.9f, 123.4f, 576.0f, 135.0f, 576.0f, 152.0f)
                lineTo(576.0f, 422.8f)
                curveToRelative(0.0f, 9.8f, -6.0f, 18.6f, -15.1f, 22.3f)
                lineTo(416.0f, 503.0f)
                lineTo(416.0f, 200.4f)
                close()
                moveTo(137.6f, 138.3f)
                curveToRelative(2.4f, 14.1f, 7.2f, 28.3f, 12.8f, 41.5f)
                curveToRelative(2.9f, 6.8f, 6.1f, 13.7f, 9.6f, 20.6f)
                lineTo(160.0f, 451.8f)
                lineTo(32.9f, 502.7f)
                curveTo(17.1f, 509.0f, 0.0f, 497.4f, 0.0f, 480.4f)
                lineTo(0.0f, 209.6f)
                curveToRelative(0.0f, -9.8f, 6.0f, -18.6f, 15.1f, -22.3f)
                lineToRelative(122.6f, -49.0f)
                close()
                moveTo(327.8f, 332.0f)
                curveToRelative(13.9f, -17.4f, 35.7f, -45.7f, 56.2f, -77.0f)
                lineTo(384.0f, 504.3f)
                lineTo(192.0f, 449.4f)
                lineTo(192.0f, 255.0f)
                curveToRelative(20.5f, 31.3f, 42.3f, 59.6f, 56.2f, 77.0f)
                curveToRelative(20.5f, 25.6f, 59.1f, 25.6f, 79.6f, 0.0f)
                close()
                moveTo(288.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _mapLocationDot!!
    }

private var _mapLocationDot: ImageVector? = null
