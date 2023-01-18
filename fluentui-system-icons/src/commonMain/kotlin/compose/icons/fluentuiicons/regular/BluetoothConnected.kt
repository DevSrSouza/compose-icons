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

public val RegularGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0043f, 9.6081f)
                verticalLineTo(3.7535f)
                curveTo(10.0043f, 3.1067f, 10.7564f, 2.7785f, 11.2293f, 3.1724f)
                lineTo(11.3054f, 3.2448f)
                lineTo(16.017f, 8.3491f)
                curveTo(16.2839f, 8.6381f, 16.2789f, 9.078f, 16.0223f, 9.361f)
                lineTo(15.946f, 9.434f)
                lineTo(12.8692f, 11.9976f)
                lineTo(15.9463f, 14.564f)
                curveTo(16.2483f, 14.8159f, 16.3006f, 15.2524f, 16.0832f, 15.5663f)
                lineTo(16.0172f, 15.6486f)
                lineTo(11.3055f, 20.7552f)
                curveTo(10.8668f, 21.2307f, 10.0915f, 20.9616f, 10.0111f, 20.3514f)
                lineTo(10.0043f, 20.2466f)
                verticalLineTo(14.3845f)
                lineTo(8.8837f, 15.3181f)
                curveTo(8.5655f, 15.5833f, 8.0926f, 15.5402f, 7.8274f, 15.222f)
                curveTo(7.5864f, 14.9327f, 7.6001f, 14.5156f, 7.8436f, 14.2429f)
                lineTo(7.9236f, 14.1657f)
                lineTo(10.0043f, 12.4321f)
                verticalLineTo(11.5614f)
                lineTo(7.9233f, 9.8257f)
                curveTo(7.6052f, 9.5604f, 7.5624f, 9.0875f, 7.8277f, 8.7694f)
                curveTo(8.0689f, 8.4802f, 8.4817f, 8.4185f, 8.7937f, 8.609f)
                lineTo(8.884f, 8.6738f)
                lineTo(10.0043f, 9.6081f)
                verticalLineTo(3.7535f)
                verticalLineTo(9.6081f)
                close()
                moveTo(11.6976f, 12.9737f)
                lineTo(11.5043f, 13.1348f)
                verticalLineTo(18.3278f)
                lineTo(14.38f, 15.2109f)
                lineTo(11.6976f, 12.9737f)
                close()
                moveTo(17.0f, 11.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 11.4478f, 18.0f, 12.0f)
                curveTo(18.0f, 12.5523f, 17.5523f, 13.0f, 17.0f, 13.0f)
                curveTo(16.4477f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4478f, 16.4477f, 11.0f, 17.0f, 11.0f)
                close()
                moveTo(6.0f, 11.0f)
                curveTo(6.5523f, 11.0f, 7.0f, 11.4478f, 7.0f, 12.0f)
                curveTo(7.0f, 12.5523f, 6.5523f, 13.0f, 6.0f, 13.0f)
                curveTo(5.4477f, 13.0f, 5.0f, 12.5523f, 5.0f, 12.0f)
                curveTo(5.0f, 11.4478f, 5.4477f, 11.0f, 6.0f, 11.0f)
                close()
                moveTo(11.5043f, 5.6717f)
                verticalLineTo(10.8592f)
                lineTo(11.6981f, 11.0208f)
                lineTo(14.3796f, 8.7867f)
                lineTo(11.5043f, 5.6717f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
