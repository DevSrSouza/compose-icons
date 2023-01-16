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

public val MaterialDesignIcons.CoffeeToGo: ImageVector
    get() {
        if (_coffeeToGo != null) {
            return _coffeeToGo!!
        }
        _coffeeToGo = Builder(name = "CoffeeToGo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                lineTo(15.26f, 15.24f)
                lineTo(16.67f, 13.83f)
                lineTo(20.84f, 18.0f)
                lineTo(16.67f, 22.17f)
                lineTo(15.26f, 20.76f)
                lineTo(17.0f, 19.0f)
                horizontalLineTo(3.0f)
                moveTo(17.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 3.0f)
                curveTo(18.11f, 3.0f, 19.0f, 3.9f, 19.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 9.11f, 18.11f, 10.0f, 17.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 15.0f)
                horizontalLineTo(7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 3.0f, 11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _coffeeToGo!!
    }

private var _coffeeToGo: ImageVector? = null
