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

public val MaterialDesignIcons.FireworkOff: ImageVector
    get() {
        if (_fireworkOff != null) {
            return _fireworkOff!!
        }
        _fireworkOff = Builder(name = "FireworkOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(13.17f, 15.06f)
                lineTo(8.72f, 19.5f)
                lineTo(7.29f, 18.09f)
                curveTo(7.04f, 18.16f, 6.8f, 18.28f, 6.63f, 18.5f)
                curveTo(6.57f, 18.57f, 6.5f, 18.65f, 6.5f, 18.74f)
                curveTo(6.42f, 18.88f, 6.38f, 19.0f, 6.32f, 19.15f)
                curveTo(6.21f, 19.42f, 6.09f, 19.69f, 5.93f, 19.93f)
                curveTo(5.81f, 20.1f, 5.68f, 20.26f, 5.53f, 20.39f)
                curveTo(5.42f, 20.5f, 5.29f, 20.59f, 5.16f, 20.66f)
                curveTo(5.08f, 20.71f, 5.0f, 20.76f, 4.9f, 20.79f)
                curveTo(4.3f, 21.04f, 3.63f, 21.0f, 3.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.9f)
                curveTo(4.0f, 19.0f, 4.08f, 19.0f, 4.16f, 18.94f)
                lineTo(4.21f, 18.89f)
                curveTo(4.28f, 18.81f, 4.34f, 18.7f, 4.39f, 18.6f)
                curveTo(4.47f, 18.42f, 4.53f, 18.24f, 4.6f, 18.06f)
                lineTo(4.64f, 17.96f)
                curveTo(4.76f, 17.69f, 4.9f, 17.45f, 5.08f, 17.23f)
                curveTo(5.18f, 17.1f, 5.3f, 17.0f, 5.42f, 16.87f)
                curveTo(5.54f, 16.77f, 5.66f, 16.67f, 5.8f, 16.59f)
                lineTo(4.5f, 15.28f)
                lineTo(8.94f, 10.83f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(21.0f, 3.0f)
                lineTo(12.81f, 4.12f)
                lineTo(19.88f, 11.19f)
                lineTo(21.0f, 3.0f)
                moveTo(16.5f, 11.74f)
                lineTo(12.26f, 7.5f)
                lineTo(11.5f, 8.28f)
                lineTo(15.72f, 12.5f)
                lineTo(16.5f, 11.74f)
                close()
            }
        }
        .build()
        return _fireworkOff!!
    }

private var _fireworkOff: ImageVector? = null
