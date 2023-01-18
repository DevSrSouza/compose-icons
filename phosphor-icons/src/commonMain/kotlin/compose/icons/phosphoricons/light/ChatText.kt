package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ChatText: ImageVector
    get() {
        if (_chatText != null) {
            return _chatText!!
        }
        _chatText = Builder(name = "ChatText", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 222.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 8.1f, 12.7f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 5.9f, 1.3f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.0f, -3.3f)
                lineToRelative(32.0f, -26.9f)
                lineToRelative(1.7f, -0.6f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 50.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(81.7f, 194.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -2.1f, 0.4f)
                lineToRelative(-3.7f, 1.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -1.8f, 1.1f)
                lineTo(41.3f, 224.4f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -3.3f, -1.6f)
                lineTo(38.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(166.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 112.0f)
                close()
                moveTo(166.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 144.0f)
                close()
            }
        }
        .build()
        return _chatText!!
    }

private var _chatText: ImageVector? = null
