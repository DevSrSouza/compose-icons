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

public val Octicons.CommandPalette24: ImageVector
    get() {
        if (_commandPalette24 != null) {
            return _commandPalette24!!
        }
        _commandPalette24 = Builder(name = "CommandPalette24", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.045f, 18.894f)
                lineTo(9.94f, 12.0f)
                lineTo(3.045f, 5.106f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.061f)
                lineToRelative(7.425f, 7.425f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-7.424f, 7.425f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.061f, -1.06f)
                close()
                moveTo(11.25f, 19.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(9.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        .build()
        return _commandPalette24!!
    }

private var _commandPalette24: ImageVector? = null
