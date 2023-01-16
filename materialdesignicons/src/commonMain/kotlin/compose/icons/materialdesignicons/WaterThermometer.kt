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

public val MaterialDesignIcons.WaterThermometer: ImageVector
    get() {
        if (_waterThermometer != null) {
            return _waterThermometer!!
        }
        _waterThermometer = Builder(name = "WaterThermometer", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                curveTo(17.89f, 5.0f, 17.0f, 5.89f, 17.0f, 7.0f)
                verticalLineTo(13.76f)
                curveTo(16.36f, 14.33f, 16.0f, 15.15f, 16.0f, 16.0f)
                curveTo(16.0f, 17.66f, 17.34f, 19.0f, 19.0f, 19.0f)
                reflectiveCurveTo(22.0f, 17.66f, 22.0f, 16.0f)
                curveTo(22.0f, 15.15f, 21.64f, 14.33f, 21.0f, 13.77f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 5.89f, 20.11f, 5.0f, 19.0f, 5.0f)
                moveTo(19.0f, 6.0f)
                curveTo(19.55f, 6.0f, 20.0f, 6.45f, 20.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 6.45f, 18.45f, 6.0f, 19.0f, 6.0f)
                moveTo(8.0f, 20.0f)
                curveTo(4.69f, 20.0f, 2.0f, 17.31f, 2.0f, 14.0f)
                curveTo(2.0f, 10.0f, 8.0f, 3.25f, 8.0f, 3.25f)
                reflectiveCurveTo(14.0f, 10.0f, 14.0f, 14.0f)
                curveTo(14.0f, 17.31f, 11.31f, 20.0f, 8.0f, 20.0f)
                close()
            }
        }
        .build()
        return _waterThermometer!!
    }

private var _waterThermometer: ImageVector? = null
