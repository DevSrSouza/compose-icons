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

public val SimpleIcons.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.375f, 0.0f, 0.0f, 5.375f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.375f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.375f, 12.0f, -12.0f)
                reflectiveCurveTo(18.625f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.768f, 4.105f)
                curveToRelative(0.183f, 0.0f, 0.363f, 0.053f, 0.525f, 0.157f)
                curveToRelative(0.125f, 0.083f, 0.287f, 0.185f, 0.755f, 1.154f)
                curveToRelative(0.31f, -0.088f, 0.468f, -0.042f, 0.551f, -0.019f)
                curveToRelative(0.204f, 0.056f, 0.366f, 0.19f, 0.463f, 0.375f)
                curveToRelative(0.477f, 0.917f, 0.542f, 2.553f, 0.334f, 3.605f)
                curveToRelative(-0.241f, 1.232f, -0.755f, 2.029f, -1.131f, 2.576f)
                curveToRelative(0.324f, 0.329f, 0.778f, 0.899f, 1.117f, 1.825f)
                curveToRelative(0.278f, 0.774f, 0.31f, 1.478f, 0.273f, 2.015f)
                arcToRelative(5.51f, 5.51f, 0.0f, false, false, 0.602f, -0.329f)
                curveToRelative(0.593f, -0.366f, 1.487f, -0.917f, 2.553f, -0.931f)
                curveToRelative(0.714f, -0.009f, 1.269f, 0.445f, 1.353f, 1.103f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, -0.945f, 1.362f)
                curveToRelative(-0.649f, 0.158f, -0.95f, 0.278f, -1.821f, 0.843f)
                curveToRelative(-1.232f, 0.797f, -2.539f, 1.242f, -3.012f, 1.39f)
                arcToRelative(1.686f, 1.686f, 0.0f, false, true, -0.704f, 0.343f)
                curveToRelative(-0.737f, 0.181f, -3.266f, 0.315f, -3.466f, 0.315f)
                horizontalLineToRelative(-0.046f)
                curveToRelative(-0.783f, 0.0f, -1.214f, -0.241f, -1.45f, -0.491f)
                curveToRelative(-0.658f, 0.329f, -1.51f, 0.19f, -2.122f, -0.134f)
                arcToRelative(1.078f, 1.078f, 0.0f, false, true, -0.58f, -1.153f)
                arcToRelative(1.243f, 1.243f, 0.0f, false, true, -0.153f, -0.195f)
                curveToRelative(-0.162f, -0.25f, -0.528f, -0.936f, -0.454f, -1.946f)
                curveToRelative(0.056f, -0.723f, 0.556f, -1.367f, 0.88f, -1.71f)
                arcToRelative(5.522f, 5.522f, 0.0f, false, true, 0.408f, -2.256f)
                curveToRelative(0.306f, -0.727f, 0.885f, -1.348f, 1.32f, -1.737f)
                curveToRelative(-0.32f, -0.537f, -0.644f, -1.367f, -0.329f, -2.21f)
                curveToRelative(0.227f, -0.602f, 0.412f, -0.936f, 0.82f, -1.08f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(0.199f, -0.074f, 0.389f, -0.153f, 0.486f, -0.259f)
                arcToRelative(3.418f, 3.418f, 0.0f, false, true, 2.298f, -1.103f)
                curveToRelative(0.037f, -0.093f, 0.079f, -0.185f, 0.125f, -0.283f)
                curveToRelative(0.31f, -0.658f, 0.639f, -1.029f, 1.024f, -1.168f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, 0.328f, -0.06f)
                close()
                moveTo(12.774f, 4.805f)
                curveToRelative(-0.507f, 0.016f, -1.001f, 1.519f, -1.001f, 1.519f)
                reflectiveCurveToRelative(-1.27f, -0.204f, -2.266f, 0.871f)
                curveToRelative(-0.199f, 0.218f, -0.468f, 0.334f, -0.746f, 0.44f)
                curveToRelative(-0.079f, 0.028f, -0.176f, 0.023f, -0.417f, 0.672f)
                curveToRelative(-0.371f, 0.991f, 0.625f, 2.094f, 0.625f, 2.094f)
                reflectiveCurveToRelative(-1.186f, 0.839f, -1.626f, 1.881f)
                curveToRelative(-0.486f, 1.144f, -0.338f, 2.261f, -0.338f, 2.261f)
                reflectiveCurveToRelative(-0.843f, 0.732f, -0.899f, 1.487f)
                curveToRelative(-0.051f, 0.663f, 0.139f, 1.2f, 0.343f, 1.515f)
                curveToRelative(0.227f, 0.343f, 0.51f, 0.176f, 0.51f, 0.176f)
                reflectiveCurveToRelative(-0.561f, 0.653f, -0.037f, 0.931f)
                curveToRelative(0.477f, 0.25f, 1.283f, 0.394f, 1.71f, -0.037f)
                curveToRelative(0.31f, -0.31f, 0.371f, -1.001f, 0.486f, -1.283f)
                curveToRelative(0.028f, -0.065f, 0.12f, 0.111f, 0.209f, 0.199f)
                curveToRelative(0.097f, 0.093f, 0.264f, 0.195f, 0.264f, 0.195f)
                reflectiveCurveToRelative(-0.755f, 0.324f, -0.445f, 1.066f)
                curveToRelative(0.102f, 0.246f, 0.468f, 0.403f, 1.066f, 0.398f)
                curveToRelative(0.222f, -0.005f, 2.664f, -0.139f, 3.313f, -0.296f)
                curveToRelative(0.375f, -0.088f, 0.505f, -0.283f, 0.505f, -0.283f)
                reflectiveCurveToRelative(1.566f, -0.431f, 2.998f, -1.357f)
                curveToRelative(0.917f, -0.598f, 1.293f, -0.76f, 2.034f, -0.936f)
                curveToRelative(0.612f, -0.148f, 0.57f, -1.098f, -0.241f, -1.084f)
                curveToRelative(-0.839f, 0.009f, -1.575f, 0.44f, -2.196f, 0.825f)
                curveToRelative(-1.163f, 0.718f, -1.742f, 0.672f, -1.742f, 0.672f)
                lineToRelative(-0.018f, -0.032f)
                curveToRelative(-0.079f, -0.13f, 0.371f, -1.293f, -0.134f, -2.678f)
                curveToRelative(-0.547f, -1.515f, -1.413f, -1.881f, -1.344f, -1.997f)
                curveToRelative(0.297f, -0.5f, 1.038f, -1.297f, 1.334f, -2.78f)
                curveToRelative(0.176f, -0.899f, 0.13f, -2.377f, -0.269f, -3.151f)
                curveToRelative(-0.074f, -0.144f, -0.732f, 0.241f, -0.732f, 0.241f)
                reflectiveCurveToRelative(-0.616f, -1.371f, -0.788f, -1.483f)
                arcToRelative(0.271f, 0.271f, 0.0f, false, false, -0.157f, -0.046f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null
