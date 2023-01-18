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

public val LightGroup.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) {
            return _chatsTeardrop!!
        }
        _chatsTeardrop = Builder(name = "ChatsTeardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.2f, 74.4f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 18.0f, 104.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(88.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 72.0f, 48.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(152.0f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 168.2f, 74.4f)
                close()
                moveTo(30.0f, 104.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, 66.0f)
                horizontalLineTo(30.0f)
                close()
                moveTo(226.0f, 218.0f)
                horizontalLineTo(160.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -58.9f, -36.2f)
                arcTo(78.1f, 78.1f, 0.0f, false, false, 174.0f, 104.0f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, -1.9f, -16.9f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 226.0f, 152.0f)
                close()
            }
        }
        .build()
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
