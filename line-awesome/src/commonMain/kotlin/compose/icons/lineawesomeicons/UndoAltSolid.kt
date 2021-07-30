package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UndoAltSolid: ImageVector
    get() {
        if (_undoAltSolid != null) {
            return _undoAltSolid!!
        }
        _undoAltSolid = Builder(name = "UndoAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(12.0f, 3.0f, 8.4f, 4.7992f, 6.0f, 7.6992f)
                lineTo(6.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                lineTo(4.0f, 12.0f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 10.0f)
                lineTo(6.8008f, 10.0f)
                curveTo(8.8008f, 7.0f, 12.1f, 5.0f, 16.0f, 5.0f)
                curveTo(22.1f, 5.0f, 27.0f, 9.9f, 27.0f, 16.0f)
                curveTo(27.0f, 22.1f, 22.1f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9f, 27.0f, 5.0f, 22.1f, 5.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                curveTo(3.0f, 23.2f, 8.8f, 29.0f, 16.0f, 29.0f)
                curveTo(23.2f, 29.0f, 29.0f, 23.2f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8f, 23.2f, 3.0f, 16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _undoAltSolid!!
    }

private var _undoAltSolid: ImageVector? = null
