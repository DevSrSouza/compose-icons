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

public val LineAwesomeIcons.TimesCircle: ImageVector
    get() {
        if (_timesCircle != null) {
            return _timesCircle!!
        }
        _timesCircle = Builder(name = "TimesCircle", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.0859f, 5.0f, 27.0f, 9.9141f, 27.0f, 16.0f)
                curveTo(27.0f, 22.0859f, 22.0859f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9141f, 27.0f, 5.0f, 22.0859f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9141f, 9.9141f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(12.2188f, 10.7813f)
                lineTo(10.7813f, 12.2188f)
                lineTo(14.5625f, 16.0f)
                lineTo(10.7813f, 19.7813f)
                lineTo(12.2188f, 21.2188f)
                lineTo(16.0f, 17.4375f)
                lineTo(19.7813f, 21.2188f)
                lineTo(21.2188f, 19.7813f)
                lineTo(17.4375f, 16.0f)
                lineTo(21.2188f, 12.2188f)
                lineTo(19.7813f, 10.7813f)
                lineTo(16.0f, 14.5625f)
                close()
            }
        }
        .build()
        return _timesCircle!!
    }

private var _timesCircle: ImageVector? = null
