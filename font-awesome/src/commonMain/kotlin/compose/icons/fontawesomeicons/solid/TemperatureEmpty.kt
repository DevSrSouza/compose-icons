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

public val SolidGroup.TemperatureEmpty: ImageVector
    get() {
        if (_temperatureEmpty != null) {
            return _temperatureEmpty!!
        }
        _temperatureEmpty = Builder(name = "TemperatureEmpty", defaultWidth = 320.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineTo(208.0f, 276.5f)
                curveToRelative(0.0f, 17.3f, 7.1f, 31.9f, 15.3f, 42.5f)
                curveTo(233.8f, 332.6f, 240.0f, 349.5f, 240.0f, 368.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -18.5f, 6.2f, -35.4f, 16.7f, -48.9f)
                curveToRelative(8.2f, -10.6f, 15.3f, -25.2f, 15.3f, -42.5f)
                lineTo(112.0f, 112.0f)
                close()
                moveTo(160.0f, 0.0f)
                curveTo(98.1f, 0.0f, 48.0f, 50.2f, 48.0f, 112.0f)
                lineTo(48.0f, 276.5f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.2f, 0.6f)
                curveToRelative(-0.2f, 0.6f, -0.8f, 1.6f, -1.7f, 2.8f)
                curveTo(27.2f, 304.2f, 16.0f, 334.8f, 16.0f, 368.0f)
                curveToRelative(0.0f, 79.5f, 64.5f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.5f, 144.0f, -144.0f)
                curveToRelative(0.0f, -33.2f, -11.2f, -63.8f, -30.1f, -88.1f)
                curveToRelative(-0.9f, -1.2f, -1.5f, -2.2f, -1.7f, -2.8f)
                curveToRelative(-0.1f, -0.3f, -0.2f, -0.5f, -0.2f, -0.6f)
                lineTo(272.0f, 112.0f)
                curveTo(272.0f, 50.2f, 221.9f, 0.0f, 160.0f, 0.0f)
                close()
                moveTo(160.0f, 416.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _temperatureEmpty!!
    }

private var _temperatureEmpty: ImageVector? = null
