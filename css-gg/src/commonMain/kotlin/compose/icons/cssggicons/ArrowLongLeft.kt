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

public val CssGgIcons.ArrowLongLeft: ImageVector
    get() {
        if (_arrowLongLeft != null) {
            return _arrowLongLeft!!
        }
        _arrowLongLeft = Builder(name = "ArrowLongLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.027f, 11.993f)
                lineTo(5.262f, 16.243f)
                lineTo(6.679f, 14.831f)
                lineTo(4.858f, 13.003f)
                lineTo(22.973f, 13.001f)
                lineTo(22.973f, 11.001f)
                lineTo(4.853f, 11.003f)
                lineTo(6.689f, 9.174f)
                lineTo(5.277f, 7.757f)
                lineTo(1.027f, 11.993f)
                close()
            }
        }
        .build()
        return _arrowLongLeft!!
    }

private var _arrowLongLeft: ImageVector? = null
