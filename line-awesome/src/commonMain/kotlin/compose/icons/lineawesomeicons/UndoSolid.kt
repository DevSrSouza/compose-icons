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

public val LineAwesomeIcons.UndoSolid: ImageVector
    get() {
        if (_undoSolid != null) {
            return _undoSolid!!
        }
        _undoSolid = Builder(name = "UndoSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.781f, 5.281f)
                lineTo(4.781f, 13.281f)
                lineTo(4.094f, 14.0f)
                lineTo(4.781f, 14.719f)
                lineTo(12.781f, 22.719f)
                lineTo(14.219f, 21.281f)
                lineTo(7.938f, 15.0f)
                lineTo(21.0f, 15.0f)
                curveTo(23.754f, 15.0f, 26.0f, 17.246f, 26.0f, 20.0f)
                lineTo(26.0f, 27.0f)
                lineTo(28.0f, 27.0f)
                lineTo(28.0f, 20.0f)
                curveTo(28.0f, 16.156f, 24.844f, 13.0f, 21.0f, 13.0f)
                lineTo(7.938f, 13.0f)
                lineTo(14.219f, 6.719f)
                close()
            }
        }
        .build()
        return _undoSolid!!
    }

private var _undoSolid: ImageVector? = null
