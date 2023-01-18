package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FoodPizza: ImageVector
    get() {
        if (_foodPizza != null) {
            return _foodPizza!!
        }
        _foodPizza = Builder(name = "FoodPizza", defaultWidth = 24.0.dp, defaultHeight = 25.0.dp,
                viewportWidth = 24.0f, viewportHeight = 25.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0032f, 4.6645f)
                curveTo(5.0035f, 3.168f, 6.2344f, 1.8598f, 7.8241f, 2.0167f)
                curveTo(13.1504f, 2.5426f, 17.8861f, 5.0746f, 21.2657f, 8.8441f)
                curveTo(22.3353f, 10.0371f, 22.003f, 11.8079f, 20.7871f, 12.6893f)
                lineTo(20.3643f, 12.9958f)
                lineTo(20.0014f, 12.4552f)
                lineTo(19.9935f, 12.4444f)
                curveTo(16.8021f, 8.0383f, 11.6127f, 5.1698f, 5.7534f, 5.1698f)
                horizontalLineTo(5.0031f)
                lineTo(5.0032f, 4.6645f)
                close()
                moveTo(18.771f, 13.3136f)
                lineTo(19.1491f, 13.8769f)
                curveTo(17.692f, 14.9335f, 16.1035f, 16.0861f, 15.2022f, 16.7417f)
                lineTo(15.0f, 16.8924f)
                verticalLineTo(18.9937f)
                curveTo(15.0f, 19.546f, 14.5523f, 19.9937f, 14.0f, 19.9937f)
                curveTo(13.4477f, 19.9937f, 13.0f, 19.546f, 13.0f, 18.9937f)
                verticalLineTo(18.9331f)
                curveTo(12.969f, 18.6849f, 12.7573f, 18.4923f, 12.5039f, 18.4923f)
                curveTo(12.2278f, 18.4923f, 12.0039f, 18.7162f, 12.0039f, 18.9923f)
                verticalLineTo(20.4951f)
                curveTo(12.0039f, 21.0474f, 11.5562f, 21.4951f, 11.0039f, 21.4951f)
                curveTo(10.4855f, 21.4951f, 10.0593f, 21.1007f, 10.0089f, 20.5956f)
                curveTo(9.5438f, 20.9307f, 9.0462f, 21.2898f, 8.5689f, 21.6345f)
                curveTo(7.0805f, 22.7092f, 4.9996f, 21.6459f, 5.0f, 19.8093f)
                lineTo(5.0028f, 6.6698f)
                horizontalLineTo(5.7534f)
                curveTo(11.1067f, 6.6698f, 15.8489f, 9.2863f, 18.771f, 13.3136f)
                close()
                moveTo(9.0039f, 10.9942f)
                curveTo(9.5562f, 10.9942f, 10.0039f, 10.5465f, 10.0039f, 9.9942f)
                curveTo(10.0039f, 9.4419f, 9.5562f, 8.9942f, 9.0039f, 8.9942f)
                curveTo(8.4516f, 8.9942f, 8.0039f, 9.4419f, 8.0039f, 9.9942f)
                curveTo(8.0039f, 10.5465f, 8.4516f, 10.9942f, 9.0039f, 10.9942f)
                close()
                moveTo(13.0039f, 13.9923f)
                curveTo(13.5562f, 13.9923f, 14.0039f, 13.5446f, 14.0039f, 12.9923f)
                curveTo(14.0039f, 12.44f, 13.5562f, 11.9923f, 13.0039f, 11.9923f)
                curveTo(12.4516f, 11.9923f, 12.0039f, 12.44f, 12.0039f, 12.9923f)
                curveTo(12.0039f, 13.5446f, 12.4516f, 13.9923f, 13.0039f, 13.9923f)
                close()
                moveTo(9.0039f, 16.9896f)
                curveTo(9.5562f, 16.9896f, 10.0039f, 16.5418f, 10.0039f, 15.9896f)
                curveTo(10.0039f, 15.4373f, 9.5562f, 14.9896f, 9.0039f, 14.9896f)
                curveTo(8.4516f, 14.9896f, 8.0039f, 15.4373f, 8.0039f, 15.9896f)
                curveTo(8.0039f, 16.5418f, 8.4516f, 16.9896f, 9.0039f, 16.9896f)
                close()
            }
        }
        .build()
        return _foodPizza!!
    }

private var _foodPizza: ImageVector? = null
