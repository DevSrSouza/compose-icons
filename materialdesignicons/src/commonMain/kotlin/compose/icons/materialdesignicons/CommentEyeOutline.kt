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

public val MaterialDesignIcons.CommentEyeOutline: ImageVector
    get() {
        if (_commentEyeOutline != null) {
            return _commentEyeOutline!!
        }
        _commentEyeOutline = Builder(name = "CommentEyeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(16.56f, 6.0f, 17.0f, 6.44f, 17.0f, 7.0f)
                curveTo(17.0f, 7.56f, 16.56f, 8.0f, 16.0f, 8.0f)
                curveTo(15.44f, 8.0f, 15.0f, 7.56f, 15.0f, 7.0f)
                curveTo(15.0f, 6.44f, 15.44f, 6.0f, 16.0f, 6.0f)
                moveTo(16.0f, 3.0f)
                curveTo(18.73f, 3.0f, 21.06f, 4.66f, 22.0f, 7.0f)
                curveTo(21.06f, 9.34f, 18.73f, 11.0f, 16.0f, 11.0f)
                curveTo(13.27f, 11.0f, 10.94f, 9.34f, 10.0f, 7.0f)
                curveTo(10.94f, 4.66f, 13.27f, 3.0f, 16.0f, 3.0f)
                moveTo(16.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.0f, 4.5f)
                moveTo(18.0f, 12.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.08f)
                lineTo(10.0f, 19.08f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.27f)
                curveTo(8.59f, 5.27f, 9.0f, 4.6f, 9.5f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.11f, 2.9f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 22.0f)
                horizontalLineTo(9.5f)
                curveTo(9.75f, 22.0f, 10.0f, 21.9f, 10.2f, 21.71f)
                lineTo(13.9f, 18.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 18.0f, 20.0f, 17.11f, 20.0f, 16.0f)
                verticalLineTo(12.0f)
                curveTo(19.37f, 12.33f, 18.7f, 12.58f, 18.0f, 12.75f)
                close()
            }
        }
        .build()
        return _commentEyeOutline!!
    }

private var _commentEyeOutline: ImageVector? = null
