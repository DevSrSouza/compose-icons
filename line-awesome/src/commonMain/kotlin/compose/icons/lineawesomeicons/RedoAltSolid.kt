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

public val LineAwesomeIcons.RedoAltSolid: ImageVector
    get() {
        if (_redoAltSolid != null) {
            return _redoAltSolid!!
        }
        _redoAltSolid = Builder(name = "RedoAltSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                lineTo(27.0f, 16.0f)
                curveTo(27.0f, 22.0859f, 22.0859f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9141f, 9.9141f, 5.0f, 16.0f, 5.0f)
                curveTo(19.875f, 5.0f, 23.2617f, 6.9844f, 25.2188f, 10.0f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 4.0f)
                lineTo(26.0f, 4.0f)
                lineTo(26.0f, 7.7188f)
                curveTo(23.6172f, 4.8438f, 20.0195f, 3.0f, 16.0f, 3.0f)
                close()
            }
        }
        .build()
        return _redoAltSolid!!
    }

private var _redoAltSolid: ImageVector? = null
