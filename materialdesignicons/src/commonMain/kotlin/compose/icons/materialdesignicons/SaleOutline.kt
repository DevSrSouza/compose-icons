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

public val MaterialDesignIcons.SaleOutline: ImageVector
    get() {
        if (_saleOutline != null) {
            return _saleOutline!!
        }
        _saleOutline = Builder(name = "SaleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 7.0f)
                curveTo(10.33f, 7.0f, 11.0f, 7.67f, 11.0f, 8.5f)
                curveTo(11.0f, 9.33f, 10.33f, 10.0f, 9.5f, 10.0f)
                curveTo(8.67f, 10.0f, 8.0f, 9.33f, 8.0f, 8.5f)
                curveTo(8.0f, 7.67f, 8.67f, 7.0f, 9.5f, 7.0f)
                moveTo(14.5f, 14.0f)
                curveTo(15.33f, 14.0f, 16.0f, 14.67f, 16.0f, 15.5f)
                curveTo(16.0f, 16.33f, 15.33f, 17.0f, 14.5f, 17.0f)
                curveTo(13.67f, 17.0f, 13.0f, 16.33f, 13.0f, 15.5f)
                curveTo(13.0f, 14.67f, 13.67f, 14.0f, 14.5f, 14.0f)
                moveTo(8.41f, 17.0f)
                lineTo(7.0f, 15.59f)
                lineTo(15.59f, 7.0f)
                lineTo(17.0f, 8.41f)
                lineTo(8.41f, 17.0f)
                moveTo(18.65f, 2.85f)
                lineTo(19.26f, 6.71f)
                lineTo(22.77f, 8.5f)
                lineTo(21.0f, 12.0f)
                lineTo(22.78f, 15.5f)
                lineTo(19.24f, 17.29f)
                lineTo(18.63f, 21.15f)
                lineTo(14.74f, 20.54f)
                lineTo(11.97f, 23.31f)
                lineTo(9.19f, 20.5f)
                lineTo(5.33f, 21.14f)
                lineTo(4.71f, 17.25f)
                lineTo(1.22f, 15.47f)
                lineTo(3.0f, 11.97f)
                lineTo(1.23f, 8.5f)
                lineTo(4.74f, 6.69f)
                lineTo(5.35f, 2.87f)
                lineTo(9.22f, 3.5f)
                lineTo(12.0f, 0.695f)
                lineTo(14.76f, 3.46f)
                lineTo(18.65f, 2.85f)
                moveTo(20.1f, 9.37f)
                lineTo(17.5f, 8.0f)
                lineTo(17.0f, 5.11f)
                lineTo(14.1f, 5.53f)
                lineTo(12.0f, 3.5f)
                lineTo(9.9f, 5.53f)
                lineTo(7.0f, 5.11f)
                lineTo(6.5f, 8.0f)
                lineTo(3.9f, 9.37f)
                lineTo(5.2f, 12.0f)
                lineTo(3.9f, 14.63f)
                lineTo(6.5f, 16.0f)
                lineTo(7.0f, 18.89f)
                lineTo(9.9f, 18.47f)
                lineTo(12.0f, 20.5f)
                lineTo(14.1f, 18.47f)
                lineTo(17.0f, 18.89f)
                lineTo(17.5f, 16.0f)
                lineTo(20.1f, 14.63f)
                lineTo(18.8f, 12.0f)
                lineTo(20.1f, 9.37f)
                close()
            }
        }
        .build()
        return _saleOutline!!
    }

private var _saleOutline: ImageVector? = null
