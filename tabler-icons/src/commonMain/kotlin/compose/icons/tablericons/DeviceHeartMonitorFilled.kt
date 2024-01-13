package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DeviceHeartMonitorFilled: ImageVector
    get() {
        if (_deviceHeartMonitorFilled != null) {
            return _deviceHeartMonitorFilled!!
        }
        _deviceHeartMonitorFilled = Builder(name = "DeviceHeartMonitorFilled", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(14.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
                moveTo(17.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.986f, 0.0f)
                lineToRelative(0.007f, -0.117f)
                lineToRelative(-0.007f, -0.127f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
                moveTo(11.0f, 9.236f)
                lineToRelative(-0.106f, 0.211f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.77f, 0.545f)
                lineToRelative(-0.124f, 0.008f)
                lineToRelative(-5.0f, -0.001f)
                verticalLineToRelative(3.001f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.001f)
                lineToRelative(-4.382f, 0.001f)
                lineToRelative(-0.724f, 1.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.725f, 0.11f)
                lineToRelative(-0.063f, -0.11f)
                lineToRelative(-1.106f, -2.211f)
                close()
                moveTo(18.0f, 5.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(1.999f)
                lineToRelative(4.381f, 0.001f)
                lineToRelative(0.725f, -1.447f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.725f, -0.11f)
                lineToRelative(0.063f, 0.11f)
                lineToRelative(1.106f, 2.21f)
                lineToRelative(0.106f, -0.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.77f, -0.545f)
                lineToRelative(0.124f, -0.008f)
                lineToRelative(5.0f, -0.001f)
                verticalLineToRelative(-1.999f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, -0.993f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }
        .build()
        return _deviceHeartMonitorFilled!!
    }

private var _deviceHeartMonitorFilled: ImageVector? = null
