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

public val SimpleIcons.Shopware: ImageVector
    get() {
        if (_shopware != null) {
            return _shopware!!
        }
        _shopware = Builder(name = "Shopware", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9477f, 10.8913f)
                arcToRelative(0.1735f, 0.1735f, 0.0f, false, false, -0.061f, -0.1178f)
                curveToRelative(-2.5032f, -2.078f, -4.5288f, -2.9261f, -6.9905f, -2.9261f)
                curveToRelative(-1.3127f, 0.0f, -2.32f, 0.2638f, -2.9916f, 0.7827f)
                curveToRelative(-0.5822f, 0.4492f, -0.8896f, 1.0772f, -0.8896f, 1.812f)
                curveToRelative(0.0f, 2.0605f, 2.5184f, 3.0003f, 5.4358f, 4.0883f)
                curveToRelative(1.5023f, 0.5604f, 3.057f, 1.1404f, 4.483f, 1.9319f)
                arcToRelative(0.1626f, 0.1626f, 0.0f, false, false, 0.0828f, 0.0218f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, false, 0.0589f, -0.011f)
                curveToRelative(0.0458f, -0.0174f, 0.085f, -0.0523f, 0.1025f, -0.1002f)
                curveToRelative(0.545f, -1.3955f, 0.822f, -2.8673f, 0.822f, -4.374f)
                arcToRelative(13.082f, 13.082f, 0.0f, false, false, -0.0523f, -1.1076f)
                close()
                moveTo(19.1377f, 21.3704f)
                curveToRelative(-1.0423f, -0.785f, -2.5795f, -1.3824f, -4.2061f, -2.0125f)
                curveToRelative(-1.9362f, -0.7501f, -4.132f, -1.6027f, -5.7803f, -2.913f)
                curveToRelative(-1.8665f, -1.4871f, -2.7757f, -3.3623f, -2.7757f, -5.7324f)
                curveToRelative(0.0f, -2.1281f, 0.883f, -3.9466f, 2.5533f, -5.2614f)
                curveToRelative(1.873f, -1.474f, 4.7119f, -2.2546f, 8.2071f, -2.2546f)
                curveToRelative(0.966f, 0.0f, 1.8883f, 0.0589f, 2.743f, 0.1766f)
                arcToRelative(0.1696f, 0.1696f, 0.0f, false, false, 0.1788f, -0.098f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.0414f, -0.2007f)
                curveTo(17.814f, 1.0924f, 14.9664f, 0.0022f, 12.001f, 0.0022f)
                curveToRelative(-3.2052f, 0.0f, -6.2186f, 1.2472f, -8.4862f, 3.5148f)
                curveTo(1.2494f, 5.7825f, 0.0f, 8.796f, 0.0f, 11.999f)
                curveToRelative(0.0f, 3.2051f, 1.2472f, 6.2185f, 3.5149f, 8.484f)
                curveToRelative(2.2654f, 2.2654f, 5.2788f, 3.5148f, 8.4862f, 3.5148f)
                curveToRelative(2.5903f, 0.0f, 5.0564f, -0.8133f, 7.1344f, -2.3505f)
                arcToRelative(0.1714f, 0.1714f, 0.0f, false, false, 0.0697f, -0.1374f)
                arcToRelative(0.1735f, 0.1735f, 0.0f, false, false, -0.0676f, -0.1395f)
                close()
            }
        }
        .build()
        return _shopware!!
    }

private var _shopware: ImageVector? = null
