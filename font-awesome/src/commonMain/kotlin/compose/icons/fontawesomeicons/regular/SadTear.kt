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

public val RegularGroup.SadTear: ImageVector
    get() {
        if (_sadTear != null) {
            return _sadTear!!
        }
        _sadTear = Builder(name = "SadTear", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(256.0f, 304.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, 10.8f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.8f, 24.0f, 24.0f, 24.0f)
                curveToRelative(23.8f, 0.0f, 46.3f, 10.5f, 61.6f, 28.8f)
                curveToRelative(8.1f, 9.8f, 23.2f, 11.9f, 33.8f, 3.1f)
                curveToRelative(10.2f, -8.5f, 11.6f, -23.6f, 3.1f, -33.8f)
                curveTo(330.0f, 320.8f, 294.1f, 304.0f, 256.0f, 304.0f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(328.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(162.4f, 274.8f)
                curveTo(151.0f, 290.1f, 126.0f, 325.4f, 126.0f, 342.9f)
                curveToRelative(0.0f, 22.7f, 18.8f, 41.1f, 42.0f, 41.1f)
                reflectiveCurveToRelative(42.0f, -18.4f, 42.0f, -41.1f)
                curveToRelative(0.0f, -17.5f, -25.0f, -52.8f, -36.4f, -68.1f)
                curveToRelative(-2.8f, -3.7f, -8.4f, -3.7f, -11.2f, 0.0f)
                close()
            }
        }
        .build()
        return _sadTear!!
    }

private var _sadTear: ImageVector? = null
