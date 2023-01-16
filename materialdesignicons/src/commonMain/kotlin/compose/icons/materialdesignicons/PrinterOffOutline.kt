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

public val MaterialDesignIcons.PrinterOffOutline: ImageVector
    get() {
        if (_printerOffOutline != null) {
            return _printerOffOutline!!
        }
        _printerOffOutline = Builder(name = "PrinterOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.41f, 1.6f)
                lineTo(22.36f, 22.55f)
                lineTo(20.95f, 23.96f)
                lineTo(18.0f, 21.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 9.34f, 3.34f, 8.0f, 5.0f, 8.0f)
                lineTo(0.0f, 3.0f)
                lineTo(1.41f, 1.6f)
                moveTo(6.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                lineTo(7.0f, 10.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 10.0f, 4.0f, 10.45f, 4.0f, 11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                moveTo(8.0f, 19.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                moveTo(8.0f, 5.0f)
                verticalLineTo(5.36f)
                lineTo(6.0f, 3.36f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                curveTo(20.66f, 8.0f, 22.0f, 9.34f, 22.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.66f)
                lineTo(15.66f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                lineTo(20.0f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(20.0f, 10.45f, 19.55f, 10.0f, 19.0f, 10.0f)
                horizontalLineTo(12.66f)
                lineTo(10.66f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                moveTo(19.0f, 11.5f)
                curveTo(19.0f, 12.06f, 18.55f, 12.5f, 18.0f, 12.5f)
                curveTo(17.45f, 12.5f, 17.0f, 12.06f, 17.0f, 11.5f)
                curveTo(17.0f, 10.96f, 17.45f, 10.5f, 18.0f, 10.5f)
                curveTo(18.55f, 10.5f, 19.0f, 10.96f, 19.0f, 11.5f)
                close()
            }
        }
        .build()
        return _printerOffOutline!!
    }

private var _printerOffOutline: ImageVector? = null
