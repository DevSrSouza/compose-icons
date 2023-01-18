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

public val RemixIcons.ShoppingBasket2Line: ImageVector
    get() {
        if (_shoppingBasket2Line != null) {
            return _shoppingBasket2Line!!
        }
        _shoppingBasket2Line = Builder(name = "ShoppingBasket2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.366f, 3.438f)
                lineTo(18.577f, 9.0f)
                lineTo(22.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.167f)
                lineToRelative(-0.757f, 9.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, 0.917f)
                lineTo(4.92f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.996f, -0.917f)
                lineTo(3.166f, 11.0f)
                lineTo(2.0f, 11.0f)
                lineTo(2.0f, 9.0f)
                horizontalLineToRelative(3.422f)
                lineToRelative(3.212f, -5.562f)
                lineToRelative(1.732f, 1.0f)
                lineTo(7.732f, 9.0f)
                horizontalLineToRelative(8.535f)
                lineToRelative(-2.633f, -4.562f)
                lineToRelative(1.732f, -1.0f)
                close()
                moveTo(18.826f, 11.0f)
                lineTo(5.173f, 11.0f)
                lineToRelative(0.667f, 8.0f)
                horizontalLineToRelative(12.319f)
                lineToRelative(0.667f, -8.0f)
                close()
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _shoppingBasket2Line!!
    }

private var _shoppingBasket2Line: ImageVector? = null
