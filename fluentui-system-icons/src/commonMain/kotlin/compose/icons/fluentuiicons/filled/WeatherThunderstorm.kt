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

public val FilledGroup.WeatherThunderstorm: ImageVector
    get() {
        if (_weatherThunderstorm != null) {
            return _weatherThunderstorm!!
        }
        _weatherThunderstorm = Builder(name = "WeatherThunderstorm", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7595f, 13.2039f)
                curveTo(14.0675f, 13.4807f, 14.0928f, 13.9549f, 13.8159f, 14.263f)
                lineTo(12.7047f, 15.4994f)
                horizontalLineTo(14.9812f)
                curveTo(15.6094f, 15.4994f, 15.9592f, 16.2253f, 15.5678f, 16.7167f)
                lineTo(12.3563f, 20.7482f)
                curveTo(12.0982f, 21.0721f, 11.6263f, 21.1256f, 11.3024f, 20.8675f)
                curveTo(10.9784f, 20.6094f, 10.925f, 20.1375f, 11.1831f, 19.8135f)
                lineTo(13.4249f, 16.9994f)
                horizontalLineTo(11.0222f)
                curveTo(10.3731f, 16.9994f, 10.0305f, 16.2308f, 10.4644f, 15.748f)
                lineTo(12.7003f, 13.2603f)
                curveTo(12.9772f, 12.9522f, 13.4514f, 12.927f, 13.7595f, 13.2039f)
                close()
                moveTo(13.0017f, 5.0089f)
                curveTo(16.1702f, 5.0089f, 17.9677f, 7.1062f, 18.2291f, 9.639f)
                lineTo(18.3091f, 9.639f)
                curveTo(20.3481f, 9.639f, 22.0011f, 11.2878f, 22.0011f, 13.3216f)
                curveTo(22.0011f, 15.3554f, 20.3481f, 17.0041f, 18.3091f, 17.0041f)
                lineTo(16.5621f, 17.0049f)
                curveTo(17.1045f, 15.8907f, 16.3096f, 14.4994f, 14.9812f, 14.4994f)
                horizontalLineTo(14.8456f)
                curveTo(15.1615f, 13.82f, 15.0142f, 12.987f, 14.428f, 12.4601f)
                curveTo(13.7091f, 11.814f, 12.6027f, 11.873f, 11.9566f, 12.5918f)
                lineTo(9.7206f, 15.0795f)
                curveTo(9.2021f, 15.6564f, 9.1588f, 16.4083f, 9.4435f, 17.0046f)
                lineTo(7.6943f, 17.0041f)
                curveTo(5.6552f, 17.0041f, 4.0022f, 15.3554f, 4.0022f, 13.3216f)
                curveTo(4.0022f, 11.2878f, 5.6552f, 9.639f, 7.6943f, 9.639f)
                lineTo(7.7743f, 9.639f)
                curveTo(8.0372f, 7.0896f, 9.8332f, 5.0089f, 13.0017f, 5.0089f)
                close()
                moveTo(10.0f, 2.0f)
                curveTo(11.6167f, 2.0f, 13.0491f, 2.8151f, 13.9001f, 4.0619f)
                curveTo(13.6099f, 4.0268f, 13.3101f, 4.0089f, 13.0017f, 4.0089f)
                curveTo(10.0079f, 4.0089f, 7.831f, 5.6862f, 7.0647f, 8.222f)
                lineTo(6.997f, 8.4622f)
                lineTo(6.9393f, 8.7001f)
                lineTo(6.7332f, 8.7385f)
                curveTo(5.124f, 9.0767f, 3.8162f, 10.2468f, 3.284f, 11.7838f)
                curveTo(2.5036f, 11.1842f, 2.0f, 10.2407f, 2.0f, 9.1795f)
                curveTo(2.0f, 7.4294f, 3.3698f, 5.9992f, 5.0958f, 5.9026f)
                lineTo(5.3531f, 5.8974f)
                curveTo(5.7423f, 3.6761f, 7.6817f, 2.0f, 10.0f, 2.0f)
                close()
            }
        }
        .build()
        return _weatherThunderstorm!!
    }

private var _weatherThunderstorm: ImageVector? = null
