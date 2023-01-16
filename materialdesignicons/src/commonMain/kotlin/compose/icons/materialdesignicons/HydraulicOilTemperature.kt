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

public val MaterialDesignIcons.HydraulicOilTemperature: ImageVector
    get() {
        if (_hydraulicOilTemperature != null) {
            return _hydraulicOilTemperature!!
        }
        _hydraulicOilTemperature = Builder(name = "HydraulicOilTemperature", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.0f)
                curveTo(7.34f, 18.0f, 6.0f, 16.66f, 6.0f, 15.0f)
                curveTo(6.0f, 13.0f, 9.0f, 9.63f, 9.0f, 9.63f)
                reflectiveCurveTo(12.0f, 13.0f, 12.0f, 15.0f)
                curveTo(12.0f, 16.66f, 10.66f, 18.0f, 9.0f, 18.0f)
                moveTo(14.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.89f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 22.0f, 16.0f, 21.11f, 16.0f, 20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                moveTo(21.0f, 17.5f)
                verticalLineTo(5.5f)
                curveTo(21.0f, 4.67f, 20.33f, 4.0f, 19.5f, 4.0f)
                reflectiveCurveTo(18.0f, 4.67f, 18.0f, 5.5f)
                verticalLineTo(17.5f)
                curveTo(17.37f, 17.97f, 17.0f, 18.71f, 17.0f, 19.5f)
                curveTo(17.0f, 20.88f, 18.12f, 22.0f, 19.5f, 22.0f)
                reflectiveCurveTo(22.0f, 20.88f, 22.0f, 19.5f)
                curveTo(22.0f, 18.71f, 21.63f, 18.0f, 21.0f, 17.5f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _hydraulicOilTemperature!!
    }

private var _hydraulicOilTemperature: ImageVector? = null
