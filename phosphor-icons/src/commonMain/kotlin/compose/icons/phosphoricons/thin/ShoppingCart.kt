package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.8f, 131.6f)
                lineToRelative(12.1f, -66.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -0.8f, -3.3f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 216.0f, 60.0f)
                lineTo(51.3f, 60.0f)
                lineTo(45.9f, 29.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 34.1f, 20.0f)
                lineTo(16.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(34.1f, 28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 38.0f, 31.3f)
                lineTo(65.9f, 184.6f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 32.0f, 3.4f)
                horizontalLineToRelative(68.2f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 17.9f, -8.0f)
                lineTo(73.2f, 180.0f)
                lineToRelative(-5.9f, -32.0f)
                lineTo(188.1f, 148.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 207.8f, 131.6f)
                close()
                moveTo(96.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 96.0f, 204.0f)
                close()
                moveTo(200.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 204.0f)
                close()
                moveTo(52.8f, 68.0f)
                lineTo(211.2f, 68.0f)
                lineToRelative(-11.3f, 62.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -11.8f, 9.9f)
                lineTo(65.9f, 140.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
