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
                moveTo(1.027f, 11.9929f)
                lineTo(5.2624f, 16.2426f)
                lineTo(6.679f, 14.8308f)
                lineTo(4.8577f, 13.0033f)
                lineTo(22.9731f, 13.0012f)
                lineTo(22.9728f, 11.0012f)
                lineTo(4.8531f, 11.0033f)
                lineTo(6.6886f, 9.174f)
                lineTo(5.2768f, 7.7574f)
                lineTo(1.027f, 11.9929f)
                close()
            }
        }
        .build()
        return _arrowLongLeft!!
    }

private var _arrowLongLeft: ImageVector? = null
