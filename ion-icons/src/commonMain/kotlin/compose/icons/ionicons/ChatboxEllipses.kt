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

public val IonIcons.ChatboxEllipses: ImageVector
    get() {
        if (_chatboxEllipses != null) {
            return _chatboxEllipses!!
        }
        _chatboxEllipses = Builder(name = "ChatboxEllipses", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 48.0f)
                lineTo(104.0f, 48.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, -72.0f, 72.0f)
                lineTo(32.0f, 312.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, 72.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.25f, 12.29f)
                lineTo(245.74f, 384.0f)
                lineTo(408.0f, 384.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f)
                lineTo(480.0f, 120.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 408.0f, 48.0f)
                close()
                moveTo(160.0f, 248.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 248.0f)
                close()
                moveTo(256.0f, 248.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 248.0f)
                close()
                moveTo(352.0f, 248.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 352.0f, 248.0f)
                close()
            }
        }
        .build()
        return _chatboxEllipses!!
    }

private var _chatboxEllipses: ImageVector? = null
