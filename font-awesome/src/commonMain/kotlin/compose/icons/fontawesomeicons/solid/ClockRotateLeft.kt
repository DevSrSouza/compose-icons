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

public val SolidGroup.ClockRotateLeft: ImageVector
    get() {
        if (_clockRotateLeft != null) {
            return _clockRotateLeft!!
        }
        _clockRotateLeft = Builder(name = "ClockRotateLeft", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.0f, 75.0f)
                lineTo(41.0f, 41.0f)
                curveTo(25.9f, 25.9f, 0.0f, 36.6f, 0.0f, 57.9f)
                lineTo(0.0f, 168.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(134.1f, 192.0f)
                curveToRelative(21.4f, 0.0f, 32.1f, -25.9f, 17.0f, -41.0f)
                lineToRelative(-30.8f, -30.8f)
                curveTo(155.0f, 85.5f, 203.0f, 64.0f, 256.0f, 64.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, 86.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(-86.0f, 192.0f, -192.0f, 192.0f)
                curveToRelative(-40.8f, 0.0f, -78.6f, -12.7f, -109.7f, -34.4f)
                curveToRelative(-14.5f, -10.1f, -34.4f, -6.6f, -44.6f, 7.9f)
                reflectiveCurveToRelative(-6.6f, 34.4f, 7.9f, 44.6f)
                curveTo(151.2f, 495.0f, 201.7f, 512.0f, 256.0f, 512.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                curveTo(185.3f, 0.0f, 121.3f, 28.7f, 75.0f, 75.0f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineTo(232.0f, 256.0f)
                curveToRelative(0.0f, 6.4f, 2.5f, 12.5f, 7.0f, 17.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-65.0f, -65.0f)
                lineTo(279.9f, 152.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _clockRotateLeft!!
    }

private var _clockRotateLeft: ImageVector? = null
