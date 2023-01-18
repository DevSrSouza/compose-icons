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

public val LightGroup.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) {
            return _terminalWindow!!
        }
        _terminalWindow = Builder(name = "TerminalWindow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.3f, 4.7f)
                lineToRelative(-40.0f, 32.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 80.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.7f, -10.7f)
                lineTo(110.4f, 128.0f)
                lineTo(76.3f, 100.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.4f, -9.4f)
                lineToRelative(40.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 126.0f, 128.0f)
                close()
                moveTo(176.0f, 154.0f)
                lineTo(136.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(230.0f, 56.5f)
                verticalLineToRelative(143.0f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 215.5f, 214.0f)
                lineTo(40.5f, 214.0f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 26.0f, 199.5f)
                lineTo(26.0f, 56.5f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 40.5f, 42.0f)
                horizontalLineToRelative(175.0f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 230.0f, 56.5f)
                close()
                moveTo(218.0f, 56.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                lineTo(40.5f, 54.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 38.0f, 56.5f)
                verticalLineToRelative(143.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(175.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
