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

public val RegularGroup.Kiss: ImageVector
    get() {
        if (_kiss != null) {
            return _kiss!!
        }
        _kiss = Builder(name = "Kiss", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(304.0f, 308.0f)
                curveToRelative(0.0f, -19.2f, -28.8f, -41.5f, -71.5f, -44.0f)
                curveToRelative(-3.8f, -0.4f, -7.4f, 2.4f, -8.2f, 6.2f)
                curveToRelative(-0.9f, 3.8f, 1.1f, 7.7f, 4.7f, 9.2f)
                lineToRelative(16.9f, 7.2f)
                curveToRelative(13.0f, 5.5f, 20.8f, 13.5f, 20.8f, 21.5f)
                reflectiveCurveToRelative(-7.8f, 16.0f, -20.7f, 21.5f)
                lineToRelative(-17.0f, 7.2f)
                curveToRelative(-5.7f, 2.4f, -6.0f, 12.2f, 0.0f, 14.8f)
                lineToRelative(16.9f, 7.2f)
                curveToRelative(13.0f, 5.5f, 20.8f, 13.5f, 20.8f, 21.5f)
                reflectiveCurveToRelative(-7.8f, 16.0f, -20.7f, 21.5f)
                lineToRelative(-17.0f, 7.2f)
                curveToRelative(-3.6f, 1.5f, -5.6f, 5.4f, -4.7f, 9.2f)
                curveToRelative(0.8f, 3.6f, 4.1f, 6.2f, 7.8f, 6.2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(42.8f, -2.5f, 71.5f, -24.8f, 71.5f, -44.0f)
                curveToRelative(0.0f, -13.0f, -13.4f, -27.3f, -35.2f, -36.0f)
                curveTo(290.6f, 335.3f, 304.0f, 321.0f, 304.0f, 308.0f)
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
                moveTo(328.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _kiss!!
    }

private var _kiss: ImageVector? = null
