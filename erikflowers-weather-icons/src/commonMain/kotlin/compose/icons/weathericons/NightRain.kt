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

public val WeatherIcons.NightRain: ImageVector
    get() {
        if (_nightRain != null) {
            return _nightRain!!
        }
        _nightRain = Builder(name = "NightRain", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.26f, 16.93f)
                curveToRelative(0.0f, 0.66f, 0.12f, 1.28f, 0.38f, 1.88f)
                reflectiveCurveToRelative(0.59f, 1.11f, 1.02f, 1.55f)
                curveToRelative(0.43f, 0.43f, 0.94f, 0.79f, 1.53f, 1.05f)
                reflectiveCurveToRelative(1.21f, 0.42f, 1.87f, 0.45f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.17f, -0.17f)
                curveToRelative(-0.87f, -0.06f, -1.6f, -0.41f, -2.19f, -1.03f)
                curveToRelative(-0.59f, -0.62f, -0.89f, -1.37f, -0.89f, -2.22f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.85f, -2.19f)
                curveToRelative(0.57f, -0.62f, 1.26f, -0.97f, 2.1f, -1.04f)
                lineToRelative(0.53f, -0.06f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.19f)
                lineToRelative(0.06f, -0.51f)
                curveToRelative(0.11f, -1.09f, 0.56f, -1.99f, 1.37f, -2.71f)
                reflectiveCurveToRelative(1.76f, -1.08f, 2.86f, -1.08f)
                curveToRelative(1.09f, 0.0f, 2.05f, 0.36f, 2.85f, 1.07f)
                curveToRelative(0.81f, 0.72f, 1.27f, 1.61f, 1.38f, 2.69f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.9f, 0.0f, 1.67f, 0.32f, 2.32f, 0.96f)
                reflectiveCurveToRelative(0.97f, 1.4f, 0.97f, 2.29f)
                curveToRelative(0.0f, 0.86f, -0.3f, 1.6f, -0.89f, 2.22f)
                curveToRelative(-0.59f, 0.62f, -1.33f, 0.97f, -2.19f, 1.03f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(1.34f, -0.06f, 2.47f, -0.57f, 3.39f, -1.51f)
                curveToRelative(0.92f, -0.95f, 1.38f, -2.09f, 1.38f, -3.42f)
                curveToRelative(0.0f, -0.72f, -0.14f, -1.38f, -0.42f, -1.99f)
                curveToRelative(0.78f, -0.94f, 1.17f, -2.06f, 1.17f, -3.36f)
                curveToRelative(0.0f, -0.94f, -0.23f, -1.81f, -0.7f, -2.62f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.45f, -1.91f, -1.92f)
                reflectiveCurveToRelative(-1.68f, -0.71f, -2.62f, -0.71f)
                curveToRelative(-1.56f, 0.0f, -2.85f, 0.58f, -3.88f, 1.73f)
                curveToRelative(-0.88f, -0.43f, -1.78f, -0.65f, -2.7f, -0.65f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.32f)
                reflectiveCurveToRelative(-1.79f, 2.0f, -2.1f, 3.38f)
                curveToRelative(-1.1f, 0.26f, -2.01f, 0.83f, -2.73f, 1.73f)
                curveTo(4.62f, 14.76f, 4.26f, 15.78f, 4.26f, 16.93f)
                close()
                moveTo(9.75f, 23.61f)
                curveToRelative(0.0f, 0.4f, 0.22f, 0.66f, 0.65f, 0.78f)
                curveToRelative(0.21f, 0.07f, 0.42f, 0.05f, 0.63f, -0.06f)
                curveToRelative(0.21f, -0.11f, 0.35f, -0.28f, 0.41f, -0.5f)
                lineToRelative(1.5f, -5.73f)
                curveToRelative(0.06f, -0.22f, 0.03f, -0.43f, -0.09f, -0.63f)
                curveToRelative(-0.12f, -0.2f, -0.3f, -0.33f, -0.54f, -0.4f)
                curveToRelative(-0.22f, -0.07f, -0.43f, -0.05f, -0.63f, 0.07f)
                reflectiveCurveToRelative(-0.33f, 0.29f, -0.39f, 0.52f)
                lineToRelative(-1.5f, 5.7f)
                curveTo(9.76f, 23.47f, 9.75f, 23.55f, 9.75f, 23.61f)
                close()
                moveTo(12.34f, 26.66f)
                curveToRelative(0.0f, 0.12f, 0.03f, 0.24f, 0.08f, 0.37f)
                curveToRelative(0.1f, 0.21f, 0.27f, 0.35f, 0.51f, 0.43f)
                curveToRelative(0.02f, 0.0f, 0.06f, 0.0f, 0.1f, 0.01f)
                reflectiveCurveToRelative(0.08f, 0.01f, 0.11f, 0.01f)
                reflectiveCurveToRelative(0.06f, 0.0f, 0.09f, 0.0f)
                curveToRelative(0.43f, 0.0f, 0.68f, -0.22f, 0.76f, -0.66f)
                lineToRelative(2.3f, -8.74f)
                curveToRelative(0.07f, -0.22f, 0.05f, -0.43f, -0.06f, -0.63f)
                curveToRelative(-0.11f, -0.2f, -0.28f, -0.33f, -0.5f, -0.4f)
                curveToRelative(-0.24f, -0.07f, -0.47f, -0.05f, -0.68f, 0.07f)
                reflectiveCurveToRelative(-0.33f, 0.29f, -0.38f, 0.52f)
                lineToRelative(-2.31f, 8.75f)
                curveTo(12.35f, 26.49f, 12.34f, 26.58f, 12.34f, 26.66f)
                close()
                moveTo(16.5f, 23.6f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.31f, 0.16f, 0.47f)
                curveToRelative(0.11f, 0.16f, 0.26f, 0.26f, 0.45f, 0.32f)
                curveToRelative(0.06f, 0.02f, 0.14f, 0.03f, 0.23f, 0.03f)
                curveToRelative(0.17f, 0.0f, 0.33f, -0.05f, 0.49f, -0.14f)
                curveToRelative(0.16f, -0.09f, 0.26f, -0.24f, 0.32f, -0.45f)
                lineToRelative(1.5f, -5.73f)
                curveToRelative(0.08f, -0.21f, 0.05f, -0.41f, -0.07f, -0.62f)
                curveToRelative(-0.12f, -0.21f, -0.29f, -0.34f, -0.52f, -0.41f)
                curveToRelative(-0.24f, -0.07f, -0.46f, -0.05f, -0.66f, 0.07f)
                curveToRelative(-0.2f, 0.12f, -0.32f, 0.29f, -0.36f, 0.52f)
                lineToRelative(-1.5f, 5.7f)
                curveTo(16.51f, 23.47f, 16.5f, 23.55f, 16.5f, 23.6f)
                close()
                moveTo(18.03f, 9.08f)
                curveToRelative(0.67f, -0.67f, 1.49f, -1.0f, 2.48f, -1.0f)
                curveToRelative(0.98f, 0.0f, 1.81f, 0.34f, 2.49f, 1.02f)
                curveToRelative(0.69f, 0.68f, 1.03f, 1.51f, 1.03f, 2.48f)
                curveToRelative(0.0f, 0.63f, -0.17f, 1.24f, -0.52f, 1.85f)
                curveTo(22.56f, 12.48f, 21.4f, 12.0f, 20.02f, 12.0f)
                horizontalLineToRelative(-0.31f)
                curveTo(19.43f, 10.83f, 18.87f, 9.86f, 18.03f, 9.08f)
                close()
            }
        }
        .build()
        return _nightRain!!
    }

private var _nightRain: ImageVector? = null
