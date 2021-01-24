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

public val RegularGroup.LaughBeam: ImageVector
    get() {
        if (_laughBeam != null) {
            return _laughBeam!!
        }
        _laughBeam = Builder(name = "LaughBeam", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(389.4f, 397.4f)
                curveToRelative(-37.8f, 37.8f, -88.0f, 58.6f, -141.4f, 58.6f)
                reflectiveCurveToRelative(-103.6f, -20.8f, -141.4f, -58.6f)
                reflectiveCurveTo(48.0f, 309.4f, 48.0f, 256.0f)
                reflectiveCurveToRelative(20.8f, -103.6f, 58.6f, -141.4f)
                reflectiveCurveTo(194.6f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(103.6f, 20.8f, 141.4f, 58.6f)
                reflectiveCurveTo(448.0f, 202.6f, 448.0f, 256.0f)
                reflectiveCurveToRelative(-20.8f, 103.6f, -58.6f, 141.4f)
                close()
                moveTo(328.0f, 152.0f)
                curveToRelative(-23.8f, 0.0f, -52.7f, 29.3f, -56.0f, 71.4f)
                curveToRelative(-0.7f, 8.6f, 10.8f, 11.9f, 14.9f, 4.5f)
                lineToRelative(9.5f, -17.0f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17.0f)
                curveToRelative(4.1f, 7.4f, 15.6f, 4.0f, 14.9f, -4.5f)
                curveToRelative(-3.1f, -42.1f, -32.0f, -71.4f, -55.8f, -71.4f)
                close()
                moveTo(127.0f, 227.9f)
                lineToRelative(9.5f, -17.0f)
                curveToRelative(7.7f, -13.7f, 19.2f, -21.6f, 31.5f, -21.6f)
                reflectiveCurveToRelative(23.8f, 7.9f, 31.5f, 21.6f)
                lineToRelative(9.5f, 17.0f)
                curveToRelative(4.1f, 7.4f, 15.6f, 4.0f, 14.9f, -4.5f)
                curveToRelative(-3.3f, -42.1f, -32.2f, -71.4f, -56.0f, -71.4f)
                reflectiveCurveToRelative(-52.7f, 29.3f, -56.0f, 71.4f)
                curveToRelative(-0.6f, 8.5f, 10.9f, 11.9f, 15.1f, 4.5f)
                close()
                moveTo(362.4f, 288.0f)
                lineTo(133.6f, 288.0f)
                curveToRelative(-8.2f, 0.0f, -14.5f, 7.0f, -13.5f, 15.0f)
                curveToRelative(7.5f, 59.2f, 58.9f, 105.0f, 121.1f, 105.0f)
                horizontalLineToRelative(13.6f)
                curveToRelative(62.2f, 0.0f, 113.6f, -45.8f, 121.1f, -105.0f)
                curveToRelative(1.0f, -8.0f, -5.3f, -15.0f, -13.5f, -15.0f)
                close()
            }
        }
        .build()
        return _laughBeam!!
    }

private var _laughBeam: ImageVector? = null
