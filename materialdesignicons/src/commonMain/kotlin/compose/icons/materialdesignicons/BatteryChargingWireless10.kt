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

public val MaterialDesignIcons.BatteryChargingWireless10: ImageVector
    get() {
        if (_batteryChargingWireless10 != null) {
            return _batteryChargingWireless10!!
        }
        _batteryChargingWireless10 = Builder(name = "BatteryChargingWireless10", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.07f, 4.93f)
                lineTo(18.66f, 6.34f)
                curveTo(21.79f, 9.46f, 21.79f, 14.53f, 18.66f, 17.66f)
                lineTo(20.07f, 19.07f)
                curveTo(23.97f, 15.17f, 23.97f, 8.84f, 20.07f, 4.93f)
                moveTo(17.24f, 7.76f)
                lineTo(15.83f, 9.17f)
                curveTo(17.39f, 10.73f, 17.39f, 13.26f, 15.83f, 14.83f)
                lineTo(17.24f, 16.24f)
                curveTo(19.58f, 13.9f, 19.58f, 10.1f, 17.24f, 7.76f)
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 5.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 22.0f)
                horizontalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 21.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 4.0f)
                moveTo(12.0f, 18.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _batteryChargingWireless10!!
    }

private var _batteryChargingWireless10: ImageVector? = null
