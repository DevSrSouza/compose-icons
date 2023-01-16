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

public val MaterialDesignIcons.CarBrakeTemperature: ImageVector
    get() {
        if (_carBrakeTemperature != null) {
            return _carBrakeTemperature!!
        }
        _carBrakeTemperature = Builder(name = "CarBrakeTemperature", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                curveTo(12.0f, 6.4f, 11.6f, 6.0f, 11.0f, 6.0f)
                reflectiveCurveTo(10.0f, 6.4f, 10.0f, 7.0f)
                verticalLineTo(17.3f)
                curveTo(9.4f, 17.6f, 9.0f, 18.3f, 9.0f, 19.0f)
                curveTo(9.0f, 20.1f, 9.9f, 21.0f, 11.0f, 21.0f)
                reflectiveCurveTo(13.0f, 20.1f, 13.0f, 19.0f)
                curveTo(13.0f, 18.3f, 12.6f, 17.6f, 12.0f, 17.3f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 15.31f, 22.66f, 18.31f, 20.5f, 20.5f)
                lineTo(19.42f, 19.42f)
                curveTo(21.32f, 17.5f, 22.5f, 14.9f, 22.5f, 12.0f)
                curveTo(22.5f, 9.11f, 21.32f, 6.5f, 19.42f, 4.58f)
                lineTo(20.5f, 3.5f)
                curveTo(22.66f, 5.69f, 24.0f, 8.69f, 24.0f, 12.0f)
                moveTo(1.5f, 12.0f)
                curveTo(1.5f, 14.9f, 2.68f, 17.5f, 4.58f, 19.42f)
                lineTo(3.5f, 20.5f)
                curveTo(1.34f, 18.31f, 0.0f, 15.31f, 0.0f, 12.0f)
                reflectiveCurveTo(1.34f, 5.69f, 3.5f, 3.5f)
                lineTo(4.58f, 4.58f)
                curveTo(2.68f, 6.5f, 1.5f, 9.11f, 1.5f, 12.0f)
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 15.53f, 18.96f, 18.58f, 16.0f, 20.05f)
                verticalLineTo(17.74f)
                curveTo(17.81f, 16.47f, 19.0f, 14.37f, 19.0f, 12.0f)
                curveTo(19.0f, 8.14f, 15.86f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(5.0f, 8.14f, 5.0f, 12.0f)
                curveTo(5.0f, 14.37f, 6.19f, 16.47f, 8.0f, 17.74f)
                verticalLineTo(20.05f)
                curveTo(5.04f, 18.58f, 3.0f, 15.53f, 3.0f, 12.0f)
                curveTo(3.0f, 7.03f, 7.03f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(21.0f, 7.03f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _carBrakeTemperature!!
    }

private var _carBrakeTemperature: ImageVector? = null
