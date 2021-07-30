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

public val WeatherIcons.NightAltCloudyHigh: ImageVector
    get() {
        if (_nightAltCloudyHigh != null) {
            return _nightAltCloudyHigh!!
        }
        _nightAltCloudyHigh = Builder(name = "NightAltCloudyHigh", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.57f, 13.43f)
                curveToRelative(0.0f, -1.15f, 0.36f, -2.18f, 1.08f, -3.08f)
                reflectiveCurveToRelative(1.63f, -1.48f, 2.73f, -1.74f)
                curveTo(7.7f, 7.24f, 8.4f, 6.12f, 9.5f, 5.24f)
                reflectiveCurveToRelative(2.35f, -1.31f, 3.76f, -1.31f)
                curveToRelative(1.38f, 0.0f, 2.61f, 0.43f, 3.69f, 1.28f)
                reflectiveCurveToRelative(1.78f, 1.95f, 2.1f, 3.29f)
                horizontalLineToRelative(0.33f)
                curveToRelative(0.9f, 0.0f, 1.73f, 0.22f, 2.49f, 0.65f)
                curveToRelative(0.76f, 0.43f, 1.37f, 1.03f, 1.81f, 1.79f)
                curveToRelative(0.44f, 0.76f, 0.67f, 1.58f, 0.67f, 2.48f)
                curveToRelative(0.0f, 1.15f, -0.35f, 2.18f, -1.06f, 3.08f)
                curveToRelative(0.64f, 0.55f, 1.4f, 0.84f, 2.26f, 0.87f)
                lineToRelative(0.66f, 0.06f)
                curveToRelative(0.12f, 0.0f, 0.18f, 0.06f, 0.18f, 0.19f)
                verticalLineToRelative(0.77f)
                curveToRelative(0.01f, 1.01f, -0.24f, 1.95f, -0.73f, 2.8f)
                curveToRelative(-0.49f, 0.86f, -1.17f, 1.53f, -2.02f, 2.03f)
                curveToRelative(-0.85f, 0.5f, -1.78f, 0.75f, -2.79f, 0.75f)
                curveToRelative(-0.77f, 0.0f, -1.5f, -0.15f, -2.19f, -0.44f)
                curveToRelative(-0.69f, -0.29f, -1.28f, -0.69f, -1.78f, -1.19f)
                curveToRelative(-0.49f, -0.5f, -0.89f, -1.09f, -1.18f, -1.78f)
                curveToRelative(-0.29f, -0.69f, -0.44f, -1.41f, -0.44f, -2.17f)
                horizontalLineTo(8.37f)
                curveToRelative(-1.34f, -0.06f, -2.47f, -0.57f, -3.4f, -1.53f)
                reflectiveCurveTo(3.57f, 14.76f, 3.57f, 13.43f)
                close()
                moveTo(5.28f, 13.43f)
                curveToRelative(0.0f, 0.87f, 0.3f, 1.62f, 0.9f, 2.26f)
                reflectiveCurveToRelative(1.33f, 0.98f, 2.19f, 1.02f)
                horizontalLineToRelative(11.19f)
                curveToRelative(0.86f, -0.04f, 1.59f, -0.38f, 2.19f, -1.02f)
                curveToRelative(0.6f, -0.64f, 0.9f, -1.39f, 0.9f, -2.26f)
                curveToRelative(0.0f, -0.88f, -0.32f, -1.63f, -0.97f, -2.28f)
                curveToRelative(-0.65f, -0.64f, -1.42f, -0.97f, -2.31f, -0.97f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.11f, 0.0f, -0.17f, -0.06f, -0.17f, -0.17f)
                lineToRelative(-0.07f, -0.58f)
                curveToRelative(-0.11f, -1.08f, -0.58f, -1.99f, -1.4f, -2.71f)
                reflectiveCurveToRelative(-1.77f, -1.09f, -2.86f, -1.09f)
                curveToRelative(-1.1f, 0.0f, -2.05f, 0.36f, -2.86f, 1.09f)
                reflectiveCurveTo(9.13f, 8.35f, 9.03f, 9.43f)
                lineToRelative(-0.07f, 0.58f)
                curveToRelative(0.0f, 0.11f, -0.07f, 0.17f, -0.2f, 0.17f)
                horizontalLineTo(8.23f)
                curveToRelative(-0.84f, 0.1f, -1.54f, 0.46f, -2.1f, 1.07f)
                reflectiveCurveTo(5.28f, 12.59f, 5.28f, 13.43f)
                close()
                moveTo(16.71f, 18.39f)
                curveToRelative(0.0f, 0.79f, 0.2f, 1.52f, 0.6f, 2.17f)
                curveToRelative(0.4f, 0.65f, 0.91f, 1.15f, 1.54f, 1.5f)
                curveToRelative(0.63f, 0.35f, 1.29f, 0.52f, 1.99f, 0.52f)
                curveToRelative(0.62f, 0.0f, 1.23f, -0.15f, 1.82f, -0.45f)
                curveToRelative(0.6f, -0.3f, 1.12f, -0.75f, 1.58f, -1.36f)
                reflectiveCurveToRelative(0.75f, -1.31f, 0.86f, -2.1f)
                curveToRelative(-1.08f, -0.22f, -1.98f, -0.65f, -2.72f, -1.3f)
                curveToRelative(-0.84f, 0.65f, -1.78f, 0.99f, -2.82f, 1.01f)
                horizontalLineTo(16.71f)
                close()
            }
        }
        .build()
        return _nightAltCloudyHigh!!
    }

private var _nightAltCloudyHigh: ImageVector? = null
