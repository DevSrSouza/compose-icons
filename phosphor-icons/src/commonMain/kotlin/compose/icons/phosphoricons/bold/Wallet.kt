package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 144.0f)
                close()
                moveTo(236.0f, 96.0f)
                lineTo(236.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(28.0f, 68.2f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 60.0f, 36.0f)
                lineTo(192.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(60.0f, 60.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -5.8f, 2.4f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 52.0f, 68.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.2f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 60.5f, 76.0f)
                lineTo(216.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 236.0f, 96.0f)
                close()
                moveTo(212.0f, 100.0f)
                lineTo(60.5f, 100.0f)
                arcTo(33.5f, 33.5f, 0.0f, false, true, 52.0f, 98.9f)
                lineTo(52.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(212.0f, 196.0f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null
