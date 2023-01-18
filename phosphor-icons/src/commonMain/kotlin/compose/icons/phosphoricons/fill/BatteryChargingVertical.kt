package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.BatteryChargingVertical: ImageVector
    get() {
        if (_batteryChargingVertical != null) {
            return _batteryChargingVertical!!
        }
        _batteryChargingVertical = Builder(name = "BatteryChargingVertical", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 8.0f)
                close()
                moveTo(208.0f, 56.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(72.0f, 232.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(48.0f, 56.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 72.0f, 32.0f)
                lineTo(184.0f, 32.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 208.0f, 56.0f)
                close()
                moveTo(150.6f, 127.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 144.0f, 124.0f)
                lineTo(123.8f, 124.0f)
                lineToRelative(11.6f, -29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.8f, -6.0f)
                lineToRelative(-16.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.8f, 7.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 112.0f, 140.0f)
                horizontalLineToRelative(20.2f)
                lineToRelative(-11.6f, 29.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.4f, 10.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 0.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.4f, -5.0f)
                lineToRelative(16.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 150.6f, 127.5f)
                close()
            }
        }
        .build()
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
