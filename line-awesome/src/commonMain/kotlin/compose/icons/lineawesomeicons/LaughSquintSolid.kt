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

public val LineAwesomeIcons.LaughSquintSolid: ImageVector
    get() {
        if (_laughSquintSolid != null) {
            return _laughSquintSolid!!
        }
        _laughSquintSolid = Builder(name = "LaughSquintSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(10.0547f, 11.168f)
                lineTo(8.9453f, 12.832f)
                lineTo(10.6973f, 14.0f)
                lineTo(8.9453f, 15.168f)
                lineTo(10.0547f, 16.832f)
                lineTo(14.3027f, 14.0f)
                lineTo(10.0547f, 11.168f)
                close()
                moveTo(21.9453f, 11.168f)
                lineTo(17.6973f, 14.0f)
                lineTo(21.9453f, 16.832f)
                lineTo(23.0547f, 15.168f)
                lineTo(21.3027f, 14.0f)
                lineTo(23.0547f, 12.832f)
                lineTo(21.9453f, 11.168f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(9.0f, 19.0f, 10.605f, 24.0f, 16.0f, 24.0f)
                curveTo(21.395f, 24.0f, 23.0f, 19.0f, 23.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
            }
        }
        .build()
        return _laughSquintSolid!!
    }

private var _laughSquintSolid: ImageVector? = null
