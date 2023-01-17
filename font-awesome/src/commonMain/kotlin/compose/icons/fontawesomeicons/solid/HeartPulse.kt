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

public val SolidGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.3f, 469.1f)
                lineTo(47.6f, 300.4f)
                curveToRelative(-4.2f, -3.9f, -8.2f, -8.1f, -11.9f, -12.4f)
                horizontalLineToRelative(87.0f)
                curveToRelative(22.6f, 0.0f, 43.0f, -13.6f, 51.7f, -34.5f)
                lineToRelative(10.5f, -25.2f)
                lineToRelative(49.3f, 109.5f)
                curveToRelative(3.8f, 8.5f, 12.1f, 14.0f, 21.4f, 14.1f)
                reflectiveCurveToRelative(17.8f, -5.0f, 22.0f, -13.3f)
                lineTo(320.0f, 253.7f)
                lineToRelative(1.7f, 3.4f)
                curveToRelative(9.5f, 19.0f, 28.9f, 31.0f, 50.1f, 31.0f)
                horizontalLineTo(476.3f)
                curveToRelative(-3.7f, 4.3f, -7.7f, 8.5f, -11.9f, 12.4f)
                lineTo(283.7f, 469.1f)
                curveToRelative(-7.5f, 7.0f, -17.4f, 10.9f, -27.7f, 10.9f)
                reflectiveCurveToRelative(-20.2f, -3.9f, -27.7f, -10.9f)
                close()
                moveTo(503.7f, 240.0f)
                horizontalLineToRelative(-132.0f)
                curveToRelative(-3.0f, 0.0f, -5.8f, -1.7f, -7.2f, -4.4f)
                lineToRelative(-23.2f, -46.3f)
                curveToRelative(-4.1f, -8.1f, -12.4f, -13.3f, -21.5f, -13.3f)
                reflectiveCurveToRelative(-17.4f, 5.1f, -21.5f, 13.3f)
                lineToRelative(-41.4f, 82.8f)
                lineTo(205.9f, 158.2f)
                curveToRelative(-3.9f, -8.7f, -12.7f, -14.3f, -22.2f, -14.1f)
                reflectiveCurveToRelative(-18.1f, 5.9f, -21.8f, 14.8f)
                lineToRelative(-31.8f, 76.3f)
                curveToRelative(-1.2f, 3.0f, -4.2f, 4.9f, -7.4f, 4.9f)
                horizontalLineTo(16.0f)
                curveToRelative(-2.6f, 0.0f, -5.0f, 0.4f, -7.3f, 1.1f)
                curveTo(3.0f, 225.2f, 0.0f, 208.2f, 0.0f, 190.9f)
                verticalLineToRelative(-5.8f)
                curveToRelative(0.0f, -69.9f, 50.5f, -129.5f, 119.4f, -141.0f)
                curveTo(165.0f, 36.5f, 211.4f, 51.4f, 244.0f, 84.0f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(12.0f, -12.0f)
                curveToRelative(32.6f, -32.6f, 79.0f, -47.5f, 124.6f, -39.9f)
                curveTo(461.5f, 55.6f, 512.0f, 115.2f, 512.0f, 185.1f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 16.9f, -2.8f, 33.5f, -8.3f, 49.1f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
