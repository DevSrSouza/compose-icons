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

public val MaterialDesignIcons.FoodApple: ImageVector
    get() {
        if (_foodApple != null) {
            return _foodApple!!
        }
        _foodApple = Builder(name = "FoodApple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                curveTo(22.0f, 13.0f, 17.0f, 22.0f, 15.0f, 22.0f)
                curveTo(13.0f, 22.0f, 13.0f, 21.0f, 12.0f, 21.0f)
                curveTo(11.0f, 21.0f, 11.0f, 22.0f, 9.0f, 22.0f)
                curveTo(7.0f, 22.0f, 2.0f, 13.0f, 4.0f, 10.0f)
                curveTo(6.0f, 7.0f, 9.0f, 7.0f, 11.0f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(5.38f, 8.07f, 4.11f, 3.78f, 4.11f, 3.78f)
                curveTo(4.11f, 3.78f, 6.77f, 0.19f, 11.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                curveTo(15.0f, 7.0f, 18.0f, 7.0f, 20.0f, 10.0f)
                close()
            }
        }
        .build()
        return _foodApple!!
    }

private var _foodApple: ImageVector? = null
