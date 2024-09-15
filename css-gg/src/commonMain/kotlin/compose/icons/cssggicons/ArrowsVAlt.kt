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

public val CssGgIcons.ArrowsVAlt: ImageVector
    get() {
        if (_arrowsVAlt != null) {
            return _arrowsVAlt!!
        }
        _arrowsVAlt = Builder(name = "ArrowsVAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.172f, 6.455f)
                lineTo(7.757f, 5.041f)
                lineTo(12.0f, 0.798f)
                lineTo(16.243f, 5.041f)
                lineTo(14.828f, 6.455f)
                lineTo(13.0f, 4.627f)
                verticalLineTo(19.373f)
                lineTo(14.828f, 17.545f)
                lineTo(16.243f, 18.959f)
                lineTo(12.0f, 23.202f)
                lineTo(7.757f, 18.959f)
                lineTo(9.172f, 17.545f)
                lineTo(11.0f, 19.373f)
                verticalLineTo(4.627f)
                lineTo(9.172f, 6.455f)
                close()
            }
        }
        .build()
        return _arrowsVAlt!!
    }

private var _arrowsVAlt: ImageVector? = null
