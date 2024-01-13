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

public val SimpleIcons.Persistent: ImageVector
    get() {
        if (_persistent != null) {
            return _persistent!!
        }
        _persistent = Builder(name = "Persistent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.92f, 3.984f)
                arcToRelative(5.866f, 5.866f, 0.0f, false, false, -1.2f, -2.09f)
                arcTo(5.757f, 5.757f, 0.0f, false, false, 19.814f, 0.49f)
                arcToRelative(5.505f, 5.505f, 0.0f, false, false, -4.542f, 0.0f)
                curveToRelative(-1.425f, 0.642f, -2.55f, 1.912f, -3.062f, 3.413f)
                arcToRelative(5.942f, 5.942f, 0.0f, false, false, -0.268f, 1.158f)
                arcToRelative(7.588f, 7.588f, 0.0f, false, false, -0.047f, 1.167f)
                lineToRelative(0.02f, 2.247f)
                lineToRelative(0.034f, 4.496f)
                lineToRelative(0.011f, 2.248f)
                curveToRelative(0.002f, 0.375f, -0.002f, 0.75f, 0.004f, 1.124f)
                curveToRelative(0.002f, 0.186f, 0.008f, 0.378f, 0.007f, 0.56f)
                curveToRelative(0.002f, 0.18f, -0.01f, 0.36f, -0.014f, 0.541f)
                arcToRelative(7.641f, 7.641f, 0.0f, false, true, -0.138f, 1.082f)
                curveToRelative(-0.075f, 0.36f, -0.189f, 0.71f, -0.34f, 1.044f)
                arcToRelative(5.604f, 5.604f, 0.0f, false, true, -1.263f, 1.792f)
                curveToRelative(-1.076f, 0.998f, -2.549f, 1.543f, -3.992f, 1.416f)
                arcToRelative(5.072f, 5.072f, 0.0f, false, true, -2.073f, -0.605f)
                arcToRelative(5.253f, 5.253f, 0.0f, false, true, -1.654f, -1.427f)
                arcToRelative(6.092f, 6.092f, 0.0f, false, true, -0.594f, -0.936f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, true, -0.412f, -1.034f)
                arcToRelative(5.224f, 5.224f, 0.0f, false, true, -0.167f, -2.195f)
                curveToRelative(0.053f, -0.362f, 0.137f, -0.72f, 0.248f, -1.063f)
                curveToRelative(0.115f, -0.34f, 0.258f, -0.668f, 0.428f, -0.982f)
                curveToRelative(0.163f, -0.305f, 0.356f, -0.593f, 0.574f, -0.86f)
                arcToRelative(4.31f, 4.31f, 0.0f, false, true, 0.7f, -0.71f)
                curveToRelative(1.007f, -0.846f, 2.343f, -1.21f, 3.707f, -1.214f)
                curveToRelative(1.412f, 0.002f, 2.825f, 0.024f, 4.238f, 0.015f)
                lineToRelative(-0.01f, -1.535f)
                curveToRelative(-1.408f, 0.03f, -2.815f, 0.128f, -4.22f, 0.235f)
                arcToRelative(7.174f, 7.174f, 0.0f, false, false, -2.287f, 0.569f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, false, -1.04f, 0.57f)
                arcToRelative(5.997f, 5.997f, 0.0f, false, false, -1.66f, 1.646f)
                arcToRelative(6.194f, 6.194f, 0.0f, false, false, -0.57f, 1.025f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, -0.62f, 2.267f)
                arcToRelative(7.553f, 7.553f, 0.0f, false, false, 0.152f, 2.412f)
                curveToRelative(0.187f, 0.805f, 0.518f, 1.57f, 0.976f, 2.258f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 1.79f, 1.788f)
                curveToRelative(0.73f, 0.476f, 1.552f, 0.79f, 2.412f, 0.92f)
                curveToRelative(0.108f, 0.02f, 0.215f, 0.03f, 0.322f, 0.041f)
                curveToRelative(0.106f, 0.012f, 0.213f, 0.024f, 0.326f, 0.027f)
                curveToRelative(0.112f, 0.007f, 0.223f, 0.011f, 0.335f, 0.01f)
                arcToRelative(5.842f, 5.842f, 0.0f, false, false, 1.658f, -0.24f)
                arcToRelative(6.783f, 6.783f, 0.0f, false, false, 1.253f, -0.504f)
                curveToRelative(0.402f, -0.21f, 0.78f, -0.47f, 1.135f, -0.76f)
                arcToRelative(7.046f, 7.046f, 0.0f, false, false, 1.864f, -2.492f)
                curveToRelative(0.05f, -0.108f, 0.094f, -0.216f, 0.136f, -0.327f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, false, 0.219f, -0.67f)
                arcToRelative(9.39f, 9.39f, 0.0f, false, false, 0.25f, -1.384f)
                curveToRelative(0.017f, -0.233f, 0.04f, -0.465f, 0.047f, -0.697f)
                lineToRelative(0.01f, -0.302f)
                lineToRelative(0.015f, -0.28f)
                lineToRelative(0.053f, -1.125f)
                lineToRelative(0.049f, -2.248f)
                lineToRelative(0.095f, -4.495f)
                lineToRelative(0.046f, -2.248f)
                lineToRelative(0.004f, -0.282f)
                lineToRelative(0.002f, -0.067f)
                lineToRelative(0.002f, -0.047f)
                lineToRelative(0.005f, -0.094f)
                arcToRelative(4.026f, 4.026f, 0.0f, false, true, 0.223f, -1.087f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, 0.754f, -1.252f)
                arcToRelative(3.525f, 3.525f, 0.0f, false, true, 1.164f, -0.856f)
                arcToRelative(3.421f, 3.421f, 0.0f, false, true, 1.402f, -0.298f)
                curveToRelative(0.487f, -0.009f, 0.97f, 0.087f, 1.416f, 0.282f)
                curveToRelative(0.457f, 0.2f, 0.867f, 0.491f, 1.205f, 0.858f)
                curveToRelative(0.34f, 0.372f, 0.614f, 0.812f, 0.79f, 1.296f)
                curveToRelative(0.178f, 0.492f, 0.257f, 1.016f, 0.23f, 1.539f)
                arcToRelative(3.964f, 3.964f, 0.0f, false, true, -0.378f, 1.529f)
                arcToRelative(3.765f, 3.765f, 0.0f, false, true, -2.35f, 2.016f)
                arcToRelative(3.836f, 3.836f, 0.0f, false, true, -0.783f, 0.149f)
                lineToRelative(-0.1f, 0.006f)
                curveToRelative(-0.036f, 0.003f, -0.06f, 0.006f, -0.11f, 0.007f)
                lineToRelative(-0.271f, 0.007f)
                lineToRelative(-0.543f, 0.015f)
                lineToRelative(-2.02f, 0.056f)
                lineToRelative(-0.037f, 1.766f)
                lineToRelative(2.057f, 0.028f)
                lineToRelative(0.543f, 0.007f)
                lineToRelative(0.27f, 0.004f)
                lineToRelative(0.29f, -0.003f)
                arcToRelative(5.584f, 5.584f, 0.0f, false, false, 3.29f, -1.204f)
                arcToRelative(5.812f, 5.812f, 0.0f, false, false, 1.523f, -1.861f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, 0.384f, -4.757f)
            }
        }
        .build()
        return _persistent!!
    }

private var _persistent: ImageVector? = null
