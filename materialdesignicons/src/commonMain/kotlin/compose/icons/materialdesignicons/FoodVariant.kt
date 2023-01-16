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

public val MaterialDesignIcons.FoodVariant: ImageVector
    get() {
        if (_foodVariant != null) {
            return _foodVariant!!
        }
        _foodVariant = Builder(name = "FoodVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.79f)
                lineTo(20.55f, 11.23f)
                lineTo(22.11f, 12.13f)
                lineTo(19.87f, 16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                moveTo(9.0f, 22.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 19.0f, 2.0f, 16.0f, 2.33f, 12.83f)
                curveTo(2.6f, 10.3f, 3.08f, 7.66f, 3.6f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.4f)
                curveTo(7.92f, 7.66f, 8.4f, 10.3f, 8.67f, 12.83f)
                curveTo(9.0f, 16.0f, 9.0f, 19.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return _foodVariant!!
    }

private var _foodVariant: ImageVector? = null
