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

public val MaterialDesignIcons.FoodVariantOff: ImageVector
    get() {
        if (_foodVariantOff != null) {
            return _foodVariantOff!!
        }
        _foodVariantOff = Builder(name = "FoodVariantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.28f, 3.0f)
                lineTo(1.0f, 4.27f)
                lineTo(3.31f, 6.58f)
                curveTo(2.91f, 8.7f, 2.55f, 10.8f, 2.33f, 12.83f)
                curveTo(2.0f, 16.0f, 2.0f, 19.0f, 2.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 19.0f, 9.0f, 16.0f, 8.67f, 12.83f)
                curveTo(8.63f, 12.5f, 8.58f, 12.15f, 8.54f, 11.81f)
                lineTo(12.73f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 20.21f, 12.79f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.23f, 22.0f, 18.45f, 22.0f, 18.67f, 21.94f)
                lineTo(19.73f, 23.0f)
                lineTo(21.0f, 21.72f)
                moveTo(4.82f, 3.0f)
                lineTo(7.53f, 5.71f)
                curveTo(7.5f, 5.47f, 7.45f, 5.24f, 7.4f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                moveTo(20.55f, 11.23f)
                lineTo(17.8f, 16.0f)
                lineTo(21.59f, 19.76f)
                curveTo(21.86f, 19.21f, 22.0f, 18.61f, 22.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.87f)
                lineTo(22.11f, 12.13f)
                close()
            }
        }
        .build()
        return _foodVariantOff!!
    }

private var _foodVariantOff: ImageVector? = null
