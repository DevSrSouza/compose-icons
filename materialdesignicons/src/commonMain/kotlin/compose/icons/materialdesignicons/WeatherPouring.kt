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

public val MaterialDesignIcons.WeatherPouring: ImageVector
    get() {
        if (_weatherPouring != null) {
            return _weatherPouring!!
        }
        _weatherPouring = Builder(name = "WeatherPouring", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveTo(9.53f, 12.14f, 9.85f, 12.69f, 9.71f, 13.22f)
                lineTo(8.41f, 18.05f)
                curveTo(8.27f, 18.59f, 7.72f, 18.9f, 7.19f, 18.76f)
                curveTo(6.65f, 18.62f, 6.34f, 18.07f, 6.5f, 17.54f)
                lineTo(7.78f, 12.71f)
                curveTo(7.92f, 12.17f, 8.47f, 11.86f, 9.0f, 12.0f)
                moveTo(13.0f, 12.0f)
                curveTo(13.53f, 12.14f, 13.85f, 12.69f, 13.71f, 13.22f)
                lineTo(11.64f, 20.95f)
                curveTo(11.5f, 21.5f, 10.95f, 21.8f, 10.41f, 21.66f)
                curveTo(9.88f, 21.5f, 9.56f, 20.97f, 9.7f, 20.43f)
                lineTo(11.78f, 12.71f)
                curveTo(11.92f, 12.17f, 12.47f, 11.86f, 13.0f, 12.0f)
                moveTo(17.0f, 12.0f)
                curveTo(17.53f, 12.14f, 17.85f, 12.69f, 17.71f, 13.22f)
                lineTo(16.41f, 18.05f)
                curveTo(16.27f, 18.59f, 15.72f, 18.9f, 15.19f, 18.76f)
                curveTo(14.65f, 18.62f, 14.34f, 18.07f, 14.5f, 17.54f)
                lineTo(15.78f, 12.71f)
                curveTo(15.92f, 12.17f, 16.47f, 11.86f, 17.0f, 12.0f)
                moveTo(17.0f, 10.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                curveTo(9.5f, 4.0f, 7.45f, 5.82f, 7.06f, 8.19f)
                curveTo(6.73f, 8.07f, 6.37f, 8.0f, 6.0f, 8.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 11.0f)
                curveTo(3.0f, 12.11f, 3.6f, 13.08f, 4.5f, 13.6f)
                verticalLineTo(13.59f)
                curveTo(5.0f, 13.87f, 5.14f, 14.5f, 4.87f, 14.96f)
                curveTo(4.59f, 15.43f, 4.0f, 15.6f, 3.5f, 15.32f)
                verticalLineTo(15.33f)
                curveTo(2.0f, 14.47f, 1.0f, 12.85f, 1.0f, 11.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 6.0f, 6.0f)
                curveTo(7.0f, 3.65f, 9.3f, 2.0f, 12.0f, 2.0f)
                curveTo(15.43f, 2.0f, 18.24f, 4.66f, 18.5f, 8.03f)
                lineTo(19.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 23.0f, 12.0f)
                curveTo(23.0f, 13.5f, 22.2f, 14.77f, 21.0f, 15.46f)
                verticalLineTo(15.46f)
                curveTo(20.5f, 15.73f, 19.91f, 15.57f, 19.63f, 15.09f)
                curveTo(19.36f, 14.61f, 19.5f, 14.0f, 20.0f, 13.72f)
                verticalLineTo(13.73f)
                curveTo(20.6f, 13.39f, 21.0f, 12.74f, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 10.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _weatherPouring!!
    }

private var _weatherPouring: ImageVector? = null
