package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.DayRain: ImageVector
    get() {
        if (_dayRain != null) {
            return _dayRain!!
        }
        _dayRain = Builder(name = "DayRain", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.51f, 16.89f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.44f)
                reflectiveCurveToRelative(2.06f, 1.47f, 3.41f, 1.53f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.17f, -0.17f)
                curveToRelative(-0.86f, -0.04f, -1.59f, -0.39f, -2.19f, -1.03f)
                reflectiveCurveToRelative(-0.9f, -1.4f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.82f, 0.28f, -1.54f, 0.85f, -2.16f)
                reflectiveCurveToRelative(1.27f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.53f, -0.05f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.54f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                reflectiveCurveToRelative(1.76f, -1.1f, 2.85f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                reflectiveCurveToRelative(1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.07f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.19f, 0.17f, 0.19f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.89f, 0.0f, 1.65f, 0.32f, 2.3f, 0.96f)
                curveToRelative(0.65f, 0.64f, 0.97f, 1.39f, 0.97f, 2.27f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.18f, 1.03f)
                curveToRelative(-0.12f, 0.0f, -0.19f, 0.06f, -0.19f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.19f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.39f, -1.51f)
                curveToRelative(0.93f, -0.97f, 1.39f, -2.12f, 1.39f, -3.45f)
                curveToRelative(0.0f, -0.72f, -0.14f, -1.39f, -0.42f, -2.01f)
                curveToRelative(0.78f, -0.97f, 1.17f, -2.07f, 1.17f, -3.31f)
                curveToRelative(0.0f, -0.95f, -0.24f, -1.83f, -0.71f, -2.64f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.45f, -1.92f, -1.92f)
                reflectiveCurveToRelative(-1.68f, -0.7f, -2.62f, -0.7f)
                curveToRelative(-1.56f, 0.0f, -2.85f, 0.58f, -3.88f, 1.74f)
                curveToRelative(-0.82f, -0.44f, -1.72f, -0.66f, -2.71f, -0.66f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.32f)
                reflectiveCurveToRelative(-1.79f, 2.0f, -2.1f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.74f, 1.74f)
                reflectiveCurveTo(1.51f, 15.74f, 1.51f, 16.89f)
                close()
                moveTo(6.91f, 23.75f)
                curveToRelative(0.0f, 0.17f, 0.05f, 0.33f, 0.16f, 0.49f)
                curveToRelative(0.11f, 0.16f, 0.27f, 0.27f, 0.49f, 0.33f)
                curveToRelative(0.11f, 0.02f, 0.2f, 0.04f, 0.27f, 0.04f)
                curveToRelative(0.39f, 0.0f, 0.65f, -0.21f, 0.77f, -0.64f)
                lineToRelative(1.58f, -5.88f)
                curveToRelative(0.07f, -0.24f, 0.04f, -0.46f, -0.08f, -0.67f)
                curveToRelative(-0.12f, -0.21f, -0.3f, -0.33f, -0.53f, -0.38f)
                curveToRelative(-0.22f, -0.07f, -0.43f, -0.05f, -0.63f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.34f, 0.28f, -0.41f, 0.51f)
                lineToRelative(-1.58f, 5.91f)
                curveTo(6.93f, 23.66f, 6.91f, 23.73f, 6.91f, 23.75f)
                close()
                moveTo(9.52f, 26.83f)
                curveToRelative(0.0f, 0.19f, 0.05f, 0.36f, 0.15f, 0.52f)
                curveToRelative(0.1f, 0.16f, 0.27f, 0.26f, 0.52f, 0.3f)
                curveToRelative(0.11f, 0.02f, 0.2f, 0.04f, 0.26f, 0.04f)
                curveToRelative(0.16f, 0.0f, 0.31f, -0.06f, 0.45f, -0.17f)
                curveToRelative(0.14f, -0.12f, 0.23f, -0.28f, 0.27f, -0.48f)
                lineToRelative(2.4f, -8.93f)
                curveToRelative(0.06f, -0.23f, 0.04f, -0.45f, -0.07f, -0.64f)
                reflectiveCurveToRelative(-0.28f, -0.33f, -0.5f, -0.4f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.34f, 0.28f, -0.4f, 0.51f)
                lineToRelative(-2.4f, 8.93f)
                curveTo(9.53f, 26.73f, 9.52f, 26.82f, 9.52f, 26.83f)
                close()
                moveTo(9.94f, 4.6f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.25f, 0.61f)
                lineToRelative(0.65f, 0.66f)
                curveToRelative(0.19f, 0.15f, 0.4f, 0.22f, 0.62f, 0.22f)
                curveToRelative(0.21f, 0.0f, 0.41f, -0.08f, 0.58f, -0.23f)
                curveToRelative(0.17f, -0.16f, 0.26f, -0.35f, 0.26f, -0.59f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.46f, -0.24f, -0.64f)
                lineToRelative(-0.64f, -0.65f)
                curveToRelative(-0.18f, -0.17f, -0.38f, -0.25f, -0.6f, -0.25f)
                curveToRelative(-0.24f, 0.0f, -0.45f, 0.09f, -0.62f, 0.26f)
                curveTo(10.03f, 4.16f, 9.94f, 4.37f, 9.94f, 4.6f)
                close()
                moveTo(13.67f, 23.77f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.32f, 0.15f, 0.47f)
                reflectiveCurveToRelative(0.26f, 0.26f, 0.46f, 0.32f)
                curveToRelative(0.11f, 0.02f, 0.2f, 0.04f, 0.25f, 0.04f)
                curveToRelative(0.17f, 0.0f, 0.34f, -0.05f, 0.49f, -0.15f)
                curveToRelative(0.15f, -0.1f, 0.25f, -0.26f, 0.3f, -0.49f)
                lineToRelative(1.58f, -5.88f)
                curveToRelative(0.06f, -0.23f, 0.04f, -0.45f, -0.07f, -0.64f)
                curveToRelative(-0.11f, -0.2f, -0.28f, -0.33f, -0.5f, -0.4f)
                curveToRelative(-0.24f, -0.07f, -0.45f, -0.05f, -0.65f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.28f, -0.39f, 0.51f)
                lineToRelative(-1.58f, 5.91f)
                curveTo(13.69f, 23.68f, 13.67f, 23.76f, 13.67f, 23.77f)
                close()
                moveTo(15.3f, 9.03f)
                curveToRelative(0.71f, -0.67f, 1.53f, -1.0f, 2.48f, -1.0f)
                curveToRelative(0.98f, 0.0f, 1.82f, 0.35f, 2.5f, 1.04f)
                curveToRelative(0.69f, 0.69f, 1.03f, 1.53f, 1.03f, 2.52f)
                curveToRelative(0.0f, 0.62f, -0.17f, 1.24f, -0.52f, 1.85f)
                curveToRelative(-0.97f, -0.97f, -2.13f, -1.45f, -3.49f, -1.45f)
                horizontalLineToRelative(-0.33f)
                curveTo(16.7f, 10.81f, 16.14f, 9.83f, 15.3f, 9.03f)
                close()
                moveTo(16.92f, 3.78f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.43f, 0.25f, 0.59f)
                curveToRelative(0.17f, 0.16f, 0.37f, 0.24f, 0.61f, 0.24f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.24f, -0.35f, 0.24f, -0.59f)
                verticalLineTo(1.73f)
                curveToRelative(0.0f, -0.26f, -0.08f, -0.47f, -0.23f, -0.63f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.08f, -0.62f, 0.25f)
                reflectiveCurveToRelative(-0.24f, 0.37f, -0.24f, 0.62f)
                verticalLineTo(3.78f)
                close()
                moveTo(22.45f, 6.06f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.44f, 0.27f, 0.59f)
                curveToRelative(0.14f, 0.16f, 0.32f, 0.24f, 0.55f, 0.26f)
                curveToRelative(0.23f, 0.02f, 0.44f, -0.07f, 0.62f, -0.26f)
                lineToRelative(1.44f, -1.43f)
                curveToRelative(0.18f, -0.17f, 0.26f, -0.38f, 0.26f, -0.63f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.45f, -0.25f, -0.61f)
                curveToRelative(-0.17f, -0.16f, -0.37f, -0.24f, -0.61f, -0.24f)
                curveToRelative(-0.21f, 0.0f, -0.4f, 0.08f, -0.58f, 0.25f)
                lineToRelative(-1.43f, 1.44f)
                curveTo(22.54f, 5.6f, 22.45f, 5.81f, 22.45f, 6.06f)
                close()
                moveTo(23.26f, 17.91f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.45f, 0.24f, 0.63f)
                lineToRelative(0.65f, 0.63f)
                curveToRelative(0.18f, 0.14f, 0.38f, 0.21f, 0.6f, 0.21f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.23f, 0.0f, 0.42f, -0.08f, 0.58f, -0.24f)
                curveToRelative(0.16f, -0.16f, 0.24f, -0.37f, 0.24f, -0.61f)
                curveToRelative(0.0f, -0.24f, -0.09f, -0.43f, -0.26f, -0.58f)
                lineToRelative(-0.62f, -0.66f)
                curveToRelative(-0.18f, -0.16f, -0.39f, -0.24f, -0.62f, -0.24f)
                reflectiveCurveToRelative(-0.43f, 0.08f, -0.59f, 0.25f)
                reflectiveCurveTo(23.26f, 17.67f, 23.26f, 17.91f)
                close()
                moveTo(24.72f, 11.58f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.43f, 0.26f, 0.59f)
                curveToRelative(0.18f, 0.18f, 0.38f, 0.26f, 0.62f, 0.26f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.6f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.25f, -0.61f)
                reflectiveCurveToRelative(-0.37f, -0.26f, -0.61f, -0.26f)
                horizontalLineTo(25.6f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.09f, -0.62f, 0.26f)
                curveTo(24.8f, 11.14f, 24.72f, 11.34f, 24.72f, 11.58f)
                close()
            }
        }
        .build()
        return _dayRain!!
    }

private var _dayRain: ImageVector? = null
