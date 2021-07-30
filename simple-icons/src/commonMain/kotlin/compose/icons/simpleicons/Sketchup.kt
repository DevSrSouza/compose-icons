package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sketchup: ImageVector
    get() {
        if (_sketchup != null) {
            return _sketchup!!
        }
        _sketchup = Builder(name = "Sketchup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.968f, 9.027f)
                lineToRelative(7.717f, 4.428f)
                lineToRelative(-0.006f, 1.32f)
                lineToRelative(-4.39f, -2.518f)
                lineToRelative(-2.763f, 1.57f)
                lineToRelative(7.148f, 4.12f)
                lineToRelative(0.005f, 1.27f)
                lineToRelative(-7.658f, -4.405f)
                curveToRelative(0.02f, 0.516f, 0.488f, 2.106f, 1.383f, 3.337f)
                curveToRelative(0.91f, 1.247f, 1.946f, 1.776f, 1.946f, 1.776f)
                lineTo(11.428f, 24.0f)
                lineTo(11.428f, 11.849f)
                lineTo(0.975f, 5.846f)
                close()
                moveTo(23.032f, 5.227f)
                lineTo(15.22f, 0.723f)
                reflectiveCurveTo(13.982f, 0.0f, 12.008f, 0.0f)
                curveTo(9.952f, 0.0f, 8.76f, 0.746f, 8.76f, 0.746f)
                lineToRelative(-7.236f, 4.14f)
                lineToRelative(11.009f, 6.328f)
                lineTo(12.533f, 24.0f)
                lineToRelative(7.245f, -4.136f)
                reflectiveCurveToRelative(1.295f, -0.715f, 2.279f, -2.414f)
                curveToRelative(0.867f, -1.496f, 0.975f, -2.943f, 0.975f, -2.943f)
                close()
                moveTo(11.251f, 7.308f)
                reflectiveCurveToRelative(1.615f, -0.298f, 2.98f, 0.49f)
                lineToRelative(2.171f, 1.25f)
                reflectiveCurveToRelative(0.003f, 1.097f, 0.003f, 2.736f)
                curveToRelative(0.0f, 1.313f, -1.112f, 2.674f, -1.112f, 2.674f)
                lineToRelative(0.002f, -4.816f)
                close()
                moveTo(17.653f, 17.87f)
                lineToRelative(-2.358f, 1.353f)
                verticalLineToRelative(-1.269f)
                lineToRelative(1.835f, -1.05f)
                curveToRelative(1.748f, -1.26f, 2.037f, -3.117f, 2.037f, -3.761f)
                lineToRelative(-0.007f, -5.705f)
                lineToRelative(-5.006f, -2.881f)
                reflectiveCurveToRelative(-0.76f, -0.499f, -2.129f, -0.499f)
                curveToRelative(-1.367f, 0.0f, -2.113f, 0.461f, -2.113f, 0.461f)
                lineTo(8.154f, 5.53f)
                lineToRelative(-1.11f, -0.641f)
                lineTo(9.473f, 3.5f)
                reflectiveCurveToRelative(0.95f, -0.527f, 2.544f, -0.527f)
                curveToRelative(1.462f, 0.0f, 2.6f, 0.571f, 2.6f, 0.571f)
                lineTo(20.27f, 6.81f)
                lineToRelative(-0.007f, 6.226f)
                curveToRelative(0.04f, 0.957f, -0.406f, 3.296f, -2.61f, 4.835f)
                close()
            }
        }
        .build()
        return _sketchup!!
    }

private var _sketchup: ImageVector? = null
