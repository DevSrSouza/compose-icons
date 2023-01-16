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

public val MaterialDesignIcons.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.76f, 2.0f)
                horizontalLineTo(4.24f)
                curveTo(3.0f, 2.0f, 2.0f, 3.0f, 2.0f, 4.24f)
                verticalLineTo(19.76f)
                curveTo(2.0f, 21.0f, 3.0f, 22.0f, 4.24f, 22.0f)
                horizontalLineTo(19.76f)
                curveTo(21.0f, 22.0f, 22.0f, 21.0f, 22.0f, 19.76f)
                verticalLineTo(4.24f)
                curveTo(22.0f, 3.0f, 21.0f, 2.0f, 19.76f, 2.0f)
                moveTo(17.73f, 14.69f)
                curveTo(17.73f, 14.88f, 17.57f, 14.96f, 17.38f, 15.04f)
                curveTo(16.64f, 15.36f, 15.84f, 15.65f, 15.0f, 15.65f)
                curveTo(13.78f, 15.65f, 13.22f, 14.91f, 11.78f, 14.91f)
                curveTo(10.74f, 14.91f, 9.65f, 15.28f, 8.77f, 15.68f)
                curveTo(8.71f, 15.71f, 8.66f, 15.71f, 8.61f, 15.73f)
                verticalLineTo(17.76f)
                curveTo(8.61f, 17.84f, 8.61f, 17.92f, 8.58f, 17.97f)
                verticalLineTo(18.03f)
                curveTo(8.47f, 18.4f, 8.13f, 18.67f, 7.73f, 18.67f)
                curveTo(7.22f, 18.67f, 6.82f, 18.26f, 6.82f, 17.76f)
                verticalLineTo(8.0f)
                curveTo(6.47f, 7.73f, 6.24f, 7.31f, 6.24f, 6.83f)
                curveTo(6.24f, 6.0f, 6.9f, 5.33f, 7.73f, 5.33f)
                curveTo(8.56f, 5.33f, 9.23f, 6.0f, 9.23f, 6.83f)
                curveTo(9.23f, 7.31f, 9.0f, 7.73f, 8.64f, 8.0f)
                verticalLineTo(8.83f)
                curveTo(8.72f, 8.8f, 8.8f, 8.77f, 8.88f, 8.72f)
                curveTo(9.71f, 8.37f, 10.7f, 8.08f, 11.63f, 8.08f)
                curveTo(12.64f, 8.08f, 13.44f, 8.35f, 14.35f, 8.69f)
                curveTo(14.54f, 8.77f, 14.72f, 8.8f, 14.93f, 8.8f)
                curveTo(15.95f, 8.8f, 17.07f, 8.08f, 17.34f, 8.08f)
                curveTo(17.55f, 8.08f, 17.74f, 8.24f, 17.74f, 8.43f)
                verticalLineTo(14.69f)
                horizontalLineTo(17.73f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
