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

public val WeatherIcons.DayCloudy: ImageVector
    get() {
        if (_dayCloudy != null) {
            return _dayCloudy!!
        }
        _dayCloudy = Builder(name = "DayCloudy", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.56f, 16.9f)
                curveToRelative(0.0f, 0.9f, 0.22f, 1.73f, 0.66f, 2.49f)
                reflectiveCurveToRelative(1.04f, 1.36f, 1.8f, 1.8f)
                curveToRelative(0.76f, 0.44f, 1.58f, 0.66f, 2.47f, 0.66f)
                horizontalLineToRelative(10.83f)
                curveToRelative(0.89f, 0.0f, 1.72f, -0.22f, 2.48f, -0.66f)
                curveToRelative(0.76f, -0.44f, 1.37f, -1.04f, 1.81f, -1.8f)
                curveToRelative(0.44f, -0.76f, 0.67f, -1.59f, 0.67f, -2.49f)
                curveToRelative(0.0f, -0.66f, -0.14f, -1.33f, -0.42f, -2.0f)
                curveTo(22.62f, 13.98f, 23.0f, 12.87f, 23.0f, 11.6f)
                curveToRelative(0.0f, -0.71f, -0.14f, -1.39f, -0.41f, -2.04f)
                curveToRelative(-0.27f, -0.65f, -0.65f, -1.2f, -1.12f, -1.67f)
                curveTo(21.0f, 7.42f, 20.45f, 7.04f, 19.8f, 6.77f)
                curveToRelative(-0.65f, -0.28f, -1.33f, -0.41f, -2.04f, -0.41f)
                curveToRelative(-1.48f, 0.0f, -2.77f, 0.58f, -3.88f, 1.74f)
                curveToRelative(-0.77f, -0.44f, -1.67f, -0.66f, -2.7f, -0.66f)
                curveToRelative(-1.41f, 0.0f, -2.65f, 0.44f, -3.73f, 1.31f)
                curveToRelative(-1.08f, 0.87f, -1.78f, 1.99f, -2.08f, 3.35f)
                curveToRelative(-1.12f, 0.26f, -2.03f, 0.83f, -2.74f, 1.73f)
                reflectiveCurveTo(1.56f, 15.75f, 1.56f, 16.9f)
                close()
                moveTo(3.27f, 16.9f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.56f, 0.84f, -2.17f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.96f, 2.1f, -1.06f)
                lineToRelative(0.5f, -0.03f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.06f, 0.19f, -0.18f)
                lineToRelative(0.07f, -0.54f)
                curveToRelative(0.14f, -1.08f, 0.61f, -1.99f, 1.41f, -2.71f)
                curveToRelative(0.8f, -0.73f, 1.74f, -1.09f, 2.81f, -1.09f)
                curveToRelative(1.1f, 0.0f, 2.06f, 0.37f, 2.87f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.27f, 1.63f, 1.37f, 2.71f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.02f, 0.11f, 0.09f, 0.17f, 0.21f, 0.17f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.88f, 0.0f, 1.64f, 0.32f, 2.28f, 0.96f)
                curveToRelative(0.64f, 0.64f, 0.96f, 1.39f, 0.96f, 2.27f)
                curveToRelative(0.0f, 0.91f, -0.32f, 1.68f, -0.95f, 2.32f)
                curveToRelative(-0.63f, 0.64f, -1.4f, 0.96f, -2.28f, 0.96f)
                horizontalLineTo(6.49f)
                curveToRelative(-0.88f, 0.0f, -1.63f, -0.32f, -2.27f, -0.97f)
                curveTo(3.59f, 18.57f, 3.27f, 17.8f, 3.27f, 16.9f)
                close()
                moveTo(9.97f, 4.63f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.45f, 0.24f, 0.63f)
                lineToRelative(0.66f, 0.64f)
                curveToRelative(0.25f, 0.19f, 0.46f, 0.27f, 0.64f, 0.25f)
                curveToRelative(0.21f, 0.0f, 0.39f, -0.09f, 0.55f, -0.26f)
                reflectiveCurveToRelative(0.24f, -0.38f, 0.24f, -0.62f)
                curveToRelative(0.0f, -0.24f, -0.09f, -0.44f, -0.26f, -0.59f)
                lineToRelative(-0.59f, -0.66f)
                curveToRelative(-0.18f, -0.16f, -0.38f, -0.24f, -0.61f, -0.24f)
                curveToRelative(-0.24f, 0.0f, -0.45f, 0.08f, -0.62f, 0.25f)
                curveTo(10.05f, 4.19f, 9.97f, 4.39f, 9.97f, 4.63f)
                close()
                moveTo(15.31f, 9.06f)
                curveToRelative(0.69f, -0.67f, 1.51f, -1.0f, 2.45f, -1.0f)
                curveToRelative(0.99f, 0.0f, 1.83f, 0.34f, 2.52f, 1.03f)
                curveToRelative(0.69f, 0.69f, 1.04f, 1.52f, 1.04f, 2.51f)
                curveToRelative(0.0f, 0.62f, -0.17f, 1.24f, -0.51f, 1.84f)
                curveTo(19.84f, 12.48f, 18.68f, 12.0f, 17.32f, 12.0f)
                horizontalLineTo(17.0f)
                curveTo(16.75f, 10.91f, 16.19f, 9.93f, 15.31f, 9.06f)
                close()
                moveTo(16.94f, 3.78f)
                curveToRelative(0.0f, 0.26f, 0.08f, 0.46f, 0.23f, 0.62f)
                reflectiveCurveToRelative(0.35f, 0.23f, 0.59f, 0.23f)
                curveToRelative(0.26f, 0.0f, 0.46f, -0.08f, 0.62f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.36f, 0.23f, -0.62f)
                verticalLineTo(1.73f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.43f, -0.24f, -0.59f)
                reflectiveCurveToRelative(-0.36f, -0.23f, -0.61f, -0.23f)
                curveToRelative(-0.24f, 0.0f, -0.43f, 0.08f, -0.59f, 0.23f)
                reflectiveCurveToRelative(-0.23f, 0.35f, -0.23f, 0.59f)
                verticalLineTo(3.78f)
                close()
                moveTo(22.46f, 6.07f)
                curveToRelative(0.0f, 0.26f, 0.07f, 0.46f, 0.22f, 0.62f)
                curveToRelative(0.21f, 0.16f, 0.42f, 0.24f, 0.62f, 0.24f)
                curveToRelative(0.18f, 0.0f, 0.38f, -0.08f, 0.59f, -0.24f)
                lineToRelative(1.43f, -1.43f)
                curveToRelative(0.16f, -0.18f, 0.24f, -0.39f, 0.24f, -0.64f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.24f, -0.6f)
                curveToRelative(-0.16f, -0.16f, -0.36f, -0.24f, -0.59f, -0.24f)
                curveToRelative(-0.24f, 0.0f, -0.43f, 0.08f, -0.58f, 0.24f)
                lineToRelative(-1.47f, 1.43f)
                curveTo(22.53f, 5.64f, 22.46f, 5.84f, 22.46f, 6.07f)
                close()
                moveTo(23.25f, 17.91f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.45f, 0.25f, 0.63f)
                lineToRelative(0.65f, 0.63f)
                curveToRelative(0.15f, 0.16f, 0.34f, 0.24f, 0.58f, 0.24f)
                reflectiveCurveToRelative(0.44f, -0.08f, 0.6f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.62f)
                curveToRelative(0.0f, -0.22f, -0.08f, -0.42f, -0.24f, -0.58f)
                lineToRelative(-0.65f, -0.65f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.57f, -0.24f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.24f)
                curveTo(23.34f, 17.47f, 23.25f, 17.67f, 23.25f, 17.91f)
                close()
                moveTo(24.72f, 11.6f)
                curveToRelative(0.0f, 0.23f, 0.09f, 0.42f, 0.26f, 0.58f)
                curveToRelative(0.16f, 0.16f, 0.37f, 0.24f, 0.61f, 0.24f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.23f, 0.0f, 0.42f, -0.08f, 0.58f, -0.23f)
                reflectiveCurveToRelative(0.23f, -0.35f, 0.23f, -0.59f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.23f, -0.6f)
                reflectiveCurveToRelative(-0.35f, -0.25f, -0.58f, -0.25f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.61f, 0.25f)
                curveTo(24.8f, 11.17f, 24.72f, 11.37f, 24.72f, 11.6f)
                close()
            }
        }
        .build()
        return _dayCloudy!!
    }

private var _dayCloudy: ImageVector? = null
