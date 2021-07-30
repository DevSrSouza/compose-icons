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

public val WeatherIcons.Celsius: ImageVector
    get() {
        if (_celsius != null) {
            return _celsius!!
        }
        _celsius = Builder(name = "Celsius", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 10.98f)
                curveToRelative(0.0f, -0.5f, 0.18f, -0.93f, 0.53f, -1.28f)
                curveToRelative(0.36f, -0.36f, 0.78f, -0.53f, 1.28f, -0.53f)
                curveToRelative(0.49f, 0.0f, 0.92f, 0.18f, 1.27f, 0.53f)
                curveToRelative(0.35f, 0.36f, 0.53f, 0.78f, 0.53f, 1.28f)
                curveToRelative(0.0f, 0.5f, -0.18f, 0.93f, -0.53f, 1.28f)
                curveToRelative(-0.35f, 0.36f, -0.78f, 0.53f, -1.27f, 0.53f)
                curveToRelative(-0.5f, 0.0f, -0.93f, -0.18f, -1.28f, -0.53f)
                reflectiveCurveTo(9.75f, 11.48f, 9.75f, 10.98f)
                close()
                moveTo(10.63f, 10.98f)
                curveToRelative(0.0f, 0.26f, 0.09f, 0.48f, 0.27f, 0.67f)
                curveToRelative(0.19f, 0.19f, 0.41f, 0.28f, 0.67f, 0.28f)
                curveToRelative(0.26f, 0.0f, 0.48f, -0.09f, 0.67f, -0.28f)
                reflectiveCurveToRelative(0.28f, -0.41f, 0.28f, -0.67f)
                curveToRelative(0.0f, -0.26f, -0.09f, -0.48f, -0.28f, -0.67f)
                reflectiveCurveToRelative(-0.41f, -0.28f, -0.67f, -0.28f)
                curveToRelative(-0.26f, 0.0f, -0.48f, 0.09f, -0.67f, 0.28f)
                curveTo(10.72f, 10.49f, 10.63f, 10.72f, 10.63f, 10.98f)
                close()
                moveTo(14.52f, 15.4f)
                curveToRelative(0.0f, 0.77f, 0.21f, 1.45f, 0.64f, 2.05f)
                curveToRelative(0.22f, 0.31f, 0.53f, 0.56f, 0.93f, 0.75f)
                curveToRelative(0.39f, 0.18f, 0.84f, 0.28f, 1.34f, 0.28f)
                curveToRelative(1.46f, 0.0f, 2.38f, -0.56f, 2.75f, -1.67f)
                curveToRelative(0.04f, -0.14f, 0.02f, -0.28f, -0.06f, -0.41f)
                curveToRelative(-0.08f, -0.13f, -0.19f, -0.2f, -0.33f, -0.23f)
                curveToRelative(-0.14f, -0.04f, -0.28f, -0.02f, -0.4f, 0.07f)
                curveToRelative(-0.12f, 0.08f, -0.2f, 0.19f, -0.23f, 0.34f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, -0.01f, 0.05f)
                lineToRelative(-0.02f, 0.07f)
                curveToRelative(-0.11f, 0.19f, -0.26f, 0.34f, -0.45f, 0.45f)
                curveToRelative(-0.31f, 0.19f, -0.72f, 0.28f, -1.23f, 0.28f)
                curveToRelative(-0.31f, 0.0f, -0.59f, -0.05f, -0.83f, -0.16f)
                curveToRelative(-0.4f, -0.17f, -0.68f, -0.47f, -0.85f, -0.89f)
                curveToRelative(-0.11f, -0.27f, -0.17f, -0.6f, -0.17f, -0.97f)
                verticalLineToRelative(-3.22f)
                curveToRelative(0.0f, -0.15f, 0.01f, -0.3f, 0.03f, -0.45f)
                curveToRelative(0.04f, -0.38f, 0.19f, -0.73f, 0.45f, -1.04f)
                curveToRelative(0.29f, -0.35f, 0.75f, -0.52f, 1.38f, -0.52f)
                curveToRelative(0.52f, 0.0f, 0.93f, 0.09f, 1.23f, 0.27f)
                curveToRelative(0.2f, 0.12f, 0.35f, 0.27f, 0.45f, 0.45f)
                curveToRelative(0.01f, 0.02f, 0.01f, 0.05f, 0.02f, 0.08f)
                curveToRelative(0.01f, 0.03f, 0.01f, 0.05f, 0.01f, 0.06f)
                curveToRelative(0.04f, 0.14f, 0.12f, 0.24f, 0.23f, 0.3f)
                curveToRelative(0.12f, 0.07f, 0.25f, 0.08f, 0.4f, 0.05f)
                curveToRelative(0.14f, -0.03f, 0.25f, -0.11f, 0.33f, -0.23f)
                curveToRelative(0.08f, -0.12f, 0.1f, -0.25f, 0.06f, -0.4f)
                verticalLineToRelative(-0.01f)
                lineToRelative(-0.08f, -0.23f)
                curveToRelative(-0.05f, -0.11f, -0.14f, -0.26f, -0.28f, -0.43f)
                curveToRelative(-0.13f, -0.18f, -0.29f, -0.32f, -0.45f, -0.44f)
                curveToRelative(-0.21f, -0.15f, -0.48f, -0.27f, -0.82f, -0.38f)
                curveToRelative(-0.34f, -0.1f, -0.71f, -0.15f, -1.11f, -0.15f)
                curveToRelative(-0.51f, 0.0f, -0.95f, 0.09f, -1.35f, 0.27f)
                curveToRelative(-0.39f, 0.18f, -0.7f, 0.42f, -0.91f, 0.73f)
                curveToRelative(-0.43f, 0.59f, -0.65f, 1.28f, -0.65f, 2.07f)
                verticalLineTo(15.4f)
                close()
            }
        }
        .build()
        return _celsius!!
    }

private var _celsius: ImageVector? = null
