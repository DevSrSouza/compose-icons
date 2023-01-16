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

public val MaterialDesignIcons.WeatherSnowy: ImageVector
    get() {
        if (_weatherSnowy != null) {
            return _weatherSnowy!!
        }
        _weatherSnowy = Builder(name = "WeatherSnowy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 1.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 6.0f)
                curveTo(7.0f, 3.65f, 9.3f, 2.0f, 12.0f, 2.0f)
                curveTo(15.43f, 2.0f, 18.24f, 4.66f, 18.5f, 8.03f)
                lineTo(19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 19.0f, 16.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 14.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(9.5f, 4.0f, 7.45f, 5.82f, 7.06f, 8.19f)
                curveTo(6.73f, 8.07f, 6.37f, 8.0f, 6.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 11.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 14.0f)
                moveTo(7.88f, 18.07f)
                lineTo(10.07f, 17.5f)
                lineTo(8.46f, 15.88f)
                curveTo(8.07f, 15.5f, 8.07f, 14.86f, 8.46f, 14.46f)
                curveTo(8.85f, 14.07f, 9.5f, 14.07f, 9.88f, 14.46f)
                lineTo(11.5f, 16.07f)
                lineTo(12.07f, 13.88f)
                curveTo(12.21f, 13.34f, 12.76f, 13.03f, 13.29f, 13.17f)
                curveTo(13.83f, 13.31f, 14.14f, 13.86f, 14.0f, 14.4f)
                lineTo(13.41f, 16.59f)
                lineTo(15.6f, 16.0f)
                curveTo(16.14f, 15.86f, 16.69f, 16.17f, 16.83f, 16.71f)
                curveTo(16.97f, 17.24f, 16.66f, 17.79f, 16.12f, 17.93f)
                lineTo(13.93f, 18.5f)
                lineTo(15.54f, 20.12f)
                curveTo(15.93f, 20.5f, 15.93f, 21.15f, 15.54f, 21.54f)
                curveTo(15.15f, 21.93f, 14.5f, 21.93f, 14.12f, 21.54f)
                lineTo(12.5f, 19.93f)
                lineTo(11.93f, 22.12f)
                curveTo(11.79f, 22.66f, 11.24f, 22.97f, 10.71f, 22.83f)
                curveTo(10.17f, 22.69f, 9.86f, 22.14f, 10.0f, 21.6f)
                lineTo(10.59f, 19.41f)
                lineTo(8.4f, 20.0f)
                curveTo(7.86f, 20.14f, 7.31f, 19.83f, 7.17f, 19.29f)
                curveTo(7.03f, 18.76f, 7.34f, 18.21f, 7.88f, 18.07f)
                close()
            }
        }
        .build()
        return _weatherSnowy!!
    }

private var _weatherSnowy: ImageVector? = null
