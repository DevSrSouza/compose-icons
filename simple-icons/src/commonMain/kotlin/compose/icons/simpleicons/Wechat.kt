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

public val SimpleIcons.Wechat: VectorAsset
    get() {
        if (_wechat != null) {
            return _wechat!!
        }
        _wechat = VectorAssetBuilder(name = "Wechat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.541f, 12.748f)
                curveToRelative(-0.609f, -1.38f, -1.758f, -2.476f, -3.092f, -3.151f)
                curveToRelative(-2.354f, -1.192f, -5.281f, -1.185f, -7.629f, 0.03f)
                curveToRelative(-1.631f, 0.837f, -2.993f, 2.337f, -3.379f, 4.162f)
                curveToRelative(-0.318f, 1.344f, -0.033f, 2.791f, 0.68f, 3.961f)
                curveToRelative(1.061f, 1.762f, 2.979f, 2.887f, 4.971f, 3.248f)
                curveToRelative(1.443f, 0.293f, 2.936f, 0.119f, 4.338f, -0.285f)
                curveToRelative(0.842f, 0.326f, 1.592f, 0.854f, 2.408f, 1.246f)
                curveToRelative(-0.211f, -0.707f, -0.436f, -1.406f, -0.676f, -2.102f)
                curveToRelative(0.916f, -0.65f, 1.746f, -1.461f, 2.244f, -2.479f)
                curveToRelative(0.744f, -1.415f, 0.789f, -3.171f, 0.135f, -4.63f)
                close()
                moveTo(13.617f, 3.282f)
                curveToRelative(-2.495f, -1.404f, -5.602f, -1.615f, -8.286f, -0.645f)
                curveToRelative(-1.764f, 0.635f, -3.36f, 1.815f, -4.346f, 3.42f)
                curveToRelative(-0.895f, 1.45f, -1.23f, 3.258f, -0.799f, 4.917f)
                curveToRelative(0.433f, 1.84f, 1.711f, 3.383f, 3.262f, 4.413f)
                curveToRelative(-0.3f, 0.85f, -0.585f, 1.699f, -0.855f, 2.555f)
                curveToRelative(0.975f, -0.51f, 1.95f, -1.043f, 2.926f, -1.561f)
                curveToRelative(1.17f, 0.375f, 2.415f, 0.559f, 3.66f, 0.518f)
                curveToRelative(-0.33f, -0.943f, -0.405f, -1.965f, -0.255f, -2.951f)
                curveToRelative(0.225f, -1.371f, 0.975f, -2.625f, 1.994f, -3.554f)
                curveToRelative(1.726f, -1.615f, 4.171f, -2.296f, 6.496f, -2.131f)
                curveToRelative(-0.436f, -2.135f, -1.936f, -3.939f, -3.824f, -4.98f)
                horizontalLineToRelative(0.027f)
                close()
                moveTo(15.35f, 13.271f)
                curveToRelative(-0.209f, 0.652f, -1.156f, 0.848f, -1.615f, 0.352f)
                curveToRelative(-0.506f, -0.459f, -0.309f, -1.418f, 0.355f, -1.623f)
                curveToRelative(0.734f, -0.31f, 1.582f, 0.537f, 1.26f, 1.271f)
                close()
                moveTo(20.145f, 13.363f)
                curveToRelative(-0.256f, 0.586f, -1.141f, 0.723f, -1.576f, 0.27f)
                curveToRelative(-0.209f, -0.191f, -0.27f, -0.479f, -0.344f, -0.73f)
                curveToRelative(0.104f, -0.458f, 0.42f, -0.933f, 0.93f, -0.955f)
                curveToRelative(0.705f, -0.098f, 1.336f, 0.773f, 0.975f, 1.416f)
                horizontalLineToRelative(0.015f)
                close()
                moveTo(12.99f, 6.909f)
                curveToRelative(0.008f, 0.961f, -1.275f, 1.561f, -1.995f, 0.909f)
                curveToRelative(-0.747f, -0.535f, -0.535f, -1.837f, 0.342f, -2.106f)
                curveToRelative(0.785f, -0.315f, 1.713f, 0.344f, 1.651f, 1.185f)
                lineToRelative(0.002f, 0.012f)
                close()
                moveTo(6.931f, 7.153f)
                curveToRelative(-0.172f, 0.835f, -1.291f, 1.238f, -1.946f, 0.678f)
                curveToRelative(-0.759f, -0.535f, -0.546f, -1.861f, 0.345f, -2.131f)
                curveToRelative(0.873f, -0.336f, 1.865f, 0.55f, 1.601f, 1.453f)
                close()
            }
        }
        .build()
        return _wechat!!
    }

private var _wechat: VectorAsset? = null
