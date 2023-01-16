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

public val MaterialDesignIcons.WeatherNight: ImageVector
    get() {
        if (_weatherNight != null) {
            return _weatherNight!!
        }
        _weatherNight = Builder(name = "WeatherNight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 4.09f)
                lineTo(15.22f, 6.03f)
                lineTo(16.13f, 9.09f)
                lineTo(13.5f, 7.28f)
                lineTo(10.87f, 9.09f)
                lineTo(11.78f, 6.03f)
                lineTo(9.25f, 4.09f)
                lineTo(12.44f, 4.0f)
                lineTo(13.5f, 1.0f)
                lineTo(14.56f, 4.0f)
                lineTo(17.75f, 4.09f)
                moveTo(21.25f, 11.0f)
                lineTo(19.61f, 12.25f)
                lineTo(20.2f, 14.23f)
                lineTo(18.5f, 13.06f)
                lineTo(16.8f, 14.23f)
                lineTo(17.39f, 12.25f)
                lineTo(15.75f, 11.0f)
                lineTo(17.81f, 10.95f)
                lineTo(18.5f, 9.0f)
                lineTo(19.19f, 10.95f)
                lineTo(21.25f, 11.0f)
                moveTo(18.97f, 15.95f)
                curveTo(19.8f, 15.87f, 20.69f, 17.05f, 20.16f, 17.8f)
                curveTo(19.84f, 18.25f, 19.5f, 18.67f, 19.08f, 19.07f)
                curveTo(15.17f, 23.0f, 8.84f, 23.0f, 4.94f, 19.07f)
                curveTo(1.03f, 15.17f, 1.03f, 8.83f, 4.94f, 4.93f)
                curveTo(5.34f, 4.53f, 5.76f, 4.17f, 6.21f, 3.85f)
                curveTo(6.96f, 3.32f, 8.14f, 4.21f, 8.06f, 5.04f)
                curveTo(7.79f, 7.9f, 8.75f, 10.87f, 10.95f, 13.06f)
                curveTo(13.14f, 15.26f, 16.1f, 16.22f, 18.97f, 15.95f)
                moveTo(17.33f, 17.97f)
                curveTo(14.5f, 17.81f, 11.7f, 16.64f, 9.53f, 14.5f)
                curveTo(7.36f, 12.31f, 6.2f, 9.5f, 6.04f, 6.68f)
                curveTo(3.23f, 9.82f, 3.34f, 14.64f, 6.35f, 17.66f)
                curveTo(9.37f, 20.67f, 14.19f, 20.78f, 17.33f, 17.97f)
                close()
            }
        }
        .build()
        return _weatherNight!!
    }

private var _weatherNight: ImageVector? = null
