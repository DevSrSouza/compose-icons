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
                moveTo(12.0321f, 1.0171f)
                lineTo(7.7575f, 5.2276f)
                lineTo(9.161f, 6.6525f)
                lineTo(11.0197f, 4.8217f)
                lineTo(10.9644f, 22.9768f)
                lineTo(12.9644f, 22.9829f)
                lineTo(13.0195f, 4.8697f)
                lineTo(14.8177f, 6.6953f)
                lineTo(16.2425f, 5.2917f)
                lineTo(12.0321f, 1.0171f)
                close()
            }
        }
        .build()
        return _arrowLongUp!!
    }

private var _arrowLongUp: ImageVector? = null
