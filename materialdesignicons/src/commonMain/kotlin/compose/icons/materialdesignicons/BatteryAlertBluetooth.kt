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

public val MaterialDesignIcons.BatteryAlertBluetooth: ImageVector
    get() {
        if (_batteryAlertBluetooth != null) {
            return _batteryAlertBluetooth!!
        }
        _batteryAlertBluetooth = Builder(name = "BatteryAlertBluetooth", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.3f)
                curveTo(2.6f, 4.0f, 2.0f, 4.6f, 2.0f, 5.3f)
                verticalLineTo(20.6f)
                curveTo(2.0f, 21.4f, 2.6f, 22.0f, 3.3f, 22.0f)
                horizontalLineTo(12.6f)
                curveTo(13.3f, 22.0f, 13.9f, 21.4f, 13.9f, 20.7f)
                verticalLineTo(5.3f)
                curveTo(14.0f, 4.6f, 13.4f, 4.0f, 12.7f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 8.0f)
                verticalLineTo(11.8f)
                lineTo(16.7f, 9.5f)
                lineTo(16.0f, 10.2f)
                lineTo(18.8f, 13.0f)
                lineTo(16.0f, 15.8f)
                lineTo(16.7f, 16.5f)
                lineTo(19.0f, 14.2f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.5f)
                lineTo(22.4f, 15.1f)
                lineTo(20.2f, 13.0f)
                lineTo(22.3f, 10.9f)
                lineTo(19.5f, 8.0f)
                horizontalLineTo(19.0f)
                moveTo(7.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                moveTo(20.0f, 9.9f)
                lineTo(20.9f, 10.8f)
                lineTo(20.0f, 11.8f)
                verticalLineTo(9.9f)
                moveTo(20.0f, 14.2f)
                lineTo(20.9f, 15.1f)
                lineTo(20.0f, 16.1f)
                verticalLineTo(14.2f)
                moveTo(7.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _batteryAlertBluetooth!!
    }

private var _batteryAlertBluetooth: ImageVector? = null
