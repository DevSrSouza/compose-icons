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

public val CssGgIcons.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.3432f, 19.5208f)
                curveTo(3.219f, 16.3966f, 3.219f, 11.3312f, 6.3432f, 8.2071f)
                lineTo(12.0f, 2.5502f)
                lineTo(17.6569f, 8.2071f)
                curveTo(20.781f, 11.3312f, 20.781f, 16.3966f, 17.6569f, 19.5208f)
                curveTo(14.5327f, 22.645f, 9.4673f, 22.645f, 6.3432f, 19.5208f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null
