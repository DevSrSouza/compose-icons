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

public val FilledGroup.CallForward: ImageVector
    get() {
        if (_callForward != null) {
            return _callForward!!
        }
        _callForward = Builder(name = "CallForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.925f, 2.0501f)
                lineTo(10.9622f, 2.2476f)
                curveTo(11.9341f, 2.4326f, 12.5867f, 3.3407f, 12.4873f, 4.3696f)
                lineTo(12.2894f, 6.4172f)
                curveTo(12.2032f, 7.3095f, 11.5695f, 8.0697f, 10.7226f, 8.2968f)
                lineTo(8.366f, 8.9285f)
                curveTo(7.9825f, 9.8635f, 7.8073f, 10.894f, 7.8402f, 12.0201f)
                curveTo(7.8731f, 13.1461f, 8.1091f, 14.1935f, 8.5482f, 15.1623f)
                lineTo(10.7542f, 15.5536f)
                curveTo(11.5904f, 15.7019f, 12.2142f, 16.3919f, 12.302f, 17.2657f)
                lineTo(12.5067f, 19.3014f)
                curveTo(12.6088f, 20.3172f, 11.9625f, 21.2911f, 10.9946f, 21.5799f)
                lineTo(9.9574f, 21.8893f)
                curveTo(8.9249f, 22.1973f, 7.8384f, 21.9224f, 7.1051f, 21.1677f)
                curveTo(5.3738f, 19.3859f, 4.5055f, 16.4151f, 4.5f, 12.2554f)
                curveTo(4.4947f, 8.0897f, 5.3577f, 5.0265f, 7.0892f, 3.0657f)
                curveTo(7.8178f, 2.2406f, 8.8966f, 1.8543f, 9.925f, 2.0501f)
                close()
                moveTo(16.6963f, 7.1468f)
                lineTo(16.7804f, 7.2194f)
                lineTo(20.7771f, 11.2171f)
                curveTo(21.0431f, 11.4832f, 21.0674f, 11.8995f, 20.8499f, 12.1931f)
                lineTo(20.7774f, 12.2772f)
                lineTo(16.7808f, 16.2806f)
                curveTo(16.4882f, 16.5738f, 16.0133f, 16.5742f, 15.7202f, 16.2815f)
                curveTo(15.4537f, 16.0155f, 15.4291f, 15.5989f, 15.6467f, 15.3051f)
                lineTo(15.7193f, 15.2209f)
                lineTo(18.4306f, 12.5037f)
                lineTo(12.0006f, 12.5046f)
                curveTo(11.6209f, 12.5046f, 11.3071f, 12.2225f, 11.2574f, 11.8564f)
                lineTo(11.2506f, 11.7546f)
                curveTo(11.2506f, 11.3749f, 11.5327f, 11.0611f, 11.8988f, 11.0115f)
                lineTo(12.0006f, 11.0046f)
                lineTo(18.4416f, 11.0037f)
                lineTo(15.7197f, 8.2799f)
                curveTo(15.4534f, 8.0136f, 15.4293f, 7.597f, 15.6472f, 7.3034f)
                lineTo(15.7198f, 7.2193f)
                curveTo(15.9565f, 6.9826f, 16.312f, 6.9372f, 16.5943f, 7.0831f)
                lineTo(16.6963f, 7.1468f)
                close()
            }
        }
        .build()
        return _callForward!!
    }

private var _callForward: ImageVector? = null
