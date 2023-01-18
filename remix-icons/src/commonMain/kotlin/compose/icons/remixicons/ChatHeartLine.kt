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

public val RemixIcons.ChatHeartLine: ImageVector
    get() {
        if (_chatHeartLine != null) {
            return _chatHeartLine!!
        }
        _chatHeartLine = Builder(name = "ChatHeartLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.455f, 19.0f)
                close()
                moveTo(4.0f, 18.385f)
                lineTo(5.763f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(13.385f)
                close()
                moveTo(12.018f, 14.7f)
                lineTo(8.659f, 11.34f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.182f, -3.182f)
                lineToRelative(0.177f, 0.177f)
                lineToRelative(0.177f, -0.177f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.182f, 3.182f)
                lineToRelative(-3.36f, 3.359f)
                close()
            }
        }
        .build()
        return _chatHeartLine!!
    }

private var _chatHeartLine: ImageVector? = null