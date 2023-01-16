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

public val MaterialDesignIcons.Soundcloud: ImageVector
    get() {
        if (_soundcloud != null) {
            return _soundcloud!!
        }
        _soundcloud = Builder(name = "Soundcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.56f, 8.87f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.32f)
                verticalLineTo(17.0f)
                curveTo(22.17f, 16.87f, 23.0f, 15.73f, 23.0f, 14.33f)
                curveTo(23.0f, 12.85f, 21.88f, 11.66f, 20.38f, 11.66f)
                curveTo(20.0f, 11.66f, 19.68f, 11.74f, 19.35f, 11.88f)
                curveTo(19.11f, 9.54f, 17.12f, 7.71f, 14.67f, 7.71f)
                curveTo(13.5f, 7.71f, 12.39f, 8.15f, 11.56f, 8.87f)
                moveTo(10.68f, 9.89f)
                curveTo(10.38f, 9.71f, 10.06f, 9.57f, 9.71f, 9.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.1f)
                verticalLineTo(9.34f)
                curveTo(10.95f, 9.5f, 10.81f, 9.7f, 10.68f, 9.89f)
                moveTo(8.33f, 9.35f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(9.38f)
                curveTo(9.06f, 9.35f, 8.87f, 9.34f, 8.67f, 9.34f)
                curveTo(8.55f, 9.34f, 8.44f, 9.34f, 8.33f, 9.35f)
                moveTo(6.5f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.41f)
                verticalLineTo(9.54f)
                curveTo(7.08f, 9.65f, 6.77f, 9.81f, 6.5f, 10.0f)
                moveTo(4.83f, 12.5f)
                curveTo(4.77f, 12.5f, 4.71f, 12.44f, 4.64f, 12.41f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.56f)
                verticalLineTo(10.86f)
                curveTo(5.19f, 11.34f, 4.94f, 11.91f, 4.83f, 12.5f)
                moveTo(2.79f, 12.22f)
                verticalLineTo(16.91f)
                curveTo(3.0f, 16.97f, 3.24f, 17.0f, 3.5f, 17.0f)
                horizontalLineTo(3.72f)
                verticalLineTo(12.14f)
                curveTo(3.64f, 12.13f, 3.56f, 12.12f, 3.5f, 12.12f)
                curveTo(3.24f, 12.12f, 3.0f, 12.16f, 2.79f, 12.22f)
                moveTo(1.0f, 14.56f)
                curveTo(1.0f, 15.31f, 1.34f, 15.97f, 1.87f, 16.42f)
                verticalLineTo(12.71f)
                curveTo(1.34f, 13.15f, 1.0f, 13.82f, 1.0f, 14.56f)
                close()
            }
        }
        .build()
        return _soundcloud!!
    }

private var _soundcloud: ImageVector? = null
