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

public val LightGroup.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) {
            return _chatCenteredDots!!
        }
        _chatCenteredDots = Builder(name = "ChatCenteredDots", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(99.5f, 198.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, 1.0f)
                lineTo(116.0f, 223.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(154.8f, 199.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, -1.0f)
                lineTo(216.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(156.5f, 186.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.0f, 6.8f)
                lineToRelative(-14.8f, 24.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -3.4f, 0.0f)
                lineToRelative(-14.8f, -24.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.0f, -6.8f)
                lineTo(40.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(90.0f, 120.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 90.0f, 120.0f)
                close()
                moveTo(138.0f, 120.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 120.0f)
                close()
                moveTo(186.0f, 120.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 186.0f, 120.0f)
                close()
            }
        }
        .build()
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
