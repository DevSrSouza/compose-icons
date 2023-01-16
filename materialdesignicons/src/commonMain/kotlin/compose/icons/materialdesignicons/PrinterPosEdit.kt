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

public val MaterialDesignIcons.PrinterPosEdit: ImageVector
    get() {
        if (_printerPosEdit != null) {
            return _printerPosEdit!!
        }
        _printerPosEdit = Builder(name = "PrinterPosEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                moveTo(19.39f, 10.74f)
                lineTo(11.13f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 10.9f, 4.89f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(18.59f, 10.0f, 19.11f, 10.26f, 19.5f, 10.67f)
                curveTo(19.45f, 10.69f, 19.42f, 10.71f, 19.39f, 10.74f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                moveTo(13.0f, 19.96f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13.0f, 19.96f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21.0f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14.0f, 23.05f, 13.67f, 22.85f, 13.47f)
                close()
            }
        }
        .build()
        return _printerPosEdit!!
    }

private var _printerPosEdit: ImageVector? = null
