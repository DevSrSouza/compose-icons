package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) {
            return _chatCenteredDots!!
        }
        _chatCenteredDots = Builder(name = "ChatCenteredDots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(99.5f, 200.0f)
                lineToRelative(14.8f, 24.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 27.4f, 0.0f)
                lineTo(156.5f, 200.0f)
                lineTo(216.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 184.0f)
                lineTo(156.5f, 184.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -13.7f, 7.8f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 216.5f)
                lineToRelative(-14.8f, -24.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 99.5f, 184.0f)
                lineTo(40.0f, 184.0f)
                lineTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                close()
                moveTo(116.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 120.0f)
                close()
                moveTo(68.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 120.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 120.0f)
                close()
            }
        }
        .build()
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
