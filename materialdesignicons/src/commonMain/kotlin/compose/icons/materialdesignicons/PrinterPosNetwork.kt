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

public val MaterialDesignIcons.PrinterPosNetwork: ImageVector
    get() {
        if (_printerPosNetwork != null) {
            return _printerPosNetwork!!
        }
        _printerPosNetwork = Builder(name = "PrinterPosNetwork", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                moveTo(22.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 22.55f, 14.55f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 23.0f, 9.0f, 22.55f, 9.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 19.45f, 9.45f, 19.0f, 10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 8.9f, 4.89f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 8.0f, 20.0f, 8.9f, 20.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 19.0f, 15.0f, 19.45f, 15.0f, 20.0f)
                horizontalLineTo(22.0f)
                moveTo(18.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _printerPosNetwork!!
    }

private var _printerPosNetwork: ImageVector? = null
