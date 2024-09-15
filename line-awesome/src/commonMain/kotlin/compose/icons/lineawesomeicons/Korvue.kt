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

public val LineAwesomeIcons.Korvue: ImageVector
    get() {
        if (_korvue != null) {
            return _korvue!!
        }
        _korvue = Builder(name = "Korvue", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 15.881f)
                lineTo(17.811f, 15.881f)
                lineTo(21.508f, 10.0f)
                lineTo(16.924f, 10.0f)
                lineTo(14.0f, 15.506f)
                lineTo(14.0f, 10.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(10.0f, 16.5f)
                lineTo(10.0f, 21.971f)
                lineTo(14.0f, 21.971f)
                lineTo(14.0f, 16.795f)
                lineTo(17.0f, 21.971f)
                lineTo(21.814f, 21.971f)
                lineTo(18.111f, 16.5f)
                lineTo(10.0f, 16.5f)
                close()
            }
        }
        .build()
        return _korvue!!
    }

private var _korvue: ImageVector? = null
