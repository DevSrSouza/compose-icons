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

public val MaterialDesignIcons.CommentOffOutline: ImageVector
    get() {
        if (_commentOffOutline != null) {
            return _commentOffOutline!!
        }
        _commentOffOutline = Builder(name = "CommentOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2f, 4.0f)
                lineTo(5.2f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 16.76f, 21.57f, 17.41f, 20.95f, 17.75f)
                lineTo(19.2f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10.0f, 21.9f, 9.75f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 22.0f, 8.0f, 21.55f, 8.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 18.0f, 2.0f, 17.11f, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.97f, 2.0f, 3.93f, 2.0f, 3.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(14.11f, 16.0f)
                lineTo(4.0f, 5.89f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.08f)
                lineTo(13.08f, 16.0f)
                horizontalLineTo(14.11f)
                close()
            }
        }
        .build()
        return _commentOffOutline!!
    }

private var _commentOffOutline: ImageVector? = null
