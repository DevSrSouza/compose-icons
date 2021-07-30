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

public val LineAwesomeIcons.Btc: ImageVector
    get() {
        if (_btc != null) {
            return _btc!!
        }
        _btc = Builder(name = "Btc", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(12.0f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(12.0f, 29.0f)
                lineTo(14.0f, 29.0f)
                lineTo(14.0f, 26.0f)
                lineTo(16.0f, 26.0f)
                lineTo(16.0f, 29.0f)
                lineTo(18.0f, 29.0f)
                lineTo(18.0f, 26.0f)
                lineTo(19.5f, 26.0f)
                curveTo(22.5273f, 26.0f, 25.0f, 23.5273f, 25.0f, 20.5f)
                curveTo(25.0f, 18.418f, 23.8398f, 16.5898f, 22.125f, 15.6563f)
                curveTo(23.2813f, 14.6445f, 24.0f, 13.1484f, 24.0f, 11.5f)
                curveTo(24.0f, 8.4727f, 21.5273f, 6.0f, 18.5f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 3.0f)
                lineTo(16.0f, 3.0f)
                lineTo(16.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 3.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(18.5f, 8.0f)
                curveTo(20.4453f, 8.0f, 22.0f, 9.5547f, 22.0f, 11.5f)
                curveTo(22.0f, 13.4453f, 20.4453f, 15.0f, 18.5f, 15.0f)
                lineTo(10.0f, 15.0f)
                close()
                moveTo(10.0f, 17.0f)
                lineTo(19.5f, 17.0f)
                curveTo(21.4453f, 17.0f, 23.0f, 18.5547f, 23.0f, 20.5f)
                curveTo(23.0f, 22.4453f, 21.4453f, 24.0f, 19.5f, 24.0f)
                lineTo(10.0f, 24.0f)
                close()
            }
        }
        .build()
        return _btc!!
    }

private var _btc: ImageVector? = null
