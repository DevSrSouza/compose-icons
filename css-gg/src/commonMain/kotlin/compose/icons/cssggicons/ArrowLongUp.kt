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

public val CssGgIcons.ArrowLongUp: ImageVector
    get() {
        if (_arrowLongUp != null) {
            return _arrowLongUp!!
        }
        _arrowLongUp = Builder(name = "ArrowLongUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.032f, 1.017f)
                lineTo(7.758f, 5.228f)
                lineTo(9.161f, 6.652f)
                lineTo(11.02f, 4.822f)
                lineTo(10.964f, 22.977f)
                lineTo(12.964f, 22.983f)
                lineTo(13.019f, 4.87f)
                lineTo(14.818f, 6.695f)
                lineTo(16.243f, 5.292f)
                lineTo(12.032f, 1.017f)
                close()
            }
        }
        .build()
        return _arrowLongUp!!
    }

private var _arrowLongUp: ImageVector? = null
