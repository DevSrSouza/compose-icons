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

public val WeatherIcons.Rain: ImageVector
    get() {
        if (_rain != null) {
            return _rain!!
        }
        _rain = Builder(name = "Rain", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 16.91f)
                curveToRelative(0.0f, -1.15f, 0.36f, -2.17f, 1.08f, -3.07f)
                curveToRelative(0.72f, -0.9f, 1.63f, -1.47f, 2.73f, -1.73f)
                curveToRelative(0.31f, -1.36f, 1.02f, -2.48f, 2.11f, -3.36f)
                reflectiveCurveToRelative(2.34f, -1.31f, 3.75f, -1.31f)
                curveToRelative(1.38f, 0.0f, 2.6f, 0.43f, 3.68f, 1.28f)
                curveToRelative(1.08f, 0.85f, 1.78f, 1.95f, 2.1f, 3.29f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.89f, 0.0f, 1.72f, 0.22f, 2.48f, 0.65f)
                reflectiveCurveToRelative(1.37f, 1.03f, 1.81f, 1.78f)
                curveToRelative(0.44f, 0.75f, 0.67f, 1.58f, 0.67f, 2.47f)
                curveToRelative(0.0f, 0.88f, -0.21f, 1.69f, -0.63f, 2.44f)
                curveToRelative(-0.42f, 0.75f, -1.0f, 1.35f, -1.73f, 1.8f)
                curveToRelative(-0.73f, 0.45f, -1.53f, 0.69f, -2.4f, 0.71f)
                curveToRelative(-0.13f, 0.0f, -0.2f, -0.06f, -0.2f, -0.17f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, 0.07f, -0.18f, 0.2f, -0.18f)
                curveToRelative(0.85f, -0.04f, 1.58f, -0.38f, 2.18f, -1.02f)
                reflectiveCurveToRelative(0.9f, -1.39f, 0.9f, -2.26f)
                reflectiveCurveToRelative(-0.33f, -1.62f, -0.98f, -2.26f)
                reflectiveCurveToRelative(-1.42f, -0.96f, -2.31f, -0.96f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(-0.12f, 0.0f, -0.18f, -0.06f, -0.18f, -0.17f)
                lineToRelative(-0.08f, -0.58f)
                curveToRelative(-0.11f, -1.08f, -0.58f, -1.99f, -1.39f, -2.71f)
                curveToRelative(-0.82f, -0.73f, -1.76f, -1.09f, -2.85f, -1.09f)
                curveToRelative(-1.09f, 0.0f, -2.05f, 0.36f, -2.85f, 1.09f)
                curveToRelative(-0.81f, 0.73f, -1.26f, 1.63f, -1.36f, 2.71f)
                lineToRelative(-0.07f, 0.53f)
                curveToRelative(0.0f, 0.12f, -0.07f, 0.19f, -0.2f, 0.19f)
                lineToRelative(-0.53f, 0.03f)
                curveToRelative(-0.83f, 0.1f, -1.53f, 0.46f, -2.1f, 1.07f)
                reflectiveCurveToRelative(-0.85f, 1.33f, -0.85f, 2.16f)
                curveToRelative(0.0f, 0.87f, 0.3f, 1.62f, 0.9f, 2.26f)
                reflectiveCurveToRelative(1.33f, 0.98f, 2.18f, 1.02f)
                curveToRelative(0.11f, 0.0f, 0.17f, 0.06f, 0.17f, 0.18f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.11f, -0.06f, 0.17f, -0.17f, 0.17f)
                curveToRelative(-1.34f, -0.06f, -2.47f, -0.57f, -3.4f, -1.53f)
                reflectiveCurveTo(4.64f, 18.24f, 4.64f, 16.91f)
                close()
                moveTo(9.99f, 23.6f)
                curveToRelative(0.0f, -0.04f, 0.01f, -0.11f, 0.04f, -0.2f)
                lineToRelative(1.63f, -5.77f)
                curveToRelative(0.06f, -0.19f, 0.17f, -0.34f, 0.32f, -0.44f)
                curveToRelative(0.15f, -0.1f, 0.31f, -0.15f, 0.46f, -0.15f)
                curveToRelative(0.07f, 0.0f, 0.15f, 0.01f, 0.24f, 0.03f)
                curveToRelative(0.24f, 0.04f, 0.42f, 0.17f, 0.54f, 0.37f)
                curveToRelative(0.12f, 0.2f, 0.15f, 0.42f, 0.08f, 0.67f)
                lineToRelative(-1.63f, 5.73f)
                curveToRelative(-0.12f, 0.43f, -0.4f, 0.64f, -0.82f, 0.64f)
                curveToRelative(-0.04f, 0.0f, -0.07f, -0.01f, -0.11f, -0.02f)
                curveToRelative(-0.06f, -0.02f, -0.09f, -0.03f, -0.1f, -0.03f)
                curveToRelative(-0.22f, -0.06f, -0.38f, -0.17f, -0.49f, -0.33f)
                curveTo(10.04f, 23.93f, 9.99f, 23.77f, 9.99f, 23.6f)
                close()
                moveTo(12.61f, 26.41f)
                lineToRelative(2.44f, -8.77f)
                curveToRelative(0.04f, -0.19f, 0.14f, -0.34f, 0.3f, -0.44f)
                curveToRelative(0.16f, -0.1f, 0.32f, -0.15f, 0.49f, -0.15f)
                curveToRelative(0.09f, 0.0f, 0.18f, 0.01f, 0.27f, 0.03f)
                curveToRelative(0.22f, 0.06f, 0.38f, 0.19f, 0.49f, 0.39f)
                curveToRelative(0.11f, 0.2f, 0.13f, 0.41f, 0.07f, 0.64f)
                lineToRelative(-2.43f, 8.78f)
                curveToRelative(-0.04f, 0.17f, -0.13f, 0.31f, -0.29f, 0.43f)
                curveToRelative(-0.16f, 0.12f, -0.32f, 0.18f, -0.51f, 0.18f)
                curveToRelative(-0.09f, 0.0f, -0.18f, -0.02f, -0.25f, -0.05f)
                curveToRelative(-0.2f, -0.05f, -0.37f, -0.18f, -0.52f, -0.39f)
                curveTo(12.56f, 26.88f, 12.54f, 26.67f, 12.61f, 26.41f)
                close()
                moveTo(16.74f, 23.62f)
                curveToRelative(0.0f, -0.04f, 0.01f, -0.11f, 0.04f, -0.23f)
                lineToRelative(1.63f, -5.77f)
                curveToRelative(0.06f, -0.19f, 0.16f, -0.34f, 0.3f, -0.44f)
                curveToRelative(0.15f, -0.1f, 0.3f, -0.15f, 0.46f, -0.15f)
                curveToRelative(0.08f, 0.0f, 0.17f, 0.01f, 0.26f, 0.03f)
                curveToRelative(0.21f, 0.06f, 0.36f, 0.16f, 0.46f, 0.31f)
                curveToRelative(0.1f, 0.15f, 0.15f, 0.31f, 0.15f, 0.47f)
                curveToRelative(0.0f, 0.03f, -0.01f, 0.08f, -0.02f, 0.14f)
                reflectiveCurveToRelative(-0.02f, 0.1f, -0.02f, 0.12f)
                lineToRelative(-1.63f, 5.73f)
                curveToRelative(-0.04f, 0.19f, -0.13f, 0.35f, -0.28f, 0.46f)
                reflectiveCurveToRelative(-0.32f, 0.17f, -0.51f, 0.17f)
                lineToRelative(-0.24f, -0.05f)
                curveToRelative(-0.2f, -0.06f, -0.35f, -0.16f, -0.46f, -0.32f)
                curveTo(16.79f, 23.94f, 16.74f, 23.78f, 16.74f, 23.62f)
                close()
            }
        }
        .build()
        return _rain!!
    }

private var _rain: ImageVector? = null
