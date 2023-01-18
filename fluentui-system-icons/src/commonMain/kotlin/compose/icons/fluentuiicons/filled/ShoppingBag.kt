package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 3.3431f, 8.3432f, 2.0f, 10.0f, 2.0f)
                curveTo(10.7684f, 2.0f, 11.4692f, 2.2889f, 12.0f, 2.7639f)
                curveTo(12.5308f, 2.2889f, 13.2317f, 2.0f, 14.0f, 2.0f)
                curveTo(15.6569f, 2.0f, 17.0f, 3.3431f, 17.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.5f)
                curveTo(19.3284f, 7.0f, 20.0f, 7.6716f, 20.0f, 8.5f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 19.4069f, 19.2737f, 20.6441f, 18.1755f, 21.3572f)
                lineTo(17.6298f, 21.2613f)
                curveTo(16.8554f, 21.1253f, 16.0564f, 20.6983f, 15.455f, 20.0889f)
                curveTo(14.8545f, 19.4803f, 14.5f, 18.7425f, 14.5f, 18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(5.0f)
                curveTo(15.5f, 4.1716f, 14.8284f, 3.5f, 14.0f, 3.5f)
                curveTo(13.535f, 3.5f, 13.1195f, 3.7116f, 12.8443f, 4.0437f)
                curveTo(12.9453f, 4.344f, 13.0f, 4.6656f, 13.0f, 5.0f)
                verticalLineTo(18.0f)
                curveTo(13.0f, 19.2289f, 13.582f, 20.3263f, 14.3873f, 21.1424f)
                curveTo(14.7087f, 21.4682f, 15.0736f, 21.7576f, 15.4661f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.7909f, 22.0f, 4.0f, 20.2091f, 4.0f, 18.0f)
                verticalLineTo(8.5f)
                curveTo(4.0f, 7.6716f, 4.6716f, 7.0f, 5.5f, 7.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(8.5f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(5.0f)
                curveTo(11.5f, 4.1716f, 10.8284f, 3.5f, 10.0f, 3.5f)
                curveTo(9.1716f, 3.5f, 8.5f, 4.1716f, 8.5f, 5.0f)
                close()
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
