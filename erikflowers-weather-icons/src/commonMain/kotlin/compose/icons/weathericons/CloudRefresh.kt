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

public val WeatherIcons.CloudRefresh: ImageVector
    get() {
        if (_cloudRefresh != null) {
            return _cloudRefresh!!
        }
        _cloudRefresh = Builder(name = "CloudRefresh", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.63f, 16.91f)
                curveToRelative(0.0f, 0.66f, 0.12f, 1.28f, 0.38f, 1.88f)
                curveToRelative(0.25f, 0.6f, 0.59f, 1.11f, 1.02f, 1.55f)
                curveToRelative(0.43f, 0.43f, 0.94f, 0.79f, 1.53f, 1.05f)
                curveToRelative(0.59f, 0.27f, 1.21f, 0.42f, 1.87f, 0.45f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, -0.06f, -0.19f, -0.17f, -0.19f)
                curveToRelative(-0.87f, -0.06f, -1.6f, -0.41f, -2.19f, -1.03f)
                reflectiveCurveToRelative(-0.89f, -1.36f, -0.89f, -2.21f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.85f, -2.19f)
                curveToRelative(0.57f, -0.62f, 1.26f, -0.97f, 2.1f, -1.04f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.07f, -0.71f, 0.3f, -1.36f, 0.69f, -1.95f)
                curveToRelative(0.39f, -0.58f, 0.9f, -1.04f, 1.52f, -1.37f)
                reflectiveCurveToRelative(1.29f, -0.49f, 2.01f, -0.49f)
                curveToRelative(1.09f, 0.0f, 2.05f, 0.36f, 2.86f, 1.08f)
                curveToRelative(0.82f, 0.72f, 1.28f, 1.62f, 1.39f, 2.7f)
                lineToRelative(0.06f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.9f, 0.0f, 1.67f, 0.32f, 2.32f, 0.97f)
                curveToRelative(0.64f, 0.64f, 0.97f, 1.41f, 0.97f, 2.3f)
                curveToRelative(0.0f, 0.85f, -0.3f, 1.59f, -0.89f, 2.21f)
                curveToRelative(-0.59f, 0.62f, -1.32f, 0.97f, -2.19f, 1.03f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.19f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(1.34f, -0.06f, 2.47f, -0.57f, 3.39f, -1.51f)
                reflectiveCurveToRelative(1.38f, -2.09f, 1.38f, -3.42f)
                curveToRelative(0.0f, -0.89f, -0.22f, -1.72f, -0.67f, -2.48f)
                curveToRelative(-0.45f, -0.76f, -1.05f, -1.36f, -1.81f, -1.8f)
                curveToRelative(-0.76f, -0.44f, -1.59f, -0.67f, -2.48f, -0.67f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.33f, -1.33f, -1.04f, -2.42f, -2.11f, -3.28f)
                curveTo(16.9f, 7.82f, 15.67f, 7.4f, 14.3f, 7.4f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.33f)
                reflectiveCurveToRelative(-1.8f, 2.01f, -2.11f, 3.38f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.73f, 1.74f)
                curveTo(4.99f, 14.74f, 4.63f, 15.76f, 4.63f, 16.91f)
                close()
                moveTo(10.86f, 18.18f)
                curveToRelative(0.0f, 0.74f, 0.19f, 1.43f, 0.56f, 2.07f)
                reflectiveCurveToRelative(0.88f, 1.14f, 1.51f, 1.51f)
                curveToRelative(0.63f, 0.38f, 1.32f, 0.56f, 2.06f, 0.56f)
                curveToRelative(1.15f, 0.0f, 2.13f, -0.41f, 2.95f, -1.22f)
                curveToRelative(0.82f, -0.82f, 1.23f, -1.79f, 1.23f, -2.92f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.6f)
                curveToRelative(-0.17f, -0.17f, -0.37f, -0.25f, -0.61f, -0.25f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.61f, 0.25f)
                reflectiveCurveToRelative(-0.26f, 0.37f, -0.26f, 0.6f)
                curveToRelative(0.0f, 0.67f, -0.24f, 1.24f, -0.72f, 1.73f)
                curveToRelative(-0.48f, 0.48f, -1.05f, 0.72f, -1.73f, 0.72f)
                curveToRelative(-0.66f, 0.0f, -1.23f, -0.24f, -1.71f, -0.72f)
                curveToRelative(-0.48f, -0.48f, -0.72f, -1.06f, -0.72f, -1.73f)
                curveToRelative(0.0f, -0.6f, 0.18f, -1.13f, 0.53f, -1.6f)
                curveToRelative(0.36f, -0.47f, 0.79f, -0.73f, 1.31f, -0.77f)
                lineToRelative(-0.41f, 0.39f)
                curveToRelative(-0.15f, 0.15f, -0.23f, 0.34f, -0.23f, 0.57f)
                curveToRelative(0.0f, 0.25f, 0.07f, 0.47f, 0.23f, 0.66f)
                curveToRelative(0.14f, 0.15f, 0.31f, 0.23f, 0.53f, 0.23f)
                curveToRelative(0.22f, 0.01f, 0.45f, -0.07f, 0.7f, -0.23f)
                lineToRelative(1.82f, -1.87f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.36f, 0.25f, -0.58f)
                curveToRelative(0.0f, -0.25f, -0.08f, -0.45f, -0.25f, -0.61f)
                lineToRelative(-1.82f, -1.83f)
                curveToRelative(-0.19f, -0.18f, -0.39f, -0.26f, -0.62f, -0.26f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.59f, 0.25f)
                curveToRelative(-0.16f, 0.17f, -0.24f, 0.37f, -0.24f, 0.61f)
                curveToRelative(0.0f, 0.24f, 0.07f, 0.43f, 0.23f, 0.58f)
                lineToRelative(0.35f, 0.36f)
                curveToRelative(-1.0f, 0.17f, -1.83f, 0.63f, -2.49f, 1.4f)
                curveTo(11.19f, 16.24f, 10.86f, 17.14f, 10.86f, 18.18f)
                close()
            }
        }
        .build()
        return _cloudRefresh!!
    }

private var _cloudRefresh: ImageVector? = null
