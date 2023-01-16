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

public val MaterialDesignIcons.SkiWater: ImageVector
    get() {
        if (_skiWater != null) {
            return _skiWater!!
        }
        _skiWater = Builder(name = "SkiWater", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2f, 3.5f)
                curveTo(4.2f, 2.7f, 4.9f, 1.9f, 5.8f, 1.9f)
                curveTo(6.7f, 1.9f, 7.4f, 2.6f, 7.4f, 3.5f)
                reflectiveCurveTo(6.6f, 5.0f, 5.8f, 5.0f)
                reflectiveCurveTo(4.2f, 4.3f, 4.2f, 3.5f)
                moveTo(22.0f, 3.9f)
                lineTo(21.5f, 3.0f)
                lineTo(13.5f, 7.1f)
                lineTo(14.0f, 8.0f)
                lineTo(22.0f, 3.9f)
                moveTo(20.8f, 20.3f)
                lineTo(21.7f, 21.2f)
                curveTo(21.1f, 21.8f, 20.5f, 22.2f, 19.8f, 22.5f)
                reflectiveCurveTo(18.3f, 23.0f, 17.5f, 23.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.7f)
                horizontalLineTo(4.7f)
                lineTo(6.8f, 18.2f)
                lineTo(4.5f, 15.0f)
                lineTo(3.7f, 7.2f)
                curveTo(3.7f, 6.3f, 4.5f, 5.5f, 5.4f, 5.5f)
                curveTo(5.7f, 5.5f, 6.0f, 5.6f, 6.2f, 5.7f)
                lineTo(9.7f, 8.3f)
                lineTo(12.0f, 7.5f)
                lineTo(12.8f, 9.1f)
                lineTo(9.3f, 10.6f)
                curveTo(9.2f, 10.5f, 7.7f, 9.4f, 6.6f, 8.5f)
                lineTo(7.0f, 12.0f)
                lineTo(12.3f, 16.5f)
                lineTo(14.0f, 21.7f)
                horizontalLineTo(17.5f)
                curveTo(18.1f, 21.7f, 18.7f, 21.6f, 19.3f, 21.3f)
                curveTo(19.9f, 21.1f, 20.4f, 20.7f, 20.8f, 20.3f)
                moveTo(7.0f, 21.7f)
                horizontalLineTo(12.0f)
                lineTo(10.4f, 17.8f)
                lineTo(8.1f, 15.9f)
                lineTo(9.3f, 18.4f)
                lineTo(7.0f, 21.7f)
                close()
            }
        }
        .build()
        return _skiWater!!
    }

private var _skiWater: ImageVector? = null
