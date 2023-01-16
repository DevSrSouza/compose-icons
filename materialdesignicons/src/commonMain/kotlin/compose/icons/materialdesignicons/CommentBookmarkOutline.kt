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

public val MaterialDesignIcons.CommentBookmarkOutline: ImageVector
    get() {
        if (_commentBookmarkOutline != null) {
            return _commentBookmarkOutline!!
        }
        _commentBookmarkOutline = Builder(name = "CommentBookmarkOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveTo(8.4f, 22.0f, 8.0f, 21.6f, 8.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 18.0f, 2.0f, 17.1f, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.1f, 21.1f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.7f)
                curveTo(10.0f, 21.9f, 9.8f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(9.0f)
                moveTo(10.0f, 16.0f)
                verticalLineTo(19.1f)
                lineTo(13.1f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                moveTo(18.0f, 14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                lineTo(15.5f, 12.5f)
                lineTo(18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _commentBookmarkOutline!!
    }

private var _commentBookmarkOutline: ImageVector? = null
