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

public val SolidGroup.TemperatureArrowUp: ImageVector
    get() {
        if (_temperatureArrowUp != null) {
            return _temperatureArrowUp!!
        }
        _temperatureArrowUp = Builder(name = "TemperatureArrowUp", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineTo(224.0f, 276.5f)
                curveToRelative(0.0f, 17.3f, 7.1f, 31.9f, 15.3f, 42.5f)
                curveTo(249.8f, 332.6f, 256.0f, 349.5f, 256.0f, 368.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -18.5f, 6.2f, -35.4f, 16.7f, -48.9f)
                curveToRelative(8.2f, -10.6f, 15.3f, -25.2f, 15.3f, -42.5f)
                lineTo(128.0f, 112.0f)
                close()
                moveTo(176.0f, 0.0f)
                curveTo(114.1f, 0.0f, 64.0f, 50.1f, 64.0f, 112.0f)
                lineTo(64.0f, 276.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.2f, 0.6f)
                curveToRelative(-0.2f, 0.6f, -0.8f, 1.6f, -1.7f, 2.8f)
                curveTo(43.2f, 304.2f, 32.0f, 334.8f, 32.0f, 368.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -33.2f, -11.2f, -63.8f, -30.1f, -88.1f)
                curveToRelative(-0.9f, -1.2f, -1.5f, -2.2f, -1.7f, -2.8f)
                curveToRelative(-0.1f, -0.3f, -0.2f, -0.5f, -0.2f, -0.6f)
                lineTo(288.0f, 112.0f)
                curveTo(288.0f, 50.1f, 237.9f, 0.0f, 176.0f, 0.0f)
                close()
                moveTo(176.0f, 416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -20.9f, -13.4f, -38.7f, -32.0f, -45.3f)
                lineTo(192.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineTo(160.0f, 322.7f)
                curveToRelative(-18.6f, 6.6f, -32.0f, 24.4f, -32.0f, 45.3f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(480.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(12.9f, 0.0f, 24.6f, -7.8f, 29.6f, -19.8f)
                reflectiveCurveToRelative(2.2f, -25.7f, -6.9f, -34.9f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-9.2f, 9.2f, -11.9f, 22.9f, -6.9f, 34.9f)
                reflectiveCurveToRelative(16.6f, 19.8f, 29.6f, 19.8f)
                horizontalLineToRelative(32.0f)
                lineTo(416.1f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(480.1f, 160.0f)
                close()
            }
        }
        .build()
        return _temperatureArrowUp!!
    }

private var _temperatureArrowUp: ImageVector? = null
