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

public val ThinGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 216.0f)
                close()
                moveTo(184.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 204.0f)
                close()
                moveTo(225.6f, 73.1f)
                lineToRelative(-26.4f, 92.4f)
                arcTo(20.3f, 20.3f, 0.0f, false, true, 179.9f, 180.0f)
                lineTo(84.1f, 180.0f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, true, -19.3f, -14.5f)
                lineTo(38.5f, 73.2f)
                lineTo(38.5f, 73.0f)
                lineTo(28.7f, 38.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 24.8f, 36.0f)
                lineTo(8.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(24.8f, 28.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 11.6f, 8.7f)
                lineTo(45.3f, 68.0f)
                lineTo(221.7f, 68.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.2f, 1.6f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 225.6f, 73.1f)
                close()
                moveTo(216.4f, 76.0f)
                lineTo(47.6f, 76.0f)
                lineToRelative(24.9f, 87.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 84.1f, 172.0f)
                horizontalLineToRelative(95.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 11.6f, -8.7f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
