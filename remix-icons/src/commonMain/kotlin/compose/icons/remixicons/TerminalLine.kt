package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.TerminalLine: ImageVector
    get() {
        if (_terminalLine != null) {
            return _terminalLine!!
        }
        _terminalLine = Builder(name = "TerminalLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                lineToRelative(-7.071f, 7.071f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(8.172f, 12.0f)
                lineTo(2.515f, 6.343f)
                lineTo(3.929f, 4.93f)
                lineTo(11.0f, 12.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(11.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _terminalLine!!
    }

private var _terminalLine: ImageVector? = null
