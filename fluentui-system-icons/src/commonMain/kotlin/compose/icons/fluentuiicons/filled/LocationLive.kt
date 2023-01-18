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

public val FilledGroup.LocationLive: ImageVector
    get() {
        if (_locationLive != null) {
            return _locationLive!!
        }
        _locationLive = Builder(name = "LocationLive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0009f, 2.7252f)
                curveTo(9.0281f, 2.3119f, 9.3852f, 1.9989f, 9.7985f, 2.0261f)
                curveTo(15.7912f, 2.4202f, 20.5815f, 7.2115f, 20.974f, 13.2046f)
                curveTo(21.001f, 13.6179f, 20.6879f, 13.9749f, 20.2746f, 14.002f)
                curveTo(19.8613f, 14.0291f, 19.5042f, 13.7159f, 19.4772f, 13.3026f)
                curveTo(19.1339f, 8.0606f, 14.9417f, 3.8675f, 9.7001f, 3.5228f)
                curveTo(9.2868f, 3.4956f, 8.9737f, 3.1386f, 9.0009f, 2.7252f)
                close()
                moveTo(7.5876f, 21.3864f)
                lineTo(7.9762f, 21.7722f)
                curveTo(8.2686f, 22.0625f, 8.741f, 22.062f, 9.0334f, 21.7717f)
                lineTo(10.3787f, 20.4352f)
                curveTo(11.1067f, 19.7117f, 11.9466f, 18.8762f, 12.391f, 18.4318f)
                curveTo(14.5374f, 16.2854f, 14.5374f, 12.8053f, 12.391f, 10.6589f)
                curveTo(10.2446f, 8.5125f, 6.7645f, 8.5125f, 4.6181f, 10.6589f)
                curveTo(2.4717f, 12.8053f, 2.4717f, 16.2854f, 4.6181f, 18.4318f)
                curveTo(5.1024f, 18.916f, 5.9422f, 19.7514f, 6.6603f, 20.4651f)
                curveTo(7.0195f, 20.8221f, 7.3484f, 21.1489f, 7.5876f, 21.3864f)
                close()
                moveTo(8.5f, 15.7499f)
                curveTo(7.8096f, 15.7499f, 7.25f, 15.1903f, 7.25f, 14.4999f)
                curveTo(7.25f, 13.8096f, 7.8096f, 13.2499f, 8.5f, 13.2499f)
                curveTo(9.1903f, 13.2499f, 9.75f, 13.8096f, 9.75f, 14.4999f)
                curveTo(9.75f, 15.1903f, 9.1903f, 15.7499f, 8.5f, 15.7499f)
                close()
                moveTo(9.8184f, 5.5026f)
                curveTo(9.4059f, 5.4654f, 9.0413f, 5.7696f, 9.0041f, 6.1822f)
                curveTo(8.9668f, 6.5947f, 9.2711f, 6.9593f, 9.6836f, 6.9965f)
                curveTo(13.0318f, 7.2986f, 15.6997f, 9.9657f, 16.003f, 13.3135f)
                curveTo(16.0404f, 13.7261f, 16.4051f, 14.0302f, 16.8176f, 13.9928f)
                curveTo(17.2302f, 13.9554f, 17.5343f, 13.5907f, 17.4969f, 13.1782f)
                curveTo(17.1282f, 9.1087f, 13.8883f, 5.8698f, 9.8184f, 5.5026f)
                close()
            }
        }
        .build()
        return _locationLive!!
    }

private var _locationLive: ImageVector? = null
