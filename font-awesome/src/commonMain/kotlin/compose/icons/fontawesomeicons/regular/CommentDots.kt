package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(168.2f, 384.9f)
                curveToRelative(-15.0f, -5.4f, -31.7f, -3.1f, -44.6f, 6.4f)
                curveToRelative(-8.2f, 6.0f, -22.3f, 14.8f, -39.4f, 22.7f)
                curveToRelative(5.6f, -14.7f, 9.9f, -31.3f, 11.3f, -49.4f)
                curveToRelative(1.0f, -12.9f, -3.3f, -25.7f, -11.8f, -35.5f)
                curveTo(60.4f, 302.8f, 48.0f, 272.0f, 48.0f, 240.0f)
                curveToRelative(0.0f, -79.5f, 83.3f, -160.0f, 208.0f, -160.0f)
                reflectiveCurveToRelative(208.0f, 80.5f, 208.0f, 160.0f)
                reflectiveCurveToRelative(-83.3f, 160.0f, -208.0f, 160.0f)
                curveToRelative(-31.6f, 0.0f, -61.3f, -5.5f, -87.8f, -15.1f)
                close()
                moveTo(26.3f, 423.8f)
                curveToRelative(-1.6f, 2.7f, -3.3f, 5.4f, -5.1f, 8.1f)
                lineToRelative(-0.3f, 0.5f)
                curveToRelative(-1.6f, 2.3f, -3.2f, 4.6f, -4.8f, 6.9f)
                curveToRelative(-3.5f, 4.7f, -7.3f, 9.3f, -11.3f, 13.5f)
                curveToRelative(-4.6f, 4.6f, -5.9f, 11.4f, -3.4f, 17.4f)
                curveToRelative(2.5f, 6.0f, 8.3f, 9.9f, 14.8f, 9.9f)
                curveToRelative(5.1f, 0.0f, 10.2f, -0.3f, 15.3f, -0.8f)
                lineToRelative(0.7f, -0.1f)
                curveToRelative(4.4f, -0.5f, 8.8f, -1.1f, 13.2f, -1.9f)
                curveToRelative(0.8f, -0.1f, 1.6f, -0.3f, 2.4f, -0.5f)
                curveToRelative(17.8f, -3.5f, 34.9f, -9.5f, 50.1f, -16.1f)
                curveToRelative(22.9f, -10.0f, 42.4f, -21.9f, 54.3f, -30.6f)
                curveToRelative(31.8f, 11.5f, 67.0f, 17.9f, 104.1f, 17.9f)
                curveToRelative(141.4f, 0.0f, 256.0f, -93.1f, 256.0f, -208.0f)
                reflectiveCurveTo(397.4f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveTo(0.0f, 125.1f, 0.0f, 240.0f)
                curveToRelative(0.0f, 45.1f, 17.7f, 86.8f, 47.7f, 120.9f)
                curveToRelative(-1.9f, 24.5f, -11.4f, 46.3f, -21.4f, 62.9f)
                close()
                moveTo(144.0f, 272.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(288.0f, 240.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(368.0f, 272.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _commentDots!!
    }

private var _commentDots: ImageVector? = null
