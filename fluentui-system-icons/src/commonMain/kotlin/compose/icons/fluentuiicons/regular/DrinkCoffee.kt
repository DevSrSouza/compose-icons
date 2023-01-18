package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.DrinkCoffee: ImageVector
    get() {
        if (_drinkCoffee != null) {
            return _drinkCoffee!!
        }
        _drinkCoffee = Builder(name = "DrinkCoffee", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9412f, 5.0f)
                curveTo(2.8691f, 5.0f, 2.0f, 5.8691f, 2.0f, 6.9412f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 16.4183f, 5.5817f, 20.0f, 10.0f, 20.0f)
                curveTo(14.0114f, 20.0f, 17.3332f, 17.0476f, 17.911f, 13.1973f)
                horizontalLineTo(18.6487f)
                curveTo(20.4981f, 13.1973f, 21.9973f, 11.698f, 21.9973f, 9.8486f)
                curveTo(21.9973f, 7.9992f, 20.4981f, 6.5f, 18.6487f, 6.5f)
                horizontalLineTo(17.9496f)
                curveTo(17.7499f, 5.6405f, 16.9791f, 5.0f, 16.0588f, 5.0f)
                horizontalLineTo(3.9412f)
                close()
                moveTo(3.5f, 6.9412f)
                curveTo(3.5f, 6.6975f, 3.6975f, 6.5f, 3.9412f, 6.5f)
                horizontalLineTo(16.0588f)
                curveTo(16.3025f, 6.5f, 16.5f, 6.6975f, 16.5f, 6.9412f)
                verticalLineTo(12.0f)
                curveTo(16.5f, 15.5899f, 13.5899f, 18.5f, 10.0f, 18.5f)
                curveTo(6.4102f, 18.5f, 3.5f, 15.5899f, 3.5f, 12.0f)
                verticalLineTo(6.9412f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineTo(18.6487f)
                curveTo(19.6697f, 8.0f, 20.4973f, 8.8277f, 20.4973f, 9.8486f)
                curveTo(20.4973f, 10.8696f, 19.6697f, 11.6973f, 18.6487f, 11.6973f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _drinkCoffee!!
    }

private var _drinkCoffee: ImageVector? = null
