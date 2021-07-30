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

public val WeatherIcons.NightAltRain: ImageVector
    get() {
        if (_nightAltRain != null) {
            return _nightAltRain!!
        }
        _nightAltRain = Builder(name = "NightAltRain", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.07f, 16.9f)
                curveToRelative(0.0f, 1.33f, 0.47f, 2.48f, 1.4f, 3.44f)
                reflectiveCurveToRelative(2.07f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.18f, -0.17f)
                curveToRelative(-0.86f, -0.05f, -1.59f, -0.39f, -2.19f, -1.03f)
                curveToRelative(-0.6f, -0.64f, -0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.85f, -2.17f)
                curveToRelative(0.57f, -0.62f, 1.27f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.53f, -0.04f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.54f)
                curveToRelative(0.11f, -1.08f, 0.57f, -1.99f, 1.38f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.77f, -1.1f, 2.86f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.08f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.17f, 0.18f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.89f, 0.0f, 1.67f, 0.32f, 2.32f, 0.96f)
                curveToRelative(0.65f, 0.64f, 0.98f, 1.4f, 0.98f, 2.28f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.19f, 1.03f)
                curveToRelative(-0.14f, 0.0f, -0.21f, 0.06f, -0.21f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.21f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.38f, -1.51f)
                curveToRelative(0.93f, -0.97f, 1.39f, -2.12f, 1.39f, -3.45f)
                curveToRelative(0.0f, -0.88f, -0.23f, -1.7f, -0.68f, -2.46f)
                curveToRelative(0.81f, -0.73f, 1.33f, -1.6f, 1.58f, -2.62f)
                lineToRelative(0.14f, -0.72f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.03f, 0.02f, -0.07f)
                curveToRelative(0.0f, -0.07f, -0.05f, -0.13f, -0.16f, -0.16f)
                lineToRelative(-0.56f, -0.18f)
                curveToRelative(-0.57f, -0.16f, -1.06f, -0.44f, -1.46f, -0.83f)
                curveToRelative(-0.41f, -0.39f, -0.7f, -0.8f, -0.87f, -1.23f)
                curveToRelative(-0.17f, -0.43f, -0.26f, -0.86f, -0.26f, -1.28f)
                curveToRelative(-0.02f, -0.22f, 0.01f, -0.5f, 0.08f, -0.82f)
                lineToRelative(0.14f, -0.61f)
                curveToRelative(0.04f, -0.1f, 0.0f, -0.18f, -0.14f, -0.24f)
                lineToRelative(-0.79f, -0.24f)
                curveToRelative(-0.45f, -0.1f, -0.87f, -0.15f, -1.27f, -0.15f)
                curveToRelative(-0.38f, 0.0f, -0.76f, 0.04f, -1.14f, 0.13f)
                curveToRelative(-0.39f, 0.09f, -0.79f, 0.22f, -1.2f, 0.41f)
                curveToRelative(-0.41f, 0.18f, -0.81f, 0.45f, -1.2f, 0.8f)
                curveToRelative(-0.39f, 0.35f, -0.72f, 0.75f, -1.0f, 1.22f)
                curveToRelative(-0.82f, -0.3f, -1.6f, -0.45f, -2.33f, -0.45f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.32f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.11f, 3.37f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.83f, -2.74f, 1.73f)
                curveTo(4.43f, 14.72f, 4.07f, 15.75f, 4.07f, 16.9f)
                close()
                moveTo(9.63f, 23.74f)
                curveToRelative(0.0f, 0.17f, 0.05f, 0.33f, 0.16f, 0.49f)
                curveToRelative(0.11f, 0.16f, 0.27f, 0.27f, 0.49f, 0.33f)
                curveToRelative(0.23f, 0.07f, 0.45f, 0.05f, 0.64f, -0.04f)
                curveToRelative(0.2f, -0.1f, 0.33f, -0.28f, 0.4f, -0.56f)
                lineToRelative(1.43f, -5.87f)
                curveToRelative(0.06f, -0.25f, 0.03f, -0.48f, -0.08f, -0.67f)
                curveToRelative(-0.12f, -0.2f, -0.29f, -0.32f, -0.52f, -0.37f)
                curveToRelative(-0.22f, -0.07f, -0.43f, -0.05f, -0.63f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.34f, 0.28f, -0.41f, 0.51f)
                lineToRelative(-1.44f, 5.9f)
                curveToRelative(0.0f, 0.01f, -0.01f, 0.04f, -0.02f, 0.09f)
                curveTo(9.64f, 23.67f, 9.63f, 23.71f, 9.63f, 23.74f)
                close()
                moveTo(12.24f, 26.81f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.31f, 0.15f, 0.46f)
                curveToRelative(0.1f, 0.15f, 0.25f, 0.25f, 0.45f, 0.31f)
                curveToRelative(0.11f, 0.03f, 0.19f, 0.04f, 0.24f, 0.04f)
                curveToRelative(0.44f, 0.0f, 0.71f, -0.2f, 0.82f, -0.59f)
                lineToRelative(2.25f, -8.93f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.46f, -0.07f, -0.65f)
                curveToRelative(-0.11f, -0.19f, -0.28f, -0.32f, -0.5f, -0.39f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.66f, 0.07f)
                reflectiveCurveToRelative(-0.34f, 0.28f, -0.39f, 0.5f)
                lineToRelative(-2.26f, 8.92f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.05f, -0.01f, 0.12f)
                curveTo(12.24f, 26.73f, 12.24f, 26.78f, 12.24f, 26.81f)
                close()
                moveTo(16.4f, 23.82f)
                curveToRelative(0.0f, 0.36f, 0.21f, 0.6f, 0.63f, 0.74f)
                curveToRelative(0.14f, 0.04f, 0.24f, 0.06f, 0.3f, 0.06f)
                curveToRelative(0.11f, 0.0f, 0.23f, -0.02f, 0.35f, -0.07f)
                curveToRelative(0.21f, -0.08f, 0.34f, -0.28f, 0.39f, -0.58f)
                lineToRelative(1.43f, -5.87f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.45f, -0.08f, -0.65f)
                curveToRelative(-0.11f, -0.19f, -0.28f, -0.32f, -0.51f, -0.39f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.66f, 0.07f)
                curveToRelative(-0.21f, 0.11f, -0.33f, 0.28f, -0.38f, 0.51f)
                lineToRelative(-1.43f, 5.9f)
                curveTo(16.42f, 23.7f, 16.4f, 23.8f, 16.4f, 23.82f)
                close()
                moveTo(17.58f, 8.77f)
                curveToRelative(0.32f, -0.58f, 0.75f, -1.02f, 1.31f, -1.33f)
                curveToRelative(0.55f, -0.3f, 1.14f, -0.45f, 1.76f, -0.44f)
                curveToRelative(0.12f, 0.0f, 0.21f, 0.0f, 0.27f, 0.01f)
                verticalLineToRelative(0.3f)
                curveToRelative(-0.01f, 0.97f, 0.24f, 1.88f, 0.77f, 2.75f)
                curveToRelative(0.52f, 0.86f, 1.26f, 1.52f, 2.21f, 1.97f)
                curveToRelative(-0.22f, 0.46f, -0.49f, 0.81f, -0.79f, 1.07f)
                curveToRelative(-0.92f, -0.76f, -1.99f, -1.13f, -3.23f, -1.13f)
                horizontalLineToRelative(-0.31f)
                curveTo(19.3f, 10.7f, 18.64f, 9.64f, 17.58f, 8.77f)
                close()
            }
        }
        .build()
        return _nightAltRain!!
    }

private var _nightAltRain: ImageVector? = null
