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

public val CssGgIcons.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6568f, 8.9622f)
                lineTo(16.2393f, 10.3731f)
                lineTo(12.9843f, 7.1028f)
                lineTo(12.9706f, 20.7079f)
                lineTo(10.9706f, 20.7059f)
                lineTo(10.9843f, 7.1381f)
                lineTo(7.754f, 10.3532f)
                lineTo(6.3431f, 8.9357f)
                lineTo(12.0132f, 3.2921f)
                lineTo(17.6568f, 8.9622f)
                close()
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
