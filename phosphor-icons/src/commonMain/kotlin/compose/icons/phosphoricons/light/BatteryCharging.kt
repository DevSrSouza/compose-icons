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

public val LightGroup.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) {
            return _batteryCharging!!
        }
        _batteryCharging = Builder(name = "BatteryCharging", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(242.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(222.0f, 72.0f)
                lineTo(222.0f, 184.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, 22.0f)
                lineTo(48.0f, 206.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, -22.0f)
                lineTo(26.0f, 72.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 48.0f, 50.0f)
                lineTo(200.0f, 50.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 222.0f, 72.0f)
                close()
                moveTo(210.0f, 72.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(48.0f, 62.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 38.0f, 72.0f)
                lineTo(38.0f, 184.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                lineTo(200.0f, 194.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
                moveTo(140.0f, 122.0f)
                lineTo(116.9f, 122.0f)
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
                arcTo(6.1f, 6.1f, 0.0f, false, false, 140.0f, 122.0f)
                close()
            }
        }
        .build()
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
