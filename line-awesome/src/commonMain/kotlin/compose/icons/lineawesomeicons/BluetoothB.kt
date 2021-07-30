package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BluetoothB: ImageVector
    get() {
        if (_bluetoothB != null) {
            return _bluetoothB!!
        }
        _bluetoothB = Builder(name = "BluetoothB", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.5938f)
                lineTo(14.0f, 13.5625f)
                lineTo(9.7188f, 9.2813f)
                lineTo(8.2813f, 10.7188f)
                lineTo(13.5625f, 16.0f)
                lineTo(8.2813f, 21.2813f)
                lineTo(9.7188f, 22.7188f)
                lineTo(14.0f, 18.4375f)
                lineTo(14.0f, 28.4063f)
                lineTo(15.7188f, 26.7188f)
                lineTo(20.7188f, 21.7188f)
                lineTo(21.4063f, 21.0f)
                lineTo(20.7188f, 20.2813f)
                lineTo(16.4375f, 16.0f)
                lineTo(20.7188f, 11.7188f)
                lineTo(21.4063f, 11.0f)
                lineTo(20.7188f, 10.2813f)
                lineTo(15.7188f, 5.2813f)
                close()
                moveTo(16.0f, 8.4375f)
                lineTo(18.5625f, 11.0f)
                lineTo(16.0f, 13.5625f)
                close()
                moveTo(16.0f, 18.4375f)
                lineTo(18.5625f, 21.0f)
                lineTo(16.0f, 23.5625f)
                close()
            }
        }
        .build()
        return _bluetoothB!!
    }

private var _bluetoothB: ImageVector? = null
