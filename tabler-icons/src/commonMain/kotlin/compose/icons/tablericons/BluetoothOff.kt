package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BluetoothOff: ImageVector
    get() {
        if (_bluetoothOff != null) {
            return _bluetoothOff!!
        }
        _bluetoothOff = Builder(name = "BluetoothOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.438f, 16.45f)
                lineToRelative(-4.438f, 3.55f)
                verticalLineToRelative(-8.0f)
                moveToRelative(0.0f, -4.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(5.0f, 4.0f)
                lineToRelative(-2.776f, 2.22f)
                moveToRelative(-2.222f, 1.779f)
                lineToRelative(-5.0f, 4.0f)
            }
        }
        .build()
        return _bluetoothOff!!
    }

private var _bluetoothOff: ImageVector? = null
