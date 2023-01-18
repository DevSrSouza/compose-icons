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

public val FilledGroup.EraserSegment: ImageVector
    get() {
        if (_eraserSegment != null) {
            return _eraserSegment!!
        }
        _eraserSegment = Builder(name = "EraserSegment", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6511f, 2.6379f)
                curveTo(13.5372f, 1.7601f, 14.9682f, 1.7706f, 15.8413f, 2.6612f)
                lineTo(20.7514f, 7.6694f)
                curveTo(21.612f, 8.5473f, 21.6087f, 9.9535f, 20.7439f, 10.8273f)
                lineTo(12.1614f, 19.4995f)
                horizontalLineTo(16.1145f)
                curveTo(16.433f, 18.4853f, 17.3806f, 17.7495f, 18.5f, 17.7495f)
                curveTo(19.8807f, 17.7495f, 21.0f, 18.8688f, 21.0f, 20.2495f)
                curveTo(21.0f, 21.6303f, 19.8807f, 22.7495f, 18.5f, 22.7495f)
                curveTo(17.3806f, 22.7495f, 16.433f, 22.0138f, 16.1145f, 20.9995f)
                horizontalLineTo(9.8482f)
                curveTo(9.2421f, 21.0298f, 8.6257f, 20.8163f, 8.1588f, 20.3577f)
                lineTo(3.0597f, 15.3502f)
                curveTo(2.1645f, 14.4711f, 2.1613f, 13.0295f, 3.0527f, 12.1464f)
                lineTo(12.6511f, 2.6379f)
                close()
                moveTo(9.8004f, 19.4995f)
                curveTo(9.9714f, 19.4847f, 10.1382f, 19.4114f, 10.2684f, 19.2799f)
                lineTo(11.7363f, 17.7966f)
                lineTo(5.6373f, 11.6975f)
                lineTo(4.1084f, 13.2121f)
                curveTo(3.8113f, 13.5064f, 3.8123f, 13.9869f, 4.1107f, 14.28f)
                lineTo(9.2098f, 19.2875f)
                curveTo(9.3596f, 19.4346f, 9.5554f, 19.506f, 9.75f, 19.5022f)
                verticalLineTo(19.4995f)
                horizontalLineTo(9.8004f)
                close()
            }
        }
        .build()
        return _eraserSegment!!
    }

private var _eraserSegment: ImageVector? = null
