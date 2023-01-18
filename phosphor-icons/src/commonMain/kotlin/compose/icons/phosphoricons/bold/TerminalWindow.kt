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

public val BoldGroup.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) {
            return _terminalWindow!!
        }
        _terminalWindow = Builder(name = "TerminalWindow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.5f, 150.6f)
                lineTo(100.8f, 128.0f)
                lineTo(72.5f, 105.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 15.0f, -18.8f)
                lineToRelative(40.0f, 32.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, 18.8f)
                lineToRelative(-40.0f, 32.0f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 80.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.5f, -21.4f)
                close()
                moveTo(144.0f, 172.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 56.5f)
                verticalLineToRelative(143.0f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 215.5f, 220.0f)
                horizontalLineTo(40.5f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 20.0f, 199.5f)
                verticalLineTo(56.5f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 40.5f, 36.0f)
                horizontalLineToRelative(175.0f)
                arcTo(20.5f, 20.5f, 0.0f, false, true, 236.0f, 56.5f)
                close()
                moveTo(212.0f, 60.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(196.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
