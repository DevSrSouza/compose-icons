package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tmux: ImageVector
    get() {
        if (_tmux != null) {
            return _tmux!!
        }
        _tmux = Builder(name = "Tmux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.251f)
                lineTo(24.0f, 10.5f)
                lineTo(12.45f, 10.5f)
                lineTo(12.45f, 0.0f)
                horizontalLineToRelative(9.3f)
                arcTo(2.251f, 2.251f, 0.0f, false, true, 24.0f, 2.251f)
                close()
                moveTo(12.45f, 11.4f)
                lineTo(24.0f, 11.4f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-0.008f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 21.75f, 24.0f)
                lineTo(2.25f, 24.0f)
                arcToRelative(2.247f, 2.247f, 0.0f, false, true, -2.242f, -2.1f)
                lineTo(0.0f, 21.9f)
                lineTo(0.0f, 2.251f)
                arcTo(2.251f, 2.251f, 0.0f, false, true, 2.25f, 0.0f)
                horizontalLineToRelative(9.3f)
                verticalLineToRelative(21.6f)
                horizontalLineToRelative(0.9f)
                lineTo(12.45f, 11.4f)
                close()
                moveTo(23.692f, 21.9f)
                lineTo(0.308f, 21.9f)
                arcToRelative(1.948f, 1.948f, 0.0f, false, false, 1.942f, 1.8f)
                horizontalLineToRelative(19.5f)
                arcToRelative(1.95f, 1.95f, 0.0f, false, false, 1.942f, -1.8f)
                close()
            }
        }
        .build()
        return _tmux!!
    }

private var _tmux: ImageVector? = null
