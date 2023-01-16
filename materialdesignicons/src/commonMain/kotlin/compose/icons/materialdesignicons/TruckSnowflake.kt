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

public val MaterialDesignIcons.TruckSnowflake: ImageVector
    get() {
        if (_truckSnowflake != null) {
            return _truckSnowflake!!
        }
        _truckSnowflake = Builder(name = "TruckSnowflake", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 18.7f, 4.3f, 20.0f, 6.0f, 20.0f)
                reflectiveCurveTo(9.0f, 18.7f, 9.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 18.7f, 16.3f, 20.0f, 18.0f, 20.0f)
                reflectiveCurveTo(21.0f, 18.7f, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                moveTo(10.2f, 5.3f)
                horizontalLineTo(10.5f)
                curveTo(11.0f, 5.4f, 11.3f, 5.9f, 11.2f, 6.4f)
                lineTo(10.7f, 8.4f)
                lineTo(12.7f, 7.9f)
                curveTo(13.2f, 7.8f, 13.7f, 8.1f, 13.8f, 8.6f)
                curveTo(13.9f, 9.1f, 13.6f, 9.6f, 13.2f, 9.7f)
                lineTo(11.2f, 10.2f)
                lineTo(12.6f, 11.6f)
                curveTo(13.0f, 11.9f, 13.0f, 12.5f, 12.6f, 12.9f)
                curveTo(12.3f, 13.3f, 11.7f, 13.3f, 11.3f, 12.9f)
                lineTo(9.8f, 11.5f)
                lineTo(9.3f, 13.5f)
                curveTo(9.2f, 14.0f, 8.7f, 14.3f, 8.2f, 14.1f)
                curveTo(7.7f, 14.0f, 7.4f, 13.5f, 7.6f, 13.0f)
                lineTo(8.1f, 11.0f)
                lineTo(6.1f, 11.5f)
                curveTo(5.6f, 11.6f, 5.1f, 11.3f, 5.0f, 10.9f)
                curveTo(4.9f, 10.4f, 5.2f, 9.9f, 5.6f, 9.8f)
                lineTo(7.6f, 9.3f)
                lineTo(6.2f, 7.7f)
                curveTo(5.9f, 7.4f, 5.9f, 6.8f, 6.2f, 6.4f)
                curveTo(6.5f, 6.1f, 7.1f, 6.1f, 7.5f, 6.4f)
                lineTo(8.9f, 7.8f)
                lineTo(9.4f, 5.8f)
                curveTo(9.5f, 5.6f, 9.8f, 5.3f, 10.2f, 5.3f)
                moveTo(17.0f, 9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.5f)
                moveTo(6.0f, 15.5f)
                curveTo(6.8f, 15.5f, 7.5f, 16.2f, 7.5f, 17.0f)
                reflectiveCurveTo(6.8f, 18.5f, 6.0f, 18.5f)
                reflectiveCurveTo(4.5f, 17.8f, 4.5f, 17.0f)
                reflectiveCurveTo(5.2f, 15.5f, 6.0f, 15.5f)
                moveTo(18.0f, 15.5f)
                curveTo(18.8f, 15.5f, 19.5f, 16.2f, 19.5f, 17.0f)
                reflectiveCurveTo(18.8f, 18.5f, 18.0f, 18.5f)
                reflectiveCurveTo(16.5f, 17.8f, 16.5f, 17.0f)
                reflectiveCurveTo(17.2f, 15.5f, 18.0f, 15.5f)
                close()
            }
        }
        .build()
        return _truckSnowflake!!
    }

private var _truckSnowflake: ImageVector? = null
