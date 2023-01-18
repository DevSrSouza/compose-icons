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

public val RegularGroup.AlertOff: ImageVector
    get() {
        if (_alertOff != null) {
            return _alertOff!!
        }
        _alertOff = Builder(name = "AlertOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2194f, 6.28f)
                lineTo(2.2197f, 3.2802f)
                curveTo(1.9268f, 2.9873f, 1.9268f, 2.5124f, 2.2197f, 2.2195f)
                curveTo(2.5126f, 1.9266f, 2.9874f, 1.9267f, 3.2803f, 2.2195f)
                lineTo(21.7801f, 20.7197f)
                curveTo(22.073f, 21.0126f, 22.073f, 21.4875f, 21.7801f, 21.7804f)
                curveTo(21.4872f, 22.0732f, 21.0123f, 22.0732f, 20.7194f, 21.7803f)
                lineTo(17.4398f, 18.5006f)
                lineTo(15.0001f, 18.5014f)
                curveTo(15.0001f, 20.1582f, 13.657f, 21.5014f, 12.0001f, 21.5014f)
                curveTo(10.4024f, 21.5014f, 9.0964f, 20.2524f, 9.0052f, 18.6776f)
                lineTo(8.9997f, 18.4991f)
                lineTo(4.275f, 18.4999f)
                curveTo(4.1036f, 18.4999f, 3.9341f, 18.4646f, 3.777f, 18.3964f)
                curveTo(3.1438f, 18.1213f, 2.8534f, 17.3851f, 3.1285f, 16.7519f)
                lineTo(4.5001f, 13.594f)
                verticalLineTo(9.496f)
                curveTo(4.5003f, 8.3437f, 4.7582f, 7.2536f, 5.2194f, 6.28f)
                close()
                moveTo(15.9391f, 16.9999f)
                lineTo(6.3647f, 7.4253f)
                curveTo(6.1289f, 8.0701f, 6.0002f, 8.7675f, 6.0001f, 9.4961f)
                verticalLineTo(13.9057f)
                lineTo(4.6561f, 16.9999f)
                horizontalLineTo(15.9391f)
                close()
                moveTo(13.4997f, 18.4991f)
                lineTo(10.5001f, 18.5014f)
                curveTo(10.5001f, 19.3298f, 11.1717f, 20.0014f, 12.0001f, 20.0014f)
                curveTo(12.7798f, 20.0014f, 13.4206f, 19.4065f, 13.4932f, 18.6458f)
                lineTo(13.4997f, 18.4991f)
                close()
                moveTo(18.0001f, 13.9067f)
                lineTo(18.7084f, 15.5266f)
                lineTo(20.8958f, 17.714f)
                curveTo(20.9532f, 17.5705f, 20.9848f, 17.4139f, 20.9848f, 17.2499f)
                curveTo(20.9848f, 17.0775f, 20.9492f, 16.907f, 20.8801f, 16.7491f)
                lineTo(19.5001f, 13.5931f)
                verticalLineTo(9.4961f)
                lineTo(19.4959f, 9.2451f)
                curveTo(19.3568f, 5.1908f, 16.05f, 1.9961f, 12.0001f, 1.9961f)
                curveTo(10.0984f, 1.9961f, 8.364f, 2.6993f, 7.0433f, 3.8612f)
                lineTo(8.1067f, 4.9246f)
                curveTo(9.1537f, 4.0329f, 10.5126f, 3.4961f, 12.0001f, 3.4961f)
                curveTo(15.2417f, 3.4961f, 17.8854f, 6.0503f, 17.9965f, 9.2837f)
                lineTo(18.0002f, 9.509f)
                lineTo(18.0001f, 13.9067f)
                close()
            }
        }
        .build()
        return _alertOff!!
    }

private var _alertOff: ImageVector? = null
