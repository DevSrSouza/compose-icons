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

public val LineAwesomeIcons.Clone: ImageVector
    get() {
        if (_clone != null) {
            return _clone!!
        }
        _clone = Builder(name = "Clone", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 6.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                lineTo(7.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 5.0f)
                lineTo(21.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 11.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 26.0f)
                lineTo(27.0f, 11.0f)
                lineTo(27.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(25.0f, 12.0f)
                lineTo(25.0f, 25.0f)
                lineTo(12.0f, 25.0f)
                lineTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _clone!!
    }

private var _clone: ImageVector? = null
