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

public val BoldGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.9f, 207.9f)
                lineToRelative(-31.4f, -34.5f)
                horizontalLineToRelative(0.0f)
                lineTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(107.0f, 122.7f)
                lineTo(48.8f, 166.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.4f, 16.8f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 56.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.2f, -2.4f)
                lineTo(108.0f, 152.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.7f, 10.7f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 120.0f, 236.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 7.2f, -2.4f)
                lineToRelative(47.9f, -35.9f)
                lineToRelative(24.0f, 26.4f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 208.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.9f, -20.1f)
                close()
                moveTo(132.0f, 200.0f)
                verticalLineTo(150.2f)
                lineToRelative(26.9f, 29.6f)
                close()
                moveTo(108.0f, 59.7f)
                verticalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.7f, -10.7f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 12.5f, 1.1f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 19.2f)
                lineToRelative(-27.1f, 20.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -14.4f, -19.2f)
                lineTo(164.0f, 80.0f)
                lineTo(132.0f, 56.0f)
                verticalLineToRelative(3.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
