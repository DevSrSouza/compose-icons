package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PushChevronUpR: ImageVector
    get() {
        if (_pushChevronUpR != null) {
            return _pushChevronUpR!!
        }
        _pushChevronUpR = Builder(name = "PushChevronUpR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 21.0f, 21.0f, 20.105f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.895f, 20.105f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                close()
                moveTo(1.0f, 19.0f)
                curveTo(1.0f, 21.209f, 2.791f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 23.0f, 23.0f, 21.209f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 2.791f, 21.209f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(2.791f, 1.0f, 1.0f, 2.791f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(9.172f, 16.712f)
                lineTo(7.757f, 15.297f)
                lineTo(12.0f, 11.055f)
                lineTo(16.243f, 15.297f)
                lineTo(14.828f, 16.712f)
                lineTo(12.0f, 13.883f)
                lineTo(9.172f, 16.712f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _pushChevronUpR!!
    }

private var _pushChevronUpR: ImageVector? = null
