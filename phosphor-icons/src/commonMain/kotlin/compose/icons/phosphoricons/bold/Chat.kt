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

public val BoldGroup.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.1f, 242.9f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, true, -8.5f, -1.9f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 20.0f, 222.8f)
                verticalLineTo(64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 44.0f)
                horizontalLineTo(216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(84.0f)
                lineTo(52.9f, 238.1f)
                arcTo(20.2f, 20.2f, 0.0f, false, true, 40.1f, 242.9f)
                close()
                moveTo(44.0f, 68.0f)
                verticalLineTo(214.2f)
                lineToRelative(25.6f, -21.5f)
                horizontalLineToRelative(0.0f)
                arcTo(20.3f, 20.3f, 0.0f, false, true, 82.5f, 188.0f)
                horizontalLineTo(212.0f)
                verticalLineTo(68.0f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
