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

public val LineAwesomeIcons.CaretUpSolid: ImageVector
    get() {
        if (_caretUpSolid != null) {
            return _caretUpSolid!!
        }
        _caretUpSolid = Builder(name = "CaretUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.594f)
                lineTo(15.281f, 9.281f)
                lineTo(5.281f, 19.281f)
                lineTo(3.594f, 21.0f)
                lineTo(28.406f, 21.0f)
                lineTo(26.719f, 19.281f)
                lineTo(16.719f, 9.281f)
                close()
                moveTo(16.0f, 11.438f)
                lineTo(23.563f, 19.0f)
                lineTo(8.438f, 19.0f)
                close()
            }
        }
        .build()
        return _caretUpSolid!!
    }

private var _caretUpSolid: ImageVector? = null
