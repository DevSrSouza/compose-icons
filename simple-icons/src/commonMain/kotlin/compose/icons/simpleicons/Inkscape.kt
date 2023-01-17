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

public val SimpleIcons.Inkscape: ImageVector
    get() {
        if (_inkscape != null) {
            return _inkscape!!
        }
        _inkscape = Builder(name = "Inkscape", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.666f, 14.871f)
                curveToRelative(0.237f, 0.147f, 3.818f, 0.875f, 4.693f, 1.02f)
                curveToRelative(0.303f, 0.064f, 0.088f, 0.376f, -0.33f, 0.587f)
                curveToRelative(-0.943f, 0.251f, -5.517f, -1.607f, -4.363f, -1.607f)
                close()
                moveTo(13.313f, 1.607f)
                lineToRelative(3.505f, 3.56f)
                curveToRelative(0.333f, 0.34f, 0.328f, 0.998f, 0.142f, 1.187f)
                lineToRelative(-1.74f, -1.392f)
                lineToRelative(-0.342f, 2.061f)
                lineToRelative(-1.455f, -0.767f)
                lineToRelative(-2.328f, 1.47f)
                lineToRelative(-0.771f, -3.1f)
                lineTo(9.073f, 6.79f)
                lineTo(7.16f, 6.79f)
                curveToRelative(-0.78f, 0.0f, -0.871f, -0.99f, -0.163f, -1.698f)
                curveToRelative(1.237f, -1.335f, 2.657f, -2.696f, 3.429f, -3.485f)
                curveToRelative(0.776f, -0.793f, 2.127f, -0.77f, 2.887f, 0.0f)
                close()
                moveTo(9.786f, 0.97f)
                lineToRelative(-8.86f, 9.066f)
                curveToRelative(-2.993f, 3.707f, 2.038f, 3.276f, 4.194f, 4.343f)
                curveToRelative(0.774f, 0.791f, -2.965f, 1.375f, -2.191f, 2.166f)
                curveToRelative(0.773f, 0.791f, 4.678f, 1.524f, 5.453f, 2.314f)
                curveToRelative(0.773f, 0.791f, -1.584f, 1.63f, -0.81f, 2.42f)
                curveToRelative(0.773f, 0.792f, 2.563f, 0.042f, 2.898f, 1.868f)
                curveToRelative(0.238f, 1.304f, 3.224f, 0.56f, 4.684f, -0.508f)
                curveToRelative(0.774f, -0.791f, -1.48f, -0.717f, -0.706f, -1.508f)
                curveToRelative(1.923f, -1.967f, 3.715f, -0.714f, 4.373f, -2.686f)
                curveToRelative(0.325f, -0.974f, -2.832f, -1.501f, -2.057f, -2.292f)
                curveToRelative(2.226f, -1.3f, 9.919f, -2.146f, 6.268f, -5.796f)
                lineTo(13.85f, 0.97f)
                curveToRelative(-1.123f, -1.078f, -2.998f, -1.09f, -4.063f, 0.0f)
                close()
                moveTo(19.963f, 18.445f)
                curveToRelative(0.0f, 0.45f, 3.314f, 0.745f, 3.314f, -0.106f)
                curveToRelative(-0.472f, -1.366f, -2.922f, -1.274f, -3.314f, 0.106f)
                close()
                moveTo(5.035f, 20.835f)
                curveToRelative(0.784f, 0.679f, 1.997f, -0.169f, 2.36f, -1.116f)
                curveToRelative(-0.76f, -1.01f, -3.607f, 0.037f, -2.36f, 1.116f)
                close()
                moveTo(19.547f, 19.369f)
                curveToRelative(-1.011f, 0.908f, 0.114f, 1.828f, 1.111f, 1.242f)
                curveToRelative(0.222f, -0.225f, -0.006f, -1.016f, -1.11f, -1.242f)
                close()
            }
        }
        .build()
        return _inkscape!!
    }

private var _inkscape: ImageVector? = null
