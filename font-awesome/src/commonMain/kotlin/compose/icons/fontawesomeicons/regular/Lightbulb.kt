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

public val RegularGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.2f, 248.9f)
                curveTo(311.6f, 228.3f, 320.0f, 203.2f, 320.0f, 176.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                reflectiveCurveTo(64.0f, 105.3f, 64.0f, 176.0f)
                curveToRelative(0.0f, 27.2f, 8.4f, 52.3f, 22.8f, 72.9f)
                curveToRelative(3.7f, 5.3f, 8.1f, 11.3f, 12.8f, 17.7f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(12.9f, 17.7f, 28.3f, 38.9f, 39.8f, 59.8f)
                curveToRelative(10.4f, 19.0f, 15.7f, 38.8f, 18.3f, 57.5f)
                lineTo(109.0f, 383.9f)
                curveToRelative(-2.2f, -12.0f, -5.9f, -23.7f, -11.8f, -34.5f)
                curveToRelative(-9.9f, -18.0f, -22.2f, -34.9f, -34.5f, -51.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-5.2f, -7.1f, -10.4f, -14.2f, -15.4f, -21.4f)
                curveTo(27.6f, 247.9f, 16.0f, 213.3f, 16.0f, 176.0f)
                curveTo(16.0f, 78.8f, 94.8f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(176.0f, 78.8f, 176.0f, 176.0f)
                curveToRelative(0.0f, 37.3f, -11.6f, 71.9f, -31.4f, 100.3f)
                curveToRelative(-5.0f, 7.2f, -10.2f, 14.3f, -15.4f, 21.4f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-12.3f, 16.8f, -24.6f, 33.7f, -34.5f, 51.8f)
                curveToRelative(-5.9f, 10.8f, -9.6f, 22.5f, -11.8f, 34.5f)
                lineTo(226.4f, 384.0f)
                curveToRelative(2.6f, -18.7f, 7.9f, -38.6f, 18.3f, -57.5f)
                curveToRelative(11.5f, -20.9f, 26.9f, -42.1f, 39.8f, -59.8f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(4.7f, -6.4f, 9.0f, -12.4f, 12.7f, -17.7f)
                close()
                moveTo(192.0f, 128.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(192.0f, 512.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                lineTo(112.0f, 416.0f)
                lineTo(272.0f, 416.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
