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

public val SimpleIcons.Mediamarkt: ImageVector
    get() {
        if (_mediamarkt != null) {
            return _mediamarkt!!
        }
        _mediamarkt = Builder(name = "Mediamarkt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.829f, 22.075f)
                curveToRelative(-0.064f, 0.192f, 2.63f, -2.76f, 2.63f, -2.76f)
                curveToRelative(-0.256f, -2.759f, -1.54f, -5.775f, -1.54f, -5.775f)
                curveToRelative(-2.117f, -4.428f, -6.801f, -5.904f, -9.56f, -3.53f)
                curveToRelative(-0.129f, 0.065f, -0.322f, 0.129f, -0.45f, 0.193f)
                curveToRelative(2.118f, -2.952f, 6.93f, -2.695f, 10.075f, 0.963f)
                curveToRelative(0.0f, 0.0f, 1.412f, 1.732f, 2.438f, 4.363f)
                curveToRelative(0.257f, -0.898f, 0.45f, -1.86f, 0.514f, -2.823f)
                curveToRelative(-1.669f, -2.31f, -3.594f, -3.658f, -3.594f, -3.658f)
                curveToRelative(-3.978f, -2.695f, -8.663f, -1.732f, -9.946f, 1.604f)
                curveToRelative(-0.129f, 0.193f, -0.257f, 0.385f, -0.321f, 0.578f)
                curveToRelative(0.385f, -3.594f, 4.684f, -5.84f, 9.176f, -4.3f)
                curveToRelative(0.0f, 0.0f, 2.182f, 0.835f, 4.428f, 2.631f)
                curveToRelative(0.0f, -0.128f, -0.064f, -0.256f, -0.128f, -0.449f)
                curveToRelative(-0.257f, -0.962f, -0.578f, -1.86f, -1.027f, -2.695f)
                curveToRelative(-2.567f, -1.155f, -4.877f, -1.347f, -4.877f, -1.347f)
                curveToRelative(-4.877f, -0.321f, -8.535f, 3.08f, -7.765f, 6.802f)
                verticalLineToRelative(0.513f)
                curveToRelative(-1.668f, -3.337f, 0.963f, -7.636f, 5.776f, -8.535f)
                curveToRelative(0.0f, 0.0f, 2.246f, -0.385f, 5.005f, 0.0f)
                arcToRelative(11.844f, 11.844f, 0.0f, false, false, -2.374f, -1.989f)
                curveToRelative(-2.76f, 0.32f, -4.813f, 1.283f, -4.813f, 1.283f)
                curveToRelative(-4.428f, 2.182f, -5.84f, 7.06f, -3.401f, 9.819f)
                curveToRelative(0.064f, 0.192f, 0.192f, 0.32f, 0.32f, 0.449f)
                curveToRelative(-3.08f, -2.054f, -2.887f, -7.123f, 0.77f, -10.396f)
                curveToRelative(0.0f, 0.0f, 1.733f, -1.476f, 4.3f, -2.503f)
                curveTo(14.375f, 0.193f, 13.283f, 0.0f, 12.193f, 0.0f)
                curveTo(10.01f, 1.668f, 8.79f, 3.465f, 8.79f, 3.465f)
                curveToRelative(-2.759f, 4.171f, -1.604f, 9.113f, 1.99f, 10.268f)
                horizontalLineToRelative(0.064f)
                curveToRelative(0.128f, 0.064f, 0.192f, 0.128f, 0.32f, 0.192f)
                curveToRelative(-3.657f, -0.192f, -6.031f, -4.684f, -4.427f, -9.369f)
                curveToRelative(0.0f, 0.0f, 0.77f, -2.053f, 2.374f, -4.171f)
                curveToRelative(-0.962f, 0.257f, -1.796f, 0.578f, -2.63f, 1.09f)
                curveToRelative(-1.027f, 2.568f, -1.284f, 4.75f, -1.284f, 4.75f)
                curveToRelative(-0.321f, 4.94f, 3.016f, 8.599f, 6.61f, 7.893f)
                horizontalLineTo(12.0f)
                curveToRelative(0.128f, 0.0f, 0.257f, 0.0f, 0.385f, -0.065f)
                curveToRelative(-3.273f, 1.669f, -7.444f, -1.026f, -8.406f, -5.903f)
                curveToRelative(0.0f, 0.0f, -0.385f, -2.182f, 0.0f, -4.941f)
                curveToRelative(-0.77f, 0.77f, -1.476f, 1.604f, -2.054f, 2.63f)
                curveToRelative(0.321f, 2.696f, 1.284f, 4.685f, 1.284f, 4.685f)
                curveToRelative(2.181f, 4.492f, 6.994f, 5.968f, 9.754f, 3.401f)
                lineToRelative(0.064f, -0.064f)
                curveToRelative(0.128f, -0.064f, 0.256f, -0.128f, 0.32f, -0.257f)
                curveToRelative(-1.989f, 3.145f, -6.994f, 3.016f, -10.203f, -0.77f)
                curveToRelative(0.0f, 0.0f, -1.604f, -2.117f, -2.438f, -4.556f)
                curveToRelative(0.0f, -0.064f, -0.642f, 3.209f, -0.642f, 3.209f)
                curveToRelative(1.604f, 1.925f, 3.658f, 3.529f, 3.658f, 3.529f)
                curveToRelative(3.979f, 2.695f, 8.663f, 1.668f, 9.946f, -1.668f)
                arcToRelative(1.39f, 1.39f, 0.0f, false, false, 0.321f, -0.514f)
                curveToRelative(-0.385f, 3.594f, -4.684f, 5.84f, -9.176f, 4.236f)
                curveToRelative(0.0f, 0.0f, -1.99f, -0.77f, -4.107f, -2.439f)
                curveToRelative(0.0f, 0.064f, 0.064f, 0.193f, 0.064f, 0.257f)
                arcToRelative(15.14f, 15.14f, 0.0f, false, false, 1.091f, 2.823f)
                curveToRelative(2.438f, 1.027f, 4.62f, 1.22f, 4.62f, 1.22f)
                curveToRelative(4.877f, 0.32f, 8.47f, -3.08f, 7.765f, -6.674f)
                verticalLineToRelative(-0.514f)
                curveToRelative(1.54f, 3.337f, -1.09f, 7.508f, -5.84f, 8.47f)
                curveToRelative(0.0f, 0.0f, -2.117f, 0.386f, -4.748f, 0.0f)
                arcToRelative(11.229f, 11.229f, 0.0f, false, false, 2.117f, 1.798f)
                curveToRelative(2.76f, -0.321f, 4.813f, -1.284f, 4.813f, -1.284f)
                curveToRelative(4.3f, -2.117f, 5.776f, -6.802f, 3.53f, -9.625f)
                curveToRelative(-0.065f, -0.193f, -0.193f, -0.385f, -0.321f, -0.578f)
                curveToRelative(2.952f, 2.118f, 2.76f, 7.059f, -0.899f, 10.267f)
                curveToRelative(0.0f, 0.0f, -1.796f, 1.476f, -4.427f, 2.567f)
                curveToRelative(1.026f, 0.321f, 2.117f, 0.578f, 3.208f, 0.642f)
                curveToRelative(2.246f, -1.733f, 3.594f, -3.658f, 3.594f, -3.658f)
                curveToRelative(2.76f, -4.17f, 1.604f, -9.112f, -1.925f, -10.267f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -0.45f, -0.257f)
                curveToRelative(3.722f, 0.193f, 6.032f, 4.685f, 4.428f, 9.37f)
                curveToRelative(0.0f, 0.0f, -0.77f, 2.245f, -2.567f, 4.491f)
                curveToRelative(0.129f, 0.0f, 0.257f, -0.064f, 0.45f, -0.128f)
                arcToRelative(17.58f, 17.58f, 0.0f, false, false, 2.566f, -0.963f)
                curveToRelative(1.091f, -2.63f, 1.284f, -4.94f, 1.284f, -4.94f)
                curveToRelative(0.32f, -4.878f, -2.888f, -8.472f, -6.417f, -7.958f)
                curveToRelative(-0.129f, 0.0f, -0.321f, -0.064f, -0.45f, -0.064f)
                horizontalLineToRelative(-0.128f)
                curveToRelative(3.273f, -1.412f, 7.316f, 1.219f, 8.214f, 5.968f)
                curveToRelative(0.0f, 0.0f, 0.578f, 2.246f, 0.128f, 4.94f)
                curveToRelative(-0.064f, 0.386f, -0.256f, 0.963f, -0.577f, 1.54f)
                close()
            }
        }
        .build()
        return _mediamarkt!!
    }

private var _mediamarkt: ImageVector? = null
