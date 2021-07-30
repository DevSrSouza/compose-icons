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

public val LineAwesomeIcons.RedoSolid: ImageVector
    get() {
        if (_redoSolid != null) {
            return _redoSolid!!
        }
        _redoSolid = Builder(name = "RedoSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2188f, 5.2813f)
                lineTo(17.7813f, 6.7188f)
                lineTo(24.0625f, 13.0f)
                lineTo(11.0f, 13.0f)
                curveTo(7.1563f, 13.0f, 4.0f, 16.1563f, 4.0f, 20.0f)
                lineTo(4.0f, 27.0f)
                lineTo(6.0f, 27.0f)
                lineTo(6.0f, 20.0f)
                curveTo(6.0f, 17.2461f, 8.2461f, 15.0f, 11.0f, 15.0f)
                lineTo(24.0625f, 15.0f)
                lineTo(17.7813f, 21.2813f)
                lineTo(19.2188f, 22.7188f)
                lineTo(27.2188f, 14.7188f)
                lineTo(27.9063f, 14.0f)
                lineTo(27.2188f, 13.2813f)
                close()
            }
        }
        .build()
        return _redoSolid!!
    }

private var _redoSolid: ImageVector? = null
