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

public val RegularGroup.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(248.0f, 312.0f)
                curveToRelative(-33.6f, 0.0f, -65.2f, 14.8f, -86.8f, 40.6f)
                curveToRelative(-8.5f, 10.2f, -7.1f, 25.3f, 3.1f, 33.8f)
                reflectiveCurveToRelative(25.3f, 7.2f, 33.8f, -3.0f)
                curveToRelative(24.8f, -29.7f, 75.0f, -29.7f, 99.8f, 0.0f)
                curveToRelative(8.1f, 9.7f, 23.2f, 11.9f, 33.8f, 3.0f)
                curveToRelative(10.2f, -8.5f, 11.5f, -23.6f, 3.1f, -33.8f)
                curveToRelative(-21.6f, -25.8f, -53.2f, -40.6f, -86.8f, -40.6f)
                close()
                moveTo(200.0f, 240.0f)
                curveToRelative(10.3f, 0.0f, 19.9f, -6.7f, 23.0f, -17.1f)
                curveToRelative(3.8f, -12.7f, -3.4f, -26.1f, -16.1f, -29.9f)
                lineToRelative(-80.0f, -24.0f)
                curveToRelative(-12.8f, -3.9f, -26.1f, 3.4f, -29.9f, 16.1f)
                curveToRelative(-3.8f, 12.7f, 3.4f, 26.1f, 16.1f, 29.9f)
                lineToRelative(28.2f, 8.5f)
                curveToRelative(-3.1f, 4.9f, -5.3f, 10.4f, -5.3f, 16.6f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.4f, 32.0f, -32.1f)
                close()
                moveTo(399.0f, 185.1f)
                curveToRelative(-3.8f, -12.7f, -17.1f, -19.9f, -29.9f, -16.1f)
                lineToRelative(-80.0f, 24.0f)
                curveToRelative(-12.7f, 3.8f, -19.9f, 17.2f, -16.1f, 29.9f)
                curveToRelative(3.1f, 10.4f, 12.7f, 17.1f, 23.0f, 17.1f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                curveToRelative(0.0f, -6.2f, -2.2f, -11.7f, -5.3f, -16.6f)
                lineToRelative(28.2f, -8.5f)
                curveToRelative(12.7f, -3.7f, 19.9f, -17.1f, 16.1f, -29.8f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
