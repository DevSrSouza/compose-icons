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

public val SimpleIcons.Realm: VectorAsset
    get() {
        if (_realm != null) {
            return _realm!!
        }
        _realm = VectorAssetBuilder(name = "Realm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 0.059f)
                arcTo(12.122f, 12.122f, 0.0f, false, false, 3.52f, 3.564f)
                verticalLineToRelative(0.002f)
                curveTo(1.295f, 5.79f, 0.004f, 8.887f, 0.004f, 12.03f)
                curveToRelative(0.0f, 3.142f, 1.285f, 6.244f, 3.516f, 8.465f)
                lineToRelative(0.001f, 0.002f)
                arcTo(12.168f, 12.168f, 0.0f, false, false, 12.0f, 24.002f)
                horizontalLineToRelative(0.004f)
                curveToRelative(3.148f, 0.0f, 6.255f, -1.283f, 8.482f, -3.508f)
                lineToRelative(0.002f, -0.002f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, 3.516f, -8.457f)
                verticalLineToRelative(-0.004f)
                curveToRelative(0.0f, -3.141f, -1.287f, -6.243f, -3.518f, -8.465f)
                arcTo(12.116f, 12.116f, 0.0f, false, false, 12.004f, 0.06f)
                close()
                moveTo(12.004f, 1.395f)
                curveToRelative(0.48f, 0.0f, 0.96f, 0.046f, 1.435f, 0.113f)
                curveToRelative(-2.03f, 0.566f, -3.765f, 1.622f, -5.554f, 1.949f)
                arcToRelative(7.352f, 7.352f, 0.0f, false, true, -2.225f, 0.045f)
                curveToRelative(1.826f, -1.338f, 4.084f, -2.107f, 6.344f, -2.107f)
                close()
                moveTo(16.139f, 2.467f)
                curveToRelative(0.173f, 0.0f, 0.348f, 0.011f, 0.521f, 0.023f)
                arcToRelative(10.59f, 10.59f, 0.0f, false, true, 2.883f, 2.022f)
                curveToRelative(0.092f, 0.091f, 0.173f, 0.194f, 0.262f, 0.289f)
                arcToRelative(10.278f, 10.278f, 0.0f, false, true, -4.442f, 1.178f)
                curveToRelative(-2.43f, 0.06f, -4.958f, -0.794f, -7.69f, -0.823f)
                arcToRelative(12.662f, 12.662f, 0.0f, false, false, -4.362f, 0.744f)
                curveToRelative(0.32f, -0.457f, 0.672f, -0.893f, 1.062f, -1.293f)
                curveToRelative(1.223f, 0.322f, 2.5f, 0.39f, 3.748f, 0.164f)
                horizontalLineToRelative(0.002f)
                curveToRelative(2.264f, -0.412f, 4.133f, -1.625f, 6.049f, -2.08f)
                arcToRelative(8.342f, 8.342f, 0.0f, false, true, 1.967f, -0.224f)
                close()
                moveTo(20.674f, 5.871f)
                arcToRelative(10.87f, 10.87f, 0.0f, false, true, 1.433f, 2.824f)
                curveToRelative(-0.435f, -0.243f, -0.884f, -0.46f, -1.35f, -0.644f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(11.305f, 11.305f, 0.0f, false, false, -6.62f, -0.492f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-1.489f, 0.344f, -2.841f, 0.967f, -4.154f, 1.523f)
                curveToRelative(-0.468f, 0.198f, -0.933f, 0.383f, -1.399f, 0.553f)
                arcToRelative(10.83f, 10.83f, 0.0f, false, false, -1.445f, -0.256f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(9.578f, 9.578f, 0.0f, false, false, -4.194f, 0.549f)
                arcToRelative(8.125f, 8.125f, 0.0f, false, true, -1.244f, -0.535f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, true, 0.53f, -1.557f)
                curveToRelative(1.671f, -0.877f, 3.552f, -1.364f, 5.433f, -1.344f)
                curveToRelative(2.445f, 0.026f, 4.992f, 0.89f, 7.738f, 0.822f)
                horizontalLineToRelative(0.004f)
                arcToRelative(11.626f, 11.626f, 0.0f, false, false, 5.274f, -1.443f)
                close()
                moveTo(16.643f, 8.613f)
                curveToRelative(1.233f, 0.0f, 2.463f, 0.229f, 3.625f, 0.682f)
                arcToRelative(9.895f, 9.895f, 0.0f, false, true, 2.283f, 1.281f)
                curveToRelative(0.036f, 0.252f, 0.064f, 0.504f, 0.082f, 0.758f)
                curveToRelative(-0.734f, -0.187f, -1.488f, -0.3f, -2.244f, -0.328f)
                arcToRelative(10.28f, 10.28f, 0.0f, false, false, -3.201f, 0.38f)
                curveToRelative(-0.697f, 0.198f, -1.353f, 0.463f, -1.989f, 0.759f)
                curveToRelative(-1.087f, -0.371f, -2.166f, -0.86f, -3.277f, -1.336f)
                arcToRelative(35.107f, 35.107f, 0.0f, false, false, -1.324f, -0.538f)
                curveToRelative(1.3f, -0.552f, 2.554f, -1.113f, 3.834f, -1.41f)
                arcToRelative(9.968f, 9.968f, 0.0f, false, true, 2.21f, -0.248f)
                close()
                moveTo(5.877f, 10.676f)
                curveToRelative(0.374f, -0.016f, 0.75f, -0.005f, 1.125f, 0.031f)
                curveToRelative(1.475f, 0.148f, 2.935f, 0.704f, 4.393f, 1.33f)
                curveToRelative(0.717f, 0.309f, 1.453f, 0.625f, 2.203f, 0.928f)
                curveToRelative(-1.1f, 0.604f, -2.156f, 1.225f, -3.237f, 1.701f)
                curveToRelative(-1.05f, -0.394f, -2.131f, -0.758f, -3.302f, -0.918f)
                curveToRelative(-1.835f, -0.25f, -3.717f, 0.06f, -5.387f, 0.828f)
                arcToRelative(10.467f, 10.467f, 0.0f, false, true, -0.32f, -2.3f)
                curveToRelative(0.403f, -0.3f, 0.828f, -0.57f, 1.28f, -0.79f)
                arcToRelative(8.264f, 8.264f, 0.0f, false, true, 3.245f, -0.81f)
                close()
                moveTo(20.34f, 12.342f)
                curveToRelative(0.775f, 0.029f, 1.547f, 0.16f, 2.29f, 0.379f)
                arcToRelative(10.709f, 10.709f, 0.0f, false, true, -0.304f, 1.894f)
                curveToRelative(-0.67f, 0.438f, -1.383f, 0.807f, -2.139f, 1.08f)
                curveToRelative(-1.828f, 0.657f, -3.85f, 0.79f, -5.75f, 0.373f)
                curveToRelative(-0.78f, -0.17f, -1.557f, -0.45f, -2.341f, -0.75f)
                curveToRelative(1.889f, -0.973f, 3.598f, -2.119f, 5.457f, -2.646f)
                horizontalLineToRelative(0.002f)
                arcToRelative(8.954f, 8.954f, 0.0f, false, true, 2.785f, -0.33f)
                close()
                moveTo(5.508f, 15.006f)
                curveToRelative(0.458f, -0.016f, 0.916f, 0.005f, 1.369f, 0.066f)
                curveToRelative(2.354f, 0.322f, 4.617f, 1.718f, 7.275f, 2.301f)
                curveToRelative(0.357f, 0.078f, 0.717f, 0.134f, 1.078f, 0.178f)
                curveToRelative(-0.35f, 0.1f, -0.698f, 0.21f, -1.043f, 0.332f)
                verticalLineToRelative(0.002f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-1.283f, 0.462f, -2.455f, 1.042f, -3.637f, 1.388f)
                curveToRelative(-2.151f, 0.625f, -4.443f, 0.54f, -6.543f, -0.23f)
                arcToRelative(10.723f, 10.723f, 0.0f, false, true, -1.926f, -3.18f)
                arcToRelative(8.615f, 8.615f, 0.0f, false, true, 3.428f, -0.857f)
                close()
                moveTo(21.652f, 16.506f)
                curveToRelative(-0.067f, 0.145f, -0.133f, 0.291f, -0.207f, 0.433f)
                curveToRelative(-0.221f, -0.017f, -0.442f, -0.039f, -0.664f, -0.048f)
                curveToRelative(0.298f, -0.112f, 0.584f, -0.251f, 0.871f, -0.385f)
                close()
                moveTo(19.952f, 18.209f)
                curveToRelative(0.231f, -0.001f, 0.464f, 0.007f, 0.696f, 0.016f)
                curveToRelative(-0.333f, 0.465f, -0.696f, 0.912f, -1.105f, 1.324f)
                horizontalLineToRelative(-0.002f)
                verticalLineToRelative(0.002f)
                curveToRelative(-1.966f, 1.963f, -4.754f, 3.113f, -7.535f, 3.113f)
                arcToRelative(10.814f, 10.814f, 0.0f, false, true, -5.793f, -1.725f)
                curveToRelative(1.57f, 0.189f, 3.173f, 0.065f, 4.71f, -0.382f)
                horizontalLineToRelative(0.003f)
                curveToRelative(1.332f, -0.391f, 2.526f, -0.987f, 3.71f, -1.414f)
                arcToRelative(16.091f, 16.091f, 0.0f, false, true, 5.315f, -0.934f)
                close()
            }
        }
        .build()
        return _realm!!
    }

private var _realm: VectorAsset? = null
