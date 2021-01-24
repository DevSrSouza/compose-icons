package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.CommentSlash: ImageVector
    get() {
        if (_commentSlash != null) {
            return _commentSlash!!
        }
        _commentSlash = Builder(name = "CommentSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 240.0f)
                curveToRelative(0.0f, 49.6f, 21.4f, 95.0f, 57.0f, 130.7f)
                curveToRelative(-12.6f, 50.3f, -54.3f, 95.2f, -54.8f, 95.8f)
                curveToRelative(-2.2f, 2.3f, -2.8f, 5.7f, -1.5f, 8.7f)
                curveToRelative(1.3f, 2.9f, 4.1f, 4.8f, 7.3f, 4.8f)
                curveToRelative(66.3f, 0.0f, 116.0f, -31.8f, 140.6f, -51.4f)
                curveToRelative(32.7f, 12.3f, 69.0f, 19.4f, 107.4f, 19.4f)
                curveToRelative(27.4f, 0.0f, 53.7f, -3.6f, 78.4f, -10.0f)
                lineTo(72.9f, 186.4f)
                curveToRelative(-5.6f, 17.1f, -8.9f, 35.0f, -8.9f, 53.6f)
                close()
                moveTo(633.8f, 458.1f)
                lineToRelative(-114.4f, -88.4f)
                curveTo(554.6f, 334.1f, 576.0f, 289.2f, 576.0f, 240.0f)
                curveToRelative(0.0f, -114.9f, -114.6f, -208.0f, -256.0f, -208.0f)
                curveToRelative(-65.1f, 0.0f, -124.2f, 20.1f, -169.4f, 52.7f)
                lineTo(45.5f, 3.4f)
                curveTo(38.5f, -2.0f, 28.5f, -0.8f, 23.0f, 6.2f)
                lineTo(3.4f, 31.4f)
                curveToRelative(-5.4f, 7.0f, -4.2f, 17.0f, 2.8f, 22.4f)
                lineToRelative(588.4f, 454.7f)
                curveToRelative(7.0f, 5.4f, 17.0f, 4.2f, 22.5f, -2.8f)
                lineToRelative(19.6f, -25.3f)
                curveToRelative(5.4f, -6.8f, 4.1f, -16.9f, -2.9f, -22.3f)
                close()
            }
        }
        .build()
        return _commentSlash!!
    }

private var _commentSlash: ImageVector? = null
