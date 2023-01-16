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

public val MaterialDesignIcons.WeatherRainy: ImageVector
    get() {
        if (_weatherRainy != null) {
            return _weatherRainy!!
        }
        _weatherRainy = Builder(name = "WeatherRainy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.03f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 15.03f)
                curveTo(7.0f, 15.58f, 6.55f, 16.03f, 6.0f, 16.03f)
                curveTo(3.24f, 16.03f, 1.0f, 13.79f, 1.0f, 11.03f)
                curveTo(1.0f, 8.27f, 3.24f, 6.03f, 6.0f, 6.03f)
                curveTo(7.0f, 3.68f, 9.3f, 2.03f, 12.0f, 2.03f)
                curveTo(15.43f, 2.03f, 18.24f, 4.69f, 18.5f, 8.06f)
                lineTo(19.0f, 8.03f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 12.03f)
                curveTo(23.0f, 14.23f, 21.21f, 16.03f, 19.0f, 16.03f)
                horizontalLineTo(18.0f)
                curveTo(17.45f, 16.03f, 17.0f, 15.58f, 17.0f, 15.03f)
                curveTo(17.0f, 14.47f, 17.45f, 14.03f, 18.0f, 14.03f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.03f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.03f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.03f)
                curveTo(17.0f, 6.27f, 14.76f, 4.03f, 12.0f, 4.03f)
                curveTo(9.5f, 4.03f, 7.45f, 5.84f, 7.06f, 8.21f)
                curveTo(6.73f, 8.09f, 6.37f, 8.03f, 6.0f, 8.03f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 11.03f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 14.03f)
                moveTo(12.0f, 14.15f)
                curveTo(12.18f, 14.39f, 12.37f, 14.66f, 12.56f, 14.94f)
                curveTo(13.0f, 15.56f, 14.0f, 17.03f, 14.0f, 18.0f)
                curveTo(14.0f, 19.11f, 13.1f, 20.0f, 12.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 18.0f)
                curveTo(10.0f, 17.03f, 11.0f, 15.56f, 11.44f, 14.94f)
                curveTo(11.63f, 14.66f, 11.82f, 14.4f, 12.0f, 14.15f)
                moveTo(12.0f, 11.03f)
                lineTo(11.5f, 11.59f)
                curveTo(11.5f, 11.59f, 10.65f, 12.55f, 9.79f, 13.81f)
                curveTo(8.93f, 15.06f, 8.0f, 16.56f, 8.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 18.0f)
                curveTo(16.0f, 16.56f, 15.07f, 15.06f, 14.21f, 13.81f)
                curveTo(13.35f, 12.55f, 12.5f, 11.59f, 12.5f, 11.59f)
            }
        }
        .build()
        return _weatherRainy!!
    }

private var _weatherRainy: ImageVector? = null
