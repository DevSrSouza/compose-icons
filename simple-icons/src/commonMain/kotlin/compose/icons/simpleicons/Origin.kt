package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Origin: VectorAsset
    get() {
        if (_origin != null) {
            return _origin!!
        }
        _origin = VectorAssetBuilder(name = "Origin", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.588f, 3.11f)
                curveToRelative(1.189f, 0.071f, 2.352f, 0.384f, 3.417f, 0.919f)
                curveToRelative(1.031f, 0.514f, 1.95f, 1.225f, 2.706f, 2.094f)
                curveToRelative(0.751f, 0.865f, 1.322f, 1.853f, 1.715f, 2.963f)
                curveToRelative(0.391f, 1.109f, 0.548f, 2.278f, 0.464f, 3.502f)
                curveToRelative(-0.033f, 0.636f, -0.135f, 1.252f, -0.306f, 1.848f)
                curveToRelative(-0.167f, 0.588f, -0.393f, 1.159f, -0.674f, 1.703f)
                curveToRelative(-0.439f, 0.849f, -0.929f, 1.652f, -1.47f, 2.412f)
                curveToRelative(-0.538f, 0.759f, -1.125f, 1.465f, -1.762f, 2.118f)
                curveToRelative(-0.638f, 0.653f, -1.313f, 1.254f, -2.032f, 1.802f)
                curveToRelative(-0.719f, 0.544f, -1.471f, 1.038f, -2.254f, 1.479f)
                lineToRelative(-0.037f, 0.026f)
                curveToRelative(-0.033f, 0.018f, -0.071f, 0.026f, -0.109f, 0.023f)
                curveToRelative(-0.063f, -0.015f, -0.118f, -0.048f, -0.159f, -0.097f)
                curveToRelative(-0.041f, -0.05f, -0.063f, -0.111f, -0.062f, -0.173f)
                curveToRelative(0.0f, -0.029f, 0.004f, -0.059f, 0.012f, -0.085f)
                curveToRelative(0.008f, -0.023f, 0.021f, -0.044f, 0.037f, -0.062f)
                curveToRelative(0.277f, -0.393f, 0.506f, -0.806f, 0.686f, -1.235f)
                curveToRelative(0.181f, -0.434f, 0.303f, -0.885f, 0.368f, -1.359f)
                curveToRelative(0.0f, -0.032f, -0.015f, -0.064f, -0.038f, -0.085f)
                curveToRelative(-0.021f, -0.025f, -0.053f, -0.038f, -0.085f, -0.038f)
                curveToRelative(-0.264f, 0.032f, -0.528f, 0.053f, -0.795f, 0.062f)
                curveToRelative(-0.266f, 0.009f, -0.532f, -0.003f, -0.796f, -0.037f)
                curveToRelative(-1.189f, -0.071f, -2.353f, -0.385f, -3.418f, -0.918f)
                curveToRelative(-1.031f, -0.515f, -1.949f, -1.226f, -2.705f, -2.095f)
                curveToRelative(-0.754f, -0.87f, -1.336f, -1.875f, -1.715f, -2.963f)
                curveToRelative(-0.394f, -1.123f, -0.552f, -2.314f, -0.465f, -3.502f)
                curveToRelative(0.033f, -0.636f, 0.135f, -1.252f, 0.306f, -1.848f)
                curveToRelative(0.171f, -0.598f, 0.396f, -1.155f, 0.675f, -1.68f)
                curveToRelative(0.439f, -0.864f, 0.931f, -1.676f, 1.469f, -2.436f)
                curveToRelative(0.539f, -0.757f, 1.125f, -1.464f, 1.761f, -2.118f)
                curveToRelative(0.639f, -0.652f, 1.314f, -1.252f, 2.033f, -1.8f)
                curveToRelative(0.72f, -0.546f, 1.47f, -1.039f, 2.253f, -1.479f)
                lineToRelative(0.038f, -0.025f)
                curveToRelative(0.033f, -0.02f, 0.07f, -0.027f, 0.109f, -0.025f)
                curveToRelative(0.065f, 0.016f, 0.119f, 0.051f, 0.158f, 0.098f)
                curveToRelative(0.043f, 0.051f, 0.062f, 0.106f, 0.062f, 0.174f)
                curveToRelative(0.001f, 0.027f, -0.003f, 0.057f, -0.012f, 0.084f)
                curveToRelative(-0.007f, 0.023f, -0.02f, 0.043f, -0.036f, 0.061f)
                curveToRelative(-0.273f, 0.386f, -0.505f, 0.801f, -0.687f, 1.237f)
                curveToRelative(-0.181f, 0.433f, -0.3f, 0.885f, -0.366f, 1.358f)
                curveToRelative(0.0f, 0.033f, 0.012f, 0.063f, 0.036f, 0.086f)
                curveToRelative(0.022f, 0.024f, 0.054f, 0.037f, 0.085f, 0.037f)
                curveToRelative(0.262f, -0.033f, 0.527f, -0.053f, 0.795f, -0.061f)
                curveToRelative(0.272f, -0.009f, 0.536f, 0.003f, 0.798f, 0.035f)
                close()
                moveTo(11.781f, 15.477f)
                curveToRelative(0.922f, 0.079f, 1.838f, -0.231f, 2.521f, -0.855f)
                curveToRelative(0.72f, -0.639f, 1.109f, -1.438f, 1.176f, -2.4f)
                curveToRelative(0.078f, -0.928f, -0.232f, -1.846f, -0.856f, -2.535f)
                curveToRelative(-0.601f, -0.708f, -1.472f, -1.131f, -2.4f, -1.162f)
                curveToRelative(-0.927f, -0.078f, -1.845f, 0.232f, -2.534f, 0.855f)
                curveToRelative(-0.709f, 0.602f, -1.132f, 1.473f, -1.164f, 2.4f)
                curveToRelative(-0.078f, 0.926f, 0.228f, 1.842f, 0.846f, 2.535f)
                curveToRelative(0.628f, 0.725f, 1.432f, 1.115f, 2.411f, 1.162f)
                close()
            }
        }
        .build()
        return _origin!!
    }

private var _origin: VectorAsset? = null
