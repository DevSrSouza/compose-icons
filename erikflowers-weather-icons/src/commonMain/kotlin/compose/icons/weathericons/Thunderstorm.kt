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

public val WeatherIcons.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.63f, 16.91f)
                curveToRelative(0.0f, 1.11f, 0.33f, 2.1f, 0.99f, 2.97f)
                reflectiveCurveToRelative(1.52f, 1.47f, 2.58f, 1.79f)
                lineToRelative(-0.66f, 1.68f)
                curveToRelative(-0.03f, 0.14f, 0.02f, 0.22f, 0.14f, 0.22f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-0.98f, 4.3f)
                horizontalLineToRelative(0.28f)
                lineToRelative(3.92f, -5.75f)
                curveToRelative(0.04f, -0.04f, 0.04f, -0.09f, 0.01f, -0.14f)
                curveToRelative(-0.03f, -0.05f, -0.08f, -0.07f, -0.15f, -0.07f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(2.48f, -4.64f)
                curveToRelative(0.07f, -0.14f, 0.02f, -0.22f, -0.14f, -0.22f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.05f, -0.23f, 0.15f)
                lineToRelative(-1.07f, 2.87f)
                curveToRelative(-0.71f, -0.18f, -1.3f, -0.57f, -1.77f, -1.16f)
                curveToRelative(-0.47f, -0.59f, -0.7f, -1.26f, -0.7f, -2.01f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.85f, -2.17f)
                curveToRelative(0.57f, -0.61f, 1.27f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.53f, -0.07f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.18f)
                lineToRelative(0.07f, -0.51f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.1f, 2.85f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.85f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.97f, 1.4f, 0.97f, 2.28f)
                curveToRelative(0.0f, 0.85f, -0.3f, 1.59f, -0.89f, 2.21f)
                curveToRelative(-0.59f, 0.62f, -1.33f, 0.97f, -2.2f, 1.04f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.18f)
                verticalLineToRelative(1.37f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.39f, -1.51f)
                reflectiveCurveToRelative(1.39f, -2.11f, 1.39f, -3.45f)
                curveToRelative(0.0f, -0.9f, -0.22f, -1.73f, -0.67f, -2.49f)
                curveToRelative(-0.44f, -0.76f, -1.05f, -1.36f, -1.81f, -1.8f)
                curveToRelative(-0.77f, -0.44f, -1.6f, -0.66f, -2.5f, -0.66f)
                horizontalLineTo(20.1f)
                curveToRelative(-0.33f, -1.33f, -1.04f, -2.42f, -2.11f, -3.26f)
                reflectiveCurveToRelative(-2.3f, -1.27f, -3.68f, -1.27f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.79f, 1.99f, -2.1f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.83f, -2.74f, 1.73f)
                reflectiveCurveTo(4.63f, 15.76f, 4.63f, 16.91f)
                close()
                moveTo(12.77f, 26.62f)
                curveToRelative(0.0f, 0.39f, 0.19f, 0.65f, 0.58f, 0.77f)
                curveToRelative(0.01f, 0.0f, 0.05f, 0.0f, 0.11f, 0.01f)
                curveToRelative(0.06f, 0.01f, 0.11f, 0.01f, 0.14f, 0.01f)
                curveToRelative(0.17f, 0.0f, 0.33f, -0.05f, 0.49f, -0.15f)
                curveToRelative(0.16f, -0.1f, 0.27f, -0.26f, 0.32f, -0.48f)
                lineToRelative(2.25f, -8.69f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.45f, -0.07f, -0.65f)
                curveToRelative(-0.11f, -0.19f, -0.27f, -0.32f, -0.5f, -0.39f)
                curveToRelative(-0.17f, -0.02f, -0.26f, -0.03f, -0.26f, -0.03f)
                curveToRelative(-0.16f, 0.0f, -0.32f, 0.05f, -0.47f, 0.15f)
                curveToRelative(-0.15f, 0.1f, -0.26f, 0.25f, -0.31f, 0.45f)
                lineToRelative(-2.26f, 8.72f)
                curveTo(12.78f, 26.44f, 12.77f, 26.53f, 12.77f, 26.62f)
                close()
                moveTo(16.93f, 23.56f)
                curveToRelative(0.0f, 0.13f, 0.03f, 0.26f, 0.1f, 0.38f)
                curveToRelative(0.14f, 0.22f, 0.31f, 0.37f, 0.51f, 0.44f)
                curveToRelative(0.11f, 0.03f, 0.21f, 0.05f, 0.3f, 0.05f)
                reflectiveCurveToRelative(0.2f, -0.02f, 0.32f, -0.08f)
                curveToRelative(0.21f, -0.09f, 0.35f, -0.28f, 0.42f, -0.57f)
                lineToRelative(1.44f, -5.67f)
                curveToRelative(0.03f, -0.14f, 0.05f, -0.23f, 0.05f, -0.27f)
                curveToRelative(0.0f, -0.15f, -0.05f, -0.3f, -0.16f, -0.45f)
                reflectiveCurveToRelative(-0.26f, -0.26f, -0.46f, -0.32f)
                curveToRelative(-0.17f, -0.02f, -0.26f, -0.03f, -0.26f, -0.03f)
                curveToRelative(-0.17f, 0.0f, -0.33f, 0.05f, -0.47f, 0.15f)
                curveToRelative(-0.14f, 0.1f, -0.24f, 0.25f, -0.3f, 0.45f)
                lineToRelative(-1.46f, 5.7f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.05f, -0.01f, 0.11f)
                curveTo(16.93f, 23.5f, 16.93f, 23.53f, 16.93f, 23.56f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
