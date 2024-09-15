package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                curveTo(19.552f, 4.0f, 20.0f, 4.448f, 20.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(20.0f, 19.552f, 19.552f, 20.0f, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                curveTo(4.448f, 20.0f, 4.0f, 19.552f, 4.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(4.0f, 4.448f, 4.448f, 4.0f, 5.0f, 4.0f)
                close()
                moveTo(2.0f, 5.0f)
                curveTo(2.0f, 3.343f, 3.343f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.657f, 2.0f, 22.0f, 3.343f, 22.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(22.0f, 20.657f, 20.657f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.343f, 22.0f, 2.0f, 20.657f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(9.239f, 12.0f, 7.0f, 9.314f, 7.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 8.566f, 10.669f, 10.0f, 12.0f, 10.0f)
                curveTo(13.331f, 10.0f, 15.0f, 8.566f, 15.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 9.314f, 14.761f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
