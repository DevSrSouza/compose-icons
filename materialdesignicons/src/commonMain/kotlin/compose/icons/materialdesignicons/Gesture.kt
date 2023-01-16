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

public val MaterialDesignIcons.Gesture: ImageVector
    get() {
        if (_gesture != null) {
            return _gesture!!
        }
        _gesture = Builder(name = "Gesture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.59f, 6.89f)
                curveTo(5.29f, 6.18f, 6.0f, 5.54f, 6.3f, 5.67f)
                curveTo(6.8f, 5.87f, 6.3f, 6.7f, 6.0f, 7.19f)
                curveTo(5.75f, 7.61f, 3.14f, 11.08f, 3.14f, 13.5f)
                curveTo(3.14f, 14.78f, 3.62f, 15.84f, 4.5f, 16.5f)
                curveTo(5.23f, 17.04f, 6.22f, 17.21f, 7.12f, 16.94f)
                curveTo(8.19f, 16.63f, 9.07f, 15.54f, 10.18f, 14.17f)
                curveTo(11.39f, 12.68f, 13.0f, 10.73f, 14.26f, 10.73f)
                curveTo(15.89f, 10.73f, 15.91f, 11.74f, 16.0f, 12.5f)
                curveTo(12.24f, 13.16f, 10.64f, 16.19f, 10.64f, 17.89f)
                curveTo(10.64f, 19.59f, 12.08f, 21.0f, 13.85f, 21.0f)
                curveTo(15.5f, 21.0f, 18.14f, 19.65f, 18.54f, 14.88f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.38f)
                horizontalLineTo(18.53f)
                curveTo(18.38f, 10.73f, 17.44f, 8.18f, 14.5f, 8.18f)
                curveTo(12.25f, 8.18f, 10.32f, 10.09f, 9.56f, 11.0f)
                curveTo(9.0f, 11.75f, 7.5f, 13.5f, 7.27f, 13.74f)
                curveTo(7.0f, 14.04f, 6.59f, 14.58f, 6.16f, 14.58f)
                curveTo(5.71f, 14.58f, 5.44f, 13.75f, 5.8f, 12.66f)
                curveTo(6.15f, 11.57f, 7.2f, 9.8f, 7.65f, 9.14f)
                curveTo(8.43f, 8.0f, 8.95f, 7.22f, 8.95f, 5.86f)
                curveTo(8.95f, 3.69f, 7.31f, 3.0f, 6.44f, 3.0f)
                curveTo(5.12f, 3.0f, 3.97f, 4.0f, 3.72f, 4.25f)
                curveTo(3.36f, 4.61f, 3.06f, 4.91f, 2.84f, 5.18f)
                lineTo(4.59f, 6.89f)
                moveTo(13.88f, 18.55f)
                curveTo(13.57f, 18.55f, 13.14f, 18.29f, 13.14f, 17.83f)
                curveTo(13.14f, 17.23f, 13.87f, 15.63f, 16.0f, 15.07f)
                curveTo(15.71f, 17.76f, 14.58f, 18.55f, 13.88f, 18.55f)
                close()
            }
        }
        .build()
        return _gesture!!
    }

private var _gesture: ImageVector? = null
