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

public val RemixIcons.ShoppingCart2Line: ImageVector
    get() {
        if (_shoppingCart2Line != null) {
            return _shoppingCart2Line!!
        }
        _shoppingCart2Line = Builder(name = "ShoppingCart2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.414f)
                lineTo(0.757f, 3.172f)
                lineToRelative(1.415f, -1.415f)
                lineTo(5.414f, 5.0f)
                horizontalLineToRelative(15.242f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.958f, 1.287f)
                lineToRelative(-2.4f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.958f, 0.713f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(4.0f, 6.414f)
                close()
                moveTo(6.0f, 7.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(11.512f)
                lineToRelative(1.8f, -6.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(5.5f, 23.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
                moveTo(17.5f, 23.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _shoppingCart2Line!!
    }

private var _shoppingCart2Line: ImageVector? = null
