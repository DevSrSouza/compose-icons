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

public val RegularGroup.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9389f, 6.9996f)
                lineTo(2.2197f, 3.2803f)
                curveTo(1.9268f, 2.9874f, 1.9268f, 2.5126f, 2.2197f, 2.2197f)
                curveTo(2.5126f, 1.9268f, 2.9874f, 1.9268f, 3.2803f, 2.2197f)
                lineTo(21.7801f, 20.7198f)
                curveTo(22.073f, 21.0127f, 22.073f, 21.4876f, 21.7801f, 21.7805f)
                curveTo(21.4872f, 22.0734f, 21.0123f, 22.0734f, 20.7194f, 21.7805f)
                lineTo(14.4361f, 15.497f)
                lineTo(8.585f, 21.536f)
                curveTo(7.5313f, 22.6236f, 5.7131f, 21.6422f, 6.044f, 20.1645f)
                lineTo(7.3132f, 14.4964f)
                lineTo(5.7448f, 14.4904f)
                curveTo(4.538f, 14.4858f, 3.698f, 13.2899f, 4.1029f, 12.1532f)
                lineTo(5.9389f, 6.9996f)
                close()
                moveTo(13.3753f, 14.4362f)
                lineTo(7.1129f, 8.1737f)
                lineTo(5.516f, 12.6565f)
                curveTo(5.4581f, 12.8189f, 5.5781f, 12.9898f, 5.7505f, 12.9904f)
                lineTo(8.2518f, 13.0f)
                curveTo(8.479f, 13.0009f, 8.6936f, 13.1047f, 8.8352f, 13.2823f)
                curveTo(8.9769f, 13.4599f, 9.0304f, 13.6922f, 8.9808f, 13.9139f)
                lineTo(7.5077f, 20.4923f)
                lineTo(13.3753f, 14.4362f)
                close()
                moveTo(18.1579f, 9.5f)
                lineTo(15.463f, 12.2815f)
                lineTo(16.5237f, 13.3423f)
                lineTo(19.646f, 10.1198f)
                curveTo(20.4143f, 9.3268f, 19.8524f, 8.0f, 18.7483f, 8.0f)
                horizontalLineTo(14.7895f)
                lineTo(16.2411f, 3.6453f)
                curveTo(16.5109f, 2.8359f, 15.9084f, 2.0f, 15.0552f, 2.0f)
                horizontalLineTo(8.6016f)
                curveTo(8.073f, 2.0f, 7.6015f, 2.3325f, 7.4241f, 2.8305f)
                lineTo(7.0532f, 3.8716f)
                lineTo(8.2273f, 5.0457f)
                lineTo(8.7779f, 3.5f)
                horizontalLineTo(14.7084f)
                lineTo(13.0374f, 8.5128f)
                curveTo(12.9612f, 8.7415f, 12.9995f, 8.993f, 13.1405f, 9.1885f)
                curveTo(13.2815f, 9.3841f, 13.5078f, 9.5f, 13.7489f, 9.5f)
                horizontalLineTo(18.1579f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
