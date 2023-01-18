package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ShoppingBasketFill: ImageVector
    get() {
        if (_shoppingBasketFill != null) {
            return _shoppingBasketFill!!
        }
        _shoppingBasketFill = Builder(name = "ShoppingBasketFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.167f)
                lineToRelative(-0.757f, 9.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, 0.917f)
                lineTo(4.92f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, -0.917f)
                lineTo(3.166f, 11.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(6.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.995f, 3.8f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, -3.995f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shoppingBasketFill!!
    }

private var _shoppingBasketFill: ImageVector? = null
