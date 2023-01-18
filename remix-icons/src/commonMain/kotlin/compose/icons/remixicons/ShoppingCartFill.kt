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

public val RemixIcons.ShoppingCartFill: ImageVector
    get() {
        if (_shoppingCartFill != null) {
            return _shoppingCartFill!!
        }
        _shoppingCartFill = Builder(name = "ShoppingCartFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(13.938f)
                lineToRelative(0.5f, -2.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(13.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.97f, 1.243f)
                lineToRelative(-2.5f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, 0.757f)
                lineTo(5.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(6.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
                moveTo(18.0f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _shoppingCartFill!!
    }

private var _shoppingCartFill: ImageVector? = null
