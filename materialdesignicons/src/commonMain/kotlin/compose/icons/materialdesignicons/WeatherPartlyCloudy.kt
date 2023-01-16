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

public val MaterialDesignIcons.WeatherPartlyCloudy: ImageVector
    get() {
        if (_weatherPartlyCloudy != null) {
            return _weatherPartlyCloudy!!
        }
        _weatherPartlyCloudy = Builder(name = "WeatherPartlyCloudy", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.74f, 5.47f)
                curveTo(15.1f, 6.5f, 16.35f, 9.03f, 15.92f, 11.46f)
                curveTo(17.19f, 12.56f, 18.0f, 14.19f, 18.0f, 16.0f)
                verticalLineTo(16.17f)
                curveTo(18.31f, 16.06f, 18.65f, 16.0f, 19.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 22.0f)
                horizontalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 2.0f, 18.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 14.0f)
                horizontalLineTo(6.27f)
                curveTo(5.0f, 12.45f, 4.6f, 10.24f, 5.5f, 8.26f)
                curveTo(6.72f, 5.5f, 9.97f, 4.24f, 12.74f, 5.47f)
                moveTo(11.93f, 7.3f)
                curveTo(10.16f, 6.5f, 8.09f, 7.31f, 7.31f, 9.07f)
                curveTo(6.85f, 10.09f, 6.93f, 11.22f, 7.41f, 12.13f)
                curveTo(8.5f, 10.83f, 10.16f, 10.0f, 12.0f, 10.0f)
                curveTo(12.7f, 10.0f, 13.38f, 10.12f, 14.0f, 10.34f)
                curveTo(13.94f, 9.06f, 13.18f, 7.86f, 11.93f, 7.3f)
                moveTo(13.55f, 3.64f)
                curveTo(13.0f, 3.4f, 12.45f, 3.23f, 11.88f, 3.12f)
                lineTo(14.37f, 1.82f)
                lineTo(15.27f, 4.71f)
                curveTo(14.76f, 4.29f, 14.19f, 3.93f, 13.55f, 3.64f)
                moveTo(6.09f, 4.44f)
                curveTo(5.6f, 4.79f, 5.17f, 5.19f, 4.8f, 5.63f)
                lineTo(4.91f, 2.82f)
                lineTo(7.87f, 3.5f)
                curveTo(7.25f, 3.71f, 6.65f, 4.03f, 6.09f, 4.44f)
                moveTo(18.0f, 9.71f)
                curveTo(17.91f, 9.12f, 17.78f, 8.55f, 17.59f, 8.0f)
                lineTo(19.97f, 9.5f)
                lineTo(17.92f, 11.73f)
                curveTo(18.03f, 11.08f, 18.05f, 10.4f, 18.0f, 9.71f)
                moveTo(3.04f, 11.3f)
                curveTo(3.11f, 11.9f, 3.24f, 12.47f, 3.43f, 13.0f)
                lineTo(1.06f, 11.5f)
                lineTo(3.1f, 9.28f)
                curveTo(3.0f, 9.93f, 2.97f, 10.61f, 3.04f, 11.3f)
                moveTo(19.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 16.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 18.0f)
                close()
            }
        }
        .build()
        return _weatherPartlyCloudy!!
    }

private var _weatherPartlyCloudy: ImageVector? = null
