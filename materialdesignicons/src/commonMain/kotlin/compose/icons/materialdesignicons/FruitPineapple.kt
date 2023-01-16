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

public val MaterialDesignIcons.FruitPineapple: ImageVector
    get() {
        if (_fruitPineapple != null) {
            return _fruitPineapple!!
        }
        _fruitPineapple = Builder(name = "FruitPineapple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 7.7f)
                curveTo(16.4f, 6.4f, 19.0f, 7.0f, 19.0f, 7.0f)
                curveTo(17.2f, 4.6f, 15.1f, 4.7f, 13.6f, 5.2f)
                verticalLineTo(5.0f)
                curveTo(14.7f, 3.4f, 16.9f, 3.5f, 16.9f, 3.5f)
                curveTo(15.3f, 2.1f, 13.9f, 2.5f, 13.0f, 3.0f)
                curveTo(12.5f, 1.8f, 12.0f, 1.0f, 12.0f, 1.0f)
                curveTo(11.6f, 1.7f, 11.3f, 2.4f, 11.0f, 3.1f)
                curveTo(10.1f, 2.5f, 8.6f, 2.1f, 7.0f, 3.5f)
                curveTo(7.0f, 3.5f, 9.3f, 3.5f, 10.4f, 5.2f)
                curveTo(8.9f, 4.7f, 6.8f, 4.6f, 5.0f, 7.0f)
                curveTo(5.0f, 7.0f, 7.6f, 6.4f, 9.6f, 7.7f)
                curveTo(7.5f, 8.9f, 6.0f, 11.7f, 6.0f, 15.0f)
                curveTo(6.0f, 19.4f, 8.7f, 23.0f, 12.0f, 23.0f)
                reflectiveCurveTo(18.0f, 19.4f, 18.0f, 15.0f)
                curveTo(18.0f, 11.7f, 16.5f, 8.9f, 14.4f, 7.7f)
                moveTo(15.8f, 16.8f)
                curveTo(15.7f, 17.2f, 15.6f, 17.6f, 15.4f, 18.0f)
                lineTo(14.0f, 16.0f)
                lineTo(12.5f, 18.0f)
                lineTo(14.1f, 20.1f)
                curveTo(13.8f, 20.3f, 13.6f, 20.5f, 13.3f, 20.7f)
                lineTo(12.0f, 19.0f)
                lineTo(10.7f, 20.7f)
                curveTo(10.4f, 20.6f, 10.1f, 20.4f, 9.9f, 20.1f)
                lineTo(11.5f, 18.0f)
                lineTo(10.0f, 16.0f)
                lineTo(8.5f, 17.9f)
                curveTo(8.4f, 17.5f, 8.2f, 17.1f, 8.1f, 16.7f)
                lineTo(9.5f, 15.0f)
                lineTo(8.2f, 13.2f)
                curveTo(8.3f, 12.8f, 8.4f, 12.4f, 8.6f, 12.0f)
                lineTo(10.0f, 14.0f)
                lineTo(11.5f, 12.0f)
                lineTo(9.9f, 9.9f)
                curveTo(10.2f, 9.7f, 10.4f, 9.5f, 10.7f, 9.3f)
                lineTo(12.0f, 11.0f)
                lineTo(13.3f, 9.3f)
                curveTo(13.6f, 9.4f, 13.9f, 9.6f, 14.1f, 9.9f)
                lineTo(12.5f, 12.0f)
                lineTo(14.0f, 14.0f)
                lineTo(15.5f, 12.1f)
                curveTo(15.6f, 12.5f, 15.8f, 12.9f, 15.9f, 13.3f)
                lineTo(14.5f, 15.0f)
                lineTo(15.8f, 16.8f)
                moveTo(12.0f, 13.0f)
                lineTo(13.5f, 15.0f)
                lineTo(12.0f, 17.0f)
                lineTo(10.5f, 15.0f)
                lineTo(12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _fruitPineapple!!
    }

private var _fruitPineapple: ImageVector? = null
