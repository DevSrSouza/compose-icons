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

public val RegularGroup.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                curveToRelative(7.9f, 47.2f, 71.3f, 80.0f, 123.3f, 80.0f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80.0f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveTo(125.7f, 247.1f)
                curveToRelative(-1.0f, 6.2f, 5.4f, 11.0f, 11.0f, 7.9f)
                lineToRelative(31.3f, -16.3f)
                lineToRelative(31.3f, 16.3f)
                curveToRelative(5.6f, 3.1f, 12.0f, -1.7f, 11.0f, -7.9f)
                lineToRelative(-6.0f, -34.9f)
                lineToRelative(25.4f, -24.6f)
                curveToRelative(4.5f, -4.5f, 1.9f, -12.2f, -4.3f, -13.2f)
                lineToRelative(-34.9f, -5.0f)
                lineToRelative(-15.5f, -31.6f)
                curveToRelative(-2.9f, -5.8f, -11.0f, -5.8f, -13.9f, 0.0f)
                lineToRelative(-15.5f, 31.6f)
                lineToRelative(-34.9f, 5.0f)
                curveToRelative(-6.2f, 0.9f, -8.9f, 8.6f, -4.3f, 13.2f)
                lineToRelative(25.4f, 24.6f)
                lineToRelative(-6.1f, 34.9f)
                close()
                moveTo(385.4f, 174.4f)
                lineToRelative(-34.9f, -5.0f)
                lineToRelative(-15.5f, -31.6f)
                curveToRelative(-2.9f, -5.8f, -11.0f, -5.8f, -13.9f, 0.0f)
                lineToRelative(-15.5f, 31.6f)
                lineToRelative(-34.9f, 5.0f)
                curveToRelative(-6.2f, 0.9f, -8.9f, 8.6f, -4.3f, 13.2f)
                lineToRelative(25.4f, 24.6f)
                lineToRelative(-6.0f, 34.9f)
                curveToRelative(-1.0f, 6.2f, 5.4f, 11.0f, 11.0f, 7.9f)
                lineToRelative(31.3f, -16.3f)
                lineToRelative(31.3f, 16.3f)
                curveToRelative(5.6f, 3.1f, 12.0f, -1.7f, 11.0f, -7.9f)
                lineToRelative(-6.0f, -34.9f)
                lineToRelative(25.4f, -24.6f)
                curveToRelative(4.5f, -4.6f, 1.8f, -12.2f, -4.4f, -13.2f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
