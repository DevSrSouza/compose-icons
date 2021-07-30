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

public val WeatherIcons.Tornado: ImageVector
    get() {
        if (_tornado != null) {
            return _tornado!!
        }
        _tornado = Builder(name = "Tornado", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.13f, 15.19f)
                curveToRelative(0.0f, 0.69f, 0.36f, 1.28f, 1.08f, 1.77f)
                curveToRelative(1.32f, 0.93f, 3.31f, 1.39f, 5.98f, 1.39f)
                curveToRelative(1.2f, 0.0f, 2.31f, -0.1f, 3.34f, -0.31f)
                curveToRelative(1.08f, -0.23f, 1.97f, -0.6f, 2.65f, -1.1f)
                reflectiveCurveToRelative(1.03f, -1.08f, 1.03f, -1.76f)
                curveToRelative(0.0f, -0.21f, -0.04f, -0.41f, -0.12f, -0.62f)
                curveToRelative(1.39f, -0.34f, 2.48f, -0.8f, 3.27f, -1.38f)
                reflectiveCurveToRelative(1.19f, -1.25f, 1.19f, -2.0f)
                curveToRelative(0.0f, -0.19f, -0.03f, -0.39f, -0.09f, -0.6f)
                curveToRelative(2.29f, -0.81f, 3.43f, -1.9f, 3.43f, -3.28f)
                curveToRelative(0.0f, -0.88f, -0.5f, -1.66f, -1.49f, -2.34f)
                curveToRelative(-1.95f, -1.3f, -4.81f, -1.95f, -8.58f, -1.95f)
                curveToRelative(-1.78f, 0.0f, -3.39f, 0.16f, -4.83f, 0.47f)
                curveTo(9.42f, 3.8f, 8.16f, 4.3f, 7.2f, 4.98f)
                reflectiveCurveTo(5.76f, 6.44f, 5.76f, 7.31f)
                curveToRelative(0.0f, 0.52f, 0.16f, 0.99f, 0.48f, 1.42f)
                curveToRelative(-1.18f, 0.67f, -1.77f, 1.49f, -1.77f, 2.46f)
                curveToRelative(0.0f, 0.75f, 0.37f, 1.41f, 1.1f, 1.98f)
                curveTo(4.61f, 13.73f, 4.13f, 14.4f, 4.13f, 15.19f)
                close()
                moveTo(4.73f, 19.69f)
                curveToRelative(0.0f, 0.73f, 0.45f, 1.31f, 1.35f, 1.72f)
                reflectiveCurveToRelative(2.04f, 0.62f, 3.41f, 0.62f)
                curveToRelative(1.39f, 0.0f, 2.53f, -0.21f, 3.44f, -0.62f)
                reflectiveCurveToRelative(1.36f, -0.99f, 1.36f, -1.72f)
                curveToRelative(0.0f, -0.27f, -0.09f, -0.5f, -0.26f, -0.69f)
                reflectiveCurveToRelative(-0.4f, -0.28f, -0.67f, -0.28f)
                curveToRelative(-0.22f, 0.0f, -0.42f, 0.08f, -0.6f, 0.23f)
                reflectiveCurveToRelative(-0.29f, 0.35f, -0.34f, 0.57f)
                curveToRelative(-0.2f, 0.16f, -0.56f, 0.3f, -1.1f, 0.43f)
                reflectiveCurveToRelative(-1.15f, 0.2f, -1.83f, 0.2f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.16f, -2.68f, -0.47f)
                curveToRelative(0.16f, -0.16f, 0.24f, -0.36f, 0.26f, -0.6f)
                reflectiveCurveToRelative(-0.04f, -0.45f, -0.15f, -0.62f)
                curveToRelative(-0.16f, -0.21f, -0.36f, -0.35f, -0.61f, -0.4f)
                reflectiveCurveToRelative(-0.48f, 0.0f, -0.7f, 0.13f)
                curveTo(5.02f, 18.6f, 4.73f, 19.09f, 4.73f, 19.69f)
                close()
                moveTo(6.01f, 15.19f)
                curveToRelative(0.0f, -0.01f, 0.06f, -0.07f, 0.19f, -0.18f)
                curveToRelative(0.09f, -0.09f, 0.28f, -0.2f, 0.56f, -0.34f)
                reflectiveCurveToRelative(0.61f, -0.25f, 0.96f, -0.35f)
                lineToRelative(0.12f, -0.06f)
                curveToRelative(1.62f, 0.54f, 3.51f, 0.81f, 5.67f, 0.81f)
                curveToRelative(0.95f, 0.0f, 1.81f, -0.05f, 2.58f, -0.16f)
                lineToRelative(0.26f, 0.23f)
                curveToRelative(-0.09f, 0.16f, -0.3f, 0.32f, -0.63f, 0.5f)
                curveToRelative(-0.4f, 0.21f, -1.02f, 0.41f, -1.86f, 0.57f)
                reflectiveCurveToRelative(-1.73f, 0.25f, -2.67f, 0.25f)
                reflectiveCurveToRelative(-1.83f, -0.08f, -2.67f, -0.25f)
                reflectiveCurveToRelative(-1.47f, -0.36f, -1.88f, -0.57f)
                curveTo(6.3f, 15.5f, 6.09f, 15.35f, 6.01f, 15.19f)
                close()
                moveTo(6.12f, 23.61f)
                curveToRelative(0.0f, 0.63f, 0.36f, 1.12f, 1.08f, 1.46f)
                reflectiveCurveToRelative(1.61f, 0.51f, 2.67f, 0.51f)
                curveToRelative(1.08f, 0.0f, 1.99f, -0.17f, 2.72f, -0.51f)
                reflectiveCurveToRelative(1.1f, -0.83f, 1.1f, -1.46f)
                curveToRelative(0.0f, -0.25f, -0.09f, -0.48f, -0.28f, -0.67f)
                reflectiveCurveToRelative(-0.41f, -0.29f, -0.66f, -0.29f)
                curveToRelative(-0.47f, 0.0f, -0.78f, 0.24f, -0.92f, 0.72f)
                curveToRelative(-0.39f, 0.24f, -1.04f, 0.37f, -1.96f, 0.37f)
                curveToRelative(-0.8f, 0.0f, -1.44f, -0.12f, -1.92f, -0.37f)
                curveToRelative(-0.15f, -0.48f, -0.45f, -0.72f, -0.92f, -0.72f)
                curveToRelative(-0.25f, 0.0f, -0.47f, 0.09f, -0.64f, 0.28f)
                reflectiveCurveTo(6.12f, 23.34f, 6.12f, 23.61f)
                close()
                moveTo(6.33f, 11.19f)
                curveToRelative(0.0f, -0.08f, 0.05f, -0.17f, 0.15f, -0.28f)
                curveToRelative(0.24f, -0.3f, 0.72f, -0.6f, 1.42f, -0.88f)
                curveToRelative(1.92f, 1.03f, 4.56f, 1.54f, 7.91f, 1.54f)
                curveToRelative(1.71f, 0.0f, 3.32f, -0.16f, 4.82f, -0.47f)
                verticalLineToRelative(0.09f)
                curveToRelative(0.0f, 0.15f, -0.09f, 0.3f, -0.28f, 0.45f)
                curveToRelative(-0.41f, 0.36f, -1.17f, 0.7f, -2.29f, 1.03f)
                curveToRelative(-1.21f, 0.36f, -2.73f, 0.54f, -4.56f, 0.54f)
                curveToRelative(-1.84f, 0.0f, -3.36f, -0.18f, -4.57f, -0.54f)
                curveTo(7.77f, 12.35f, 7.0f, 12.01f, 6.61f, 11.65f)
                curveTo(6.42f, 11.5f, 6.33f, 11.35f, 6.33f, 11.19f)
                close()
                moveTo(7.63f, 7.31f)
                curveToRelative(0.0f, -0.18f, 0.12f, -0.37f, 0.35f, -0.59f)
                curveTo(8.43f, 6.3f, 9.33f, 5.9f, 10.66f, 5.51f)
                curveToRelative(1.43f, -0.42f, 3.14f, -0.63f, 5.14f, -0.63f)
                curveToRelative(2.01f, 0.0f, 3.74f, 0.21f, 5.19f, 0.63f)
                curveToRelative(1.35f, 0.39f, 2.24f, 0.8f, 2.68f, 1.22f)
                curveToRelative(0.22f, 0.22f, 0.34f, 0.42f, 0.34f, 0.59f)
                reflectiveCurveToRelative(-0.11f, 0.35f, -0.34f, 0.56f)
                curveToRelative(-0.44f, 0.42f, -1.33f, 0.83f, -2.68f, 1.23f)
                curveToRelative(-1.45f, 0.42f, -3.17f, 0.63f, -5.19f, 0.63f)
                curveToRelative(-2.0f, 0.0f, -3.72f, -0.21f, -5.14f, -0.63f)
                curveTo(9.32f, 8.71f, 8.42f, 8.3f, 7.98f, 7.87f)
                curveTo(7.75f, 7.66f, 7.63f, 7.48f, 7.63f, 7.31f)
                close()
            }
        }
        .build()
        return _tornado!!
    }

private var _tornado: ImageVector? = null
