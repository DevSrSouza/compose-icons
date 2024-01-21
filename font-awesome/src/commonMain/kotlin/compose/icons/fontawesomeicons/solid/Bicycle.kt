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

public val SolidGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(312.0f, 32.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(25.7f)
                lineToRelative(34.6f, 64.0f)
                lineTo(222.9f, 144.0f)
                lineToRelative(-27.4f, -38.0f)
                curveTo(191.0f, 99.7f, 183.7f, 96.0f, 176.0f, 96.0f)
                lineTo(120.0f, 96.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(43.7f)
                lineToRelative(22.1f, 30.7f)
                lineToRelative(-26.6f, 53.1f)
                curveToRelative(-10.0f, -2.5f, -20.5f, -3.8f, -31.2f, -3.8f)
                curveTo(57.3f, 224.0f, 0.0f, 281.3f, 0.0f, 352.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                curveToRelative(65.3f, 0.0f, 119.1f, -48.9f, 127.0f, -112.0f)
                horizontalLineToRelative(49.0f)
                curveToRelative(8.5f, 0.0f, 16.3f, -4.5f, 20.7f, -11.8f)
                lineToRelative(84.8f, -143.5f)
                lineToRelative(21.7f, 40.1f)
                curveTo(402.4f, 276.3f, 384.0f, 312.0f, 384.0f, 352.0f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                reflectiveCurveToRelative(128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveToRelative(-57.3f, -128.0f, -128.0f, -128.0f)
                curveToRelative(-13.5f, 0.0f, -26.5f, 2.1f, -38.7f, 6.0f)
                lineTo(375.4f, 48.8f)
                curveTo(369.8f, 38.4f, 359.0f, 32.0f, 347.2f, 32.0f)
                lineTo(312.0f, 32.0f)
                close()
                moveTo(458.6f, 303.7f)
                lineToRelative(32.3f, 59.7f)
                curveToRelative(6.3f, 11.7f, 20.9f, 16.0f, 32.5f, 9.7f)
                reflectiveCurveToRelative(16.0f, -20.9f, 9.7f, -32.5f)
                lineToRelative(-32.3f, -59.7f)
                curveToRelative(3.6f, -0.6f, 7.4f, -0.9f, 11.2f, -0.9f)
                curveToRelative(39.8f, 0.0f, 72.0f, 32.2f, 72.0f, 72.0f)
                reflectiveCurveToRelative(-32.2f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.2f, -72.0f, -72.0f)
                curveToRelative(0.0f, -18.6f, 7.0f, -35.5f, 18.6f, -48.3f)
                close()
                moveTo(133.2f, 368.0f)
                horizontalLineToRelative(65.0f)
                curveToRelative(-7.3f, 32.1f, -36.0f, 56.0f, -70.2f, 56.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                reflectiveCurveToRelative(32.2f, -72.0f, 72.0f, -72.0f)
                curveToRelative(1.7f, 0.0f, 3.4f, 0.1f, 5.1f, 0.2f)
                lineToRelative(-24.2f, 48.5f)
                curveToRelative(-9.0f, 18.1f, 4.1f, 39.4f, 24.3f, 39.4f)
                close()
                moveTo(166.9f, 320.0f)
                lineToRelative(50.7f, -101.3f)
                lineToRelative(72.9f, 101.2f)
                lineToRelative(-0.1f, 0.1f)
                lineTo(166.8f, 320.0f)
                close()
                moveTo(257.5f, 192.0f)
                lineTo(365.9f, 192.0f)
                lineTo(317.0f, 274.8f)
                lineTo(257.4f, 192.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
