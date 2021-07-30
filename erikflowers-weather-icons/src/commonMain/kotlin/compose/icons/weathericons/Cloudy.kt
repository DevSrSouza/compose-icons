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

public val WeatherIcons.Cloudy: ImageVector
    get() {
        if (_cloudy != null) {
            return _cloudy!!
        }
        _cloudy = Builder(name = "Cloudy", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.89f, 17.6f)
                curveToRelative(0.0f, -0.99f, 0.31f, -1.88f, 0.93f, -2.65f)
                reflectiveCurveToRelative(1.41f, -1.27f, 2.38f, -1.49f)
                curveToRelative(0.26f, -1.17f, 0.85f, -2.14f, 1.78f, -2.88f)
                curveToRelative(0.93f, -0.75f, 2.0f, -1.12f, 3.22f, -1.12f)
                curveToRelative(1.18f, 0.0f, 2.24f, 0.36f, 3.16f, 1.09f)
                curveToRelative(0.93f, 0.73f, 1.53f, 1.66f, 1.8f, 2.8f)
                horizontalLineToRelative(0.27f)
                curveToRelative(1.18f, 0.0f, 2.18f, 0.41f, 3.01f, 1.24f)
                reflectiveCurveToRelative(1.25f, 1.83f, 1.25f, 3.0f)
                curveToRelative(0.0f, 1.18f, -0.42f, 2.18f, -1.25f, 3.01f)
                reflectiveCurveToRelative(-1.83f, 1.25f, -3.01f, 1.25f)
                horizontalLineTo(8.16f)
                curveToRelative(-0.58f, 0.0f, -1.13f, -0.11f, -1.65f, -0.34f)
                reflectiveCurveTo(5.52f, 21.0f, 5.14f, 20.62f)
                curveToRelative(-0.38f, -0.38f, -0.68f, -0.84f, -0.91f, -1.36f)
                reflectiveCurveTo(3.89f, 18.17f, 3.89f, 17.6f)
                close()
                moveTo(5.34f, 17.6f)
                curveToRelative(0.0f, 0.76f, 0.28f, 1.42f, 0.82f, 1.96f)
                reflectiveCurveToRelative(1.21f, 0.82f, 1.99f, 0.82f)
                horizontalLineToRelative(9.28f)
                curveToRelative(0.77f, 0.0f, 1.44f, -0.27f, 1.99f, -0.82f)
                curveToRelative(0.55f, -0.55f, 0.83f, -1.2f, 0.83f, -1.96f)
                curveToRelative(0.0f, -0.76f, -0.27f, -1.42f, -0.83f, -1.96f)
                curveToRelative(-0.55f, -0.54f, -1.21f, -0.82f, -1.99f, -0.82f)
                horizontalLineToRelative(-1.39f)
                curveToRelative(-0.1f, 0.0f, -0.15f, -0.05f, -0.15f, -0.15f)
                lineToRelative(-0.07f, -0.49f)
                curveToRelative(-0.1f, -0.94f, -0.5f, -1.73f, -1.19f, -2.35f)
                reflectiveCurveToRelative(-1.51f, -0.93f, -2.45f, -0.93f)
                curveToRelative(-0.94f, 0.0f, -1.76f, 0.31f, -2.46f, 0.94f)
                curveToRelative(-0.7f, 0.62f, -1.09f, 1.41f, -1.18f, 2.34f)
                lineToRelative(-0.07f, 0.42f)
                curveToRelative(0.0f, 0.1f, -0.05f, 0.15f, -0.16f, 0.15f)
                lineToRelative(-0.45f, 0.07f)
                curveToRelative(-0.72f, 0.06f, -1.32f, 0.36f, -1.81f, 0.89f)
                curveTo(5.59f, 16.24f, 5.34f, 16.87f, 5.34f, 17.6f)
                close()
                moveTo(14.19f, 8.88f)
                curveToRelative(-0.1f, 0.09f, -0.08f, 0.16f, 0.07f, 0.21f)
                curveToRelative(0.43f, 0.19f, 0.79f, 0.37f, 1.08f, 0.55f)
                curveToRelative(0.11f, 0.03f, 0.19f, 0.02f, 0.22f, -0.03f)
                curveToRelative(0.61f, -0.57f, 1.31f, -0.86f, 2.12f, -0.86f)
                curveToRelative(0.81f, 0.0f, 1.5f, 0.27f, 2.1f, 0.81f)
                curveToRelative(0.59f, 0.54f, 0.92f, 1.21f, 0.99f, 2.0f)
                lineToRelative(0.09f, 0.64f)
                horizontalLineToRelative(1.42f)
                curveToRelative(0.65f, 0.0f, 1.21f, 0.23f, 1.68f, 0.7f)
                curveToRelative(0.47f, 0.47f, 0.7f, 1.02f, 0.7f, 1.66f)
                curveToRelative(0.0f, 0.6f, -0.21f, 1.12f, -0.62f, 1.57f)
                reflectiveCurveToRelative(-0.92f, 0.7f, -1.53f, 0.77f)
                curveToRelative(-0.1f, 0.0f, -0.15f, 0.05f, -0.15f, 0.16f)
                verticalLineToRelative(1.13f)
                curveToRelative(0.0f, 0.11f, 0.05f, 0.16f, 0.15f, 0.16f)
                curveToRelative(1.01f, -0.06f, 1.86f, -0.46f, 2.55f, -1.19f)
                reflectiveCurveToRelative(1.04f, -1.6f, 1.04f, -2.6f)
                curveToRelative(0.0f, -1.06f, -0.37f, -1.96f, -1.12f, -2.7f)
                curveToRelative(-0.75f, -0.75f, -1.65f, -1.12f, -2.7f, -1.12f)
                horizontalLineToRelative(-0.15f)
                curveToRelative(-0.26f, -1.0f, -0.81f, -1.82f, -1.65f, -2.47f)
                curveToRelative(-0.83f, -0.65f, -1.77f, -0.97f, -2.8f, -0.97f)
                curveTo(16.28f, 7.29f, 15.11f, 7.82f, 14.19f, 8.88f)
                close()
            }
        }
        .build()
        return _cloudy!!
    }

private var _cloudy: ImageVector? = null
