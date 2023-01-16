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

public val MaterialDesignIcons.CommentQuestion: ImageVector
    get() {
        if (_commentQuestion != null) {
            return _commentQuestion!!
        }
        _commentQuestion = Builder(name = "CommentQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(13.9f)
                lineTo(10.2f, 21.71f)
                curveTo(10.0f, 21.9f, 9.75f, 22.0f, 9.5f, 22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.89f, 2.9f, 2.0f, 4.0f, 2.0f)
                moveTo(12.19f, 5.5f)
                curveTo(11.3f, 5.5f, 10.59f, 5.68f, 10.05f, 6.04f)
                curveTo(9.5f, 6.4f, 9.22f, 7.0f, 9.27f, 7.69f)
                horizontalLineTo(11.24f)
                curveTo(11.24f, 7.41f, 11.34f, 7.2f, 11.5f, 7.06f)
                curveTo(11.7f, 6.92f, 11.92f, 6.85f, 12.19f, 6.85f)
                curveTo(12.5f, 6.85f, 12.77f, 6.93f, 12.95f, 7.11f)
                curveTo(13.13f, 7.28f, 13.22f, 7.5f, 13.22f, 7.8f)
                curveTo(13.22f, 8.08f, 13.14f, 8.33f, 13.0f, 8.54f)
                curveTo(12.83f, 8.76f, 12.62f, 8.94f, 12.36f, 9.08f)
                curveTo(11.84f, 9.4f, 11.5f, 9.68f, 11.29f, 9.92f)
                curveTo(11.1f, 10.16f, 11.0f, 10.5f, 11.0f, 11.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 10.72f, 13.05f, 10.5f, 13.14f, 10.32f)
                curveTo(13.23f, 10.15f, 13.4f, 10.0f, 13.66f, 9.85f)
                curveTo(14.12f, 9.64f, 14.5f, 9.36f, 14.79f, 9.0f)
                curveTo(15.08f, 8.63f, 15.23f, 8.24f, 15.23f, 7.8f)
                curveTo(15.23f, 7.1f, 14.96f, 6.54f, 14.42f, 6.12f)
                curveTo(13.88f, 5.71f, 13.13f, 5.5f, 12.19f, 5.5f)
                moveTo(11.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _commentQuestion!!
    }

private var _commentQuestion: ImageVector? = null
