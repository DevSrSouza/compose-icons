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

public val FilledGroup.VehicleTruckProfile: ImageVector
    get() {
        if (_vehicleTruckProfile != null) {
            return _vehicleTruckProfile!!
        }
        _vehicleTruckProfile = Builder(name = "VehicleTruckProfile", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 4.0074f, 3.0074f, 3.0f, 4.25f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.4926f, 3.0f, 16.5f, 4.0074f, 16.5f, 5.25f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0508f)
                curveTo(18.9203f, 6.0f, 19.7119f, 6.501f, 20.0842f, 7.2868f)
                lineTo(21.7834f, 10.8741f)
                curveTo(21.926f, 11.1752f, 22.0f, 11.5042f, 22.0f, 11.8373f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.4926f, 20.9926f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(17.9585f)
                curveTo(17.7205f, 20.9189f, 16.4865f, 22.0f, 15.0f, 22.0f)
                curveTo(13.5135f, 22.0f, 12.2795f, 20.9189f, 12.0415f, 19.5f)
                horizontalLineTo(9.9585f)
                curveTo(9.7205f, 20.9189f, 8.4865f, 22.0f, 7.0f, 22.0f)
                curveTo(5.5101f, 22.0f, 4.2739f, 20.9139f, 4.0399f, 19.4903f)
                curveTo(2.8958f, 19.3844f, 2.0f, 18.4218f, 2.0f, 17.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(20.5f, 15.5001f)
                horizontalLineTo(19.25f)
                curveTo(18.8358f, 15.5001f, 18.5f, 15.8358f, 18.5f, 16.2501f)
                curveTo(18.5f, 16.6643f, 18.8358f, 17.0001f, 19.25f, 17.0001f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.5001f)
                close()
                moveTo(20.1833f, 11.0f)
                lineTo(18.7286f, 7.9289f)
                curveTo(18.6045f, 7.667f, 18.3406f, 7.5f, 18.0508f, 7.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11.0f)
                lineTo(20.1833f, 11.0f)
                close()
                moveTo(7.0f, 20.5f)
                curveTo(7.8284f, 20.5f, 8.5f, 19.8284f, 8.5f, 19.0f)
                curveTo(8.5f, 18.1716f, 7.8284f, 17.5f, 7.0f, 17.5f)
                curveTo(6.1716f, 17.5f, 5.5f, 18.1716f, 5.5f, 19.0f)
                curveTo(5.5f, 19.8284f, 6.1716f, 20.5f, 7.0f, 20.5f)
                close()
                moveTo(16.5f, 19.0f)
                curveTo(16.5f, 18.1716f, 15.8284f, 17.5f, 15.0f, 17.5f)
                curveTo(14.1716f, 17.5f, 13.5f, 18.1716f, 13.5f, 19.0f)
                curveTo(13.5f, 19.8284f, 14.1716f, 20.5f, 15.0f, 20.5f)
                curveTo(15.8284f, 20.5f, 16.5f, 19.8284f, 16.5f, 19.0f)
                close()
            }
        }
        .build()
        return _vehicleTruckProfile!!
    }

private var _vehicleTruckProfile: ImageVector? = null
