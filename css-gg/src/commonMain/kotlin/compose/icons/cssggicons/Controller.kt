package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val CssGgIcons.Controller: ImageVector
    get() {
        if (_controller != null) {
            return _controller!!
        }
        _controller = Builder(name = "Controller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8284f, 6.3431f)
                lineTo(16.2426f, 4.9289f)
                lineTo(12.0f, 0.6863f)
                lineTo(7.7573f, 4.9289f)
                lineTo(9.1716f, 6.3431f)
                lineTo(12.0f, 3.5147f)
                lineTo(14.8284f, 6.3431f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9289f, 16.2426f)
                lineTo(6.3431f, 14.8284f)
                lineTo(3.5147f, 12.0f)
                lineTo(6.3431f, 9.1716f)
                lineTo(4.9289f, 7.7573f)
                lineTo(0.6863f, 12.0f)
                lineTo(4.9289f, 16.2426f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7573f, 19.0711f)
                lineTo(12.0f, 23.3137f)
                lineTo(16.2426f, 19.0711f)
                lineTo(14.8284f, 17.6568f)
                lineTo(12.0f, 20.4853f)
                lineTo(9.1716f, 17.6568f)
                lineTo(7.7573f, 19.0711f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6568f, 9.1716f)
                lineTo(20.4853f, 12.0f)
                lineTo(17.6568f, 14.8284f)
                lineTo(19.0711f, 16.2426f)
                lineTo(23.3137f, 12.0f)
                lineTo(19.0711f, 7.7573f)
                lineTo(17.6568f, 9.1716f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.0f)
                curveTo(14.2091f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                curveTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                curveTo(8.0f, 9.7909f, 9.7909f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.1046f, 10.0f, 14.0f, 10.8954f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.1046f, 10.0f, 12.0f)
                curveTo(10.0f, 10.8954f, 10.8954f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _controller!!
    }

private var _controller: ImageVector? = null
