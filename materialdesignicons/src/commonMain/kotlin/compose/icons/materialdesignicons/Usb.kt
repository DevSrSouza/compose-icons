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

public val MaterialDesignIcons.Usb: ImageVector
    get() {
        if (_usb != null) {
            return _usb!!
        }
        _usb = Builder(name = "Usb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                lineTo(12.0f, 1.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.93f)
                curveTo(8.7f, 10.56f, 9.2f, 9.85f, 9.2f, 9.0f)
                curveTo(9.2f, 7.78f, 8.21f, 6.8f, 7.0f, 6.8f)
                curveTo(5.78f, 6.8f, 4.8f, 7.78f, 4.8f, 9.0f)
                curveTo(4.8f, 9.85f, 5.3f, 10.56f, 6.0f, 10.93f)
                verticalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.05f)
                curveTo(10.29f, 18.41f, 9.8f, 19.15f, 9.8f, 20.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 12.0f, 22.2f)
                arcTo(2.2f, 2.2f, 0.0f, false, false, 14.2f, 20.0f)
                curveTo(14.2f, 19.15f, 13.71f, 18.41f, 13.0f, 18.05f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _usb!!
    }

private var _usb: ImageVector? = null
