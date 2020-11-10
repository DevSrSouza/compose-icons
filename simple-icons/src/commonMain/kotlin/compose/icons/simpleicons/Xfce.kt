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

public val SimpleIcons.Xfce: VectorAsset
    get() {
        if (_xfce != null) {
            return _xfce!!
        }
        _xfce = VectorAssetBuilder(name = "Xfce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.01f, 5.756f)
                curveToRelative(-0.128f, 0.07f, 1.019f, 0.82f, 3.161f, 1.706f)
                curveToRelative(2.143f, 0.886f, 5.103f, 3.13f, 4.87f, 3.493f)
                curveToRelative(-0.695f, 0.984f, -1.105f, 2.162f, -0.822f, 4.178f)
                curveToRelative(0.051f, 0.355f, -1.047f, 0.97f, -0.968f, 1.506f)
                curveToRelative(0.067f, 0.408f, 1.228f, -0.403f, 1.355f, -0.243f)
                curveToRelative(0.078f, 0.288f, -0.621f, 1.743f, -0.338f, 1.847f)
                curveToRelative(0.206f, 0.062f, 2.023f, -1.73f, 2.129f, -1.7f)
                curveToRelative(2.995f, 0.908f, 6.892f, 0.222f, 6.967f, 0.194f)
                curveToRelative(-0.007f, -0.016f, 2.804f, 1.326f, 3.049f, 1.166f)
                curveToRelative(0.616f, -0.67f, -1.169f, -1.615f, -0.871f, -1.992f)
                curveToRelative(0.13f, -0.198f, 2.173f, 0.742f, 2.274f, 0.485f)
                curveToRelative(0.146f, -0.443f, -0.948f, -1.375f, -1.113f, -1.651f)
                curveToRelative(-0.143f, -0.255f, -0.174f, -0.666f, 0.194f, -0.924f)
                curveToRelative(0.367f, -0.257f, 4.125f, -1.7f, 3.967f, -2.818f)
                curveToRelative(-0.272f, -2.03f, -4.766f, -2.161f, -4.839f, -2.332f)
                curveToRelative(-0.034f, -0.08f, 0.199f, -2.902f, -1.112f, -2.38f)
                curveToRelative(-0.808f, 0.301f, -0.15f, 2.099f, -0.097f, 2.332f)
                curveToRelative(0.048f, 0.214f, -0.359f, 0.19f, -0.436f, 0.097f)
                curveToRelative(-0.17f, -0.21f, -0.736f, -2.084f, -1.403f, -1.75f)
                curveToRelative(-0.935f, 0.518f, -0.055f, 2.135f, -0.242f, 2.187f)
                curveToRelative(-0.346f, 0.195f, -0.326f, 0.67f, -0.604f, 1.056f)
                curveToRelative(-0.458f, 0.66f, -3.886f, -0.309f, -4.994f, -0.376f)
                curveToRelative(-0.811f, -0.048f, -1.586f, 0.62f, -1.66f, 0.535f)
                curveToRelative(-0.987f, -0.993f, -3.03f, -2.722f, -5.27f, -3.297f)
                curveTo(1.953f, 6.733f, 0.086f, 5.743f, 0.01f, 5.755f)
                close()
                moveTo(22.876f, 7.572f)
                curveToRelative(-0.068f, -0.018f, -0.382f, 1.593f, -0.234f, 1.665f)
                curveToRelative(0.13f, 0.097f, 0.355f, -1.576f, 0.237f, -1.662f)
                lineToRelative(-0.003f, -0.002f)
                close()
                moveTo(23.983f, 7.785f)
                curveToRelative(-0.17f, -0.003f, -1.076f, 1.449f, -0.867f, 1.603f)
                curveToRelative(0.129f, 0.098f, 0.937f, -1.543f, 0.881f, -1.598f)
                arcToRelative(0.024f, 0.024f, 0.0f, false, false, -0.014f, -0.005f)
                close()
                moveTo(19.598f, 9.553f)
                arcToRelative(0.388f, 0.444f, 0.0f, false, true, 0.388f, 0.443f)
                arcToRelative(0.388f, 0.444f, 0.0f, false, true, -0.388f, 0.444f)
                arcToRelative(0.388f, 0.444f, 0.0f, false, true, -0.388f, -0.444f)
                arcToRelative(0.388f, 0.444f, 0.0f, false, true, 0.388f, -0.443f)
                close()
                moveTo(18.727f, 9.823f)
                curveToRelative(0.165f, 0.714f, 0.422f, 0.94f, 1.194f, 0.918f)
                curveToRelative(-0.983f, 0.905f, -1.58f, -0.645f, -1.194f, -0.919f)
                close()
                moveTo(20.852f, 11.69f)
                curveToRelative(0.04f, 0.0f, 0.071f, 0.011f, 0.092f, 0.03f)
                curveToRelative(0.387f, 0.141f, -1.664f, 0.883f, -1.678f, 0.778f)
                curveToRelative(-0.021f, -0.075f, 1.197f, -0.823f, 1.586f, -0.808f)
                close()
                moveTo(21.06f, 12.165f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, 0.056f, 0.009f)
                curveToRelative(0.365f, 0.364f, -1.157f, 1.173f, -1.14f, 1.144f)
                curveToRelative(-0.123f, -0.074f, 0.766f, -1.129f, 1.084f, -1.154f)
                close()
            }
        }
        .build()
        return _xfce!!
    }

private var _xfce: VectorAsset? = null
