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

public val WeatherIcons.Humidity: ImageVector
    get() {
        if (_humidity != null) {
            return _humidity!!
        }
        _humidity = Builder(name = "Humidity", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.56f, 17.19f)
                curveToRelative(0.0f, -0.88f, 0.24f, -1.89f, 0.72f, -3.03f)
                reflectiveCurveToRelative(1.1f, -2.25f, 1.86f, -3.31f)
                curveToRelative(1.56f, -2.06f, 2.92f, -3.62f, 4.06f, -4.67f)
                lineToRelative(0.75f, -0.72f)
                curveToRelative(0.25f, 0.26f, 0.53f, 0.5f, 0.83f, 0.72f)
                curveToRelative(0.41f, 0.42f, 1.04f, 1.11f, 1.88f, 2.09f)
                reflectiveCurveToRelative(1.57f, 1.85f, 2.17f, 2.65f)
                curveToRelative(0.71f, 1.01f, 1.32f, 2.1f, 1.81f, 3.25f)
                reflectiveCurveToRelative(0.74f, 2.16f, 0.74f, 3.03f)
                curveToRelative(0.0f, 1.0f, -0.19f, 1.95f, -0.58f, 2.86f)
                curveToRelative(-0.39f, 0.91f, -0.91f, 1.7f, -1.57f, 2.36f)
                curveToRelative(-0.66f, 0.66f, -1.45f, 1.19f, -2.37f, 1.58f)
                curveToRelative(-0.92f, 0.39f, -1.89f, 0.59f, -2.91f, 0.59f)
                curveToRelative(-1.0f, 0.0f, -1.95f, -0.19f, -2.86f, -0.57f)
                curveToRelative(-0.91f, -0.38f, -1.7f, -0.89f, -2.36f, -1.55f)
                curveToRelative(-0.66f, -0.65f, -1.19f, -1.44f, -1.58f, -2.35f)
                reflectiveCurveTo(7.56f, 18.23f, 7.56f, 17.19f)
                close()
                moveTo(9.82f, 14.26f)
                curveToRelative(0.0f, 0.83f, 0.17f, 1.49f, 0.52f, 1.99f)
                curveToRelative(0.35f, 0.49f, 0.88f, 0.74f, 1.59f, 0.74f)
                curveToRelative(0.72f, 0.0f, 1.25f, -0.25f, 1.61f, -0.74f)
                curveToRelative(0.35f, -0.49f, 0.53f, -1.15f, 0.54f, -1.99f)
                curveToRelative(-0.01f, -0.84f, -0.19f, -1.5f, -0.54f, -2.0f)
                curveToRelative(-0.35f, -0.49f, -0.89f, -0.74f, -1.61f, -0.74f)
                curveToRelative(-0.71f, 0.0f, -1.24f, 0.25f, -1.59f, 0.74f)
                curveTo(9.99f, 12.76f, 9.82f, 13.42f, 9.82f, 14.26f)
                close()
                moveTo(11.39f, 14.26f)
                curveToRelative(0.0f, -0.15f, 0.0f, -0.27f, 0.0f, -0.35f)
                reflectiveCurveToRelative(0.01f, -0.19f, 0.02f, -0.33f)
                curveToRelative(0.01f, -0.14f, 0.02f, -0.25f, 0.05f, -0.32f)
                reflectiveCurveToRelative(0.05f, -0.16f, 0.09f, -0.24f)
                curveToRelative(0.04f, -0.08f, 0.09f, -0.15f, 0.15f, -0.18f)
                curveToRelative(0.07f, -0.04f, 0.14f, -0.06f, 0.23f, -0.06f)
                curveToRelative(0.14f, 0.0f, 0.25f, 0.04f, 0.33f, 0.12f)
                reflectiveCurveToRelative(0.14f, 0.21f, 0.17f, 0.38f)
                curveToRelative(0.03f, 0.18f, 0.05f, 0.32f, 0.06f, 0.45f)
                reflectiveCurveToRelative(0.01f, 0.3f, 0.01f, 0.52f)
                curveToRelative(0.0f, 0.23f, 0.0f, 0.4f, -0.01f, 0.52f)
                curveToRelative(-0.01f, 0.12f, -0.03f, 0.27f, -0.06f, 0.45f)
                curveToRelative(-0.03f, 0.17f, -0.09f, 0.3f, -0.17f, 0.38f)
                reflectiveCurveToRelative(-0.19f, 0.12f, -0.33f, 0.12f)
                curveToRelative(-0.09f, 0.0f, -0.16f, -0.02f, -0.23f, -0.06f)
                curveToRelative(-0.07f, -0.04f, -0.12f, -0.1f, -0.15f, -0.18f)
                curveToRelative(-0.04f, -0.08f, -0.07f, -0.17f, -0.09f, -0.24f)
                curveToRelative(-0.02f, -0.08f, -0.04f, -0.19f, -0.05f, -0.32f)
                curveToRelative(-0.01f, -0.14f, -0.02f, -0.25f, -0.02f, -0.32f)
                reflectiveCurveTo(11.39f, 14.41f, 11.39f, 14.26f)
                close()
                moveTo(11.98f, 22.01f)
                horizontalLineToRelative(1.32f)
                lineToRelative(4.99f, -10.74f)
                horizontalLineToRelative(-1.35f)
                lineTo(11.98f, 22.01f)
                close()
                moveTo(16.28f, 19.02f)
                curveToRelative(0.01f, 0.84f, 0.2f, 1.5f, 0.55f, 2.0f)
                curveToRelative(0.35f, 0.49f, 0.89f, 0.74f, 1.6f, 0.74f)
                curveToRelative(0.72f, 0.0f, 1.25f, -0.25f, 1.6f, -0.74f)
                curveToRelative(0.35f, -0.49f, 0.52f, -1.16f, 0.53f, -2.0f)
                curveToRelative(-0.01f, -0.84f, -0.18f, -1.5f, -0.53f, -1.99f)
                curveToRelative(-0.35f, -0.49f, -0.88f, -0.74f, -1.6f, -0.74f)
                curveToRelative(-0.71f, 0.0f, -1.25f, 0.25f, -1.6f, 0.74f)
                curveTo(16.47f, 17.52f, 16.29f, 18.18f, 16.28f, 19.02f)
                close()
                moveTo(17.85f, 19.02f)
                curveToRelative(0.0f, -0.23f, 0.0f, -0.4f, 0.01f, -0.52f)
                curveToRelative(0.01f, -0.12f, 0.03f, -0.27f, 0.06f, -0.45f)
                reflectiveCurveToRelative(0.09f, -0.3f, 0.17f, -0.38f)
                reflectiveCurveToRelative(0.19f, -0.12f, 0.33f, -0.12f)
                curveToRelative(0.09f, 0.0f, 0.17f, 0.02f, 0.24f, 0.06f)
                curveToRelative(0.07f, 0.04f, 0.12f, 0.1f, 0.16f, 0.19f)
                curveToRelative(0.04f, 0.09f, 0.07f, 0.17f, 0.1f, 0.24f)
                reflectiveCurveToRelative(0.04f, 0.18f, 0.05f, 0.32f)
                lineToRelative(0.01f, 0.32f)
                lineToRelative(0.0f, 0.34f)
                curveToRelative(0.0f, 0.16f, 0.0f, 0.28f, 0.0f, 0.35f)
                lineToRelative(-0.01f, 0.32f)
                lineToRelative(-0.05f, 0.32f)
                lineToRelative(-0.1f, 0.24f)
                lineToRelative(-0.16f, 0.19f)
                lineToRelative(-0.24f, 0.06f)
                curveToRelative(-0.14f, 0.0f, -0.25f, -0.04f, -0.33f, -0.12f)
                reflectiveCurveToRelative(-0.14f, -0.21f, -0.17f, -0.38f)
                curveToRelative(-0.03f, -0.18f, -0.05f, -0.33f, -0.06f, -0.45f)
                reflectiveCurveTo(17.85f, 19.25f, 17.85f, 19.02f)
                close()
            }
        }
        .build()
        return _humidity!!
    }

private var _humidity: ImageVector? = null
