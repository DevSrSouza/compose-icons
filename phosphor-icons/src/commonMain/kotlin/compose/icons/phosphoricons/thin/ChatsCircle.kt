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

public val ThinGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.2f, 189.3f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -59.4f, -113.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -137.0f, 65.0f)
                lineToRelative(-6.7f, 23.2f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, 12.4f, 12.4f)
                lineToRelative(23.2f, -6.7f)
                arcToRelative(76.6f, 76.6f, 0.0f, false, false, 30.5f, 9.5f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 108.1f, 38.5f)
                lineToRelative(23.2f, 6.7f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, 12.4f, -12.4f)
                close()
                moveTo(59.3f, 161.9f)
                lineToRelative(-1.1f, 0.2f)
                lineToRelative(-24.9f, 7.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, -2.5f)
                lineToRelative(7.1f, -24.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.4f, -3.2f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 23.8f, 23.8f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 59.3f, 161.9f)
                close()
                moveTo(224.7f, 216.7f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -2.0f, 0.5f)
                lineToRelative(-24.9f, -7.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -3.1f, 0.4f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 98.0f, 180.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 71.5f, -95.3f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 49.0f, 102.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.4f, 3.1f)
                lineToRelative(7.1f, 24.9f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 224.7f, 216.7f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
