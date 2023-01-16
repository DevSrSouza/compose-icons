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

public val MaterialDesignIcons.FoodSteak: ImageVector
    get() {
        if (_foodSteak != null) {
            return _foodSteak!!
        }
        _foodSteak = Builder(name = "FoodSteak", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9f, 2.0f)
                curveTo(8.0f, 2.0f, 4.9f, 5.4f, 5.0f, 9.3f)
                curveTo(5.1f, 11.9f, 6.6f, 14.1f, 8.7f, 15.2f)
                curveTo(10.1f, 15.9f, 11.0f, 17.3f, 11.0f, 18.8f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 20.7f, 12.3f, 22.0f, 14.0f, 22.0f)
                curveTo(18.0f, 22.0f, 19.0f, 17.0f, 19.0f, 9.0f)
                curveTo(19.0f, 9.0f, 19.0f, 2.0f, 11.9f, 2.0f)
                moveTo(14.0f, 20.0f)
                curveTo(13.4f, 20.0f, 13.0f, 19.6f, 13.0f, 19.0f)
                verticalLineTo(18.8f)
                curveTo(13.0f, 16.6f, 11.7f, 14.5f, 9.7f, 13.4f)
                curveTo(8.1f, 12.6f, 7.1f, 11.0f, 7.0f, 9.2f)
                curveTo(7.0f, 7.9f, 7.5f, 6.5f, 8.4f, 5.5f)
                curveTo(9.3f, 4.5f, 10.6f, 4.0f, 11.8f, 4.0f)
                curveTo(16.7f, 4.0f, 17.0f, 8.2f, 17.0f, 9.0f)
                curveTo(17.0f, 18.9f, 15.3f, 20.0f, 14.0f, 20.0f)
                moveTo(15.8f, 7.6f)
                lineTo(8.3f, 10.3f)
                curveTo(8.1f, 10.0f, 8.0f, 9.6f, 8.0f, 9.1f)
                curveTo(8.0f, 8.4f, 8.2f, 7.8f, 8.5f, 7.1f)
                lineTo(13.7f, 5.2f)
                curveTo(14.9f, 5.8f, 15.5f, 6.7f, 15.8f, 7.6f)
                moveTo(12.9f, 15.1f)
                lineTo(15.7f, 14.1f)
                curveTo(15.6f, 15.6f, 15.3f, 16.7f, 15.1f, 17.4f)
                lineTo(13.8f, 17.9f)
                curveTo(13.8f, 16.9f, 13.5f, 16.0f, 12.9f, 15.1f)
                moveTo(16.0f, 9.2f)
                curveTo(16.0f, 10.4f, 16.0f, 11.5f, 15.9f, 12.4f)
                lineTo(11.9f, 13.9f)
                curveTo(11.4f, 13.4f, 10.8f, 12.9f, 10.1f, 12.6f)
                curveTo(9.7f, 12.4f, 9.3f, 12.1f, 9.0f, 11.8f)
                lineTo(16.0f, 9.2f)
                close()
            }
        }
        .build()
        return _foodSteak!!
    }

private var _foodSteak: ImageVector? = null
