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

public val MaterialDesignIcons.PrinterSearch: ImageVector
    get() {
        if (_printerSearch != null) {
            return _printerSearch!!
        }
        _printerSearch = Builder(name = "PrinterSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3f, 18.9f)
                curveTo(20.7f, 18.2f, 21.0f, 17.4f, 21.0f, 16.5f)
                curveTo(21.0f, 14.0f, 19.0f, 12.0f, 16.5f, 12.0f)
                reflectiveCurveTo(12.0f, 14.0f, 12.0f, 16.5f)
                reflectiveCurveTo(14.0f, 21.0f, 16.5f, 21.0f)
                curveTo(17.4f, 21.0f, 18.2f, 20.8f, 18.9f, 20.3f)
                lineTo(22.0f, 23.4f)
                lineTo(23.4f, 22.0f)
                lineTo(20.3f, 18.9f)
                moveTo(16.5f, 19.0f)
                curveTo(15.1f, 19.0f, 14.0f, 17.9f, 14.0f, 16.5f)
                reflectiveCurveTo(15.1f, 14.0f, 16.5f, 14.0f)
                reflectiveCurveTo(19.0f, 15.1f, 19.0f, 16.5f)
                reflectiveCurveTo(17.9f, 19.0f, 16.5f, 19.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                moveTo(6.0f, 21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 9.3f, 3.3f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(19.0f)
                curveTo(20.7f, 8.0f, 22.0f, 9.3f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(20.8f, 11.2f, 18.8f, 10.0f, 16.5f, 10.0f)
                curveTo(13.8f, 10.0f, 11.5f, 11.7f, 10.5f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.5f)
                curveTo(10.8f, 19.7f, 11.3f, 20.4f, 11.8f, 21.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _printerSearch!!
    }

private var _printerSearch: ImageVector? = null
