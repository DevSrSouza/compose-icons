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

public val LightGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.5f, 212.0f)
                lineToRelative(-31.4f, -34.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-31.4f, -34.5f)
                horizontalLineToRelative(0.0f)
                lineTo(52.5f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.5f, -0.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -0.4f, 8.4f)
                lineToRelative(72.3f, 79.6f)
                lineTo(52.4f, 171.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.2f, 8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 1.2f)
                lineTo(114.0f, 140.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.3f, 5.4f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, 0.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.6f, -1.2f)
                lineToRelative(52.3f, -39.2f)
                lineTo(203.6f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.1f, -1.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.5f, 212.0f)
                close()
                moveTo(126.0f, 212.0f)
                verticalLineTo(140.0f)
                lineToRelative(15.1f, 11.3f)
                lineToRelative(26.7f, 29.4f)
                close()
                moveTo(114.0f, 71.6f)
                verticalLineTo(32.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 3.3f, -5.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.3f, 0.6f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 9.6f)
                lineToRelative(-33.5f, 25.1f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -3.6f, 1.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.6f, -10.8f)
                lineTo(174.0f, 80.0f)
                lineTo(126.0f, 44.0f)
                verticalLineTo(71.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
