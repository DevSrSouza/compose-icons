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
                moveTo(7.414f, 5.0f)
                lineTo(6.0f, 6.414f)
                lineTo(11.657f, 12.071f)
                lineTo(6.0f, 17.728f)
                lineTo(7.414f, 19.142f)
                lineTo(14.485f, 12.071f)
                lineTo(7.414f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.343f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.343f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.343f)
                close()
            }
        }
        .build()
        return _pushChevronRight!!
    }

private var _pushChevronRight: ImageVector? = null
