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

public val SimpleIcons.Coinmarketcap: ImageVector
    get() {
        if (_coinmarketcap != null) {
            return _coinmarketcap!!
        }
        _coinmarketcap = Builder(name = "Coinmarketcap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.738f, 14.341f)
                curveToRelative(-0.419f, 0.265f, -0.912f, 0.298f, -1.286f, 0.087f)
                curveToRelative(-0.476f, -0.27f, -0.738f, -0.898f, -0.738f, -1.774f)
                verticalLineToRelative(-2.618f)
                curveToRelative(0.0f, -1.264f, -0.5f, -2.164f, -1.336f, -2.407f)
                curveToRelative(-1.416f, -0.413f, -2.482f, 1.32f, -2.882f, 1.972f)
                lineToRelative(-2.498f, 4.05f)
                verticalLineToRelative(-4.95f)
                curveToRelative(-0.028f, -1.14f, -0.398f, -1.821f, -1.1f, -2.027f)
                curveToRelative(-0.466f, -0.135f, -1.161f, -0.081f, -1.837f, 0.953f)
                lineToRelative(-5.597f, 8.987f)
                arcTo(9.875f, 9.875f, 0.0f, false, true, 2.326f, 12.0f)
                curveToRelative(0.0f, -5.414f, 4.339f, -9.818f, 9.672f, -9.818f)
                curveToRelative(5.332f, 0.0f, 9.67f, 4.404f, 9.67f, 9.818f)
                curveToRelative(0.004f, 0.018f, 0.002f, 0.034f, 0.003f, 0.053f)
                curveToRelative(0.05f, 1.049f, -0.29f, 1.883f, -0.933f, 2.29f)
                close()
                moveTo(23.818f, 12.001f)
                lineTo(23.817f, 11.946f)
                curveTo(23.787f, 5.353f, 18.497f, 0.0f, 11.997f, 0.0f)
                curveTo(5.48f, 0.0f, 0.177f, 5.383f, 0.177f, 12.0f)
                curveToRelative(0.0f, 6.616f, 5.303f, 12.0f, 11.82f, 12.0f)
                curveToRelative(2.991f, 0.0f, 5.846f, -1.137f, 8.037f, -3.2f)
                curveToRelative(0.435f, -0.41f, 0.46f, -1.1f, 0.057f, -1.541f)
                arcToRelative(1.064f, 1.064f, 0.0f, false, false, -1.519f, -0.059f)
                arcToRelative(9.56f, 9.56f, 0.0f, false, true, -6.574f, 2.618f)
                curveToRelative(-2.856f, 0.0f, -5.425f, -1.263f, -7.197f, -3.268f)
                lineToRelative(5.048f, -8.105f)
                verticalLineToRelative(3.737f)
                curveToRelative(0.0f, 1.794f, 0.696f, 2.374f, 1.28f, 2.544f)
                curveToRelative(0.584f, 0.17f, 1.476f, 0.054f, 2.413f, -1.468f)
                curveToRelative(0.998f, -1.614f, 2.025f, -3.297f, 3.023f, -4.88f)
                verticalLineToRelative(2.276f)
                curveToRelative(0.0f, 1.678f, 0.672f, 3.02f, 1.843f, 3.68f)
                curveToRelative(1.056f, 0.597f, 2.384f, 0.543f, 3.465f, -0.14f)
                curveToRelative(1.312f, -0.828f, 2.018f, -2.354f, 1.944f, -4.193f)
                close()
            }
        }
        .build()
        return _coinmarketcap!!
    }

private var _coinmarketcap: ImageVector? = null
