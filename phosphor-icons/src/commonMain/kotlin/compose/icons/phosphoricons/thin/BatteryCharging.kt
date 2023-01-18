package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) {
            return _batteryCharging!!
        }
        _batteryCharging = Builder(name = "BatteryCharging", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(244.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(220.0f, 72.0f)
                lineTo(220.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 52.0f)
                lineTo(200.0f, 52.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 220.0f, 72.0f)
                close()
                moveTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(48.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 72.0f)
                lineTo(36.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
                moveTo(140.0f, 124.0f)
                lineTo(113.9f, 124.0f)
                lineToRelative(13.8f, -34.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.4f, -3.0f)
                lineToRelative(-16.0f, 40.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.4f, 3.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 132.0f)
                horizontalLineToRelative(26.1f)
                lineToRelative(-13.8f, 34.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.4f, 3.0f)
                lineToRelative(16.0f, -40.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.4f, -3.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 140.0f, 124.0f)
                close()
            }
        }
        .build()
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null
