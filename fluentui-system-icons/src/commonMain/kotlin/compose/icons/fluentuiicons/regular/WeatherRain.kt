package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.WeatherRain: ImageVector
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
                lineTo(15.1428f, 18.6305f)
                curveTo(14.9357f, 18.9892f, 14.477f, 19.1121f, 14.1183f, 18.905f)
                curveTo(13.7894f, 18.7151f, 13.6588f, 18.3139f, 13.7988f, 17.972f)
                lineTo(13.8437f, 17.8805f)
                lineTo(14.9925f, 15.996f)
                horizontalLineTo(12.8565f)
                lineTo(11.2746f, 18.6305f)
                curveTo(11.0675f, 18.9892f, 10.6088f, 19.1121f, 10.2501f, 18.905f)
                curveTo(9.9212f, 18.7151f, 9.7906f, 18.3139f, 9.9306f, 17.972f)
                lineTo(9.9755f, 17.8805f)
                lineTo(11.1245f, 15.996f)
                horizontalLineTo(8.9875f)
                lineTo(7.4064f, 18.6305f)
                curveTo(7.1993f, 18.9892f, 6.7406f, 19.1121f, 6.3818f, 18.905f)
                curveTo(6.053f, 18.7151f, 5.9223f, 18.3139f, 6.0624f, 17.972f)
                lineTo(6.1073f, 17.8805f)
                lineTo(7.2555f, 15.996f)
                lineTo(6.6926f, 15.9962f)
                curveTo(4.6535f, 15.9962f, 3.0005f, 14.3474f, 3.0005f, 12.3136f)
                curveTo(3.0005f, 10.2798f, 4.6535f, 8.6311f, 6.6926f, 8.6311f)
                lineTo(6.7725f, 8.6311f)
                curveTo(7.0355f, 6.0816f, 8.8314f, 4.001f, 11.9999f, 4.001f)
                close()
                moveTo(11.9999f, 5.4986f)
                curveTo(9.9286f, 5.4986f, 8.1232f, 7.1318f, 8.1232f, 9.3878f)
                curveTo(8.1232f, 9.7452f, 7.8043f, 10.0257f, 7.4391f, 10.0257f)
                lineTo(6.7485f, 10.0257f)
                curveTo(5.4875f, 10.0257f, 4.4653f, 11.027f, 4.4653f, 12.2621f)
                curveTo(4.4653f, 13.4973f, 5.4875f, 14.4986f, 6.7485f, 14.4986f)
                horizontalLineTo(17.2514f)
                curveTo(18.5124f, 14.4986f, 19.5346f, 13.4973f, 19.5346f, 12.2621f)
                curveTo(19.5346f, 11.027f, 18.5124f, 10.0257f, 17.2514f, 10.0257f)
                lineTo(16.5608f, 10.0257f)
                curveTo(16.1956f, 10.0257f, 15.8766f, 9.7452f, 15.8766f, 9.3878f)
                curveTo(15.8766f, 7.1029f, 14.0713f, 5.4986f, 11.9999f, 5.4986f)
                close()
            }
        }
        .build()
        return _weatherRain!!
    }

private var _weatherRain: ImageVector? = null
