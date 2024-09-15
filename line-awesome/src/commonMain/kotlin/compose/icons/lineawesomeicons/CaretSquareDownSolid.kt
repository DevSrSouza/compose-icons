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

public val LineAwesomeIcons.CaretSquareDownSolid: ImageVector
    get() {
        if (_caretSquareDownSolid != null) {
            return _caretSquareDownSolid!!
        }
        _caretSquareDownSolid = Builder(name = "CaretSquareDownSolid", defaultWidth = 32.0.dp,
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
                moveTo(10.719f, 12.781f)
                lineTo(9.281f, 14.219f)
                lineTo(15.281f, 20.219f)
                lineTo(16.0f, 20.906f)
                lineTo(16.719f, 20.219f)
                lineTo(22.719f, 14.219f)
                lineTo(21.281f, 12.781f)
                lineTo(16.0f, 18.063f)
                close()
            }
        }
        .build()
        return _caretSquareDownSolid!!
    }

private var _caretSquareDownSolid: ImageVector? = null
