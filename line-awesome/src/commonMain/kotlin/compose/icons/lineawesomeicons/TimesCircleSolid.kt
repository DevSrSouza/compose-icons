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

public val LineAwesomeIcons.TimesCircleSolid: ImageVector
    get() {
        if (_timesCircleSolid != null) {
            return _timesCircleSolid!!
        }
        _timesCircleSolid = Builder(name = "TimesCircleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(22.086f, 5.0f, 27.0f, 9.914f, 27.0f, 16.0f)
                curveTo(27.0f, 22.086f, 22.086f, 27.0f, 16.0f, 27.0f)
                curveTo(9.914f, 27.0f, 5.0f, 22.086f, 5.0f, 16.0f)
                curveTo(5.0f, 9.914f, 9.914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(12.219f, 10.781f)
                lineTo(10.781f, 12.219f)
                lineTo(14.563f, 16.0f)
                lineTo(10.781f, 19.781f)
                lineTo(12.219f, 21.219f)
                lineTo(16.0f, 17.438f)
                lineTo(19.781f, 21.219f)
                lineTo(21.219f, 19.781f)
                lineTo(17.438f, 16.0f)
                lineTo(21.219f, 12.219f)
                lineTo(19.781f, 10.781f)
                lineTo(16.0f, 14.563f)
                close()
            }
        }
        .build()
        return _timesCircleSolid!!
    }

private var _timesCircleSolid: ImageVector? = null
