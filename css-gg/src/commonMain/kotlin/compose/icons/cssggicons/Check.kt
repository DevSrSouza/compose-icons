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

public val CssGgIcons.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5858f, 13.4142f)
                lineTo(7.7573f, 10.5858f)
                lineTo(6.3431f, 12.0f)
                lineTo(10.5858f, 16.2427f)
                lineTo(17.6568f, 9.1716f)
                lineTo(16.2426f, 7.7574f)
                lineTo(10.5858f, 13.4142f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
