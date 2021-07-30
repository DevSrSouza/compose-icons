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

public val SolidGroup.BatteryEmpty: ImageVector
    get() {
        if (_batteryEmpty != null) {
            return _batteryEmpty!!
        }
        _batteryEmpty = Builder(name = "BatteryEmpty", defaultWidth = 640.0.dp, defaultHeight =
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
                horizontalLineTo(64.0f)
                verticalLineTo(160.0f)
                horizontalLineToRelative(480.0f)
                moveToRelative(16.0f, -64.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(512.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                verticalLineTo(184.0f)
                curveToRelative(0.0f, -13.255f, -10.745f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _batteryEmpty!!
    }

private var _batteryEmpty: ImageVector? = null
