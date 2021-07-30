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

public val RegularGroup.GrinAlt: ImageVector
    get() {
        if (_grinAlt != null) {
            return _grinAlt!!
        }
        _grinAlt = Builder(name = "GrinAlt", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.3f, 248.0f)
                curveToRelative(12.4f, -18.7f, 15.1f, -37.3f, 15.7f, -56.0f)
                curveToRelative(-0.5f, -18.7f, -3.3f, -37.3f, -15.7f, -56.0f)
                curveToRelative(-8.0f, -12.0f, -25.1f, -11.4f, -32.7f, 0.0f)
                curveToRelative(-12.4f, 18.7f, -15.1f, 37.3f, -15.7f, 56.0f)
                curveToRelative(0.5f, 18.7f, 3.3f, 37.3f, 15.7f, 56.0f)
                curveToRelative(8.1f, 12.0f, 25.2f, 11.4f, 32.7f, 0.0f)
                close()
                moveTo(328.3f, 248.0f)
                curveToRelative(12.4f, -18.7f, 15.1f, -37.3f, 15.7f, -56.0f)
                curveToRelative(-0.5f, -18.7f, -3.3f, -37.3f, -15.7f, -56.0f)
                curveToRelative(-8.0f, -12.0f, -25.1f, -11.4f, -32.7f, 0.0f)
                curveToRelative(-12.4f, 18.7f, -15.1f, 37.3f, -15.7f, 56.0f)
                curveToRelative(0.5f, 18.7f, 3.3f, 37.3f, 15.7f, 56.0f)
                curveToRelative(8.1f, 12.0f, 25.2f, 11.4f, 32.7f, 0.0f)
                close()
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
                curveToRelative(-9.9f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.2f, 71.3f, 80.0f, 123.3f, 80.0f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80.0f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
            }
        }
        .build()
        return _grinAlt!!
    }

private var _grinAlt: ImageVector? = null
