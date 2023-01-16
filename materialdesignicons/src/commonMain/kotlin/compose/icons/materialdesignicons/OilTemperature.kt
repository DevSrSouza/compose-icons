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

public val MaterialDesignIcons.OilTemperature: ImageVector
    get() {
        if (_oilTemperature != null) {
            return _oilTemperature!!
        }
        _oilTemperature = Builder(name = "OilTemperature", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                curveTo(10.0f, 1.4f, 9.6f, 1.0f, 9.0f, 1.0f)
                reflectiveCurveTo(8.0f, 1.4f, 8.0f, 2.0f)
                verticalLineTo(15.3f)
                curveTo(7.4f, 15.6f, 7.0f, 16.3f, 7.0f, 17.0f)
                curveTo(7.0f, 18.1f, 7.9f, 19.0f, 9.0f, 19.0f)
                reflectiveCurveTo(11.0f, 18.1f, 11.0f, 17.0f)
                curveTo(11.0f, 16.3f, 10.6f, 15.6f, 10.0f, 15.3f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                moveTo(22.0f, 17.5f)
                curveTo(22.0f, 17.5f, 24.0f, 19.7f, 24.0f, 21.0f)
                curveTo(24.0f, 22.1f, 23.1f, 23.0f, 22.0f, 23.0f)
                reflectiveCurveTo(20.0f, 22.1f, 20.0f, 21.0f)
                curveTo(20.0f, 19.7f, 22.0f, 17.5f, 22.0f, 17.5f)
                moveTo(22.9f, 15.5f)
                curveTo(22.6f, 16.0f, 22.0f, 16.1f, 21.5f, 15.9f)
                lineTo(19.4f, 14.7f)
                lineTo(15.8f, 21.0f)
                curveTo(15.5f, 21.6f, 14.8f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 22.0f, 3.0f, 21.1f, 3.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 15.9f, 3.9f, 15.0f, 5.0f, 15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                lineTo(16.1f, 16.4f)
                lineTo(13.0f, 18.2f)
                verticalLineTo(15.8f)
                lineTo(19.2f, 12.2f)
                lineTo(22.5f, 14.1f)
                curveTo(23.0f, 14.4f, 23.1f, 15.0f, 22.9f, 15.5f)
                moveTo(3.5f, 13.9f)
                lineTo(1.8f, 15.6f)
                curveTo(1.4f, 16.0f, 0.8f, 16.0f, 0.4f, 15.6f)
                reflectiveCurveTo(0.0f, 14.6f, 0.4f, 14.2f)
                lineTo(2.1f, 12.5f)
                curveTo(2.5f, 12.1f, 3.1f, 12.1f, 3.5f, 12.5f)
                reflectiveCurveTo(3.9f, 13.5f, 3.5f, 13.9f)
                close()
            }
        }
        .build()
        return _oilTemperature!!
    }

private var _oilTemperature: ImageVector? = null
