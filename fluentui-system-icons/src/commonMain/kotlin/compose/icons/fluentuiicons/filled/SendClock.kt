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

public val FilledGroup.SendClock: ImageVector
    get() {
        if (_sendClock != null) {
            return _sendClock!!
        }
        _sendClock = Builder(name = "SendClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8147f, 12.1969f)
                lineTo(5.2834f, 13.4521f)
                curveTo(5.107f, 13.4815f, 4.9598f, 13.6029f, 4.8972f, 13.7704f)
                lineTo(2.2993f, 20.7278f)
                curveTo(2.0507f, 21.3673f, 2.7201f, 21.9773f, 3.3338f, 21.6705f)
                lineTo(11.0084f, 17.8332f)
                curveTo(11.0028f, 17.7228f, 11.0f, 17.6117f, 11.0f, 17.5f)
                curveTo(11.0f, 13.9101f, 13.9101f, 11.0f, 17.5f, 11.0f)
                curveTo(19.0532f, 11.0f, 20.4792f, 11.5448f, 21.5973f, 12.4537f)
                curveTo(21.8648f, 12.1015f, 21.777f, 11.5505f, 21.3337f, 11.3288f)
                lineTo(3.3338f, 2.3289f)
                curveTo(2.7201f, 2.022f, 2.0507f, 2.6321f, 2.2993f, 3.2715f)
                lineTo(4.8972f, 10.2289f)
                curveTo(4.9598f, 10.3964f, 5.107f, 10.5178f, 5.2834f, 10.5472f)
                lineTo(12.8147f, 11.8024f)
                curveTo(12.9236f, 11.8205f, 12.9972f, 11.9236f, 12.9791f, 12.0325f)
                curveTo(12.965f, 12.1168f, 12.899f, 12.1829f, 12.8147f, 12.1969f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(19.5f, 17.5001f)
                horizontalLineTo(17.5f)
                lineTo(17.5f, 14.9999f)
                curveTo(17.5f, 14.7238f, 17.2761f, 14.4999f, 17.0f, 14.4999f)
                curveTo(16.7239f, 14.4999f, 16.5f, 14.7238f, 16.5f, 14.9999f)
                lineTo(16.5f, 17.9985f)
                lineTo(16.5f, 18.0001f)
                curveTo(16.5f, 18.2762f, 16.7239f, 18.5001f, 17.0f, 18.5001f)
                horizontalLineTo(19.5f)
                curveTo(19.7761f, 18.5001f, 20.0f, 18.2762f, 20.0f, 18.0001f)
                curveTo(20.0f, 17.7239f, 19.7761f, 17.5001f, 19.5f, 17.5001f)
                close()
            }
        }
        .build()
        return _sendClock!!
    }

private var _sendClock: ImageVector? = null
