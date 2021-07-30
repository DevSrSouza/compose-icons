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

public val SolidGroup.GrinBeam: ImageVector
    get() {
        if (_grinBeam != null) {
            return _grinBeam!!
        }
        _grinBeam = Builder(name = "GrinBeam", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(328.0f, 152.0f)
                curveToRelative(23.8f, 0.0f, 52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.1f, 7.3f, -15.6f, 4.0f, -14.9f, -4.5f)
                curveToRelative(3.1f, -42.1f, 32.0f, -71.4f, 55.8f, -71.4f)
                close()
                moveTo(168.0f, 152.0f)
                curveToRelative(23.8f, 0.0f, 52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.7f, 8.6f, -10.8f, 11.9f, -14.9f, 4.5f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.2f, 7.4f, -15.6f, 4.0f, -14.9f, -4.5f)
                curveToRelative(3.1f, -42.1f, 32.0f, -71.4f, 55.8f, -71.4f)
                close()
                moveTo(248.0f, 432.0f)
                curveToRelative(-60.6f, 0.0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2.0f, -11.9f, 9.4f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55.0f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }
        .build()
        return _grinBeam!!
    }

private var _grinBeam: ImageVector? = null
