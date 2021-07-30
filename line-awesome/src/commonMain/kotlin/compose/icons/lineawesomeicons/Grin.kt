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

public val LineAwesomeIcons.Grin: ImageVector
    get() {
        if (_grin != null) {
            return _grin!!
        }
        _grin = Builder(name = "Grin", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
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
                moveTo(11.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 12.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(9.0f, 19.0f, 10.605f, 24.0f, 16.0f, 24.0f)
                curveTo(21.395f, 24.0f, 23.0f, 19.0f, 23.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
            }
        }
        .build()
        return _grin!!
    }

private var _grin: ImageVector? = null
