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

public val BoldGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.6f, 133.0f)
                lineToRelative(12.2f, -66.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 52.0f)
                lineTo(58.0f, 52.0f)
                lineTo(53.7f, 28.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 34.1f, 12.0f)
                lineTo(16.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(30.7f, 36.0f)
                lineTo(57.2f, 181.6f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 112.0f, 204.0f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, false, -1.0f, -8.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, false, -1.0f, 8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, -32.0f)
                lineTo(79.8f, 172.0f)
                lineToRelative(-2.9f, -16.0f)
                lineTo(188.1f, 156.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 215.6f, 133.0f)
                close()
                moveTo(88.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 204.0f)
                close()
                moveTo(184.0f, 212.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 212.0f)
                close()
                moveTo(62.4f, 76.0f)
                lineTo(201.6f, 76.0f)
                lineTo(192.0f, 128.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, 3.3f)
                lineTo(72.6f, 132.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
