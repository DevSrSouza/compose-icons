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

public val LineAwesomeIcons.Centercode: ImageVector
    get() {
        if (_centercode != null) {
            return _centercode!!
        }
        _centercode = Builder(name = "Centercode", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(13.1992f, 9.0f)
                curveTo(10.8452f, 11.26f, 10.3786f, 16.5891f, 11.8086f, 22.8691f)
                curveTo(14.6286f, 23.4991f, 18.7187f, 21.7997f, 22.8887f, 18.4297f)
                curveTo(24.0257f, 13.6797f, 16.3342f, 10.14f, 13.1992f, 9.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(17.105f, 14.0f, 18.0f, 14.895f, 18.0f, 16.0f)
                curveTo(18.0f, 17.105f, 17.105f, 18.0f, 16.0f, 18.0f)
                curveTo(14.895f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                curveTo(14.0f, 14.895f, 14.895f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _centercode!!
    }

private var _centercode: ImageVector? = null
