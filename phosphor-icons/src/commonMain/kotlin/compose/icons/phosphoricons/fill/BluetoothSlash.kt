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

public val FillGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 232.0f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, -3.6f, -0.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 112.0f, 224.0f)
                lineTo(112.0f, 144.0f)
                lineTo(60.8f, 182.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.2f, -1.6f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 1.6f, -11.2f)
                lineTo(113.0f, 123.3f)
                lineTo(42.1f, 45.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.5f, -11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 11.3f, 0.5f)
                lineTo(151.0f, 141.4f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(31.3f, 34.5f)
                horizontalLineToRelative(0.2f)
                lineToRelative(31.2f, 34.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.8f, 10.8f)
                lineToRelative(-26.4f, -29.1f)
                lineToRelative(-50.9f, 38.1f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 120.0f, 232.0f)
                close()
                moveTo(128.0f, 144.0f)
                verticalLineToRelative(64.0f)
                lineToRelative(36.8f, -27.6f)
                lineToRelative(-25.0f, -27.6f)
                close()
                moveTo(150.5f, 113.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.8f, -14.4f)
                lineToRelative(25.0f, -18.7f)
                lineTo(128.0f, 48.0f)
                lineTo(128.0f, 71.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(112.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f)
                lineToRelative(-33.5f, 25.1f)
                arcTo(7.7f, 7.7f, 0.0f, false, true, 150.5f, 113.1f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
