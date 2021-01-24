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

public val RegularGroup.GrinSquint: ImageVector
    get() {
        if (_grinSquint != null) {
            return _grinSquint!!
        }
        _grinSquint = Builder(name = "GrinSquint", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
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
                curveToRelative(-9.9f, -3.1f, -19.4f, 5.4f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.1f, 71.3f, 80.0f, 123.3f, 80.0f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80.0f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveTo(118.9f, 263.8f)
                curveToRelative(3.6f, 4.2f, 9.9f, 5.7f, 15.3f, 2.5f)
                lineToRelative(80.0f, -48.0f)
                curveToRelative(3.6f, -2.2f, 5.8f, -6.1f, 5.8f, -10.3f)
                reflectiveCurveToRelative(-2.2f, -8.1f, -5.8f, -10.3f)
                lineToRelative(-80.0f, -48.0f)
                curveToRelative(-5.1f, -3.0f, -11.4f, -1.9f, -15.3f, 2.5f)
                curveToRelative(-3.8f, 4.5f, -3.8f, 11.0f, -0.1f, 15.5f)
                lineToRelative(33.6f, 40.3f)
                lineToRelative(-33.6f, 40.3f)
                curveToRelative(-3.8f, 4.5f, -3.7f, 11.1f, 0.1f, 15.5f)
                close()
                moveTo(361.8f, 266.3f)
                curveToRelative(5.4f, 3.2f, 11.7f, 1.7f, 15.3f, -2.5f)
                curveToRelative(3.8f, -4.5f, 3.8f, -11.0f, 0.1f, -15.5f)
                lineTo(343.6f, 208.0f)
                lineToRelative(33.6f, -40.3f)
                curveToRelative(3.8f, -4.5f, 3.7f, -11.0f, -0.1f, -15.5f)
                curveToRelative(-3.8f, -4.4f, -10.2f, -5.4f, -15.3f, -2.5f)
                lineToRelative(-80.0f, 48.0f)
                curveToRelative(-3.6f, 2.2f, -5.8f, 6.1f, -5.8f, 10.3f)
                reflectiveCurveToRelative(2.2f, 8.1f, 5.8f, 10.3f)
                lineToRelative(80.0f, 48.0f)
                close()
            }
        }
        .build()
        return _grinSquint!!
    }

private var _grinSquint: ImageVector? = null
