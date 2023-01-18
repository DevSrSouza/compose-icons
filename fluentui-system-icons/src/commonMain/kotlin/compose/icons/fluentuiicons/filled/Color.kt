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

public val FilledGroup.Color: ImageVector
    get() {
        if (_color != null) {
            return _color!!
        }
        _color = Builder(name = "Color", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8389f, 5.8576f)
                curveTo(6.7799f, 1.942f, 12.8685f, 0.8026f, 17.2028f, 3.4975f)
                curveTo(21.4826f, 6.1585f, 23.0566f, 11.2746f, 21.3037f, 16.0749f)
                curveTo(19.6485f, 20.6075f, 15.2873f, 22.4033f, 12.144f, 20.1233f)
                curveTo(10.9666f, 19.2692f, 10.5101f, 18.1985f, 10.2895f, 16.4595f)
                lineTo(10.1841f, 15.4715f)
                lineTo(10.1387f, 15.0741f)
                curveTo(10.016f, 14.14f, 9.8276f, 13.7216f, 9.4344f, 13.5024f)
                curveTo(8.8988f, 13.2038f, 8.5421f, 13.1969f, 7.8389f, 13.4694f)
                lineTo(7.4878f, 13.615f)
                lineTo(7.309f, 13.693f)
                curveTo(6.2952f, 14.1332f, 5.6209f, 14.2879f, 4.7679f, 14.1092f)
                lineTo(4.5676f, 14.062f)
                lineTo(4.4041f, 14.0154f)
                curveTo(1.6151f, 13.1512f, 1.202f, 9.3683f, 3.8389f, 5.8576f)
                close()
                moveTo(16.7669f, 10.5797f)
                curveTo(16.9456f, 11.2465f, 17.631f, 11.6423f, 18.2978f, 11.4636f)
                curveTo(18.9646f, 11.2849f, 19.3604f, 10.5995f, 19.1817f, 9.9327f)
                curveTo(19.003f, 9.2658f, 18.3176f, 8.8701f, 17.6508f, 9.0488f)
                curveTo(16.9839f, 9.2275f, 16.5882f, 9.9129f, 16.7669f, 10.5797f)
                close()
                moveTo(17.2615f, 14.0684f)
                curveTo(17.4402f, 14.7352f, 18.1256f, 15.1309f, 18.7924f, 14.9523f)
                curveTo(19.4592f, 14.7736f, 19.855f, 14.0882f, 19.6763f, 13.4213f)
                curveTo(19.4976f, 12.7545f, 18.8122f, 12.3588f, 18.1454f, 12.5374f)
                curveTo(17.4785f, 12.7161f, 17.0828f, 13.4015f, 17.2615f, 14.0684f)
                close()
                moveTo(14.7884f, 7.577f)
                curveTo(14.9671f, 8.2439f, 15.6525f, 8.6396f, 16.3193f, 8.4609f)
                curveTo(16.9861f, 8.2822f, 17.3819f, 7.5968f, 17.2032f, 6.93f)
                curveTo(17.0245f, 6.2632f, 16.3391f, 5.8674f, 15.6723f, 6.0461f)
                curveTo(15.0054f, 6.2248f, 14.6097f, 6.9102f, 14.7884f, 7.577f)
                close()
                moveTo(14.7599f, 16.5754f)
                curveTo(14.9386f, 17.2422f, 15.624f, 17.638f, 16.2908f, 17.4593f)
                curveTo(16.9577f, 17.2806f, 17.3534f, 16.5952f, 17.1747f, 15.9284f)
                curveTo(16.996f, 15.2615f, 16.3106f, 14.8658f, 15.6438f, 15.0445f)
                curveTo(14.9769f, 15.2232f, 14.5812f, 15.9086f, 14.7599f, 16.5754f)
                close()
                moveTo(11.263f, 6.6054f)
                curveTo(11.4416f, 7.2723f, 12.1271f, 7.668f, 12.7939f, 7.4893f)
                curveTo(13.4607f, 7.3106f, 13.8565f, 6.6252f, 13.6778f, 5.9584f)
                curveTo(13.4991f, 5.2916f, 12.8137f, 4.8958f, 12.1469f, 5.0745f)
                curveTo(11.48f, 5.2532f, 11.0843f, 5.9386f, 11.263f, 6.6054f)
                close()
            }
        }
        .build()
        return _color!!
    }

private var _color: ImageVector? = null
