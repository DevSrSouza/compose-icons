package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.SmileWink: ImageVector
    get() {
        if (_smileWink != null) {
            return _smileWink!!
        }
        _smileWink = Builder(name = "SmileWink", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 456.0f)
                curveToRelative(-110.3f, 0.0f, -200.0f, -89.7f, -200.0f, -200.0f)
                reflectiveCurveTo(137.7f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.7f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(365.8f, 309.6f)
                curveToRelative(-10.2f, -8.5f, -25.3f, -7.1f, -33.8f, 3.1f)
                curveToRelative(-20.8f, 25.0f, -51.5f, 39.4f, -84.0f, 39.4f)
                reflectiveCurveToRelative(-63.2f, -14.3f, -84.0f, -39.4f)
                curveToRelative(-8.5f, -10.2f, -23.7f, -11.5f, -33.8f, -3.1f)
                curveToRelative(-10.2f, 8.5f, -11.5f, 23.6f, -3.1f, 33.8f)
                curveToRelative(30.0f, 36.0f, 74.1f, 56.6f, 120.9f, 56.6f)
                reflectiveCurveToRelative(90.9f, -20.6f, 120.9f, -56.6f)
                curveToRelative(8.5f, -10.2f, 7.1f, -25.3f, -3.1f, -33.8f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(328.0f, 180.0f)
                curveToRelative(-25.7f, 0.0f, -55.9f, 16.9f, -59.9f, 42.1f)
                curveToRelative(-1.7f, 11.2f, 11.5f, 18.2f, 19.8f, 10.8f)
                lineToRelative(9.5f, -8.5f)
                curveToRelative(14.8f, -13.2f, 46.2f, -13.2f, 61.0f, 0.0f)
                lineToRelative(9.5f, 8.5f)
                curveToRelative(8.5f, 7.4f, 21.6f, 0.3f, 19.8f, -10.8f)
                curveToRelative(-3.8f, -25.2f, -34.0f, -42.1f, -59.7f, -42.1f)
                close()
            }
        }
        .build()
        return _smileWink!!
    }

private var _smileWink: ImageVector? = null
