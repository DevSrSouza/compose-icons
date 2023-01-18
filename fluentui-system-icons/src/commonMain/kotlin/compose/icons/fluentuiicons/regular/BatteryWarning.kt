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

public val RegularGroup.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) {
            return _batteryWarning!!
        }
        _batteryWarning = Builder(name = "BatteryWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.244f, 11.2001f)
                curveTo(8.4754f, 11.3327f, 8.6673f, 11.5245f, 8.7999f, 11.756f)
                lineTo(12.8092f, 18.7544f)
                curveTo(13.221f, 19.4732f, 12.9721f, 20.3897f, 12.2533f, 20.8015f)
                curveTo(12.0263f, 20.9316f, 11.7693f, 21.0f, 11.5077f, 21.0f)
                horizontalLineTo(3.489f)
                curveTo(2.6606f, 21.0f, 1.989f, 20.3284f, 1.989f, 19.5f)
                curveTo(1.989f, 19.2384f, 2.0574f, 18.9813f, 2.1875f, 18.7544f)
                lineTo(6.1968f, 11.756f)
                curveTo(6.6086f, 11.0371f, 7.5252f, 10.7883f, 8.244f, 11.2001f)
                close()
                moveTo(7.5f, 18.0f)
                curveTo(7.2239f, 18.0f, 7.0f, 18.2239f, 7.0f, 18.5f)
                curveTo(7.0f, 18.7761f, 7.2239f, 19.0f, 7.5f, 19.0f)
                curveTo(7.7762f, 19.0f, 8.0f, 18.7761f, 8.0f, 18.5f)
                curveTo(8.0f, 18.2239f, 7.7762f, 18.0f, 7.5f, 18.0f)
                close()
                moveTo(17.0f, 6.0f)
                curveTo(18.6569f, 6.0f, 20.0f, 7.3432f, 20.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0004f)
                curveTo(21.1825f, 10.0f, 21.3533f, 10.0487f, 21.5004f, 10.1338f)
                curveTo(21.7993f, 10.3067f, 22.0004f, 10.6299f, 22.0004f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0004f, 13.3701f, 21.7993f, 13.6933f, 21.5004f, 13.8662f)
                curveTo(21.3533f, 13.9513f, 21.1825f, 14.0f, 21.0004f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 16.6569f, 18.6569f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(13.529f)
                lineTo(12.67f, 16.5f)
                horizontalLineTo(16.9982f)
                curveTo(17.7779f, 16.5f, 18.4186f, 15.9051f, 18.4913f, 15.1445f)
                lineTo(18.4982f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.4982f, 8.2203f, 17.9033f, 7.5795f, 17.1426f, 7.5069f)
                lineTo(16.9982f, 7.5f)
                horizontalLineTo(4.9997f)
                curveTo(4.22f, 7.5f, 3.5793f, 8.0949f, 3.5066f, 8.8555f)
                lineTo(3.4997f, 9.0f)
                lineTo(3.499f, 14.453f)
                lineTo(2.3644f, 16.4347f)
                curveTo(2.1318f, 16.0085f, 1.9997f, 15.5197f, 1.9997f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.9997f, 7.3432f, 3.3428f, 6.0f, 4.9997f, 6.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.4984f, 13.0f)
                curveTo(7.2529f, 13.0f, 7.0487f, 13.1769f, 7.0064f, 13.4101f)
                lineTo(6.9984f, 13.5f)
                verticalLineTo(16.5f)
                lineTo(7.0064f, 16.5899f)
                curveTo(7.0487f, 16.8231f, 7.2529f, 17.0f, 7.4984f, 17.0f)
                curveTo(7.7438f, 17.0f, 7.948f, 16.8231f, 7.9903f, 16.5899f)
                lineTo(7.9984f, 16.5f)
                verticalLineTo(13.5f)
                lineTo(7.9903f, 13.4101f)
                curveTo(7.948f, 13.1769f, 7.7438f, 13.0f, 7.4984f, 13.0f)
                close()
            }
        }
        .build()
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
