package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.BatteryChargingVertical: ImageVector
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
                moveTo(88.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 0.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(100.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 12.0f)
                close()
                moveTo(212.0f, 64.0f)
                lineTo(212.0f, 212.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(72.0f, 240.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(44.0f, 64.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 72.0f, 36.0f)
                lineTo(184.0f, 36.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 212.0f, 64.0f)
                close()
                moveTo(188.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(72.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(68.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(184.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(144.0f, 126.0f)
                lineTo(129.7f, 126.0f)
                lineToRelative(9.4f, -23.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -22.2f, -9.0f)
                lineToRelative(-16.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 112.0f, 150.0f)
                horizontalLineToRelative(14.3f)
                lineToRelative(-9.4f, 23.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 22.2f, 9.0f)
                lineToRelative(16.0f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 126.0f)
                close()
            }
        }
        .build()
        return _batteryChargingVertical!!
    }

private var _batteryChargingVertical: ImageVector? = null
