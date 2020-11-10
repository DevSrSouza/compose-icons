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

public val SimpleIcons.Goodreads: VectorAsset
    get() {
        if (_goodreads != null) {
            return _goodreads!!
        }
        _goodreads = VectorAssetBuilder(name = "Goodreads", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.525f, 15.977f)
                lineTo(19.525f, 0.49f)
                horizontalLineToRelative(-2.059f)
                verticalLineToRelative(2.906f)
                horizontalLineToRelative(-0.064f)
                curveToRelative(-0.211f, -0.455f, -0.481f, -0.891f, -0.842f, -1.307f)
                curveToRelative(-0.36f, -0.412f, -0.767f, -0.777f, -1.232f, -1.094f)
                curveToRelative(-0.466f, -0.314f, -0.962f, -0.561f, -1.519f, -0.736f)
                curveTo(13.256f, 0.09f, 12.669f, 0.0f, 12.038f, 0.0f)
                curveToRelative(-1.21f, 0.0f, -2.3f, 0.225f, -3.246f, 0.67f)
                curveToRelative(-0.947f, 0.447f, -1.743f, 1.057f, -2.385f, 1.83f)
                curveToRelative(-0.642f, 0.773f, -1.133f, 1.676f, -1.47f, 2.711f)
                curveToRelative(-0.336f, 1.037f, -0.506f, 2.129f, -0.506f, 3.283f)
                curveToRelative(0.0f, 1.199f, 0.141f, 2.326f, 0.425f, 3.382f)
                curveToRelative(0.286f, 1.057f, 0.737f, 1.976f, 1.368f, 2.762f)
                curveToRelative(0.631f, 0.78f, 1.412f, 1.397f, 2.375f, 1.833f)
                curveToRelative(0.961f, 0.436f, 2.119f, 0.661f, 3.471f, 0.661f)
                curveToRelative(1.248f, 0.0f, 2.33f, -0.315f, 3.262f, -0.946f)
                reflectiveCurveToRelative(1.638f, -1.473f, 2.119f, -2.525f)
                horizontalLineToRelative(0.061f)
                verticalLineToRelative(2.284f)
                curveToRelative(0.0f, 2.044f, -0.421f, 3.607f, -1.264f, 4.705f)
                curveToRelative(-0.84f, 1.081f, -2.224f, 1.638f, -4.146f, 1.638f)
                curveToRelative(-0.572f, 0.0f, -1.128f, -0.061f, -1.669f, -0.181f)
                curveToRelative(-0.542f, -0.12f, -1.036f, -0.315f, -1.487f, -0.57f)
                curveToRelative(-0.437f, -0.271f, -0.827f, -0.601f, -1.143f, -1.038f)
                curveToRelative(-0.316f, -0.435f, -0.526f, -0.961f, -0.632f, -1.593f)
                lineTo(5.064f, 18.906f)
                curveToRelative(0.067f, 0.887f, 0.315f, 1.654f, 0.737f, 2.3f)
                curveToRelative(0.424f, 0.646f, 0.961f, 1.172f, 1.602f, 1.593f)
                curveToRelative(0.641f, 0.406f, 1.367f, 0.706f, 2.172f, 0.902f)
                curveToRelative(0.811f, 0.194f, 1.639f, 0.3f, 2.494f, 0.3f)
                curveToRelative(1.383f, 0.0f, 2.541f, -0.195f, 3.486f, -0.555f)
                curveToRelative(0.947f, -0.376f, 1.714f, -0.902f, 2.301f, -1.608f)
                curveToRelative(0.601f, -0.708f, 1.021f, -1.549f, 1.293f, -2.556f)
                curveToRelative(0.27f, -1.007f, 0.42f, -2.134f, 0.42f, -3.367f)
                lineToRelative(-0.044f, 0.062f)
                close()
                moveTo(12.041f, 15.42f)
                curveToRelative(-0.955f, 0.0f, -1.784f, -0.189f, -2.479f, -0.571f)
                curveToRelative(-0.697f, -0.38f, -1.277f, -0.882f, -1.732f, -1.503f)
                curveToRelative(-0.467f, -0.621f, -0.797f, -1.332f, -1.022f, -2.139f)
                reflectiveCurveToRelative(-0.332f, -1.633f, -0.332f, -2.484f)
                curveToRelative(0.0f, -0.871f, 0.105f, -1.725f, 0.301f, -2.563f)
                curveToRelative(0.21f, -0.84f, 0.54f, -1.587f, 0.992f, -2.24f)
                curveToRelative(0.451f, -0.652f, 1.037f, -1.182f, 1.728f, -1.584f)
                reflectiveCurveToRelative(1.533f, -0.605f, 2.51f, -0.605f)
                reflectiveCurveToRelative(1.803f, 0.209f, 2.495f, 0.621f)
                curveToRelative(0.676f, 0.415f, 1.247f, 0.959f, 1.683f, 1.634f)
                curveToRelative(0.436f, 0.677f, 0.751f, 1.429f, 0.947f, 2.255f)
                curveToRelative(0.195f, 0.826f, 0.285f, 1.656f, 0.285f, 2.482f)
                curveToRelative(0.0f, 0.852f, -0.12f, 1.678f, -0.345f, 2.484f)
                curveToRelative(-0.226f, 0.807f, -0.572f, 1.518f, -1.038f, 2.139f)
                curveToRelative(-0.465f, 0.621f, -1.021f, 1.123f, -1.698f, 1.503f)
                curveToRelative(-0.676f, 0.382f, -1.458f, 0.571f, -2.359f, 0.571f)
                horizontalLineToRelative(0.064f)
                close()
            }
        }
        .build()
        return _goodreads!!
    }

private var _goodreads: VectorAsset? = null
