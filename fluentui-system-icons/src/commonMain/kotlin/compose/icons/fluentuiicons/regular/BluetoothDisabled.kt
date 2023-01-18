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

public val RegularGroup.BluetoothDisabled: ImageVector
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
                verticalLineTo(11.5577f)
                lineTo(10.0044f, 11.5614f)
                verticalLineTo(12.4321f)
                lineTo(7.9237f, 14.1657f)
                curveTo(7.6055f, 14.4309f, 7.5625f, 14.9038f, 7.8276f, 15.222f)
                curveTo(8.0928f, 15.5403f, 8.5657f, 15.5833f, 8.8839f, 15.3181f)
                lineTo(10.0044f, 14.3845f)
                verticalLineTo(20.2466f)
                curveTo(10.0044f, 20.9295f, 10.8426f, 21.2571f, 11.3057f, 20.7552f)
                lineTo(15.3313f, 16.3922f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(11.5022f, 12.5631f)
                lineTo(14.2698f, 15.3307f)
                lineTo(11.5044f, 18.3278f)
                verticalLineTo(13.1348f)
                lineTo(11.5022f, 12.5631f)
                close()
                moveTo(15.9462f, 9.434f)
                lineTo(14.1295f, 10.9477f)
                lineTo(13.0644f, 9.8826f)
                lineTo(14.3798f, 8.7867f)
                lineTo(11.5044f, 5.6717f)
                verticalLineTo(8.3226f)
                lineTo(10.0044f, 6.8226f)
                verticalLineTo(3.7535f)
                curveTo(10.0044f, 3.0707f, 10.8425f, 2.7431f, 11.3055f, 3.2448f)
                lineTo(16.0172f, 8.3491f)
                curveTo(16.3083f, 8.6644f, 16.2759f, 9.1593f, 15.9462f, 9.434f)
                close()
            }
        }
        .build()
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
