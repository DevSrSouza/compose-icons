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

public val MaterialDesignIcons.PrinterEye: ImageVector
    get() {
        if (_printerEye != null) {
            return _printerEye!!
        }
        _printerEye = Builder(name = "PrinterEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8f, 21.0f)
                curveTo(9.6f, 20.6f, 9.3f, 20.2f, 9.2f, 19.7f)
                lineTo(8.8f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                curveTo(14.2f, 13.4f, 15.6f, 13.0f, 17.0f, 13.0f)
                curveTo(18.9f, 13.0f, 20.6f, 13.6f, 22.0f, 14.6f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 9.3f, 20.7f, 8.0f, 19.0f, 8.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3f, 8.0f, 2.0f, 9.3f, 2.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.8f)
                moveTo(19.0f, 10.0f)
                curveTo(19.6f, 10.0f, 20.0f, 10.4f, 20.0f, 11.0f)
                reflectiveCurveTo(19.6f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(18.0f, 11.6f, 18.0f, 11.0f)
                reflectiveCurveTo(18.4f, 10.0f, 19.0f, 10.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 18.0f)
                curveTo(17.6f, 18.0f, 18.0f, 18.4f, 18.0f, 19.0f)
                reflectiveCurveTo(17.6f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.6f, 16.0f, 19.0f)
                reflectiveCurveTo(16.4f, 18.0f, 17.0f, 18.0f)
                moveTo(17.0f, 15.0f)
                curveTo(14.3f, 15.0f, 11.9f, 16.7f, 11.0f, 19.0f)
                curveTo(11.9f, 21.3f, 14.3f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(22.1f, 21.3f, 23.0f, 19.0f)
                curveTo(22.1f, 16.7f, 19.7f, 15.0f, 17.0f, 15.0f)
                moveTo(17.0f, 21.5f)
                curveTo(15.6f, 21.5f, 14.5f, 20.4f, 14.5f, 19.0f)
                reflectiveCurveTo(15.6f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(19.5f, 17.6f, 19.5f, 19.0f)
                reflectiveCurveTo(18.4f, 21.5f, 17.0f, 21.5f)
                close()
            }
        }
        .build()
        return _printerEye!!
    }

private var _printerEye: ImageVector? = null
