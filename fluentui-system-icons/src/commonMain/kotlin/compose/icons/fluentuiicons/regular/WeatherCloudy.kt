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

public val RegularGroup.WeatherCloudy: ImageVector
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
                moveTo(13.0017f, 8.5065f)
                curveTo(10.9304f, 8.5065f, 9.125f, 10.1397f, 9.125f, 12.3957f)
                curveTo(9.125f, 12.7532f, 8.806f, 13.0337f, 8.4408f, 13.0336f)
                lineTo(7.7503f, 13.0336f)
                curveTo(6.4893f, 13.0336f, 5.467f, 14.0349f, 5.467f, 15.2701f)
                curveTo(5.467f, 16.5052f, 6.4893f, 17.5065f, 7.7503f, 17.5065f)
                horizontalLineTo(18.2531f)
                curveTo(19.5141f, 17.5065f, 20.5363f, 16.5052f, 20.5363f, 15.2701f)
                curveTo(20.5363f, 14.0349f, 19.5141f, 13.0336f, 18.2531f, 13.0336f)
                lineTo(17.5626f, 13.0336f)
                curveTo(17.1973f, 13.0337f, 16.8784f, 12.7532f, 16.8784f, 12.3957f)
                curveTo(16.8784f, 10.1108f, 15.073f, 8.5065f, 13.0017f, 8.5065f)
                close()
                moveTo(10.0f, 4.0f)
                curveTo(11.6167f, 4.0f, 13.0491f, 4.8151f, 13.9001f, 6.0619f)
                curveTo(13.6099f, 6.0268f, 13.3101f, 6.0089f, 13.0017f, 6.0089f)
                curveTo(12.6075f, 6.0089f, 12.2275f, 6.038f, 11.863f, 6.0943f)
                curveTo(11.3348f, 5.719f, 10.6898f, 5.5f, 10.0f, 5.5f)
                curveTo(8.4332f, 5.5f, 7.0981f, 6.6298f, 6.8306f, 8.1563f)
                lineTo(6.7581f, 8.57f)
                curveTo(6.6743f, 9.0485f, 6.2588f, 9.3975f, 5.7731f, 9.3975f)
                lineTo(5.2821f, 9.3974f)
                curveTo(4.2979f, 9.3974f, 3.5f, 10.1953f, 3.5f, 11.1795f)
                curveTo(3.5f, 11.6701f, 3.6983f, 12.1144f, 4.0191f, 12.4367f)
                curveTo(3.7041f, 12.8375f, 3.4543f, 13.2919f, 3.284f, 13.7838f)
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
