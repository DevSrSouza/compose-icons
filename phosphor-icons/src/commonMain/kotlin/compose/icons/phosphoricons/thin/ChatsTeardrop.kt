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

public val ThinGroup.ChatsTeardrop: ImageVector
    get() {
        if (_chatsTeardrop != null) {
            return _chatsTeardrop!!
        }
        _chatsTeardrop = Builder(name = "ChatsTeardrop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.8f, 76.3f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 20.0f, 104.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                lineTo(89.3f, 180.0f)
                arcTo(76.3f, 76.3f, 0.0f, false, false, 160.0f, 228.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                lineTo(236.0f, 152.0f)
                arcTo(75.9f, 75.9f, 0.0f, false, false, 166.8f, 76.3f)
                close()
                moveTo(28.0f, 170.0f)
                lineTo(28.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, 68.0f, 68.0f)
                lineTo(30.0f, 172.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 170.0f)
                close()
                moveTo(228.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(160.0f, 220.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -62.0f, -40.1f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, 71.5f, -95.2f)
                arcTo(67.9f, 67.9f, 0.0f, false, true, 228.0f, 152.0f)
                close()
            }
        }
        .build()
        return _chatsTeardrop!!
    }

private var _chatsTeardrop: ImageVector? = null
