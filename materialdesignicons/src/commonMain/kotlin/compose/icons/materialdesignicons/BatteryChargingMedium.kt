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

public val MaterialDesignIcons.BatteryChargingMedium: ImageVector
    get() {
        if (_batteryChargingMedium != null) {
            return _batteryChargingMedium!!
        }
        _batteryChargingMedium = Builder(name = "BatteryChargingMedium", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                moveTo(12.67f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.33f)
                curveTo(2.6f, 4.0f, 2.0f, 4.6f, 2.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2.0f, 21.4f, 2.6f, 22.0f, 3.33f, 22.0f)
                horizontalLineTo(12.67f)
                curveTo(13.41f, 22.0f, 14.0f, 21.41f, 14.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(14.0f, 4.6f, 13.4f, 4.0f, 12.67f, 4.0f)
                moveTo(11.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                moveTo(11.0f, 11.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.5f)
                moveTo(23.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.0f)
                lineTo(15.0f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _batteryChargingMedium!!
    }

private var _batteryChargingMedium: ImageVector? = null
