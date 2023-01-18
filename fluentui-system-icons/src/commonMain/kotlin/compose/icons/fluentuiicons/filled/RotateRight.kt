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

public val FilledGroup.RotateRight: ImageVector
    get() {
        if (_rotateRight != null) {
            return _rotateRight!!
        }
        _rotateRight = Builder(name = "RotateRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 15.0f)
                curveTo(9.9142f, 15.0f, 10.25f, 14.6642f, 10.25f, 14.25f)
                curveTo(10.25f, 13.8358f, 9.9142f, 13.5f, 9.5f, 13.5f)
                horizontalLineTo(9.0f)
                curveTo(6.5147f, 13.5f, 4.5f, 11.933f, 4.5f, 10.0f)
                curveTo(4.5f, 8.1256f, 6.3945f, 6.5953f, 8.7754f, 6.5043f)
                lineTo(9.0f, 6.5f)
                horizontalLineTo(15.939f)
                lineTo(14.2197f, 8.2197f)
                curveTo(13.9268f, 8.5126f, 13.9268f, 8.9874f, 14.2197f, 9.2803f)
                curveTo(14.4859f, 9.5466f, 14.9026f, 9.5708f, 15.1962f, 9.353f)
                lineTo(15.2803f, 9.2803f)
                lineTo(18.2803f, 6.2803f)
                curveTo(18.5732f, 5.9874f, 18.5732f, 5.5126f, 18.2803f, 5.2197f)
                lineTo(15.2803f, 2.2197f)
                lineTo(15.1962f, 2.147f)
                curveTo(14.9026f, 1.9292f, 14.4859f, 1.9534f, 14.2197f, 2.2197f)
                curveTo(13.9268f, 2.5126f, 13.9268f, 2.9874f, 14.2197f, 3.2803f)
                lineTo(15.938f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(5.6863f, 5.0f, 3.0f, 7.2386f, 3.0f, 10.0f)
                curveTo(3.0f, 12.7614f, 5.6863f, 15.0f, 9.0f, 15.0f)
                horizontalLineTo(9.5f)
                close()
                moveTo(20.5f, 10.3672f)
                curveTo(20.7761f, 10.3672f, 21.0f, 10.5911f, 21.0f, 10.8672f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(3.8615f)
                curveTo(3.6831f, 21.0f, 3.5182f, 20.9049f, 3.4288f, 20.7505f)
                curveTo(3.2905f, 20.5115f, 3.372f, 20.2056f, 3.611f, 20.0673f)
                lineTo(20.2494f, 10.4345f)
                curveTo(20.3256f, 10.3904f, 20.412f, 10.3672f, 20.5f, 10.3672f)
                close()
            }
        }
        .build()
        return _rotateRight!!
    }

private var _rotateRight: ImageVector? = null
