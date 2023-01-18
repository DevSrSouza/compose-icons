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

public val FilledGroup.CompassNorthwest: ImageVector
    get() {
        if (_compassNorthwest != null) {
            return _compassNorthwest!!
        }
        _compassNorthwest = Builder(name = "CompassNorthwest", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2494f, 10.9994f)
                horizontalLineTo(2.0488f)
                curveTo(2.5179f, 6.275f, 6.275f, 2.5179f, 10.9994f, 2.0488f)
                verticalLineTo(3.2494f)
                curveTo(10.9994f, 3.6637f, 11.3352f, 3.9994f, 11.7494f, 3.9994f)
                curveTo(12.1636f, 3.9994f, 12.4994f, 3.6637f, 12.4994f, 3.2494f)
                verticalLineTo(2.0117f)
                curveTo(17.4566f, 2.2558f, 21.4646f, 6.1095f, 21.9501f, 10.9994f)
                horizontalLineTo(20.7494f)
                curveTo(20.3352f, 10.9994f, 19.9994f, 11.3352f, 19.9994f, 11.7494f)
                curveTo(19.9994f, 12.1636f, 20.3352f, 12.4994f, 20.7494f, 12.4994f)
                horizontalLineTo(21.9872f)
                curveTo(21.7348f, 17.6244f, 17.6244f, 21.7348f, 12.4994f, 21.9872f)
                verticalLineTo(20.7494f)
                curveTo(12.4994f, 20.3352f, 12.1636f, 19.9994f, 11.7494f, 19.9994f)
                curveTo(11.3352f, 19.9994f, 10.9994f, 20.3352f, 10.9994f, 20.7494f)
                verticalLineTo(21.9501f)
                curveTo(6.1095f, 21.4646f, 2.2558f, 17.4566f, 2.0117f, 12.4994f)
                horizontalLineTo(3.2494f)
                curveTo(3.6636f, 12.4994f, 3.9994f, 12.1636f, 3.9994f, 11.7494f)
                curveTo(3.9994f, 11.3352f, 3.6636f, 10.9994f, 3.2494f, 10.9994f)
                close()
                moveTo(14.6532f, 11.5252f)
                curveTo(14.2346f, 10.5484f, 13.4446f, 9.7784f, 12.4574f, 9.385f)
                lineTo(8.4292f, 7.7799f)
                curveTo(8.0214f, 7.6174f, 7.6171f, 8.0217f, 7.7797f, 8.4295f)
                lineTo(9.3849f, 12.4576f)
                curveTo(9.7783f, 13.4447f, 10.5483f, 14.2347f, 11.525f, 14.6533f)
                lineTo(15.8504f, 16.5071f)
                curveTo(16.2653f, 16.6849f, 16.6848f, 16.2654f, 16.507f, 15.8506f)
                lineTo(14.6532f, 11.5252f)
                close()
            }
        }
        .build()
        return _compassNorthwest!!
    }

private var _compassNorthwest: ImageVector? = null
