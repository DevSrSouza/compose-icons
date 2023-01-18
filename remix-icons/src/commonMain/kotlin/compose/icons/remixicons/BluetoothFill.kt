package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BluetoothFill: ImageVector
    get() {
        if (_bluetoothFill != null) {
            return _bluetoothFill!!
        }
        _bluetoothFill = Builder(name = "BluetoothFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.341f, 12.03f)
                lineToRelative(4.343f, 4.343f)
                lineToRelative(-5.656f, 5.656f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.686f)
                lineToRelative(-4.364f, 4.364f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(5.779f, -5.778f)
                verticalLineToRelative(-0.97f)
                lineTo(5.249f, 5.765f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(4.364f, 4.364f)
                lineTo(11.028f, 2.029f)
                horizontalLineToRelative(2.0f)
                lineToRelative(5.656f, 5.657f)
                lineToRelative(-4.343f, 4.343f)
                close()
                moveTo(13.028f, 13.544f)
                verticalLineToRelative(5.657f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(-2.828f, -2.829f)
                close()
                moveTo(13.028f, 10.514f)
                lineToRelative(2.828f, -2.828f)
                lineToRelative(-2.828f, -2.828f)
                verticalLineToRelative(5.657f)
                close()
            }
        }
        .build()
        return _bluetoothFill!!
    }

private var _bluetoothFill: ImageVector? = null
