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
                moveTo(196.48f, 260.023f)
                lineToRelative(92.626f, -103.333f)
                lineTo(143.125f, 0.0f)
                verticalLineToRelative(206.33f)
                lineToRelative(-86.111f, -86.111f)
                lineToRelative(-31.406f, 31.405f)
                lineToRelative(108.061f, 108.399f)
                lineTo(25.608f, 368.422f)
                lineToRelative(31.406f, 31.405f)
                lineToRelative(86.111f, -86.111f)
                lineTo(145.84f, 512.0f)
                lineToRelative(148.552f, -148.644f)
                lineToRelative(-97.912f, -103.333f)
                close()
                moveTo(237.34f, 157.027f)
                lineToRelative(-49.977f, 49.978f)
                lineToRelative(-0.338f, -100.295f)
                lineToRelative(50.315f, 50.317f)
                close()
                moveTo(187.363f, 313.04f)
                lineToRelative(49.977f, 49.978f)
                lineToRelative(-50.315f, 50.316f)
                lineToRelative(0.338f, -100.294f)
                close()
            }
        }
        .build()
        return _bluetoothB!!
    }

private var _bluetoothB: ImageVector? = null
