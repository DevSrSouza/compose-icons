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

public val MaterialDesignIcons.PrinterOff: ImageVector
    get() {
        if (_printerOff != null) {
            return _printerOff!!
        }
        _printerOff = Builder(name = "PrinterOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                verticalLineTo(4.18f)
                lineTo(8.82f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                moveTo(2.28f, 3.0f)
                lineTo(1.0f, 4.27f)
                lineTo(4.75f, 8.0f)
                curveTo(3.19f, 8.15f, 2.0f, 9.44f, 2.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.73f)
                lineTo(19.73f, 23.0f)
                lineTo(21.0f, 21.72f)
                lineTo(2.28f, 3.0f)
                moveTo(9.82f, 8.0f)
                lineTo(18.82f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 8.0f)
                horizontalLineTo(9.82f)
                moveTo(19.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 10.0f)
                moveTo(8.0f, 14.0f)
                horizontalLineTo(10.73f)
                lineTo(15.73f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _printerOff!!
    }

private var _printerOff: ImageVector? = null
