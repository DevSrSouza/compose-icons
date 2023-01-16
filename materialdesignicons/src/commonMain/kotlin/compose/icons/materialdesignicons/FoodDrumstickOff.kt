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

public val MaterialDesignIcons.FoodDrumstickOff: ImageVector
    get() {
        if (_foodDrumstickOff != null) {
            return _foodDrumstickOff!!
        }
        _foodDrumstickOff = Builder(name = "FoodDrumstickOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(13.6f, 15.5f)
                curveTo(13.3f, 15.7f, 13.0f, 15.9f, 12.7f, 16.2f)
                curveTo(11.6f, 17.3f, 9.8f, 17.3f, 8.7f, 16.2f)
                lineTo(7.7f, 15.2f)
                curveTo(6.6f, 14.1f, 6.6f, 12.3f, 7.8f, 11.2f)
                curveTo(8.0f, 11.0f, 8.2f, 10.7f, 8.4f, 10.4f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(8.1f, 16.9f)
                lineTo(7.1f, 15.9f)
                curveTo(6.9f, 15.7f, 6.8f, 15.5f, 6.6f, 15.3f)
                lineTo(4.1f, 17.7f)
                curveTo(3.5f, 17.4f, 2.9f, 17.5f, 2.4f, 18.0f)
                curveTo(1.8f, 18.6f, 1.8f, 19.5f, 2.4f, 20.1f)
                curveTo(2.7f, 20.4f, 3.0f, 20.5f, 3.4f, 20.5f)
                curveTo(3.4f, 20.9f, 3.6f, 21.2f, 3.8f, 21.5f)
                curveTo(4.4f, 22.1f, 5.3f, 22.1f, 5.9f, 21.5f)
                curveTo(6.4f, 21.0f, 6.5f, 20.4f, 6.2f, 19.8f)
                lineTo(8.7f, 17.4f)
                curveTo(8.5f, 17.3f, 8.3f, 17.1f, 8.1f, 16.9f)
                moveTo(20.2f, 12.7f)
                curveTo(23.0f, 9.9f, 22.6f, 5.2f, 19.1f, 3.0f)
                curveTo(17.1f, 1.7f, 14.4f, 1.7f, 12.4f, 3.0f)
                curveTo(11.0f, 3.9f, 10.1f, 5.1f, 9.7f, 6.5f)
                lineTo(17.5f, 14.3f)
                curveTo(18.5f, 14.0f, 19.4f, 13.5f, 20.2f, 12.7f)
                close()
            }
        }
        .build()
        return _foodDrumstickOff!!
    }

private var _foodDrumstickOff: ImageVector? = null
