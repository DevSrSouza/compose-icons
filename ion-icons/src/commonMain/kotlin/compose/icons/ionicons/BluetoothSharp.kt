package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BluetoothSharp: ImageVector
    get() {
        if (_bluetoothSharp != null) {
            return _bluetoothSharp!!
        }
        _bluetoothSharp = Builder(name = "BluetoothSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(397.41f, 161.13f)
                lineTo(236.0f, -0.28f)
                verticalLineToRelative(212.8f)
                lineTo(141.83f, 131.8f)
                lineToRelative(-26.0f, 30.37f)
                lineTo(225.27f, 256.0f)
                lineTo(115.8f, 349.83f)
                lineToRelative(26.0f, 30.37f)
                lineTo(236.0f, 299.48f)
                verticalLineToRelative(212.8f)
                lineTo(397.41f, 350.87f)
                lineTo(286.73f, 256.0f)
                close()
                moveTo(276.0f, 96.28f)
                lineToRelative(62.59f, 62.59f)
                lineTo(276.0f, 212.52f)
                close()
                moveTo(338.58f, 353.13f)
                lineTo(276.0f, 415.72f)
                lineTo(276.0f, 299.48f)
                close()
            }
        }
        .build()
        return _bluetoothSharp!!
    }

private var _bluetoothSharp: ImageVector? = null
