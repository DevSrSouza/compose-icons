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

public val SimpleIcons.Shazam: ImageVector
    get() {
        if (_shazam != null) {
            return _shazam!!
        }
        _shazam = Builder(name = "Shazam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, -0.001f, 5.371f, -0.001f, 12.0f)
                curveToRelative(0.0f, 6.625f, 5.374f, 12.0f, 12.001f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.375f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.629f, -5.373f, -12.0f, -12.0f, -12.0f)
                moveTo(9.872f, 16.736f)
                curveToRelative(-1.287f, 0.0f, -2.573f, -0.426f, -3.561f, -1.281f)
                curveToRelative(-1.214f, -1.049f, -1.934f, -2.479f, -2.029f, -4.024f)
                curveToRelative(-0.09f, -1.499f, 0.42f, -2.944f, 1.436f, -4.067f)
                curveTo(6.86f, 6.101f, 8.907f, 4.139f, 8.993f, 4.055f)
                curveToRelative(0.555f, -0.532f, 1.435f, -0.511f, 1.966f, 0.045f)
                curveToRelative(0.53f, 0.557f, 0.512f, 1.439f, -0.044f, 1.971f)
                curveToRelative(-0.021f, 0.02f, -2.061f, 1.976f, -3.137f, 3.164f)
                curveToRelative(-0.508f, 0.564f, -0.764f, 1.283f, -0.719f, 2.027f)
                curveToRelative(0.049f, 0.789f, 0.428f, 1.529f, 1.07f, 2.086f)
                curveToRelative(0.844f, 0.73f, 2.51f, 0.891f, 3.553f, -0.043f)
                curveToRelative(0.619f, -0.559f, 1.372f, -1.377f, 1.38f, -1.386f)
                curveToRelative(0.52f, -0.567f, 1.4f, -0.603f, 1.965f, -0.081f)
                curveToRelative(0.565f, 0.52f, 0.603f, 1.402f, 0.083f, 1.969f)
                curveToRelative(-0.035f, 0.035f, -0.852f, 0.924f, -1.572f, 1.572f)
                curveToRelative(-1.005f, 0.902f, -2.336f, 1.357f, -3.666f, 1.357f)
                moveToRelative(8.41f, -0.099f)
                curveToRelative(-1.143f, 1.262f, -3.189f, 3.225f, -3.276f, 3.309f)
                curveToRelative(-0.27f, 0.256f, -0.615f, 0.385f, -0.96f, 0.385f)
                curveToRelative(-0.368f, 0.0f, -0.732f, -0.145f, -1.006f, -0.43f)
                curveToRelative(-0.531f, -0.559f, -0.512f, -1.439f, 0.044f, -1.971f)
                curveToRelative(0.021f, -0.02f, 2.063f, -1.977f, 3.137f, -3.166f)
                curveToRelative(0.508f, -0.563f, 0.764f, -1.283f, 0.719f, -2.027f)
                curveToRelative(-0.048f, -0.789f, -0.428f, -1.529f, -1.07f, -2.084f)
                curveToRelative(-0.844f, -0.73f, -2.51f, -0.893f, -3.552f, 0.044f)
                curveToRelative(-0.621f, 0.556f, -1.373f, 1.376f, -1.38f, 1.384f)
                curveToRelative(-0.521f, 0.566f, -1.399f, 0.604f, -1.966f, 0.084f)
                curveToRelative(-0.564f, -0.521f, -0.604f, -1.404f, -0.082f, -1.971f)
                curveToRelative(0.034f, -0.037f, 0.85f, -0.926f, 1.571f, -1.573f)
                curveToRelative(1.979f, -1.778f, 5.221f, -1.813f, 7.227f, -0.077f)
                curveToRelative(1.214f, 1.051f, 1.935f, 2.48f, 2.028f, 4.025f)
                curveToRelative(0.092f, 1.497f, -0.419f, 2.945f, -1.434f, 4.068f)
            }
        }
        .build()
        return _shazam!!
    }

private var _shazam: ImageVector? = null
