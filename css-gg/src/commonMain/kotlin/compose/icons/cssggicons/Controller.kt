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
                moveTo(14.828f, 6.343f)
                lineTo(16.243f, 4.929f)
                lineTo(12.0f, 0.686f)
                lineTo(7.757f, 4.929f)
                lineTo(9.172f, 6.343f)
                lineTo(12.0f, 3.515f)
                lineTo(14.828f, 6.343f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.929f, 16.243f)
                lineTo(6.343f, 14.828f)
                lineTo(3.515f, 12.0f)
                lineTo(6.343f, 9.172f)
                lineTo(4.929f, 7.757f)
                lineTo(0.686f, 12.0f)
                lineTo(4.929f, 16.243f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.757f, 19.071f)
                lineTo(12.0f, 23.314f)
                lineTo(16.243f, 19.071f)
                lineTo(14.828f, 17.657f)
                lineTo(12.0f, 20.485f)
                lineTo(9.172f, 17.657f)
                lineTo(7.757f, 19.071f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.657f, 9.172f)
                lineTo(20.485f, 12.0f)
                lineTo(17.657f, 14.828f)
                lineTo(19.071f, 16.243f)
                lineTo(23.314f, 12.0f)
                lineTo(19.071f, 7.757f)
                lineTo(17.657f, 9.172f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 8.0f)
                curveTo(14.209f, 8.0f, 16.0f, 9.791f, 16.0f, 12.0f)
                curveTo(16.0f, 14.209f, 14.209f, 16.0f, 12.0f, 16.0f)
                curveTo(9.791f, 16.0f, 8.0f, 14.209f, 8.0f, 12.0f)
                curveTo(8.0f, 9.791f, 9.791f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _controller!!
    }

private var _controller: ImageVector? = null
