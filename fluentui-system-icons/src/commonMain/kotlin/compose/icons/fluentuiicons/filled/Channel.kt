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

public val FilledGroup.Channel: ImageVector
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
                curveTo(19.545f, 3.0f, 21.0001f, 4.4551f, 21.0001f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0001f, 19.5449f, 19.545f, 21.0f, 17.7501f, 21.0f)
                horizontalLineTo(6.2501f)
                curveTo(4.4552f, 21.0f, 3.0001f, 19.5449f, 3.0001f, 17.75f)
                lineTo(2.9998f, 9.3721f)
                curveTo(3.2345f, 9.4551f, 3.487f, 9.5002f, 3.7501f, 9.5002f)
                curveTo(4.9928f, 9.5002f, 6.0002f, 8.4928f, 6.0002f, 7.2501f)
                curveTo(6.0002f, 6.0074f, 4.9928f, 5.0f, 3.7501f, 5.0f)
                curveTo(3.5689f, 5.0f, 3.3926f, 5.0214f, 3.2238f, 5.0619f)
                curveTo(3.6985f, 3.8547f, 4.8745f, 3.0f, 6.2501f, 3.0f)
                horizontalLineTo(17.7501f)
                close()
                moveTo(13.2461f, 13.0031f)
                horizontalLineTo(8.7479f)
                lineTo(8.6461f, 13.0099f)
                curveTo(8.28f, 13.0596f, 7.9979f, 13.3734f, 7.9979f, 13.7531f)
                curveTo(7.9979f, 14.1327f, 8.28f, 14.4465f, 8.6461f, 14.4962f)
                lineTo(8.7479f, 14.5031f)
                horizontalLineTo(13.2461f)
                lineTo(13.3479f, 14.4962f)
                curveTo(13.714f, 14.4465f, 13.9961f, 14.1327f, 13.9961f, 13.7531f)
                curveTo(13.9961f, 13.3388f, 13.6603f, 13.0031f, 13.2461f, 13.0031f)
                close()
                moveTo(15.2523f, 9.4962f)
                horizontalLineTo(8.7479f)
                lineTo(8.6461f, 9.5031f)
                curveTo(8.28f, 9.5527f, 7.9979f, 9.8665f, 7.9979f, 10.2462f)
                curveTo(7.9979f, 10.6259f, 8.28f, 10.9397f, 8.6461f, 10.9894f)
                lineTo(8.7479f, 10.9962f)
                horizontalLineTo(15.2523f)
                lineTo(15.3541f, 10.9894f)
                curveTo(15.7202f, 10.9397f, 16.0023f, 10.6259f, 16.0023f, 10.2462f)
                curveTo(16.0023f, 9.832f, 15.6666f, 9.4962f, 15.2523f, 9.4962f)
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
