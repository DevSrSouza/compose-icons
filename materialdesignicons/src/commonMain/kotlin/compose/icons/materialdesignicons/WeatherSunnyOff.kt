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

public val MaterialDesignIcons.WeatherSunnyOff: ImageVector
    get() {
        if (_weatherSunnyOff != null) {
            return _weatherSunnyOff!!
        }
        _weatherSunnyOff = Builder(name = "WeatherSunnyOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.97f, 6.86f)
                lineTo(3.34f, 7.0f)
                lineTo(5.11f, 10.79f)
                curveTo(5.25f, 10.0f, 5.5f, 9.24f, 5.94f, 8.5f)
                curveTo(6.0f, 8.36f, 6.13f, 8.24f, 6.22f, 8.11f)
                lineTo(7.66f, 9.55f)
                curveTo(7.25f, 10.27f, 7.0f, 11.11f, 7.0f, 12.0f)
                curveTo(7.0f, 14.76f, 9.24f, 17.0f, 12.0f, 17.0f)
                curveTo(12.9f, 17.0f, 13.73f, 16.75f, 14.45f, 16.34f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.0f, 15.0f)
                curveTo(10.34f, 15.0f, 9.0f, 13.66f, 9.0f, 12.0f)
                curveTo(9.0f, 11.67f, 9.07f, 11.36f, 9.17f, 11.06f)
                lineTo(12.94f, 14.83f)
                curveTo(12.64f, 14.93f, 12.33f, 15.0f, 12.0f, 15.0f)
                moveTo(18.05f, 8.5f)
                curveTo(17.63f, 7.78f, 17.1f, 7.15f, 16.5f, 6.64f)
                lineTo(20.65f, 7.0f)
                lineTo(18.88f, 10.79f)
                curveTo(18.74f, 10.0f, 18.47f, 9.23f, 18.05f, 8.5f)
                moveTo(12.0f, 7.0f)
                curveTo(14.76f, 7.0f, 17.0f, 9.24f, 17.0f, 12.0f)
                curveTo(17.0f, 12.54f, 16.89f, 13.05f, 16.74f, 13.54f)
                lineTo(15.0f, 11.78f)
                curveTo(14.87f, 10.3f, 13.7f, 9.13f, 12.22f, 9.0f)
                lineTo(10.47f, 7.27f)
                curveTo(10.95f, 7.11f, 11.46f, 7.0f, 12.0f, 7.0f)
                moveTo(12.0f, 5.0f)
                curveTo(11.16f, 5.0f, 10.35f, 5.15f, 9.61f, 5.42f)
                lineTo(12.0f, 2.0f)
                lineTo(14.39f, 5.42f)
                curveTo(13.65f, 5.15f, 12.84f, 5.0f, 12.0f, 5.0f)
                moveTo(18.87f, 13.21f)
                lineTo(20.64f, 17.0f)
                lineTo(20.24f, 17.04f)
                lineTo(18.25f, 15.05f)
                curveTo(18.54f, 14.45f, 18.76f, 13.84f, 18.87f, 13.21f)
                moveTo(12.0f, 19.0f)
                curveTo(12.82f, 19.0f, 13.63f, 18.83f, 14.37f, 18.56f)
                lineTo(12.0f, 22.0f)
                lineTo(9.59f, 18.56f)
                curveTo(10.33f, 18.83f, 11.14f, 19.0f, 12.0f, 19.0f)
                moveTo(5.95f, 15.5f)
                curveTo(6.37f, 16.24f, 6.91f, 16.86f, 7.5f, 17.37f)
                lineTo(3.36f, 17.0f)
                lineTo(5.12f, 13.23f)
                curveTo(5.26f, 14.0f, 5.53f, 14.78f, 5.95f, 15.5f)
                close()
            }
        }
        .build()
        return _weatherSunnyOff!!
    }

private var _weatherSunnyOff: ImageVector? = null
