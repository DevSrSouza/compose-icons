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

public val MaterialDesignIcons.PhoneClassicOff: ImageVector
    get() {
        if (_phoneClassicOff != null) {
            return _phoneClassicOff!!
        }
        _phoneClassicOff = Builder(name = "PhoneClassicOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.53f, 3.0f, 20.65f, 4.78f, 23.7f, 7.67f)
                curveTo(23.88f, 7.85f, 24.0f, 8.09f, 24.0f, 8.37f)
                curveTo(24.0f, 8.65f, 23.89f, 8.9f, 23.71f, 9.08f)
                lineTo(21.23f, 11.56f)
                curveTo(21.05f, 11.74f, 20.8f, 11.85f, 20.5f, 11.85f)
                curveTo(20.25f, 11.85f, 20.0f, 11.75f, 19.82f, 11.57f)
                curveTo(19.0f, 10.84f, 18.13f, 10.21f, 17.15f, 9.72f)
                curveTo(16.82f, 9.56f, 16.59f, 9.21f, 16.59f, 8.82f)
                verticalLineTo(5.72f)
                curveTo(15.14f, 5.25f, 13.59f, 5.0f, 12.0f, 5.0f)
                curveTo(10.44f, 5.0f, 8.93f, 5.24f, 7.5f, 5.69f)
                lineTo(5.94f, 4.11f)
                curveTo(7.82f, 3.4f, 9.86f, 3.0f, 12.0f, 3.0f)
                moveTo(9.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 10.0f, 21.0f, 15.0f, 21.0f, 18.0f)
                verticalLineTo(19.18f)
                lineTo(9.0f, 7.18f)
                verticalLineTo(7.0f)
                moveTo(1.0f, 4.27f)
                lineTo(2.28f, 3.0f)
                lineTo(21.5f, 22.22f)
                lineTo(20.23f, 23.5f)
                lineTo(18.73f, 22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 15.86f, 6.05f, 12.71f, 7.8f, 11.07f)
                lineTo(6.59f, 9.86f)
                curveTo(5.71f, 10.33f, 4.9f, 10.9f, 4.18f, 11.58f)
                curveTo(4.0f, 11.75f, 3.75f, 11.86f, 3.5f, 11.86f)
                curveTo(3.2f, 11.86f, 2.95f, 11.75f, 2.77f, 11.57f)
                lineTo(0.29f, 9.09f)
                curveTo(0.11f, 8.91f, 0.0f, 8.66f, 0.0f, 8.38f)
                curveTo(0.0f, 8.1f, 0.11f, 7.85f, 0.29f, 7.67f)
                curveTo(0.996f, 7.0f, 2.58f, 5.85f, 2.58f, 5.85f)
                lineTo(1.0f, 4.27f)
                moveTo(8.0f, 16.0f)
                curveTo(8.0f, 18.21f, 9.79f, 20.0f, 12.0f, 20.0f)
                curveTo(13.29f, 20.0f, 14.44f, 19.39f, 15.17f, 18.44f)
                lineTo(14.1f, 17.36f)
                curveTo(13.65f, 18.05f, 12.88f, 18.5f, 12.0f, 18.5f)
                curveTo(10.62f, 18.5f, 9.5f, 17.38f, 9.5f, 16.0f)
                curveTo(9.5f, 15.12f, 9.95f, 14.35f, 10.64f, 13.91f)
                lineTo(9.56f, 12.83f)
                curveTo(8.61f, 13.56f, 8.0f, 14.71f, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _phoneClassicOff!!
    }

private var _phoneClassicOff: ImageVector? = null
