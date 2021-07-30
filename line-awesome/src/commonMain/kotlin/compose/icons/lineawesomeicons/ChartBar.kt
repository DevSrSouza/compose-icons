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

public val LineAwesomeIcons.ChartBar: ImageVector
    get() {
        if (_chartBar != null) {
            return _chartBar!!
        }
        _chartBar = Builder(name = "ChartBar", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                lineTo(13.0f, 27.0f)
                lineTo(11.0f, 27.0f)
                lineTo(11.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 27.0f)
                lineTo(3.0f, 27.0f)
                lineTo(3.0f, 29.0f)
                lineTo(29.0f, 29.0f)
                lineTo(29.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 27.0f)
                lineTo(19.0f, 27.0f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(17.0f, 5.0f)
                lineTo(17.0f, 27.0f)
                lineTo(15.0f, 27.0f)
                close()
            }
        }
        .build()
        return _chartBar!!
    }

private var _chartBar: ImageVector? = null
