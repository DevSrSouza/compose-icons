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

public val LineAwesomeIcons.CaretSquareLeftSolid: ImageVector
    get() {
        if (_caretSquareLeftSolid != null) {
            return _caretSquareLeftSolid!!
        }
        _caretSquareLeftSolid = Builder(name = "CaretSquareLeftSolid", defaultWidth = 32.0.dp,
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
                moveTo(17.7813f, 9.2813f)
                lineTo(11.7813f, 15.2813f)
                lineTo(11.0938f, 16.0f)
                lineTo(11.7813f, 16.7188f)
                lineTo(17.7813f, 22.7188f)
                lineTo(19.2188f, 21.2813f)
                lineTo(13.9375f, 16.0f)
                lineTo(19.2188f, 10.7188f)
                close()
            }
        }
        .build()
        return _caretSquareLeftSolid!!
    }

private var _caretSquareLeftSolid: ImageVector? = null
