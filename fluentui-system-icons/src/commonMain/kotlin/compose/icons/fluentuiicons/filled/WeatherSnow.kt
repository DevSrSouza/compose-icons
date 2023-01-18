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

public val FilledGroup.WeatherSnow: ImageVector
    get() {
        if (_weatherSnow != null) {
            return _weatherSnow!!
        }
        _weatherSnow = Builder(name = "WeatherSnow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7499f, 18.1515f)
                curveTo(10.1641f, 18.1515f, 10.4999f, 18.4873f, 10.4999f, 18.9015f)
                curveTo(10.4999f, 19.3158f, 10.1641f, 19.6515f, 9.7499f, 19.6515f)
                curveTo(9.3357f, 19.6515f, 8.9999f, 19.3158f, 8.9999f, 18.9015f)
                curveTo(8.9999f, 18.4873f, 9.3357f, 18.1515f, 9.7499f, 18.1515f)
                close()
                moveTo(14.2499f, 18.1515f)
                curveTo(14.6641f, 18.1515f, 14.9999f, 18.4873f, 14.9999f, 18.9015f)
                curveTo(14.9999f, 19.3158f, 14.6641f, 19.6515f, 14.2499f, 19.6515f)
                curveTo(13.8357f, 19.6515f, 13.4999f, 19.3158f, 13.4999f, 18.9015f)
                curveTo(13.4999f, 18.4873f, 13.8357f, 18.1515f, 14.2499f, 18.1515f)
                close()
                moveTo(7.4999f, 17.1515f)
                curveTo(7.9142f, 17.1515f, 8.2499f, 17.4873f, 8.2499f, 17.9015f)
                curveTo(8.2499f, 18.3158f, 7.9142f, 18.6515f, 7.4999f, 18.6515f)
                curveTo(7.0857f, 18.6515f, 6.7499f, 18.3158f, 6.7499f, 17.9015f)
                curveTo(6.7499f, 17.4873f, 7.0857f, 17.1515f, 7.4999f, 17.1515f)
                close()
                moveTo(11.9999f, 17.1515f)
                curveTo(12.4141f, 17.1515f, 12.7499f, 17.4873f, 12.7499f, 17.9015f)
                curveTo(12.7499f, 18.3158f, 12.4141f, 18.6515f, 11.9999f, 18.6515f)
                curveTo(11.5857f, 18.6515f, 11.2499f, 18.3158f, 11.2499f, 17.9015f)
                curveTo(11.2499f, 17.4873f, 11.5857f, 17.1515f, 11.9999f, 17.1515f)
                close()
                moveTo(16.4999f, 17.1515f)
                curveTo(16.9141f, 17.1515f, 17.2499f, 17.4873f, 17.2499f, 17.9015f)
                curveTo(17.2499f, 18.3158f, 16.9141f, 18.6515f, 16.4999f, 18.6515f)
                curveTo(16.0857f, 18.6515f, 15.7499f, 18.3158f, 15.7499f, 17.9015f)
                curveTo(15.7499f, 17.4873f, 16.0857f, 17.1515f, 16.4999f, 17.1515f)
                close()
                moveTo(11.9999f, 4.001f)
                curveTo(15.1685f, 4.001f, 16.9659f, 6.0983f, 17.2273f, 8.6311f)
                lineTo(17.3073f, 8.6311f)
                curveTo(19.3464f, 8.6311f, 20.9994f, 10.2798f, 20.9994f, 12.3136f)
                curveTo(20.9994f, 14.3474f, 19.3464f, 15.9962f, 17.3073f, 15.9962f)
                horizontalLineTo(6.6926f)
                curveTo(4.6535f, 15.9962f, 3.0005f, 14.3474f, 3.0005f, 12.3136f)
                curveTo(3.0005f, 10.2798f, 4.6535f, 8.6311f, 6.6926f, 8.6311f)
                lineTo(6.7725f, 8.6311f)
                curveTo(7.0355f, 6.0816f, 8.8314f, 4.001f, 11.9999f, 4.001f)
                close()
            }
        }
        .build()
        return _weatherSnow!!
    }

private var _weatherSnow: ImageVector? = null
