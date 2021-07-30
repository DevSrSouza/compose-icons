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

public val WeatherIcons.CloudUp: ImageVector
    get() {
        if (_cloudUp != null) {
            return _cloudUp!!
        }
        _cloudUp = Builder(name = "CloudUp", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 16.88f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.43f)
                curveToRelative(0.93f, 0.96f, 2.06f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, -0.06f, -0.19f, -0.17f, -0.19f)
                curveToRelative(-0.86f, -0.04f, -1.58f, -0.38f, -2.18f, -1.02f)
                reflectiveCurveToRelative(-0.9f, -1.39f, -0.9f, -2.25f)
                curveToRelative(0.0f, -0.82f, 0.28f, -1.54f, 0.84f, -2.16f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.97f, 2.1f, -1.07f)
                horizontalLineToRelative(0.53f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.18f)
                lineToRelative(0.06f, -0.57f)
                curveToRelative(0.11f, -1.08f, 0.57f, -1.99f, 1.38f, -2.72f)
                reflectiveCurveToRelative(1.77f, -1.1f, 2.86f, -1.1f)
                curveToRelative(1.08f, 0.0f, 2.03f, 0.37f, 2.85f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.64f, 1.39f, 2.72f)
                lineToRelative(0.08f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.18f, 0.18f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.89f, 0.0f, 1.66f, 0.32f, 2.31f, 0.96f)
                reflectiveCurveToRelative(0.98f, 1.4f, 0.98f, 2.26f)
                curveToRelative(0.0f, 0.86f, -0.3f, 1.61f, -0.9f, 2.25f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.18f, 1.02f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.19f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.87f, -0.02f, 1.67f, -0.26f, 2.4f, -0.71f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.05f, 1.73f, -1.8f)
                curveToRelative(0.42f, -0.75f, 0.63f, -1.57f, 0.63f, -2.44f)
                curveToRelative(0.0f, -0.67f, -0.13f, -1.31f, -0.39f, -1.91f)
                curveToRelative(-0.26f, -0.61f, -0.62f, -1.13f, -1.06f, -1.57f)
                curveToRelative(-0.44f, -0.44f, -0.97f, -0.79f, -1.58f, -1.05f)
                curveToRelative(-0.61f, -0.26f, -1.25f, -0.39f, -1.92f, -0.39f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.33f, -1.34f, -1.03f, -2.43f, -2.11f, -3.29f)
                curveToRelative(-1.07f, -0.85f, -2.3f, -1.28f, -3.68f, -1.28f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.32f)
                reflectiveCurveToRelative(-1.79f, 2.0f, -2.1f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.83f, -2.73f, 1.73f)
                curveTo(4.99f, 14.71f, 4.64f, 15.73f, 4.64f, 16.88f)
                close()
                moveTo(11.58f, 17.51f)
                curveToRelative(0.0f, 0.25f, 0.08f, 0.46f, 0.24f, 0.64f)
                curveToRelative(0.15f, 0.15f, 0.35f, 0.23f, 0.61f, 0.23f)
                curveToRelative(0.24f, 0.0f, 0.45f, -0.08f, 0.62f, -0.23f)
                lineToRelative(1.11f, -1.14f)
                verticalLineToRelative(3.98f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.23f, 0.61f)
                curveToRelative(0.16f, 0.17f, 0.35f, 0.25f, 0.59f, 0.25f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.6f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.61f)
                verticalLineToRelative(-3.94f)
                lineToRelative(1.12f, 1.11f)
                curveToRelative(0.4f, 0.31f, 0.81f, 0.31f, 1.22f, 0.0f)
                curveToRelative(0.16f, -0.15f, 0.24f, -0.36f, 0.24f, -0.62f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.24f, -0.62f)
                lineToRelative(-2.59f, -2.57f)
                curveToRelative(-0.16f, -0.16f, -0.36f, -0.24f, -0.6f, -0.24f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.59f, 0.24f)
                lineToRelative(-2.58f, 2.57f)
                curveTo(11.66f, 17.08f, 11.58f, 17.27f, 11.58f, 17.51f)
                close()
            }
        }
        .build()
        return _cloudUp!!
    }

private var _cloudUp: ImageVector? = null
