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

public val MaterialDesignIcons.CommentEye: ImageVector
    get() {
        if (_commentEye != null) {
            return _commentEye!!
        }
        _commentEye = Builder(name = "CommentEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 17.11f, 19.11f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10.0f, 21.89f, 9.76f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(8.95f, 4.67f, 8.5f, 5.42f, 8.14f, 6.25f)
                lineTo(7.85f, 7.0f)
                lineTo(8.14f, 7.75f)
                curveTo(9.43f, 10.94f, 12.5f, 13.0f, 16.0f, 13.0f)
                curveTo(17.44f, 13.0f, 18.8f, 12.63f, 20.0f, 12.0f)
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
            }
        }
        .build()
        return _commentEye!!
    }

private var _commentEye: ImageVector? = null
