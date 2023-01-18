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

public val FilledGroup.EraserMedium: ImageVector
    get() {
        if (_eraserMedium != null) {
            return _eraserMedium!!
        }
        _eraserMedium = Builder(name = "EraserMedium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6511f, 2.6379f)
                curveTo(13.5372f, 1.7601f, 14.9682f, 1.7706f, 15.8413f, 2.6612f)
                lineTo(20.7514f, 7.6694f)
                curveTo(21.612f, 8.5473f, 21.6087f, 9.9535f, 20.7439f, 10.8273f)
                lineTo(20.0567f, 11.5217f)
                curveTo(19.272f, 11.1856f, 18.4077f, 10.9995f, 17.5f, 10.9995f)
                curveTo(14.0531f, 10.9995f, 11.2329f, 13.6825f, 11.0137f, 17.074f)
                lineTo(5.6373f, 11.6975f)
                lineTo(4.1084f, 13.2121f)
                curveTo(3.8113f, 13.5064f, 3.8123f, 13.9869f, 4.1107f, 14.28f)
                lineTo(9.2098f, 19.2875f)
                curveTo(9.5045f, 19.5769f, 9.9778f, 19.5735f, 10.2684f, 19.2799f)
                lineTo(11.0717f, 18.4682f)
                curveTo(11.1581f, 19.0466f, 11.3208f, 19.6002f, 11.5491f, 20.1183f)
                lineTo(11.3345f, 20.3351f)
                curveTo(10.4628f, 21.2159f, 9.043f, 21.226f, 8.1588f, 20.3577f)
                lineTo(3.0597f, 15.3502f)
                curveTo(2.1645f, 14.4711f, 2.1613f, 13.0295f, 3.0527f, 12.1464f)
                lineTo(12.6511f, 2.6379f)
                close()
                moveTo(17.5f, 11.9995f)
                curveTo(18.1264f, 11.9995f, 18.7283f, 12.1043f, 19.2893f, 12.2971f)
                curveTo(21.4484f, 13.0396f, 23.0f, 15.0884f, 23.0f, 17.4995f)
                curveTo(23.0f, 20.5371f, 20.5376f, 22.9995f, 17.5f, 22.9995f)
                curveTo(15.109f, 22.9995f, 13.0743f, 21.4738f, 12.3165f, 19.3428f)
                curveTo(12.1116f, 18.7666f, 12.0f, 18.1461f, 12.0f, 17.4995f)
                curveTo(12.0f, 14.462f, 14.4624f, 11.9995f, 17.5f, 11.9995f)
                close()
            }
        }
        .build()
        return _eraserMedium!!
    }

private var _eraserMedium: ImageVector? = null
