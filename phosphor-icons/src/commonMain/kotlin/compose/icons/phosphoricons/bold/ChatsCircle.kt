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

public val BoldGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 190.2f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 172.3f, 68.9f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 21.2f, 142.2f)
                lineToRelative(-5.8f, 20.1f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 22.3f, 22.3f)
                lineToRelative(20.1f, -5.8f)
                arcToRelative(81.8f, 81.8f, 0.0f, false, false, 25.9f, 8.3f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 114.5f, 39.7f)
                lineToRelative(20.1f, 5.8f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 22.3f, -22.3f)
                close()
                moveTo(59.3f, 153.9f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, -3.3f, 0.5f)
                lineToRelative(-14.5f, 4.1f)
                lineTo(45.6f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.2f, -9.4f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 21.0f, 21.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 59.3f, 153.9f)
                close()
                moveTo(211.6f, 182.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.2f, 9.4f)
                lineToRelative(4.1f, 14.5f)
                lineTo(200.0f, 202.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.4f, 1.2f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -79.6f, -17.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 180.0f, 104.0f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, false, -0.5f, -8.7f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, 32.1f, 87.3f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
