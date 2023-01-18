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

public val FilledGroup.WeatherPartlyCloudyNight: ImageVector
    get() {
        if (_weatherPartlyCloudyNight != null) {
            return _weatherPartlyCloudyNight!!
        }
        _weatherPartlyCloudyNight = Builder(name = "WeatherPartlyCloudyNight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0017f, 8.0128f)
                curveTo(16.1702f, 8.0128f, 17.9677f, 10.1101f, 18.2291f, 12.6429f)
                lineTo(18.3091f, 12.6429f)
                curveTo(20.3481f, 12.6429f, 22.0011f, 14.2917f, 22.0011f, 16.3255f)
                curveTo(22.0011f, 18.3593f, 20.3481f, 20.008f, 18.3091f, 20.008f)
                horizontalLineTo(7.6943f)
                curveTo(5.6552f, 20.008f, 4.0022f, 18.3593f, 4.0022f, 16.3255f)
                curveTo(4.0022f, 14.2917f, 5.6552f, 12.6429f, 7.6943f, 12.6429f)
                lineTo(7.7743f, 12.6429f)
                curveTo(8.0372f, 10.0935f, 9.8332f, 8.0128f, 13.0017f, 8.0128f)
                close()
                moveTo(6.589f, 4.005f)
                curveTo(7.384f, 4.0477f, 8.156f, 4.2768f, 8.852f, 4.6787f)
                curveTo(9.9066f, 5.2875f, 10.6601f, 6.2176f, 11.0604f, 7.2739f)
                curveTo(9.076f, 7.8365f, 7.656f, 9.2755f, 7.0663f, 11.2204f)
                lineTo(6.997f, 11.4661f)
                lineTo(6.9393f, 11.704f)
                lineTo(6.7332f, 11.7424f)
                curveTo(5.5896f, 11.9827f, 4.5983f, 12.6432f, 3.9293f, 13.5569f)
                curveTo(3.8777f, 13.5308f, 3.8261f, 13.5022f, 3.7748f, 13.4726f)
                curveTo(3.1173f, 13.0929f, 2.5592f, 12.5775f, 2.1327f, 11.9583f)
                curveTo(1.8532f, 11.5523f, 2.034f, 10.9917f, 2.4981f, 10.8257f)
                curveTo(4.1405f, 10.2378f, 5.0254f, 9.5763f, 5.5315f, 8.6101f)
                curveTo(6.0843f, 7.555f, 6.1864f, 6.436f, 5.8194f, 4.9327f)
                curveTo(5.7001f, 4.4437f, 6.0863f, 3.9781f, 6.589f, 4.005f)
                close()
            }
        }
        .build()
        return _weatherPartlyCloudyNight!!
    }

private var _weatherPartlyCloudyNight: ImageVector? = null
