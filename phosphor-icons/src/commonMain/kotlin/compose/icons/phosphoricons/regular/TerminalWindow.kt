package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) {
            return _terminalWindow!!
        }
        _terminalWindow = Builder(name = "TerminalWindow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.0f, 6.2f)
                lineToRelative(-40.0f, 32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.0f, 1.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.2f, -3.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 75.0f, 153.8f)
                lineTo(107.2f, 128.0f)
                lineTo(75.0f, 102.2f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 85.0f, 89.8f)
                lineToRelative(40.0f, 32.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 128.0f, 128.0f)
                close()
                moveTo(176.0f, 152.0f)
                lineTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(232.5f, 56.5f)
                verticalLineToRelative(143.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(40.5f, 216.5f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(23.5f, 56.5f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, 17.0f, -17.0f)
                horizontalLineToRelative(175.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, true, 232.5f, 56.5f)
                close()
                moveTo(215.5f, 199.5f)
                lineTo(215.5f, 56.5f)
                lineTo(40.5f, 56.5f)
                verticalLineToRelative(143.0f)
                close()
            }
        }
        .build()
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
