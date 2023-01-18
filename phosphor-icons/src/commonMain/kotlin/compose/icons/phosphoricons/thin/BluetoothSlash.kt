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

public val ThinGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 213.3f)
                lineToRelative(-62.8f, -69.1f)
                horizontalLineToRelative(0.0f)
                lineTo(51.0f, 37.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -5.7f, -0.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.2f, 5.7f)
                lineToRelative(74.0f, 81.4f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-64.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.8f, 5.6f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 56.0f, 180.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.4f, -0.8f)
                lineTo(116.0f, 136.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.2f, 3.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 1.8f, 0.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(53.7f, -40.3f)
                lineToRelative(29.0f, 31.8f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 208.0f, 220.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.7f, -1.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 211.0f, 213.3f)
                close()
                moveTo(124.0f, 216.0f)
                verticalLineTo(136.0f)
                lineToRelative(18.5f, 13.9f)
                lineTo(170.7f, 181.0f)
                close()
                moveTo(116.0f, 71.6f)
                verticalLineTo(32.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.2f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, 0.4f)
                lineToRelative(64.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 6.4f)
                lineToRelative(-33.5f, 25.1f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -2.4f, 0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.2f, -1.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.8f, -5.6f)
                lineTo(177.3f, 80.0f)
                lineTo(124.0f, 40.0f)
                verticalLineTo(71.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
