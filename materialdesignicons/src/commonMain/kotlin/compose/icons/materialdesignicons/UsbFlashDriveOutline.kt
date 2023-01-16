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

public val MaterialDesignIcons.UsbFlashDriveOutline: ImageVector
    get() {
        if (_usbFlashDriveOutline != null) {
            return _usbFlashDriveOutline!!
        }
        _usbFlashDriveOutline = Builder(name = "UsbFlashDriveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                curveTo(9.66f, 13.0f, 11.0f, 14.34f, 11.0f, 16.0f)
                curveTo(11.0f, 17.66f, 9.66f, 19.0f, 8.0f, 19.0f)
                curveTo(6.34f, 19.0f, 5.0f, 17.66f, 5.0f, 16.0f)
                curveTo(5.0f, 14.34f, 6.34f, 13.0f, 8.0f, 13.0f)
                moveTo(8.0f, 15.0f)
                curveTo(7.45f, 15.0f, 7.0f, 15.45f, 7.0f, 16.0f)
                curveTo(7.0f, 16.55f, 7.45f, 17.0f, 8.0f, 17.0f)
                curveTo(8.55f, 17.0f, 9.0f, 16.55f, 9.0f, 16.0f)
                curveTo(9.0f, 15.45f, 8.55f, 15.0f, 8.0f, 15.0f)
                moveTo(9.77f, 4.33f)
                lineTo(10.5f, 5.08f)
                lineTo(14.29f, 1.29f)
                curveTo(14.47f, 1.11f, 14.72f, 1.0f, 15.0f, 1.0f)
                curveTo(15.28f, 1.0f, 15.53f, 1.11f, 15.71f, 1.29f)
                lineTo(22.78f, 8.36f)
                lineTo(22.78f, 8.37f)
                curveTo(22.92f, 8.54f, 23.0f, 8.76f, 23.0f, 9.0f)
                curveTo(23.0f, 9.3f, 22.87f, 9.57f, 22.66f, 9.76f)
                lineTo(22.66f, 9.76f)
                lineTo(18.93f, 13.5f)
                lineTo(19.67f, 14.23f)
                lineTo(12.95f, 20.95f)
                curveTo(11.68f, 22.22f, 9.93f, 23.0f, 8.0f, 23.0f)
                curveTo(4.13f, 23.0f, 1.0f, 19.87f, 1.0f, 16.0f)
                curveTo(1.0f, 14.07f, 1.78f, 12.32f, 3.05f, 11.05f)
                lineTo(9.77f, 4.33f)
                moveTo(11.54f, 19.54f)
                lineTo(16.84f, 14.23f)
                lineTo(9.77f, 7.16f)
                lineTo(4.46f, 12.46f)
                curveTo(3.56f, 13.37f, 3.0f, 14.62f, 3.0f, 16.0f)
                curveTo(3.0f, 18.76f, 5.24f, 21.0f, 8.0f, 21.0f)
                curveTo(9.38f, 21.0f, 10.63f, 20.44f, 11.54f, 19.54f)
                moveTo(15.07f, 4.69f)
                lineTo(16.5f, 6.1f)
                lineTo(15.07f, 7.5f)
                lineTo(13.66f, 6.1f)
                lineTo(15.07f, 4.69f)
                moveTo(17.9f, 7.5f)
                lineTo(19.31f, 8.93f)
                lineTo(17.9f, 10.34f)
                lineTo(16.5f, 8.93f)
                lineTo(17.9f, 7.5f)
                moveTo(20.59f, 9.0f)
                lineTo(15.0f, 3.41f)
                lineTo(11.93f, 6.5f)
                lineTo(17.5f, 12.08f)
                lineTo(20.59f, 9.0f)
                close()
            }
        }
        .build()
        return _usbFlashDriveOutline!!
    }

private var _usbFlashDriveOutline: ImageVector? = null
