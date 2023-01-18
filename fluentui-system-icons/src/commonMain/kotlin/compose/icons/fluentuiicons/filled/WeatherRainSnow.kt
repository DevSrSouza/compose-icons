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

public val FilledGroup.WeatherRainSnow: ImageVector
    get() {
        if (_weatherRainSnow != null) {
            return _weatherRainSnow!!
        }
        _weatherRainSnow = Builder(name = "WeatherRainSnow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5338f, 17.5531f)
                curveTo(14.948f, 17.5531f, 15.2838f, 17.8889f, 15.2838f, 18.3031f)
                curveTo(15.2838f, 18.7173f, 14.948f, 19.0531f, 14.5338f, 19.0531f)
                curveTo(14.1196f, 19.0531f, 13.7838f, 18.7173f, 13.7838f, 18.3031f)
                curveTo(13.7838f, 17.8889f, 14.1196f, 17.5531f, 14.5338f, 17.5531f)
                close()
                moveTo(11.9999f, 4.001f)
                curveTo(15.1685f, 4.001f, 16.9659f, 6.0983f, 17.2273f, 8.6311f)
                lineTo(17.3073f, 8.6311f)
                curveTo(19.3464f, 8.6311f, 20.9994f, 10.2798f, 20.9994f, 12.3136f)
                curveTo(20.9994f, 14.3474f, 19.3464f, 15.9962f, 17.3073f, 15.9962f)
                lineTo(16.0002f, 15.9972f)
                curveTo(15.9053f, 16.3026f, 15.6204f, 16.5244f, 15.2838f, 16.5244f)
                curveTo(14.9472f, 16.5244f, 14.6623f, 16.3026f, 14.5674f, 15.9972f)
                lineTo(8.9875f, 15.996f)
                lineTo(7.4052f, 18.6247f)
                curveTo(7.1981f, 18.9835f, 6.7394f, 19.1064f, 6.3806f, 18.8993f)
                curveTo(6.0518f, 18.7094f, 5.9211f, 18.3082f, 6.0612f, 17.9663f)
                lineTo(6.1061f, 17.8747f)
                lineTo(7.2555f, 15.996f)
                lineTo(6.6926f, 15.9962f)
                curveTo(4.6535f, 15.9962f, 3.0005f, 14.3474f, 3.0005f, 12.3136f)
                curveTo(3.0005f, 10.2798f, 4.6535f, 8.6311f, 6.6926f, 8.6311f)
                lineTo(6.7725f, 8.6311f)
                curveTo(7.0355f, 6.0816f, 8.8314f, 4.001f, 11.9999f, 4.001f)
                close()
                moveTo(11.5777f, 16.7048f)
                curveTo(11.9065f, 16.8947f, 12.0372f, 17.2959f, 11.8972f, 17.6378f)
                lineTo(11.8522f, 17.7294f)
                lineTo(11.2955f, 18.6253f)
                curveTo(11.0884f, 18.984f, 10.6297f, 19.1069f, 10.2709f, 18.8998f)
                curveTo(9.9421f, 18.71f, 9.8114f, 18.3087f, 9.9515f, 17.9668f)
                lineTo(9.9964f, 17.8753f)
                lineTo(10.5532f, 16.9794f)
                curveTo(10.7603f, 16.6206f, 11.219f, 16.4977f, 11.5777f, 16.7048f)
                close()
                moveTo(17.0332f, 16.8031f)
                curveTo(17.4475f, 16.8031f, 17.7832f, 17.1389f, 17.7832f, 17.5531f)
                curveTo(17.7832f, 17.9673f, 17.4475f, 18.3031f, 17.0332f, 18.3031f)
                curveTo(16.619f, 18.3031f, 16.2832f, 17.9673f, 16.2832f, 17.5531f)
                curveTo(16.2832f, 17.1389f, 16.619f, 16.8031f, 17.0332f, 16.8031f)
                close()
            }
        }
        .build()
        return _weatherRainSnow!!
    }

private var _weatherRainSnow: ImageVector? = null
