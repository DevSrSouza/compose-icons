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

public val SimpleIcons.Ameba: ImageVector
    get() {
        if (_ameba != null) {
            return _ameba!!
        }
        _ameba = Builder(name = "Ameba", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.575f, 9.815f)
                curveToRelative(0.0f, -0.653f, 0.624f, -1.161f, 1.429f, -1.161f)
                reflectiveCurveToRelative(1.429f, 0.508f, 1.429f, 1.16f)
                curveToRelative(0.0f, 0.653f, -0.624f, 1.162f, -1.429f, 1.162f)
                reflectiveCurveToRelative(-1.429f, -0.509f, -1.429f, -1.161f)
                close()
                moveTo(16.107f, 0.0f)
                curveToRelative(-0.303f, 0.008f, -0.603f, 0.155f, -0.875f, 0.467f)
                curveToRelative(-0.397f, 0.46f, -1.111f, 1.268f, -1.6f, 1.748f)
                curveToRelative(-0.641f, 0.624f, -1.056f, 0.765f, -1.626f, 0.765f)
                curveToRelative(-0.57f, 0.0f, -0.978f, -0.132f, -1.629f, -0.765f)
                curveToRelative(-0.488f, -0.47f, -1.212f, -1.287f, -1.6f, -1.748f)
                curveToRelative(-0.435f, -0.49f, -0.94f, -0.566f, -1.42f, -0.336f)
                curveToRelative(-0.398f, 0.192f, -0.624f, 0.585f, -0.652f, 1.2f)
                arcToRelative(55.63f, 55.63f, 0.0f, false, false, -0.002f, 1.423f)
                curveToRelative(0.004f, 0.73f, 0.007f, 1.534f, -0.008f, 2.014f)
                curveToRelative(-0.027f, 0.96f, -0.099f, 1.543f, -0.496f, 2.378f)
                curveToRelative(-0.335f, 0.71f, -0.876f, 1.91f, -0.931f, 3.512f)
                arcToRelative(19.72f, 19.72f, 0.0f, false, false, 0.08f, 2.516f)
                curveToRelative(0.052f, 0.634f, 0.098f, 1.202f, 0.054f, 1.9f)
                curveToRelative(-0.072f, 1.113f, -0.48f, 1.66f, -1.066f, 2.065f)
                lineToRelative(-0.078f, 0.052f)
                curveToRelative(-0.728f, 0.503f, -1.133f, 0.783f, -1.36f, 1.358f)
                curveToRelative(-0.163f, 0.423f, -0.163f, 1.026f, 0.317f, 1.285f)
                curveToRelative(0.307f, 0.164f, 0.678f, 0.136f, 1.058f, -0.027f)
                curveToRelative(0.075f, -0.032f, 0.15f, -0.069f, 0.225f, -0.104f)
                curveToRelative(0.22f, -0.106f, 0.436f, -0.21f, 0.652f, -0.195f)
                curveToRelative(0.226f, 0.01f, 0.407f, 0.143f, 0.434f, 0.527f)
                curveToRelative(0.036f, 0.403f, 0.208f, 0.567f, 0.488f, 0.567f)
                curveToRelative(0.226f, 0.0f, 0.435f, -0.163f, 0.598f, -0.604f)
                lineToRelative(0.084f, -0.242f)
                curveToRelative(0.123f, -0.361f, 0.217f, -0.64f, 0.44f, -0.64f)
                curveToRelative(0.29f, 0.01f, 0.351f, 0.334f, 0.37f, 0.794f)
                curveToRelative(0.027f, 0.662f, -0.207f, 1.172f, -0.67f, 1.623f)
                curveToRelative(-0.532f, 0.518f, -0.93f, 1.009f, -0.785f, 1.65f)
                curveToRelative(0.1f, 0.453f, 0.57f, 0.75f, 1.31f, 0.788f)
                curveToRelative(0.76f, 0.029f, 1.99f, 0.038f, 2.84f, 0.02f)
                curveToRelative(0.797f, -0.02f, 1.258f, -0.385f, 1.348f, -0.874f)
                curveToRelative(0.057f, -0.29f, 0.002f, -0.482f, -0.052f, -0.666f)
                curveToRelative(-0.048f, -0.164f, -0.096f, -0.32f, -0.057f, -0.533f)
                curveToRelative(0.045f, -0.25f, 0.263f, -0.356f, 0.498f, -0.356f)
                reflectiveCurveToRelative(0.46f, 0.106f, 0.496f, 0.356f)
                curveToRelative(0.034f, 0.208f, -0.01f, 0.362f, -0.058f, 0.523f)
                curveToRelative(-0.054f, 0.187f, -0.112f, 0.381f, -0.05f, 0.676f)
                curveToRelative(0.1f, 0.48f, 0.552f, 0.844f, 1.348f, 0.873f)
                curveToRelative(0.85f, 0.02f, 2.08f, 0.01f, 2.83f, -0.03f)
                curveToRelative(0.742f, -0.037f, 1.212f, -0.335f, 1.311f, -0.786f)
                curveToRelative(0.145f, -0.643f, -0.251f, -1.124f, -0.785f, -1.65f)
                curveToRelative(-0.46f, -0.453f, -0.697f, -0.96f, -0.67f, -1.622f)
                curveToRelative(0.018f, -0.46f, 0.09f, -0.787f, 0.371f, -0.797f)
                curveToRelative(0.225f, -0.008f, 0.32f, 0.275f, 0.443f, 0.645f)
                curveToRelative(0.026f, 0.076f, 0.052f, 0.156f, 0.082f, 0.238f)
                curveToRelative(0.162f, 0.441f, 0.37f, 0.606f, 0.596f, 0.606f)
                curveToRelative(0.28f, 0.0f, 0.452f, -0.175f, 0.488f, -0.569f)
                curveToRelative(0.036f, -0.393f, 0.217f, -0.517f, 0.434f, -0.527f)
                curveToRelative(0.216f, -0.014f, 0.432f, 0.09f, 0.652f, 0.195f)
                curveToRelative(0.075f, 0.036f, 0.152f, 0.072f, 0.227f, 0.104f)
                curveToRelative(0.389f, 0.163f, 0.749f, 0.19f, 1.057f, 0.027f)
                curveToRelative(0.498f, -0.26f, 0.499f, -0.863f, 0.336f, -1.285f)
                curveToRelative(-0.232f, -0.587f, -0.642f, -0.867f, -1.409f, -1.39f)
                lineToRelative(-0.03f, -0.02f)
                curveToRelative(-0.589f, -0.403f, -0.995f, -0.952f, -1.067f, -2.065f)
                curveToRelative(-0.044f, -0.699f, 0.002f, -1.266f, 0.054f, -1.9f)
                curveToRelative(0.056f, -0.682f, 0.118f, -1.44f, 0.08f, -2.514f)
                curveToRelative(-0.054f, -1.593f, -0.594f, -2.803f, -0.93f, -3.513f)
                curveToRelative(-0.397f, -0.825f, -0.47f, -1.42f, -0.497f, -2.38f)
                arcToRelative(71.47f, 71.47f, 0.0f, false, true, -0.006f, -2.013f)
                curveToRelative(0.003f, -0.597f, 0.005f, -1.142f, -0.004f, -1.414f)
                curveToRelative(-0.018f, -0.605f, -0.254f, -0.997f, -0.643f, -1.2f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, false, -0.545f, -0.13f)
                close()
                moveTo(8.507f, 7.08f)
                horizontalLineToRelative(0.032f)
                curveToRelative(0.335f, 0.0f, 0.615f, 0.287f, 0.615f, 0.652f)
                curveToRelative(0.0f, 0.355f, -0.27f, 0.653f, -0.615f, 0.653f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, -0.613f, -0.653f)
                curveToRelative(0.0f, -0.343f, 0.254f, -0.634f, 0.582f, -0.652f)
                close()
                moveTo(15.436f, 7.08f)
                horizontalLineToRelative(0.033f)
                curveToRelative(0.334f, 0.0f, 0.613f, 0.287f, 0.613f, 0.652f)
                curveToRelative(0.0f, 0.355f, -0.27f, 0.653f, -0.613f, 0.653f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, -0.615f, -0.653f)
                curveToRelative(0.0f, -0.343f, 0.253f, -0.634f, 0.582f, -0.652f)
                close()
                moveTo(11.994f, 8.326f)
                curveToRelative(1.447f, 0.0f, 2.488f, 0.346f, 3.483f, 1.248f)
                curveToRelative(0.687f, 0.624f, 1.14f, 1.862f, 0.597f, 2.783f)
                curveToRelative(-0.262f, 0.47f, -0.769f, 0.846f, -1.375f, 0.903f)
                curveToRelative(-0.805f, 0.077f, -1.302f, -0.23f, -1.619f, -0.604f)
                curveToRelative(-0.307f, -0.356f, -0.633f, -0.691f, -1.094f, -0.691f)
                curveToRelative(-0.46f, 0.0f, -0.786f, 0.334f, -1.093f, 0.69f)
                curveToRelative(-0.317f, 0.374f, -0.824f, 0.682f, -1.62f, 0.605f)
                arcToRelative(1.803f, 1.803f, 0.0f, false, true, -1.375f, -0.903f)
                curveToRelative(-0.515f, -0.93f, -0.071f, -2.169f, 0.616f, -2.783f)
                curveToRelative(1.004f, -0.902f, 2.033f, -1.248f, 3.48f, -1.248f)
                close()
                moveTo(12.004f, 14.604f)
                curveToRelative(1.574f, 0.0f, 2.867f, 1.363f, 2.867f, 3.042f)
                curveToRelative(0.0f, 1.68f, -1.284f, 3.043f, -2.867f, 3.043f)
                curveToRelative(-1.582f, 0.0f, -2.867f, -1.363f, -2.867f, -3.043f)
                curveToRelative(0.0f, -1.68f, 1.285f, -3.042f, 2.867f, -3.042f)
                close()
            }
        }
        .build()
        return _ameba!!
    }

private var _ameba: ImageVector? = null
