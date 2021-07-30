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

public val WeatherIcons.NightRainWind: ImageVector
    get() {
        if (_nightRainWind != null) {
            return _nightRainWind!!
        }
        _nightRainWind = Builder(name = "NightRainWind", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.11f, 17.02f)
                curveToRelative(0.0f, 1.13f, 0.33f, 2.13f, 1.0f, 3.01f)
                curveToRelative(0.67f, 0.88f, 1.54f, 1.48f, 2.62f, 1.8f)
                curveToRelative(0.1f, 0.01f, 0.18f, -0.01f, 0.25f, -0.08f)
                lineToRelative(1.13f, -1.46f)
                curveToRelative(-0.89f, 0.0f, -1.66f, -0.32f, -2.31f, -0.96f)
                reflectiveCurveToRelative(-0.97f, -1.41f, -0.97f, -2.31f)
                curveToRelative(0.0f, -0.86f, 0.29f, -1.61f, 0.86f, -2.24f)
                reflectiveCurveToRelative(1.29f, -0.98f, 2.14f, -1.05f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.11f, 0.0f, 0.16f, -0.05f, 0.16f, -0.14f)
                lineToRelative(0.07f, -0.56f)
                curveToRelative(0.12f, -1.1f, 0.59f, -2.02f, 1.41f, -2.76f)
                curveToRelative(0.82f, -0.74f, 1.78f, -1.11f, 2.88f, -1.11f)
                curveToRelative(1.11f, 0.0f, 2.08f, 0.37f, 2.91f, 1.1f)
                curveToRelative(0.83f, 0.73f, 1.3f, 1.64f, 1.4f, 2.74f)
                lineToRelative(0.07f, 0.59f)
                curveToRelative(0.02f, 0.11f, 0.09f, 0.17f, 0.21f, 0.17f)
                horizontalLineToRelative(1.63f)
                curveToRelative(0.9f, 0.0f, 1.67f, 0.33f, 2.32f, 0.98f)
                curveToRelative(0.65f, 0.66f, 0.98f, 1.44f, 0.98f, 2.35f)
                curveToRelative(0.0f, 0.84f, -0.28f, 1.58f, -0.85f, 2.21f)
                curveToRelative(-0.57f, 0.63f, -1.27f, 0.98f, -2.1f, 1.06f)
                curveToRelative(-0.48f, 0.0f, -0.78f, 0.09f, -0.91f, 0.28f)
                lineToRelative(-2.18f, 2.4f)
                curveToRelative(-0.16f, 0.18f, -0.22f, 0.39f, -0.19f, 0.62f)
                curveToRelative(0.03f, 0.23f, 0.13f, 0.45f, 0.31f, 0.63f)
                curveToRelative(0.13f, 0.17f, 0.33f, 0.25f, 0.59f, 0.23f)
                reflectiveCurveToRelative(0.46f, -0.15f, 0.6f, -0.38f)
                lineTo(20.64f, 22.0f)
                curveToRelative(0.82f, -0.08f, 1.58f, -0.35f, 2.28f, -0.82f)
                curveToRelative(0.69f, -0.47f, 1.24f, -1.07f, 1.65f, -1.8f)
                reflectiveCurveToRelative(0.6f, -1.52f, 0.6f, -2.36f)
                curveToRelative(0.0f, -0.63f, -0.14f, -1.32f, -0.43f, -2.08f)
                curveToRelative(0.77f, -0.98f, 1.15f, -2.08f, 1.15f, -3.32f)
                curveToRelative(0.0f, -0.98f, -0.24f, -1.87f, -0.71f, -2.69f)
                curveToRelative(-0.48f, -0.82f, -1.12f, -1.46f, -1.94f, -1.93f)
                reflectiveCurveTo(21.53f, 6.3f, 20.56f, 6.3f)
                curveToRelative(-1.57f, 0.0f, -2.87f, 0.57f, -3.9f, 1.71f)
                curveToRelative(-0.87f, -0.43f, -1.79f, -0.65f, -2.77f, -0.65f)
                curveToRelative(-1.43f, 0.0f, -2.7f, 0.44f, -3.79f, 1.33f)
                reflectiveCurveToRelative(-1.8f, 2.03f, -2.11f, 3.43f)
                curveToRelative(-1.14f, 0.26f, -2.07f, 0.84f, -2.79f, 1.75f)
                reflectiveCurveTo(4.11f, 15.83f, 4.11f, 17.02f)
                close()
                moveTo(7.91f, 24.52f)
                curveToRelative(0.0f, 0.14f, 0.02f, 0.25f, 0.05f, 0.32f)
                curveToRelative(0.08f, 0.21f, 0.23f, 0.36f, 0.44f, 0.44f)
                curveToRelative(0.23f, 0.1f, 0.45f, 0.11f, 0.68f, 0.02f)
                curveToRelative(0.23f, -0.08f, 0.38f, -0.24f, 0.45f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.11f, -0.44f, 0.02f, -0.67f)
                curveToRelative(-0.09f, -0.23f, -0.24f, -0.38f, -0.46f, -0.46f)
                curveToRelative(-0.23f, -0.08f, -0.44f, -0.08f, -0.66f, 0.0f)
                curveToRelative(-0.21f, 0.08f, -0.37f, 0.23f, -0.47f, 0.45f)
                curveTo(7.93f, 24.25f, 7.91f, 24.37f, 7.91f, 24.52f)
                close()
                moveTo(9.75f, 22.08f)
                curveToRelative(0.0f, 0.23f, 0.11f, 0.45f, 0.32f, 0.67f)
                curveToRelative(0.43f, 0.36f, 0.84f, 0.31f, 1.26f, -0.15f)
                lineToRelative(2.19f, -2.44f)
                curveToRelative(0.15f, -0.17f, 0.21f, -0.38f, 0.18f, -0.61f)
                curveToRelative(-0.03f, -0.23f, -0.13f, -0.42f, -0.31f, -0.57f)
                curveToRelative(-0.18f, -0.14f, -0.39f, -0.19f, -0.63f, -0.16f)
                curveToRelative(-0.24f, 0.03f, -0.43f, 0.13f, -0.59f, 0.29f)
                lineToRelative(-2.2f, 2.38f)
                curveTo(9.82f, 21.7f, 9.75f, 21.9f, 9.75f, 22.08f)
                close()
                moveTo(10.39f, 27.01f)
                curveToRelative(0.0f, 0.12f, 0.03f, 0.23f, 0.08f, 0.32f)
                curveToRelative(0.09f, 0.23f, 0.22f, 0.38f, 0.41f, 0.46f)
                curveToRelative(0.12f, 0.05f, 0.24f, 0.07f, 0.37f, 0.07f)
                curveToRelative(0.07f, 0.0f, 0.18f, -0.02f, 0.32f, -0.06f)
                curveToRelative(0.21f, -0.09f, 0.36f, -0.24f, 0.44f, -0.45f)
                curveToRelative(0.1f, -0.2f, 0.11f, -0.41f, 0.02f, -0.64f)
                curveToRelative(-0.08f, -0.23f, -0.23f, -0.38f, -0.45f, -0.46f)
                curveToRelative(-0.22f, -0.11f, -0.44f, -0.12f, -0.66f, -0.03f)
                curveToRelative(-0.21f, 0.09f, -0.38f, 0.25f, -0.49f, 0.48f)
                curveTo(10.41f, 26.8f, 10.39f, 26.9f, 10.39f, 27.01f)
                close()
                moveTo(12.06f, 24.62f)
                verticalLineToRelative(0.13f)
                curveToRelative(0.02f, 0.24f, 0.12f, 0.44f, 0.32f, 0.6f)
                curveToRelative(0.14f, 0.18f, 0.34f, 0.26f, 0.6f, 0.24f)
                curveToRelative(0.25f, -0.02f, 0.45f, -0.15f, 0.6f, -0.38f)
                lineToRelative(4.22f, -4.91f)
                curveToRelative(0.16f, -0.18f, 0.22f, -0.39f, 0.2f, -0.64f)
                curveToRelative(-0.02f, -0.24f, -0.14f, -0.43f, -0.35f, -0.57f)
                curveToRelative(-0.17f, -0.14f, -0.38f, -0.21f, -0.6f, -0.19f)
                curveToRelative(-0.23f, 0.02f, -0.42f, 0.12f, -0.58f, 0.3f)
                lineToRelative(-4.22f, 4.92f)
                curveTo(12.12f, 24.25f, 12.06f, 24.41f, 12.06f, 24.62f)
                close()
                moveTo(15.69f, 25.45f)
                curveToRelative(-0.07f, 0.23f, -0.07f, 0.43f, 0.0f, 0.62f)
                curveToRelative(0.09f, 0.22f, 0.24f, 0.38f, 0.45f, 0.49f)
                curveToRelative(0.11f, 0.05f, 0.23f, 0.07f, 0.36f, 0.07f)
                curveToRelative(0.06f, 0.0f, 0.16f, -0.02f, 0.3f, -0.06f)
                curveToRelative(0.23f, -0.09f, 0.38f, -0.24f, 0.46f, -0.46f)
                curveToRelative(0.1f, -0.23f, 0.11f, -0.44f, 0.03f, -0.66f)
                curveToRelative(-0.08f, -0.21f, -0.23f, -0.36f, -0.44f, -0.44f)
                curveToRelative(-0.23f, -0.11f, -0.45f, -0.12f, -0.66f, -0.03f)
                curveTo(15.97f, 25.07f, 15.8f, 25.23f, 15.69f, 25.45f)
                close()
                moveTo(18.09f, 9.03f)
                curveToRelative(0.68f, -0.68f, 1.51f, -1.02f, 2.48f, -1.02f)
                curveToRelative(1.01f, 0.0f, 1.86f, 0.35f, 2.56f, 1.05f)
                reflectiveCurveToRelative(1.05f, 1.56f, 1.05f, 2.56f)
                curveToRelative(0.0f, 0.62f, -0.17f, 1.23f, -0.52f, 1.82f)
                curveToRelative(-0.97f, -0.98f, -2.16f, -1.46f, -3.55f, -1.46f)
                horizontalLineTo(19.8f)
                curveTo(19.55f, 10.84f, 18.98f, 9.86f, 18.09f, 9.03f)
                close()
            }
        }
        .build()
        return _nightRainWind!!
    }

private var _nightRainWind: ImageVector? = null
