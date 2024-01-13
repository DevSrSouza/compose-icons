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

public val RegularGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.7f, 98.7f)
                curveToRelative(-21.0f, 34.1f, -33.1f, 74.3f, -33.1f, 117.3f)
                curveToRelative(0.0f, 98.0f, 62.8f, 181.4f, 150.4f, 211.7f)
                curveToRelative(-12.4f, 2.8f, -25.3f, 4.3f, -38.6f, 4.3f)
                curveTo(126.6f, 432.0f, 48.0f, 353.3f, 48.0f, 256.0f)
                curveToRelative(0.0f, -68.9f, 39.4f, -128.4f, 96.8f, -157.3f)
                close()
                moveTo(206.8f, 32.7f)
                curveTo(91.1f, 41.2f, 0.0f, 137.9f, 0.0f, 256.0f)
                curveTo(0.0f, 379.7f, 100.0f, 480.0f, 223.5f, 480.0f)
                curveToRelative(47.8f, 0.0f, 92.0f, -15.0f, 128.4f, -40.6f)
                curveToRelative(1.9f, -1.3f, 3.7f, -2.7f, 5.5f, -4.0f)
                curveToRelative(4.8f, -3.6f, 9.4f, -7.4f, 13.9f, -11.4f)
                curveToRelative(2.7f, -2.4f, 5.3f, -4.8f, 7.9f, -7.3f)
                curveToRelative(5.0f, -4.9f, 6.3f, -12.5f, 3.1f, -18.7f)
                reflectiveCurveToRelative(-10.1f, -9.7f, -17.0f, -8.5f)
                curveToRelative(-3.7f, 0.6f, -7.4f, 1.2f, -11.1f, 1.6f)
                curveToRelative(-5.0f, 0.5f, -10.1f, 0.9f, -15.3f, 1.0f)
                curveToRelative(-1.2f, 0.0f, -2.5f, 0.0f, -3.7f, 0.0f)
                curveToRelative(-0.1f, 0.0f, -0.2f, 0.0f, -0.3f, 0.0f)
                curveToRelative(-96.8f, -0.2f, -175.2f, -78.9f, -175.2f, -176.0f)
                curveToRelative(0.0f, -54.8f, 24.9f, -103.7f, 64.1f, -136.0f)
                curveToRelative(1.0f, -0.9f, 2.1f, -1.7f, 3.2f, -2.6f)
                curveToRelative(4.0f, -3.2f, 8.2f, -6.2f, 12.5f, -9.0f)
                curveToRelative(3.1f, -2.0f, 6.3f, -4.0f, 9.6f, -5.8f)
                curveToRelative(6.1f, -3.5f, 9.2f, -10.5f, 7.7f, -17.3f)
                reflectiveCurveToRelative(-7.3f, -11.9f, -14.3f, -12.5f)
                curveToRelative(-3.6f, -0.3f, -7.1f, -0.5f, -10.7f, -0.6f)
                curveToRelative(-2.7f, -0.1f, -5.5f, -0.1f, -8.2f, -0.1f)
                curveToRelative(-3.3f, 0.0f, -6.5f, 0.1f, -9.8f, 0.2f)
                curveToRelative(-2.3f, 0.1f, -4.6f, 0.2f, -6.9f, 0.4f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
