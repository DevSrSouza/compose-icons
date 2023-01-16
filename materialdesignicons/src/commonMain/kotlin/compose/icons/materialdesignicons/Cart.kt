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

public val MaterialDesignIcons.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = Builder(name = "Cart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                curveTo(15.89f, 18.0f, 15.0f, 18.89f, 15.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 20.0f)
                curveTo(19.0f, 18.89f, 18.1f, 18.0f, 17.0f, 18.0f)
                moveTo(1.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                lineTo(6.6f, 11.59f)
                lineTo(5.24f, 14.04f)
                curveTo(5.09f, 14.32f, 5.0f, 14.65f, 5.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.42f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 7.17f, 14.75f)
                curveTo(7.17f, 14.7f, 7.18f, 14.66f, 7.2f, 14.63f)
                lineTo(8.1f, 13.0f)
                horizontalLineTo(15.55f)
                curveTo(16.3f, 13.0f, 16.96f, 12.58f, 17.3f, 11.97f)
                lineTo(20.88f, 5.5f)
                curveTo(20.95f, 5.34f, 21.0f, 5.17f, 21.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 4.0f)
                horizontalLineTo(5.21f)
                lineTo(4.27f, 2.0f)
                moveTo(7.0f, 18.0f)
                curveTo(5.89f, 18.0f, 5.0f, 18.89f, 5.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 20.0f)
                curveTo(9.0f, 18.89f, 8.1f, 18.0f, 7.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cart!!
    }

private var _cart: ImageVector? = null
