package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) {
            return _terminalWindow!!
        }
        _terminalWindow = Builder(name = "TerminalWindow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.5f, 124.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.2f)
                lineToRelative(-40.0f, 32.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.5f, 0.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.1f, -1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.6f, -5.6f)
                lineTo(113.6f, 128.0f)
                lineTo(77.5f, 99.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.0f, -6.2f)
                close()
                moveTo(176.0f, 156.0f)
                lineTo(136.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 56.5f)
                verticalLineToRelative(143.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, true, 215.5f, 212.0f)
                lineTo(40.5f, 212.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, true, 28.0f, 199.5f)
                lineTo(28.0f, 56.5f)
                arcTo(12.5f, 12.5f, 0.0f, false, true, 40.5f, 44.0f)
                horizontalLineToRelative(175.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, true, 228.0f, 56.5f)
                close()
                moveTo(220.0f, 56.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -4.5f, -4.5f)
                lineTo(40.5f, 52.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 36.0f, 56.5f)
                verticalLineToRelative(143.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, 4.5f)
                horizontalLineToRelative(175.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
