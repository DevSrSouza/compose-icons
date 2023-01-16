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

public val MaterialDesignIcons.FoodForkDrink: ImageVector
    get() {
        if (_foodForkDrink != null) {
            return _foodForkDrink!!
        }
        _foodForkDrink = Builder(name = "FoodForkDrink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(8.0f)
                lineTo(2.0f, 9.5f)
                curveTo(2.0f, 11.19f, 3.03f, 12.63f, 4.5f, 13.22f)
                verticalLineTo(19.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 21.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 19.5f)
                verticalLineTo(13.22f)
                curveTo(8.97f, 12.63f, 10.0f, 11.19f, 10.0f, 9.5f)
                verticalLineTo(8.0f)
                lineTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 4.0f)
                verticalLineTo(8.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 8.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 4.0f)
                verticalLineTo(8.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 8.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 3.0f)
                moveTo(19.88f, 3.0f)
                curveTo(19.75f, 3.0f, 19.62f, 3.09f, 19.5f, 3.16f)
                lineTo(16.0f, 5.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                lineTo(14.0f, 21.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.34f)
                lineTo(20.5f, 4.84f)
                curveTo(21.0f, 4.56f, 21.13f, 4.0f, 20.84f, 3.5f)
                curveTo(20.63f, 3.14f, 20.26f, 2.95f, 19.88f, 3.0f)
                close()
            }
        }
        .build()
        return _foodForkDrink!!
    }

private var _foodForkDrink: ImageVector? = null
