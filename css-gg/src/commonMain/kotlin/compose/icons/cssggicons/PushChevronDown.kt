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

public val CssGgIcons.PushChevronDown: ImageVector
    get() {
        if (_pushChevronDown != null) {
            return _pushChevronDown!!
        }
        _pushChevronDown = Builder(name = "PushChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.414f)
                lineTo(6.414f, 6.0f)
                lineTo(12.071f, 11.657f)
                lineTo(17.728f, 6.0f)
                lineTo(19.142f, 7.414f)
                lineTo(12.071f, 14.485f)
                lineTo(5.0f, 7.414f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.343f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.343f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.343f)
                close()
            }
        }
        .build()
        return _pushChevronDown!!
    }

private var _pushChevronDown: ImageVector? = null
