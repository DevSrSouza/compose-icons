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

public val CssGgIcons.QuoteO: ImageVector
    get() {
        if (_quoteO != null) {
            return _quoteO!!
        }
        _quoteO = Builder(name = "QuoteO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(4.0f, 3.0f)
                curveTo(2.8954f, 3.0f, 2.0f, 3.8954f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.1046f, 2.8954f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 21.0f, 22.0f, 20.1046f, 22.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.8954f, 21.1046f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0672f, 9.1963f)
                horizontalLineTo(12.0672f)
                lineTo(9.9327f, 14.8038f)
                horizontalLineTo(6.9327f)
                lineTo(9.0672f, 9.1963f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0672f, 9.1963f)
                horizontalLineTo(17.0672f)
                lineTo(14.9327f, 14.8038f)
                horizontalLineTo(11.9327f)
                lineTo(14.0672f, 9.1963f)
                close()
            }
        }
        .build()
        return _quoteO!!
    }

private var _quoteO: ImageVector? = null
