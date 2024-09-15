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
                moveTo(20.0f, 4.594f)
                lineTo(18.281f, 6.281f)
                lineTo(9.281f, 15.281f)
                lineTo(8.594f, 16.0f)
                lineTo(9.281f, 16.719f)
                lineTo(18.281f, 25.719f)
                lineTo(20.0f, 27.406f)
                close()
                moveTo(18.0f, 9.438f)
                lineTo(18.0f, 22.563f)
                lineTo(11.438f, 16.0f)
                close()
            }
        }
        .build()
        return _caretLeftSolid!!
    }

private var _caretLeftSolid: ImageVector? = null
