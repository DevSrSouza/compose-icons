package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.657f, 8.962f)
                lineTo(16.239f, 10.373f)
                lineTo(12.984f, 7.103f)
                lineTo(12.971f, 20.708f)
                lineTo(10.971f, 20.706f)
                lineTo(10.984f, 7.138f)
                lineTo(7.754f, 10.353f)
                lineTo(6.343f, 8.936f)
                lineTo(12.013f, 3.292f)
                lineTo(17.657f, 8.962f)
                close()
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
