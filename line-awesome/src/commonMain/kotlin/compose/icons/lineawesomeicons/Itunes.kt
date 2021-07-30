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

public val LineAwesomeIcons.Itunes: ImageVector
    get() {
        if (_itunes != null) {
            return _itunes!!
        }
        _itunes = Builder(name = "Itunes", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0488f, 5.0f)
                curveTo(7.2548f, 5.0f, 5.0f, 7.2548f, 5.0f, 10.0488f)
                lineTo(5.0f, 21.9512f)
                curveTo(5.0f, 24.7452f, 7.2548f, 27.0f, 10.0488f, 27.0f)
                lineTo(21.9512f, 27.0f)
                curveTo(24.7502f, 27.0f, 27.0f, 24.7452f, 27.0f, 21.9512f)
                lineTo(27.0f, 10.0488f)
                curveTo(27.0f, 7.2548f, 24.7452f, 5.0f, 21.9512f, 5.0f)
                lineTo(10.0488f, 5.0f)
                close()
                moveTo(15.9805f, 7.0f)
                curveTo(20.9505f, 7.0f, 24.9805f, 11.03f, 24.9805f, 16.0f)
                curveTo(24.9805f, 20.97f, 20.9505f, 25.0f, 15.9805f, 25.0f)
                curveTo(11.0105f, 25.0f, 6.9805f, 20.97f, 6.9805f, 16.0f)
                curveTo(6.9805f, 11.03f, 11.0105f, 7.0f, 15.9805f, 7.0f)
                close()
                moveTo(15.9805f, 8.0254f)
                curveTo(11.5685f, 8.0254f, 8.0f, 11.6028f, 8.0f, 16.0098f)
                curveTo(8.0f, 20.4168f, 11.5685f, 24.0f, 15.9805f, 24.0f)
                curveTo(20.3925f, 24.0f, 23.9648f, 20.4236f, 23.9648f, 16.0156f)
                curveTo(23.9648f, 11.6036f, 20.3885f, 8.0254f, 15.9805f, 8.0254f)
                close()
                moveTo(19.3164f, 11.0f)
                curveTo(19.5784f, 10.982f, 19.7305f, 11.1384f, 19.7305f, 11.4004f)
                curveTo(19.7265f, 19.2364f, 19.7486f, 18.5226f, 19.6836f, 18.8066f)
                curveTo(19.5366f, 19.4316f, 19.0637f, 19.7814f, 18.4297f, 19.9004f)
                curveTo(17.8737f, 20.0014f, 17.4098f, 20.0289f, 16.9648f, 19.6699f)
                curveTo(16.4228f, 19.2109f, 16.4134f, 18.4575f, 16.9004f, 17.9805f)
                curveTo(17.2864f, 17.6135f, 17.8335f, 17.5396f, 18.6465f, 17.3926f)
                curveTo(18.7845f, 17.3696f, 18.903f, 17.3377f, 19.0f, 17.2227f)
                curveTo(19.147f, 17.0577f, 19.1016f, 17.4217f, 19.1016f, 13.8027f)
                curveTo(19.1016f, 13.5457f, 18.9768f, 13.4755f, 18.7148f, 13.5215f)
                curveTo(18.5308f, 13.5535f, 14.4941f, 14.3066f, 14.4941f, 14.3066f)
                curveTo(14.2641f, 14.3576f, 14.1855f, 14.4255f, 14.1855f, 14.6875f)
                curveTo(14.1855f, 20.0195f, 14.2089f, 19.4868f, 14.1309f, 19.8398f)
                curveTo(14.0349f, 20.2528f, 13.7823f, 20.5643f, 13.4473f, 20.7383f)
                curveTo(13.0663f, 20.9493f, 12.3729f, 21.0425f, 12.0059f, 20.9785f)
                curveTo(11.0229f, 20.7945f, 10.6777f, 19.6598f, 11.3438f, 19.0078f)
                curveTo(11.7297f, 18.6408f, 12.2768f, 18.5669f, 13.0898f, 18.4199f)
                curveTo(13.2278f, 18.3969f, 13.3464f, 18.365f, 13.4434f, 18.25f)
                curveTo(13.6734f, 17.988f, 13.4845f, 12.7074f, 13.5625f, 12.4004f)
                curveTo(13.5805f, 12.2814f, 13.6307f, 12.1814f, 13.7227f, 12.1074f)
                curveTo(13.8187f, 12.0294f, 13.9893f, 11.9824f, 14.0313f, 11.9824f)
                curveTo(18.6702f, 11.1094f, 19.2344f, 11.0f, 19.3164f, 11.0f)
                close()
            }
        }
        .build()
        return _itunes!!
    }

private var _itunes: ImageVector? = null
