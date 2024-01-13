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

public val SimpleIcons.Authelia: ImageVector
    get() {
        if (_authelia != null) {
            return _authelia!!
        }
        _authelia = Builder(name = "Authelia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.624f, 0.191f)
                curveToRelative(-0.324f, 0.023f, -0.655f, 0.011f, -0.97f, 0.073f)
                curveToRelative(-2.883f, 0.568f, -5.244f, 2.01f, -7.074f, 4.3f)
                curveTo(1.42f, 6.014f, 0.624f, 7.652f, 0.243f, 9.48f)
                curveToRelative(-0.25f, 1.2f, -0.294f, 2.402f, -0.191f, 3.627f)
                curveToRelative(0.237f, 2.832f, 1.377f, 5.233f, 3.345f, 7.26f)
                curveToRelative(0.332f, 0.341f, 0.775f, 0.348f, 1.1f, 0.055f)
                curveToRelative(0.39f, -0.35f, 0.442f, -0.735f, 0.124f, -1.149f)
                curveToRelative(-0.271f, -0.353f, -0.588f, -0.671f, -0.85f, -1.03f)
                curveToRelative(-1.625f, -2.208f, -2.343f, -4.674f, -2.04f, -7.411f)
                curveToRelative(0.305f, -2.773f, 1.6f, -5.022f, 3.723f, -6.795f)
                curveToRelative(1.517f, -1.267f, 3.288f, -1.983f, 5.248f, -2.24f)
                curveToRelative(0.272f, -0.037f, 0.552f, -0.083f, 0.803f, -0.186f)
                curveToRelative(0.32f, -0.132f, 0.478f, -0.564f, 0.4f, -0.923f)
                curveToRelative(-0.085f, -0.384f, -0.355f, -0.483f, -0.702f, -0.477f)
                curveToRelative(-0.194f, 0.004f, -0.387f, 0.0f, -0.58f, 0.0f)
                verticalLineToRelative(-0.02f)
                close()
                moveTo(15.263f, 3.601f)
                curveToRelative(-0.312f, -0.008f, -0.582f, 0.197f, -0.722f, 0.512f)
                curveToRelative(-0.176f, 0.4f, -0.027f, 0.854f, 0.367f, 1.096f)
                curveToRelative(0.123f, 0.075f, 0.256f, 0.134f, 0.385f, 0.199f)
                curveToRelative(1.485f, 0.737f, 2.619f, 1.834f, 3.319f, 3.342f)
                curveToRelative(0.257f, 0.554f, 0.423f, 1.15f, 0.636f, 1.726f)
                curveToRelative(0.162f, 0.441f, 0.509f, 0.656f, 0.92f, 0.579f)
                curveToRelative(0.425f, -0.08f, 0.67f, -0.392f, 0.668f, -0.952f)
                curveToRelative(-0.016f, -0.081f, -0.035f, -0.261f, -0.082f, -0.435f)
                curveToRelative(-0.535f, -1.97f, -1.579f, -3.616f, -3.21f, -4.847f)
                curveToRelative(-0.598f, -0.453f, -1.28f, -0.812f, -1.958f, -1.14f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, false, -0.323f, -0.08f)
                close()
                moveTo(8.324f, 3.831f)
                arcToRelative(0.903f, 0.903f, 0.0f, false, false, -0.492f, 0.144f)
                curveToRelative(-0.648f, 0.388f, -1.325f, 0.764f, -1.88f, 1.266f)
                curveToRelative(-2.323f, 2.098f, -3.262f, 4.755f, -2.905f, 7.84f)
                curveToRelative(0.55f, 4.74f, 4.6f, 8.021f, 8.9f, 7.904f)
                lineToRelative(0.868f, -0.001f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.109f, -0.007f)
                curveToRelative(2.491f, -0.312f, 4.58f, -1.387f, 6.146f, -3.36f)
                curveToRelative(0.488f, -0.615f, 0.86f, -1.336f, 1.2f, -2.049f)
                curveToRelative(0.248f, -0.523f, -0.032f, -0.982f, -0.56f, -1.12f)
                curveToRelative(-0.38f, -0.1f, -0.72f, 0.112f, -0.974f, 0.509f)
                curveToRelative(-0.473f, 0.737f, -0.89f, 1.54f, -1.491f, 2.16f)
                curveToRelative(-1.479f, 1.52f, -3.322f, 2.28f, -5.466f, 2.199f)
                curveToRelative(-2.405f, -0.091f, -4.337f, -1.127f, -5.758f, -3.056f)
                curveToRelative(-1.088f, -1.475f, -1.49f, -3.168f, -1.32f, -4.984f)
                curveToRelative(0.184f, -1.987f, 1.038f, -3.644f, 2.57f, -4.927f)
                curveToRelative(0.423f, -0.354f, 0.908f, -0.633f, 1.365f, -0.946f)
                curveToRelative(0.458f, -0.314f, 0.568f, -0.715f, 0.314f, -1.15f)
                curveToRelative(-0.153f, -0.262f, -0.371f, -0.413f, -0.626f, -0.422f)
                close()
                moveTo(11.741f, 5.998f)
                curveTo(8.724f, 6.056f, 6.02f, 8.625f, 6.0f, 12.0f)
                curveTo(5.98f, 15.29f, 8.712f, 18.017f, 12.0f, 18.02f)
                curveToRelative(3.339f, 0.005f, 6.078f, -2.618f, 6.062f, -6.025f)
                curveTo(18.048f, 8.45f, 15.192f, 5.911f, 12.034f, 6.0f)
                arcToRelative(5.726f, 5.726f, 0.0f, false, false, -0.293f, -0.002f)
                close()
                moveTo(22.493f, 7.162f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.137f, 0.002f)
                curveToRelative(-0.404f, 0.033f, -0.642f, 0.295f, -0.74f, 0.646f)
                curveToRelative(-0.053f, 0.187f, -0.01f, 0.432f, 0.064f, 0.62f)
                arcToRelative(9.546f, 9.546f, 0.0f, false, true, 0.648f, 3.753f)
                arcToRelative(9.994f, 9.994f, 0.0f, false, true, -1.32f, 4.76f)
                curveToRelative(-1.617f, 2.84f, -4.04f, 4.53f, -7.243f, 5.12f)
                curveToRelative(-0.343f, 0.063f, -0.694f, 0.095f, -1.033f, 0.174f)
                curveToRelative(-0.434f, 0.103f, -0.688f, 0.473f, -0.641f, 0.882f)
                curveToRelative(0.044f, 0.38f, 0.34f, 0.646f, 0.769f, 0.684f)
                curveToRelative(0.132f, 0.012f, 0.265f, 0.002f, 0.398f, 0.002f)
                lineToRelative(-0.001f, -0.003f)
                curveToRelative(0.145f, 0.0f, 0.29f, 0.005f, 0.434f, -0.002f)
                curveToRelative(0.084f, -0.004f, 0.167f, -0.028f, 0.25f, -0.04f)
                curveToRelative(1.847f, -0.282f, 3.518f, -0.99f, 5.037f, -2.068f)
                curveToRelative(1.708f, -1.213f, 3.001f, -2.78f, 3.897f, -4.665f)
                curveToRelative(1.1f, -2.317f, 1.375f, -4.752f, 0.906f, -7.264f)
                curveToRelative(-0.13f, -0.694f, -0.354f, -1.376f, -0.584f, -2.046f)
                curveToRelative(-0.125f, -0.362f, -0.389f, -0.537f, -0.704f, -0.555f)
                close()
                moveTo(12.044f, 8.024f)
                curveToRelative(0.13f, 0.0f, 0.261f, 0.016f, 0.392f, 0.05f)
                curveToRelative(0.708f, 0.18f, 1.16f, 0.787f, 1.158f, 1.553f)
                curveToRelative(0.027f, 0.504f, -0.211f, 0.888f, -0.588f, 1.183f)
                curveToRelative(-0.207f, 0.163f, -0.236f, 0.32f, -0.176f, 0.558f)
                curveToRelative(0.264f, 1.052f, 0.52f, 2.107f, 0.763f, 3.164f)
                curveToRelative(0.13f, 0.568f, -0.019f, 0.872f, -0.522f, 1.174f)
                curveToRelative(-0.675f, 0.404f, -1.666f, 0.354f, -2.29f, -0.13f)
                curveToRelative(-0.315f, -0.244f, -0.427f, -0.573f, -0.331f, -0.966f)
                curveToRelative(0.252f, -1.031f, 0.494f, -2.064f, 0.762f, -3.09f)
                curveToRelative(0.086f, -0.33f, 0.041f, -0.554f, -0.225f, -0.794f)
                curveToRelative(-0.581f, -0.523f, -0.682f, -1.253f, -0.317f, -1.903f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, 1.374f, -0.8f)
                close()
            }
        }
        .build()
        return _authelia!!
    }

private var _authelia: ImageVector? = null
