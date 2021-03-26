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

public val WeatherIcons.NightSleetStorm: ImageVector
    get() {
        if (_nightSleetStorm != null) {
            return _nightSleetStorm!!
        }
        _nightSleetStorm = Builder(name = "NightSleetStorm", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.19f, 16.88f)
                curveToRelative(0.0f, 1.12f, 0.33f, 2.12f, 1.0f, 3.0f)
                reflectiveCurveToRelative(1.53f, 1.47f, 2.58f, 1.76f)
                lineToRelative(-0.66f, 1.7f)
                curveToRelative(-0.05f, 0.14f, 0.0f, 0.22f, 0.14f, 0.22f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.43f, 4.21f)
                horizontalLineToRelative(0.29f)
                lineToRelative(4.36f, -5.66f)
                curveToRelative(0.04f, -0.04f, 0.04f, -0.09f, 0.02f, -0.14f)
                curveToRelative(-0.02f, -0.05f, -0.07f, -0.07f, -0.14f, -0.07f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(2.49f, -4.65f)
                curveToRelative(0.07f, -0.14f, 0.03f, -0.22f, -0.14f, -0.22f)
                horizontalLineTo(9.68f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.05f, -0.23f, 0.15f)
                lineToRelative(-1.07f, 2.88f)
                curveTo(7.66f, 19.88f, 7.07f, 19.5f, 6.6f, 18.9f)
                curveToRelative(-0.47f, -0.59f, -0.7f, -1.26f, -0.7f, -2.02f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.84f, -2.18f)
                curveTo(7.3f, 14.09f, 8.0f, 13.73f, 8.85f, 13.63f)
                lineToRelative(0.51f, -0.03f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.05f, 0.22f, -0.14f)
                lineToRelative(0.07f, -0.59f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                reflectiveCurveToRelative(1.76f, -1.1f, 2.86f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.29f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.08f, 0.59f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.89f, 0.0f, 1.66f, 0.32f, 2.31f, 0.96f)
                reflectiveCurveToRelative(0.97f, 1.4f, 0.97f, 2.29f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                reflectiveCurveToRelative(-1.32f, 0.98f, -2.18f, 1.03f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.18f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.88f, -0.02f, 1.69f, -0.26f, 2.42f, -0.72f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.06f, 1.74f, -1.81f)
                reflectiveCurveToRelative(0.64f, -1.57f, 0.64f, -2.45f)
                curveToRelative(0.0f, -0.73f, -0.14f, -1.4f, -0.43f, -2.02f)
                curveToRelative(0.76f, -0.96f, 1.14f, -2.06f, 1.14f, -3.29f)
                curveToRelative(0.0f, -0.95f, -0.24f, -1.83f, -0.71f, -2.64f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.45f, -1.92f, -1.92f)
                curveToRelative(-0.81f, -0.47f, -1.69f, -0.71f, -2.64f, -0.71f)
                curveToRelative(-0.72f, 0.0f, -1.42f, 0.15f, -2.1f, 0.45f)
                curveToRelative(-0.68f, 0.3f, -1.26f, 0.72f, -1.76f, 1.25f)
                curveToRelative(-0.81f, -0.43f, -1.71f, -0.65f, -2.72f, -0.65f)
                curveToRelative(-1.42f, 0.0f, -2.68f, 0.44f, -3.77f, 1.32f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.1f, 3.37f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.74f, 1.74f)
                curveTo(4.55f, 14.7f, 4.19f, 15.73f, 4.19f, 16.88f)
                close()
                moveTo(12.07f, 27.1f)
                curveToRelative(0.0f, 0.17f, 0.05f, 0.33f, 0.16f, 0.49f)
                curveToRelative(0.11f, 0.16f, 0.27f, 0.27f, 0.49f, 0.33f)
                curveToRelative(0.09f, 0.02f, 0.17f, 0.03f, 0.24f, 0.03f)
                curveToRelative(0.43f, 0.0f, 0.7f, -0.2f, 0.8f, -0.61f)
                lineToRelative(0.13f, -0.59f)
                curveToRelative(0.06f, -0.26f, 0.03f, -0.48f, -0.08f, -0.68f)
                curveToRelative(-0.12f, -0.2f, -0.29f, -0.32f, -0.53f, -0.37f)
                curveToRelative(-0.21f, -0.07f, -0.42f, -0.05f, -0.63f, 0.07f)
                curveToRelative(-0.21f, 0.12f, -0.34f, 0.29f, -0.41f, 0.51f)
                lineToRelative(-0.13f, 0.59f)
                curveTo(12.08f, 26.99f, 12.07f, 27.07f, 12.07f, 27.1f)
                close()
                moveTo(12.86f, 24.2f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.42f, 0.24f, 0.58f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.58f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.59f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.42f, -0.23f, -0.58f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.23f, -0.59f, -0.23f)
                curveToRelative(-0.24f, 0.0f, -0.43f, 0.08f, -0.59f, 0.23f)
                reflectiveCurveTo(12.86f, 23.97f, 12.86f, 24.2f)
                close()
                moveTo(13.48f, 21.93f)
                curveToRelative(-0.01f, 0.15f, 0.03f, 0.31f, 0.14f, 0.47f)
                curveToRelative(0.1f, 0.16f, 0.25f, 0.26f, 0.45f, 0.3f)
                curveToRelative(0.23f, 0.06f, 0.44f, 0.04f, 0.64f, -0.06f)
                reflectiveCurveToRelative(0.33f, -0.29f, 0.41f, -0.56f)
                lineToRelative(0.26f, -0.9f)
                curveToRelative(0.07f, -0.22f, 0.05f, -0.43f, -0.07f, -0.63f)
                curveToRelative(-0.12f, -0.2f, -0.29f, -0.33f, -0.53f, -0.4f)
                curveToRelative(-0.22f, -0.07f, -0.43f, -0.04f, -0.64f, 0.08f)
                reflectiveCurveToRelative(-0.34f, 0.3f, -0.41f, 0.53f)
                lineToRelative(-0.22f, 0.9f)
                curveTo(13.49f, 21.74f, 13.48f, 21.83f, 13.48f, 21.93f)
                close()
                moveTo(16.24f, 24.08f)
                curveToRelative(0.0f, 0.17f, 0.05f, 0.33f, 0.15f, 0.48f)
                curveToRelative(0.1f, 0.15f, 0.25f, 0.26f, 0.46f, 0.32f)
                curveToRelative(0.03f, 0.0f, 0.08f, 0.01f, 0.14f, 0.02f)
                curveToRelative(0.06f, 0.01f, 0.11f, 0.02f, 0.14f, 0.02f)
                curveToRelative(0.41f, 0.0f, 0.66f, -0.22f, 0.76f, -0.66f)
                lineToRelative(0.14f, -0.6f)
                curveToRelative(0.07f, -0.21f, 0.05f, -0.42f, -0.07f, -0.63f)
                curveToRelative(-0.12f, -0.21f, -0.29f, -0.34f, -0.51f, -0.41f)
                curveToRelative(-0.25f, -0.06f, -0.48f, -0.04f, -0.68f, 0.08f)
                reflectiveCurveToRelative(-0.34f, 0.29f, -0.41f, 0.53f)
                lineToRelative(-0.09f, 0.59f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.05f, -0.01f, 0.11f)
                curveTo(16.25f, 24.0f, 16.24f, 24.04f, 16.24f, 24.08f)
                close()
                moveTo(16.98f, 21.12f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.42f, 0.24f, 0.57f)
                curveToRelative(0.15f, 0.16f, 0.34f, 0.24f, 0.58f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.58f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.43f, -0.23f, -0.59f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.23f, -0.59f, -0.23f)
                curveToRelative(-0.24f, 0.0f, -0.43f, 0.08f, -0.59f, 0.23f)
                reflectiveCurveTo(16.98f, 20.88f, 16.98f, 21.12f)
                close()
                moveTo(18.02f, 9.02f)
                curveToRelative(0.67f, -0.64f, 1.48f, -0.97f, 2.45f, -0.97f)
                curveToRelative(0.98f, 0.0f, 1.82f, 0.34f, 2.51f, 1.03f)
                curveToRelative(0.69f, 0.68f, 1.04f, 1.52f, 1.04f, 2.5f)
                curveToRelative(0.0f, 0.66f, -0.16f, 1.26f, -0.47f, 1.81f)
                curveToRelative(-0.96f, -0.96f, -2.13f, -1.44f, -3.52f, -1.44f)
                horizontalLineToRelative(-0.31f)
                curveTo(19.42f, 10.76f, 18.85f, 9.78f, 18.02f, 9.02f)
                close()
            }
        }
        .build()
        return _nightSleetStorm!!
    }

private var _nightSleetStorm: ImageVector? = null
