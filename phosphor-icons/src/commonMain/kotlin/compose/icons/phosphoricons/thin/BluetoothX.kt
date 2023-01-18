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

public val ThinGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.4f, 172.8f)
                lineTo(126.7f, 128.0f)
                lineToRelative(27.7f, -20.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.8f, -6.4f)
                lineTo(124.0f, 120.0f)
                verticalLineTo(40.0f)
                lineToRelative(25.6f, 19.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, -6.4f)
                lineToRelative(-32.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, -0.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 116.0f, 32.0f)
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
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f)
                close()
                moveTo(124.0f, 216.0f)
                verticalLineTo(136.0f)
                lineToRelative(53.3f, 40.0f)
                close()
                moveTo(234.8f, 101.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 232.0f, 108.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                lineTo(208.0f, 85.7f)
                lineToRelative(-21.2f, 21.1f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 184.0f, 108.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(202.3f, 80.0f)
                lineTo(181.2f, 58.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(208.0f, 74.3f)
                lineToRelative(21.2f, -21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                lineTo(213.7f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
