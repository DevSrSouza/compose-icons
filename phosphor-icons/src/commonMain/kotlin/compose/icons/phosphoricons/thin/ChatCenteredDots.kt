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

public val ThinGroup.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) {
            return _chatCenteredDots!!
        }
        _chatCenteredDots = Builder(name = "ChatCenteredDots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(99.5f, 196.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.4f, 1.9f)
                lineToRelative(14.8f, 24.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 20.6f, 0.0f)
                lineToRelative(14.8f, -24.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.4f, -1.9f)
                lineTo(216.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(156.5f, 188.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.3f, 5.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-14.8f, 24.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -6.8f, 0.0f)
                lineToRelative(-14.8f, -24.7f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 99.5f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(88.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 120.0f)
                close()
                moveTo(136.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 120.0f)
                close()
                moveTo(184.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 120.0f)
                close()
            }
        }
        .build()
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
