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

public val FilledGroup.VehicleSubway: ImageVector
    get() {
        if (_vehicleSubway != null) {
            return _vehicleSubway!!
        }
        _vehicleSubway = Builder(name = "VehicleSubway", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2501f, 3.0f)
                curveTo(18.3211f, 3.0f, 20.0001f, 4.6789f, 20.0001f, 6.75f)
                verticalLineTo(15.75f)
                curveTo(20.0001f, 17.5253f, 18.7665f, 19.0124f, 17.1097f, 19.401f)
                lineTo(19.5725f, 20.5729f)
                curveTo(19.9465f, 20.7509f, 20.1053f, 21.1985f, 19.9272f, 21.5725f)
                curveTo(19.764f, 21.9153f, 19.3743f, 22.0773f, 19.0224f, 21.9647f)
                lineTo(18.9276f, 21.9271f)
                lineTo(13.8299f, 19.5f)
                horizontalLineTo(10.1689f)
                lineTo(5.0725f, 21.9271f)
                curveTo(4.6985f, 22.1052f, 4.251f, 21.9464f, 4.0729f, 21.5725f)
                curveTo(3.8948f, 21.1985f, 4.0536f, 20.7509f, 4.4276f, 20.5729f)
                lineTo(6.8899f, 19.4009f)
                curveTo(5.2334f, 19.0121f, 4.0001f, 17.5251f, 4.0001f, 15.75f)
                verticalLineTo(6.75f)
                curveTo(4.0001f, 4.6789f, 5.679f, 3.0f, 7.7501f, 3.0f)
                horizontalLineTo(16.2501f)
                close()
                moveTo(8.0f, 15.0f)
                curveTo(7.4478f, 15.0f, 7.0001f, 15.4477f, 7.0001f, 16.0f)
                curveTo(7.0001f, 16.5523f, 7.4478f, 17.0f, 8.0f, 17.0f)
                curveTo(8.5523f, 17.0f, 9.0f, 16.5523f, 9.0f, 16.0f)
                curveTo(9.0f, 15.4477f, 8.5523f, 15.0f, 8.0f, 15.0f)
                close()
                moveTo(16.0001f, 15.0f)
                curveTo(15.4478f, 15.0f, 15.0001f, 15.4477f, 15.0001f, 16.0f)
                curveTo(15.0001f, 16.5523f, 15.4478f, 17.0f, 16.0001f, 17.0f)
                curveTo(16.5523f, 17.0f, 17.0001f, 16.5523f, 17.0001f, 16.0f)
                curveTo(17.0001f, 15.4477f, 16.5523f, 15.0f, 16.0001f, 15.0f)
                close()
                moveTo(16.2501f, 4.5f)
                horizontalLineTo(7.7501f)
                curveTo(6.5074f, 4.5f, 5.5001f, 5.5074f, 5.5001f, 6.75f)
                lineTo(5.4999f, 12.5f)
                horizontalLineTo(18.4999f)
                lineTo(18.5001f, 6.75f)
                curveTo(18.5001f, 5.5074f, 17.4927f, 4.5f, 16.2501f, 4.5f)
                close()
                moveTo(13.2501f, 6.0f)
                curveTo(13.6643f, 6.0f, 14.0001f, 6.3358f, 14.0001f, 6.75f)
                curveTo(14.0001f, 7.1642f, 13.6643f, 7.5f, 13.2501f, 7.5f)
                horizontalLineTo(10.7501f)
                curveTo(10.3358f, 7.5f, 10.0001f, 7.1642f, 10.0001f, 6.75f)
                curveTo(10.0001f, 6.3358f, 10.3358f, 6.0f, 10.7501f, 6.0f)
                horizontalLineTo(13.2501f)
                close()
            }
        }
        .build()
        return _vehicleSubway!!
    }

private var _vehicleSubway: ImageVector? = null
