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

public val SolidGroup.LandMineOn: ImageVector
    get() {
        if (_landMineOn != null) {
            return _landMineOn!!
        }
        _landMineOn = Builder(name = "LandMineOn", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(344.0f, 24.0f)
                lineTo(344.0f, 168.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(296.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                close()
                moveTo(192.0f, 320.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(416.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                lineTo(192.0f, 352.0f)
                lineTo(192.0f, 320.0f)
                close()
                moveTo(114.7f, 410.5f)
                curveToRelative(8.1f, -16.3f, 24.8f, -26.5f, 42.9f, -26.5f)
                lineTo(482.3f, 384.0f)
                curveToRelative(18.2f, 0.0f, 34.8f, 10.3f, 42.9f, 26.5f)
                lineToRelative(27.6f, 55.2f)
                curveTo(563.5f, 487.0f, 548.0f, 512.0f, 524.2f, 512.0f)
                lineTo(115.8f, 512.0f)
                curveToRelative(-23.8f, 0.0f, -39.3f, -25.0f, -28.6f, -46.3f)
                lineToRelative(27.6f, -55.2f)
                close()
                moveTo(36.3f, 138.3f)
                curveToRelative(7.5f, -10.9f, 22.5f, -13.6f, 33.4f, -6.1f)
                lineToRelative(104.0f, 72.0f)
                curveToRelative(10.9f, 7.5f, 13.6f, 22.5f, 6.1f, 33.4f)
                reflectiveCurveToRelative(-22.5f, 13.6f, -33.4f, 6.1f)
                lineToRelative(-104.0f, -72.0f)
                curveToRelative(-10.9f, -7.5f, -13.6f, -22.5f, -6.1f, -33.4f)
                close()
                moveTo(570.4f, 132.2f)
                curveToRelative(10.9f, -7.5f, 25.8f, -4.8f, 33.4f, 6.1f)
                reflectiveCurveToRelative(4.8f, 25.8f, -6.1f, 33.4f)
                lineToRelative(-104.0f, 72.0f)
                curveToRelative(-10.9f, 7.5f, -25.8f, 4.8f, -33.4f, -6.1f)
                reflectiveCurveToRelative(-4.8f, -25.8f, 6.1f, -33.4f)
                lineToRelative(104.0f, -72.0f)
                close()
            }
        }
        .build()
        return _landMineOn!!
    }

private var _landMineOn: ImageVector? = null
