package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Futbol: ImageVector
    get() {
        if (_futbol != null) {
            return _futbol!!
        }
        _futbol = Builder(name = "Futbol", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.8f, 179.4f)
                curveTo(449.8f, 74.6f, 352.6f, 8.0f, 248.1f, 8.0f)
                curveToRelative(-25.4f, 0.0f, -51.2f, 3.9f, -76.7f, 12.2f)
                curveTo(41.2f, 62.5f, -30.1f, 202.4f, 12.2f, 332.6f)
                curveTo(46.2f, 437.4f, 143.4f, 504.0f, 247.9f, 504.0f)
                curveToRelative(25.4f, 0.0f, 51.2f, -3.9f, 76.7f, -12.2f)
                curveToRelative(130.2f, -42.3f, 201.5f, -182.2f, 159.2f, -312.4f)
                close()
                moveTo(409.3f, 373.1f)
                lineToRelative(-52.2f, 6.4f)
                lineToRelative(-43.7f, -60.9f)
                lineToRelative(24.4f, -75.2f)
                lineToRelative(71.1f, -22.1f)
                lineToRelative(38.9f, 36.4f)
                curveToRelative(-0.2f, 30.7f, -7.4f, 61.1f, -21.7f, 89.2f)
                curveToRelative(-4.7f, 9.3f, -10.7f, 17.8f, -16.8f, 26.2f)
                close()
                moveTo(409.3f, 137.7f)
                lineToRelative(-10.4f, 53.1f)
                lineToRelative(-70.7f, 22.0f)
                lineToRelative(-64.2f, -46.5f)
                lineTo(264.0f, 92.5f)
                lineToRelative(47.4f, -26.2f)
                curveToRelative(39.2f, 13.0f, 73.4f, 38.0f, 97.9f, 71.4f)
                close()
                moveTo(184.9f, 66.4f)
                lineTo(232.0f, 92.5f)
                verticalLineToRelative(73.8f)
                lineToRelative(-64.2f, 46.5f)
                lineToRelative(-70.6f, -22.0f)
                lineToRelative(-10.1f, -52.5f)
                curveToRelative(24.3f, -33.4f, 57.9f, -58.6f, 97.8f, -71.9f)
                close()
                moveTo(139.0f, 379.5f)
                lineTo(85.9f, 373.0f)
                curveToRelative(-14.4f, -20.1f, -37.3f, -59.6f, -37.8f, -115.3f)
                lineToRelative(39.0f, -36.4f)
                lineToRelative(71.1f, 22.2f)
                lineToRelative(24.3f, 74.3f)
                lineToRelative(-43.5f, 61.7f)
                close()
                moveTo(187.2f, 446.5f)
                lineToRelative(-22.4f, -48.1f)
                lineToRelative(43.6f, -61.7f)
                lineTo(287.0f, 336.7f)
                lineToRelative(44.3f, 61.7f)
                lineToRelative(-22.4f, 48.1f)
                curveToRelative(-6.2f, 1.8f, -57.6f, 20.4f, -121.7f, 0.0f)
                close()
            }
        }
        .build()
        return _futbol!!
    }

private var _futbol: ImageVector? = null
