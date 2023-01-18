package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 210.6f)
                lineToRelative(-31.4f, -34.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-31.3f, -34.5f)
                horizontalLineToRelative(-0.1f)
                lineTo(53.9f, 34.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.5f, 11.3f)
                lineToRelative(70.8f, 77.9f)
                lineTo(51.2f, 169.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 184.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineTo(112.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.4f, 7.2f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, 3.6f, 0.8f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineToRelative(50.8f, -38.1f)
                lineToRelative(26.5f, 29.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 0.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 213.9f, 210.6f)
                close()
                moveTo(128.0f, 208.0f)
                verticalLineTo(144.0f)
                lineToRelative(11.8f, 8.8f)
                lineToRelative(25.0f, 27.6f)
                close()
                moveTo(112.0f, 71.6f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                lineToRelative(-33.5f, 25.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -4.8f, 1.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.4f, -3.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 1.6f, -11.2f)
                lineToRelative(25.0f, -18.7f)
                lineTo(128.0f, 48.0f)
                verticalLineTo(71.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
