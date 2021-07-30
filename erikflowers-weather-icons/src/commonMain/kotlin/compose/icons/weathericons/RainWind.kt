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

public val WeatherIcons.RainWind: ImageVector
    get() {
        if (_rainWind != null) {
            return _rainWind!!
        }
        _rainWind = Builder(name = "RainWind", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.63f, 16.93f)
                curveToRelative(0.0f, 1.12f, 0.33f, 2.11f, 0.98f, 2.99f)
                curveToRelative(0.65f, 0.87f, 1.5f, 1.47f, 2.55f, 1.79f)
                curveToRelative(0.09f, 0.02f, 0.17f, -0.01f, 0.24f, -0.08f)
                lineToRelative(1.16f, -1.43f)
                curveToRelative(-0.89f, 0.0f, -1.65f, -0.32f, -2.28f, -0.96f)
                curveToRelative(-0.63f, -0.64f, -0.95f, -1.41f, -0.95f, -2.31f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.58f, 0.84f, -2.2f)
                reflectiveCurveToRelative(1.26f, -0.97f, 2.1f, -1.04f)
                lineToRelative(0.53f, -0.07f)
                curveToRelative(0.11f, 0.0f, 0.16f, -0.04f, 0.16f, -0.13f)
                lineToRelative(0.08f, -0.55f)
                curveToRelative(0.12f, -1.1f, 0.59f, -2.01f, 1.39f, -2.73f)
                reflectiveCurveToRelative(1.75f, -1.08f, 2.85f, -1.08f)
                curveToRelative(1.1f, 0.0f, 2.06f, 0.36f, 2.87f, 1.09f)
                curveToRelative(0.82f, 0.73f, 1.27f, 1.64f, 1.37f, 2.72f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.02f, 0.11f, 0.1f, 0.17f, 0.22f, 0.17f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.9f, 0.0f, 1.67f, 0.32f, 2.3f, 0.95f)
                reflectiveCurveToRelative(0.95f, 1.39f, 0.95f, 2.29f)
                curveToRelative(0.0f, 0.83f, -0.28f, 1.56f, -0.84f, 2.18f)
                reflectiveCurveToRelative(-1.25f, 0.98f, -2.07f, 1.08f)
                curveToRelative(-0.12f, 0.0f, -0.28f, 0.02f, -0.49f, 0.06f)
                curveToRelative(-0.19f, 0.02f, -0.33f, 0.09f, -0.41f, 0.23f)
                lineToRelative(-2.36f, 2.79f)
                curveToRelative(-0.14f, 0.18f, -0.2f, 0.39f, -0.16f, 0.63f)
                curveToRelative(0.03f, 0.24f, 0.14f, 0.43f, 0.31f, 0.57f)
                curveToRelative(0.11f, 0.12f, 0.29f, 0.19f, 0.56f, 0.19f)
                curveToRelative(0.26f, 0.0f, 0.47f, -0.12f, 0.61f, -0.35f)
                lineToRelative(2.12f, -2.44f)
                curveToRelative(1.24f, -0.13f, 2.29f, -0.66f, 3.15f, -1.61f)
                curveToRelative(0.86f, -0.95f, 1.28f, -2.06f, 1.28f, -3.33f)
                curveToRelative(0.0f, -0.67f, -0.13f, -1.32f, -0.39f, -1.93f)
                curveToRelative(-0.26f, -0.61f, -0.61f, -1.14f, -1.05f, -1.58f)
                curveToRelative(-0.44f, -0.44f, -0.97f, -0.79f, -1.58f, -1.05f)
                curveToRelative(-0.61f, -0.26f, -1.25f, -0.39f, -1.93f, -0.39f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.33f, -1.32f, -1.04f, -2.41f, -2.12f, -3.26f)
                reflectiveCurveToRelative(-2.32f, -1.27f, -3.72f, -1.27f)
                curveToRelative(-0.93f, 0.0f, -1.81f, 0.2f, -2.63f, 0.6f)
                curveToRelative(-0.82f, 0.4f, -1.51f, 0.95f, -2.08f, 1.66f)
                reflectiveCurveToRelative(-0.94f, 1.52f, -1.13f, 2.42f)
                curveToRelative(-1.12f, 0.25f, -2.04f, 0.82f, -2.75f, 1.72f)
                curveTo(4.98f, 14.74f, 4.63f, 15.77f, 4.63f, 16.93f)
                close()
                moveTo(8.01f, 24.95f)
                curveToRelative(0.0f, 0.06f, 0.02f, 0.16f, 0.06f, 0.3f)
                curveToRelative(0.09f, 0.21f, 0.23f, 0.36f, 0.44f, 0.44f)
                curveToRelative(0.22f, 0.1f, 0.44f, 0.11f, 0.67f, 0.02f)
                curveToRelative(0.23f, -0.09f, 0.38f, -0.24f, 0.46f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.11f, -0.43f, 0.02f, -0.65f)
                curveToRelative(-0.09f, -0.21f, -0.24f, -0.36f, -0.46f, -0.43f)
                curveToRelative(-0.22f, -0.11f, -0.44f, -0.12f, -0.65f, -0.03f)
                curveToRelative(-0.21f, 0.09f, -0.36f, 0.24f, -0.46f, 0.47f)
                curveTo(8.04f, 24.72f, 8.01f, 24.83f, 8.01f, 24.95f)
                close()
                moveTo(9.86f, 22.51f)
                verticalLineToRelative(0.1f)
                curveToRelative(0.02f, 0.23f, 0.12f, 0.41f, 0.3f, 0.56f)
                curveToRelative(0.23f, 0.13f, 0.43f, 0.19f, 0.62f, 0.19f)
                curveToRelative(0.22f, 0.0f, 0.43f, -0.11f, 0.61f, -0.33f)
                lineToRelative(2.32f, -2.77f)
                curveToRelative(0.14f, -0.17f, 0.21f, -0.39f, 0.2f, -0.66f)
                curveToRelative(-0.02f, -0.21f, -0.12f, -0.39f, -0.28f, -0.53f)
                curveToRelative(-0.16f, -0.14f, -0.33f, -0.22f, -0.52f, -0.22f)
                curveToRelative(-0.06f, 0.0f, -0.1f, 0.0f, -0.14f, 0.01f)
                curveToRelative(-0.23f, 0.04f, -0.42f, 0.15f, -0.56f, 0.33f)
                lineToRelative(-2.36f, 2.77f)
                curveTo(9.92f, 22.12f, 9.86f, 22.3f, 9.86f, 22.51f)
                close()
                moveTo(10.63f, 27.23f)
                curveToRelative(0.0f, 0.12f, 0.03f, 0.23f, 0.08f, 0.32f)
                curveToRelative(0.08f, 0.21f, 0.23f, 0.37f, 0.44f, 0.47f)
                curveToRelative(0.11f, 0.05f, 0.22f, 0.07f, 0.33f, 0.07f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.31f, -0.07f)
                curveToRelative(0.23f, -0.09f, 0.39f, -0.23f, 0.47f, -0.41f)
                curveToRelative(0.1f, -0.22f, 0.11f, -0.44f, 0.02f, -0.67f)
                curveToRelative(-0.08f, -0.23f, -0.23f, -0.38f, -0.45f, -0.46f)
                curveToRelative(-0.22f, -0.1f, -0.44f, -0.11f, -0.67f, -0.02f)
                curveToRelative(-0.23f, 0.09f, -0.38f, 0.24f, -0.45f, 0.45f)
                curveTo(10.65f, 27.0f, 10.63f, 27.11f, 10.63f, 27.23f)
                close()
                moveTo(12.3f, 24.88f)
                verticalLineToRelative(0.11f)
                curveToRelative(0.02f, 0.22f, 0.13f, 0.4f, 0.31f, 0.55f)
                curveToRelative(0.18f, 0.15f, 0.37f, 0.22f, 0.55f, 0.22f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.11f, 0.63f, -0.33f)
                lineToRelative(4.35f, -5.24f)
                curveToRelative(0.11f, -0.12f, 0.17f, -0.3f, 0.17f, -0.52f)
                verticalLineToRelative(-0.12f)
                curveToRelative(-0.02f, -0.23f, -0.12f, -0.4f, -0.27f, -0.53f)
                reflectiveCurveToRelative(-0.33f, -0.2f, -0.52f, -0.2f)
                horizontalLineToRelative(-0.13f)
                curveToRelative(-0.23f, 0.01f, -0.42f, 0.12f, -0.55f, 0.31f)
                lineToRelative(-4.35f, 5.2f)
                curveTo(12.35f, 24.51f, 12.3f, 24.69f, 12.3f, 24.88f)
                close()
                moveTo(15.81f, 26.03f)
                curveToRelative(0.0f, 0.09f, 0.02f, 0.19f, 0.06f, 0.3f)
                curveToRelative(0.09f, 0.22f, 0.24f, 0.38f, 0.46f, 0.47f)
                curveToRelative(0.14f, 0.04f, 0.24f, 0.06f, 0.31f, 0.06f)
                curveToRelative(0.14f, 0.0f, 0.26f, -0.03f, 0.34f, -0.08f)
                curveToRelative(0.22f, -0.09f, 0.38f, -0.23f, 0.46f, -0.42f)
                curveToRelative(0.1f, -0.17f, 0.11f, -0.39f, 0.02f, -0.67f)
                curveToRelative(-0.08f, -0.21f, -0.23f, -0.35f, -0.44f, -0.44f)
                lineToRelative(-0.36f, -0.09f)
                curveToRelative(-0.09f, 0.02f, -0.19f, 0.04f, -0.32f, 0.07f)
                curveToRelative(-0.22f, 0.08f, -0.37f, 0.23f, -0.45f, 0.44f)
                curveTo(15.84f, 25.8f, 15.81f, 25.92f, 15.81f, 26.03f)
                close()
            }
        }
        .build()
        return _rainWind!!
    }

private var _rainWind: ImageVector? = null
