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

public val LineAwesomeIcons.FirstOrder: ImageVector
    get() {
        if (_firstOrder != null) {
            return _firstOrder!!
        }
        _firstOrder = Builder(name = "FirstOrder", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(4.0f, 9.0f)
                lineTo(4.0f, 23.0f)
                lineTo(16.0f, 30.0f)
                lineTo(28.0f, 23.0f)
                lineTo(28.0f, 9.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(16.0f, 3.0f)
                lineTo(27.0f, 9.4883f)
                lineTo(27.0f, 22.4883f)
                lineTo(16.0f, 29.0f)
                lineTo(5.0f, 22.4883f)
                lineTo(5.0f, 9.4883f)
                lineTo(16.0f, 3.0f)
                close()
                moveTo(16.0f, 4.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 22.0f)
                lineTo(16.0f, 28.0f)
                lineTo(26.0f, 22.0f)
                lineTo(26.0f, 10.0f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.9473f)
                curveTo(20.956f, 6.9473f, 25.0f, 10.991f, 25.0f, 16.0f)
                curveTo(25.0f, 20.988f, 20.956f, 25.043f, 16.0f, 25.043f)
                curveTo(11.022f, 25.043f, 7.0f, 20.988f, 7.0f, 16.0f)
                curveTo(7.0f, 10.991f, 11.022f, 6.9473f, 16.0f, 6.9473f)
                close()
                moveTo(16.002f, 8.0f)
                curveTo(15.646f, 8.0f, 15.2688f, 8.0291f, 14.9238f, 8.0781f)
                lineTo(15.1113f, 11.4609f)
                lineTo(14.0039f, 8.2461f)
                curveTo(13.2919f, 8.4341f, 12.6191f, 8.7219f, 11.9961f, 9.0879f)
                lineTo(13.4805f, 12.1738f)
                lineTo(11.2148f, 9.6113f)
                curveTo(10.6408f, 10.0563f, 10.1169f, 10.5711f, 9.6719f, 11.1641f)
                lineTo(12.2129f, 13.4492f)
                lineTo(9.1484f, 11.9551f)
                curveTo(8.7924f, 12.5681f, 8.4944f, 13.2409f, 8.3164f, 13.9629f)
                lineTo(11.541f, 15.0996f)
                lineTo(8.1289f, 14.8926f)
                curveTo(8.0799f, 15.2486f, 8.0605f, 15.624f, 8.0605f, 16.0f)
                curveTo(8.0605f, 16.376f, 8.0909f, 16.7319f, 8.1309f, 17.0879f)
                lineTo(11.5313f, 16.8906f)
                lineTo(8.3184f, 18.0273f)
                curveTo(8.4964f, 18.7393f, 8.7824f, 19.4119f, 9.1484f, 20.0449f)
                lineTo(12.2148f, 18.5508f)
                lineTo(9.6621f, 20.8242f)
                curveTo(10.1061f, 21.4082f, 10.6218f, 21.9422f, 11.2148f, 22.3672f)
                lineTo(13.4707f, 19.8164f)
                lineTo(11.9863f, 22.9023f)
                curveTo(12.5993f, 23.2673f, 13.2721f, 23.554f, 13.9941f, 23.752f)
                lineTo(15.1113f, 20.5098f)
                lineTo(14.9121f, 23.9219f)
                curveTo(15.2681f, 23.9709f, 15.646f, 24.0f, 16.002f, 24.0f)
                curveTo(16.377f, 24.0f, 16.7329f, 23.9699f, 17.0879f, 23.9199f)
                lineTo(16.8887f, 20.4688f)
                lineTo(18.0254f, 23.7422f)
                curveTo(18.7374f, 23.5452f, 19.4102f, 23.2686f, 20.0332f, 22.8926f)
                lineTo(18.5508f, 19.8164f)
                lineTo(20.8047f, 22.3672f)
                curveTo(21.3987f, 21.9222f, 21.9127f, 21.4072f, 22.3477f, 20.8242f)
                lineTo(19.8066f, 18.5508f)
                lineTo(22.873f, 20.0332f)
                curveTo(23.229f, 19.4102f, 23.5251f, 18.7398f, 23.7031f, 18.0078f)
                lineTo(20.4902f, 16.8906f)
                lineTo(23.8828f, 17.0879f)
                curveTo(23.9318f, 16.7319f, 23.9512f, 16.376f, 23.9512f, 16.0f)
                curveTo(23.9512f, 15.624f, 23.9318f, 15.2486f, 23.8828f, 14.8926f)
                lineTo(20.4805f, 15.0996f)
                lineTo(23.6934f, 13.9727f)
                curveTo(23.5054f, 13.2607f, 23.2393f, 12.5681f, 22.8633f, 11.9551f)
                lineTo(19.7988f, 13.4473f)
                lineTo(22.3398f, 11.1641f)
                curveTo(21.8948f, 10.5801f, 21.3806f, 10.0563f, 20.8066f, 9.6113f)
                lineTo(18.543f, 12.1719f)
                lineTo(20.0156f, 9.0977f)
                curveTo(19.4026f, 8.7327f, 18.7298f, 8.4441f, 18.0078f, 8.2461f)
                lineTo(16.8906f, 11.4805f)
                lineTo(17.0898f, 8.0781f)
                curveTo(16.7338f, 8.0191f, 16.378f, 8.0f, 16.002f, 8.0f)
                close()
            }
        }
        .build()
        return _firstOrder!!
    }

private var _firstOrder: ImageVector? = null
