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

public val SolidGroup.GrinWink: ImageVector
    get() {
        if (_grinWink != null) {
            return _grinWink!!
        }
        _grinWink = Builder(name = "GrinWink", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, 111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveTo(0.0f, 119.0f, 0.0f, 256.0f)
                close()
                moveTo(200.0f, 208.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(368.0f, 233.0f)
                lineToRelative(-9.5f, -8.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61.0f, 0.0f)
                lineTo(288.0f, 233.0f)
                curveToRelative(-8.3f, 7.4f, -21.6f, 0.4f, -19.8f, -10.8f)
                curveToRelative(4.0f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(384.0f, 197.0f, 388.0f, 222.2f)
                curveToRelative(1.6f, 11.0f, -11.5f, 18.2f, -20.0f, 10.8f)
                close()
                moveTo(124.9f, 320.8f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.3f, -3.7f, 22.6f, 6.0f, 20.7f, 17.9f)
                curveToRelative(-9.2f, 55.0f, -83.2f, 93.3f, -143.8f, 93.3f)
                reflectiveCurveToRelative(-134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2.0f, -11.9f, 9.3f, -21.6f, 20.7f, -17.9f)
                close()
            }
        }
        .build()
        return _grinWink!!
    }

private var _grinWink: ImageVector? = null
