package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 140.0f)
                close()
                moveTo(192.0f, 176.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -3.2f, 6.4f)
                lineToRelative(-64.0f, 48.0f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 120.0f, 232.0f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, -3.6f, -0.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 112.0f, 224.0f)
                lineTo(112.0f, 144.0f)
                lineTo(60.8f, 182.4f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 56.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.8f, -14.4f)
                lineTo(106.7f, 128.0f)
                lineTo(51.2f, 86.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, -12.8f)
                lineTo(112.0f, 112.0f)
                lineTo(112.0f, 32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 4.4f, -7.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.4f, 0.7f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                lineTo(133.3f, 128.0f)
                lineToRelative(55.5f, 41.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 192.0f, 176.0f)
                close()
                moveTo(128.0f, 112.0f)
                lineTo(170.7f, 80.0f)
                lineTo(128.0f, 48.0f)
                close()
                moveTo(170.7f, 176.0f)
                lineTo(128.0f, 144.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(196.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 116.0f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
