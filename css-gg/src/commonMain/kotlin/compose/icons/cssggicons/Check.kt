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
                moveTo(10.586f, 13.414f)
                lineTo(7.757f, 10.586f)
                lineTo(6.343f, 12.0f)
                lineTo(10.586f, 16.243f)
                lineTo(17.657f, 9.172f)
                lineTo(16.243f, 7.757f)
                lineTo(10.586f, 13.414f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
