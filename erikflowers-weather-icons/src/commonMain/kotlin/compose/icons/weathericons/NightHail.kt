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

public val WeatherIcons.NightHail: ImageVector
    get() {
        if (_nightHail != null) {
            return _nightHail!!
        }
        _nightHail = Builder(name = "NightHail", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 16.89f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.43f)
                curveToRelative(0.93f, 0.96f, 2.06f, 1.47f, 3.4f, 1.54f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.18f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, -0.06f, -0.18f, -0.18f, -0.18f)
                curveToRelative(-0.86f, -0.04f, -1.58f, -0.38f, -2.18f, -1.02f)
                curveToRelative(-0.6f, -0.64f, -0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.84f, -2.17f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.18f)
                lineToRelative(0.08f, -0.51f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.09f, 2.85f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                reflectiveCurveToRelative(1.28f, 1.63f, 1.4f, 2.71f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.18f, 0.18f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.96f, 1.39f, 0.96f, 2.29f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.18f, 1.02f)
                curveToRelative(-0.13f, 0.0f, -0.19f, 0.06f, -0.19f, 0.18f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                curveToRelative(0.88f, -0.03f, 1.68f, -0.27f, 2.41f, -0.72f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.05f, 1.73f, -1.8f)
                reflectiveCurveToRelative(0.63f, -1.57f, 0.63f, -2.44f)
                curveToRelative(0.0f, -0.74f, -0.14f, -1.41f, -0.43f, -2.01f)
                curveToRelative(0.79f, -0.96f, 1.18f, -2.06f, 1.18f, -3.32f)
                curveToRelative(0.0f, -0.94f, -0.24f, -1.82f, -0.71f, -2.62f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.45f, -1.92f, -1.92f)
                curveToRelative(-0.81f, -0.47f, -1.68f, -0.71f, -2.62f, -0.71f)
                curveToRelative(-1.56f, 0.0f, -2.85f, 0.58f, -3.88f, 1.73f)
                curveToRelative(-0.82f, -0.44f, -1.72f, -0.66f, -2.71f, -0.66f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.32f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.11f, 3.36f)
                curveToRelative(-1.1f, 0.26f, -2.01f, 0.84f, -2.73f, 1.74f)
                curveTo(4.61f, 14.71f, 4.25f, 15.74f, 4.25f, 16.89f)
                close()
                moveTo(9.62f, 23.87f)
                curveToRelative(0.09f, 0.22f, 0.24f, 0.37f, 0.46f, 0.46f)
                curveToRelative(0.2f, 0.1f, 0.41f, 0.11f, 0.62f, 0.02f)
                curveToRelative(0.22f, -0.08f, 0.36f, -0.23f, 0.45f, -0.45f)
                curveToRelative(0.09f, -0.22f, 0.09f, -0.44f, 0.01f, -0.65f)
                curveToRelative(-0.08f, -0.22f, -0.23f, -0.37f, -0.44f, -0.47f)
                curveToRelative(-0.2f, -0.08f, -0.4f, -0.08f, -0.61f, 0.01f)
                curveToRelative(-0.21f, 0.09f, -0.36f, 0.23f, -0.46f, 0.43f)
                curveTo(9.54f, 23.39f, 9.53f, 23.61f, 9.62f, 23.87f)
                close()
                moveTo(10.25f, 21.04f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.31f, 0.15f, 0.46f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.25f, 0.46f, 0.31f)
                curveToRelative(0.22f, 0.07f, 0.44f, 0.05f, 0.65f, -0.06f)
                reflectiveCurveToRelative(0.35f, -0.29f, 0.43f, -0.55f)
                lineToRelative(0.98f, -3.11f)
                curveToRelative(0.07f, -0.24f, 0.05f, -0.47f, -0.08f, -0.67f)
                curveToRelative(-0.12f, -0.2f, -0.31f, -0.33f, -0.55f, -0.38f)
                curveToRelative(-0.22f, -0.07f, -0.43f, -0.05f, -0.62f, 0.06f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.28f, -0.4f, 0.5f)
                lineToRelative(-1.0f, 3.18f)
                lineTo(10.25f, 21.04f)
                close()
                moveTo(12.11f, 26.64f)
                curveToRelative(0.0f, 0.07f, 0.02f, 0.17f, 0.06f, 0.29f)
                curveToRelative(0.09f, 0.22f, 0.25f, 0.38f, 0.46f, 0.45f)
                curveToRelative(0.08f, 0.05f, 0.19f, 0.08f, 0.33f, 0.08f)
                curveToRelative(0.06f, 0.0f, 0.16f, -0.02f, 0.3f, -0.06f)
                curveToRelative(0.22f, -0.08f, 0.38f, -0.23f, 0.47f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.1f, -0.44f, 0.0f, -0.66f)
                curveToRelative(-0.1f, -0.22f, -0.25f, -0.37f, -0.45f, -0.46f)
                reflectiveCurveToRelative(-0.41f, -0.09f, -0.62f, -0.01f)
                curveToRelative(-0.19f, 0.08f, -0.33f, 0.2f, -0.42f, 0.36f)
                curveTo(12.15f, 26.34f, 12.11f, 26.49f, 12.11f, 26.64f)
                close()
                moveTo(12.85f, 23.97f)
                curveToRelative(0.0f, 0.18f, 0.05f, 0.33f, 0.15f, 0.48f)
                curveToRelative(0.1f, 0.14f, 0.26f, 0.24f, 0.48f, 0.28f)
                curveToRelative(0.02f, 0.0f, 0.06f, 0.01f, 0.11f, 0.02f)
                reflectiveCurveToRelative(0.1f, 0.02f, 0.13f, 0.02f)
                curveToRelative(0.43f, -0.03f, 0.7f, -0.24f, 0.81f, -0.62f)
                lineToRelative(1.76f, -6.07f)
                curveToRelative(0.07f, -0.24f, 0.05f, -0.46f, -0.06f, -0.65f)
                curveToRelative(-0.11f, -0.19f, -0.28f, -0.32f, -0.5f, -0.39f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.06f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.28f, -0.4f, 0.5f)
                lineToRelative(-1.8f, 6.07f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.06f, -0.01f, 0.1f)
                curveToRelative(-0.01f, 0.04f, -0.01f, 0.08f, -0.01f, 0.11f)
                curveTo(12.85f, 23.92f, 12.85f, 23.95f, 12.85f, 23.97f)
                close()
                moveTo(16.29f, 23.57f)
                curveToRelative(0.0f, 0.1f, 0.02f, 0.21f, 0.05f, 0.32f)
                curveToRelative(0.08f, 0.21f, 0.23f, 0.36f, 0.46f, 0.44f)
                curveToRelative(0.09f, 0.04f, 0.21f, 0.07f, 0.36f, 0.07f)
                curveToRelative(0.12f, 0.0f, 0.22f, -0.02f, 0.29f, -0.06f)
                curveToRelative(0.23f, -0.09f, 0.38f, -0.23f, 0.46f, -0.43f)
                curveToRelative(0.08f, -0.22f, 0.08f, -0.43f, 0.0f, -0.65f)
                curveToRelative(-0.08f, -0.21f, -0.22f, -0.37f, -0.42f, -0.48f)
                curveToRelative(-0.22f, -0.08f, -0.44f, -0.08f, -0.65f, 0.01f)
                curveToRelative(-0.22f, 0.09f, -0.37f, 0.23f, -0.47f, 0.43f)
                curveTo(16.32f, 23.33f, 16.29f, 23.44f, 16.29f, 23.57f)
                close()
                moveTo(17.01f, 21.03f)
                curveToRelative(0.0f, 0.36f, 0.21f, 0.61f, 0.62f, 0.75f)
                curveToRelative(0.14f, 0.04f, 0.24f, 0.06f, 0.3f, 0.06f)
                curveToRelative(0.12f, 0.0f, 0.23f, -0.03f, 0.34f, -0.08f)
                curveToRelative(0.17f, -0.09f, 0.31f, -0.27f, 0.4f, -0.55f)
                lineToRelative(0.98f, -3.11f)
                curveToRelative(0.08f, -0.23f, 0.05f, -0.45f, -0.06f, -0.64f)
                curveToRelative(-0.12f, -0.2f, -0.29f, -0.33f, -0.51f, -0.4f)
                curveToRelative(-0.23f, -0.07f, -0.44f, -0.05f, -0.64f, 0.06f)
                curveToRelative(-0.19f, 0.11f, -0.33f, 0.28f, -0.4f, 0.5f)
                lineToRelative(-0.98f, 3.13f)
                curveTo(17.02f, 20.91f, 17.01f, 21.01f, 17.01f, 21.03f)
                close()
                moveTo(18.04f, 9.02f)
                curveToRelative(0.69f, -0.66f, 1.51f, -0.99f, 2.48f, -0.99f)
                curveToRelative(0.97f, 0.0f, 1.81f, 0.35f, 2.5f, 1.04f)
                curveToRelative(0.69f, 0.69f, 1.04f, 1.53f, 1.04f, 2.5f)
                curveToRelative(0.0f, 0.62f, -0.17f, 1.23f, -0.52f, 1.84f)
                curveToRelative(-0.98f, -0.98f, -2.14f, -1.47f, -3.49f, -1.47f)
                horizontalLineToRelative(-0.33f)
                curveTo(19.41f, 10.78f, 18.85f, 9.81f, 18.04f, 9.02f)
                close()
            }
        }
        .build()
        return _nightHail!!
    }

private var _nightHail: ImageVector? = null
