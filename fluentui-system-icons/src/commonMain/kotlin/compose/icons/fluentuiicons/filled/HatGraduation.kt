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

public val FilledGroup.HatGraduation: ImageVector
    get() {
        if (_hatGraduation != null) {
            return _hatGraduation!!
        }
        _hatGraduation = Builder(name = "HatGraduation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 17.75f)
                verticalLineTo(13.9843f)
                lineTo(9.0602f, 16.6369f)
                curveTo(10.8463f, 17.8039f, 13.1537f, 17.8039f, 14.9398f, 16.6369f)
                lineTo(19.0f, 13.9843f)
                verticalLineTo(17.75f)
                curveTo(19.0f, 17.9123f, 18.9474f, 18.0702f, 18.85f, 18.2f)
                lineTo(18.8489f, 18.2014f)
                lineTo(18.8477f, 18.2031f)
                lineTo(18.8446f, 18.2071f)
                lineTo(18.8364f, 18.2178f)
                lineTo(18.8243f, 18.2331f)
                lineTo(18.8111f, 18.2496f)
                curveTo(18.7904f, 18.2752f, 18.7619f, 18.3095f, 18.7253f, 18.3513f)
                curveTo(18.6522f, 18.4348f, 18.5469f, 18.5484f, 18.4081f, 18.6817f)
                curveTo(18.1305f, 18.9481f, 17.7176f, 19.2948f, 17.1587f, 19.6387f)
                curveTo(16.0359f, 20.3297f, 14.3387f, 21.0f, 12.0f, 21.0f)
                curveTo(9.6613f, 21.0f, 7.9641f, 20.3297f, 6.8413f, 19.6387f)
                curveTo(6.2824f, 19.2948f, 5.8695f, 18.9481f, 5.5919f, 18.6817f)
                curveTo(5.4531f, 18.5484f, 5.3478f, 18.4348f, 5.2747f, 18.3513f)
                curveTo(5.2381f, 18.3095f, 5.2096f, 18.2752f, 5.1888f, 18.2496f)
                curveTo(5.1785f, 18.2367f, 5.1701f, 18.2261f, 5.1636f, 18.2178f)
                lineTo(5.1554f, 18.2071f)
                lineTo(5.1523f, 18.2031f)
                lineTo(5.1511f, 18.2014f)
                curveTo(5.0537f, 18.0716f, 5.0f, 17.9123f, 5.0f, 17.75f)
                close()
                moveTo(22.1602f, 10.1279f)
                lineTo(14.1194f, 15.3812f)
                curveTo(12.8317f, 16.2225f, 11.1683f, 16.2225f, 9.8806f, 15.3812f)
                lineTo(3.0f, 10.8859f)
                lineTo(3.0f, 16.25f)
                curveTo(3.0f, 16.6642f, 2.6642f, 17.0f, 2.25f, 17.0f)
                curveTo(1.8358f, 17.0f, 1.5f, 16.6642f, 1.5f, 16.25f)
                verticalLineTo(10.0f)
                curveTo(1.5f, 9.9122f, 1.5151f, 9.828f, 1.5428f, 9.7497f)
                curveTo(1.5145f, 9.6696f, 1.4996f, 9.5842f, 1.5f, 9.4968f)
                curveTo(1.5011f, 9.2424f, 1.6311f, 9.0059f, 1.8453f, 8.8686f)
                lineTo(9.9088f, 3.6996f)
                curveTo(11.1832f, 2.8827f, 12.8168f, 2.8827f, 14.0912f, 3.6996f)
                lineTo(22.1548f, 8.8686f)
                curveTo(22.3689f, 9.0059f, 22.4989f, 9.2424f, 22.5f, 9.4968f)
                curveTo(22.501f, 9.7194f, 22.4031f, 9.9291f, 22.236f, 10.0713f)
                curveTo(22.2121f, 10.0916f, 22.1868f, 10.1105f, 22.1602f, 10.1279f)
                close()
            }
        }
        .build()
        return _hatGraduation!!
    }

private var _hatGraduation: ImageVector? = null
