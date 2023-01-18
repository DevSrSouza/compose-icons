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

public val RegularGroup.TextEditStyle: ImageVector
    get() {
        if (_textEditStyle != null) {
            return _textEditStyle!!
        }
        _textEditStyle = Builder(name = "TextEditStyle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0626f, 8.4453f)
                curveTo(21.319f, 9.7025f, 21.3183f, 11.7401f, 20.0612f, 12.9964f)
                lineTo(12.938f, 20.1076f)
                curveTo(12.675f, 20.3701f, 12.3511f, 20.5634f, 11.9952f, 20.6703f)
                lineTo(7.7022f, 21.9589f)
                curveTo(7.1732f, 22.1177f, 6.6157f, 21.8176f, 6.4569f, 21.2886f)
                curveTo(6.3987f, 21.0946f, 6.4008f, 20.8874f, 6.4629f, 20.6946f)
                lineTo(7.8243f, 16.4666f)
                curveTo(7.9339f, 16.1261f, 8.1231f, 15.8166f, 8.3763f, 15.5639f)
                lineTo(15.5091f, 8.4427f)
                curveTo(16.7674f, 7.1865f, 18.8058f, 7.1876f, 20.0626f, 8.4453f)
                close()
                moveTo(16.5689f, 9.5042f)
                lineTo(9.4361f, 16.6254f)
                curveTo(9.3517f, 16.7096f, 9.2886f, 16.8128f, 9.2521f, 16.9263f)
                lineTo(8.1823f, 20.2487f)
                lineTo(11.564f, 19.2336f)
                curveTo(11.6826f, 19.198f, 11.7906f, 19.1336f, 11.8782f, 19.046f)
                lineTo(19.0002f, 11.9361f)
                curveTo(19.6721f, 11.2647f, 19.6724f, 10.1768f, 19.0016f, 9.5056f)
                curveTo(18.3301f, 8.8337f, 17.2412f, 8.8331f, 16.5689f, 9.5042f)
                close()
                moveTo(8.151f, 2.3698f)
                lineTo(8.2015f, 2.4749f)
                lineTo(11.454f, 10.724f)
                lineTo(10.297f, 11.879f)
                lineTo(9.556f, 10.0f)
                horizontalLineTo(5.443f)
                lineTo(4.4477f, 12.5209f)
                curveTo(4.3081f, 12.874f, 3.9303f, 13.0621f, 3.5716f, 12.9737f)
                lineTo(3.4745f, 12.9426f)
                curveTo(3.1214f, 12.803f, 2.9333f, 12.4253f, 3.0217f, 12.0666f)
                lineTo(3.0527f, 11.9694f)
                lineTo(6.8063f, 2.4743f)
                curveTo(7.0417f, 1.8788f, 7.8488f, 1.8441f, 8.151f, 2.3698f)
                close()
                moveTo(7.5029f, 4.7923f)
                lineTo(6.036f, 8.5f)
                horizontalLineTo(8.964f)
                lineTo(7.5029f, 4.7923f)
                close()
            }
        }
        .build()
        return _textEditStyle!!
    }

private var _textEditStyle: ImageVector? = null
