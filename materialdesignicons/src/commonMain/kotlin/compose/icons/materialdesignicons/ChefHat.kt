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

public val MaterialDesignIcons.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 1.5f)
                curveTo(10.73f, 1.5f, 9.17f, 2.67f, 8.67f, 4.37f)
                curveTo(8.14f, 4.13f, 7.58f, 4.0f, 7.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 3.0f, 8.0f)
                curveTo(3.0f, 9.82f, 4.24f, 11.41f, 6.0f, 11.87f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.87f)
                curveTo(20.76f, 11.41f, 22.0f, 9.82f, 22.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 4.0f)
                curveTo(17.42f, 4.0f, 16.86f, 4.13f, 16.33f, 4.37f)
                curveTo(15.83f, 2.67f, 14.27f, 1.5f, 12.5f, 1.5f)
                moveTo(12.0f, 10.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.5f)
                moveTo(9.0f, 12.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.5f)
                moveTo(15.0f, 12.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                moveTo(6.0f, 20.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
