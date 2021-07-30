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

public val LineAwesomeIcons.CaretSquareDown: ImageVector
    get() {
        if (_caretSquareDown != null) {
            return _caretSquareDown!!
        }
        _caretSquareDown = Builder(name = "CaretSquareDown", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(10.7188f, 12.7813f)
                lineTo(9.2813f, 14.2188f)
                lineTo(15.2813f, 20.2188f)
                lineTo(16.0f, 20.9063f)
                lineTo(16.7188f, 20.2188f)
                lineTo(22.7188f, 14.2188f)
                lineTo(21.2813f, 12.7813f)
                lineTo(16.0f, 18.0625f)
                close()
            }
        }
        .build()
        return _caretSquareDown!!
    }

private var _caretSquareDown: ImageVector? = null
