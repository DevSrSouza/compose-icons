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

public val SimpleIcons.Pelican: ImageVector
    get() {
        if (_pelican != null) {
            return _pelican!!
        }
        _pelican = Builder(name = "Pelican", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.942f, 0.0f)
                curveToRelative(0.342f, 1.055f, 1.876f, 2.186f, 2.906f, 2.624f)
                curveToRelative(1.313f, 0.558f, 2.598f, 0.685f, 3.75f, 0.812f)
                curveToRelative(0.895f, 0.096f, 1.702f, 0.201f, 2.344f, 0.5f)
                curveToRelative(0.162f, 0.073f, 0.329f, 0.148f, 0.469f, 0.25f)
                curveToRelative(0.459f, 0.336f, 0.946f, 0.988f, 1.281f, 1.437f)
                curveToRelative(0.719f, 0.958f, 0.586f, 1.745f, 1.438f, 2.218f)
                curveToRelative(0.089f, 0.049f, 0.168f, 0.083f, 0.281f, 0.125f)
                curveToRelative(0.271f, 0.102f, 0.667f, 0.227f, 0.844f, -0.156f)
                arcToRelative(0.788f, 0.788f, 0.0f, false, false, 0.063f, -0.187f)
                curveToRelative(-0.071f, -0.229f, -0.321f, -0.433f, -0.469f, -0.531f)
                curveToRelative(-0.262f, -0.171f, -0.373f, -0.274f, -0.563f, -0.468f)
                curveToRelative(-0.349f, -0.358f, -0.348f, -0.951f, -0.594f, -1.374f)
                curveToRelative(0.309f, -0.131f, 1.939f, -0.36f, 2.281f, -0.312f)
                curveToRelative(0.731f, 0.033f, 1.31f, 0.078f, 1.75f, 0.531f)
                curveToRelative(0.173f, 0.137f, 0.25f, 0.257f, 0.406f, 0.375f)
                curveToRelative(0.011f, 0.009f, 0.02f, 0.024f, 0.031f, 0.031f)
                curveToRelative(0.693f, 0.504f, 1.339f, 0.67f, 1.906f, 0.843f)
                curveToRelative(0.15f, 0.045f, 0.299f, 0.105f, 0.438f, 0.156f)
                curveToRelative(0.213f, 0.076f, 0.407f, 0.159f, 0.594f, 0.281f)
                curveToRelative(0.222f, 0.147f, 0.609f, 0.542f, 0.625f, 0.875f)
                curveToRelative(-0.559f, -0.178f, -0.207f, 0.032f, -1.031f, -0.031f)
                curveToRelative(-0.402f, -0.046f, -0.806f, -0.065f, -1.219f, -0.094f)
                curveToRelative(-0.642f, -0.045f, -1.273f, -0.104f, -1.875f, -0.219f)
                curveToRelative(-0.1f, -0.018f, -0.215f, -0.039f, -0.313f, -0.063f)
                curveToRelative(-0.077f, -0.016f, -0.146f, -0.011f, -0.219f, -0.031f)
                curveToRelative(-0.002f, 0.031f, 0.0f, 0.035f, 0.0f, 0.063f)
                curveToRelative(-0.017f, 0.629f, 0.421f, 0.959f, -0.594f, 2.155f)
                curveToRelative(-0.009f, 0.013f, -0.02f, 0.017f, -0.031f, 0.031f)
                curveToRelative(-0.269f, 0.315f, -1.657f, 0.916f, -2.094f, 1.031f)
                curveToRelative(-1.859f, 0.373f, -3.292f, -0.828f, -5.531f, -0.219f)
                curveToRelative(-0.788f, 0.293f, -1.357f, 1.576f, -1.719f, 2.53f)
                curveToRelative(-0.482f, 1.268f, -0.876f, 2.796f, -1.313f, 4.311f)
                curveToRelative(-0.2f, 0.698f, -0.418f, 1.401f, -0.656f, 2.062f)
                curveToRelative(-0.575f, 1.584f, -1.311f, 2.943f, -2.406f, 3.717f)
                curveToRelative(-0.164f, 0.126f, -0.787f, 0.41f, -0.813f, 0.625f)
                curveToRelative(0.404f, 0.204f, 4.185f, 0.056f, 4.813f, 0.0f)
                curveToRelative(2.503f, -0.218f, 3.647f, -1.773f, 4.469f, -3.905f)
                curveToRelative(0.566f, -1.462f, 1.065f, -3.986f, 2.031f, -5.31f)
                curveToRelative(0.013f, -0.018f, 0.018f, -0.015f, 0.031f, -0.031f)
                curveToRelative(0.146f, -0.197f, 0.327f, -0.369f, 0.5f, -0.5f)
                curveToRelative(0.045f, -0.035f, 0.078f, -0.065f, 0.125f, -0.094f)
                curveToRelative(0.034f, -0.022f, 0.157f, -0.059f, 0.344f, -0.094f)
                curveToRelative(1.736f, -0.307f, 9.349f, -1.347f, 9.844f, -6.872f)
                curveToRelative(0.051f, -0.558f, 0.016f, -1.159f, -0.094f, -1.812f)
                curveToRelative(-0.054f, -0.336f, -0.115f, -0.665f, -0.219f, -1.031f)
                curveToRelative(-0.246f, -0.869f, -0.798f, -1.614f, -1.531f, -2.218f)
                curveToRelative(-0.193f, -0.16f, -0.405f, -0.329f, -0.625f, -0.469f)
                curveToRelative(-0.846f, -0.54f, -1.877f, -0.921f, -2.969f, -1.156f)
                curveToRelative(-0.733f, -0.158f, -1.487f, -0.239f, -2.25f, -0.25f)
                curveTo(9.84f, 0.033f, 6.398f, 0.207f, 0.942f, 0.0f)
                close()
                moveTo(2.567f, 4.217f)
                curveToRelative(0.023f, 0.038f, 0.039f, 0.057f, 0.063f, 0.094f)
                curveTo(4.228f, 6.838f, 6.239f, 6.813f, 8.067f, 7.028f)
                curveToRelative(0.666f, 0.078f, 1.317f, 0.185f, 1.906f, 0.469f)
                curveToRelative(0.262f, 0.123f, 0.512f, 0.265f, 0.75f, 0.468f)
                curveToRelative(-0.029f, -0.131f, -0.076f, -0.256f, -0.125f, -0.375f)
                curveToRelative(-0.444f, -1.076f, -1.649f, -1.666f, -2.688f, -1.968f)
                curveToRelative(-1.394f, -0.498f, -2.404f, -0.018f, -5.344f, -1.406f)
                close()
                moveTo(3.973f, 7.403f)
                curveToRelative(0.011f, 0.053f, 0.009f, 0.095f, 0.031f, 0.156f)
                curveToRelative(0.22f, 0.635f, 1.04f, 1.65f, 2.094f, 1.874f)
                curveToRelative(0.457f, 0.164f, 0.315f, 0.117f, 1.094f, 0.094f)
                curveToRelative(1.141f, -0.058f, 1.692f, -0.079f, 2.5f, 0.25f)
                curveToRelative(-0.02f, -0.049f, -0.042f, -0.109f, -0.062f, -0.156f)
                curveTo(9.007f, 8.175f, 8.259f, 8.421f, 5.879f, 8.246f)
                curveToRelative(-1.019f, -0.307f, -1.259f, -0.342f, -1.906f, -0.843f)
                close()
            }
        }
        .build()
        return _pelican!!
    }

private var _pelican: ImageVector? = null
