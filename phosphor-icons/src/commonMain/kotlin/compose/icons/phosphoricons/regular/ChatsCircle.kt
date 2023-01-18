package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.5f, 189.8f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 169.6f, 72.6f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 25.5f, 141.8f)
                lineToRelative(-6.2f, 21.6f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.3f, 17.3f)
                lineToRelative(21.6f, -6.2f)
                arcToRelative(80.8f, 80.8f, 0.0f, false, false, 28.2f, 8.9f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 111.4f, 39.1f)
                lineToRelative(21.6f, 6.2f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.3f, -17.3f)
                close()
                moveTo(59.3f, 157.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.2f, 0.3f)
                lineToRelative(-21.5f, 6.2f)
                lineToRelative(6.2f, -21.5f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, -0.9f, -6.2f)
                arcTo(64.8f, 64.8f, 0.0f, false, true, 32.0f, 104.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                arcToRelative(64.8f, 64.8f, 0.0f, false, true, -32.7f, -8.9f)
                arcTo(7.2f, 7.2f, 0.0f, false, false, 59.3f, 157.9f)
                close()
                moveTo(215.1f, 184.7f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, -0.9f, 6.2f)
                lineToRelative(6.2f, 21.5f)
                lineToRelative(-21.5f, -6.2f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, -6.2f, 0.9f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, -88.4f, -23.5f)
                arcTo(80.2f, 80.2f, 0.0f, false, false, 176.0f, 104.0f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, false, -1.3f, -14.3f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 224.0f, 152.0f)
                arcTo(64.8f, 64.8f, 0.0f, false, true, 215.1f, 184.7f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
