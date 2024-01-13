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

public val SolidGroup.TemperatureHigh: ImageVector
    get() {
        if (_temperatureHigh != null) {
            return _temperatureHigh!!
        }
        _temperatureHigh = Builder(name = "TemperatureHigh", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(416.0f, 192.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 416.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 0.0f, 192.0f)
                close()
                moveTo(96.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineTo(192.0f, 276.5f)
                curveToRelative(0.0f, 17.3f, 7.1f, 31.9f, 15.3f, 42.5f)
                curveTo(217.8f, 332.6f, 224.0f, 349.5f, 224.0f, 368.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -18.5f, 6.2f, -35.4f, 16.7f, -48.9f)
                curveTo(88.9f, 308.4f, 96.0f, 293.8f, 96.0f, 276.5f)
                lineTo(96.0f, 112.0f)
                close()
                moveTo(144.0f, 0.0f)
                curveTo(82.1f, 0.0f, 32.0f, 50.2f, 32.0f, 112.0f)
                lineTo(32.0f, 276.5f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.2f, 0.6f)
                curveToRelative(-0.2f, 0.6f, -0.8f, 1.6f, -1.7f, 2.8f)
                curveTo(11.2f, 304.2f, 0.0f, 334.8f, 0.0f, 368.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -33.2f, -11.2f, -63.8f, -30.1f, -88.1f)
                curveToRelative(-0.9f, -1.2f, -1.5f, -2.2f, -1.7f, -2.8f)
                curveToRelative(-0.1f, -0.3f, -0.2f, -0.5f, -0.2f, -0.6f)
                lineTo(256.0f, 112.0f)
                curveTo(256.0f, 50.2f, 205.9f, 0.0f, 144.0f, 0.0f)
                close()
                moveTo(144.0f, 416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -20.9f, -13.4f, -38.7f, -32.0f, -45.3f)
                lineTo(160.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(128.0f, 322.7f)
                curveToRelative(-18.6f, 6.6f, -32.0f, 24.4f, -32.0f, 45.3f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _temperatureHigh!!
    }

private var _temperatureHigh: ImageVector? = null
