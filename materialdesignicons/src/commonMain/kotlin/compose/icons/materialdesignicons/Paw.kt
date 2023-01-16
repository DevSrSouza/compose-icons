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

public val MaterialDesignIcons.Paw: ImageVector
    get() {
        if (_paw != null) {
            return _paw!!
        }
        _paw = Builder(name = "Paw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.35f, 3.0f)
                curveTo(9.53f, 2.83f, 10.78f, 4.12f, 11.14f, 5.9f)
                curveTo(11.5f, 7.67f, 10.85f, 9.25f, 9.67f, 9.43f)
                curveTo(8.5f, 9.61f, 7.24f, 8.32f, 6.87f, 6.54f)
                curveTo(6.5f, 4.77f, 7.17f, 3.19f, 8.35f, 3.0f)
                moveTo(15.5f, 3.0f)
                curveTo(16.69f, 3.19f, 17.35f, 4.77f, 17.0f, 6.54f)
                curveTo(16.62f, 8.32f, 15.37f, 9.61f, 14.19f, 9.43f)
                curveTo(13.0f, 9.25f, 12.35f, 7.67f, 12.72f, 5.9f)
                curveTo(13.08f, 4.12f, 14.33f, 2.83f, 15.5f, 3.0f)
                moveTo(3.0f, 7.6f)
                curveTo(4.14f, 7.11f, 5.69f, 8.0f, 6.5f, 9.55f)
                curveTo(7.26f, 11.13f, 7.0f, 12.79f, 5.87f, 13.28f)
                curveTo(4.74f, 13.77f, 3.2f, 12.89f, 2.41f, 11.32f)
                curveTo(1.62f, 9.75f, 1.9f, 8.08f, 3.0f, 7.6f)
                moveTo(21.0f, 7.6f)
                curveTo(22.1f, 8.08f, 22.38f, 9.75f, 21.59f, 11.32f)
                curveTo(20.8f, 12.89f, 19.26f, 13.77f, 18.13f, 13.28f)
                curveTo(17.0f, 12.79f, 16.74f, 11.13f, 17.5f, 9.55f)
                curveTo(18.31f, 8.0f, 19.86f, 7.11f, 21.0f, 7.6f)
                moveTo(19.33f, 18.38f)
                curveTo(19.37f, 19.32f, 18.65f, 20.36f, 17.79f, 20.75f)
                curveTo(16.0f, 21.57f, 13.88f, 19.87f, 11.89f, 19.87f)
                curveTo(9.9f, 19.87f, 7.76f, 21.64f, 6.0f, 20.75f)
                curveTo(5.0f, 20.26f, 4.31f, 18.96f, 4.44f, 17.88f)
                curveTo(4.62f, 16.39f, 6.41f, 15.59f, 7.47f, 14.5f)
                curveTo(8.88f, 13.09f, 9.88f, 10.44f, 11.89f, 10.44f)
                curveTo(13.89f, 10.44f, 14.95f, 13.05f, 16.3f, 14.5f)
                curveTo(17.41f, 15.72f, 19.26f, 16.75f, 19.33f, 18.38f)
                close()
            }
        }
        .build()
        return _paw!!
    }

private var _paw: ImageVector? = null
