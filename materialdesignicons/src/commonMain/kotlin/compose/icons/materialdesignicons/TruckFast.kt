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

public val MaterialDesignIcons.TruckFast: ImageVector
    get() {
        if (_truckFast != null) {
            return _truckFast!!
        }
        _truckFast = Builder(name = "TruckFast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                lineTo(2.25f, 12.0f)
                horizontalLineTo(7.5f)
                lineTo(6.9f, 10.5f)
                horizontalLineTo(2.0f)
                lineTo(1.25f, 9.0f)
                horizontalLineTo(9.05f)
                lineTo(8.45f, 7.5f)
                horizontalLineTo(1.11f)
                lineTo(0.25f, 6.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                lineTo(24.0f, 12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 17.0f)
                horizontalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(3.0f)
                moveTo(19.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 18.5f)
                moveTo(20.5f, 9.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.46f)
                lineTo(20.5f, 9.5f)
                moveTo(9.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 18.5f)
                close()
            }
        }
        .build()
        return _truckFast!!
    }

private var _truckFast: ImageVector? = null
