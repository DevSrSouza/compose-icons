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

public val MaterialDesignIcons.WeatherCloudyClock: ImageVector
    get() {
        if (_weatherCloudyClock != null) {
            return _weatherCloudyClock!!
        }
        _weatherCloudyClock = Builder(name = "WeatherCloudyClock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.82f)
                lineTo(18.94f, 17.23f)
                lineTo(18.19f, 18.53f)
                lineTo(15.0f, 16.69f)
                verticalLineTo(13.0f)
                moveTo(18.13f, 9.33f)
                curveTo(17.23f, 6.81f, 14.83f, 5.0f, 12.0f, 5.0f)
                curveTo(9.3f, 5.0f, 7.0f, 6.65f, 6.0f, 9.0f)
                curveTo(3.24f, 9.0f, 1.0f, 11.24f, 1.0f, 14.0f)
                reflectiveCurveTo(3.24f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(9.68f)
                curveTo(10.81f, 21.36f, 13.21f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                curveTo(23.0f, 12.88f, 20.96f, 10.24f, 18.13f, 9.33f)
                moveTo(6.0f, 17.0f)
                curveTo(4.34f, 17.0f, 3.0f, 15.66f, 3.0f, 14.0f)
                reflectiveCurveTo(4.34f, 11.0f, 6.0f, 11.0f)
                curveTo(6.37f, 11.0f, 6.73f, 11.07f, 7.06f, 11.19f)
                curveTo(7.45f, 8.82f, 9.5f, 7.0f, 12.0f, 7.0f)
                curveTo(13.63f, 7.0f, 15.07f, 7.79f, 16.0f, 9.0f)
                curveTo(12.12f, 9.0f, 9.0f, 12.14f, 9.0f, 16.0f)
                curveTo(9.0f, 16.34f, 9.03f, 16.67f, 9.08f, 17.0f)
                horizontalLineTo(6.0f)
                moveTo(16.0f, 21.0f)
                curveTo(13.24f, 21.0f, 11.0f, 18.76f, 11.0f, 16.0f)
                reflectiveCurveTo(13.24f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.24f, 21.0f, 16.0f)
                reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f)
                close()
            }
        }
        .build()
        return _weatherCloudyClock!!
    }

private var _weatherCloudyClock: ImageVector? = null
