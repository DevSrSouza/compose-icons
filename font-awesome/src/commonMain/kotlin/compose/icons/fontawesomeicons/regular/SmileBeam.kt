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

public val RegularGroup.SmileBeam: ImageVector
    get() {
        if (_smileBeam != null) {
            return _smileBeam!!
        }
        _smileBeam = Builder(name = "SmileBeam", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(332.0f, 312.6f)
                curveToRelative(-20.8f, 25.0f, -51.5f, 39.4f, -84.0f, 39.4f)
                reflectiveCurveToRelative(-63.2f, -14.3f, -84.0f, -39.4f)
                curveToRelative(-8.5f, -10.2f, -23.6f, -11.5f, -33.8f, -3.1f)
                curveToRelative(-10.2f, 8.5f, -11.5f, 23.6f, -3.1f, 33.8f)
                curveToRelative(30.0f, 36.0f, 74.1f, 56.6f, 120.9f, 56.6f)
                reflectiveCurveToRelative(90.9f, -20.6f, 120.9f, -56.6f)
                curveToRelative(8.5f, -10.2f, 7.1f, -25.3f, -3.1f, -33.8f)
                curveToRelative(-10.2f, -8.4f, -25.3f, -7.1f, -33.8f, 3.1f)
                close()
                moveTo(136.5f, 211.0f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17.0f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6.0f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56.0f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56.0f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                curveToRelative(3.4f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17.0f)
                close()
                moveTo(328.0f, 152.0f)
                curveToRelative(-23.8f, 0.0f, -52.7f, 29.3f, -56.0f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                curveToRelative(3.5f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17.0f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17.0f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6.0f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56.0f, -71.4f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
