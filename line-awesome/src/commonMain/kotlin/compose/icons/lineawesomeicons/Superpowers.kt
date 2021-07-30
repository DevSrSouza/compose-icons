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

public val LineAwesomeIcons.Superpowers: ImageVector
    get() {
        if (_superpowers != null) {
            return _superpowers!!
        }
        _superpowers = Builder(name = "Superpowers", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.0f, 3.0f)
                lineTo(14.877f, 5.0566f)
                lineTo(13.9883f, 5.1855f)
                lineTo(14.002f, 5.1914f)
                curveTo(8.8884f, 6.1348f, 5.0f, 10.6179f, 5.0f, 16.0f)
                curveTo(5.0f, 19.0325f, 6.2347f, 21.7816f, 8.2266f, 23.7734f)
                lineTo(3.0f, 29.0f)
                lineTo(17.123f, 26.9434f)
                lineTo(18.0117f, 26.8145f)
                lineTo(17.998f, 26.8086f)
                curveTo(23.1116f, 25.8652f, 27.0f, 21.3821f, 27.0f, 16.0f)
                curveTo(27.0f, 12.9675f, 25.7653f, 10.2184f, 23.7734f, 8.2266f)
                lineTo(29.0f, 3.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(20.963f, 7.0f, 25.0f, 11.037f, 25.0f, 16.0f)
                curveTo(25.0f, 20.963f, 20.963f, 25.0f, 16.0f, 25.0f)
                curveTo(11.037f, 25.0f, 7.0f, 20.963f, 7.0f, 16.0f)
                curveTo(7.0f, 11.037f, 11.037f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _superpowers!!
    }

private var _superpowers: ImageVector? = null
