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

public val SimpleIcons.Lua: VectorAsset
    get() {
        if (_lua != null) {
            return _lua!!
        }
        _lua = VectorAssetBuilder(name = "Lua", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.38f, 10.377f)
                lineToRelative(-0.272f, -0.037f)
                curveToRelative(-0.048f, 0.344f, -0.082f, 0.695f, -0.101f, 1.041f)
                lineToRelative(0.275f, 0.016f)
                curveToRelative(0.018f, -0.34f, 0.051f, -0.682f, 0.098f, -1.02f)
                close()
                moveTo(4.136f, 3.289f)
                lineToRelative(-0.184f, -0.205f)
                curveToRelative(-0.258f, 0.232f, -0.509f, 0.48f, -0.746f, 0.734f)
                lineToRelative(0.202f, 0.188f)
                curveToRelative(0.231f, -0.248f, 0.476f, -0.49f, 0.728f, -0.717f)
                close()
                moveTo(5.769f, 2.059f)
                lineToRelative(-0.146f, -0.235f)
                curveToRelative(-0.296f, 0.186f, -0.586f, 0.385f, -0.863f, 0.594f)
                lineToRelative(0.166f, 0.219f)
                curveToRelative(0.27f, -0.203f, 0.554f, -0.399f, 0.843f, -0.578f)
                close()
                moveTo(1.824f, 18.369f)
                curveToRelative(0.185f, 0.297f, 0.384f, 0.586f, 0.593f, 0.863f)
                lineToRelative(0.22f, -0.164f)
                curveToRelative(-0.205f, -0.271f, -0.399f, -0.555f, -0.58f, -0.844f)
                lineToRelative(-0.233f, 0.145f)
                close()
                moveTo(1.127f, 16.402f)
                lineToRelative(-0.255f, 0.104f)
                curveToRelative(0.129f, 0.318f, 0.274f, 0.635f, 0.431f, 0.943f)
                lineToRelative(0.005f, 0.01f)
                lineToRelative(0.245f, -0.125f)
                lineToRelative(-0.005f, -0.01f)
                curveToRelative(-0.153f, -0.301f, -0.295f, -0.611f, -0.421f, -0.922f)
                close()
                moveTo(0.298f, 9.309f)
                lineToRelative(0.269f, 0.063f)
                curveToRelative(0.076f, -0.332f, 0.168f, -0.664f, 0.272f, -0.986f)
                lineToRelative(-0.261f, -0.087f)
                curveToRelative(-0.108f, 0.332f, -0.202f, 0.672f, -0.28f, 1.01f)
                close()
                moveTo(0.274f, 12.42f)
                lineToRelative(-0.275f, 0.01f)
                curveToRelative(0.012f, 0.348f, 0.04f, 0.699f, 0.083f, 1.043f)
                lineToRelative(0.273f, -0.033f)
                curveToRelative(-0.042f, -0.336f, -0.069f, -0.68f, -0.081f, -1.02f)
                close()
                moveTo(0.256f, 14.506f)
                curveToRelative(0.073f, 0.34f, 0.162f, 0.682f, 0.264f, 1.014f)
                lineToRelative(0.263f, -0.08f)
                curveToRelative(-0.1f, -0.326f, -0.187f, -0.658f, -0.258f, -0.99f)
                lineToRelative(-0.269f, 0.056f)
                close()
                moveTo(11.573f, 0.275f)
                lineTo(11.563f, 0.0f)
                curveToRelative(-0.348f, 0.012f, -0.699f, 0.039f, -1.044f, 0.082f)
                lineToRelative(0.034f, 0.273f)
                curveToRelative(0.338f, -0.041f, 0.68f, -0.068f, 1.02f, -0.08f)
                close()
                moveTo(23.221f, 8.566f)
                curveToRelative(0.1f, 0.326f, 0.186f, 0.66f, 0.256f, 0.992f)
                lineToRelative(0.27f, -0.059f)
                curveToRelative(-0.072f, -0.34f, -0.16f, -0.682f, -0.262f, -1.014f)
                lineToRelative(-0.264f, 0.081f)
                close()
                moveTo(17.621f, 1.389f)
                curveToRelative(-0.309f, -0.164f, -0.627f, -0.314f, -0.947f, -0.449f)
                lineToRelative(-0.107f, 0.252f)
                curveToRelative(0.314f, 0.133f, 0.625f, 0.281f, 0.926f, 0.439f)
                lineToRelative(0.128f, -0.242f)
                close()
                moveTo(15.693f, 0.572f)
                curveToRelative(-0.332f, -0.105f, -0.67f, -0.199f, -1.01f, -0.277f)
                lineToRelative(-0.063f, 0.268f)
                curveToRelative(0.332f, 0.076f, 0.664f, 0.168f, 0.988f, 0.273f)
                lineToRelative(0.085f, -0.264f)
                close()
                moveTo(6.674f, 1.545f)
                curveToRelative(0.298f, -0.15f, 0.606f, -0.291f, 0.916f, -0.418f)
                lineTo(7.486f, 0.873f)
                curveToRelative(-0.317f, 0.127f, -0.632f, 0.272f, -0.937f, 0.428f)
                lineToRelative(-0.015f, 0.008f)
                lineToRelative(0.125f, 0.244f)
                lineToRelative(0.015f, -0.008f)
                close()
                moveTo(23.727f, 11.588f)
                lineToRelative(0.275f, -0.01f)
                arcToRelative(11.797f, 11.797f, 0.0f, false, false, -0.082f, -1.045f)
                lineToRelative(-0.273f, 0.033f)
                curveToRelative(0.041f, 0.338f, 0.068f, 0.682f, 0.08f, 1.022f)
                close()
                moveTo(13.654f, 0.105f)
                curveToRelative(-0.346f, -0.047f, -0.696f, -0.08f, -1.043f, -0.098f)
                lineToRelative(-0.014f, 0.273f)
                curveToRelative(0.339f, 0.018f, 0.683f, 0.051f, 1.019f, 0.098f)
                lineToRelative(0.038f, -0.273f)
                close()
                moveTo(9.544f, 0.527f)
                lineToRelative(-0.058f, -0.27f)
                curveToRelative(-0.34f, 0.072f, -0.681f, 0.16f, -1.014f, 0.264f)
                lineToRelative(0.081f, 0.262f)
                curveToRelative(0.325f, -0.099f, 0.659f, -0.185f, 0.991f, -0.256f)
                close()
                moveTo(1.921f, 5.469f)
                lineToRelative(0.231f, 0.15f)
                curveToRelative(0.185f, -0.285f, 0.384f, -0.566f, 0.592f, -0.834f)
                lineToRelative(-0.217f, -0.17f)
                curveToRelative(-0.213f, 0.276f, -0.417f, 0.563f, -0.606f, 0.854f)
                close()
                moveTo(0.943f, 7.318f)
                lineToRelative(0.253f, 0.107f)
                curveToRelative(0.132f, -0.313f, 0.28f, -0.625f, 0.439f, -0.924f)
                lineToRelative(-0.243f, -0.128f)
                curveToRelative(-0.163f, 0.307f, -0.314f, 0.625f, -0.449f, 0.945f)
                close()
                moveTo(18.223f, 21.943f)
                lineToRelative(0.145f, 0.234f)
                curveToRelative(0.295f, -0.186f, 0.586f, -0.385f, 0.863f, -0.594f)
                lineToRelative(-0.164f, -0.219f)
                curveToRelative(-0.272f, 0.204f, -0.557f, 0.4f, -0.844f, 0.579f)
                close()
                moveTo(21.248f, 19.219f)
                lineToRelative(0.217f, 0.17f)
                curveToRelative(0.215f, -0.273f, 0.418f, -0.561f, 0.607f, -0.854f)
                lineToRelative(-0.23f, -0.148f)
                curveToRelative(-0.186f, 0.285f, -0.385f, 0.564f, -0.594f, 0.832f)
                close()
                moveTo(19.855f, 20.715f)
                lineToRelative(0.184f, 0.203f)
                curveToRelative(0.258f, -0.23f, 0.51f, -0.479f, 0.746f, -0.732f)
                lineToRelative(-0.201f, -0.188f)
                curveToRelative(-0.23f, 0.248f, -0.477f, 0.488f, -0.729f, 0.717f)
                close()
                moveTo(22.359f, 17.504f)
                lineToRelative(0.244f, 0.129f)
                curveToRelative(0.162f, -0.307f, 0.314f, -0.625f, 0.449f, -0.945f)
                lineToRelative(-0.254f, -0.107f)
                arcToRelative(11.27f, 11.27f, 0.0f, false, true, -0.439f, 0.923f)
                close()
                moveTo(23.617f, 13.629f)
                lineToRelative(0.273f, 0.039f)
                curveToRelative(0.049f, -0.346f, 0.082f, -0.695f, 0.102f, -1.043f)
                lineToRelative(-0.275f, -0.014f)
                curveToRelative(-0.018f, 0.338f, -0.051f, 0.682f, -0.1f, 1.018f)
                close()
                moveTo(23.156f, 15.621f)
                lineToRelative(0.264f, 0.086f)
                curveToRelative(0.107f, -0.332f, 0.201f, -0.67f, 0.279f, -1.01f)
                lineToRelative(-0.268f, -0.063f)
                curveToRelative(-0.077f, 0.333f, -0.169f, 0.665f, -0.275f, 0.987f)
                close()
                moveTo(22.453f, 6.672f)
                curveToRelative(0.154f, 0.303f, 0.297f, 0.617f, 0.424f, 0.932f)
                lineToRelative(0.256f, -0.104f)
                curveToRelative(-0.131f, -0.322f, -0.277f, -0.643f, -0.436f, -0.953f)
                lineToRelative(-0.244f, 0.125f)
                close()
                moveTo(8.296f, 23.418f)
                curveToRelative(0.331f, 0.107f, 0.67f, 0.201f, 1.009f, 0.279f)
                lineToRelative(0.062f, -0.268f)
                curveToRelative(-0.331f, -0.076f, -0.663f, -0.168f, -0.986f, -0.273f)
                lineToRelative(-0.085f, 0.262f)
                close()
                moveTo(10.335f, 23.889f)
                curveToRelative(0.345f, 0.049f, 0.696f, 0.082f, 1.043f, 0.102f)
                lineToRelative(0.014f, -0.275f)
                curveToRelative(-0.339f, -0.018f, -0.682f, -0.051f, -1.019f, -0.098f)
                lineToRelative(-0.038f, 0.271f)
                close()
                moveTo(17.326f, 22.449f)
                curveToRelative(-0.303f, 0.154f, -0.613f, 0.297f, -0.926f, 0.424f)
                lineToRelative(0.104f, 0.256f)
                curveToRelative(0.318f, -0.131f, 0.639f, -0.275f, 0.947f, -0.434f)
                lineToRelative(0.004f, -0.002f)
                lineToRelative(-0.123f, -0.246f)
                lineToRelative(-0.006f, 0.002f)
                close()
                moveTo(4.613f, 21.467f)
                curveToRelative(0.274f, 0.213f, 0.562f, 0.418f, 0.854f, 0.605f)
                lineToRelative(0.149f, -0.23f)
                curveToRelative(-0.285f, -0.184f, -0.565f, -0.385f, -0.833f, -0.592f)
                lineToRelative(-0.17f, 0.217f)
                close()
                moveTo(12.417f, 23.725f)
                lineToRelative(0.009f, 0.275f)
                curveToRelative(0.348f, -0.014f, 0.699f, -0.041f, 1.045f, -0.084f)
                lineToRelative(-0.035f, -0.271f)
                curveToRelative(-0.336f, 0.041f, -0.68f, 0.068f, -1.019f, 0.08f)
                close()
                moveTo(6.37f, 22.604f)
                curveToRelative(0.307f, 0.162f, 0.625f, 0.314f, 0.946f, 0.449f)
                lineToRelative(0.107f, -0.254f)
                curveToRelative(-0.313f, -0.133f, -0.624f, -0.279f, -0.924f, -0.439f)
                lineToRelative(-0.129f, 0.244f)
                close()
                moveTo(3.083f, 20.041f)
                curveToRelative(0.233f, 0.258f, 0.48f, 0.51f, 0.734f, 0.746f)
                lineToRelative(0.188f, -0.201f)
                curveToRelative(-0.249f, -0.23f, -0.49f, -0.477f, -0.717f, -0.729f)
                lineToRelative(-0.205f, 0.184f)
                close()
                moveTo(14.445f, 23.475f)
                lineToRelative(0.059f, 0.27f)
                curveToRelative(0.34f, -0.074f, 0.68f, -0.162f, 1.014f, -0.266f)
                lineToRelative(-0.082f, -0.262f)
                curveToRelative(-0.325f, 0.099f, -0.659f, 0.185f, -0.991f, 0.258f)
                close()
                moveTo(21.18f, 0.129f)
                arcTo(2.689f, 2.689f, 0.0f, true, false, 21.18f, 5.507f)
                arcTo(2.689f, 2.689f, 0.0f, true, false, 21.18f, 0.129f)
                close()
                moveTo(15.324f, 15.447f)
                curveToRelative(0.0f, 0.471f, 0.314f, 0.66f, 0.852f, 0.66f)
                curveToRelative(0.67f, 0.0f, 1.297f, -0.396f, 1.297f, -1.016f)
                verticalLineToRelative(-0.645f)
                curveToRelative(-0.23f, 0.107f, -0.379f, 0.141f, -1.107f, 0.24f)
                curveToRelative(-0.735f, 0.109f, -1.042f, 0.306f, -1.042f, 0.761f)
                close()
                moveTo(12.0f, 2.818f)
                curveToRelative(-5.07f, 0.0f, -9.18f, 4.109f, -9.18f, 9.18f)
                curveToRelative(0.0f, 5.068f, 4.11f, 9.18f, 9.18f, 9.18f)
                curveToRelative(5.07f, 0.0f, 9.18f, -4.111f, 9.18f, -9.18f)
                curveToRelative(0.0f, -5.07f, -4.11f, -9.18f, -9.18f, -9.18f)
                close()
                moveTo(9.513f, 16.588f)
                lineTo(5.771f, 16.588f)
                verticalLineToRelative(-6.023f)
                horizontalLineToRelative(0.769f)
                verticalLineToRelative(5.346f)
                horizontalLineToRelative(2.974f)
                verticalLineToRelative(0.677f)
                close()
                moveTo(13.643f, 16.588f)
                horizontalLineToRelative(-0.619f)
                verticalLineToRelative(-0.67f)
                curveToRelative(-0.405f, 0.57f, -0.811f, 0.793f, -1.446f, 0.793f)
                curveToRelative(-0.843f, 0.0f, -1.38f, -0.463f, -1.38f, -1.182f)
                verticalLineToRelative(-3.271f)
                horizontalLineToRelative(0.686f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.52f, 0.347f, 0.85f, 0.893f, 0.85f)
                curveToRelative(0.719f, 0.0f, 1.181f, -0.578f, 1.181f, -1.461f)
                verticalLineToRelative(-2.389f)
                horizontalLineToRelative(0.686f)
                verticalLineToRelative(4.33f)
                close()
                moveTo(13.113f, 8.195f)
                curveToRelative(0.0f, -1.484f, 1.205f, -2.689f, 2.689f, -2.689f)
                reflectiveCurveToRelative(2.688f, 1.205f, 2.688f, 2.689f)
                reflectiveCurveToRelative(-1.203f, 2.688f, -2.688f, 2.688f)
                reflectiveCurveToRelative(-2.689f, -1.203f, -2.689f, -2.688f)
                close()
                moveTo(18.68f, 16.051f)
                verticalLineToRelative(0.52f)
                curveToRelative(-0.223f, 0.059f, -0.33f, 0.074f, -0.471f, 0.074f)
                curveToRelative(-0.34f, 0.0f, -0.637f, -0.238f, -0.711f, -0.57f)
                curveToRelative(-0.381f, 0.406f, -0.918f, 0.637f, -1.471f, 0.637f)
                curveToRelative(-0.877f, 0.0f, -1.422f, -0.463f, -1.422f, -1.248f)
                curveToRelative(0.0f, -0.527f, 0.256f, -0.916f, 0.76f, -1.123f)
                curveToRelative(0.266f, -0.107f, 0.414f, -0.141f, 1.389f, -0.264f)
                curveToRelative(0.545f, -0.066f, 0.719f, -0.191f, 0.719f, -0.48f)
                verticalLineToRelative(-0.182f)
                curveToRelative(0.0f, -0.412f, -0.348f, -0.645f, -0.967f, -0.645f)
                curveToRelative(-0.645f, 0.0f, -0.957f, 0.24f, -1.016f, 0.77f)
                horizontalLineToRelative(-0.693f)
                curveToRelative(0.041f, -1.0f, 0.686f, -1.404f, 1.734f, -1.404f)
                curveToRelative(1.066f, 0.0f, 1.627f, 0.412f, 1.627f, 1.182f)
                verticalLineToRelative(2.412f)
                curveToRelative(0.0f, 0.215f, 0.133f, 0.338f, 0.373f, 0.338f)
                curveToRelative(0.041f, -0.002f, 0.074f, -0.002f, 0.149f, -0.017f)
                close()
            }
        }
        .build()
        return _lua!!
    }

private var _lua: VectorAsset? = null
