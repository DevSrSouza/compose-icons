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
                curveTo(20.1046f, 21.0f, 21.0f, 20.1046f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.8954f, 20.1046f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 3.0f, 3.0f, 3.8954f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1046f, 3.8954f, 21.0f, 5.0f, 21.0f)
                close()
                moveTo(1.0f, 19.0f)
                curveTo(1.0f, 21.2091f, 2.7909f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 23.0f, 23.0f, 21.2091f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 2.7909f, 21.2091f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(2.7909f, 1.0f, 1.0f, 2.7909f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(9.1715f, 16.7116f)
                lineTo(7.7573f, 15.2974f)
                lineTo(11.9999f, 11.0547f)
                lineTo(16.2426f, 15.2974f)
                lineTo(14.8284f, 16.7116f)
                lineTo(12.0f, 13.8832f)
                lineTo(9.1715f, 16.7116f)
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
