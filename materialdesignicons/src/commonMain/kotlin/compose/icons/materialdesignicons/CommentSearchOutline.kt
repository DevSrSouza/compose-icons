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

public val MaterialDesignIcons.CommentSearchOutline: ImageVector
    get() {
        if (_commentSearchOutline != null) {
            return _commentSearchOutline!!
        }
        _commentSearchOutline = Builder(name = "CommentSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(9.25f, 4.64f, 9.09f, 5.31f, 9.04f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.08f)
                lineTo(13.08f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.23f)
                lineTo(20.0f, 15.23f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 18.0f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10.0f, 21.9f, 9.75f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
                moveTo(15.5f, 2.0f)
                curveTo(18.0f, 2.0f, 20.0f, 4.0f, 20.0f, 6.5f)
                curveTo(20.0f, 7.38f, 19.75f, 8.2f, 19.31f, 8.89f)
                lineTo(22.41f, 12.0f)
                lineTo(21.0f, 13.39f)
                lineTo(17.89f, 10.31f)
                curveTo(17.2f, 10.75f, 16.38f, 11.0f, 15.5f, 11.0f)
                curveTo(13.0f, 11.0f, 11.0f, 9.0f, 11.0f, 6.5f)
                curveTo(11.0f, 4.0f, 13.0f, 2.0f, 15.5f, 2.0f)
                moveTo(15.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 15.5f, 4.0f)
                close()
            }
        }
        .build()
        return _commentSearchOutline!!
    }

private var _commentSearchOutline: ImageVector? = null
