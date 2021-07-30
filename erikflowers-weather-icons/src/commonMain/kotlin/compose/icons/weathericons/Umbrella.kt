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

public val WeatherIcons.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 14.65f)
                curveToRelative(0.01f, -0.34f, 0.18f, -0.86f, 0.5f, -1.58f)
                curveToRelative(0.32f, -0.72f, 0.76f, -1.48f, 1.33f, -2.3f)
                curveToRelative(1.86f, -2.61f, 4.49f, -3.98f, 7.88f, -4.13f)
                verticalLineTo(6.21f)
                curveToRelative(0.0f, -0.21f, 0.07f, -0.37f, 0.21f, -0.5f)
                curveToRelative(0.14f, -0.13f, 0.3f, -0.19f, 0.48f, -0.19f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.06f, 0.5f, 0.19f)
                curveToRelative(0.14f, 0.13f, 0.22f, 0.3f, 0.22f, 0.5f)
                verticalLineToRelative(0.44f)
                curveToRelative(0.98f, 0.04f, 1.9f, 0.19f, 2.75f, 0.45f)
                curveToRelative(0.85f, 0.26f, 1.59f, 0.59f, 2.22f, 1.0f)
                curveToRelative(0.63f, 0.41f, 1.17f, 0.83f, 1.61f, 1.27f)
                curveToRelative(0.45f, 0.43f, 0.85f, 0.9f, 1.2f, 1.41f)
                curveToRelative(0.41f, 0.59f, 0.77f, 1.23f, 1.06f, 1.9f)
                curveToRelative(0.29f, 0.67f, 0.5f, 1.21f, 0.61f, 1.61f)
                curveToRelative(0.11f, 0.4f, 0.17f, 0.6f, 0.18f, 0.61f)
                verticalLineToRelative(0.19f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.32f, -0.21f, 0.44f)
                reflectiveCurveToRelative(-0.3f, 0.17f, -0.49f, 0.17f)
                curveToRelative(-0.31f, 0.0f, -0.51f, -0.09f, -0.6f, -0.26f)
                curveToRelative(-0.78f, -0.88f, -1.63f, -1.31f, -2.55f, -1.31f)
                curveToRelative(-0.34f, 0.02f, -0.69f, 0.1f, -1.03f, 0.23f)
                curveToRelative(-0.34f, 0.13f, -0.62f, 0.27f, -0.82f, 0.42f)
                curveToRelative(-0.21f, 0.14f, -0.4f, 0.29f, -0.58f, 0.44f)
                curveToRelative(-0.18f, 0.15f, -0.27f, 0.22f, -0.28f, 0.23f)
                curveToRelative(-0.19f, 0.17f, -0.37f, 0.26f, -0.53f, 0.26f)
                curveToRelative(-0.23f, 0.0f, -0.4f, -0.06f, -0.52f, -0.18f)
                curveToRelative(-0.73f, -0.73f, -1.39f, -1.17f, -2.01f, -1.32f)
                verticalLineToRelative(7.57f)
                lineToRelative(0.0f, 0.17f)
                lineToRelative(-0.01f, 0.21f)
                lineToRelative(-0.04f, 0.23f)
                lineToRelative(-0.06f, 0.25f)
                lineToRelative(-0.09f, 0.26f)
                lineToRelative(-0.13f, 0.27f)
                lineToRelative(-0.17f, 0.26f)
                lineToRelative(-0.21f, 0.25f)
                curveToRelative(-0.51f, 0.59f, -1.23f, 0.88f, -2.18f, 0.88f)
                curveToRelative(-1.01f, 0.0f, -1.77f, -0.29f, -2.28f, -0.88f)
                curveToRelative(-0.12f, -0.12f, -0.22f, -0.25f, -0.31f, -0.38f)
                curveToRelative(-0.09f, -0.14f, -0.16f, -0.27f, -0.21f, -0.41f)
                curveToRelative(-0.05f, -0.13f, -0.09f, -0.26f, -0.12f, -0.38f)
                reflectiveCurveToRelative(-0.05f, -0.24f, -0.06f, -0.36f)
                curveTo(9.88f, 22.0f, 9.87f, 21.9f, 9.87f, 21.82f)
                reflectiveCurveToRelative(0.0f, -0.16f, 0.0f, -0.23f)
                reflectiveCurveToRelative(0.01f, -0.12f, 0.01f, -0.13f)
                curveToRelative(0.0f, -0.18f, 0.08f, -0.34f, 0.23f, -0.47f)
                curveToRelative(0.16f, -0.13f, 0.34f, -0.18f, 0.55f, -0.14f)
                curveToRelative(0.18f, 0.0f, 0.32f, 0.08f, 0.44f, 0.23f)
                reflectiveCurveToRelative(0.18f, 0.34f, 0.18f, 0.56f)
                curveToRelative(-0.06f, 0.41f, 0.02f, 0.76f, 0.25f, 1.05f)
                curveToRelative(0.21f, 0.29f, 0.65f, 0.44f, 1.32f, 0.44f)
                curveToRelative(0.52f, 0.0f, 0.9f, -0.12f, 1.13f, -0.36f)
                curveToRelative(0.13f, -0.13f, 0.23f, -0.29f, 0.29f, -0.48f)
                curveToRelative(0.06f, -0.19f, 0.09f, -0.34f, 0.08f, -0.47f)
                lineToRelative(-0.01f, -0.19f)
                verticalLineToRelative(-7.36f)
                curveToRelative(-0.73f, 0.18f, -1.38f, 0.56f, -1.93f, 1.14f)
                curveToRelative(-0.04f, 0.08f, -0.12f, 0.16f, -0.23f, 0.23f)
                reflectiveCurveToRelative(-0.21f, 0.11f, -0.3f, 0.11f)
                curveToRelative(-0.18f, 0.0f, -0.38f, -0.11f, -0.6f, -0.34f)
                curveToRelative(-0.8f, -0.89f, -1.65f, -1.33f, -2.55f, -1.31f)
                curveToRelative(-0.4f, 0.01f, -0.78f, 0.07f, -1.12f, 0.2f)
                curveTo(7.26f, 14.43f, 7.0f, 14.56f, 6.82f, 14.69f)
                curveToRelative(-0.17f, 0.13f, -0.36f, 0.28f, -0.54f, 0.45f)
                reflectiveCurveToRelative(-0.29f, 0.27f, -0.32f, 0.29f)
                curveToRelative(-0.21f, 0.14f, -0.38f, 0.22f, -0.51f, 0.22f)
                reflectiveCurveToRelative(-0.3f, -0.06f, -0.48f, -0.17f)
                curveToRelative(-0.16f, -0.1f, -0.26f, -0.21f, -0.3f, -0.32f)
                curveTo(4.64f, 15.04f, 4.63f, 14.87f, 4.64f, 14.65f)
                close()
                moveTo(6.73f, 13.23f)
                curveToRelative(0.68f, -0.36f, 1.32f, -0.53f, 1.92f, -0.53f)
                horizontalLineToRelative(0.08f)
                curveToRelative(1.15f, 0.0f, 2.2f, 0.44f, 3.15f, 1.33f)
                curveToRelative(0.38f, -0.33f, 0.84f, -0.62f, 1.39f, -0.88f)
                curveToRelative(0.54f, -0.26f, 1.13f, -0.41f, 1.77f, -0.45f)
                horizontalLineToRelative(0.08f)
                curveToRelative(1.15f, 0.0f, 2.2f, 0.44f, 3.15f, 1.33f)
                curveToRelative(0.38f, -0.33f, 0.84f, -0.62f, 1.39f, -0.88f)
                curveToRelative(0.54f, -0.26f, 1.13f, -0.41f, 1.77f, -0.45f)
                horizontalLineToRelative(0.09f)
                curveToRelative(0.56f, 0.0f, 1.15f, 0.15f, 1.75f, 0.44f)
                curveToRelative(-0.44f, -0.86f, -0.74f, -1.41f, -0.88f, -1.66f)
                curveToRelative(-1.79f, -2.34f, -4.27f, -3.51f, -7.43f, -3.51f)
                curveToRelative(-1.58f, 0.0f, -2.99f, 0.3f, -4.24f, 0.9f)
                curveToRelative(-1.24f, 0.6f, -2.26f, 1.47f, -3.05f, 2.61f)
                curveTo(7.44f, 11.82f, 7.12f, 12.41f, 6.73f, 13.23f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
