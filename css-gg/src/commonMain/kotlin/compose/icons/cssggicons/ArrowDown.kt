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

public val CssGgIcons.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0001f, 3.6716f)
                lineTo(13.0001f, 3.6716f)
                lineTo(13.0001f, 16.4999f)
                lineTo(16.2426f, 13.2574f)
                lineTo(17.6568f, 14.6716f)
                lineTo(12.0f, 20.3284f)
                lineTo(6.3431f, 14.6716f)
                lineTo(7.7573f, 13.2574f)
                lineTo(11.0001f, 16.5001f)
                lineTo(11.0001f, 3.6716f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
