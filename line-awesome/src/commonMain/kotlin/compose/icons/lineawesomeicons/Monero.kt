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
                curveTo(27.0f, 17.0409f, 26.8437f, 18.0449f, 26.5723f, 19.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 10.9766f)
                lineTo(16.0f, 17.2617f)
                lineTo(10.0f, 10.9766f)
                lineTo(10.0f, 19.0f)
                lineTo(5.4277f, 19.0f)
                curveTo(5.1563f, 18.0449f, 5.0f, 17.0409f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(12.0f, 15.9688f)
                lineTo(16.0f, 20.1563f)
                lineTo(20.0f, 15.9688f)
                lineTo(20.0f, 21.0f)
                lineTo(25.7852f, 21.0f)
                curveTo(23.9603f, 24.5559f, 20.2637f, 27.0f, 16.0f, 27.0f)
                curveTo(11.7363f, 27.0f, 8.0397f, 24.5559f, 6.2148f, 21.0f)
                lineTo(12.0f, 21.0f)
                lineTo(12.0f, 15.9688f)
                close()
            }
        }
        .build()
        return _monero!!
    }

private var _monero: ImageVector? = null
