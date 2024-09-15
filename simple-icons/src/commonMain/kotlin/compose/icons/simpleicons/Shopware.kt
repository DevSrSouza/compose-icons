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
                moveTo(23.948f, 10.891f)
                arcToRelative(0.174f, 0.174f, 0.0f, false, false, -0.061f, -0.118f)
                curveToRelative(-2.503f, -2.078f, -4.529f, -2.926f, -6.99f, -2.926f)
                curveToRelative(-1.313f, 0.0f, -2.32f, 0.264f, -2.992f, 0.783f)
                curveToRelative(-0.582f, 0.449f, -0.89f, 1.077f, -0.89f, 1.812f)
                curveToRelative(0.0f, 2.06f, 2.518f, 3.0f, 5.436f, 4.088f)
                curveToRelative(1.502f, 0.56f, 3.057f, 1.14f, 4.483f, 1.932f)
                arcToRelative(0.163f, 0.163f, 0.0f, false, false, 0.083f, 0.022f)
                arcToRelative(0.187f, 0.187f, 0.0f, false, false, 0.059f, -0.011f)
                curveToRelative(0.046f, -0.017f, 0.085f, -0.052f, 0.102f, -0.1f)
                curveToRelative(0.545f, -1.395f, 0.822f, -2.867f, 0.822f, -4.374f)
                arcToRelative(13.082f, 13.082f, 0.0f, false, false, -0.052f, -1.108f)
                close()
                moveTo(19.138f, 21.37f)
                curveToRelative(-1.042f, -0.785f, -2.579f, -1.382f, -4.206f, -2.013f)
                curveToRelative(-1.936f, -0.75f, -4.132f, -1.603f, -5.78f, -2.913f)
                curveToRelative(-1.867f, -1.487f, -2.776f, -3.362f, -2.776f, -5.732f)
                curveToRelative(0.0f, -2.128f, 0.883f, -3.947f, 2.553f, -5.261f)
                curveToRelative(1.873f, -1.474f, 4.712f, -2.255f, 8.207f, -2.255f)
                curveToRelative(0.966f, 0.0f, 1.888f, 0.059f, 2.743f, 0.177f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, 0.179f, -0.098f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.041f, -0.201f)
                curveTo(17.814f, 1.092f, 14.966f, 0.002f, 12.001f, 0.002f)
                curveToRelative(-3.205f, 0.0f, -6.219f, 1.247f, -8.486f, 3.515f)
                curveTo(1.249f, 5.782f, 0.0f, 8.796f, 0.0f, 11.999f)
                curveToRelative(0.0f, 3.205f, 1.247f, 6.219f, 3.515f, 8.484f)
                curveToRelative(2.265f, 2.265f, 5.279f, 3.515f, 8.486f, 3.515f)
                curveToRelative(2.59f, 0.0f, 5.056f, -0.813f, 7.134f, -2.351f)
                arcToRelative(0.171f, 0.171f, 0.0f, false, false, 0.07f, -0.137f)
                arcToRelative(0.174f, 0.174f, 0.0f, false, false, -0.068f, -0.14f)
                close()
            }
        }
        .build()
        return _shopware!!
    }

private var _shopware: ImageVector? = null
