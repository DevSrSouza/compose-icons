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

public val FilledGroup.WeatherHailNight: ImageVector
    get() {
        if (_weatherHailNight != null) {
            return _weatherHailNight!!
        }
        _weatherHailNight = Builder(name = "WeatherHailNight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 20.0f)
                curveTo(13.5523f, 20.0f, 14.0f, 20.4477f, 14.0f, 21.0f)
                curveTo(14.0f, 21.5523f, 13.5523f, 22.0f, 13.0f, 22.0f)
                curveTo(12.4477f, 22.0f, 12.0f, 21.5523f, 12.0f, 21.0f)
                curveTo(12.0f, 20.4477f, 12.4477f, 20.0f, 13.0f, 20.0f)
                close()
                moveTo(9.5f, 19.0f)
                curveTo(10.0523f, 19.0f, 10.5f, 19.4477f, 10.5f, 20.0f)
                curveTo(10.5f, 20.5523f, 10.0523f, 21.0f, 9.5f, 21.0f)
                curveTo(8.9477f, 21.0f, 8.5f, 20.5523f, 8.5f, 20.0f)
                curveTo(8.5f, 19.4477f, 8.9477f, 19.0f, 9.5f, 19.0f)
                close()
                moveTo(16.5f, 19.0f)
                curveTo(17.0523f, 19.0f, 17.5f, 19.4477f, 17.5f, 20.0f)
                curveTo(17.5f, 20.5523f, 17.0523f, 21.0f, 16.5f, 21.0f)
                curveTo(15.9477f, 21.0f, 15.5f, 20.5523f, 15.5f, 20.0f)
                curveTo(15.5f, 19.4477f, 15.9477f, 19.0f, 16.5f, 19.0f)
                close()
                moveTo(13.0017f, 6.0089f)
                curveTo(16.1702f, 6.0089f, 17.9677f, 8.1062f, 18.2291f, 10.639f)
                lineTo(18.3091f, 10.639f)
                curveTo(20.3481f, 10.639f, 22.0011f, 12.2878f, 22.0011f, 14.3216f)
                curveTo(22.0011f, 16.3554f, 20.3481f, 18.0041f, 18.3091f, 18.0041f)
                horizontalLineTo(7.6943f)
                curveTo(5.6552f, 18.0041f, 4.0022f, 16.3554f, 4.0022f, 14.3216f)
                curveTo(4.0022f, 12.2878f, 5.6552f, 10.639f, 7.6943f, 10.639f)
                lineTo(7.7743f, 10.639f)
                curveTo(8.0372f, 8.0896f, 9.8332f, 6.0089f, 13.0017f, 6.0089f)
                close()
                moveTo(6.589f, 2.0011f)
                curveTo(7.384f, 2.0438f, 8.156f, 2.2729f, 8.852f, 2.6748f)
                curveTo(9.9066f, 3.2836f, 10.6601f, 4.2137f, 11.0604f, 5.27f)
                curveTo(9.076f, 5.8326f, 7.656f, 7.2716f, 7.0663f, 9.2165f)
                lineTo(6.997f, 9.4622f)
                lineTo(6.9393f, 9.7001f)
                lineTo(6.7332f, 9.7385f)
                curveTo(5.5896f, 9.9788f, 4.5983f, 10.6393f, 3.9293f, 11.553f)
                curveTo(3.8777f, 11.5269f, 3.8261f, 11.4983f, 3.7748f, 11.4687f)
                curveTo(3.1173f, 11.089f, 2.5592f, 10.5736f, 2.1327f, 9.9543f)
                curveTo(1.8532f, 9.5484f, 2.034f, 8.9878f, 2.4981f, 8.8218f)
                curveTo(4.1405f, 8.2339f, 5.0254f, 7.5724f, 5.5315f, 6.6062f)
                curveTo(6.0843f, 5.5511f, 6.1864f, 4.4321f, 5.8194f, 2.9288f)
                curveTo(5.7001f, 2.4397f, 6.0863f, 1.9741f, 6.589f, 2.0011f)
                close()
            }
        }
        .build()
        return _weatherHailNight!!
    }

private var _weatherHailNight: ImageVector? = null
