package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BatteryChargingFull: ImageVector
    get() {
        if (_batteryChargingFull != null) {
            return _batteryChargingFull!!
        }
        _batteryChargingFull = Builder(name = "BatteryChargingFull", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.67f, 4.0f)
                lineTo(14.0f, 4.0f)
                lineTo(14.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.33f, 4.0f)
                curveTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f)
                verticalLineToRelative(15.33f)
                curveTo(7.0f, 21.4f, 7.6f, 22.0f, 8.34f, 22.0f)
                horizontalLineToRelative(7.32f)
                curveToRelative(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f)
                lineTo(17.0f, 5.33f)
                curveTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f)
                close()
                moveTo(14.61f, 13.24f)
                lineToRelative(-2.67f, 5.0f)
                curveToRelative(-0.24f, 0.45f, -0.94f, 0.28f, -0.94f, -0.24f)
                verticalLineToRelative(-3.5f)
                lineTo(9.83f, 14.5f)
                curveToRelative(-0.38f, 0.0f, -0.62f, -0.4f, -0.44f, -0.74f)
                lineToRelative(2.67f, -5.0f)
                curveToRelative(0.24f, -0.45f, 0.94f, -0.28f, 0.94f, 0.24f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.17f)
                curveToRelative(0.37f, 0.0f, 0.62f, 0.4f, 0.44f, 0.74f)
                close()
            }
        }
        .build()
        return _batteryChargingFull!!
    }

private var _batteryChargingFull: ImageVector? = null
