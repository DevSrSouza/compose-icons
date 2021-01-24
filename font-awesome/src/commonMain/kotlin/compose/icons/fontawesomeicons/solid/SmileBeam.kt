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

public val SolidGroup.SmileBeam: ImageVector
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
                moveTo(112.0f, 223.4f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56.0f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.3f, 7.4f, -15.8f, 4.0f, -15.1f, -4.5f)
                close()
                moveTo(362.8f, 346.2f)
                curveTo(334.3f, 380.4f, 292.5f, 400.0f, 248.0f, 400.0f)
                reflectiveCurveToRelative(-86.3f, -19.6f, -114.8f, -53.8f)
                curveToRelative(-13.5f, -16.3f, 11.0f, -36.7f, 24.6f, -20.5f)
                curveToRelative(22.4f, 26.9f, 55.2f, 42.2f, 90.2f, 42.2f)
                reflectiveCurveToRelative(67.8f, -15.4f, 90.2f, -42.2f)
                curveToRelative(13.6f, -16.2f, 38.1f, 4.3f, 24.6f, 20.5f)
                close()
                moveTo(369.0f, 227.9f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.1f, 7.3f, -15.6f, 4.0f, -14.9f, -4.5f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56.0f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.6f, 8.6f, -11.0f, 11.9f, -15.1f, 4.5f)
                close()
            }
        }
        .build()
        return _smileBeam!!
    }

private var _smileBeam: ImageVector? = null
