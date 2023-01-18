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

public val FilledGroup.SpeakerBluetooth: ImageVector
    get() {
        if (_speakerBluetooth != null) {
            return _speakerBluetooth!!
        }
        _speakerBluetooth = Builder(name = "SpeakerBluetooth", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7041f, 3.4425f)
                curveTo(14.8952f, 3.6682f, 15.0f, 3.9543f, 15.0f, 4.25f)
                verticalLineTo(19.7517f)
                curveTo(15.0f, 20.442f, 14.4404f, 21.0017f, 13.75f, 21.0017f)
                curveTo(13.4542f, 21.0017f, 13.168f, 20.8968f, 12.9423f, 20.7056f)
                lineTo(7.9751f, 16.4999f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 16.4999f, 2.0f, 15.4925f, 2.0f, 14.2499f)
                verticalLineTo(9.7499f)
                curveTo(2.0f, 8.5072f, 3.0074f, 7.4998f, 4.25f, 7.4998f)
                horizontalLineTo(7.9752f)
                lineTo(12.9425f, 3.2959f)
                curveTo(13.4694f, 2.8499f, 14.2582f, 2.9155f, 14.7041f, 3.4425f)
                close()
                moveTo(17.5f, 9.8956f)
                verticalLineTo(6.7498f)
                curveTo(17.5f, 6.1031f, 18.2521f, 5.7749f, 18.725f, 6.1688f)
                lineTo(18.8011f, 6.2411f)
                lineTo(21.8011f, 9.4911f)
                curveTo(22.0679f, 9.7802f, 22.063f, 10.2201f, 21.8063f, 10.503f)
                lineTo(21.7301f, 10.5761f)
                lineTo(20.0221f, 11.9991f)
                lineTo(21.7304f, 13.4239f)
                curveTo(22.0323f, 13.6757f, 22.0846f, 14.1123f, 21.8672f, 14.4261f)
                lineTo(21.8012f, 14.5084f)
                lineTo(18.8012f, 17.7599f)
                curveTo(18.3626f, 18.2353f, 17.5872f, 17.9663f, 17.5068f, 17.3561f)
                lineTo(17.5f, 17.2513f)
                verticalLineTo(14.1005f)
                lineTo(17.2334f, 14.3226f)
                curveTo(16.9152f, 14.5877f, 16.4423f, 14.5447f, 16.1771f, 14.2265f)
                curveTo(15.9361f, 13.9372f, 15.9497f, 13.52f, 16.1933f, 13.2474f)
                lineTo(16.2732f, 13.1702f)
                lineTo(17.5f, 12.1481f)
                verticalLineTo(11.8488f)
                lineTo(16.2729f, 10.8254f)
                curveTo(15.9549f, 10.5601f, 15.9121f, 10.0871f, 16.1774f, 9.769f)
                curveTo(16.4186f, 9.4799f, 16.8313f, 9.4182f, 17.1434f, 9.6087f)
                lineTo(17.2337f, 9.6735f)
                lineTo(17.5f, 9.8956f)
                verticalLineTo(6.7498f)
                verticalLineTo(9.8956f)
                close()
                moveTo(19.0f, 13.0999f)
                verticalLineTo(15.3325f)
                lineTo(20.1641f, 14.0708f)
                lineTo(19.0f, 13.0999f)
                close()
                moveTo(19.0f, 8.6681f)
                verticalLineTo(10.8983f)
                lineTo(20.1637f, 9.9288f)
                lineTo(19.0f, 8.6681f)
                close()
            }
        }
        .build()
        return _speakerBluetooth!!
    }

private var _speakerBluetooth: ImageVector? = null
