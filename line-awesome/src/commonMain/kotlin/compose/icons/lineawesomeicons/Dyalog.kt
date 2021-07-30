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

public val LineAwesomeIcons.Dyalog: ImageVector
    get() {
        if (_dyalog != null) {
            return _dyalog!!
        }
        _dyalog = Builder(name = "Dyalog", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                lineTo(6.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                lineTo(8.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                curveTo(19.962f, 7.0f, 24.0f, 11.038f, 24.0f, 16.0f)
                curveTo(24.0f, 20.962f, 19.962f, 25.0f, 15.0f, 25.0f)
                lineTo(6.0f, 25.0f)
                lineTo(6.0f, 27.0f)
                lineTo(15.0f, 27.0f)
                curveTo(21.065f, 27.0f, 26.0f, 22.065f, 26.0f, 16.0f)
                curveTo(26.0f, 9.935f, 21.065f, 5.0f, 15.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _dyalog!!
    }

private var _dyalog: ImageVector? = null
