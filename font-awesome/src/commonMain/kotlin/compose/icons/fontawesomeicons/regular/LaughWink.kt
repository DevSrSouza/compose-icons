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

public val RegularGroup.LaughWink: ImageVector
    get() {
        if (_laughWink != null) {
            return _laughWink!!
        }
        _laughWink = Builder(name = "LaughWink", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                curveTo(68.8f, 359.6f, 48.0f, 309.4f, 48.0f, 256.0f)
                reflectiveCurveToRelative(20.8f, -103.6f, 58.6f, -141.4f)
                curveTo(144.4f, 76.8f, 194.6f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(103.6f, 20.8f, 141.4f, 58.6f)
                curveToRelative(37.8f, 37.8f, 58.6f, 88.0f, 58.6f, 141.4f)
                reflectiveCurveToRelative(-20.8f, 103.6f, -58.6f, 141.4f)
                close()
                moveTo(328.0f, 164.0f)
                curveToRelative(-25.7f, 0.0f, -55.9f, 16.9f, -59.9f, 42.1f)
                curveToRelative(-1.7f, 11.2f, 11.5f, 18.2f, 19.8f, 10.8f)
                lineToRelative(9.5f, -8.5f)
                curveToRelative(14.8f, -13.2f, 46.2f, -13.2f, 61.0f, 0.0f)
                lineToRelative(9.5f, 8.5f)
                curveToRelative(8.5f, 7.4f, 21.6f, 0.3f, 19.8f, -10.8f)
                curveToRelative(-3.8f, -25.2f, -34.0f, -42.1f, -59.7f, -42.1f)
                close()
                moveTo(168.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
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
        return _laughWink!!
    }

private var _laughWink: ImageVector? = null
