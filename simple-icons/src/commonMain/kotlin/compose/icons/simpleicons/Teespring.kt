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

public val SimpleIcons.Teespring: ImageVector
    get() {
        if (_teespring != null) {
            return _teespring!!
        }
        _teespring = Builder(name = "Teespring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.78f, 8.348f)
                curveToRelative(-0.77f, 0.0f, -1.396f, 0.615f, -1.396f, 1.37f)
                curveToRelative(0.0f, 1.075f, 0.406f, 2.058f, 1.075f, 2.813f)
                curveToRelative(0.277f, 0.312f, 0.598f, 0.584f, 0.956f, 0.807f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.736f, -3.874f)
                curveToRelative(-0.005f, -0.029f, -0.013f, -0.058f, -0.02f, -0.087f)
                arcToRelative(1.392f, 1.392f, 0.0f, false, false, -1.35f, -1.029f)
                close()
                moveTo(7.168f, 12.306f)
                curveToRelative(0.138f, 0.366f, 0.317f, 0.712f, 0.533f, 1.032f)
                curveToRelative(0.356f, -0.223f, 0.678f, -0.495f, 0.955f, -0.807f)
                arcToRelative(4.221f, 4.221f, 0.0f, false, false, 1.076f, -2.813f)
                curveToRelative(0.0f, -0.755f, -0.626f, -1.37f, -1.397f, -1.37f)
                curveToRelative(-0.65f, 0.0f, -1.195f, 0.438f, -1.35f, 1.029f)
                curveToRelative(-0.006f, 0.029f, -0.015f, 0.057f, -0.02f, 0.086f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 0.205f, 2.843f)
                close()
                moveTo(22.669f, 11.636f)
                lineTo(24.0f, 12.29f)
                arcToRelative(5.873f, 5.873f, 0.0f, false, true, -5.243f, 3.18f)
                arcToRelative(5.958f, 5.958f, 0.0f, false, true, -1.926f, -0.32f)
                arcToRelative(6.745f, 6.745f, 0.0f, false, true, -4.774f, 1.963f)
                arcToRelative(6.742f, 6.742f, 0.0f, false, true, -4.774f, -1.964f)
                arcToRelative(5.943f, 5.943f, 0.0f, false, true, -1.926f, 0.32f)
                arcTo(5.87f, 5.87f, 0.0f, false, true, 0.0f, 12.054f)
                lineToRelative(1.362f, -0.595f)
                arcToRelative(4.38f, 4.38f, 0.0f, false, false, 3.995f, 2.549f)
                curveToRelative(0.324f, 0.0f, 0.641f, -0.036f, 0.946f, -0.102f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, -0.945f, -3.367f)
                arcToRelative(6.512f, 6.512f, 0.0f, false, true, 0.19f, -1.554f)
                curveToRelative(0.328f, -1.208f, 1.45f, -2.098f, 2.786f, -2.098f)
                lineToRelative(0.079f, 0.002f)
                curveToRelative(0.08f, 0.002f, 0.162f, 0.008f, 0.242f, 0.016f)
                curveToRelative(1.444f, 0.157f, 2.565f, 1.357f, 2.565f, 2.814f)
                curveToRelative(0.0f, 1.958f, -0.999f, 3.687f, -2.522f, 4.724f)
                arcToRelative(5.244f, 5.244f, 0.0f, false, false, 3.36f, 1.21f)
                arcToRelative(5.247f, 5.247f, 0.0f, false, false, 3.358f, -1.21f)
                curveToRelative(-1.523f, -1.037f, -2.522f, -2.767f, -2.522f, -4.724f)
                curveToRelative(0.0f, -1.458f, 1.122f, -2.658f, 2.564f, -2.814f)
                curveToRelative(0.08f, -0.008f, 0.16f, -0.014f, 0.242f, -0.016f)
                lineToRelative(0.08f, -0.002f)
                arcToRelative(2.877f, 2.877f, 0.0f, false, true, 2.832f, 2.286f)
                arcToRelative(6.478f, 6.478f, 0.0f, false, true, -0.8f, 4.733f)
                curveToRelative(0.305f, 0.066f, 0.62f, 0.102f, 0.945f, 0.102f)
                curveToRelative(1.71f, 0.0f, 3.191f, -0.967f, 3.91f, -2.372f)
                close()
            }
        }
        .build()
        return _teespring!!
    }

private var _teespring: ImageVector? = null
