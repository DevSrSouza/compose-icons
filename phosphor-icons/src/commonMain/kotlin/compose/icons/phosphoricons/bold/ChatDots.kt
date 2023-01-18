package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ChatDots: ImageVector
    get() {
        if (_chatDots != null) {
            return _chatDots!!
        }
        _chatDots = Builder(name = "ChatDots", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 222.8f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 31.6f, 241.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 8.5f, 1.9f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, 12.8f, -4.8f)
                lineTo(84.0f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(212.0f, 188.0f)
                lineTo(82.5f, 188.0f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, -12.9f, 4.7f)
                horizontalLineToRelative(0.0f)
                lineTo(44.0f, 214.2f)
                lineTo(44.0f, 68.0f)
                lineTo(212.0f, 68.0f)
                close()
                moveTo(84.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 84.0f, 128.0f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
