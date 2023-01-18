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

public val RegularGroup.NumberSymbol: ImageVector
    get() {
        if (_numberSymbol != null) {
            return _numberSymbol!!
        }
        _numberSymbol = Builder(name = "NumberSymbol", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9869f, 2.8895f)
                curveTo(11.0639f, 2.4825f, 10.7964f, 2.0902f, 10.3894f, 2.0132f)
                curveTo(9.9824f, 1.9362f, 9.59f, 2.2037f, 9.5131f, 2.6107f)
                lineTo(8.494f, 7.9981f)
                lineTo(3.7497f, 8.0004f)
                curveTo(3.3354f, 8.0006f, 2.9998f, 8.3365f, 3.0f, 8.7507f)
                curveTo(3.0002f, 9.1649f, 3.3361f, 9.5006f, 3.7503f, 9.5004f)
                lineTo(8.2102f, 9.4983f)
                lineTo(7.2645f, 14.498f)
                lineTo(2.7497f, 14.5001f)
                curveTo(2.3354f, 14.5003f, 1.9998f, 14.8363f, 2.0f, 15.2505f)
                curveTo(2.0002f, 15.6647f, 2.3361f, 16.0003f, 2.7503f, 16.0001f)
                lineTo(6.9807f, 15.9981f)
                lineTo(6.013f, 21.1137f)
                curveTo(5.936f, 21.5207f, 6.2036f, 21.9131f, 6.6105f, 21.99f)
                curveTo(7.0175f, 22.067f, 7.4099f, 21.7995f, 7.4869f, 21.3925f)
                lineTo(8.5074f, 15.9974f)
                lineTo(13.9814f, 15.9949f)
                lineTo(13.0131f, 21.1137f)
                curveTo(12.9361f, 21.5207f, 13.2036f, 21.9131f, 13.6106f, 21.99f)
                curveTo(14.0176f, 22.067f, 14.41f, 21.7995f, 14.4869f, 21.3925f)
                lineTo(15.5081f, 15.9942f)
                lineTo(20.2503f, 15.9919f)
                curveTo(20.6646f, 15.9917f, 21.0002f, 15.6558f, 21.0f, 15.2416f)
                curveTo(20.9998f, 14.8274f, 20.6639f, 14.4918f, 20.2496f, 14.4919f)
                lineTo(15.7919f, 14.494f)
                lineTo(16.7376f, 9.4943f)
                lineTo(21.2503f, 9.4922f)
                curveTo(21.6646f, 9.492f, 22.0002f, 9.156f, 22.0f, 8.7418f)
                curveTo(21.9998f, 8.3276f, 21.6639f, 7.992f, 21.2496f, 7.9922f)
                lineTo(17.0214f, 7.9942f)
                lineTo(17.987f, 2.8895f)
                curveTo(18.064f, 2.4825f, 17.7964f, 2.0902f, 17.3894f, 2.0132f)
                curveTo(16.9824f, 1.9362f, 16.5901f, 2.2037f, 16.5131f, 2.6107f)
                lineTo(15.4946f, 7.9949f)
                lineTo(10.0207f, 7.9974f)
                lineTo(10.9869f, 2.8895f)
                close()
                moveTo(9.7369f, 9.4976f)
                lineTo(15.2109f, 9.495f)
                lineTo(14.2651f, 14.4947f)
                lineTo(8.7912f, 14.4973f)
                lineTo(9.7369f, 9.4976f)
                close()
            }
        }
        .build()
        return _numberSymbol!!
    }

private var _numberSymbol: ImageVector? = null
