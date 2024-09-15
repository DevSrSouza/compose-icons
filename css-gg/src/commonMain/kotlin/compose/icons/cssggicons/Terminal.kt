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

public val CssGgIcons.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.033f, 14.828f)
                lineTo(6.448f, 16.243f)
                lineTo(10.69f, 12.0f)
                lineTo(6.448f, 7.757f)
                lineTo(5.033f, 9.172f)
                lineTo(7.862f, 12.0f)
                lineTo(5.033f, 14.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                curveTo(0.895f, 2.0f, 0.0f, 2.895f, 0.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(0.0f, 21.105f, 0.895f, 22.0f, 2.0f, 22.0f)
                horizontalLineTo(22.0f)
                curveTo(23.105f, 22.0f, 24.0f, 21.105f, 24.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(24.0f, 2.895f, 23.105f, 2.0f, 22.0f, 2.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(22.0f, 4.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
