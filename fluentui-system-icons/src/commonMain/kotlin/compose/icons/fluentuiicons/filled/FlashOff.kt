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

public val FilledGroup.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4361f, 15.497f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(5.9389f, 6.9996f)
                lineTo(4.1029f, 12.1532f)
                curveTo(3.698f, 13.2899f, 4.538f, 14.4858f, 5.7448f, 14.4904f)
                lineTo(7.3132f, 14.4964f)
                lineTo(6.044f, 20.1645f)
                curveTo(5.7131f, 21.6422f, 7.5313f, 22.6236f, 8.585f, 21.536f)
                lineTo(14.4361f, 15.497f)
                close()
                moveTo(19.646f, 10.1198f)
                lineTo(16.5237f, 13.3423f)
                lineTo(7.0532f, 3.8716f)
                lineTo(7.4241f, 2.8305f)
                curveTo(7.6015f, 2.3325f, 8.073f, 2.0f, 8.6016f, 2.0f)
                horizontalLineTo(15.0552f)
                curveTo(15.9084f, 2.0f, 16.5109f, 2.8359f, 16.2411f, 3.6453f)
                lineTo(14.7895f, 8.0f)
                horizontalLineTo(18.7483f)
                curveTo(19.8524f, 8.0f, 20.4143f, 9.3268f, 19.646f, 10.1198f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
