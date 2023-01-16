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

public val MaterialDesignIcons.WeatherSunnyAlert: ImageVector
    get() {
        if (_weatherSunnyAlert != null) {
            return _weatherSunnyAlert!!
        }
        _weatherSunnyAlert = Builder(name = "WeatherSunnyAlert", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 7.0f)
                moveTo(12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(12.0f, 2.0f)
                lineTo(14.39f, 5.42f)
                curveTo(13.65f, 5.15f, 12.84f, 5.0f, 12.0f, 5.0f)
                curveTo(11.16f, 5.0f, 10.35f, 5.15f, 9.61f, 5.42f)
                lineTo(12.0f, 2.0f)
                moveTo(3.34f, 7.0f)
                lineTo(7.5f, 6.65f)
                curveTo(6.9f, 7.16f, 6.36f, 7.78f, 5.94f, 8.5f)
                curveTo(5.5f, 9.24f, 5.25f, 10.0f, 5.11f, 10.79f)
                lineTo(3.34f, 7.0f)
                moveTo(3.36f, 17.0f)
                lineTo(5.12f, 13.23f)
                curveTo(5.26f, 14.0f, 5.53f, 14.78f, 5.95f, 15.5f)
                curveTo(6.37f, 16.24f, 6.91f, 16.86f, 7.5f, 17.37f)
                lineTo(3.36f, 17.0f)
                moveTo(12.0f, 22.0f)
                lineTo(9.59f, 18.56f)
                curveTo(10.33f, 18.83f, 11.14f, 19.0f, 12.0f, 19.0f)
                curveTo(12.82f, 19.0f, 13.63f, 18.83f, 14.37f, 18.56f)
                moveTo(19.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
            }
        }
        .build()
        return _weatherSunnyAlert!!
    }

private var _weatherSunnyAlert: ImageVector? = null
