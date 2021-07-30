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

public val SimpleIcons.Pocket: ImageVector
    get() {
        if (_pocket != null) {
            return _pocket!!
        }
        _pocket = Builder(name = "Pocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.813f, 10.259f)
                lineToRelative(-5.646f, 5.419f)
                curveToRelative(-0.32f, 0.305f, -0.73f, 0.458f, -1.141f, 0.458f)
                curveToRelative(-0.41f, 0.0f, -0.821f, -0.153f, -1.141f, -0.458f)
                lineToRelative(-5.646f, -5.419f)
                curveToRelative(-0.657f, -0.628f, -0.677f, -1.671f, -0.049f, -2.326f)
                curveToRelative(0.63f, -0.657f, 1.671f, -0.679f, 2.325f, -0.05f)
                lineToRelative(4.511f, 4.322f)
                lineToRelative(4.517f, -4.322f)
                curveToRelative(0.66f, -0.631f, 1.697f, -0.607f, 2.326f, 0.049f)
                curveToRelative(0.631f, 0.645f, 0.615f, 1.695f, -0.045f, 2.326f)
                lineToRelative(-0.011f, 0.001f)
                close()
                moveTo(23.896f, 2.713f)
                curveToRelative(-0.299f, -0.858f, -1.125f, -1.436f, -2.041f, -1.436f)
                lineTo(2.179f, 1.277f)
                curveToRelative(-0.9f, 0.0f, -1.717f, 0.564f, -2.037f, 1.405f)
                curveToRelative(-0.094f, 0.25f, -0.142f, 0.511f, -0.142f, 0.774f)
                verticalLineToRelative(7.245f)
                lineToRelative(0.084f, 1.441f)
                curveToRelative(0.348f, 3.277f, 2.047f, 6.142f, 4.682f, 8.139f)
                curveToRelative(0.045f, 0.036f, 0.094f, 0.07f, 0.143f, 0.105f)
                lineToRelative(0.03f, 0.023f)
                curveToRelative(1.411f, 1.03f, 2.989f, 1.728f, 4.694f, 2.072f)
                curveToRelative(0.786f, 0.158f, 1.591f, 0.24f, 2.389f, 0.24f)
                curveToRelative(0.739f, 0.0f, 1.481f, -0.067f, 2.209f, -0.204f)
                curveToRelative(0.088f, -0.029f, 0.176f, -0.045f, 0.264f, -0.06f)
                curveToRelative(0.023f, 0.0f, 0.049f, -0.015f, 0.074f, -0.029f)
                curveToRelative(1.633f, -0.36f, 3.148f, -1.036f, 4.508f, -2.025f)
                lineToRelative(0.029f, -0.031f)
                lineToRelative(0.135f, -0.105f)
                curveToRelative(2.627f, -1.995f, 4.324f, -4.862f, 4.686f, -8.148f)
                lineTo(24.0f, 10.678f)
                lineTo(24.0f, 3.445f)
                curveToRelative(0.0f, -0.251f, -0.031f, -0.5f, -0.121f, -0.742f)
                lineToRelative(0.017f, 0.01f)
                close()
            }
        }
        .build()
        return _pocket!!
    }

private var _pocket: ImageVector? = null
