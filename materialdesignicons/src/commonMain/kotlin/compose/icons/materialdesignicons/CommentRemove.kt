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

public val MaterialDesignIcons.CommentRemove: ImageVector
    get() {
        if (_commentRemove != null) {
            return _commentRemove!!
        }
        _commentRemove = Builder(name = "CommentRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.89f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10.0f, 21.9f, 9.75f, 22.0f, 9.5f, 22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                moveTo(9.41f, 6.0f)
                lineTo(8.0f, 7.41f)
                lineTo(10.59f, 10.0f)
                lineTo(8.0f, 12.59f)
                lineTo(9.41f, 14.0f)
                lineTo(12.0f, 11.41f)
                lineTo(14.59f, 14.0f)
                lineTo(16.0f, 12.59f)
                lineTo(13.41f, 10.0f)
                lineTo(16.0f, 7.41f)
                lineTo(14.59f, 6.0f)
                lineTo(12.0f, 8.59f)
                lineTo(9.41f, 6.0f)
                close()
            }
        }
        .build()
        return _commentRemove!!
    }

private var _commentRemove: ImageVector? = null
