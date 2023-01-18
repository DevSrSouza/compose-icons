package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ChatText: ImageVector
    get() {
        if (_chatText != null) {
            return _chatText!!
        }
        _chatText = Builder(name = "ChatText", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 222.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.9f, 10.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 5.1f, 1.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 7.7f, -2.8f)
                lineTo(80.0f, 204.9f)
                lineToRelative(2.4f, -0.9f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 52.0f)
                close()
                moveTo(220.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(81.7f, 196.0f)
                lineToRelative(-1.4f, 0.2f)
                lineToRelative(-3.7f, 1.4f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -1.2f, 0.7f)
                lineTo(42.6f, 225.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.6f, -3.1f)
                lineTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 112.0f)
                close()
                moveTo(164.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 144.0f)
                close()
            }
        }
        .build()
        return _chatText!!
    }

private var _chatText: ImageVector? = null
