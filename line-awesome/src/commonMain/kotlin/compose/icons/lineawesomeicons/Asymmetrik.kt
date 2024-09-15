package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Asymmetrik: ImageVector
    get() {
        if (_asymmetrik != null) {
            return _asymmetrik!!
        }
        _asymmetrik = Builder(name = "Asymmetrik", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.09f, 6.084f)
                curveTo(12.653f, 5.99f, 6.665f, 7.357f, 2.0f, 10.0f)
                curveTo(4.682f, 8.955f, 7.383f, 8.2f, 10.275f, 7.563f)
                curveTo(13.943f, 6.754f, 17.711f, 6.327f, 21.031f, 6.842f)
                curveTo(28.444f, 7.999f, 30.6f, 13.042f, 25.836f, 18.109f)
                curveTo(25.34f, 18.634f, 24.661f, 19.212f, 24.029f, 19.674f)
                lineTo(16.852f, 9.102f)
                lineTo(7.645f, 22.506f)
                lineTo(7.553f, 22.471f)
                curveTo(3.274f, 20.994f, 3.211f, 18.481f, 5.982f, 15.328f)
                curveTo(6.993f, 14.248f, 8.359f, 13.343f, 9.848f, 12.504f)
                curveTo(10.84f, 11.945f, 11.895f, 11.404f, 12.979f, 11.01f)
                curveTo(9.814f, 11.997f, 6.897f, 13.581f, 5.006f, 15.527f)
                curveTo(3.659f, 16.917f, 3.015f, 18.304f, 3.0f, 19.559f)
                curveTo(2.976f, 21.266f, 4.836f, 22.551f, 7.023f, 23.422f)
                lineTo(5.275f, 26.0f)
                lineTo(10.213f, 26.0f)
                lineTo(10.217f, 25.992f)
                lineTo(10.23f, 26.0f)
                lineTo(11.398f, 24.227f)
                curveTo(12.445f, 24.267f, 13.583f, 24.221f, 14.674f, 24.094f)
                lineTo(13.51f, 26.0f)
                lineTo(20.082f, 26.0f)
                lineTo(18.477f, 23.326f)
                curveTo(19.35f, 23.077f, 20.233f, 22.776f, 21.064f, 22.441f)
                lineTo(22.92f, 25.258f)
                lineTo(23.379f, 26.0f)
                lineTo(28.316f, 26.0f)
                lineTo(24.656f, 20.6f)
                curveTo(25.555f, 20.012f, 26.458f, 19.292f, 27.133f, 18.596f)
                curveTo(29.019f, 16.651f, 29.957f, 14.705f, 29.977f, 12.949f)
                curveTo(30.016f, 9.764f, 27.09f, 7.202f, 21.742f, 6.385f)
                curveTo(20.569f, 6.205f, 19.345f, 6.106f, 18.09f, 6.084f)
                close()
                moveTo(16.809f, 16.021f)
                lineTo(17.512f, 17.045f)
                lineTo(20.523f, 21.617f)
                curveTo(19.715f, 21.959f, 18.872f, 22.263f, 18.014f, 22.51f)
                lineTo(16.799f, 20.535f)
                lineTo(15.258f, 23.127f)
                curveTo(14.167f, 23.29f, 13.073f, 23.31f, 12.021f, 23.281f)
                lineTo(16.809f, 16.021f)
                close()
            }
        }
        .build()
        return _asymmetrik!!
    }

private var _asymmetrik: ImageVector? = null
