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

public val SimpleIcons.Inkscape: VectorAsset
    get() {
        if (_inkscape != null) {
            return _inkscape!!
        }
        _inkscape = VectorAssetBuilder(name = "Inkscape", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.872f, 0.191f)
                curveToRelative(-0.745f, -0.011f, -1.464f, 0.278f, -1.993f, 0.804f)
                lineToRelative(-8.825f, 9.038f)
                curveToRelative(-3.343f, 3.34f, 2.164f, 3.061f, 4.154f, 4.325f)
                curveToRelative(0.922f, 0.602f, -2.955f, 1.371f, -2.164f, 2.164f)
                curveToRelative(0.771f, 0.793f, 4.65f, 1.521f, 5.422f, 2.293f)
                curveToRelative(0.771f, 0.791f, -1.564f, 1.627f, -0.793f, 2.418f)
                curveToRelative(0.75f, 0.793f, 2.549f, 0.043f, 2.87f, 1.842f)
                curveToRelative(0.235f, 1.328f, 3.3f, 0.666f, 4.672f, -0.471f)
                curveToRelative(0.854f, -0.729f, -1.479f, -0.729f, -0.708f, -1.521f)
                curveToRelative(1.929f, -1.949f, 3.642f, -0.875f, 4.349f, -2.676f)
                curveToRelative(0.387f, -0.963f, -2.913f, -1.65f, -2.034f, -2.271f)
                curveToRelative(2.101f, -1.477f, 9.812f, -2.227f, 6.255f, -5.782f)
                lineTo(13.93f, 0.995f)
                curveToRelative(-0.56f, -0.521f, -1.295f, -0.807f, -2.058f, -0.804f)
                close()
                moveTo(11.947f, 1.05f)
                curveToRelative(0.529f, 0.003f, 1.06f, 0.201f, 1.444f, 0.584f)
                lineToRelative(3.492f, 3.557f)
                curveToRelative(0.323f, 0.321f, 0.323f, 0.986f, 0.129f, 1.178f)
                lineToRelative(-1.734f, -1.412f)
                lineToRelative(-0.343f, 2.077f)
                lineToRelative(-1.435f, -0.772f)
                lineToRelative(-2.336f, 1.478f)
                lineToRelative(-0.771f, -3.105f)
                lineToRelative(-1.242f, 2.698f)
                lineToRelative(-3.107f, -0.022f)
                curveToRelative(-0.6f, 0.0f, -0.514f, -0.621f, 0.107f, -1.242f)
                curveToRelative(1.221f, -1.35f, 3.6f, -3.64f, 4.35f, -4.433f)
                curveToRelative(0.385f, -0.396f, 0.915f, -0.589f, 1.445f, -0.584f)
                lineToRelative(0.001f, -0.002f)
                close()
                moveTo(21.702f, 17.326f)
                curveToRelative(-0.74f, 0.025f, -1.496f, 0.395f, -1.689f, 1.08f)
                curveToRelative(0.0f, 0.449f, 3.492f, 0.707f, 3.301f, -0.107f)
                curveToRelative(-0.141f, -0.686f, -0.87f, -1.002f, -1.611f, -0.975f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(6.356f, 19.271f)
                curveToRelative(-1.008f, 0.059f, -2.088f, 0.791f, -1.232f, 1.512f)
                curveToRelative(0.791f, 0.686f, 1.992f, -0.15f, 2.377f, -1.113f)
                curveToRelative(-0.24f, -0.316f, -0.686f, -0.426f, -1.143f, -0.398f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(19.585f, 19.348f)
                curveToRelative(-0.986f, 0.9f, 0.17f, 1.842f, 1.134f, 1.221f)
                curveToRelative(0.258f, -0.173f, -0.021f, -1.005f, -1.134f, -1.221f)
                close()
            }
        }
        .build()
        return _inkscape!!
    }

private var _inkscape: VectorAsset? = null
