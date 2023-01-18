package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) {
            return _bluetoothConnected!!
        }
        _bluetoothConnected = Builder(name = "BluetoothConnected", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.4f, 172.8f)
                lineTo(126.7f, 128.0f)
                lineToRelative(59.7f, -44.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 188.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.6f, -3.2f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 116.0f, 32.0f)
                verticalLineToRelative(88.0f)
                lineTo(58.4f, 76.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 6.4f)
                lineTo(113.3f, 128.0f)
                lineTo(53.6f, 172.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.8f, 5.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 56.0f, 180.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                lineTo(116.0f, 136.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.2f, 3.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, 0.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(64.0f, -48.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 188.0f, 176.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 186.4f, 172.8f)
                close()
                moveTo(124.0f, 40.0f)
                lineToRelative(53.3f, 40.0f)
                lineTo(124.0f, 120.0f)
                close()
                moveTo(124.0f, 216.0f)
                lineTo(124.0f, 136.0f)
                lineToRelative(53.3f, 40.0f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 204.0f, 128.0f)
                close()
                moveTo(52.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 52.0f, 136.0f)
                close()
            }
        }
        .build()
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
