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

public val FilledGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0055f, 9.0977f)
                verticalLineTo(4.0001f)
                curveTo(10.0055f, 3.1277f, 11.0317f, 2.6901f, 11.6607f, 3.2439f)
                lineTo(11.7403f, 3.3218f)
                lineTo(16.3111f, 8.2735f)
                curveTo(16.6715f, 8.6639f, 16.66f, 9.2607f, 16.3046f, 9.6372f)
                lineTo(16.2164f, 9.72f)
                lineTo(13.4827f, 11.9978f)
                lineTo(16.2168f, 14.2782f)
                curveTo(16.6247f, 14.6183f, 16.6909f, 15.2112f, 16.3878f, 15.6307f)
                lineTo(16.3113f, 15.7242f)
                lineTo(11.7405f, 20.6782f)
                curveTo(11.1488f, 21.3194f, 10.0978f, 20.945f, 10.0112f, 20.1113f)
                lineTo(10.0055f, 20.0001f)
                verticalLineTo(14.8948f)
                lineTo(9.3653f, 15.4282f)
                curveTo(8.941f, 15.7818f, 8.3104f, 15.7244f, 7.9569f, 15.3001f)
                curveTo(7.6306f, 14.9084f, 7.6544f, 14.341f, 7.9937f, 13.978f)
                lineTo(8.0851f, 13.8917f)
                lineTo(10.0055f, 12.2916f)
                verticalLineTo(11.702f)
                lineTo(8.0847f, 10.1f)
                curveTo(7.6606f, 9.7462f, 7.6035f, 9.1156f, 7.9573f, 8.6915f)
                curveTo(8.2838f, 8.3f, 8.8462f, 8.2212f, 9.2644f, 8.4897f)
                lineTo(9.3657f, 8.564f)
                lineTo(10.0055f, 9.0977f)
                verticalLineTo(4.0001f)
                verticalLineTo(9.0977f)
                close()
                moveTo(12.0055f, 13.3701f)
                verticalLineTo(17.4416f)
                lineTo(14.1284f, 15.1407f)
                lineTo(12.0055f, 13.3701f)
                close()
                moveTo(17.0f, 11.0001f)
                curveTo(17.5523f, 11.0001f, 18.0f, 11.4478f, 18.0f, 12.0001f)
                curveTo(18.0f, 12.5523f, 17.5523f, 13.0001f, 17.0f, 13.0001f)
                curveTo(16.4477f, 13.0001f, 16.0f, 12.5523f, 16.0f, 12.0001f)
                curveTo(16.0f, 11.4478f, 16.4477f, 11.0001f, 17.0f, 11.0001f)
                close()
                moveTo(6.0f, 11.0001f)
                curveTo(6.5523f, 11.0001f, 7.0f, 11.4478f, 7.0f, 12.0001f)
                curveTo(7.0f, 12.5523f, 6.5523f, 13.0001f, 6.0f, 13.0001f)
                curveTo(5.4477f, 13.0001f, 5.0f, 12.5523f, 5.0f, 12.0001f)
                curveTo(5.0f, 11.4478f, 5.4477f, 11.0001f, 6.0f, 11.0001f)
                close()
                moveTo(12.0055f, 6.5577f)
                verticalLineTo(10.6252f)
                lineTo(14.1279f, 8.8569f)
                lineTo(12.0055f, 6.5577f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
