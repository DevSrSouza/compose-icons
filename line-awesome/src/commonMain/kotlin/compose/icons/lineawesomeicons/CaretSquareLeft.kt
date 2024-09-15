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

public val LineAwesomeIcons.CaretSquareLeft: ImageVector
    get() {
        if (_caretSquareLeft != null) {
            return _caretSquareLeft!!
        }
        _caretSquareLeft = Builder(name = "CaretSquareLeft", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(17.781f, 9.281f)
                lineTo(11.781f, 15.281f)
                lineTo(11.094f, 16.0f)
                lineTo(11.781f, 16.719f)
                lineTo(17.781f, 22.719f)
                lineTo(19.219f, 21.281f)
                lineTo(13.938f, 16.0f)
                lineTo(19.219f, 10.719f)
                close()
            }
        }
        .build()
        return _caretSquareLeft!!
    }

private var _caretSquareLeft: ImageVector? = null
