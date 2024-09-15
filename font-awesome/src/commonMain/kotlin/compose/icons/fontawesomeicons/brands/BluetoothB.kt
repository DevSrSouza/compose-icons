package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.BluetoothB: ImageVector
    get() {
        if (_bluetoothB != null) {
            return _bluetoothB!!
        }
        _bluetoothB = Builder(name = "BluetoothB", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.48f, 260.02f)
                lineToRelative(92.63f, -103.33f)
                lineTo(143.13f, 0.0f)
                verticalLineToRelative(206.33f)
                lineToRelative(-86.11f, -86.11f)
                lineToRelative(-31.41f, 31.41f)
                lineToRelative(108.06f, 108.4f)
                lineTo(25.61f, 368.42f)
                lineToRelative(31.41f, 31.41f)
                lineToRelative(86.11f, -86.11f)
                lineTo(145.84f, 512.0f)
                lineToRelative(148.55f, -148.64f)
                lineToRelative(-97.91f, -103.33f)
                close()
                moveTo(237.34f, 157.03f)
                lineToRelative(-49.98f, 49.98f)
                lineToRelative(-0.34f, -100.29f)
                lineToRelative(50.31f, 50.32f)
                close()
                moveTo(187.36f, 313.04f)
                lineToRelative(49.98f, 49.98f)
                lineToRelative(-50.31f, 50.32f)
                lineToRelative(0.34f, -100.29f)
                close()
            }
        }
        .build()
        return _bluetoothB!!
    }

private var _bluetoothB: ImageVector? = null
