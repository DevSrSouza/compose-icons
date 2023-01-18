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

public val BoldGroup.ChatCircleDots: ImageVector
    get() {
        if (_chatCircleDots != null) {
            return _chatCircleDots!!
        }
        _chatCircleDots = Builder(name = "ChatCircleDots", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 32.5f, 178.5f)
                lineToRelative(-8.1f, 28.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.7f, 24.7f)
                lineToRelative(28.4f, -8.1f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(85.1f, 85.1f, 0.0f, false, true, -42.9f, -11.7f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -6.1f, -1.7f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -3.3f, 0.4f)
                lineToRelative(-26.2f, 7.5f)
                lineTo(57.0f, 180.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.3f, -9.4f)
                arcTo(84.1f, 84.1f, 0.0f, true, true, 128.0f, 212.0f)
                close()
                moveTo(116.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 116.0f, 128.0f)
                close()
                moveTo(172.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatCircleDots!!
    }

private var _chatCircleDots: ImageVector? = null
