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

public val MaterialDesignIcons.PrinterPosOff: ImageVector
    get() {
        if (_printerPosOff != null) {
            return _printerPosOff!!
        }
        _printerPosOff = Builder(name = "PrinterPosOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2f, 9.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.2f)
                moveTo(20.0f, 16.8f)
                verticalLineTo(12.0f)
                curveTo(20.0f, 10.9f, 19.11f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(13.2f)
                lineTo(20.0f, 16.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 10.9f, 4.89f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(8.11f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _printerPosOff!!
    }

private var _printerPosOff: ImageVector? = null
