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

public val RegularGroup.Laugh: ImageVector
    get() {
        if (_laugh != null) {
            return _laugh!!
        }
        _laugh = Builder(name = "Laugh", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(328.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
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
        return _laugh!!
    }

private var _laugh: ImageVector? = null
