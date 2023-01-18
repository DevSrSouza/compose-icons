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

public val ThinGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(180.0f, 84.0f)
                lineTo(180.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(40.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 176.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.3f, 3.6f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.7f, 0.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.5f, -0.9f)
                lineTo(73.0f, 148.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(95.0f)
                lineToRelative(38.5f, 31.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.5f, 0.9f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.7f, -0.4f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 228.0f, 224.0f)
                close()
                moveTo(71.6f, 140.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.5f, 0.9f)
                lineTo(36.0f, 167.6f)
                lineTo(36.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(168.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(172.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                close()
                moveTo(186.9f, 188.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.5f, -0.9f)
                lineTo(88.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(84.0f, 148.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(180.0f, 92.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(220.0f, 215.6f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
