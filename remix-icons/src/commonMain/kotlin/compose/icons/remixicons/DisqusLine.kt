package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DisqusLine: ImageVector
    get() {
        if (_disqusLine != null) {
            return _disqusLine!!
        }
        _disqusLine = Builder(name = "DisqusLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                curveToRelative(-2.306f, 0.0f, -4.492f, -0.784f, -6.249f, -2.192f)
                lineToRelative(-4.718f, 0.59f)
                lineToRelative(1.72f, -4.586f)
                curveTo(2.207f, 14.614f, 1.95f, 13.324f, 1.95f, 12.0f)
                curveToRelative(0.0f, -5.523f, 4.477f, -10.0f, 10.0f, -10.0f)
                close()
                moveTo(11.95f, 4.0f)
                curveToRelative(-4.418f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                curveToRelative(0.0f, 1.178f, 0.254f, 2.318f, 0.738f, 3.362f)
                lineToRelative(0.176f, 0.38f)
                lineToRelative(-0.847f, 2.26f)
                lineToRelative(2.315f, -0.289f)
                lineToRelative(0.338f, 0.297f)
                curveTo(8.12f, 19.286f, 9.978f, 20.0f, 11.95f, 20.0f)
                curveToRelative(4.418f, 0.0f, 8.0f, -3.582f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.582f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(8.0f, 7.0f)
                horizontalLineToRelative(3.79f)
                curveToRelative(3.42f, 0.0f, 5.44f, 1.956f, 5.54f, 4.729f)
                lineToRelative(0.003f, 0.215f)
                verticalLineToRelative(0.027f)
                curveToRelative(0.0f, 2.814f, -1.962f, 4.922f, -5.337f, 5.025f)
                lineToRelative(-0.263f, 0.004f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(3.79f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(11.831f, 9.458f)
                horizontalLineToRelative(-1.108f)
                verticalLineToRelative(5.085f)
                horizontalLineToRelative(1.108f)
                curveToRelative(1.566f, 0.0f, 2.625f, -0.845f, 2.704f, -2.345f)
                lineToRelative(0.005f, -0.183f)
                verticalLineToRelative(-0.028f)
                curveToRelative(0.0f, -1.6f, -1.08f, -2.53f, -2.709f, -2.53f)
                close()
            }
        }
        .build()
        return _disqusLine!!
    }

private var _disqusLine: ImageVector? = null
