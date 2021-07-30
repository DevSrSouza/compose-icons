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

public val LineAwesomeIcons.ToggleOnSolid: ImageVector
    get() {
        if (_toggleOnSolid != null) {
            return _toggleOnSolid!!
        }
        _toggleOnSolid = Builder(name = "ToggleOnSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveTo(4.0391f, 7.0f, 0.0f, 11.0352f, 0.0f, 16.0f)
                curveTo(0.0f, 20.9648f, 4.0391f, 25.0f, 9.0f, 25.0f)
                lineTo(23.0f, 25.0f)
                curveTo(27.957f, 25.0f, 32.0f, 20.957f, 32.0f, 16.0f)
                curveTo(32.0f, 11.043f, 27.957f, 7.0f, 23.0f, 7.0f)
                close()
                moveTo(23.0f, 9.0f)
                curveTo(26.8789f, 9.0f, 30.0f, 12.1211f, 30.0f, 16.0f)
                curveTo(30.0f, 19.8789f, 26.8789f, 23.0f, 23.0f, 23.0f)
                curveTo(19.1211f, 23.0f, 16.0f, 19.8789f, 16.0f, 16.0f)
                curveTo(16.0f, 12.1211f, 19.1211f, 9.0f, 23.0f, 9.0f)
                close()
            }
        }
        .build()
        return _toggleOnSolid!!
    }

private var _toggleOnSolid: ImageVector? = null
