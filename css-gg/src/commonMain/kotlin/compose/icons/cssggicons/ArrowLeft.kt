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

public val CssGgIcons.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3284f, 11.0001f)
                verticalLineTo(13.0001f)
                lineTo(7.5001f, 13.0001f)
                lineTo(10.7426f, 16.2426f)
                lineTo(9.3284f, 17.6568f)
                lineTo(3.6716f, 12.0f)
                lineTo(9.3284f, 6.3431f)
                lineTo(10.7426f, 7.7573f)
                lineTo(7.4999f, 11.0001f)
                lineTo(20.3284f, 11.0001f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
