package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.TerminalWindow: ImageVector
    get() {
        if (_terminalWindow != null) {
            return _terminalWindow!!
        }
        _terminalWindow = Builder(name = "TerminalWindow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.5f, 39.5f)
                horizontalLineTo(40.5f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -17.0f, 17.0f)
                verticalLineToRelative(143.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 17.0f, 17.0f)
                horizontalLineToRelative(175.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 17.0f, -17.0f)
                verticalLineTo(56.5f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 215.5f, 39.5f)
                close()
                moveTo(121.0f, 134.2f)
                lineToRelative(-40.0f, 32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.0f, 1.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.2f, -3.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 71.0f, 153.8f)
                lineTo(103.2f, 128.0f)
                lineTo(71.0f, 102.2f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 81.0f, 89.8f)
                lineToRelative(40.0f, 32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.0f, 12.4f)
                close()
                moveTo(180.0f, 168.0f)
                horizontalLineTo(140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _terminalWindow!!
    }

private var _terminalWindow: ImageVector? = null
