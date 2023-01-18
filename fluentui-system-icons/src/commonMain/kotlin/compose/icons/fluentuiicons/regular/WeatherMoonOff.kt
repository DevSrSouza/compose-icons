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

public val RegularGroup.WeatherMoonOff: ImageVector
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
                curveTo(10.281f, 22.9237f, 15.092f, 22.2344f, 18.2229f, 19.2839f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(17.1614f, 18.2224f)
                curveTo(14.4994f, 20.7043f, 10.4298f, 21.2775f, 7.1139f, 19.3631f)
                curveTo(6.2932f, 18.8893f, 5.5698f, 18.2928f, 4.9615f, 17.5969f)
                curveTo(8.23f, 16.2919f, 10.242f, 14.7169f, 11.5134f, 12.5742f)
                lineTo(17.1614f, 18.2224f)
                close()
                moveTo(15.6154f, 4.6379f)
                curveTo(19.5302f, 6.8981f, 20.9674f, 11.8017f, 18.974f, 15.7924f)
                lineTo(20.0831f, 16.9015f)
                curveTo(22.7652f, 12.1329f, 21.1159f, 6.0816f, 16.3654f, 3.3389f)
                curveTo(14.986f, 2.5425f, 13.465f, 2.0953f, 11.908f, 2.0117f)
                curveTo(11.4058f, 1.9848f, 11.02f, 2.45f, 11.1392f, 2.9385f)
                curveTo(11.6444f, 5.0082f, 11.7443f, 6.7499f, 11.4926f, 8.3107f)
                lineTo(12.7585f, 9.5767f)
                curveTo(13.2129f, 7.8161f, 13.2551f, 5.8805f, 12.8232f, 3.6224f)
                curveTo(13.7956f, 3.7916f, 14.7384f, 4.1316f, 15.6154f, 4.6379f)
                close()
            }
        }
        .build()
        return _weatherMoonOff!!
    }

private var _weatherMoonOff: ImageVector? = null
