package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ShoppingBasketSolid: ImageVector
    get() {
        if (_shoppingBasketSolid != null) {
            return _shoppingBasketSolid!!
        }
        _shoppingBasketSolid = Builder(name = "ShoppingBasketSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0938f)
                lineTo(7.0938f, 12.0f)
                lineTo(2.0f, 12.0f)
                lineTo(2.0f, 18.0f)
                lineTo(3.25f, 18.0f)
                lineTo(6.0313f, 27.2813f)
                lineTo(6.25f, 28.0f)
                lineTo(25.75f, 28.0f)
                lineTo(25.9688f, 27.2813f)
                lineTo(28.75f, 18.0f)
                lineTo(30.0f, 18.0f)
                lineTo(30.0f, 12.0f)
                lineTo(24.9063f, 12.0f)
                close()
                moveTo(16.0f, 5.9375f)
                lineTo(22.0625f, 12.0f)
                lineTo(9.9375f, 12.0f)
                close()
                moveTo(4.0f, 14.0f)
                lineTo(28.0f, 14.0f)
                lineTo(28.0f, 16.0f)
                lineTo(27.25f, 16.0f)
                lineTo(27.0313f, 16.7188f)
                lineTo(24.25f, 26.0f)
                lineTo(7.75f, 26.0f)
                lineTo(4.9688f, 16.7188f)
                lineTo(4.75f, 16.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(11.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 17.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 17.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(19.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 17.0f)
                close()
            }
        }
        .build()
        return _shoppingBasketSolid!!
    }

private var _shoppingBasketSolid: ImageVector? = null
