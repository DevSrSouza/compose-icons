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

public val LineAwesomeIcons.CaretSquareUp: ImageVector
    get() {
        if (_caretSquareUp != null) {
            return _caretSquareUp!!
        }
        _caretSquareUp = Builder(name = "CaretSquareUp", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(16.0f, 11.094f)
                lineTo(15.281f, 11.781f)
                lineTo(9.281f, 17.781f)
                lineTo(10.719f, 19.219f)
                lineTo(16.0f, 13.938f)
                lineTo(21.281f, 19.219f)
                lineTo(22.719f, 17.781f)
                lineTo(16.719f, 11.781f)
                close()
            }
        }
        .build()
        return _caretSquareUp!!
    }

private var _caretSquareUp: ImageVector? = null
