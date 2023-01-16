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

public val MaterialDesignIcons.CoffeeOff: ImageVector
    get() {
        if (_coffeeOff != null) {
            return _coffeeOff!!
        }
        _coffeeOff = Builder(name = "CoffeeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.27f, 2.0f)
                lineTo(22.0f, 20.72f)
                lineTo(20.72f, 22.0f)
                lineTo(19.73f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.73f)
                lineTo(15.44f, 16.71f)
                curveTo(15.0f, 16.89f, 14.5f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(5.79f, 17.0f, 4.0f, 15.21f, 4.0f, 13.0f)
                verticalLineTo(5.27f)
                lineTo(2.0f, 3.27f)
                lineTo(3.27f, 2.0f)
                moveTo(22.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 9.1f, 21.1f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 13.36f, 17.94f, 13.7f, 17.85f, 14.04f)
                lineTo(6.81f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 3.0f, 22.0f, 3.89f, 22.0f, 5.0f)
                moveTo(20.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _coffeeOff!!
    }

private var _coffeeOff: ImageVector? = null
