package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.BluetoothSlash: ImageVector
    get() {
        if (_bluetoothSlash != null) {
            return _bluetoothSlash!!
        }
        _bluetoothSlash = Builder(name = "BluetoothSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 32.0f)
                lineToRelative(64.0f, 48.0f)
                lineToRelative(-64.0f, 48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(120.0f, 128.0f)
                lineToRelative(64.0f, 48.0f)
                lineToRelative(-64.0f, 48.0f)
                lineToRelative(0.0f, -96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 210.6f)
                lineToRelative(-31.4f, -34.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-31.4f, -34.5f)
                horizontalLineToRelative(0.0f)
                lineTo(54.0f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(113.0f, 123.3f)
                lineTo(51.2f, 169.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 56.0f, 184.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineTo(112.0f, 144.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.5f, 7.2f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.5f, 0.8f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineToRelative(50.9f, -38.1f)
                lineToRelative(26.4f, 29.1f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 5.4f, -2.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 214.0f, 210.6f)
                close()
                moveTo(128.0f, 208.0f)
                verticalLineTo(144.0f)
                lineToRelative(11.8f, 8.8f)
                lineToRelative(25.0f, 27.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 79.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(48.0f)
                lineToRelative(42.7f, 32.0f)
                lineToRelative(-25.0f, 18.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.8f, 14.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, -1.6f)
                lineToRelative(33.5f, -25.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                lineToRelative(-64.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 32.0f)
                verticalLineTo(71.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 79.6f)
                close()
            }
        }
        .build()
        return _bluetoothSlash!!
    }

private var _bluetoothSlash: ImageVector? = null
