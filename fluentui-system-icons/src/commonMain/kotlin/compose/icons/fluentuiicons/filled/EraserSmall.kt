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

public val FilledGroup.EraserSmall: ImageVector
    get() {
        if (_eraserSmall != null) {
            return _eraserSmall!!
        }
        _eraserSmall = Builder(name = "EraserSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6511f, 2.6379f)
                curveTo(13.5372f, 1.7601f, 14.9682f, 1.7706f, 15.8413f, 2.6612f)
                lineTo(20.7514f, 7.6694f)
                curveTo(21.612f, 8.5473f, 21.6087f, 9.9535f, 20.7439f, 10.8273f)
                lineTo(18.4867f, 13.1081f)
                curveTo(18.1692f, 13.037f, 17.839f, 12.9995f, 17.5f, 12.9995f)
                curveTo(15.0147f, 12.9995f, 13.0f, 15.0143f, 13.0f, 17.4995f)
                curveTo(13.0f, 17.8548f, 13.0412f, 18.2004f, 13.119f, 18.5319f)
                lineTo(11.3345f, 20.3351f)
                curveTo(10.4628f, 21.2159f, 9.043f, 21.226f, 8.1588f, 20.3577f)
                lineTo(3.0597f, 15.3502f)
                curveTo(2.1645f, 14.4711f, 2.1613f, 13.0295f, 3.0527f, 12.1464f)
                lineTo(12.6511f, 2.6379f)
                close()
                moveTo(4.1084f, 13.2121f)
                curveTo(3.8113f, 13.5064f, 3.8123f, 13.9869f, 4.1107f, 14.28f)
                lineTo(9.2098f, 19.2875f)
                curveTo(9.5045f, 19.5769f, 9.9778f, 19.5735f, 10.2684f, 19.2799f)
                lineTo(11.7363f, 17.7966f)
                lineTo(5.6373f, 11.6975f)
                lineTo(4.1084f, 13.2121f)
                close()
                moveTo(17.5f, 20.9995f)
                curveTo(19.433f, 20.9995f, 21.0f, 19.4325f, 21.0f, 17.4995f)
                curveTo(21.0f, 15.5665f, 19.433f, 13.9995f, 17.5f, 13.9995f)
                curveTo(15.567f, 13.9995f, 14.0f, 15.5665f, 14.0f, 17.4995f)
                curveTo(14.0f, 19.4325f, 15.567f, 20.9995f, 17.5f, 20.9995f)
                close()
            }
        }
        .build()
        return _eraserSmall!!
    }

private var _eraserSmall: ImageVector? = null
