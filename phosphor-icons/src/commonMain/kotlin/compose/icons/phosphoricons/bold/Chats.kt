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

public val BoldGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 96.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(188.0f, 76.0f)
                lineTo(188.0f, 48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(40.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 48.0f)
                lineTo(20.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 7.5f, -2.7f)
                lineToRelative(28.5f, -23.0f)
                lineTo(68.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(92.2f)
                lineToRelative(36.3f, 29.3f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 224.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
                moveTo(44.0f, 150.9f)
                lineTo(44.0f, 52.0f)
                lineTo(164.0f, 52.0f)
                lineTo(164.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(44.0f)
                lineTo(71.6f, 132.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -7.6f, 2.7f)
                close()
                moveTo(192.0f, 182.7f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -7.6f, -2.7f)
                lineTo(92.0f, 180.0f)
                lineTo(92.0f, 156.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(188.0f, 100.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(98.9f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
