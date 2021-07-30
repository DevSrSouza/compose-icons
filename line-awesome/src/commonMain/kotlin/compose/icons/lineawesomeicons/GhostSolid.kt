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

public val LineAwesomeIcons.GhostSolid: ImageVector
    get() {
        if (_ghostSolid != null) {
            return _ghostSolid!!
        }
        _ghostSolid = Builder(name = "GhostSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.0625f, 3.0f, 12.5703f, 3.5078f, 11.5f, 4.3438f)
                curveTo(10.4297f, 5.1797f, 9.8125f, 6.3047f, 9.375f, 7.3438f)
                curveTo(8.9375f, 8.3828f, 8.6563f, 9.3789f, 8.375f, 10.0938f)
                curveTo(8.0938f, 10.8086f, 7.8594f, 11.0859f, 7.6563f, 11.1563f)
                curveTo(4.8281f, 12.1602f, 3.0f, 14.8633f, 3.0f, 18.0f)
                lineTo(3.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                curveTo(5.3477f, 19.0f, 6.0039f, 19.2813f, 6.3125f, 19.5313f)
                curveTo(6.6211f, 19.7813f, 6.7422f, 20.0664f, 6.8125f, 20.5625f)
                curveTo(6.8828f, 21.0586f, 6.8477f, 21.6641f, 6.9375f, 22.3438f)
                curveTo(6.9844f, 22.6836f, 7.0547f, 23.0664f, 7.2813f, 23.4375f)
                curveTo(7.5078f, 23.8086f, 7.918f, 24.1289f, 8.375f, 24.2813f)
                curveTo(9.4336f, 24.6328f, 10.1133f, 24.8555f, 10.5313f, 25.0938f)
                curveTo(10.9492f, 25.332f, 11.1992f, 25.5469f, 11.5313f, 26.25f)
                curveTo(11.8477f, 26.918f, 12.2734f, 27.6484f, 13.0313f, 28.1875f)
                curveTo(13.7891f, 28.7266f, 14.8086f, 29.0156f, 16.0938f, 29.0f)
                curveTo(18.1953f, 28.9727f, 19.4492f, 27.8867f, 20.0938f, 26.9375f)
                curveTo(20.418f, 26.4609f, 20.6445f, 26.0508f, 20.8438f, 25.7813f)
                curveTo(21.043f, 25.5117f, 21.1641f, 25.4063f, 21.375f, 25.3438f)
                curveTo(22.7305f, 24.9375f, 23.6055f, 24.25f, 24.0938f, 23.4688f)
                curveTo(24.582f, 22.6875f, 24.6758f, 21.9219f, 24.8125f, 21.4063f)
                curveTo(24.9492f, 20.8906f, 25.0469f, 20.6875f, 25.375f, 20.4688f)
                curveTo(25.7031f, 20.25f, 26.4531f, 20.0f, 28.0f, 20.0f)
                lineTo(29.0f, 20.0f)
                lineTo(29.0f, 19.0f)
                curveTo(29.0f, 17.6211f, 29.0469f, 16.0156f, 28.4375f, 14.5f)
                curveTo(27.8281f, 12.9844f, 26.4414f, 11.6445f, 24.1563f, 11.125f)
                curveTo(24.1328f, 11.1211f, 24.1055f, 11.1328f, 24.0f, 11.0f)
                curveTo(23.8945f, 10.8672f, 23.7344f, 10.6016f, 23.5938f, 10.25f)
                curveTo(23.3125f, 9.5508f, 23.043f, 8.5273f, 22.5938f, 7.4688f)
                curveTo(22.1445f, 6.4102f, 21.5039f, 5.2695f, 20.4375f, 4.4063f)
                curveTo(19.3711f, 3.543f, 17.9063f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(17.5391f, 5.0f, 18.4805f, 5.3945f, 19.1875f, 5.9688f)
                curveTo(19.8945f, 6.543f, 20.3672f, 7.3477f, 20.75f, 8.25f)
                curveTo(21.1328f, 9.1523f, 21.4023f, 10.1289f, 21.75f, 11.0f)
                curveTo(21.9219f, 11.4336f, 22.1094f, 11.8398f, 22.4063f, 12.2188f)
                curveTo(22.7031f, 12.5977f, 23.1367f, 12.9688f, 23.6875f, 13.0938f)
                curveTo(25.4883f, 13.5039f, 26.1563f, 14.2422f, 26.5625f, 15.25f)
                curveTo(26.8711f, 16.0156f, 26.8789f, 17.0664f, 26.9063f, 18.0938f)
                curveTo(25.7969f, 18.1875f, 24.8867f, 18.3867f, 24.25f, 18.8125f)
                curveTo(23.4063f, 19.3789f, 23.0508f, 20.25f, 22.875f, 20.9063f)
                curveTo(22.6992f, 21.5625f, 22.6328f, 22.043f, 22.4063f, 22.4063f)
                curveTo(22.1797f, 22.7695f, 21.8086f, 23.1289f, 20.7813f, 23.4375f)
                curveTo(20.0703f, 23.6523f, 19.5586f, 24.1406f, 19.2188f, 24.5938f)
                curveTo(18.8789f, 25.0469f, 18.6758f, 25.4609f, 18.4375f, 25.8125f)
                curveTo(17.9609f, 26.5156f, 17.6172f, 26.9805f, 16.0625f, 27.0f)
                curveTo(15.0781f, 27.0117f, 14.5508f, 26.8203f, 14.1875f, 26.5625f)
                curveTo(13.8242f, 26.3047f, 13.5586f, 25.9297f, 13.3125f, 25.4063f)
                curveTo(12.8672f, 24.4609f, 12.2695f, 23.7656f, 11.5313f, 23.3438f)
                curveTo(10.793f, 22.9219f, 10.0234f, 22.7148f, 9.0f, 22.375f)
                curveTo(8.9922f, 22.3594f, 8.9336f, 22.2852f, 8.9063f, 22.0938f)
                curveTo(8.8555f, 21.7109f, 8.8867f, 21.0352f, 8.7813f, 20.2813f)
                curveTo(8.6758f, 19.5273f, 8.3672f, 18.6133f, 7.5625f, 17.9688f)
                curveTo(7.0f, 17.5156f, 6.1953f, 17.2891f, 5.25f, 17.1563f)
                curveTo(5.543f, 15.2305f, 6.5547f, 13.6563f, 8.3125f, 13.0313f)
                curveTo(9.375f, 12.6563f, 9.8984f, 11.7305f, 10.25f, 10.8438f)
                curveTo(10.6016f, 9.957f, 10.8516f, 8.9688f, 11.2188f, 8.0938f)
                curveTo(11.5859f, 7.2188f, 12.0195f, 6.4805f, 12.7188f, 5.9375f)
                curveTo(13.418f, 5.3945f, 14.4023f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveTo(12.4492f, 9.0f, 12.0f, 9.6719f, 12.0f, 10.5f)
                curveTo(12.0f, 11.3281f, 12.4492f, 12.0f, 13.0f, 12.0f)
                curveTo(13.5508f, 12.0f, 14.0f, 11.3281f, 14.0f, 10.5f)
                curveTo(14.0f, 9.6719f, 13.5508f, 9.0f, 13.0f, 9.0f)
                close()
                moveTo(17.0f, 9.0f)
                curveTo(16.4492f, 9.0f, 16.0f, 9.6719f, 16.0f, 10.5f)
                curveTo(16.0f, 11.3281f, 16.4492f, 12.0f, 17.0f, 12.0f)
                curveTo(17.5508f, 12.0f, 18.0f, 11.3281f, 18.0f, 10.5f)
                curveTo(18.0f, 9.6719f, 17.5508f, 9.0f, 17.0f, 9.0f)
                close()
            }
        }
        .build()
        return _ghostSolid!!
    }

private var _ghostSolid: ImageVector? = null
