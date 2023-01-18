package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ShareIos: ImageVector
    get() {
        if (_shareIos != null) {
            return _shareIos!!
        }
        _shareIos = Builder(name = "ShareIos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7544f, 11.0f)
                curveTo(20.1341f, 11.0f, 20.4479f, 11.2822f, 20.4975f, 11.6482f)
                lineTo(20.5044f, 11.75f)
                verticalLineTo(18.7509f)
                curveTo(20.5044f, 20.4839f, 19.1479f, 21.9001f, 17.4388f, 21.9957f)
                lineTo(17.2544f, 22.0009f)
                horizontalLineTo(6.2544f)
                curveTo(4.5214f, 22.0009f, 3.1051f, 20.6444f, 3.0095f, 18.9353f)
                lineTo(3.0044f, 18.7509f)
                verticalLineTo(11.75f)
                curveTo(3.0044f, 11.3358f, 3.3402f, 11.0f, 3.7544f, 11.0f)
                curveTo(4.1341f, 11.0f, 4.4479f, 11.2822f, 4.4976f, 11.6482f)
                lineTo(4.5044f, 11.75f)
                verticalLineTo(18.7509f)
                curveTo(4.5044f, 19.669f, 5.2115f, 20.4221f, 6.1109f, 20.4951f)
                lineTo(6.2544f, 20.5009f)
                horizontalLineTo(17.2544f)
                curveTo(18.1726f, 20.5009f, 18.9256f, 19.7938f, 18.9986f, 18.8944f)
                lineTo(19.0044f, 18.7509f)
                verticalLineTo(11.75f)
                curveTo(19.0044f, 11.3358f, 19.3402f, 11.0f, 19.7544f, 11.0f)
                close()
                moveTo(6.2198f, 7.2163f)
                lineTo(11.216f, 2.2197f)
                curveTo(11.4821f, 1.9536f, 11.8985f, 1.9292f, 12.1921f, 2.1467f)
                lineTo(12.2763f, 2.2192f)
                lineTo(17.2811f, 7.2158f)
                curveTo(17.5743f, 7.5085f, 17.5747f, 7.9834f, 17.282f, 8.2765f)
                curveTo(17.016f, 8.543f, 16.5993f, 8.5675f, 16.3055f, 8.3499f)
                lineTo(16.2213f, 8.2774f)
                lineTo(12.4984f, 4.561f)
                lineTo(12.4993f, 16.2549f)
                curveTo(12.4993f, 16.6346f, 12.2171f, 16.9484f, 11.8511f, 16.9981f)
                lineTo(11.7493f, 17.0049f)
                curveTo(11.3696f, 17.0049f, 11.0558f, 16.7228f, 11.0061f, 16.3567f)
                lineTo(10.9993f, 16.2549f)
                lineTo(10.9984f, 4.558f)
                lineTo(7.2805f, 8.2769f)
                curveTo(7.0142f, 8.5432f, 6.5976f, 8.5674f, 6.3039f, 8.3496f)
                lineTo(6.2198f, 8.277f)
                curveTo(5.9535f, 8.0107f, 5.9293f, 7.594f, 6.1472f, 7.3004f)
                lineTo(6.2198f, 7.2163f)
                lineTo(11.216f, 2.2197f)
                lineTo(6.2198f, 7.2163f)
                close()
            }
        }
        .build()
        return _shareIos!!
    }

private var _shareIos: ImageVector? = null
