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

public val WeatherIcons.NightAltCloudy: ImageVector
    get() {
        if (_nightAltCloudy != null) {
            return _nightAltCloudy!!
        }
        _nightAltCloudy = Builder(name = "NightAltCloudy", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.14f, 16.9f)
                curveToRelative(0.0f, -1.16f, 0.35f, -2.18f, 1.06f, -3.08f)
                reflectiveCurveToRelative(1.62f, -1.47f, 2.74f, -1.72f)
                curveToRelative(0.23f, -1.03f, 0.7f, -1.93f, 1.4f, -2.7f)
                curveToRelative(0.7f, -0.77f, 1.55f, -1.32f, 2.53f, -1.65f)
                curveToRelative(0.62f, -0.21f, 1.26f, -0.32f, 1.93f, -0.32f)
                curveToRelative(0.81f, 0.0f, 1.6f, 0.16f, 2.35f, 0.48f)
                curveToRelative(0.28f, -0.47f, 0.61f, -0.88f, 0.99f, -1.22f)
                curveToRelative(0.38f, -0.34f, 0.77f, -0.61f, 1.17f, -0.79f)
                curveToRelative(0.4f, -0.18f, 0.8f, -0.32f, 1.18f, -0.41f)
                reflectiveCurveToRelative(0.76f, -0.13f, 1.12f, -0.13f)
                curveToRelative(0.38f, 0.0f, 0.79f, 0.05f, 1.23f, 0.16f)
                lineToRelative(0.82f, 0.25f)
                curveToRelative(0.14f, 0.06f, 0.18f, 0.13f, 0.14f, 0.22f)
                lineToRelative(-0.14f, 0.6f)
                curveToRelative(-0.07f, 0.31f, -0.1f, 0.6f, -0.1f, 0.86f)
                curveToRelative(0.0f, 0.31f, 0.05f, 0.63f, 0.15f, 0.95f)
                curveToRelative(0.1f, 0.32f, 0.24f, 0.63f, 0.44f, 0.94f)
                curveToRelative(0.19f, 0.31f, 0.46f, 0.58f, 0.8f, 0.83f)
                curveToRelative(0.34f, 0.25f, 0.72f, 0.44f, 1.15f, 0.57f)
                lineToRelative(0.62f, 0.22f)
                curveToRelative(0.1f, 0.03f, 0.15f, 0.08f, 0.15f, 0.16f)
                curveToRelative(0.0f, 0.02f, -0.01f, 0.04f, -0.02f, 0.07f)
                lineToRelative(-0.18f, 0.67f)
                curveToRelative(-0.27f, 1.08f, -0.78f, 1.93f, -1.5f, 2.57f)
                curveToRelative(0.4f, 0.7f, 0.62f, 1.45f, 0.65f, 2.24f)
                curveToRelative(0.01f, 0.05f, 0.01f, 0.12f, 0.01f, 0.23f)
                curveToRelative(0.0f, 0.89f, -0.22f, 1.72f, -0.67f, 2.48f)
                curveToRelative(-0.44f, 0.76f, -1.05f, 1.36f, -1.8f, 1.8f)
                curveToRelative(-0.76f, 0.44f, -1.59f, 0.67f, -2.48f, 0.67f)
                horizontalLineTo(9.07f)
                curveToRelative(-0.89f, 0.0f, -1.72f, -0.22f, -2.48f, -0.67f)
                reflectiveCurveToRelative(-1.35f, -1.05f, -1.79f, -1.8f)
                reflectiveCurveTo(4.14f, 17.8f, 4.14f, 16.9f)
                close()
                moveTo(5.85f, 16.9f)
                curveToRelative(0.0f, 0.89f, 0.32f, 1.66f, 0.96f, 2.31f)
                curveToRelative(0.64f, 0.65f, 1.39f, 0.98f, 2.26f, 0.98f)
                horizontalLineToRelative(10.81f)
                curveToRelative(0.89f, 0.0f, 1.65f, -0.32f, 2.28f, -0.97f)
                reflectiveCurveToRelative(0.95f, -1.42f, 0.95f, -2.32f)
                curveToRelative(0.0f, -0.88f, -0.32f, -1.63f, -0.96f, -2.26f)
                curveToRelative(-0.64f, -0.63f, -1.4f, -0.95f, -2.28f, -0.95f)
                horizontalLineToRelative(-1.78f)
                lineToRelative(-0.1f, -0.75f)
                curveToRelative(-0.1f, -1.01f, -0.52f, -1.88f, -1.26f, -2.59f)
                reflectiveCurveToRelative(-1.62f, -1.11f, -2.63f, -1.2f)
                curveToRelative(-0.03f, 0.0f, -0.08f, 0.0f, -0.15f, -0.01f)
                curveToRelative(-0.07f, -0.01f, -0.11f, -0.01f, -0.15f, -0.01f)
                curveToRelative(-0.51f, 0.0f, -1.02f, 0.1f, -1.54f, 0.29f)
                verticalLineTo(9.4f)
                curveToRelative(-0.73f, 0.28f, -1.35f, 0.74f, -1.84f, 1.37f)
                curveToRelative(-0.5f, 0.63f, -0.8f, 1.35f, -0.9f, 2.17f)
                lineToRelative(-0.07f, 0.72f)
                lineToRelative(-0.68f, 0.03f)
                curveToRelative(-0.84f, 0.1f, -1.54f, 0.45f, -2.1f, 1.06f)
                reflectiveCurveTo(5.85f, 16.07f, 5.85f, 16.9f)
                close()
                moveTo(17.6f, 8.79f)
                curveToRelative(1.06f, 0.91f, 1.72f, 1.97f, 1.97f, 3.18f)
                horizontalLineToRelative(0.32f)
                curveToRelative(1.24f, 0.0f, 2.3f, 0.39f, 3.17f, 1.18f)
                curveToRelative(0.33f, -0.31f, 0.58f, -0.67f, 0.76f, -1.07f)
                curveToRelative(-0.91f, -0.43f, -1.63f, -1.09f, -2.16f, -1.97f)
                curveToRelative(-0.52f, -0.88f, -0.79f, -1.81f, -0.79f, -2.78f)
                verticalLineTo(7.09f)
                curveToRelative(-0.05f, -0.01f, -0.13f, -0.01f, -0.24f, -0.01f)
                curveToRelative(-0.58f, -0.01f, -1.15f, 0.13f, -1.7f, 0.44f)
                curveTo(18.38f, 7.82f, 17.93f, 8.24f, 17.6f, 8.79f)
                close()
            }
        }
        .build()
        return _nightAltCloudy!!
    }

private var _nightAltCloudy: ImageVector? = null
