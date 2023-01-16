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

public val MaterialDesignIcons.PrinterPosOffOutline: ImageVector
    get() {
        if (_printerPosOffOutline != null) {
            return _printerPosOffOutline!!
        }
        _printerPosOffOutline = Builder(name = "PrinterPosOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(7.0f, 8.89f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(6.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.11f)
                lineTo(15.11f, 17.0f)
                horizontalLineTo(6.0f)
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 10.0f, 20.0f, 10.9f, 20.0f, 12.0f)
                verticalLineTo(16.8f)
                lineTo(18.0f, 14.8f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.2f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                moveTo(7.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _printerPosOffOutline!!
    }

private var _printerPosOffOutline: ImageVector? = null
