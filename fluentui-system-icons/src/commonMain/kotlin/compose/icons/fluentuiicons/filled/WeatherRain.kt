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

public val FilledGroup.WeatherRain: ImageVector
    get() {
        if (_weatherRain != null) {
            return _weatherRain!!
        }
        _weatherRain = Builder(name = "WeatherRain", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 4.001f)
                curveTo(15.1685f, 4.001f, 16.9659f, 6.0983f, 17.2273f, 8.6311f)
                lineTo(17.3073f, 8.6311f)
                curveTo(19.3464f, 8.6311f, 20.9994f, 10.2798f, 20.9994f, 12.3136f)
                curveTo(20.9994f, 14.3474f, 19.3464f, 15.9962f, 17.3073f, 15.9962f)
                lineTo(16.7245f, 15.996f)
                lineTo(15.1422f, 18.6327f)
                curveTo(14.935f, 18.9914f, 14.4764f, 19.1143f, 14.1176f, 18.9072f)
                curveTo(13.7888f, 18.7174f, 13.6581f, 18.3161f, 13.7982f, 17.9743f)
                lineTo(13.8431f, 17.8827f)
                lineTo(14.9925f, 15.996f)
                horizontalLineTo(12.8565f)
                lineTo(11.2739f, 18.6327f)
                curveTo(11.0668f, 18.9914f, 10.6082f, 19.1143f, 10.2494f, 18.9072f)
                curveTo(9.9206f, 18.7174f, 9.7899f, 18.3161f, 9.93f, 17.9743f)
                lineTo(9.9749f, 17.8827f)
                lineTo(11.1245f, 15.996f)
                horizontalLineTo(8.9875f)
                lineTo(7.4057f, 18.6327f)
                curveTo(7.1986f, 18.9914f, 6.7399f, 19.1143f, 6.3812f, 18.9072f)
                curveTo(6.0524f, 18.7174f, 5.9217f, 18.3161f, 6.0617f, 17.9743f)
                lineTo(6.1067f, 17.8827f)
                lineTo(7.2555f, 15.996f)
                lineTo(6.6926f, 15.9962f)
                curveTo(4.6535f, 15.9962f, 3.0005f, 14.3474f, 3.0005f, 12.3136f)
                curveTo(3.0005f, 10.2798f, 4.6535f, 8.6311f, 6.6926f, 8.6311f)
                lineTo(6.7725f, 8.6311f)
                curveTo(7.0355f, 6.0816f, 8.8314f, 4.001f, 11.9999f, 4.001f)
                close()
            }
        }
        .build()
        return _weatherRain!!
    }

private var _weatherRain: ImageVector? = null
