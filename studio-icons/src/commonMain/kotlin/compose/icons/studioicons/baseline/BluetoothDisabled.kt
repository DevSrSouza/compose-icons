package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.BluetoothDisabled: ImageVector
    get() {
        if (_bluetoothDisabled != null) {
            return _bluetoothDisabled!!
        }
        _bluetoothDisabled = Builder(name = "BluetoothDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.83f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(-1.6f, 1.6f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.02f, -3.02f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.03f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-3.2f)
                close()
                moveTo(5.41f, 4.0f)
                lineTo(4.0f, 5.41f)
                lineTo(10.59f, 12.0f)
                lineTo(5.0f, 17.59f)
                lineTo(6.41f, 19.0f)
                lineTo(11.0f, 14.41f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(4.29f, -4.29f)
                lineToRelative(2.3f, 2.29f)
                lineTo(20.0f, 18.59f)
                lineTo(5.41f, 4.0f)
                close()
                moveTo(13.0f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                lineTo(13.0f, 18.17f)
                close()
            }
        }
        .build()
        return _bluetoothDisabled!!
    }

private var _bluetoothDisabled: ImageVector? = null
