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

public val LineAwesomeIcons.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = Builder(name = "Registered", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(12.0f, 10.0f)
                lineTo(12.0f, 22.0f)
                lineTo(14.0f, 22.0f)
                lineTo(14.0f, 18.0f)
                lineTo(17.4063f, 18.0f)
                lineTo(19.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                lineTo(19.3125f, 17.75f)
                curveTo(20.875f, 17.207f, 22.0f, 15.75f, 22.0f, 14.0f)
                curveTo(22.0f, 11.7891f, 20.2109f, 10.0f, 18.0f, 10.0f)
                close()
                moveTo(14.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                curveTo(19.1914f, 12.0f, 20.0f, 12.8086f, 20.0f, 14.0f)
                curveTo(20.0f, 15.1914f, 19.1914f, 16.0f, 18.0f, 16.0f)
                lineTo(14.0f, 16.0f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
