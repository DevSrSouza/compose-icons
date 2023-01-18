package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ReplyLine: ImageVector
    get() {
        if (_replyLine != null) {
            return _replyLine!!
        }
        _replyLine = Builder(name = "ReplyLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                lineTo(1.0f, 12.0f)
                lineToRelative(10.0f, -8.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.273f, -0.01f, 0.543f, -0.032f, 0.81f)
                curveToRelative(-1.463f, -2.774f, -4.33f, -4.691f, -7.655f, -4.805f)
                lineTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(4.034f)
                lineToRelative(0.347f, 0.007f)
                curveToRelative(1.285f, 0.043f, 2.524f, 0.31f, 3.676f, 0.766f)
                curveTo(15.59f, 12.075f, 13.42f, 11.0f, 11.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                lineTo(9.0f, 8.161f)
                lineTo(4.202f, 12.0f)
                lineTo(9.0f, 15.839f)
                lineTo(9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _replyLine!!
    }

private var _replyLine: ImageVector? = null
