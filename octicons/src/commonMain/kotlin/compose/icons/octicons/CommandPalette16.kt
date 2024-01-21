package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CommandPalette16: ImageVector
    get() {
        if (_commandPalette16 != null) {
            return _commandPalette16!!
        }
        _commandPalette16 = Builder(name = "CommandPalette16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.354f, 8.04f)
                lineToRelative(-4.773f, 4.773f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.061f, 1.06f)
                lineTo(7.945f, 8.57f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineTo(2.642f, 2.206f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.061f)
                lineTo(6.353f, 8.04f)
                close()
                moveTo(8.75f, 11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-5.5f)
                close()
            }
        }
        .build()
        return _commandPalette16!!
    }

private var _commandPalette16: ImageVector? = null
