package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.PushChevronRight: ImageVector
    get() {
        if (_pushChevronRight != null) {
            return _pushChevronRight!!
        }
        _pushChevronRight = Builder(name = "PushChevronRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4142f, 5.0f)
                lineTo(6.0f, 6.4142f)
                lineTo(11.6569f, 12.0711f)
                lineTo(6.0f, 17.7279f)
                lineTo(7.4142f, 19.1421f)
                lineTo(14.4853f, 12.0711f)
                lineTo(7.4142f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3432f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.3432f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.3432f)
                close()
            }
        }
        .build()
        return _pushChevronRight!!
    }

private var _pushChevronRight: ImageVector? = null
