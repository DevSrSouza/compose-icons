package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowsHAlt: ImageVector
    get() {
        if (_arrowsHAlt != null) {
            return _arrowsHAlt!!
        }
        _arrowsHAlt = Builder(name = "ArrowsHAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2427f, 7.7573f)
                lineTo(5.6569f, 9.1716f)
                lineTo(3.8284f, 11.0f)
                horizontalLineTo(20.1716f)
                lineTo(18.3431f, 9.1716f)
                lineTo(19.7573f, 7.7573f)
                lineTo(24.0f, 12.0f)
                lineTo(19.7572f, 16.2426f)
                lineTo(18.343f, 14.8284f)
                lineTo(20.1714f, 13.0f)
                horizontalLineTo(3.8284f)
                lineTo(5.6568f, 14.8284f)
                lineTo(4.2426f, 16.2426f)
                lineTo(0.0f, 12.0f)
                lineTo(4.2427f, 7.7573f)
                close()
            }
        }
        .build()
        return _arrowsHAlt!!
    }

private var _arrowsHAlt: ImageVector? = null
