package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.WirelessChargingFill: ImageVector
    get() {
        if (_wirelessChargingFill != null) {
            return _wirelessChargingFill!!
        }
        _wirelessChargingFill = Builder(name = "WirelessChargingFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.929f, 4.929f)
                lineToRelative(1.414f, 1.414f)
                curveTo(3.895f, 7.791f, 3.0f, 9.791f, 3.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 0.895f, 4.21f, 2.343f, 5.657f)
                lineTo(3.93f, 19.07f)
                curveTo(2.119f, 17.261f, 1.0f, 14.761f, 1.0f, 12.0f)
                reflectiveCurveToRelative(1.12f, -5.261f, 2.929f, -7.071f)
                close()
                moveTo(20.071f, 4.929f)
                curveTo(21.881f, 6.739f, 23.0f, 9.239f, 23.0f, 12.0f)
                reflectiveCurveToRelative(-1.12f, 5.262f, -2.929f, 7.071f)
                lineToRelative(-1.414f, -1.414f)
                curveTo(20.105f, 16.209f, 21.0f, 14.209f, 21.0f, 12.0f)
                reflectiveCurveToRelative(-0.895f, -4.208f, -2.342f, -5.656f)
                lineTo(20.07f, 4.93f)
                close()
                moveTo(13.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-5.0f, 8.0f)
                verticalLineToRelative(-6.0f)
                lineTo(8.0f, 13.0f)
                lineToRelative(5.0f, -8.0f)
                close()
                moveTo(6.757f, 7.757f)
                lineToRelative(1.415f, 1.415f)
                curveTo(7.448f, 9.895f, 7.0f, 10.895f, 7.0f, 12.0f)
                curveToRelative(0.0f, 1.105f, 0.448f, 2.105f, 1.172f, 2.828f)
                lineToRelative(-1.415f, 1.415f)
                curveTo(5.672f, 15.157f, 5.0f, 13.657f, 5.0f, 12.0f)
                curveToRelative(0.0f, -1.657f, 0.672f, -3.157f, 1.757f, -4.243f)
                close()
                moveTo(17.244f, 7.758f)
                curveTo(18.329f, 8.844f, 19.0f, 10.344f, 19.0f, 12.0f)
                curveToRelative(0.0f, 1.657f, -0.672f, 3.157f, -1.757f, 4.243f)
                lineToRelative(-1.415f, -1.415f)
                curveTo(16.552f, 14.105f, 17.0f, 13.105f, 17.0f, 12.0f)
                curveToRelative(0.0f, -1.104f, -0.447f, -2.104f, -1.17f, -2.827f)
                lineToRelative(1.414f, -1.415f)
                close()
            }
        }
        .build()
        return _wirelessChargingFill!!
    }

private var _wirelessChargingFill: ImageVector? = null
