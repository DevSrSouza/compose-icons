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

public val RegularGroup.Channel: ImageVector
    get() {
        if (_channel != null) {
            return _channel!!
        }
        _channel = Builder(name = "Channel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7501f, 3.0f)
                curveTo(19.4831f, 3.0f, 20.8993f, 4.3565f, 20.995f, 6.0656f)
                lineTo(21.0001f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0001f, 19.483f, 19.6436f, 20.8992f, 17.9345f, 20.9949f)
                lineTo(17.7501f, 21.0f)
                horizontalLineTo(6.2501f)
                curveTo(4.5171f, 21.0f, 3.1009f, 19.6435f, 3.0052f, 17.9344f)
                lineTo(3.0001f, 17.75f)
                lineTo(2.9998f, 9.3721f)
                curveTo(3.2345f, 9.4551f, 3.487f, 9.5002f, 3.7501f, 9.5002f)
                curveTo(4.0132f, 9.5002f, 4.2657f, 9.4551f, 4.5003f, 9.3721f)
                lineTo(4.5001f, 17.75f)
                curveTo(4.5001f, 18.6682f, 5.2072f, 19.4212f, 6.1066f, 19.4942f)
                lineTo(6.2501f, 19.5f)
                horizontalLineTo(17.7501f)
                curveTo(18.6683f, 19.5f, 19.4213f, 18.7929f, 19.4943f, 17.8935f)
                lineTo(19.5001f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5001f, 5.3318f, 18.793f, 4.5788f, 17.8936f, 4.5058f)
                lineTo(17.7501f, 4.5f)
                horizontalLineTo(6.2501f)
                curveTo(5.6499f, 4.5f, 5.1203f, 4.8021f, 4.8051f, 5.2626f)
                curveTo(4.4911f, 5.095f, 4.1317f, 5.0f, 3.7501f, 5.0f)
                curveTo(3.5689f, 5.0f, 3.3926f, 5.0214f, 3.2238f, 5.0619f)
                curveTo(3.6771f, 3.909f, 4.7701f, 3.0776f, 6.0657f, 3.0051f)
                lineTo(6.2501f, 3.0f)
                horizontalLineTo(17.7501f)
                close()
                moveTo(13.2461f, 13.0031f)
                curveTo(13.6603f, 13.0031f, 13.9961f, 13.3388f, 13.9961f, 13.7531f)
                curveTo(13.9961f, 14.1327f, 13.714f, 14.4465f, 13.3479f, 14.4962f)
                lineTo(13.2461f, 14.5031f)
                horizontalLineTo(8.7479f)
                curveTo(8.3336f, 14.5031f, 7.9979f, 14.1673f, 7.9979f, 13.7531f)
                curveTo(7.9979f, 13.3734f, 8.28f, 13.0596f, 8.6461f, 13.0099f)
                lineTo(8.7479f, 13.0031f)
                horizontalLineTo(13.2461f)
                close()
                moveTo(15.2523f, 9.4962f)
                curveTo(15.6666f, 9.4962f, 16.0023f, 9.832f, 16.0023f, 10.2462f)
                curveTo(16.0023f, 10.6259f, 15.7202f, 10.9397f, 15.3541f, 10.9894f)
                lineTo(15.2523f, 10.9962f)
                horizontalLineTo(8.7479f)
                curveTo(8.3336f, 10.9962f, 7.9979f, 10.6604f, 7.9979f, 10.2462f)
                curveTo(7.9979f, 9.8665f, 8.28f, 9.5527f, 8.6461f, 9.5031f)
                lineTo(8.7479f, 9.4962f)
                horizontalLineTo(15.2523f)
                close()
                moveTo(3.7501f, 6.0f)
                curveTo(4.4405f, 6.0f, 5.0002f, 6.5597f, 5.0002f, 7.2501f)
                curveTo(5.0002f, 7.9405f, 4.4405f, 8.5002f, 3.7501f, 8.5002f)
                curveTo(3.0597f, 8.5002f, 2.5f, 7.9405f, 2.5f, 7.2501f)
                curveTo(2.5f, 6.5597f, 3.0597f, 6.0f, 3.7501f, 6.0f)
                close()
            }
        }
        .build()
        return _channel!!
    }

private var _channel: ImageVector? = null
