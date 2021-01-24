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

public val RegularGroup.GrinHearts: ImageVector
    get() {
        if (_grinHearts != null) {
            return _grinHearts!!
        }
        _grinHearts = Builder(name = "GrinHearts", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(353.6f, 304.6f)
                curveToRelative(-25.9f, 8.3f, -64.4f, 13.1f, -105.6f, 13.1f)
                reflectiveCurveToRelative(-79.6f, -4.8f, -105.6f, -13.1f)
                curveToRelative(-9.8f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(7.9f, 47.2f, 71.3f, 80.0f, 123.3f, 80.0f)
                reflectiveCurveToRelative(115.3f, -32.9f, 123.3f, -80.0f)
                curveToRelative(1.6f, -9.8f, -7.7f, -18.4f, -17.7f, -15.3f)
                close()
                moveTo(200.8f, 255.7f)
                curveToRelative(4.5f, 1.2f, 9.2f, -1.5f, 10.5f, -6.0f)
                lineToRelative(19.4f, -69.9f)
                curveToRelative(5.6f, -20.3f, -7.4f, -41.1f, -28.8f, -44.5f)
                curveToRelative(-18.6f, -3.0f, -36.4f, 9.8f, -41.5f, 27.9f)
                lineToRelative(-2.0f, 7.1f)
                lineToRelative(-7.1f, -1.9f)
                curveToRelative(-18.2f, -4.7f, -38.2f, 4.3f, -44.9f, 22.0f)
                curveToRelative(-7.7f, 20.2f, 3.8f, 41.9f, 24.2f, 47.2f)
                lineToRelative(70.2f, 18.1f)
                close()
                moveTo(389.6f, 190.4f)
                curveToRelative(-6.7f, -17.6f, -26.7f, -26.7f, -44.9f, -22.0f)
                lineToRelative(-7.1f, 1.9f)
                lineToRelative(-2.0f, -7.1f)
                curveToRelative(-5.0f, -18.1f, -22.8f, -30.9f, -41.5f, -27.9f)
                curveToRelative(-21.4f, 3.4f, -34.4f, 24.2f, -28.8f, 44.5f)
                lineToRelative(19.4f, 69.9f)
                curveToRelative(1.2f, 4.5f, 5.9f, 7.2f, 10.5f, 6.0f)
                lineToRelative(70.2f, -18.2f)
                curveToRelative(20.4f, -5.3f, 31.9f, -26.9f, 24.2f, -47.1f)
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
            }
        }
        .build()
        return _grinHearts!!
    }

private var _grinHearts: ImageVector? = null
