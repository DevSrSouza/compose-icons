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

public val BoldGroup.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) {
            return _batteryCharging!!
        }
        _batteryCharging = Builder(name = "BatteryCharging", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 44.0f)
                lineTo(44.0f, 44.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 16.0f, 72.0f)
                lineTo(16.0f, 184.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(192.0f, 212.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(220.0f, 72.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 192.0f, 44.0f)
                close()
                moveTo(196.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(44.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(40.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(256.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(232.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(143.9f, 121.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 1.2f, 11.2f)
                lineToRelative(-16.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.2f, -9.0f)
                lineToRelative(9.4f, -23.5f)
                lineTo(102.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.1f, -16.5f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.2f, 9.0f)
                lineTo(119.7f, 116.0f)
                lineTo(134.0f, 116.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 143.9f, 121.3f)
                close()
            }
        }
        .build()
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
