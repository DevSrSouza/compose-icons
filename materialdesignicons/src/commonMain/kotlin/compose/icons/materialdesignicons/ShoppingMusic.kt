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

public val MaterialDesignIcons.ShoppingMusic: ImageVector
    get() {
        if (_shoppingMusic != null) {
            return _shoppingMusic!!
        }
        _shoppingMusic = Builder(name = "ShoppingMusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 6.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(19.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 22.0f, 3.0f, 21.1f, 3.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 6.89f, 3.89f, 6.0f, 5.0f, 6.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 6.0f)
                horizontalLineTo(19.0f)
                moveTo(9.0f, 19.0f)
                lineTo(16.5f, 14.0f)
                lineTo(9.0f, 10.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _shoppingMusic!!
    }

private var _shoppingMusic: ImageVector? = null
