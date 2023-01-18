package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.BatteryChargingVertical: ImageVector
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
                moveTo(90.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 8.0f)
                close()
                moveTo(206.0f, 56.0f)
                lineTo(206.0f, 208.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, 22.0f)
                lineTo(72.0f, 230.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, -22.0f)
                lineTo(50.0f, 56.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 72.0f, 34.0f)
                lineTo(184.0f, 34.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 206.0f, 56.0f)
                close()
                moveTo(194.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(72.0f, 46.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 62.0f, 56.0f)
                lineTo(62.0f, 208.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                lineTo(184.0f, 218.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
                moveTo(144.0f, 126.0f)
                lineTo(120.9f, 126.0f)
                lineToRelative(12.7f, -31.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.2f, -4.4f)
                lineToRelative(-16.0f, 40.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 0.6f, 5.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.0f, 2.6f)
                horizontalLineToRelative(23.1f)
                lineToRelative(-12.7f, 31.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 3.4f, 7.8f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 2.2f, 0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.6f, -3.8f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -0.6f, -5.6f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 144.0f, 126.0f)
                close()
            }
        }
        .build()
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
