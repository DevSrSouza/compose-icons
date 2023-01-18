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

public val FilledGroup.LineDashes: ImageVector
    get() {
        if (_lineDashes != null) {
            return _lineDashes!!
        }
        _lineDashes = Builder(name = "LineDashes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7071f, 2.2968f)
                curveTo(22.0976f, 2.6873f, 22.0976f, 3.3205f, 21.7071f, 3.711f)
                lineTo(21.2071f, 4.211f)
                curveTo(20.8166f, 4.6015f, 20.1834f, 4.6015f, 19.7929f, 4.211f)
                curveTo(19.4024f, 3.8205f, 19.4024f, 3.1873f, 19.7929f, 2.7968f)
                lineTo(20.2929f, 2.2968f)
                curveTo(20.6834f, 1.9063f, 21.3166f, 1.9063f, 21.7071f, 2.2968f)
                close()
                moveTo(17.7032f, 6.297f)
                curveTo(18.0937f, 6.6876f, 18.0937f, 7.3207f, 17.7032f, 7.7113f)
                lineTo(16.7061f, 8.7083f)
                curveTo(16.3156f, 9.0989f, 15.6824f, 9.0989f, 15.2919f, 8.7083f)
                curveTo(14.9014f, 8.3178f, 14.9014f, 7.6846f, 15.2919f, 7.2941f)
                lineTo(16.289f, 6.297f)
                curveTo(16.6795f, 5.9065f, 17.3127f, 5.9065f, 17.7032f, 6.297f)
                close()
                moveTo(13.2071f, 10.7926f)
                curveTo(13.5976f, 11.1832f, 13.5976f, 11.8163f, 13.2071f, 12.2069f)
                lineTo(12.2071f, 13.2069f)
                curveTo(11.8166f, 13.5974f, 11.1834f, 13.5974f, 10.7929f, 13.2069f)
                curveTo(10.4024f, 12.8163f, 10.4024f, 12.1832f, 10.7929f, 11.7926f)
                lineTo(11.7929f, 10.7926f)
                curveTo(12.1834f, 10.4021f, 12.8166f, 10.4021f, 13.2071f, 10.7926f)
                close()
                moveTo(8.7029f, 16.7109f)
                curveTo(9.0935f, 16.3204f, 9.0935f, 15.6872f, 8.7029f, 15.2967f)
                curveTo(8.3124f, 14.9062f, 7.6793f, 14.9062f, 7.2887f, 15.2967f)
                lineTo(6.2909f, 16.2945f)
                curveTo(5.9004f, 16.685f, 5.9004f, 17.3182f, 6.2909f, 17.7087f)
                curveTo(6.6815f, 18.0992f, 7.3146f, 18.0992f, 7.7052f, 17.7087f)
                lineTo(8.7029f, 16.7109f)
                close()
                moveTo(4.212f, 21.2069f)
                curveTo(4.6025f, 20.8163f, 4.6025f, 20.1832f, 4.212f, 19.7926f)
                curveTo(3.8215f, 19.4021f, 3.1883f, 19.4021f, 2.7978f, 19.7926f)
                lineTo(2.2978f, 20.2926f)
                curveTo(1.9073f, 20.6832f, 1.9073f, 21.3163f, 2.2978f, 21.7069f)
                curveTo(2.6883f, 22.0974f, 3.3215f, 22.0974f, 3.712f, 21.7069f)
                lineTo(4.212f, 21.2069f)
                close()
            }
        }
        .build()
        return _lineDashes!!
    }

private var _lineDashes: ImageVector? = null
