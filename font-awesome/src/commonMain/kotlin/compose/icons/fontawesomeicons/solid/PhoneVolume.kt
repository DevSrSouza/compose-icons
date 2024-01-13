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

public val SolidGroup.PhoneVolume: ImageVector
    get() {
        if (_phoneVolume != null) {
            return _phoneVolume!!
        }
        _phoneVolume = Builder(name = "PhoneVolume", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.0f, 0.0f)
                curveTo(408.1f, 0.0f, 512.0f, 103.9f, 512.0f, 232.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -101.6f, -82.4f, -184.0f, -184.0f, -184.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(288.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(256.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                curveToRelative(75.1f, 0.0f, 136.0f, 60.9f, 136.0f, 136.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(117.5f, 1.4f)
                curveToRelative(19.4f, -5.3f, 39.7f, 4.6f, 47.4f, 23.2f)
                lineToRelative(40.0f, 96.0f)
                curveToRelative(6.8f, 16.3f, 2.1f, 35.2f, -11.6f, 46.3f)
                lineTo(144.0f, 207.3f)
                curveToRelative(33.3f, 70.4f, 90.3f, 127.4f, 160.7f, 160.7f)
                lineTo(345.0f, 318.7f)
                curveToRelative(11.2f, -13.7f, 30.0f, -18.4f, 46.3f, -11.6f)
                lineToRelative(96.0f, 40.0f)
                curveToRelative(18.6f, 7.7f, 28.5f, 28.0f, 23.2f, 47.4f)
                lineToRelative(-24.0f, 88.0f)
                curveTo(481.8f, 499.9f, 466.0f, 512.0f, 448.0f, 512.0f)
                curveTo(200.6f, 512.0f, 0.0f, 311.4f, 0.0f, 64.0f)
                curveTo(0.0f, 46.0f, 12.1f, 30.2f, 29.5f, 25.4f)
                lineToRelative(88.0f, -24.0f)
                close()
            }
        }
        .build()
        return _phoneVolume!!
    }

private var _phoneVolume: ImageVector? = null
