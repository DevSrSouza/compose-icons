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

public val MaterialDesignIcons.GestureSwipe: ImageVector
    get() {
        if (_gestureSwipe != null) {
            return _gestureSwipe!!
        }
        _gestureSwipe = Builder(name = "GestureSwipe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.11f, 3.89f)
                lineTo(22.0f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                lineTo(19.08f, 4.92f)
                curveTo(18.55f, 4.23f, 17.64f, 3.66f, 16.36f, 3.19f)
                curveTo(15.08f, 2.72f, 13.63f, 2.5f, 12.0f, 2.5f)
                curveTo(10.38f, 2.5f, 8.92f, 2.72f, 7.64f, 3.19f)
                curveTo(6.36f, 3.66f, 5.45f, 4.23f, 4.92f, 4.92f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                lineTo(3.89f, 3.89f)
                curveTo(4.64f, 3.0f, 5.74f, 2.31f, 7.2f, 1.78f)
                curveTo(8.65f, 1.25f, 10.25f, 1.0f, 12.0f, 1.0f)
                curveTo(13.75f, 1.0f, 15.35f, 1.25f, 16.8f, 1.78f)
                curveTo(18.26f, 2.31f, 19.36f, 3.0f, 20.11f, 3.89f)
                moveTo(19.73f, 16.27f)
                verticalLineTo(16.45f)
                lineTo(19.0f, 21.7f)
                curveTo(18.92f, 22.08f, 18.76f, 22.39f, 18.5f, 22.64f)
                curveTo(18.23f, 22.89f, 17.91f, 23.0f, 17.53f, 23.0f)
                horizontalLineTo(10.73f)
                curveTo(10.36f, 23.0f, 10.0f, 22.86f, 9.7f, 22.55f)
                lineTo(4.73f, 17.63f)
                lineTo(5.53f, 16.83f)
                curveTo(5.75f, 16.61f, 6.0f, 16.5f, 6.33f, 16.5f)
                horizontalLineTo(6.56f)
                lineTo(10.0f, 17.25f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 6.11f, 10.13f, 5.76f, 10.43f, 5.46f)
                curveTo(10.73f, 5.16f, 11.08f, 5.0f, 11.5f, 5.0f)
                curveTo(11.89f, 5.0f, 12.24f, 5.16f, 12.54f, 5.46f)
                curveTo(12.84f, 5.76f, 13.0f, 6.11f, 13.0f, 6.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(13.78f)
                curveTo(13.88f, 12.5f, 14.05f, 12.55f, 14.3f, 12.61f)
                lineTo(18.84f, 14.86f)
                curveTo(19.44f, 15.14f, 19.73f, 15.61f, 19.73f, 16.27f)
                close()
            }
        }
        .build()
        return _gestureSwipe!!
    }

private var _gestureSwipe: ImageVector? = null
