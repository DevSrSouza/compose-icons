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

public val MaterialDesignIcons.FoodKosher: ImageVector
    get() {
        if (_foodKosher != null) {
            return _foodKosher!!
        }
        _foodKosher = Builder(name = "FoodKosher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                curveTo(3.57f, 9.0f, 4.0f, 9.43f, 4.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                curveTo(6.0f, 8.36f, 4.64f, 7.0f, 3.0f, 7.0f)
                horizontalLineTo(1.0f)
                moveTo(7.0f, 7.0f)
                verticalLineTo(14.0f)
                curveTo(7.0f, 15.65f, 8.36f, 17.0f, 10.0f, 17.0f)
                horizontalLineTo(14.0f)
                curveTo(15.65f, 17.0f, 17.0f, 15.65f, 17.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 14.57f, 14.57f, 15.0f, 14.0f, 15.0f)
                horizontalLineTo(10.0f)
                curveTo(9.43f, 15.0f, 9.0f, 14.57f, 9.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                curveTo(11.65f, 13.0f, 13.0f, 11.65f, 13.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                curveTo(11.0f, 10.57f, 10.57f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.57f, 9.0f, 21.0f, 9.43f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 14.57f, 20.57f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                curveTo(21.65f, 17.0f, 23.0f, 15.65f, 23.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(23.0f, 8.36f, 21.65f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _foodKosher!!
    }

private var _foodKosher: ImageVector? = null
