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

public val FilledGroup.WeatherCloudy: ImageVector
    get() {
        if (_weatherCloudy != null) {
            return _weatherCloudy!!
        }
        _weatherCloudy = Builder(name = "WeatherCloudy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0017f, 7.0089f)
                curveTo(16.1702f, 7.0089f, 17.9677f, 9.1062f, 18.2291f, 11.639f)
                lineTo(18.3091f, 11.639f)
                curveTo(20.3481f, 11.639f, 22.0011f, 13.2878f, 22.0011f, 15.3216f)
                curveTo(22.0011f, 17.3554f, 20.3481f, 19.0041f, 18.3091f, 19.0041f)
                horizontalLineTo(7.6943f)
                curveTo(5.6552f, 19.0041f, 4.0022f, 17.3554f, 4.0022f, 15.3216f)
                curveTo(4.0022f, 13.2878f, 5.6552f, 11.639f, 7.6943f, 11.639f)
                lineTo(7.7743f, 11.639f)
                curveTo(8.0372f, 9.0896f, 9.8332f, 7.0089f, 13.0017f, 7.0089f)
                close()
                moveTo(10.0f, 4.0f)
                curveTo(11.6167f, 4.0f, 13.0491f, 4.8151f, 13.9001f, 6.0619f)
                curveTo(13.6099f, 6.0268f, 13.3101f, 6.0089f, 13.0017f, 6.0089f)
                curveTo(10.0079f, 6.0089f, 7.831f, 7.6862f, 7.0647f, 10.222f)
                lineTo(6.997f, 10.4622f)
                lineTo(6.9393f, 10.7001f)
                lineTo(6.7332f, 10.7385f)
                curveTo(5.124f, 11.0767f, 3.8162f, 12.2468f, 3.284f, 13.7838f)
                curveTo(2.5036f, 13.1842f, 2.0f, 12.2407f, 2.0f, 11.1795f)
                curveTo(2.0f, 9.4294f, 3.3698f, 7.9992f, 5.0958f, 7.9026f)
                lineTo(5.3531f, 7.8974f)
                curveTo(5.7423f, 5.6761f, 7.6817f, 4.0f, 10.0f, 4.0f)
                close()
            }
        }
        .build()
        return _weatherCloudy!!
    }

private var _weatherCloudy: ImageVector? = null
