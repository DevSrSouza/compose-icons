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

public val MaterialDesignIcons.PrinterPosCancelOutline: ImageVector
    get() {
        if (_printerPosCancelOutline != null) {
            return _printerPosCancelOutline!!
        }
        _printerPosCancelOutline = Builder(name = "PrinterPosCancelOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 14.0f)
                curveTo(16.0f, 14.0f, 14.0f, 16.0f, 14.0f, 18.5f)
                reflectiveCurveTo(16.0f, 23.0f, 18.5f, 23.0f)
                reflectiveCurveTo(23.0f, 21.0f, 23.0f, 18.5f)
                reflectiveCurveTo(21.0f, 14.0f, 18.5f, 14.0f)
                moveTo(18.5f, 21.5f)
                curveTo(16.84f, 21.5f, 15.5f, 20.16f, 15.5f, 18.5f)
                curveTo(15.5f, 17.94f, 15.65f, 17.42f, 15.92f, 17.0f)
                lineTo(20.0f, 21.08f)
                curveTo(19.58f, 21.35f, 19.06f, 21.5f, 18.5f, 21.5f)
                moveTo(21.08f, 20.0f)
                lineTo(17.0f, 15.92f)
                curveTo(17.42f, 15.65f, 17.94f, 15.5f, 18.5f, 15.5f)
                curveTo(20.16f, 15.5f, 21.5f, 16.84f, 21.5f, 18.5f)
                curveTo(21.5f, 19.06f, 21.35f, 19.58f, 21.08f, 20.0f)
                moveTo(7.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                moveTo(6.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 10.9f, 19.11f, 10.0f, 18.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.03f)
                curveTo(12.0f, 18.83f, 12.0f, 18.67f, 12.0f, 18.5f)
                curveTo(12.0f, 18.0f, 12.07f, 17.5f, 12.18f, 17.0f)
                horizontalLineTo(6.0f)
                moveTo(9.0f, 6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _printerPosCancelOutline!!
    }

private var _printerPosCancelOutline: ImageVector? = null
