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

public val BoldGroup.ShoppingCartSimple: ImageVector
    get() {
        if (_shoppingCartSimple != null) {
            return _shoppingCartSimple!!
        }
        _shoppingCartSimple = Builder(name = "ShoppingCartSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 100.0f, 216.0f)
                close()
                moveTo(184.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 184.0f, 196.0f)
                close()
                moveTo(233.3f, 75.3f)
                lineToRelative(-24.2f, 84.4f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 182.2f, 180.0f)
                lineTo(81.8f, 180.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -26.9f, -20.3f)
                lineTo(30.8f, 75.5f)
                curveToRelative(0.0f, -0.1f, -0.1f, -0.3f, -0.1f, -0.4f)
                lineTo(21.8f, 44.0f)
                lineTo(12.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(24.8f, 20.0f)
                arcTo(20.3f, 20.3f, 0.0f, false, true, 44.1f, 34.5f)
                lineTo(51.3f, 60.0f)
                lineTo(221.7f, 60.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 11.6f, 15.3f)
                close()
                moveTo(205.8f, 84.0f)
                lineTo(58.2f, 84.0f)
                lineToRelative(19.7f, 69.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, 2.9f)
                lineTo(182.2f, 156.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, -2.9f)
                close()
            }
        }
        .build()
        return _shoppingCartSimple!!
    }

private var _shoppingCartSimple: ImageVector? = null
