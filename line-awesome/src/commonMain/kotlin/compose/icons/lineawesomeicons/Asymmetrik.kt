package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Asymmetrik: ImageVector
    get() {
        if (_asymmetrik != null) {
            return _asymmetrik!!
        }
        _asymmetrik = Builder(name = "Asymmetrik", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0898f, 6.084f)
                curveTo(12.6529f, 5.9904f, 6.6646f, 7.3569f, 2.0f, 10.0f)
                curveTo(4.682f, 8.955f, 7.3834f, 8.1995f, 10.2754f, 7.5625f)
                curveTo(13.9434f, 6.7545f, 17.7113f, 6.3268f, 21.0313f, 6.8418f)
                curveTo(28.4443f, 7.9988f, 30.5999f, 13.0424f, 25.8359f, 18.1094f)
                curveTo(25.3399f, 18.6344f, 24.6613f, 19.2118f, 24.0293f, 19.6738f)
                lineTo(16.8516f, 9.1016f)
                lineTo(7.6445f, 22.5059f)
                lineTo(7.5527f, 22.4707f)
                curveTo(3.2737f, 20.9937f, 3.2114f, 18.4811f, 5.9824f, 15.3281f)
                curveTo(6.9934f, 14.2481f, 8.3587f, 13.3429f, 9.8477f, 12.5039f)
                curveTo(10.8397f, 11.9449f, 11.8945f, 11.4038f, 12.9785f, 11.0098f)
                curveTo(9.8135f, 11.9968f, 6.8969f, 13.5813f, 5.0059f, 15.5273f)
                curveTo(3.6589f, 16.9173f, 3.015f, 18.3036f, 3.0f, 19.5586f)
                curveTo(2.976f, 21.2656f, 4.8364f, 22.5509f, 7.0234f, 23.4219f)
                lineTo(5.2754f, 26.0f)
                lineTo(10.2129f, 26.0f)
                lineTo(10.2168f, 25.9922f)
                lineTo(10.2305f, 26.0f)
                lineTo(11.3984f, 24.2266f)
                curveTo(12.4454f, 24.2666f, 13.5828f, 24.2208f, 14.6738f, 24.0938f)
                lineTo(13.5098f, 26.0f)
                lineTo(20.082f, 26.0f)
                lineTo(18.4766f, 23.3262f)
                curveTo(19.3496f, 23.0772f, 20.2335f, 22.7764f, 21.0645f, 22.4414f)
                lineTo(22.9199f, 25.2578f)
                lineTo(23.3789f, 26.0f)
                lineTo(28.3164f, 26.0f)
                lineTo(24.6563f, 20.5996f)
                curveTo(25.5553f, 20.0116f, 26.4578f, 19.2917f, 27.1328f, 18.5957f)
                curveTo(29.0188f, 16.6507f, 29.9566f, 14.7052f, 29.9766f, 12.9492f)
                curveTo(30.0156f, 9.7642f, 27.0902f, 7.2018f, 21.7422f, 6.3848f)
                curveTo(20.5692f, 6.2053f, 19.3445f, 6.1056f, 18.0898f, 6.084f)
                close()
                moveTo(16.8086f, 16.0215f)
                lineTo(17.5117f, 17.0449f)
                lineTo(20.5234f, 21.6172f)
                curveTo(19.7154f, 21.9592f, 18.8717f, 22.2628f, 18.0137f, 22.5098f)
                lineTo(16.7988f, 20.5352f)
                lineTo(15.2578f, 23.127f)
                curveTo(14.1668f, 23.29f, 13.0735f, 23.3102f, 12.0215f, 23.2813f)
                lineTo(16.8086f, 16.0215f)
                close()
            }
        }
        .build()
        return _asymmetrik!!
    }

private var _asymmetrik: ImageVector? = null
