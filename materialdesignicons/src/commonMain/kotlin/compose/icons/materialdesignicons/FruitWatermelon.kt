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

public val MaterialDesignIcons.FruitWatermelon: ImageVector
    get() {
        if (_fruitWatermelon != null) {
            return _fruitWatermelon!!
        }
        _fruitWatermelon = Builder(name = "FruitWatermelon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4f, 16.4f)
                curveTo(19.8f, 13.0f, 19.8f, 7.5f, 16.4f, 4.2f)
                lineTo(4.2f, 16.4f)
                curveTo(7.5f, 19.8f, 13.0f, 19.8f, 16.4f, 16.4f)
                moveTo(16.0f, 7.0f)
                curveTo(16.6f, 7.0f, 17.0f, 7.4f, 17.0f, 8.0f)
                curveTo(17.0f, 8.6f, 16.6f, 9.0f, 16.0f, 9.0f)
                reflectiveCurveTo(15.0f, 8.6f, 15.0f, 8.0f)
                curveTo(15.0f, 7.4f, 15.4f, 7.0f, 16.0f, 7.0f)
                moveTo(16.0f, 11.0f)
                curveTo(16.6f, 11.0f, 17.0f, 11.4f, 17.0f, 12.0f)
                curveTo(17.0f, 12.6f, 16.6f, 13.0f, 16.0f, 13.0f)
                reflectiveCurveTo(15.0f, 12.6f, 15.0f, 12.0f)
                curveTo(15.0f, 11.4f, 15.4f, 11.0f, 16.0f, 11.0f)
                moveTo(12.0f, 11.0f)
                curveTo(12.6f, 11.0f, 13.0f, 11.4f, 13.0f, 12.0f)
                curveTo(13.0f, 12.6f, 12.6f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(11.0f, 12.6f, 11.0f, 12.0f)
                curveTo(11.0f, 11.4f, 11.4f, 11.0f, 12.0f, 11.0f)
                moveTo(12.0f, 15.0f)
                curveTo(12.6f, 15.0f, 13.0f, 15.4f, 13.0f, 16.0f)
                curveTo(13.0f, 16.6f, 12.6f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(11.0f, 16.6f, 11.0f, 16.0f)
                curveTo(11.0f, 15.4f, 11.4f, 15.0f, 12.0f, 15.0f)
                moveTo(8.0f, 17.0f)
                curveTo(7.4f, 17.0f, 7.0f, 16.6f, 7.0f, 16.0f)
                curveTo(7.0f, 15.4f, 7.4f, 15.0f, 8.0f, 15.0f)
                reflectiveCurveTo(9.0f, 15.4f, 9.0f, 16.0f)
                curveTo(9.0f, 16.6f, 8.6f, 17.0f, 8.0f, 17.0f)
                moveTo(18.6f, 18.6f)
                curveTo(14.0f, 23.2f, 6.6f, 23.2f, 2.0f, 18.6f)
                lineTo(3.4f, 17.2f)
                curveTo(7.2f, 21.0f, 13.3f, 21.0f, 17.1f, 17.2f)
                curveTo(20.9f, 13.4f, 20.9f, 7.3f, 17.1f, 3.5f)
                lineTo(18.6f, 2.0f)
                curveTo(23.1f, 6.6f, 23.1f, 14.0f, 18.6f, 18.6f)
                close()
            }
        }
        .build()
        return _fruitWatermelon!!
    }

private var _fruitWatermelon: ImageVector? = null
