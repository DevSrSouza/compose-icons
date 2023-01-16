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

public val MaterialDesignIcons.PrinterWireless: ImageVector
    get() {
        if (_printerWireless != null) {
            return _printerWireless!!
        }
        _printerWireless = Builder(name = "PrinterWireless", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.93f, 3.92f)
                lineTo(6.34f, 5.33f)
                curveTo(9.46f, 2.2f, 14.53f, 2.2f, 17.66f, 5.33f)
                lineTo(19.07f, 3.92f)
                curveTo(15.17f, 0.0f, 8.84f, 0.0f, 4.93f, 3.92f)
                moveTo(7.76f, 6.75f)
                lineTo(9.17f, 8.16f)
                curveTo(10.73f, 6.6f, 13.26f, 6.6f, 14.83f, 8.16f)
                lineTo(16.24f, 6.75f)
                curveTo(13.9f, 4.41f, 10.1f, 4.41f, 7.76f, 6.75f)
                moveTo(19.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 14.0f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                moveTo(19.0f, 10.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _printerWireless!!
    }

private var _printerWireless: ImageVector? = null
