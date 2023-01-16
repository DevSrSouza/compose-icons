package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.CoffeeToGoOutline: ImageVector
    get() {
        if (_coffeeToGoOutline != null) {
            return _coffeeToGoOutline!!
        }
        _coffeeToGoOutline = Builder(name = "CoffeeToGoOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                verticalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 7.0f, 15.0f)
                horizontalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 10.0f, 19.0f, 9.11f, 19.0f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(19.0f, 3.9f, 18.11f, 3.0f, 17.0f, 3.0f)
                horizontalLineTo(3.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 13.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 11.0f)
                verticalLineTo(5.0f)
                moveTo(15.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                moveTo(16.67f, 13.83f)
                lineTo(15.26f, 15.24f)
                lineTo(17.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                lineTo(15.26f, 20.76f)
                lineTo(16.67f, 22.17f)
                lineTo(20.84f, 18.0f)
                lineTo(16.67f, 13.83f)
                close()
            }
        }
        .build()
        return _coffeeToGoOutline!!
    }

private var _coffeeToGoOutline: ImageVector? = null
