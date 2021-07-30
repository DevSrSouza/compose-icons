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

public val SimpleIcons.Wireguard: ImageVector
    get() {
        if (_wireguard != null) {
            return _wireguard!!
        }
        _wireguard = Builder(name = "Wireguard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.98f, 11.645f)
                reflectiveCurveTo(24.533f, 0.0f, 11.735f, 0.0f)
                curveTo(0.418f, 0.0f, 0.064f, 11.17f, 0.064f, 11.17f)
                reflectiveCurveTo(-1.6f, 24.0f, 11.997f, 24.0f)
                curveTo(25.04f, 24.0f, 23.98f, 11.645f, 23.98f, 11.645f)
                close()
                moveTo(8.155f, 7.576f)
                curveToRelative(2.4f, -1.47f, 5.469f, -0.571f, 6.618f, 1.638f)
                curveToRelative(0.218f, 0.419f, 0.246f, 1.063f, 0.108f, 1.503f)
                curveToRelative(-0.477f, 1.516f, -1.601f, 2.366f, -3.145f, 2.728f)
                curveToRelative(0.455f, -0.39f, 0.817f, -0.832f, 0.933f, -1.442f)
                arcToRelative(2.112f, 2.112f, 0.0f, false, false, -0.364f, -1.677f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -2.465f, -0.75f)
                curveToRelative(-0.95f, 0.36f, -1.47f, 1.228f, -1.377f, 2.294f)
                curveToRelative(0.087f, 0.99f, 0.839f, 1.632f, 2.245f, 1.876f)
                curveToRelative(-0.21f, 0.111f, -0.372f, 0.193f, -0.53f, 0.281f)
                arcToRelative(5.113f, 5.113f, 0.0f, false, false, -1.644f, 1.43f)
                curveToRelative(-0.143f, 0.192f, -0.24f, 0.208f, -0.458f, 0.075f)
                curveToRelative(-2.827f, -1.729f, -3.009f, -6.067f, 0.078f, -7.956f)
                close()
                moveTo(6.04f, 18.258f)
                curveToRelative(-0.455f, 0.116f, -0.895f, 0.286f, -1.359f, 0.438f)
                curveToRelative(0.227f, -1.532f, 2.021f, -2.943f, 3.539f, -2.782f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, false, -0.74f, 2.072f)
                curveToRelative(-0.504f, 0.093f, -0.98f, 0.155f, -1.44f, 0.272f)
                close()
                moveTo(15.703f, 3.3f)
                curveToRelative(0.448f, 0.017f, 0.898f, 0.01f, 1.347f, 0.02f)
                arcToRelative(2.324f, 2.324f, 0.0f, false, true, 0.334f, 0.047f)
                arcToRelative(3.249f, 3.249f, 0.0f, false, true, -0.34f, 0.434f)
                curveToRelative(-0.16f, 0.15f, -0.341f, 0.296f, -0.573f, 0.069f)
                curveToRelative(-0.055f, -0.055f, -0.187f, -0.042f, -0.283f, -0.044f)
                curveToRelative(-0.447f, -0.005f, -0.894f, -0.02f, -1.34f, -0.003f)
                arcToRelative(8.323f, 8.323f, 0.0f, false, false, -1.154f, 0.118f)
                curveToRelative(-0.072f, 0.013f, -0.178f, 0.25f, -0.146f, 0.338f)
                curveToRelative(0.078f, 0.207f, 0.191f, 0.435f, 0.359f, 0.567f)
                curveToRelative(0.619f, 0.49f, 1.277f, 0.928f, 1.9f, 1.413f)
                curveToRelative(0.604f, 0.472f, 1.167f, 0.99f, 1.51f, 1.7f)
                curveToRelative(0.446f, 0.928f, 0.46f, 1.9f, 0.267f, 2.877f)
                curveToRelative(-0.322f, 1.63f, -1.147f, 2.98f, -2.483f, 3.962f)
                curveToRelative(-0.538f, 0.395f, -1.205f, 0.62f, -1.821f, 0.903f)
                curveToRelative(-0.543f, 0.25f, -1.1f, 0.465f, -1.644f, 0.712f)
                curveToRelative(-0.98f, 0.446f, -1.53f, 1.51f, -1.369f, 2.615f)
                curveToRelative(0.149f, 1.015f, 1.04f, 1.862f, 2.059f, 2.037f)
                curveToRelative(1.223f, 0.21f, 2.486f, -0.586f, 2.785f, -1.83f)
                curveToRelative(0.336f, -1.397f, -0.423f, -2.646f, -1.845f, -3.024f)
                lineToRelative(-0.256f, -0.066f)
                curveToRelative(0.38f, -0.17f, 0.708f, -0.291f, 1.012f, -0.458f)
                quadToRelative(0.793f, -0.437f, 1.558f, -0.925f)
                curveToRelative(0.15f, -0.096f, 0.231f, -0.096f, 0.36f, 0.014f)
                curveToRelative(0.977f, 0.846f, 1.56f, 1.898f, 1.724f, 3.187f)
                curveToRelative(0.27f, 2.135f, -0.74f, 4.096f, -2.646f, 5.101f)
                curveToRelative(-2.948f, 1.555f, -6.557f, -0.215f, -7.208f, -3.484f)
                curveToRelative(-0.558f, -2.8f, 1.418f, -5.34f, 3.797f, -5.83f)
                curveToRelative(1.023f, -0.211f, 1.958f, -0.637f, 2.685f, -1.425f)
                curveToRelative(0.47f, -0.508f, 0.697f, -0.944f, 0.775f, -1.141f)
                arcToRelative(3.165f, 3.165f, 0.0f, false, false, 0.217f, -1.158f)
                arcToRelative(2.71f, 2.71f, 0.0f, false, false, -0.237f, -0.992f)
                curveToRelative(-0.248f, -0.566f, -1.2f, -1.466f, -1.435f, -1.656f)
                lineToRelative(-2.24f, -1.754f)
                curveToRelative(-0.079f, -0.065f, -0.168f, -0.06f, -0.36f, -0.047f)
                curveToRelative(-0.23f, 0.016f, -0.815f, 0.048f, -1.067f, -0.018f)
                curveToRelative(0.204f, -0.155f, 0.76f, -0.38f, 1.0f, -0.56f)
                curveToRelative(-0.726f, -0.49f, -1.554f, -0.314f, -2.315f, -0.46f)
                curveToRelative(0.176f, -0.328f, 1.046f, -0.831f, 1.541f, -0.888f)
                arcToRelative(7.323f, 7.323f, 0.0f, false, false, -0.135f, -0.822f)
                curveToRelative(-0.03f, -0.111f, -0.154f, -0.22f, -0.263f, -0.283f)
                curveToRelative(-0.262f, -0.154f, -0.541f, -0.281f, -0.843f, -0.434f)
                arcToRelative(1.755f, 1.755f, 0.0f, false, true, 0.906f, -0.28f)
                arcToRelative(3.385f, 3.385f, 0.0f, false, true, 0.908f, 0.088f)
                curveToRelative(0.54f, 0.123f, 0.97f, 0.042f, 1.399f, -0.324f)
                curveToRelative(-0.338f, -0.136f, -0.676f, -0.26f, -1.003f, -0.407f)
                arcToRelative(9.843f, 9.843f, 0.0f, false, true, -0.942f, -0.493f)
                curveToRelative(0.85f, 0.118f, 1.671f, 0.437f, 2.54f, 0.32f)
                lineToRelative(0.022f, -0.118f)
                lineToRelative(-2.018f, -0.47f)
                curveToRelative(1.203f, -0.11f, 2.323f, -0.128f, 3.384f, 0.388f)
                curveToRelative(0.299f, 0.146f, 0.61f, 0.266f, 0.897f, 0.432f)
                curveToRelative(0.14f, 0.08f, 0.233f, 0.24f, 0.348f, 0.365f)
                curveToRelative(0.09f, 0.098f, 0.164f, 0.23f, 0.276f, 0.29f)
                curveToRelative(0.424f, 0.225f, 0.89f, 0.234f, 1.366f, 0.223f)
                lineToRelative(0.01f, -0.16f)
                curveToRelative(0.479f, 0.15f, 1.017f, 0.702f, 1.017f, 1.105f)
                curveToRelative(-0.776f, 0.0f, -1.55f, -0.003f, -2.325f, 0.004f)
                curveToRelative(-0.083f, 0.0f, -0.165f, 0.061f, -0.247f, 0.094f)
                curveToRelative(0.078f, 0.046f, 0.155f, 0.128f, 0.235f, 0.131f)
                close()
                moveTo(14.703f, 2.153f)
                arcToRelative(0.118f, 0.118f, 0.0f, false, false, -0.016f, 0.19f)
                arcToRelative(0.179f, 0.179f, 0.0f, false, false, 0.246f, 0.065f)
                curveToRelative(0.075f, -0.038f, 0.148f, -0.078f, 0.238f, -0.125f)
                curveToRelative(-0.072f, -0.062f, -0.13f, -0.114f, -0.19f, -0.163f)
                curveToRelative(-0.106f, -0.087f, -0.193f, -0.032f, -0.278f, 0.033f)
                close()
            }
        }
        .build()
        return _wireguard!!
    }

private var _wireguard: ImageVector? = null
