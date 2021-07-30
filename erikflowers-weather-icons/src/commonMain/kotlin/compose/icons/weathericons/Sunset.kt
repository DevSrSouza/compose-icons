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

public val WeatherIcons.Sunset: ImageVector
    get() {
        if (_sunset != null) {
            return _sunset!!
        }
        _sunset = Builder(name = "Sunset", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.88f, 15.47f)
                curveToRelative(0.0f, -0.28f, 0.1f, -0.5f, 0.3f, -0.68f)
                curveToRelative(0.17f, -0.18f, 0.4f, -0.26f, 0.68f, -0.26f)
                horizontalLineToRelative(2.31f)
                curveToRelative(0.27f, 0.0f, 0.49f, 0.09f, 0.67f, 0.27f)
                curveToRelative(0.17f, 0.18f, 0.26f, 0.4f, 0.26f, 0.67f)
                curveToRelative(0.0f, 0.28f, -0.09f, 0.52f, -0.27f, 0.71f)
                curveToRelative(-0.18f, 0.19f, -0.4f, 0.29f, -0.66f, 0.29f)
                horizontalLineTo(3.87f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.69f, -0.3f)
                curveTo(2.98f, 15.97f, 2.88f, 15.74f, 2.88f, 15.47f)
                close()
                moveTo(6.17f, 7.61f)
                curveToRelative(0.0f, -0.28f, 0.08f, -0.51f, 0.25f, -0.68f)
                curveToRelative(0.2f, -0.2f, 0.43f, -0.3f, 0.7f, -0.3f)
                curveToRelative(0.29f, 0.0f, 0.51f, 0.1f, 0.68f, 0.3f)
                lineToRelative(1.62f, 1.63f)
                curveToRelative(0.46f, 0.44f, 0.46f, 0.89f, 0.0f, 1.35f)
                curveToRelative(-0.19f, 0.19f, -0.4f, 0.28f, -0.65f, 0.28f)
                curveToRelative(-0.22f, 0.0f, -0.44f, -0.09f, -0.68f, -0.28f)
                lineTo(6.43f, 8.29f)
                curveTo(6.26f, 8.11f, 6.17f, 7.88f, 6.17f, 7.61f)
                close()
                moveTo(8.14f, 20.89f)
                curveToRelative(0.0f, -0.26f, 0.1f, -0.49f, 0.3f, -0.69f)
                curveToRelative(0.18f, -0.18f, 0.41f, -0.27f, 0.68f, -0.27f)
                horizontalLineToRelative(3.22f)
                curveToRelative(0.11f, 0.0f, 0.2f, 0.02f, 0.28f, 0.08f)
                lineToRelative(2.35f, 2.22f)
                lineTo(17.36f, 20.0f)
                curveToRelative(0.07f, -0.05f, 0.17f, -0.08f, 0.29f, -0.08f)
                horizontalLineToRelative(3.3f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.09f, 0.69f, 0.28f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.42f, 0.29f, 0.68f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.69f, 0.29f)
                horizontalLineToRelative(-2.68f)
                lineToRelative(-3.14f, 2.84f)
                curveToRelative(-0.12f, 0.09f, -0.23f, 0.09f, -0.33f, 0.0f)
                lineToRelative(-3.08f, -2.84f)
                horizontalLineToRelative(-2.6f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.69f, -0.29f)
                curveTo(8.24f, 21.39f, 8.14f, 21.16f, 8.14f, 20.89f)
                close()
                moveTo(9.08f, 15.47f)
                curveToRelative(0.0f, 0.99f, 0.19f, 1.87f, 0.58f, 2.62f)
                curveToRelative(0.06f, 0.11f, 0.15f, 0.16f, 0.27f, 0.16f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.08f, 0.0f, 0.13f, -0.02f, 0.15f, -0.07f)
                curveToRelative(0.02f, -0.05f, -0.01f, -0.11f, -0.07f, -0.18f)
                curveToRelative(-0.59f, -0.74f, -0.89f, -1.59f, -0.89f, -2.53f)
                curveToRelative(0.0f, -1.1f, 0.39f, -2.04f, 1.18f, -2.81f)
                curveToRelative(0.79f, -0.77f, 1.74f, -1.16f, 2.85f, -1.16f)
                curveToRelative(1.1f, 0.0f, 2.04f, 0.39f, 2.83f, 1.16f)
                curveToRelative(0.78f, 0.78f, 1.18f, 1.71f, 1.18f, 2.8f)
                curveToRelative(0.0f, 0.94f, -0.3f, 1.79f, -0.89f, 2.53f)
                curveToRelative(-0.07f, 0.07f, -0.09f, 0.13f, -0.07f, 0.18f)
                curveToRelative(0.02f, 0.05f, 0.07f, 0.07f, 0.15f, 0.07f)
                horizontalLineToRelative(1.88f)
                curveToRelative(0.13f, 0.0f, 0.21f, -0.05f, 0.24f, -0.16f)
                curveToRelative(0.41f, -0.78f, 0.62f, -1.66f, 0.62f, -2.62f)
                curveToRelative(0.0f, -0.79f, -0.16f, -1.56f, -0.47f, -2.29f)
                reflectiveCurveToRelative(-0.74f, -1.37f, -1.27f, -1.9f)
                reflectiveCurveToRelative(-1.16f, -0.95f, -1.89f, -1.27f)
                curveToRelative(-0.73f, -0.32f, -1.5f, -0.47f, -2.3f, -0.47f)
                curveToRelative(-0.8f, 0.0f, -1.57f, 0.16f, -2.3f, 0.47f)
                curveToRelative(-0.73f, 0.32f, -1.36f, 0.74f, -1.89f, 1.27f)
                reflectiveCurveToRelative(-0.95f, 1.16f, -1.27f, 1.9f)
                reflectiveCurveTo(9.08f, 14.68f, 9.08f, 15.47f)
                close()
                moveTo(14.04f, 6.66f)
                verticalLineTo(4.33f)
                curveToRelative(0.0f, -0.27f, 0.1f, -0.5f, 0.29f, -0.69f)
                reflectiveCurveToRelative(0.42f, -0.29f, 0.69f, -0.29f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.1f, 0.69f, 0.29f)
                reflectiveCurveToRelative(0.29f, 0.42f, 0.29f, 0.69f)
                verticalLineToRelative(2.32f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.42f, 0.29f, -0.69f, 0.29f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.1f, -0.69f, -0.29f)
                curveTo(14.13f, 7.15f, 14.04f, 6.93f, 14.04f, 6.66f)
                close()
                moveTo(20.31f, 9.24f)
                curveToRelative(0.0f, -0.28f, 0.09f, -0.51f, 0.26f, -0.67f)
                lineToRelative(1.63f, -1.63f)
                curveToRelative(0.16f, -0.2f, 0.39f, -0.3f, 0.68f, -0.3f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.1f, 0.68f, 0.29f)
                curveToRelative(0.18f, 0.19f, 0.27f, 0.42f, 0.27f, 0.69f)
                curveToRelative(0.0f, 0.28f, -0.08f, 0.51f, -0.25f, 0.68f)
                lineToRelative(-1.66f, 1.63f)
                curveToRelative(-0.23f, 0.19f, -0.46f, 0.28f, -0.69f, 0.28f)
                curveToRelative(-0.26f, 0.0f, -0.48f, -0.09f, -0.66f, -0.28f)
                curveTo(20.4f, 9.74f, 20.31f, 9.51f, 20.31f, 9.24f)
                close()
                moveTo(22.9f, 15.47f)
                curveToRelative(0.0f, -0.27f, 0.09f, -0.49f, 0.26f, -0.67f)
                curveToRelative(0.17f, -0.18f, 0.4f, -0.27f, 0.67f, -0.27f)
                horizontalLineToRelative(2.32f)
                curveToRelative(0.27f, 0.0f, 0.5f, 0.09f, 0.69f, 0.27f)
                curveToRelative(0.19f, 0.18f, 0.29f, 0.4f, 0.29f, 0.67f)
                curveToRelative(0.0f, 0.27f, -0.1f, 0.5f, -0.29f, 0.7f)
                curveToRelative(-0.19f, 0.2f, -0.42f, 0.3f, -0.69f, 0.3f)
                horizontalLineToRelative(-2.32f)
                curveToRelative(-0.26f, 0.0f, -0.48f, -0.1f, -0.66f, -0.29f)
                curveTo(22.99f, 15.99f, 22.9f, 15.75f, 22.9f, 15.47f)
                close()
            }
        }
        .build()
        return _sunset!!
    }

private var _sunset: ImageVector? = null
