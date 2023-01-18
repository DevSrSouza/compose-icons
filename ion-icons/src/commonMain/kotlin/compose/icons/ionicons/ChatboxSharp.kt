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

public val IonIcons.ChatboxSharp: ImageVector
    get() {
        if (_chatboxSharp != null) {
            return _chatboxSharp!!
        }
        _chatboxSharp = Builder(name = "ChatboxSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 464.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(72.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 56.0f, 48.0f)
                horizontalLineTo(456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineTo(360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(245.74f)
                close()
                moveTo(456.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _chatboxSharp!!
    }

private var _chatboxSharp: ImageVector? = null
