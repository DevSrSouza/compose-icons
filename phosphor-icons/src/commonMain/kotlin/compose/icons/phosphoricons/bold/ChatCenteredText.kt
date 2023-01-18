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

public val BoldGroup.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) {
            return _chatCenteredText!!
        }
        _chatCenteredText = Builder(name = "ChatCenteredText", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 100.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 88.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 100.0f)
                close()
                moveTo(96.0f, 152.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(96.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 56.0f)
                lineTo(236.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(158.8f, 204.0f)
                lineToRelative(-13.6f, 22.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -17.2f, 9.8f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -17.1f, -9.8f)
                lineTo(97.2f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(216.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(212.0f, 60.0f)
                lineTo(44.0f, 60.0f)
                lineTo(44.0f, 180.0f)
                lineTo(99.5f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 17.1f, 9.7f)
                lineToRelative(11.4f, 19.0f)
                lineToRelative(11.4f, -19.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 17.1f, -9.7f)
                lineTo(212.0f, 180.0f)
                close()
            }
        }
        .build()
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
