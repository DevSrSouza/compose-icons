package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.7f, 131.9f)
                lineToRelative(12.2f, -66.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -1.3f, -4.9f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 216.0f, 58.0f)
                lineTo(53.0f, 58.0f)
                lineTo(47.8f, 29.5f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 34.1f, 18.0f)
                lineTo(16.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(34.1f, 30.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 36.0f, 31.6f)
                lineTo(63.7f, 183.8f)
                arcTo(26.0f, 26.0f, 0.0f, true, false, 106.0f, 204.0f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -4.1f, -14.0f)
                horizontalLineToRelative(60.2f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -4.1f, 14.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, -26.0f)
                lineTo(74.8f, 178.0f)
                lineToRelative(-5.1f, -28.0f)
                lineTo(188.1f, 150.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 209.7f, 131.9f)
                close()
                moveTo(94.0f, 204.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 94.0f, 204.0f)
                close()
                moveTo(198.0f, 204.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 198.0f, 204.0f)
                close()
                moveTo(55.2f, 70.0f)
                lineTo(208.8f, 70.0f)
                lineToRelative(-10.9f, 59.8f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -9.8f, 8.2f)
                lineTo(67.6f, 138.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
