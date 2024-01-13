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

public val SimpleIcons.Gunicorn: ImageVector
    get() {
        if (_gunicorn != null) {
            return _gunicorn!!
        }
        _gunicorn = Builder(name = "Gunicorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.145f, 20.014f)
                curveToRelative(-0.266f, -0.085f, -0.267f, -0.122f, -0.022f, -0.865f)
                curveToRelative(0.244f, -0.743f, 0.132f, -1.432f, -0.32f, -1.974f)
                curveToRelative(-0.617f, -0.737f, -0.914f, -1.366f, -1.009f, -2.135f)
                curveToRelative(-0.08f, -0.66f, -0.107f, -0.713f, -0.376f, -0.764f)
                curveToRelative(-0.18f, -0.035f, -0.43f, 0.034f, -1.023f, 0.281f)
                curveToRelative(-0.864f, 0.36f, -1.07f, 0.52f, -1.273f, 0.98f)
                curveToRelative(-0.108f, 0.242f, -0.12f, 0.387f, -0.06f, 0.667f)
                curveToRelative(0.075f, 0.342f, 0.378f, 0.892f, 0.494f, 0.893f)
                curveToRelative(0.03f, 0.0f, 0.196f, 0.114f, 0.368f, 0.252f)
                curveToRelative(0.287f, 0.23f, 0.307f, 0.27f, 0.225f, 0.458f)
                curveToRelative(-0.176f, 0.408f, -0.595f, 0.902f, -0.764f, 0.902f)
                curveToRelative(-0.095f, 0.0f, -0.482f, -0.272f, -0.91f, -0.637f)
                curveToRelative(-0.836f, -0.717f, -0.872f, -0.79f, -0.96f, -1.965f)
                curveToRelative(-0.1f, -1.403f, 0.244f, -2.058f, 1.78f, -3.375f)
                lineToRelative(0.964f, -0.827f)
                lineToRelative(0.062f, -0.5f)
                curveToRelative(0.063f, -0.518f, -0.026f, -1.748f, -0.177f, -2.427f)
                curveToRelative(-0.09f, -0.4f, -0.382f, -0.783f, -0.66f, -0.86f)
                curveToRelative(-0.303f, -0.084f, -0.48f, 0.09f, -0.712f, 0.694f)
                curveToRelative(-0.25f, 0.654f, -0.486f, 0.882f, -0.92f, 0.882f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.173f, -0.694f, -0.477f)
                curveTo(4.033f, 9.0f, 3.96f, 7.691f, 4.035f, 7.002f)
                curveToRelative(0.036f, -0.33f, 0.038f, -0.666f, 0.005f, -0.745f)
                curveToRelative(-0.054f, -0.128f, -0.52f, -0.405f, -1.62f, -0.962f)
                arcToRelative(4.343f, 4.343f, 0.0f, false, true, -0.518f, -0.303f)
                arcToRelative(3.053f, 3.053f, 0.0f, false, false, -0.49f, -0.267f)
                curveTo(0.994f, 4.54f, -0.095f, 3.903f, 0.007f, 3.903f)
                curveToRelative(0.193f, 0.0f, 1.01f, 0.252f, 1.446f, 0.445f)
                curveToRelative(0.266f, 0.118f, 0.52f, 0.215f, 0.565f, 0.215f)
                curveToRelative(0.045f, 0.0f, 0.558f, 0.165f, 1.14f, 0.366f)
                curveToRelative(0.58f, 0.202f, 1.111f, 0.367f, 1.18f, 0.367f)
                curveToRelative(0.16f, 0.0f, 0.185f, -0.14f, 0.134f, -0.746f)
                curveToRelative(-0.024f, -0.275f, -0.023f, -0.5f, 0.002f, -0.5f)
                reflectiveCurveToRelative(0.132f, 0.053f, 0.238f, 0.118f)
                curveToRelative(0.324f, 0.198f, 1.02f, 0.32f, 1.84f, 0.32f)
                curveToRelative(0.783f, 0.002f, 1.806f, 0.157f, 2.196f, 0.335f)
                curveToRelative(0.56f, 0.254f, 1.211f, 1.05f, 2.036f, 2.49f)
                curveToRelative(0.574f, 1.002f, 1.19f, 1.426f, 2.073f, 1.427f)
                curveToRelative(0.357f, 0.0f, 1.31f, -0.147f, 2.6f, -0.4f)
                curveToRelative(1.063f, -0.21f, 2.467f, -0.259f, 3.012f, -0.103f)
                curveToRelative(0.665f, 0.19f, 1.545f, 0.7f, 2.27f, 1.314f)
                curveToRelative(0.68f, 0.576f, 0.786f, 0.704f, 1.204f, 1.468f)
                curveToRelative(0.5f, 0.912f, 1.05f, 2.207f, 1.54f, 3.622f)
                curveToRelative(0.07f, 0.202f, 0.216f, 0.54f, 0.326f, 0.753f)
                curveToRelative(0.294f, 0.568f, 0.28f, 0.603f, -0.255f, 0.603f)
                curveToRelative(-0.58f, 0.0f, -0.853f, -0.092f, -1.233f, -0.415f)
                curveToRelative(-0.365f, -0.31f, -0.46f, -0.5f, -1.032f, -2.05f)
                curveToRelative(-0.292f, -0.796f, -0.577f, -1.273f, -0.76f, -1.273f)
                curveToRelative(-0.124f, 0.0f, -0.376f, 0.852f, -0.376f, 1.273f)
                curveToRelative(0.0f, 0.3f, 0.187f, 0.702f, 0.67f, 1.447f)
                curveToRelative(0.788f, 1.21f, 1.202f, 2.922f, 1.036f, 4.28f)
                lineToRelative(-0.07f, 0.586f)
                lineToRelative(-0.526f, 0.022f)
                curveToRelative(-0.825f, 0.034f, -0.817f, 0.046f, -0.817f, -1.135f)
                curveToRelative(0.0f, -1.257f, -0.085f, -1.529f, -0.64f, -2.035f)
                curveToRelative(-0.23f, -0.21f, -0.748f, -0.81f, -1.149f, -1.33f)
                curveToRelative(-0.402f, -0.52f, -0.786f, -0.946f, -0.854f, -0.946f)
                curveToRelative(-0.158f, 0.0f, -0.236f, 0.428f, -0.244f, 1.332f)
                curveToRelative(-0.006f, 0.595f, -0.03f, 0.696f, -0.205f, 0.88f)
                curveToRelative(-0.476f, 0.497f, -0.81f, 1.403f, -1.016f, 2.754f)
                curveToRelative(-0.046f, 0.3f, -0.085f, 0.355f, -0.279f, 0.398f)
                curveToRelative(-0.285f, 0.064f, -1.075f, 0.075f, -1.143f, 0.015f)
                curveToRelative(-0.059f, -0.05f, 0.044f, -0.863f, 0.278f, -2.19f)
                curveToRelative(0.088f, -0.504f, 0.185f, -1.18f, 0.214f, -1.503f)
                curveToRelative(0.053f, -0.574f, -0.065f, -1.65f, -0.204f, -1.867f)
                curveToRelative(-0.058f, -0.09f, -0.353f, -0.11f, -1.732f, -0.116f)
                curveToRelative(-0.915f, -0.003f, -1.918f, -0.033f, -2.23f, -0.066f)
                lineToRelative(-0.565f, -0.06f)
                verticalLineToRelative(0.25f)
                curveToRelative(0.0f, 0.27f, 0.07f, 0.506f, 0.53f, 1.822f)
                curveToRelative(0.162f, 0.464f, 0.397f, 1.17f, 0.523f, 1.57f)
                lineToRelative(0.227f, 0.728f)
                lineToRelative(-0.192f, 0.592f)
                arcToRelative(6.11f, 6.11f, 0.0f, false, true, -0.348f, 0.867f)
                curveToRelative(-0.152f, 0.266f, -0.17f, 0.274f, -0.595f, 0.27f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, -0.677f, -0.083f)
                close()
            }
        }
        .build()
        return _gunicorn!!
    }

private var _gunicorn: ImageVector? = null
