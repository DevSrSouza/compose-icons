package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(191.2f, 166.4f)
                lineTo(140.0f, 128.0f)
                lineToRelative(11.6f, -8.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -14.4f, -19.2f)
                lineTo(132.0f, 104.0f)
                verticalLineTo(56.0f)
                lineToRelative(5.2f, 3.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.4f, -19.2f)
                lineTo(127.2f, 22.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -12.5f, -1.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 108.0f, 32.0f)
                verticalLineToRelative(72.0f)
                lineTo(63.2f, 70.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.8f, 89.6f)
                lineTo(100.0f, 128.0f)
                lineTo(48.8f, 166.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.4f, 16.8f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 56.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.2f, -2.4f)
                lineTo(108.0f, 152.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.7f, 10.7f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 120.0f, 236.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.2f, -2.4f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -19.2f)
                close()
                moveTo(132.0f, 200.0f)
                verticalLineTo(152.0f)
                lineToRelative(32.0f, 24.0f)
                close()
                moveTo(240.5f, 95.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 116.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, -3.5f)
                lineTo(208.0f, 97.0f)
                lineToRelative(-15.5f, 15.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 116.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(191.0f, 80.0f)
                lineTo(175.5f, 64.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(208.0f, 63.0f)
                lineToRelative(15.5f, -15.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(225.0f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
