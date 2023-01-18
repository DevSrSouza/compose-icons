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

public val RegularGroup.DeviceMeetingRoom: ImageVector
    get() {
        if (_deviceMeetingRoom != null) {
            return _deviceMeetingRoom!!
        }
        _deviceMeetingRoom = Builder(name = "DeviceMeetingRoom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0694f, 3.0f)
                curveTo(5.6542f, 3.0f, 4.4232f, 3.9698f, 4.092f, 5.3457f)
                lineTo(2.1003f, 13.6191f)
                curveTo(1.5627f, 15.8521f, 3.2549f, 18.0f, 5.5516f, 18.0f)
                horizontalLineTo(18.4435f)
                curveTo(20.7403f, 18.0f, 22.4325f, 15.8521f, 21.8949f, 13.6191f)
                lineTo(19.9032f, 5.3457f)
                curveTo(19.5719f, 3.9698f, 18.341f, 3.0f, 16.9257f, 3.0f)
                horizontalLineTo(7.0694f)
                close()
                moveTo(5.5503f, 5.6968f)
                curveTo(5.7193f, 4.9948f, 6.3474f, 4.5f, 7.0694f, 4.5f)
                horizontalLineTo(16.9257f)
                curveTo(17.6478f, 4.5f, 18.2758f, 4.9948f, 18.4448f, 5.6968f)
                lineTo(20.4366f, 13.9702f)
                curveTo(20.747f, 15.2596f, 19.7698f, 16.5f, 18.4435f, 16.5f)
                horizontalLineTo(5.5516f)
                curveTo(4.2253f, 16.5f, 3.2482f, 15.2596f, 3.5586f, 13.9702f)
                lineTo(5.5503f, 5.6968f)
                close()
                moveTo(6.7476f, 19.0f)
                curveTo(6.3333f, 19.0f, 5.9976f, 19.3358f, 5.9976f, 19.75f)
                curveTo(5.9976f, 20.1642f, 6.3333f, 20.5f, 6.7476f, 20.5f)
                horizontalLineTo(17.2476f)
                curveTo(17.6618f, 20.5f, 17.9976f, 20.1642f, 17.9976f, 19.75f)
                curveTo(17.9976f, 19.3358f, 17.6618f, 19.0f, 17.2476f, 19.0f)
                horizontalLineTo(6.7476f)
                close()
            }
        }
        .build()
        return _deviceMeetingRoom!!
    }

private var _deviceMeetingRoom: ImageVector? = null
