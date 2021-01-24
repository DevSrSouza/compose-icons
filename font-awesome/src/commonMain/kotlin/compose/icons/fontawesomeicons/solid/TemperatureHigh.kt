package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(416.0f, 0.0f)
                curveToRelative(-52.9f, 0.0f, -96.0f, 43.1f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.1f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.1f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.1f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(416.0f, 128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(256.0f, 112.0f)
                curveTo(256.0f, 50.1f, 205.9f, 0.0f, 144.0f, 0.0f)
                reflectiveCurveTo(32.0f, 50.1f, 32.0f, 112.0f)
                verticalLineToRelative(166.5f)
                curveTo(12.3f, 303.2f, 0.0f, 334.0f, 0.0f, 368.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -34.0f, -12.3f, -64.9f, -32.0f, -89.5f)
                lineTo(256.0f, 112.0f)
                close()
                moveTo(144.0f, 448.0f)
                curveToRelative(-44.1f, 0.0f, -80.0f, -35.9f, -80.0f, -80.0f)
                curveToRelative(0.0f, -25.5f, 12.2f, -48.9f, 32.0f, -63.8f)
                lineTo(96.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(192.2f)
                curveToRelative(19.8f, 14.8f, 32.0f, 38.3f, 32.0f, 63.8f)
                curveToRelative(0.0f, 44.1f, -35.9f, 80.0f, -80.0f, 80.0f)
                close()
                moveTo(160.0f, 322.9f)
                lineTo(160.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(210.9f)
                curveToRelative(-18.6f, 6.6f, -32.0f, 24.2f, -32.0f, 45.1f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -20.9f, -13.4f, -38.5f, -32.0f, -45.1f)
                close()
            }
        }
        .build()
        return _temperatureHigh!!
    }

private var _temperatureHigh: ImageVector? = null
