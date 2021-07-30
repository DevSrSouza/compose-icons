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

public val WeatherIcons.NightCloudyHigh: ImageVector
    get() {
        if (_nightCloudyHigh != null) {
            return _nightCloudyHigh!!
        }
        _nightCloudyHigh = Builder(name = "NightCloudyHigh", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.58f, 13.45f)
                curveToRelative(0.0f, -1.15f, 0.36f, -2.18f, 1.08f, -3.07f)
                curveTo(5.38f, 9.48f, 6.29f, 8.9f, 7.4f, 8.64f)
                curveToRelative(0.31f, -1.37f, 1.02f, -2.49f, 2.11f, -3.37f)
                reflectiveCurveToRelative(2.35f, -1.32f, 3.76f, -1.32f)
                curveToRelative(1.38f, 0.0f, 2.61f, 0.43f, 3.69f, 1.28f)
                reflectiveCurveToRelative(1.78f, 1.95f, 2.1f, 3.29f)
                horizontalLineToRelative(0.33f)
                curveToRelative(0.9f, 0.0f, 1.73f, 0.22f, 2.49f, 0.65f)
                reflectiveCurveToRelative(1.37f, 1.03f, 1.81f, 1.79f)
                curveToRelative(0.44f, 0.76f, 0.67f, 1.58f, 0.67f, 2.48f)
                curveToRelative(0.0f, 0.2f, -0.01f, 0.4f, -0.03f, 0.61f)
                curveToRelative(0.65f, 0.51f, 1.16f, 1.15f, 1.54f, 1.91f)
                reflectiveCurveToRelative(0.56f, 1.57f, 0.56f, 2.43f)
                curveToRelative(0.0f, 0.77f, -0.15f, 1.5f, -0.45f, 2.19f)
                curveToRelative(-0.3f, 0.69f, -0.7f, 1.28f, -1.2f, 1.78f)
                curveToRelative(-0.5f, 0.49f, -1.1f, 0.89f, -1.79f, 1.18f)
                curveToRelative(-0.69f, 0.29f, -1.41f, 0.44f, -2.17f, 0.44f)
                curveToRelative(-0.75f, 0.0f, -1.47f, -0.15f, -2.16f, -0.44f)
                curveToRelative(-0.69f, -0.29f, -1.28f, -0.69f, -1.78f, -1.19f)
                curveToRelative(-0.5f, -0.5f, -0.89f, -1.09f, -1.19f, -1.78f)
                reflectiveCurveToRelative(-0.45f, -1.41f, -0.45f, -2.16f)
                horizontalLineTo(8.38f)
                curveToRelative(-1.34f, -0.06f, -2.47f, -0.57f, -3.4f, -1.53f)
                curveTo(4.05f, 15.94f, 3.58f, 14.79f, 3.58f, 13.45f)
                close()
                moveTo(5.29f, 13.45f)
                curveToRelative(0.0f, 0.87f, 0.3f, 1.62f, 0.9f, 2.26f)
                curveToRelative(0.6f, 0.64f, 1.33f, 0.98f, 2.19f, 1.03f)
                horizontalLineToRelative(11.19f)
                curveToRelative(0.86f, -0.04f, 1.59f, -0.39f, 2.19f, -1.03f)
                curveToRelative(0.61f, -0.64f, 0.91f, -1.4f, 0.91f, -2.26f)
                curveToRelative(0.0f, -0.88f, -0.33f, -1.63f, -0.98f, -2.27f)
                reflectiveCurveToRelative(-1.42f, -0.96f, -2.32f, -0.96f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.11f, 0.0f, -0.17f, -0.06f, -0.17f, -0.17f)
                lineToRelative(-0.07f, -0.58f)
                curveToRelative(-0.11f, -1.08f, -0.58f, -1.99f, -1.4f, -2.72f)
                reflectiveCurveToRelative(-1.77f, -1.1f, -2.86f, -1.1f)
                curveToRelative(-1.09f, 0.0f, -2.05f, 0.37f, -2.85f, 1.1f)
                reflectiveCurveTo(9.14f, 8.39f, 9.04f, 9.47f)
                lineToRelative(-0.08f, 0.58f)
                curveToRelative(0.0f, 0.11f, -0.07f, 0.17f, -0.2f, 0.17f)
                horizontalLineTo(8.24f)
                curveToRelative(-0.84f, 0.1f, -1.54f, 0.46f, -2.1f, 1.07f)
                curveTo(5.57f, 11.9f, 5.29f, 12.62f, 5.29f, 13.45f)
                close()
                moveTo(16.55f, 18.56f)
                curveToRelative(0.06f, 1.12f, 0.52f, 2.07f, 1.37f, 2.83f)
                curveToRelative(0.85f, 0.76f, 1.82f, 1.14f, 2.91f, 1.14f)
                curveToRelative(0.6f, 0.0f, 1.17f, -0.12f, 1.7f, -0.35f)
                reflectiveCurveToRelative(0.98f, -0.55f, 1.34f, -0.93f)
                curveToRelative(0.36f, -0.39f, 0.65f, -0.83f, 0.85f, -1.33f)
                curveToRelative(0.21f, -0.5f, 0.31f, -1.0f, 0.31f, -1.52f)
                curveToRelative(0.0f, -0.49f, -0.1f, -0.98f, -0.3f, -1.47f)
                reflectiveCurveToRelative(-0.48f, -0.94f, -0.85f, -1.35f)
                curveToRelative(-0.39f, 0.82f, -0.97f, 1.5f, -1.74f, 2.02f)
                curveToRelative(-0.77f, 0.52f, -1.63f, 0.79f, -2.57f, 0.83f)
                horizontalLineToRelative(-3.03f)
                curveTo(16.54f, 18.44f, 16.54f, 18.47f, 16.55f, 18.56f)
                close()
            }
        }
        .build()
        return _nightCloudyHigh!!
    }

private var _nightCloudyHigh: ImageVector? = null
