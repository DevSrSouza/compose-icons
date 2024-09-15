package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BatteryQuarter: ImageVector
    get() {
        if (_batteryQuarter != null) {
            return _batteryQuarter!!
        }
        _batteryQuarter = Builder(name = "BatteryQuarter", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.0f, 160.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 352.0f)
                lineTo(64.0f, 160.0f)
                horizontalLineToRelative(480.0f)
                moveToRelative(16.0f, -64.0f)
                lineTo(48.0f, 96.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(512.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                lineTo(640.0f, 184.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(224.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                lineTo(224.0f, 192.0f)
                close()
            }
        }
        .build()
        return _batteryQuarter!!
    }

private var _batteryQuarter: ImageVector? = null
