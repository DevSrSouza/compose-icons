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

public val RegularGroup.ThumbDislike: ImageVector
    get() {
        if (_thumbDislike != null) {
            return _thumbDislike!!
        }
        _thumbDislike = Builder(name = "ThumbDislike", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4996f, 17.9852f)
                curveTo(16.4996f, 20.4271f, 15.3595f, 22.1838f, 13.4932f, 22.1838f)
                curveTo(12.5183f, 22.1838f, 12.1518f, 21.6411f, 11.8021f, 20.3881f)
                lineTo(11.596f, 19.6162f)
                curveTo(11.495f, 19.2574f, 11.3192f, 18.6467f, 11.069f, 17.7852f)
                curveTo(11.0623f, 17.7621f, 11.0524f, 17.7403f, 11.0396f, 17.7203f)
                lineTo(8.1728f, 13.2346f)
                curveTo(7.4948f, 12.1736f, 6.4943f, 11.3581f, 5.3184f, 10.9079f)
                lineTo(4.8451f, 10.7267f)
                curveTo(3.5984f, 10.2494f, 2.8746f, 8.9456f, 3.1287f, 7.635f)
                lineTo(3.5332f, 5.549f)
                curveTo(3.7746f, 4.3039f, 4.7183f, 3.313f, 5.9501f, 3.0111f)
                lineTo(13.5778f, 1.1415f)
                curveTo(16.109f, 0.5211f, 18.6674f, 2.0561f, 19.3113f, 4.5814f)
                lineTo(20.7262f, 10.1306f)
                curveTo(21.1697f, 11.8698f, 20.1192f, 13.6393f, 18.3799f, 14.0828f)
                curveTo(18.1175f, 14.1497f, 17.8478f, 14.1835f, 17.5769f, 14.1835f)
                horizontalLineTo(15.7536f)
                curveTo(16.2497f, 15.8164f, 16.4996f, 17.0762f, 16.4996f, 17.9852f)
                close()
                moveTo(4.6013f, 7.9206f)
                curveTo(4.4858f, 8.5163f, 4.8148f, 9.1089f, 5.3815f, 9.3259f)
                lineTo(5.8548f, 9.5071f)
                curveTo(7.3304f, 10.0721f, 8.5858f, 11.0954f, 9.4367f, 12.4268f)
                lineTo(12.3035f, 16.9125f)
                curveTo(12.3935f, 17.0534f, 12.4629f, 17.2064f, 12.5095f, 17.367f)
                lineTo(13.0614f, 19.2873f)
                lineTo(13.2731f, 20.0786f)
                curveTo(13.4125f, 20.5666f, 13.4827f, 20.6838f, 13.4932f, 20.6838f)
                curveTo(14.3609f, 20.6838f, 14.9996f, 19.6998f, 14.9996f, 17.9852f)
                curveTo(14.9996f, 17.1007f, 14.6738f, 15.6497f, 14.0158f, 13.6701f)
                curveTo(13.8544f, 13.1846f, 14.2158f, 12.6835f, 14.7275f, 12.6835f)
                horizontalLineTo(17.5769f)
                curveTo(17.7228f, 12.6835f, 17.868f, 12.6653f, 18.0093f, 12.6293f)
                curveTo(18.9459f, 12.3905f, 19.5115f, 11.4377f, 19.2727f, 10.5012f)
                lineTo(17.8578f, 4.952f)
                curveTo(17.4172f, 3.2241f, 15.6668f, 2.1739f, 13.9349f, 2.5984f)
                lineTo(6.3072f, 4.4679f)
                curveTo(5.6439f, 4.6305f, 5.1358f, 5.1641f, 5.0058f, 5.8345f)
                lineTo(4.6013f, 7.9206f)
                close()
            }
        }
        .build()
        return _thumbDislike!!
    }

private var _thumbDislike: ImageVector? = null
