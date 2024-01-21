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

public val RegularGroup.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(123.6f, 391.3f)
                curveToRelative(12.9f, -9.4f, 29.6f, -11.8f, 44.6f, -6.4f)
                curveToRelative(26.5f, 9.6f, 56.2f, 15.1f, 87.8f, 15.1f)
                curveToRelative(124.7f, 0.0f, 208.0f, -80.5f, 208.0f, -160.0f)
                reflectiveCurveToRelative(-83.3f, -160.0f, -208.0f, -160.0f)
                reflectiveCurveTo(48.0f, 160.5f, 48.0f, 240.0f)
                curveToRelative(0.0f, 32.0f, 12.4f, 62.8f, 35.7f, 89.2f)
                curveToRelative(8.6f, 9.7f, 12.8f, 22.5f, 11.8f, 35.5f)
                curveToRelative(-1.4f, 18.1f, -5.7f, 34.7f, -11.3f, 49.4f)
                curveToRelative(17.0f, -7.9f, 31.1f, -16.7f, 39.4f, -22.7f)
                close()
                moveTo(21.2f, 431.9f)
                curveToRelative(1.8f, -2.7f, 3.5f, -5.4f, 5.1f, -8.1f)
                curveToRelative(10.0f, -16.6f, 19.5f, -38.4f, 21.4f, -62.9f)
                curveTo(17.7f, 326.8f, 0.0f, 285.1f, 0.0f, 240.0f)
                curveTo(0.0f, 125.1f, 114.6f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(256.0f, 93.1f, 256.0f, 208.0f)
                reflectiveCurveToRelative(-114.6f, 208.0f, -256.0f, 208.0f)
                curveToRelative(-37.1f, 0.0f, -72.3f, -6.4f, -104.1f, -17.9f)
                curveToRelative(-11.9f, 8.7f, -31.3f, 20.6f, -54.3f, 30.6f)
                curveToRelative(-15.1f, 6.6f, -32.3f, 12.6f, -50.1f, 16.1f)
                curveToRelative(-0.8f, 0.2f, -1.6f, 0.3f, -2.4f, 0.5f)
                curveToRelative(-4.4f, 0.8f, -8.7f, 1.5f, -13.2f, 1.9f)
                curveToRelative(-0.2f, 0.0f, -0.5f, 0.1f, -0.7f, 0.1f)
                curveToRelative(-5.1f, 0.5f, -10.2f, 0.8f, -15.3f, 0.8f)
                curveToRelative(-6.5f, 0.0f, -12.3f, -3.9f, -14.8f, -9.9f)
                curveToRelative(-2.5f, -6.0f, -1.1f, -12.8f, 3.4f, -17.4f)
                curveToRelative(4.1f, -4.2f, 7.8f, -8.7f, 11.3f, -13.5f)
                curveToRelative(1.7f, -2.3f, 3.3f, -4.6f, 4.8f, -6.9f)
                curveToRelative(0.1f, -0.2f, 0.2f, -0.3f, 0.3f, -0.5f)
                close()
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
