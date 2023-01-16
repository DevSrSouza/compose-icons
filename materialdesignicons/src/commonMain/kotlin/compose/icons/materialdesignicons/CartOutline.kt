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

public val MaterialDesignIcons.CartOutline: ImageVector
    get() {
        if (_cartOutline != null) {
            return _cartOutline!!
        }
        _cartOutline = Builder(name = "CartOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 22.0f)
                curveTo(15.89f, 22.0f, 15.0f, 21.1f, 15.0f, 20.0f)
                curveTo(15.0f, 18.89f, 15.89f, 18.0f, 17.0f, 18.0f)
                moveTo(1.0f, 2.0f)
                horizontalLineTo(4.27f)
                lineTo(5.21f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 5.0f)
                curveTo(21.0f, 5.17f, 20.95f, 5.34f, 20.88f, 5.5f)
                lineTo(17.3f, 11.97f)
                curveTo(16.96f, 12.58f, 16.3f, 13.0f, 15.55f, 13.0f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.63f)
                lineTo(7.17f, 14.75f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 7.42f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 17.0f, 5.0f, 16.1f, 5.0f, 15.0f)
                curveTo(5.0f, 14.65f, 5.09f, 14.32f, 5.24f, 14.04f)
                lineTo(6.6f, 11.59f)
                lineTo(3.0f, 4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                moveTo(7.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 22.0f)
                curveTo(5.89f, 22.0f, 5.0f, 21.1f, 5.0f, 20.0f)
                curveTo(5.0f, 18.89f, 5.89f, 18.0f, 7.0f, 18.0f)
                moveTo(16.0f, 11.0f)
                lineTo(18.78f, 6.0f)
                horizontalLineTo(6.14f)
                lineTo(8.5f, 11.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cartOutline!!
    }

private var _cartOutline: ImageVector? = null
