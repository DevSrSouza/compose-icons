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

public val WeatherIcons.Sunrise: ImageVector
    get() {
        if (_sunrise != null) {
            return _sunrise!!
        }
        _sunrise = Builder(name = "Sunrise", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 15.36f)
                curveToRelative(0.0f, -0.25f, 0.1f, -0.48f, 0.3f, -0.69f)
                curveToRelative(0.22f, -0.19f, 0.46f, -0.29f, 0.7f, -0.29f)
                horizontalLineToRelative(2.33f)
                curveToRelative(0.27f, 0.0f, 0.49f, 0.1f, 0.67f, 0.29f)
                curveToRelative(0.18f, 0.19f, 0.27f, 0.43f, 0.27f, 0.69f)
                curveToRelative(0.0f, 0.29f, -0.09f, 0.53f, -0.27f, 0.72f)
                curveToRelative(-0.18f, 0.19f, -0.41f, 0.29f, -0.67f, 0.29f)
                horizontalLineTo(3.75f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.7f, -0.3f)
                curveTo(2.85f, 15.86f, 2.75f, 15.62f, 2.75f, 15.36f)
                close()
                moveTo(6.08f, 7.38f)
                curveToRelative(0.0f, -0.27f, 0.09f, -0.5f, 0.26f, -0.68f)
                curveTo(6.57f, 6.5f, 6.8f, 6.4f, 7.05f, 6.4f)
                curveToRelative(0.26f, 0.0f, 0.49f, 0.1f, 0.68f, 0.29f)
                lineToRelative(1.64f, 1.65f)
                curveToRelative(0.19f, 0.22f, 0.28f, 0.45f, 0.28f, 0.69f)
                curveToRelative(0.0f, 0.28f, -0.09f, 0.52f, -0.27f, 0.7f)
                reflectiveCurveToRelative(-0.4f, 0.28f, -0.66f, 0.28f)
                curveToRelative(-0.24f, 0.0f, -0.48f, -0.1f, -0.7f, -0.29f)
                lineTo(6.34f, 8.11f)
                curveTo(6.17f, 7.9f, 6.08f, 7.65f, 6.08f, 7.38f)
                close()
                moveTo(8.08f, 20.88f)
                curveToRelative(0.0f, -0.28f, 0.1f, -0.51f, 0.29f, -0.68f)
                curveToRelative(0.18f, -0.17f, 0.4f, -0.26f, 0.68f, -0.26f)
                horizontalLineToRelative(2.63f)
                lineToRelative(3.11f, -2.92f)
                curveToRelative(0.1f, -0.08f, 0.21f, -0.08f, 0.34f, 0.0f)
                lineToRelative(3.16f, 2.92f)
                horizontalLineToRelative(2.77f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.09f, 0.69f, 0.28f)
                curveToRelative(0.19f, 0.18f, 0.29f, 0.41f, 0.29f, 0.67f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.69f, 0.29f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(-0.1f, 0.0f, -0.2f, -0.02f, -0.29f, -0.07f)
                lineToRelative(-2.41f, -2.27f)
                lineToRelative(-2.39f, 2.27f)
                curveToRelative(-0.08f, 0.05f, -0.17f, 0.07f, -0.28f, 0.07f)
                horizontalLineTo(9.05f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.69f, -0.29f)
                curveTo(8.17f, 21.38f, 8.08f, 21.15f, 8.08f, 20.88f)
                close()
                moveTo(9.0f, 15.36f)
                curveToRelative(0.0f, 0.97f, 0.21f, 1.85f, 0.62f, 2.64f)
                curveToRelative(0.02f, 0.12f, 0.11f, 0.18f, 0.25f, 0.18f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.07f, 0.0f, 0.12f, -0.03f, 0.15f, -0.08f)
                curveToRelative(0.03f, -0.06f, 0.02f, -0.12f, -0.02f, -0.19f)
                curveToRelative(-0.64f, -0.77f, -0.96f, -1.62f, -0.96f, -2.55f)
                curveToRelative(0.0f, -1.12f, 0.4f, -2.08f, 1.2f, -2.87f)
                curveToRelative(0.8f, -0.79f, 1.76f, -1.18f, 2.89f, -1.18f)
                curveToRelative(1.12f, 0.0f, 2.07f, 0.39f, 2.86f, 1.18f)
                curveToRelative(0.79f, 0.79f, 1.19f, 1.74f, 1.19f, 2.87f)
                curveToRelative(0.0f, 0.94f, -0.32f, 1.79f, -0.95f, 2.55f)
                curveToRelative(-0.04f, 0.07f, -0.05f, 0.13f, -0.03f, 0.19f)
                reflectiveCurveToRelative(0.07f, 0.08f, 0.15f, 0.08f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.13f, 0.0f, 0.21f, -0.06f, 0.23f, -0.18f)
                curveTo(20.8f, 17.23f, 21.0f, 16.35f, 21.0f, 15.36f)
                curveToRelative(0.0f, -0.81f, -0.16f, -1.59f, -0.48f, -2.32f)
                curveToRelative(-0.32f, -0.74f, -0.75f, -1.37f, -1.28f, -1.91f)
                curveToRelative(-0.53f, -0.53f, -1.17f, -0.96f, -1.91f, -1.28f)
                curveToRelative(-0.74f, -0.32f, -1.51f, -0.47f, -2.32f, -0.47f)
                curveToRelative(-0.81f, 0.0f, -1.59f, 0.16f, -2.33f, 0.47f)
                curveToRelative(-0.74f, 0.32f, -1.38f, 0.74f, -1.92f, 1.28f)
                curveToRelative(-0.54f, 0.53f, -0.97f, 1.17f, -1.29f, 1.91f)
                curveTo(9.16f, 13.77f, 9.0f, 14.54f, 9.0f, 15.36f)
                close()
                moveTo(14.03f, 6.4f)
                verticalLineToRelative(-2.3f)
                curveToRelative(0.0f, -0.29f, 0.09f, -0.52f, 0.28f, -0.71f)
                reflectiveCurveToRelative(0.43f, -0.28f, 0.71f, -0.28f)
                curveToRelative(0.28f, 0.0f, 0.51f, 0.09f, 0.7f, 0.28f)
                reflectiveCurveTo(16.0f, 3.83f, 16.0f, 4.11f)
                verticalLineToRelative(2.3f)
                curveToRelative(0.0f, 0.29f, -0.09f, 0.52f, -0.28f, 0.71f)
                curveToRelative(-0.18f, 0.18f, -0.42f, 0.28f, -0.7f, 0.28f)
                curveToRelative(-0.29f, 0.0f, -0.52f, -0.09f, -0.71f, -0.28f)
                curveTo(14.12f, 6.93f, 14.03f, 6.69f, 14.03f, 6.4f)
                close()
                moveTo(20.38f, 9.04f)
                curveToRelative(0.0f, -0.25f, 0.09f, -0.48f, 0.27f, -0.69f)
                lineToRelative(1.62f, -1.65f)
                curveToRelative(0.19f, -0.19f, 0.43f, -0.29f, 0.7f, -0.29f)
                curveToRelative(0.27f, 0.0f, 0.51f, 0.1f, 0.69f, 0.29f)
                curveToRelative(0.19f, 0.19f, 0.28f, 0.42f, 0.28f, 0.69f)
                curveToRelative(0.0f, 0.29f, -0.09f, 0.53f, -0.26f, 0.73f)
                lineTo(22.0f, 9.73f)
                curveToRelative(-0.21f, 0.19f, -0.45f, 0.29f, -0.7f, 0.29f)
                curveToRelative(-0.27f, 0.0f, -0.49f, -0.09f, -0.66f, -0.28f)
                reflectiveCurveTo(20.38f, 9.32f, 20.38f, 9.04f)
                close()
                moveTo(22.99f, 15.36f)
                curveToRelative(0.0f, -0.27f, 0.09f, -0.5f, 0.27f, -0.69f)
                curveToRelative(0.18f, -0.19f, 0.4f, -0.29f, 0.66f, -0.29f)
                horizontalLineToRelative(2.35f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.1f, 0.69f, 0.29f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.43f, 0.29f, 0.69f)
                curveToRelative(0.0f, 0.28f, -0.1f, 0.51f, -0.29f, 0.71f)
                reflectiveCurveToRelative(-0.42f, 0.3f, -0.69f, 0.3f)
                horizontalLineToRelative(-2.35f)
                curveToRelative(-0.27f, 0.0f, -0.49f, -0.1f, -0.67f, -0.29f)
                curveTo(23.08f, 15.88f, 22.99f, 15.64f, 22.99f, 15.36f)
                close()
            }
        }
        .build()
        return _sunrise!!
    }

private var _sunrise: ImageVector? = null
