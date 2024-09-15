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

public val LineAwesomeIcons.Monero: ImageVector
    get() {
        if (_monero != null) {
            return _monero!!
        }
        _monero = Builder(name = "Monero", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 17.041f, 26.844f, 18.045f, 26.572f, 19.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 10.977f)
                lineTo(16.0f, 17.262f)
                lineTo(10.0f, 10.977f)
                lineTo(10.0f, 19.0f)
                lineTo(5.428f, 19.0f)
                curveTo(5.156f, 18.045f, 5.0f, 17.041f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(12.0f, 15.969f)
                lineTo(16.0f, 20.156f)
                lineTo(20.0f, 15.969f)
                lineTo(20.0f, 21.0f)
                lineTo(25.785f, 21.0f)
                curveTo(23.96f, 24.556f, 20.264f, 27.0f, 16.0f, 27.0f)
                curveTo(11.736f, 27.0f, 8.04f, 24.556f, 6.215f, 21.0f)
                lineTo(12.0f, 21.0f)
                lineTo(12.0f, 15.969f)
                close()
            }
        }
        .build()
        return _monero!!
    }

private var _monero: ImageVector? = null
