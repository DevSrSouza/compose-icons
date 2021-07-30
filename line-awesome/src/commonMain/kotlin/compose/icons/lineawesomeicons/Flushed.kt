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

public val LineAwesomeIcons.Flushed: ImageVector
    get() {
        if (_flushed != null) {
            return _flushed!!
        }
        _flushed = Builder(name = "Flushed", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(11.5f, 8.0f)
                curveTo(8.467f, 8.0f, 6.0f, 10.467f, 6.0f, 13.5f)
                curveTo(6.0f, 16.533f, 8.467f, 19.0f, 11.5f, 19.0f)
                curveTo(13.3606f, 19.0f, 15.0043f, 18.0683f, 16.0f, 16.6504f)
                curveTo(16.9957f, 18.0683f, 18.6394f, 19.0f, 20.5f, 19.0f)
                curveTo(23.533f, 19.0f, 26.0f, 16.533f, 26.0f, 13.5f)
                curveTo(26.0f, 10.467f, 23.533f, 8.0f, 20.5f, 8.0f)
                curveTo(18.6394f, 8.0f, 16.9957f, 8.9317f, 16.0f, 10.3496f)
                curveTo(15.0043f, 8.9317f, 13.3606f, 8.0f, 11.5f, 8.0f)
                close()
                moveTo(11.5f, 10.0f)
                curveTo(13.43f, 10.0f, 15.0f, 11.57f, 15.0f, 13.5f)
                curveTo(15.0f, 15.43f, 13.43f, 17.0f, 11.5f, 17.0f)
                curveTo(9.57f, 17.0f, 8.0f, 15.43f, 8.0f, 13.5f)
                curveTo(8.0f, 11.57f, 9.57f, 10.0f, 11.5f, 10.0f)
                close()
                moveTo(20.5f, 10.0f)
                curveTo(22.43f, 10.0f, 24.0f, 11.57f, 24.0f, 13.5f)
                curveTo(24.0f, 15.43f, 22.43f, 17.0f, 20.5f, 17.0f)
                curveTo(18.57f, 17.0f, 17.0f, 15.43f, 17.0f, 13.5f)
                curveTo(17.0f, 11.57f, 18.57f, 10.0f, 20.5f, 10.0f)
                close()
                moveTo(11.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 12.0f)
                close()
                moveTo(12.0f, 21.0f)
                lineTo(12.0f, 23.0f)
                lineTo(20.0f, 23.0f)
                lineTo(20.0f, 21.0f)
                lineTo(12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _flushed!!
    }

private var _flushed: ImageVector? = null
