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

public val MaterialDesignIcons.CoffeeOffOutline: ImageVector
    get() {
        if (_coffeeOffOutline != null) {
            return _coffeeOffOutline!!
        }
        _coffeeOffOutline = Builder(name = "CoffeeOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.27f)
                lineTo(4.0f, 5.27f)
                verticalLineTo(13.0f)
                curveTo(4.0f, 15.21f, 5.79f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5f, 17.0f, 15.0f, 16.89f, 15.44f, 16.71f)
                lineTo(17.73f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.73f)
                lineTo(20.72f, 22.0f)
                lineTo(22.0f, 20.72f)
                lineTo(3.27f, 2.0f)
                lineTo(2.0f, 3.27f)
                moveTo(8.0f, 15.0f)
                curveTo(6.9f, 15.0f, 6.0f, 14.1f, 6.0f, 13.0f)
                verticalLineTo(7.27f)
                lineTo(13.73f, 15.0f)
                horizontalLineTo(8.0f)
                moveTo(20.0f, 3.0f)
                horizontalLineTo(6.81f)
                lineTo(8.81f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.19f)
                lineTo(17.85f, 14.04f)
                curveTo(17.94f, 13.7f, 18.0f, 13.36f, 18.0f, 13.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 10.0f, 22.0f, 9.1f, 22.0f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                moveTo(20.0f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _coffeeOffOutline!!
    }

private var _coffeeOffOutline: ImageVector? = null
