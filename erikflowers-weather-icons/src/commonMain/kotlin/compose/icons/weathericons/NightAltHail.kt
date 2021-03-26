package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.NightAltHail: ImageVector
    get() {
        if (_nightAltHail != null) {
            return _nightAltHail!!
        }
        _nightAltHail = Builder(name = "NightAltHail", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1f, 16.91f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.43f)
                reflectiveCurveToRelative(2.06f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.18f, -0.17f)
                curveToRelative(-0.86f, -0.04f, -1.58f, -0.38f, -2.18f, -1.02f)
                reflectiveCurveToRelative(-0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.84f, -2.17f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.53f, -0.03f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.18f)
                lineToRelative(0.07f, -0.54f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.1f, 2.85f, -1.1f)
                curveToRelative(1.08f, 0.0f, 2.03f, 0.37f, 2.85f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.08f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.17f, 0.17f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.89f, 0.0f, 1.66f, 0.32f, 2.31f, 0.96f)
                curveToRelative(0.65f, 0.64f, 0.98f, 1.4f, 0.98f, 2.27f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.18f, 1.02f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.38f, -1.51f)
                curveToRelative(0.93f, -0.96f, 1.39f, -2.11f, 1.39f, -3.45f)
                curveToRelative(0.0f, -0.86f, -0.22f, -1.66f, -0.65f, -2.41f)
                curveToRelative(0.79f, -0.74f, 1.3f, -1.62f, 1.55f, -2.62f)
                lineToRelative(0.13f, -0.68f)
                curveToRelative(0.02f, -0.01f, 0.03f, -0.03f, 0.03f, -0.07f)
                curveToRelative(0.0f, -0.07f, -0.05f, -0.13f, -0.16f, -0.16f)
                lineToRelative(-0.56f, -0.17f)
                curveToRelative(-0.57f, -0.17f, -1.05f, -0.45f, -1.46f, -0.85f)
                curveToRelative(-0.4f, -0.4f, -0.69f, -0.81f, -0.86f, -1.25f)
                curveToRelative(-0.17f, -0.43f, -0.25f, -0.87f, -0.25f, -1.32f)
                curveToRelative(-0.01f, -0.24f, 0.02f, -0.51f, 0.08f, -0.79f)
                lineToRelative(0.14f, -0.58f)
                curveToRelative(0.03f, -0.09f, -0.02f, -0.16f, -0.14f, -0.22f)
                lineToRelative(-0.8f, -0.25f)
                curveToRelative(-0.42f, -0.12f, -0.86f, -0.19f, -1.31f, -0.19f)
                curveToRelative(-0.35f, 0.0f, -0.71f, 0.04f, -1.08f, 0.13f)
                reflectiveCurveToRelative(-0.76f, 0.22f, -1.17f, 0.4f)
                curveToRelative(-0.41f, 0.18f, -0.8f, 0.45f, -1.19f, 0.8f)
                curveToRelative(-0.38f, 0.35f, -0.72f, 0.75f, -1.0f, 1.22f)
                curveToRelative(-0.75f, -0.32f, -1.54f, -0.49f, -2.37f, -0.49f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.79f, 1.99f, -2.1f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.83f, -2.74f, 1.73f)
                reflectiveCurveTo(4.1f, 15.76f, 4.1f, 16.91f)
                close()
                moveTo(9.58f, 23.94f)
                curveToRelative(0.09f, 0.21f, 0.24f, 0.36f, 0.46f, 0.45f)
                curveToRelative(0.19f, 0.1f, 0.4f, 0.11f, 0.62f, 0.02f)
                curveToRelative(0.22f, -0.08f, 0.37f, -0.23f, 0.45f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.11f, -0.43f, 0.02f, -0.65f)
                curveToRelative(-0.08f, -0.21f, -0.23f, -0.36f, -0.45f, -0.44f)
                curveToRelative(-0.2f, -0.1f, -0.41f, -0.11f, -0.62f, -0.02f)
                curveToRelative(-0.21f, 0.09f, -0.37f, 0.24f, -0.47f, 0.46f)
                curveTo(9.5f, 23.48f, 9.49f, 23.69f, 9.58f, 23.94f)
                close()
                moveTo(10.2f, 21.11f)
                curveToRelative(0.0f, 0.15f, 0.05f, 0.3f, 0.16f, 0.45f)
                reflectiveCurveToRelative(0.26f, 0.26f, 0.46f, 0.32f)
                curveToRelative(0.26f, 0.1f, 0.48f, 0.1f, 0.67f, 0.0f)
                curveToRelative(0.19f, -0.1f, 0.32f, -0.29f, 0.4f, -0.57f)
                lineToRelative(0.88f, -3.21f)
                curveToRelative(0.07f, -0.25f, 0.04f, -0.47f, -0.08f, -0.67f)
                curveToRelative(-0.12f, -0.2f, -0.3f, -0.32f, -0.54f, -0.37f)
                curveToRelative(-0.22f, -0.07f, -0.43f, -0.05f, -0.63f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.28f, -0.4f, 0.51f)
                lineToRelative(-0.88f, 3.22f)
                curveToRelative(0.0f, 0.02f, -0.01f, 0.06f, -0.02f, 0.12f)
                curveTo(10.21f, 21.03f, 10.2f, 21.08f, 10.2f, 21.11f)
                close()
                moveTo(12.07f, 26.71f)
                curveToRelative(0.0f, 0.12f, 0.02f, 0.22f, 0.06f, 0.29f)
                curveToRelative(0.09f, 0.22f, 0.24f, 0.37f, 0.45f, 0.45f)
                curveToRelative(0.09f, 0.05f, 0.2f, 0.07f, 0.33f, 0.07f)
                curveToRelative(0.06f, 0.0f, 0.16f, -0.02f, 0.3f, -0.06f)
                curveToRelative(0.23f, -0.08f, 0.39f, -0.23f, 0.48f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.1f, -0.44f, 0.0f, -0.66f)
                curveToRelative(-0.1f, -0.22f, -0.25f, -0.37f, -0.45f, -0.46f)
                curveToRelative(-0.2f, -0.09f, -0.4f, -0.09f, -0.61f, 0.0f)
                curveToRelative(-0.19f, 0.08f, -0.33f, 0.2f, -0.42f, 0.36f)
                curveTo(12.11f, 26.42f, 12.07f, 26.57f, 12.07f, 26.71f)
                close()
                moveTo(12.81f, 24.06f)
                curveToRelative(0.0f, 0.38f, 0.21f, 0.64f, 0.64f, 0.78f)
                curveToRelative(0.09f, 0.03f, 0.17f, 0.05f, 0.23f, 0.05f)
                curveToRelative(0.11f, 0.0f, 0.23f, -0.03f, 0.35f, -0.08f)
                curveToRelative(0.23f, -0.08f, 0.39f, -0.27f, 0.47f, -0.57f)
                lineToRelative(1.65f, -6.12f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.45f, -0.07f, -0.65f)
                curveToRelative(-0.11f, -0.19f, -0.28f, -0.32f, -0.5f, -0.39f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.34f, 0.28f, -0.4f, 0.51f)
                lineToRelative(-1.68f, 6.17f)
                curveTo(12.82f, 23.92f, 12.81f, 24.0f, 12.81f, 24.06f)
                close()
                moveTo(16.25f, 23.64f)
                curveToRelative(0.0f, 0.13f, 0.02f, 0.23f, 0.07f, 0.31f)
                curveToRelative(0.08f, 0.2f, 0.23f, 0.35f, 0.44f, 0.44f)
                curveToRelative(0.12f, 0.05f, 0.23f, 0.08f, 0.35f, 0.08f)
                curveToRelative(0.06f, 0.0f, 0.16f, -0.02f, 0.3f, -0.06f)
                curveToRelative(0.22f, -0.09f, 0.37f, -0.23f, 0.45f, -0.44f)
                curveToRelative(0.08f, -0.22f, 0.08f, -0.43f, 0.0f, -0.63f)
                curveToRelative(-0.08f, -0.2f, -0.22f, -0.35f, -0.42f, -0.45f)
                curveToRelative(-0.22f, -0.1f, -0.44f, -0.11f, -0.65f, -0.02f)
                curveToRelative(-0.22f, 0.08f, -0.37f, 0.24f, -0.47f, 0.46f)
                curveTo(16.27f, 23.41f, 16.25f, 23.51f, 16.25f, 23.64f)
                close()
                moveTo(16.97f, 21.08f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.32f, 0.15f, 0.46f)
                curveToRelative(0.1f, 0.14f, 0.25f, 0.25f, 0.45f, 0.31f)
                curveToRelative(0.17f, 0.02f, 0.26f, 0.03f, 0.27f, 0.03f)
                curveToRelative(0.41f, 0.0f, 0.66f, -0.2f, 0.77f, -0.61f)
                lineToRelative(0.87f, -3.17f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.45f, -0.07f, -0.65f)
                curveToRelative(-0.11f, -0.19f, -0.28f, -0.32f, -0.5f, -0.39f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.64f, 0.07f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.28f, -0.4f, 0.51f)
                lineTo(17.0f, 20.81f)
                curveTo(16.98f, 20.9f, 16.97f, 20.99f, 16.97f, 21.08f)
                close()
                moveTo(17.62f, 8.83f)
                curveToRelative(0.31f, -0.57f, 0.75f, -1.01f, 1.3f, -1.31f)
                curveToRelative(0.55f, -0.3f, 1.14f, -0.45f, 1.76f, -0.44f)
                curveToRelative(0.11f, 0.0f, 0.2f, 0.01f, 0.25f, 0.02f)
                verticalLineToRelative(0.31f)
                curveToRelative(0.0f, 0.98f, 0.26f, 1.89f, 0.78f, 2.75f)
                curveToRelative(0.52f, 0.86f, 1.25f, 1.51f, 2.17f, 1.95f)
                curveToRelative(-0.19f, 0.44f, -0.44f, 0.79f, -0.75f, 1.07f)
                curveTo(22.25f, 12.39f, 21.17f, 12.0f, 19.88f, 12.0f)
                horizontalLineToRelative(-0.32f)
                curveTo(19.3f, 10.75f, 18.66f, 9.69f, 17.62f, 8.83f)
                close()
            }
        }
        .build()
        return _nightAltHail!!
    }

private var _nightAltHail: ImageVector? = null
