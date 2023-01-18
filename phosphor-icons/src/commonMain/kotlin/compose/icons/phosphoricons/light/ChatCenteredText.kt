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

public val LightGroup.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) {
            return _chatCenteredText!!
        }
        _chatCenteredText = Builder(name = "ChatCenteredText", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 104.0f)
                close()
                moveTo(160.0f, 130.0f)
                lineTo(96.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(156.5f, 198.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.7f, 1.0f)
                lineTo(140.0f, 223.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(101.2f, 199.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.7f, -1.0f)
                lineTo(40.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                lineTo(216.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(218.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(38.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(99.5f, 186.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 12.0f, 6.8f)
                lineToRelative(14.8f, 24.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 3.4f, 0.0f)
                lineToRelative(14.8f, -24.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 12.0f, -6.8f)
                lineTo(216.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null
