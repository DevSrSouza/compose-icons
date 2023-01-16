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

public val MaterialDesignIcons.PhoneMissed: ImageVector
    get() {
        if (_phoneMissed != null) {
            return _phoneMissed!!
        }
        _phoneMissed = Builder(name = "PhoneMissed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 16.67f)
                curveTo(20.66f, 13.77f, 16.54f, 12.0f, 12.0f, 12.0f)
                curveTo(7.46f, 12.0f, 3.34f, 13.77f, 0.29f, 16.67f)
                curveTo(0.11f, 16.85f, 0.0f, 17.1f, 0.0f, 17.38f)
                curveTo(0.0f, 17.65f, 0.11f, 17.9f, 0.29f, 18.08f)
                lineTo(2.77f, 20.56f)
                curveTo(2.95f, 20.74f, 3.2f, 20.86f, 3.5f, 20.86f)
                curveTo(3.75f, 20.86f, 4.0f, 20.75f, 4.18f, 20.57f)
                curveTo(4.97f, 19.83f, 5.86f, 19.21f, 6.84f, 18.72f)
                curveTo(7.17f, 18.56f, 7.4f, 18.22f, 7.4f, 17.82f)
                verticalLineTo(14.72f)
                curveTo(8.85f, 14.25f, 10.39f, 14.0f, 12.0f, 14.0f)
                curveTo(13.6f, 14.0f, 15.15f, 14.25f, 16.6f, 14.72f)
                verticalLineTo(17.82f)
                curveTo(16.6f, 18.22f, 16.83f, 18.56f, 17.16f, 18.72f)
                curveTo(18.14f, 19.21f, 19.03f, 19.83f, 19.82f, 20.57f)
                curveTo(20.0f, 20.75f, 20.25f, 20.86f, 20.5f, 20.86f)
                curveTo(20.8f, 20.86f, 21.05f, 20.74f, 21.23f, 20.56f)
                lineTo(23.71f, 18.08f)
                curveTo(23.89f, 17.9f, 24.0f, 17.65f, 24.0f, 17.38f)
                curveTo(24.0f, 17.1f, 23.89f, 16.85f, 23.71f, 16.67f)
                moveTo(6.5f, 5.5f)
                lineTo(12.0f, 11.0f)
                lineTo(19.0f, 4.0f)
                lineTo(18.0f, 3.0f)
                lineTo(12.0f, 9.0f)
                lineTo(7.5f, 4.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _phoneMissed!!
    }

private var _phoneMissed: ImageVector? = null
