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

public val LineAwesomeIcons.CaretSquareRightSolid: ImageVector
    get() {
        if (_caretSquareRightSolid != null) {
            return _caretSquareRightSolid!!
        }
        _caretSquareRightSolid = Builder(name = "CaretSquareRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(14.2188f, 9.2813f)
                lineTo(12.7813f, 10.7188f)
                lineTo(18.0625f, 16.0f)
                lineTo(12.7813f, 21.2813f)
                lineTo(14.2188f, 22.7188f)
                lineTo(20.2188f, 16.7188f)
                lineTo(20.9063f, 16.0f)
                lineTo(20.2188f, 15.2813f)
                close()
            }
        }
        .build()
        return _caretSquareRightSolid!!
    }

private var _caretSquareRightSolid: ImageVector? = null
