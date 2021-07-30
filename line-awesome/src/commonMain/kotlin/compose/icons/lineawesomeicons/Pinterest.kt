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

public val LineAwesomeIcons.Pinterest: ImageVector
    get() {
        if (_pinterest != null) {
            return _pinterest!!
        }
        _pinterest = Builder(name = "Pinterest", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3711f, 4.0f, 4.0f, 9.3711f, 4.0f, 16.0f)
                curveTo(4.0f, 21.0859f, 7.1641f, 25.4258f, 11.6289f, 27.1758f)
                curveTo(11.5234f, 26.2266f, 11.4258f, 24.7695f, 11.668f, 23.7305f)
                curveTo(11.8867f, 22.7969f, 13.0742f, 17.7656f, 13.0742f, 17.7656f)
                curveTo(13.0742f, 17.7656f, 12.7188f, 17.0469f, 12.7188f, 15.9844f)
                curveTo(12.7188f, 14.3164f, 13.6836f, 13.0703f, 14.8867f, 13.0703f)
                curveTo(15.9102f, 13.0703f, 16.4063f, 13.8398f, 16.4063f, 14.7617f)
                curveTo(16.4063f, 15.793f, 15.75f, 17.332f, 15.4102f, 18.7578f)
                curveTo(15.1289f, 19.9531f, 16.0117f, 20.9258f, 17.1875f, 20.9258f)
                curveTo(19.3203f, 20.9258f, 20.9609f, 18.6758f, 20.9609f, 15.4297f)
                curveTo(20.9609f, 12.5586f, 18.8984f, 10.5508f, 15.9492f, 10.5508f)
                curveTo(12.5352f, 10.5508f, 10.5313f, 13.1094f, 10.5313f, 15.7578f)
                curveTo(10.5313f, 16.7891f, 10.9297f, 17.8945f, 11.4258f, 18.4961f)
                curveTo(11.5234f, 18.6133f, 11.5352f, 18.7188f, 11.5078f, 18.8398f)
                curveTo(11.4141f, 19.2188f, 11.2148f, 20.0352f, 11.1758f, 20.1992f)
                curveTo(11.1211f, 20.4219f, 11.0f, 20.4688f, 10.7734f, 20.3594f)
                curveTo(9.2734f, 19.6641f, 8.3359f, 17.4727f, 8.3359f, 15.7109f)
                curveTo(8.3359f, 11.9258f, 11.0859f, 8.4492f, 16.2656f, 8.4492f)
                curveTo(20.4297f, 8.4492f, 23.6641f, 11.4141f, 23.6641f, 15.3828f)
                curveTo(23.6641f, 19.5156f, 21.0547f, 22.8438f, 17.4375f, 22.8438f)
                curveTo(16.2227f, 22.8438f, 15.0781f, 22.2148f, 14.6875f, 21.4688f)
                curveTo(14.6875f, 21.4688f, 14.0859f, 23.7578f, 13.9375f, 24.3203f)
                curveTo(13.668f, 25.3633f, 12.9375f, 26.668f, 12.4453f, 27.4648f)
                curveTo(13.5703f, 27.8125f, 14.7617f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6289f, 28.0f, 28.0f, 22.6289f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3711f, 22.6289f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pinterest!!
    }

private var _pinterest: ImageVector? = null
