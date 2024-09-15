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
                moveTo(19.219f, 5.281f)
                lineTo(17.781f, 6.719f)
                lineTo(24.063f, 13.0f)
                lineTo(11.0f, 13.0f)
                curveTo(7.156f, 13.0f, 4.0f, 16.156f, 4.0f, 20.0f)
                lineTo(4.0f, 27.0f)
                lineTo(6.0f, 27.0f)
                lineTo(6.0f, 20.0f)
                curveTo(6.0f, 17.246f, 8.246f, 15.0f, 11.0f, 15.0f)
                lineTo(24.063f, 15.0f)
                lineTo(17.781f, 21.281f)
                lineTo(19.219f, 22.719f)
                lineTo(27.219f, 14.719f)
                lineTo(27.906f, 14.0f)
                lineTo(27.219f, 13.281f)
                close()
            }
        }
        .build()
        return _redoSolid!!
    }

private var _redoSolid: ImageVector? = null
