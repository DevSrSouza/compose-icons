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

public val RegularGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(494.2f, 221.9f)
                lineToRelative(-59.8f, -40.5f)
                lineToRelative(13.7f, -71.0f)
                curveToRelative(2.6f, -13.2f, -1.6f, -26.8f, -11.1f, -36.4f)
                curveToRelative(-9.6f, -9.5f, -23.2f, -13.7f, -36.2f, -11.1f)
                lineToRelative(-70.9f, 13.7f)
                lineToRelative(-40.4f, -59.9f)
                curveToRelative(-15.1f, -22.3f, -51.9f, -22.3f, -67.0f, 0.0f)
                lineToRelative(-40.4f, 59.9f)
                lineToRelative(-70.8f, -13.7f)
                curveTo(98.0f, 60.4f, 84.5f, 64.5f, 75.0f, 74.1f)
                curveToRelative(-9.5f, 9.6f, -13.7f, 23.1f, -11.1f, 36.3f)
                lineToRelative(13.7f, 71.0f)
                lineToRelative(-59.8f, 40.5f)
                curveTo(6.6f, 229.5f, 0.0f, 242.0f, 0.0f, 255.5f)
                reflectiveCurveToRelative(6.7f, 26.0f, 17.8f, 33.5f)
                lineToRelative(59.8f, 40.5f)
                lineToRelative(-13.7f, 71.0f)
                curveToRelative(-2.6f, 13.2f, 1.6f, 26.8f, 11.1f, 36.3f)
                curveToRelative(9.5f, 9.5f, 22.9f, 13.7f, 36.3f, 11.1f)
                lineToRelative(70.8f, -13.7f)
                lineToRelative(40.4f, 59.9f)
                curveTo(230.0f, 505.3f, 242.6f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(26.0f, -6.7f, 33.5f, -17.8f)
                lineToRelative(40.4f, -59.9f)
                lineToRelative(70.9f, 13.7f)
                curveToRelative(13.4f, 2.7f, 26.8f, -1.6f, 36.3f, -11.1f)
                curveToRelative(9.5f, -9.5f, 13.6f, -23.1f, 11.1f, -36.3f)
                lineToRelative(-13.7f, -71.0f)
                lineToRelative(59.8f, -40.5f)
                curveToRelative(11.1f, -7.5f, 17.8f, -20.1f, 17.8f, -33.5f)
                curveToRelative(-0.1f, -13.6f, -6.7f, -26.1f, -17.9f, -33.7f)
                close()
                moveTo(381.3f, 307.5f)
                lineToRelative(17.6f, 91.2f)
                lineToRelative(-91.0f, -17.6f)
                lineTo(256.0f, 458.0f)
                lineToRelative(-51.9f, -77.0f)
                lineToRelative(-90.9f, 17.6f)
                lineToRelative(17.6f, -91.2f)
                lineToRelative(-76.8f, -52.0f)
                lineToRelative(76.8f, -52.0f)
                lineToRelative(-17.6f, -91.2f)
                lineToRelative(91.0f, 17.6f)
                lineTo(256.0f, 53.0f)
                lineToRelative(51.9f, 76.9f)
                lineToRelative(91.0f, -17.6f)
                lineToRelative(-17.6f, 91.1f)
                lineToRelative(76.8f, 52.0f)
                lineToRelative(-76.8f, 52.1f)
                close()
                moveTo(256.0f, 152.0f)
                curveToRelative(-57.3f, 0.0f, -104.0f, 46.7f, -104.0f, 104.0f)
                reflectiveCurveToRelative(46.7f, 104.0f, 104.0f, 104.0f)
                reflectiveCurveToRelative(104.0f, -46.7f, 104.0f, -104.0f)
                reflectiveCurveToRelative(-46.7f, -104.0f, -104.0f, -104.0f)
                close()
                moveTo(256.0f, 312.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                reflectiveCurveToRelative(25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                reflectiveCurveToRelative(-25.1f, 56.0f, -56.0f, 56.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
