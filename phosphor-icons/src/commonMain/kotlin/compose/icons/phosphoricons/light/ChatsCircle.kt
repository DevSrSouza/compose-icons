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

public val LightGroup.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) {
            return _chatsCircle!!
        }
        _chatsCircle = Builder(name = "ChatsCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.4f, 189.5f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 168.2f, 74.4f)
                arcTo(78.0f, 78.0f, 0.0f, true, false, 27.6f, 141.5f)
                lineTo(21.2f, 164.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 178.8f)
                lineToRelative(22.5f, -6.4f)
                arcToRelative(77.3f, 77.3f, 0.0f, false, false, 29.3f, 9.2f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 109.7f, 38.8f)
                lineToRelative(22.5f, 6.4f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 234.8f, 212.0f)
                close()
                moveTo(59.3f, 159.9f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, false, -1.7f, 0.3f)
                lineToRelative(-24.9f, 7.1f)
                lineToRelative(7.1f, -24.9f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -0.6f, -4.7f)
                arcToRelative(65.9f, 65.9f, 0.0f, true, true, 23.1f, 23.1f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 59.3f, 159.9f)
                close()
                moveTo(216.2f, 190.4f)
                lineTo(223.3f, 215.3f)
                lineTo(198.4f, 208.2f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -4.7f, 0.6f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, true, -92.6f, -27.0f)
                arcTo(78.1f, 78.1f, 0.0f, false, false, 174.0f, 104.0f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, -1.9f, -16.9f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, true, 44.7f, 98.6f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 216.2f, 190.4f)
                close()
            }
        }
        .build()
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
