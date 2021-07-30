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

public val CssGgIcons.ArrowTopLeft: ImageVector
    get() {
        if (_arrowTopLeft != null) {
            return _arrowTopLeft!!
        }
        _arrowTopLeft = Builder(name = "ArrowTopLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4747f, 5.4948f)
                lineTo(13.4793f, 7.4948f)
                lineTo(8.9218f, 7.5054f)
                lineTo(18.5253f, 17.0896f)
                lineTo(17.1125f, 18.5052f)
                lineTo(7.4826f, 8.8947f)
                lineTo(7.4934f, 13.5088f)
                lineTo(5.4934f, 13.5134f)
                lineTo(5.4747f, 5.5135f)
                lineTo(13.4747f, 5.4948f)
                close()
            }
        }
        .build()
        return _arrowTopLeft!!
    }

private var _arrowTopLeft: ImageVector? = null
