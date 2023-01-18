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

public val BoldGroup.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) {
            return _chatsTeardrop!!
        }
        _chatsTeardrop = Builder(name = "ChatsTeardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.3f, 68.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 12.0f, 104.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, 18.0f)
                horizontalLineTo(84.1f)
                arcTo(84.3f, 84.3f, 0.0f, false, false, 160.0f, 236.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, -18.0f)
                verticalLineTo(152.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 172.3f, 68.9f)
                close()
                moveTo(36.0f, 104.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(220.0f, 212.0f)
                horizontalLineTo(160.0f)
                arcToRelative(60.2f, 60.2f, 0.0f, false, true, -49.0f, -25.4f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 180.0f, 104.0f)
                arcToRelative(81.4f, 81.4f, 0.0f, false, false, -0.5f, -8.7f)
                arcTo(59.9f, 59.9f, 0.0f, false, true, 220.0f, 152.0f)
                close()
            }
        }
        .build()
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
