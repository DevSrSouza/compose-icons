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

public val FilledGroup.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 15.0f)
                curveTo(14.0858f, 15.0f, 13.75f, 14.6642f, 13.75f, 14.25f)
                curveTo(13.75f, 13.8358f, 14.0858f, 13.5f, 14.5f, 13.5f)
                horizontalLineTo(15.0f)
                curveTo(17.4852f, 13.5f, 19.5f, 11.933f, 19.5f, 10.0f)
                curveTo(19.5f, 8.1256f, 17.6055f, 6.5953f, 15.2246f, 6.5043f)
                lineTo(15.0f, 6.5f)
                horizontalLineTo(8.061f)
                lineTo(9.7803f, 8.2197f)
                curveTo(10.0732f, 8.5126f, 10.0732f, 8.9874f, 9.7803f, 9.2803f)
                curveTo(9.514f, 9.5466f, 9.0974f, 9.5708f, 8.8038f, 9.353f)
                lineTo(8.7196f, 9.2803f)
                lineTo(5.7196f, 6.2803f)
                curveTo(5.4267f, 5.9874f, 5.4267f, 5.5126f, 5.7196f, 5.2197f)
                lineTo(8.7196f, 2.2197f)
                lineTo(8.8038f, 2.147f)
                curveTo(9.0974f, 1.9292f, 9.514f, 1.9534f, 9.7803f, 2.2197f)
                curveTo(10.0732f, 2.5126f, 10.0732f, 2.9874f, 9.7803f, 3.2803f)
                lineTo(8.062f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(18.3137f, 5.0f, 21.0f, 7.2386f, 21.0f, 10.0f)
                curveTo(21.0f, 12.7614f, 18.3137f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(3.5f, 10.3672f)
                curveTo(3.2239f, 10.3672f, 3.0f, 10.5911f, 3.0f, 10.8672f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.1384f)
                curveTo(20.3169f, 21.0f, 20.4818f, 20.9049f, 20.5711f, 20.7505f)
                curveTo(20.7095f, 20.5115f, 20.6279f, 20.2056f, 20.389f, 20.0673f)
                lineTo(3.7505f, 10.4345f)
                curveTo(3.6744f, 10.3904f, 3.588f, 10.3672f, 3.5f, 10.3672f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
