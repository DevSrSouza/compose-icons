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

public val LineAwesomeIcons.CaretLeftSolid: ImageVector
    get() {
        if (_caretLeftSolid != null) {
            return _caretLeftSolid!!
        }
        _caretLeftSolid = Builder(name = "CaretLeftSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.5938f)
                lineTo(18.2813f, 6.2813f)
                lineTo(9.2813f, 15.2813f)
                lineTo(8.5938f, 16.0f)
                lineTo(9.2813f, 16.7188f)
                lineTo(18.2813f, 25.7188f)
                lineTo(20.0f, 27.4063f)
                close()
                moveTo(18.0f, 9.4375f)
                lineTo(18.0f, 22.5625f)
                lineTo(11.4375f, 16.0f)
                close()
            }
        }
        .build()
        return _caretLeftSolid!!
    }

private var _caretLeftSolid: ImageVector? = null
