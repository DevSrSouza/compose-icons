package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Chatbox: ImageVector
    get() {
        if (_chatbox != null) {
            return _chatbox!!
        }
        _chatbox = Builder(name = "Chatbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(104.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                verticalLineTo(120.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, -72.0f)
                horizontalLineTo(408.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, 72.0f)
                verticalLineTo(312.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f)
                horizontalLineTo(245.74f)
                lineToRelative(-91.49f, 76.29f)
                arcTo(16.05f, 16.05f, 0.0f, false, true, 144.0f, 464.0f)
                close()
            }
        }
        .build()
        return _chatbox!!
    }

private var _chatbox: ImageVector? = null
