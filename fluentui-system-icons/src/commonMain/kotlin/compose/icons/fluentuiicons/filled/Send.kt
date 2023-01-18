package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8147f, 12.1969f)
                lineTo(5.2834f, 13.4521f)
                curveTo(5.107f, 13.4815f, 4.9598f, 13.6029f, 4.8972f, 13.7704f)
                lineTo(2.2993f, 20.7278f)
                curveTo(2.0507f, 21.3673f, 2.7201f, 21.9773f, 3.3338f, 21.6705f)
                lineTo(21.3337f, 12.6705f)
                curveTo(21.8865f, 12.3941f, 21.8865f, 11.6052f, 21.3337f, 11.3288f)
                lineTo(3.3338f, 2.3289f)
                curveTo(2.7201f, 2.022f, 2.0507f, 2.6321f, 2.2993f, 3.2715f)
                lineTo(4.8972f, 10.2289f)
                curveTo(4.9598f, 10.3964f, 5.107f, 10.5178f, 5.2834f, 10.5472f)
                lineTo(12.8147f, 11.8024f)
                curveTo(12.9236f, 11.8205f, 12.9972f, 11.9236f, 12.9791f, 12.0325f)
                curveTo(12.965f, 12.1168f, 12.899f, 12.1829f, 12.8147f, 12.1969f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
