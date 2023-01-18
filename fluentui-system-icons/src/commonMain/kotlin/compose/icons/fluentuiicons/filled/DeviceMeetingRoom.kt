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

public val FilledGroup.DeviceMeetingRoom: ImageVector
    get() {
        if (_deviceMeetingRoom != null) {
            return _deviceMeetingRoom!!
        }
        _deviceMeetingRoom = Builder(name = "DeviceMeetingRoom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0925f, 5.3457f)
                curveTo(4.4238f, 3.9698f, 5.6551f, 3.0f, 7.0707f, 3.0f)
                horizontalLineTo(16.9293f)
                curveTo(18.3449f, 3.0f, 19.5762f, 3.9698f, 19.9075f, 5.3457f)
                lineTo(21.8997f, 13.6191f)
                curveTo(22.4374f, 15.8521f, 20.7448f, 18.0f, 18.4475f, 18.0f)
                horizontalLineTo(5.5525f)
                curveTo(3.2552f, 18.0f, 1.5626f, 15.8521f, 2.1003f, 13.6191f)
                lineTo(4.0925f, 5.3457f)
                close()
                moveTo(6.7487f, 19.0f)
                curveTo(6.3344f, 19.0f, 5.9985f, 19.3358f, 5.9985f, 19.75f)
                curveTo(5.9985f, 20.1642f, 6.3344f, 20.5f, 6.7487f, 20.5f)
                horizontalLineTo(17.2513f)
                curveTo(17.6656f, 20.5f, 18.0014f, 20.1642f, 18.0014f, 19.75f)
                curveTo(18.0014f, 19.3358f, 17.6656f, 19.0f, 17.2513f, 19.0f)
                horizontalLineTo(6.7487f)
                close()
            }
        }
        .build()
        return _deviceMeetingRoom!!
    }

private var _deviceMeetingRoom: ImageVector? = null
