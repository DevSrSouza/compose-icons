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

public val MaterialDesignIcons.CommentTextMultiple: ImageVector
    get() {
        if (_commentTextMultiple != null) {
            return _commentTextMultiple!!
        }
        _commentTextMultiple = Builder(name = "CommentTextMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 1.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 5.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 19.0f)
                horizontalLineTo(16.9f)
                lineTo(13.2f, 22.71f)
                curveTo(13.0f, 22.89f, 12.76f, 23.0f, 12.5f, 23.0f)
                horizontalLineTo(12.0f)
                moveTo(9.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _commentTextMultiple!!
    }

private var _commentTextMultiple: ImageVector? = null
