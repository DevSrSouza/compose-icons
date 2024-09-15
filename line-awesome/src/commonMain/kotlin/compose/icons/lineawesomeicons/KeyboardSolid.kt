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

public val LineAwesomeIcons.KeyboardSolid: ImageVector
    get() {
        if (_keyboardSolid != null) {
            return _keyboardSolid!!
        }
        _keyboardSolid = Builder(name = "KeyboardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                curveTo(1.906f, 7.0f, 1.0f, 7.906f, 1.0f, 9.0f)
                lineTo(1.0f, 23.0f)
                curveTo(1.0f, 24.094f, 1.906f, 25.0f, 3.0f, 25.0f)
                lineTo(29.0f, 25.0f)
                curveTo(30.094f, 25.0f, 31.0f, 24.094f, 31.0f, 23.0f)
                lineTo(31.0f, 9.0f)
                curveTo(31.0f, 7.906f, 30.094f, 7.0f, 29.0f, 7.0f)
                close()
                moveTo(3.0f, 9.0f)
                lineTo(29.0f, 9.0f)
                lineTo(29.0f, 23.0f)
                lineTo(3.0f, 23.0f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(5.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(9.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 13.0f)
                lineTo(15.0f, 13.0f)
                lineTo(15.0f, 11.0f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(17.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(21.0f, 11.0f)
                lineTo(21.0f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 11.0f)
                close()
                moveTo(25.0f, 11.0f)
                lineTo(25.0f, 13.0f)
                lineTo(27.0f, 13.0f)
                lineTo(27.0f, 11.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 15.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(11.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(13.0f, 15.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(15.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(19.0f, 15.0f)
                lineTo(19.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                lineTo(21.0f, 15.0f)
                close()
                moveTo(23.0f, 15.0f)
                lineTo(23.0f, 17.0f)
                lineTo(27.0f, 17.0f)
                lineTo(27.0f, 15.0f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(5.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(11.0f, 19.0f)
                lineTo(11.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 19.0f)
                close()
                moveTo(23.0f, 19.0f)
                lineTo(23.0f, 21.0f)
                lineTo(27.0f, 21.0f)
                lineTo(27.0f, 19.0f)
                close()
            }
        }
        .build()
        return _keyboardSolid!!
    }

private var _keyboardSolid: ImageVector? = null
