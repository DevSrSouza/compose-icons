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

public val ThinGroup.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) {
            return _chatTeardropDots!!
        }
        _chatTeardropDots = Builder(name = "ChatTeardropDots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 28.0f)
                arcToRelative(96.2f, 96.2f, 0.0f, false, false, -96.0f, 96.0f)
                verticalLineToRelative(84.3f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 47.7f, 220.0f)
                lineTo(132.0f, 220.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 0.0f, -192.0f)
                close()
                moveTo(132.0f, 212.0f)
                lineTo(47.7f, 212.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -3.7f, -3.7f)
                lineTo(44.0f, 124.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, 88.0f)
                close()
                moveTo(92.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 128.0f)
                close()
                moveTo(140.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 128.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
