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
                moveTo(9.1716f, 6.455f)
                lineTo(7.7574f, 5.0408f)
                lineTo(12.0f, 0.7982f)
                lineTo(16.2426f, 5.0408f)
                lineTo(14.8284f, 6.455f)
                lineTo(13.0001f, 4.6267f)
                verticalLineTo(19.3733f)
                lineTo(14.8284f, 17.5449f)
                lineTo(16.2426f, 18.9592f)
                lineTo(12.0f, 23.2018f)
                lineTo(7.7574f, 18.9592f)
                lineTo(9.1716f, 17.5449f)
                lineTo(11.0001f, 19.3734f)
                verticalLineTo(4.6266f)
                lineTo(9.1716f, 6.455f)
                close()
            }
        }
        .build()
        return _arrowsVAlt!!
    }

private var _arrowsVAlt: ImageVector? = null
