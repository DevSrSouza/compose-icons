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

public val SolidGroup.MaskVentilator: ImageVector
    get() {
        if (_maskVentilator != null) {
            return _maskVentilator!!
        }
        _maskVentilator = Builder(name = "MaskVentilator", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.1f, 176.0f)
                curveTo(139.4f, 219.2f, 128.0f, 264.7f, 128.0f, 300.8f)
                curveToRelative(0.0f, 15.9f, 2.2f, 31.4f, 6.3f, 46.0f)
                lineToRelative(-31.8f, -7.9f)
                curveTo(70.5f, 330.9f, 48.0f, 302.1f, 48.0f, 269.0f)
                lineTo(48.0f, 184.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                lineTo(159.1f, 176.0f)
                close()
                moveTo(185.1f, 128.0f)
                lineTo(56.0f, 128.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, 25.1f, -56.0f, 56.0f)
                verticalLineToRelative(85.0f)
                curveToRelative(0.0f, 55.1f, 37.5f, 103.1f, 90.9f, 116.4f)
                lineToRelative(71.3f, 17.8f)
                curveToRelative(22.7f, 30.5f, 55.4f, 54.1f, 93.8f, 66.6f)
                lineTo(256.0f, 393.3f)
                curveToRelative(-19.7f, -16.4f, -32.0f, -40.3f, -32.0f, -66.9f)
                curveToRelative(0.0f, -49.5f, 43.0f, -134.4f, 96.0f, -134.4f)
                curveToRelative(52.5f, 0.0f, 96.0f, 84.9f, 96.0f, 134.4f)
                curveToRelative(0.0f, 26.7f, -12.4f, 50.4f, -32.0f, 66.8f)
                verticalLineToRelative(76.6f)
                curveToRelative(38.0f, -12.6f, 70.6f, -36.0f, 93.5f, -66.4f)
                lineToRelative(71.6f, -17.9f)
                curveTo(602.5f, 372.1f, 640.0f, 324.1f, 640.0f, 269.0f)
                lineTo(640.0f, 184.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                lineTo(454.5f, 128.0f)
                curveTo(419.7f, 73.8f, 372.1f, 32.0f, 320.0f, 32.0f)
                curveToRelative(-52.6f, 0.0f, -100.2f, 41.8f, -134.9f, 96.0f)
                close()
                moveTo(480.7f, 176.0f)
                lineTo(584.0f, 176.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(85.0f)
                curveToRelative(0.0f, 33.0f, -22.5f, 61.8f, -54.5f, 69.9f)
                lineToRelative(-31.8f, 8.0f)
                curveToRelative(4.2f, -14.7f, 6.4f, -30.1f, 6.4f, -46.1f)
                curveToRelative(0.0f, -36.1f, -11.6f, -81.6f, -31.3f, -124.8f)
                close()
                moveTo(288.0f, 320.0f)
                lineTo(288.0f, 512.0f)
                horizontalLineToRelative(64.0f)
                lineTo(352.0f, 320.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _maskVentilator!!
    }

private var _maskVentilator: ImageVector? = null
