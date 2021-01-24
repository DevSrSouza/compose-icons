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

public val SolidGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.1f, 112.0f)
                curveToRelative(-34.2f, 0.5f, -62.3f, 28.4f, -63.0f, 62.6f)
                curveToRelative(-0.5f, 24.3f, 12.5f, 45.6f, 32.0f, 56.8f)
                lineTo(416.1f, 344.0f)
                curveToRelative(0.0f, 57.3f, -50.2f, 104.0f, -112.0f, 104.0f)
                curveToRelative(-60.0f, 0.0f, -109.2f, -44.1f, -111.9f, -99.2f)
                curveTo(265.0f, 333.8f, 320.0f, 269.2f, 320.0f, 192.0f)
                lineTo(320.0f, 36.6f)
                curveToRelative(0.0f, -11.4f, -8.1f, -21.3f, -19.3f, -23.5f)
                lineTo(237.8f, 0.5f)
                curveToRelative(-13.0f, -2.6f, -25.6f, 5.8f, -28.2f, 18.8f)
                lineTo(206.4f, 35.0f)
                curveToRelative(-2.6f, 13.0f, 5.8f, 25.6f, 18.8f, 28.2f)
                lineToRelative(30.7f, 6.1f)
                verticalLineToRelative(121.4f)
                curveToRelative(0.0f, 52.9f, -42.2f, 96.7f, -95.1f, 97.2f)
                curveToRelative(-53.4f, 0.5f, -96.9f, -42.7f, -96.9f, -96.0f)
                lineTo(63.9f, 69.4f)
                lineToRelative(30.7f, -6.1f)
                curveToRelative(13.0f, -2.6f, 21.4f, -15.2f, 18.8f, -28.2f)
                lineToRelative(-3.1f, -15.7f)
                curveTo(107.7f, 6.4f, 95.1f, -2.0f, 82.1f, 0.6f)
                lineTo(19.3f, 13.0f)
                curveTo(8.1f, 15.3f, 0.0f, 25.1f, 0.0f, 36.6f)
                lineTo(0.0f, 192.0f)
                curveToRelative(0.0f, 77.3f, 55.1f, 142.0f, 128.1f, 156.8f)
                curveTo(130.7f, 439.2f, 208.6f, 512.0f, 304.0f, 512.0f)
                curveToRelative(97.0f, 0.0f, 176.0f, -75.4f, 176.0f, -168.0f)
                lineTo(480.0f, 231.4f)
                curveToRelative(19.1f, -11.1f, 32.0f, -31.7f, 32.0f, -55.4f)
                curveToRelative(0.0f, -35.7f, -29.2f, -64.5f, -64.9f, -64.0f)
                close()
                moveTo(448.0f, 192.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
