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

public val MaterialDesignIcons.ForumRemove: ImageVector
    get() {
        if (_forumRemove != null) {
            return _forumRemove!!
        }
        _forumRemove = Builder(name = "ForumRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.1f)
                curveTo(20.2f, 12.3f, 21.2f, 12.8f, 22.0f, 13.5f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 6.5f, 21.5f, 6.0f, 21.0f, 6.0f)
                moveTo(6.0f, 17.0f)
                curveTo(6.0f, 17.5f, 6.5f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 16.9f, 12.3f, 15.9f, 12.8f, 15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                moveTo(16.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(2.5f, 2.0f, 2.0f, 2.5f, 2.0f, 3.0f)
                verticalLineTo(17.0f)
                lineTo(6.0f, 13.0f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 12.5f, 16.2f, 12.2f, 17.0f, 12.1f)
                verticalLineTo(3.0f)
                curveTo(17.0f, 2.5f, 16.5f, 2.0f, 16.0f, 2.0f)
                moveTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18.0f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18.0f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.47f, 20.12f)
                lineTo(16.59f, 18.0f)
                lineTo(14.47f, 15.88f)
                lineTo(15.88f, 14.47f)
                lineTo(18.0f, 16.59f)
                lineTo(20.12f, 14.46f)
                close()
            }
        }
        .build()
        return _forumRemove!!
    }

private var _forumRemove: ImageVector? = null
