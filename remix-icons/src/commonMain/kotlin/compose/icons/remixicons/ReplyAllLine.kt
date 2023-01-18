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

public val RemixIcons.ReplyAllLine: ImageVector
    get() {
        if (_replyAllLine != null) {
            return _replyAllLine!!
        }
        _replyAllLine = Builder(name = "ReplyAllLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.5f)
                lineTo(14.0f, 9.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.273f, -0.01f, 0.543f, -0.032f, 0.81f)
                curveToRelative(-1.463f, -2.774f, -4.33f, -4.691f, -7.655f, -4.805f)
                lineTo(16.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.5f)
                lineTo(6.0f, 12.0f)
                lineToRelative(8.0f, -7.5f)
                close()
                moveTo(8.0f, 4.5f)
                verticalLineToRelative(2.737f)
                lineTo(2.92f, 12.0f)
                lineToRelative(5.079f, 4.761f)
                lineTo(8.0f, 19.5f)
                lineTo(0.0f, 12.0f)
                lineToRelative(8.0f, -7.5f)
                close()
                moveTo(12.0f, 9.116f)
                lineTo(8.924f, 12.0f)
                lineTo(12.0f, 14.883f)
                lineTo(12.0f, 13.0f)
                horizontalLineToRelative(4.034f)
                lineToRelative(0.347f, 0.007f)
                curveToRelative(1.285f, 0.043f, 2.524f, 0.31f, 3.676f, 0.766f)
                curveTo(18.59f, 12.075f, 16.42f, 11.0f, 14.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 9.116f)
                close()
            }
        }
        .build()
        return _replyAllLine!!
    }

private var _replyAllLine: ImageVector? = null
