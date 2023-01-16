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

public val MaterialDesignIcons.FoodOff: ImageVector
    get() {
        if (_foodOff != null) {
            return _foodOff!!
        }
        _foodOff = Builder(name = "FoodOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.35f, 8.5f)
                lineTo(11.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(23.0f)
                lineTo(21.62f, 18.79f)
                lineTo(11.35f, 8.5f)
                moveTo(1.0f, 21.0f)
                verticalLineTo(22.0f)
                curveTo(1.0f, 22.55f, 1.45f, 23.0f, 2.0f, 23.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 23.0f, 16.0f, 22.55f, 16.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                moveTo(21.9f, 21.9f)
                lineTo(2.1f, 2.1f)
                lineTo(0.69f, 3.5f)
                lineTo(6.39f, 9.21f)
                curveTo(3.28f, 9.87f, 1.0f, 12.0f, 1.0f, 15.0f)
                horizontalLineTo(12.17f)
                lineTo(14.17f, 17.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.83f)
                lineTo(20.5f, 23.32f)
                lineTo(21.9f, 21.9f)
                close()
            }
        }
        .build()
        return _foodOff!!
    }

private var _foodOff: ImageVector? = null
