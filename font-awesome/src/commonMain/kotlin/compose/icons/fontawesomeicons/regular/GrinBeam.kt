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

public val RegularGroup.GrinBeam: ImageVector
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
                moveTo(248.0f, 456.0f)
                curveToRelative(-110.3f, 0.0f, -200.0f, -89.7f, -200.0f, -200.0f)
                reflectiveCurveTo(137.7f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.7f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(353.6f, 304.6f)
                curveToRelative(-25.9f, 8.3f, -64.4f, 13.1f, -105.6f, 13.1f)
                reflectiveCurveToRelative(-79.6f, -4.8f, -105.6f, -13.1f)
                curveToRelative(-9.8f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.1f, 71.3f, 80.0f, 123.3f, 80.0f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80.0f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveTo(117.7f, 231.7f)
                curveToRelative(3.5f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17.0f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17.0f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6.0f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56.0f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56.0f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                close()
                moveTo(277.7f, 231.7f)
                curveToRelative(3.5f, 1.1f, 7.4f, -0.5f, 9.3f, -3.7f)
                lineToRelative(9.5f, -17.0f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17.0f)
                curveToRelative(2.1f, 3.7f, 6.2f, 4.7f, 9.3f, 3.7f)
                curveToRelative(3.6f, -1.1f, 6.0f, -4.5f, 5.7f, -8.3f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56.0f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56.0f, 71.4f)
                curveToRelative(-0.3f, 3.7f, 2.1f, 7.2f, 5.7f, 8.3f)
                close()
            }
        }
        .build()
        return _grinBeam!!
    }

private var _grinBeam: ImageVector? = null
