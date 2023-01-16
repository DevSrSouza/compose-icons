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

public val MaterialDesignIcons.BatteryChargingWirelessAlert: ImageVector
    get() {
        if (_batteryChargingWirelessAlert != null) {
            return _batteryChargingWirelessAlert!!
        }
        _batteryChargingWirelessAlert = Builder(name = "BatteryChargingWirelessAlert", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4f, 4.0f, 2.0f, 4.4f, 2.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.6f, 2.4f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(13.6f, 22.0f, 14.0f, 21.6f, 14.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(14.0f, 4.4f, 13.6f, 4.0f, 13.0f, 4.0f)
                moveTo(9.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                moveTo(9.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                moveTo(20.1f, 4.9f)
                lineTo(18.7f, 6.3f)
                curveTo(21.8f, 9.4f, 21.8f, 14.5f, 18.7f, 17.6f)
                lineTo(20.1f, 19.0f)
                curveTo(24.0f, 15.2f, 24.0f, 8.8f, 20.1f, 4.9f)
                moveTo(17.2f, 7.8f)
                lineTo(15.8f, 9.2f)
                curveTo(17.4f, 10.8f, 17.4f, 13.3f, 15.8f, 14.9f)
                lineTo(17.2f, 16.3f)
                curveTo(19.6f, 13.9f, 19.6f, 10.1f, 17.2f, 7.8f)
                close()
            }
        }
        .build()
        return _batteryChargingWirelessAlert!!
    }

private var _batteryChargingWirelessAlert: ImageVector? = null
