package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.792f, 2.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.218f)
                lineTo(6.987f, 16.678f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.752f)
                lineTo(22.193f, 7.091f)
                lineTo(22.531f, 6.0f)
                horizontalLineTo(6.655f)
                lineTo(6.085f, 3.389f)
                lineTo(5.792f, 2.0f)
                close()
                moveTo(19.987f, 8.0f)
                horizontalLineTo(7.092f)
                lineTo(8.621f, 15.0f)
                horizontalLineTo(18.398f)
                lineTo(19.987f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                curveTo(11.105f, 22.0f, 12.0f, 21.105f, 12.0f, 20.0f)
                curveTo(12.0f, 18.895f, 11.105f, 18.0f, 10.0f, 18.0f)
                curveTo(8.895f, 18.0f, 8.0f, 18.895f, 8.0f, 20.0f)
                curveTo(8.0f, 21.105f, 8.895f, 22.0f, 10.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 20.0f)
                curveTo(19.0f, 21.105f, 18.105f, 22.0f, 17.0f, 22.0f)
                curveTo(15.895f, 22.0f, 15.0f, 21.105f, 15.0f, 20.0f)
                curveTo(15.0f, 18.895f, 15.895f, 18.0f, 17.0f, 18.0f)
                curveTo(18.105f, 18.0f, 19.0f, 18.895f, 19.0f, 20.0f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
