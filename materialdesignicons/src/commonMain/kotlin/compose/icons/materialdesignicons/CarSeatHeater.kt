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

public val MaterialDesignIcons.CarSeatHeater: ImageVector
    get() {
        if (_carSeatHeater != null) {
            return _carSeatHeater!!
        }
        _carSeatHeater = Builder(name = "CarSeatHeater", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 18.0f)
                curveTo(5.0f, 18.0f, 2.0f, 10.0f, 2.0f, 6.0f)
                reflectiveCurveTo(4.0f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 2.0f, 6.0f, 2.0f, 6.0f, 3.0f)
                reflectiveCurveTo(5.0f, 4.0f, 5.0f, 6.0f)
                reflectiveCurveTo(8.0f, 10.0f, 8.0f, 13.0f)
                reflectiveCurveTo(5.0f, 18.0f, 5.0f, 18.0f)
                moveTo(15.0f, 17.0f)
                curveTo(16.1f, 17.0f, 17.0f, 17.9f, 17.0f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(17.0f, 21.1f, 16.1f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(7.0f, 22.0f, 6.0f, 20.2f, 6.0f, 20.2f)
                curveTo(5.8f, 20.0f, 5.7f, 19.6f, 6.0f, 19.4f)
                curveTo(6.0f, 19.4f, 9.0f, 16.9f, 10.0f, 16.9f)
                horizontalLineTo(15.0f)
                moveTo(13.7f, 3.4f)
                lineTo(12.3f, 6.8f)
                lineTo(13.7f, 10.2f)
                lineTo(11.7f, 15.0f)
                lineTo(10.0f, 13.6f)
                lineTo(11.4f, 10.2f)
                lineTo(10.0f, 6.8f)
                lineTo(12.0f, 2.0f)
                lineTo(13.7f, 3.4f)
                moveTo(17.9f, 3.4f)
                lineTo(16.5f, 6.8f)
                lineTo(17.9f, 10.2f)
                lineTo(15.9f, 15.0f)
                lineTo(14.2f, 13.6f)
                lineTo(15.6f, 10.2f)
                lineTo(14.2f, 6.8f)
                lineTo(16.2f, 2.0f)
                lineTo(17.9f, 3.4f)
                moveTo(22.0f, 3.4f)
                lineTo(20.6f, 6.8f)
                lineTo(22.0f, 10.2f)
                lineTo(20.0f, 15.0f)
                lineTo(18.3f, 13.6f)
                lineTo(19.7f, 10.2f)
                lineTo(18.3f, 6.8f)
                lineTo(20.3f, 2.0f)
                lineTo(22.0f, 3.4f)
            }
        }
        .build()
        return _carSeatHeater!!
    }

private var _carSeatHeater: ImageVector? = null
