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
                moveTo(14.0f, 3.594f)
                lineTo(14.0f, 13.563f)
                lineTo(9.719f, 9.281f)
                lineTo(8.281f, 10.719f)
                lineTo(13.563f, 16.0f)
                lineTo(8.281f, 21.281f)
                lineTo(9.719f, 22.719f)
                lineTo(14.0f, 18.438f)
                lineTo(14.0f, 28.406f)
                lineTo(15.719f, 26.719f)
                lineTo(20.719f, 21.719f)
                lineTo(21.406f, 21.0f)
                lineTo(20.719f, 20.281f)
                lineTo(16.438f, 16.0f)
                lineTo(20.719f, 11.719f)
                lineTo(21.406f, 11.0f)
                lineTo(20.719f, 10.281f)
                lineTo(15.719f, 5.281f)
                close()
                moveTo(16.0f, 8.438f)
                lineTo(18.563f, 11.0f)
                lineTo(16.0f, 13.563f)
                close()
                moveTo(16.0f, 18.438f)
                lineTo(18.563f, 21.0f)
                lineTo(16.0f, 23.563f)
                close()
            }
        }
        .build()
        return _bluetoothB!!
    }

private var _bluetoothB: ImageVector? = null
