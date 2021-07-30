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
                moveTo(16.0f, 8.5938f)
                lineTo(15.2813f, 9.2813f)
                lineTo(5.2813f, 19.2813f)
                lineTo(3.5938f, 21.0f)
                lineTo(28.4063f, 21.0f)
                lineTo(26.7188f, 19.2813f)
                lineTo(16.7188f, 9.2813f)
                close()
                moveTo(16.0f, 11.4375f)
                lineTo(23.5625f, 19.0f)
                lineTo(8.4375f, 19.0f)
                close()
            }
        }
        .build()
        return _caretUpSolid!!
    }

private var _caretUpSolid: ImageVector? = null
