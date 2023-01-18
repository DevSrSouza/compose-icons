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

public val BoldGroup.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) {
            return _chatCircle!!
        }
        _chatCircle = Builder(name = "ChatCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 236.0f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, true, -50.5f, -12.5f)
                lineToRelative(-28.4f, 8.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -24.7f, -24.7f)
                lineToRelative(8.1f, -28.4f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 236.0f)
                close()
                moveTo(79.0f, 198.6f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, 6.1f, 1.7f)
                arcTo(85.1f, 85.1f, 0.0f, false, false, 128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, -84.0f)
                arcToRelative(85.1f, 85.1f, 0.0f, false, false, 11.7f, 42.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 1.3f, 9.4f)
                lineToRelative(-7.5f, 26.2f)
                lineTo(75.7f, 199.0f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 79.0f, 198.6f)
                close()
            }
        }
        .build()
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
