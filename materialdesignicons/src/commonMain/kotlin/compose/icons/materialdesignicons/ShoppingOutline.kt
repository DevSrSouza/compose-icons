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

public val MaterialDesignIcons.ShoppingOutline: ImageVector
    get() {
        if (_shoppingOutline != null) {
            return _shoppingOutline!!
        }
        _shoppingOutline = Builder(name = "ShoppingOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 3.2f, 14.8f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(7.0f, 3.2f, 7.0f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 6.0f, 3.0f, 6.9f, 3.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 21.1f, 3.9f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 22.0f, 21.0f, 21.1f, 21.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 6.9f, 20.1f, 6.0f, 19.0f, 6.0f)
                moveTo(12.0f, 3.0f)
                curveTo(13.7f, 3.0f, 15.0f, 4.3f, 15.0f, 6.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 4.3f, 10.3f, 3.0f, 12.0f, 3.0f)
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 12.0f)
                curveTo(10.3f, 12.0f, 9.0f, 10.7f, 9.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 11.8f, 9.2f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(17.0f, 11.8f, 17.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 10.7f, 13.7f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _shoppingOutline!!
    }

private var _shoppingOutline: ImageVector? = null
