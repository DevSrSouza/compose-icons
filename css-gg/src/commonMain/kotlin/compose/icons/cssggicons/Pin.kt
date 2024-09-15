package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.272f, 10.272f)
                curveTo(16.272f, 12.481f, 14.481f, 14.272f, 12.272f, 14.272f)
                curveTo(10.063f, 14.272f, 8.272f, 12.481f, 8.272f, 10.272f)
                curveTo(8.272f, 8.063f, 10.063f, 6.272f, 12.272f, 6.272f)
                curveTo(14.481f, 6.272f, 16.272f, 8.063f, 16.272f, 10.272f)
                close()
                moveTo(14.272f, 10.272f)
                curveTo(14.272f, 11.377f, 13.377f, 12.272f, 12.272f, 12.272f)
                curveTo(11.168f, 12.272f, 10.272f, 11.377f, 10.272f, 10.272f)
                curveTo(10.272f, 9.168f, 11.168f, 8.272f, 12.272f, 8.272f)
                curveTo(13.377f, 8.272f, 14.272f, 9.168f, 14.272f, 10.272f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.794f, 16.518f)
                curveTo(2.194f, 13.091f, 2.054f, 7.394f, 5.482f, 3.794f)
                curveTo(8.909f, 0.194f, 14.606f, 0.054f, 18.206f, 3.482f)
                curveTo(21.806f, 6.909f, 21.946f, 12.606f, 18.518f, 16.206f)
                lineTo(12.312f, 22.724f)
                lineTo(5.794f, 16.518f)
                close()
                moveTo(17.07f, 14.827f)
                lineTo(12.243f, 19.896f)
                lineTo(7.173f, 15.07f)
                curveTo(4.373f, 12.404f, 4.265f, 7.973f, 6.93f, 5.173f)
                curveTo(9.596f, 2.373f, 14.027f, 2.265f, 16.827f, 4.93f)
                curveTo(19.627f, 7.596f, 19.736f, 12.027f, 17.07f, 14.827f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
