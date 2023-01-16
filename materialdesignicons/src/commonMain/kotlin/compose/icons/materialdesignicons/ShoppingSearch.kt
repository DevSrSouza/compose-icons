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

public val MaterialDesignIcons.ShoppingSearch: ImageVector
    get() {
        if (_shoppingSearch != null) {
            return _shoppingSearch!!
        }
        _shoppingSearch = Builder(name = "ShoppingSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineTo(17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 6.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 8.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(12.05f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 9.0f, 16.5f)
                arcTo(6.4f, 6.4f, 0.0f, false, true, 10.25f, 12.68f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 8.0f)
                horizontalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 11.0f)
                horizontalLineTo(12.06f)
                arcTo(6.22f, 6.22f, 0.0f, false, true, 14.06f, 10.16f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 8.0f)
                horizontalLineTo(17.0f)
                arcTo(4.88f, 4.88f, 0.0f, false, true, 16.54f, 10.09f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 13.09f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 6.0f)
                moveTo(9.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 6.0f)
                moveTo(19.31f, 18.9f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 17.88f, 20.32f)
                lineTo(21.0f, 23.39f)
                lineTo(22.39f, 22.0f)
                moveTo(15.5f, 19.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 18.0f, 16.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 19.0f)
                close()
            }
        }
        .build()
        return _shoppingSearch!!
    }

private var _shoppingSearch: ImageVector? = null
