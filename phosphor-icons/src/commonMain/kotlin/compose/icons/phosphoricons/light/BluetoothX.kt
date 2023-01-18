package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) {
            return _bluetoothX!!
        }
        _bluetoothX = Builder(name = "BluetoothX", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.6f, 171.2f)
                lineTo(130.0f, 128.0f)
                lineToRelative(25.6f, -19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.2f, -8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.4f, -1.2f)
                lineTo(126.0f, 116.0f)
                verticalLineTo(44.0f)
                lineToRelative(22.4f, 16.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 7.2f, -9.6f)
                lineToRelative(-32.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.3f, -0.6f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 114.0f, 32.0f)
                verticalLineToRelative(84.0f)
                lineTo(59.6f, 75.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.2f, 9.6f)
                lineTo(110.0f, 128.0f)
                lineTo(52.4f, 171.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.2f, 8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 1.2f)
                lineTo(114.0f, 140.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.3f, 5.4f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, 0.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.6f, -1.2f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                close()
                moveTo(126.0f, 212.0f)
                verticalLineTo(140.0f)
                lineToRelative(48.0f, 36.0f)
                close()
                moveTo(236.3f, 99.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.4f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 232.0f, 110.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.2f, -1.8f)
                lineTo(208.0f, 88.5f)
                lineToRelative(-19.7f, 19.7f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 184.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -10.2f)
                lineTo(199.5f, 80.0f)
                lineTo(179.8f, 60.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.5f, 0.0f)
                lineTo(208.0f, 71.5f)
                lineToRelative(19.8f, -19.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, 8.4f)
                lineTo(216.5f, 80.0f)
                close()
            }
        }
        .build()
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
