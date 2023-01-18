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

public val LightGroup.BatteryMedium: ImageVector
    get() {
        if (_batteryMedium != null) {
            return _batteryMedium!!
        }
        _batteryMedium = Builder(name = "BatteryMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(105.6f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(111.6f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 105.6f, 82.0f)
                close()
                moveTo(68.8f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(74.8f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 68.8f, 82.0f)
                close()
            }
        }
        .build()
        return _batteryMedium!!
    }

private var _batteryMedium: ImageVector? = null
