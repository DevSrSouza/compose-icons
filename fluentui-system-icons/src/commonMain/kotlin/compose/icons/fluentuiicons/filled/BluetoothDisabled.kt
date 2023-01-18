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

public val FilledGroup.BluetoothDisabled: ImageVector
    get() {
        if (_bluetoothDisabled != null) {
            return _bluetoothDisabled!!
        }
        _bluetoothDisabled = Builder(name = "BluetoothDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(10.0f, 11.0608f)
                verticalLineTo(11.6975f)
                lineTo(10.0054f, 11.702f)
                verticalLineTo(12.2916f)
                lineTo(8.085f, 13.8917f)
                curveTo(7.6607f, 14.2452f, 7.6033f, 14.8758f, 7.9568f, 15.3001f)
                curveTo(8.3104f, 15.7244f, 8.9409f, 15.7818f, 9.3652f, 15.4282f)
                lineTo(10.0054f, 14.8948f)
                verticalLineTo(20.0001f)
                curveTo(10.0054f, 20.9105f, 11.123f, 21.3473f, 11.7404f, 20.6782f)
                lineTo(15.5204f, 16.5813f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(12.0054f, 13.0663f)
                lineTo(14.1051f, 15.166f)
                lineTo(12.0054f, 17.4416f)
                verticalLineTo(13.0663f)
                close()
                moveTo(16.2163f, 9.72f)
                lineTo(14.4083f, 11.2265f)
                lineTo(12.9882f, 9.8064f)
                lineTo(14.1278f, 8.8569f)
                lineTo(12.0054f, 6.5577f)
                verticalLineTo(8.8236f)
                lineTo(10.0054f, 6.8236f)
                verticalLineTo(4.0001f)
                curveTo(10.0054f, 3.0898f, 11.1228f, 2.6529f, 11.7403f, 3.3218f)
                lineTo(16.311f, 8.2735f)
                curveTo(16.6992f, 8.6939f, 16.656f, 9.3538f, 16.2163f, 9.72f)
                close()
            }
        }
        .build()
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
