package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CommentQuote: ImageVector
    get() {
        if (_commentQuote != null) {
            return _commentQuote!!
        }
        _commentQuote = Builder(name = "CommentQuote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.1f, 2.9f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                curveTo(8.0f, 21.6f, 8.4f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(9.5f)
                curveTo(9.7f, 22.0f, 10.0f, 21.9f, 10.2f, 21.7f)
                lineTo(13.9f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 18.0f, 22.0f, 17.1f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(11.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.8f)
                lineTo(8.3f, 6.0f)
                horizontalLineTo(10.3f)
                lineTo(8.9f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(17.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.8f)
                lineTo(14.3f, 6.0f)
                horizontalLineTo(16.3f)
                lineTo(14.9f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _commentQuote!!
    }

private var _commentQuote: ImageVector? = null
