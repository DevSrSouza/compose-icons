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

public val MaterialDesignIcons.WeatherSunsetDown: ImageVector
    get() {
        if (_weatherSunsetDown != null) {
            return _weatherSunsetDown!!
        }
        _weatherSunsetDown = Builder(name = "WeatherSunsetDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineTo(7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 7.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 12.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 14.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 12.0f)
                moveTo(15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                horizontalLineTo(15.0f)
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
                moveTo(20.65f, 7.0f)
                lineTo(18.88f, 10.79f)
                curveTo(18.74f, 10.0f, 18.47f, 9.23f, 18.05f, 8.5f)
                curveTo(17.63f, 7.78f, 17.1f, 7.15f, 16.5f, 6.64f)
                lineTo(20.65f, 7.0f)
                moveTo(12.71f, 20.71f)
                lineTo(15.82f, 17.6f)
                curveTo(16.21f, 17.21f, 16.21f, 16.57f, 15.82f, 16.18f)
                curveTo(15.43f, 15.79f, 14.8f, 15.79f, 14.41f, 16.18f)
                lineTo(12.0f, 18.59f)
                lineTo(9.59f, 16.18f)
                curveTo(9.2f, 15.79f, 8.57f, 15.79f, 8.18f, 16.18f)
                curveTo(7.79f, 16.57f, 7.79f, 17.21f, 8.18f, 17.6f)
                lineTo(11.29f, 20.71f)
                curveTo(11.5f, 20.9f, 11.74f, 21.0f, 12.0f, 21.0f)
                curveTo(12.26f, 21.0f, 12.5f, 20.9f, 12.71f, 20.71f)
                close()
            }
        }
        .build()
        return _weatherSunsetDown!!
    }

private var _weatherSunsetDown: ImageVector? = null
