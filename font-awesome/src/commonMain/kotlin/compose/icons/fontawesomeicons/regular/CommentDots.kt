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

public val RegularGroup.CommentDots: ImageVector
    get() {
        if (_commentDots != null) {
            return _commentDots!!
        }
        _commentDots = Builder(name = "CommentDots", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 208.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(256.0f, 208.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(368.0f, 208.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(256.0f, 32.0f)
                curveTo(114.6f, 32.0f, 0.0f, 125.1f, 0.0f, 240.0f)
                curveToRelative(0.0f, 47.6f, 19.9f, 91.2f, 52.9f, 126.3f)
                curveTo(38.0f, 405.7f, 7.0f, 439.1f, 6.5f, 439.5f)
                curveToRelative(-6.6f, 7.0f, -8.4f, 17.2f, -4.6f, 26.0f)
                reflectiveCurveTo(14.4f, 480.0f, 24.0f, 480.0f)
                curveToRelative(61.5f, 0.0f, 110.0f, -25.7f, 139.1f, -46.3f)
                curveTo(192.0f, 442.8f, 223.2f, 448.0f, 256.0f, 448.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -93.1f, 256.0f, -208.0f)
                reflectiveCurveTo(397.4f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(256.0f, 400.0f)
                curveToRelative(-26.7f, 0.0f, -53.1f, -4.1f, -78.4f, -12.1f)
                lineToRelative(-22.7f, -7.2f)
                lineToRelative(-19.5f, 13.8f)
                curveToRelative(-14.3f, 10.1f, -33.9f, 21.4f, -57.5f, 29.0f)
                curveToRelative(7.3f, -12.1f, 14.4f, -25.7f, 19.9f, -40.2f)
                lineToRelative(10.6f, -28.1f)
                lineToRelative(-20.6f, -21.8f)
                curveTo(69.7f, 314.1f, 48.0f, 282.2f, 48.0f, 240.0f)
                curveToRelative(0.0f, -88.2f, 93.3f, -160.0f, 208.0f, -160.0f)
                reflectiveCurveToRelative(208.0f, 71.8f, 208.0f, 160.0f)
                reflectiveCurveToRelative(-93.3f, 160.0f, -208.0f, 160.0f)
                close()
            }
        }
        .build()
        return _commentDots!!
    }

private var _commentDots: ImageVector? = null
