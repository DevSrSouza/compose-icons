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

public val MaterialDesignIcons.CartRemove: ImageVector
    get() {
        if (_cartRemove != null) {
            return _cartRemove!!
        }
        _cartRemove = Builder(name = "CartRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1f, 8.5f)
                lineTo(12.0f, 6.4f)
                lineTo(9.9f, 8.5f)
                lineTo(8.5f, 7.1f)
                lineTo(10.6f, 5.0f)
                lineTo(8.5f, 2.9f)
                lineTo(9.9f, 1.5f)
                lineTo(12.0f, 3.6f)
                lineTo(14.1f, 1.5f)
                lineTo(15.5f, 2.9f)
                lineTo(13.4f, 5.0f)
                lineTo(15.5f, 7.1f)
                lineTo(14.1f, 8.5f)
                moveTo(7.0f, 18.0f)
                curveTo(8.1f, 18.0f, 9.0f, 18.9f, 9.0f, 20.0f)
                reflectiveCurveTo(8.1f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveTo(5.0f, 21.1f, 5.0f, 20.0f)
                reflectiveCurveTo(5.9f, 18.0f, 7.0f, 18.0f)
                moveTo(17.0f, 18.0f)
                curveTo(18.1f, 18.0f, 19.0f, 18.9f, 19.0f, 20.0f)
                reflectiveCurveTo(18.1f, 22.0f, 17.0f, 22.0f)
                reflectiveCurveTo(15.0f, 21.1f, 15.0f, 20.0f)
                reflectiveCurveTo(15.9f, 18.0f, 17.0f, 18.0f)
                moveTo(7.2f, 14.8f)
                curveTo(7.2f, 14.9f, 7.3f, 15.0f, 7.4f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 17.0f, 5.0f, 16.1f, 5.0f, 15.0f)
                curveTo(5.0f, 14.6f, 5.1f, 14.3f, 5.2f, 14.0f)
                lineTo(6.5f, 11.6f)
                lineTo(3.0f, 4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.3f)
                lineTo(8.6f, 11.0f)
                horizontalLineTo(15.6f)
                lineTo(19.5f, 4.0f)
                lineTo(21.2f, 5.0f)
                lineTo(17.3f, 12.0f)
                curveTo(17.0f, 12.6f, 16.3f, 13.0f, 15.6f, 13.0f)
                horizontalLineTo(8.1f)
                lineTo(7.2f, 14.6f)
                verticalLineTo(14.8f)
                close()
            }
        }
        .build()
        return _cartRemove!!
    }

private var _cartRemove: ImageVector? = null
