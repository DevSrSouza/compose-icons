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

public val FilledGroup.WeatherMoonOff: ImageVector
    get() {
        if (_weatherMoonOff != null) {
            return _weatherMoonOff!!
        }
        _weatherMoonOff = Builder(name = "WeatherMoonOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(10.4125f, 11.4733f)
                curveTo(9.2361f, 13.6704f, 7.2214f, 15.214f, 3.4942f, 16.5481f)
                curveTo(3.0306f, 16.714f, 2.8499f, 17.274f, 3.1292f, 17.6796f)
                curveTo(3.9645f, 18.8925f, 5.0612f, 19.91f, 6.3639f, 20.6621f)
                curveTo(10.281f, 22.9237f, 15.092f, 22.2343f, 18.2229f, 19.2839f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(16.3654f, 3.3389f)
                curveTo(21.1159f, 6.0816f, 22.7652f, 12.1329f, 20.0831f, 16.9015f)
                lineTo(11.4926f, 8.3107f)
                curveTo(11.7443f, 6.7499f, 11.6444f, 5.0082f, 11.1392f, 2.9385f)
                curveTo(11.02f, 2.45f, 11.4058f, 1.9848f, 11.908f, 2.0117f)
                curveTo(13.465f, 2.0953f, 14.986f, 2.5425f, 16.3654f, 3.3389f)
                close()
            }
        }
        .build()
        return _weatherMoonOff!!
    }

private var _weatherMoonOff: ImageVector? = null
