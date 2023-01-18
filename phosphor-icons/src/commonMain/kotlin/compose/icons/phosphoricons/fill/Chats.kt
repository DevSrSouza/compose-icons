package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(184.0f, 80.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(40.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 48.0f)
                lineTo(24.0f, 176.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.6f, 7.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 3.4f, 0.8f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 5.0f, -1.8f)
                lineTo(72.0f, 154.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(93.6f)
                lineTo(219.0f, 230.2f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 5.0f, 1.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.5f, -0.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 224.0f)
                close()
                moveTo(189.5f, 185.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -5.1f, -1.8f)
                lineTo(88.0f, 184.0f)
                lineTo(88.0f, 152.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(184.0f, 96.0f)
                horizontalLineToRelative(32.0f)
                lineTo(216.0f, 207.2f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
