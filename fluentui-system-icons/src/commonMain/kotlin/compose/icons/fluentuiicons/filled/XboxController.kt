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

public val FilledGroup.XboxController: ImageVector
    get() {
        if (_xboxController != null) {
            return _xboxController!!
        }
        _xboxController = Builder(name = "XboxController", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8069f, 5.5073f)
                curveTo(9.278f, 5.2429f, 8.6972f, 5.2011f, 8.1685f, 5.3018f)
                lineTo(6.9858f, 5.5272f)
                curveTo(6.124f, 5.6914f, 5.3823f, 6.2448f, 4.982f, 7.0275f)
                curveTo(3.615f, 9.7001f, 2.5814f, 11.8891f, 2.1827f, 13.7563f)
                curveTo(1.7714f, 15.6822f, 2.0228f, 17.3315f, 3.2619f, 18.8327f)
                curveTo(4.0835f, 19.8282f, 5.4915f, 19.627f, 6.2253f, 18.7966f)
                curveTo(6.7841f, 18.1643f, 7.4204f, 17.4321f, 8.0427f, 16.7105f)
                curveTo(8.4525f, 16.2353f, 9.0473f, 15.9619f, 9.6724f, 15.9619f)
                horizontalLineTo(14.3281f)
                curveTo(14.9531f, 15.9619f, 15.548f, 16.2353f, 15.9578f, 16.7105f)
                curveTo(16.5801f, 17.4321f, 17.2163f, 18.1643f, 17.7751f, 18.7966f)
                curveTo(18.5089f, 19.627f, 19.917f, 19.8282f, 20.7386f, 18.8327f)
                curveTo(21.9776f, 17.3315f, 22.229f, 15.6822f, 21.8178f, 13.7563f)
                curveTo(21.4191f, 11.8891f, 20.3855f, 9.7001f, 19.0185f, 7.0275f)
                curveTo(18.6181f, 6.2448f, 17.8764f, 5.6914f, 17.0146f, 5.5272f)
                lineTo(15.832f, 5.3018f)
                curveTo(15.3033f, 5.2011f, 14.7225f, 5.2429f, 14.1935f, 5.5073f)
                curveTo(14.0499f, 5.5791f, 13.9026f, 5.6562f, 13.7541f, 5.7367f)
                curveTo(13.3989f, 5.9292f, 13.0178f, 6.0334f, 12.641f, 6.0334f)
                horizontalLineTo(11.3594f)
                curveTo(10.9827f, 6.0334f, 10.6016f, 5.9292f, 10.2464f, 5.7367f)
                curveTo(10.0979f, 5.6562f, 9.9506f, 5.5791f, 9.8069f, 5.5073f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 10.5523f, 11.0f, 10.0f)
                curveTo(11.0f, 9.4477f, 11.4477f, 9.0f, 12.0f, 9.0f)
                curveTo(12.5523f, 9.0f, 13.0f, 9.4477f, 13.0f, 10.0f)
                curveTo(13.0f, 10.5523f, 12.5523f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _xboxController!!
    }

private var _xboxController: ImageVector? = null
