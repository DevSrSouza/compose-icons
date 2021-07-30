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

public val WeatherIcons.DayCloudyHigh: ImageVector
    get() {
        if (_dayCloudyHigh != null) {
            return _dayCloudyHigh!!
        }
        _dayCloudyHigh = Builder(name = "DayCloudyHigh", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.95f, 13.05f)
                curveToRelative(0.0f, -0.93f, 0.29f, -1.75f, 0.87f, -2.48f)
                reflectiveCurveToRelative(1.31f, -1.2f, 2.19f, -1.4f)
                curveToRelative(0.26f, -1.1f, 0.82f, -2.0f, 1.7f, -2.71f)
                reflectiveCurveToRelative(1.88f, -1.06f, 3.01f, -1.06f)
                curveToRelative(1.1f, 0.0f, 2.08f, 0.35f, 2.95f, 1.04f)
                reflectiveCurveToRelative(1.43f, 1.57f, 1.68f, 2.65f)
                horizontalLineToRelative(0.26f)
                curveToRelative(1.1f, 0.0f, 2.04f, 0.39f, 2.82f, 1.16f)
                curveToRelative(0.78f, 0.77f, 1.17f, 1.71f, 1.17f, 2.81f)
                curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.04f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.04f, 0.0f, 0.06f)
                curveToRelative(0.75f, 0.8f, 1.12f, 1.75f, 1.12f, 2.85f)
                curveToRelative(0.0f, 0.76f, -0.19f, 1.46f, -0.57f, 2.1f)
                curveToRelative(-0.38f, 0.65f, -0.89f, 1.16f, -1.53f, 1.53f)
                curveToRelative(-0.64f, 0.38f, -1.34f, 0.56f, -2.09f, 0.56f)
                curveToRelative(-0.96f, 0.0f, -1.82f, -0.3f, -2.56f, -0.89f)
                reflectiveCurveToRelative(-1.24f, -1.35f, -1.48f, -2.26f)
                horizontalLineTo(7.79f)
                curveTo(6.72f, 17.0f, 5.81f, 16.59f, 5.07f, 15.82f)
                reflectiveCurveTo(3.95f, 14.12f, 3.95f, 13.05f)
                close()
                moveTo(5.31f, 13.05f)
                curveToRelative(0.0f, 0.7f, 0.24f, 1.31f, 0.73f, 1.82f)
                reflectiveCurveToRelative(1.07f, 0.79f, 1.75f, 0.82f)
                horizontalLineToRelative(8.99f)
                curveToRelative(0.68f, -0.03f, 1.27f, -0.3f, 1.75f, -0.82f)
                curveToRelative(0.49f, -0.52f, 0.73f, -1.12f, 0.73f, -1.82f)
                curveToRelative(0.0f, -0.71f, -0.26f, -1.32f, -0.79f, -1.83f)
                curveToRelative(-0.53f, -0.52f, -1.14f, -0.77f, -1.86f, -0.77f)
                horizontalLineToRelative(-1.29f)
                curveToRelative(-0.09f, 0.0f, -0.14f, -0.05f, -0.14f, -0.14f)
                lineToRelative(-0.07f, -0.47f)
                curveToRelative(-0.09f, -0.87f, -0.46f, -1.6f, -1.12f, -2.19f)
                reflectiveCurveToRelative(-1.42f, -0.89f, -2.28f, -0.89f)
                curveToRelative(-0.89f, 0.0f, -1.66f, 0.29f, -2.31f, 0.88f)
                reflectiveCurveTo(8.4f, 8.96f, 8.31f, 9.83f)
                lineTo(8.25f, 10.3f)
                curveToRelative(0.0f, 0.09f, -0.05f, 0.14f, -0.16f, 0.14f)
                horizontalLineToRelative(-0.4f)
                curveTo(7.02f, 10.52f, 6.45f, 10.8f, 6.0f, 11.3f)
                curveTo(5.54f, 11.79f, 5.31f, 12.38f, 5.31f, 13.05f)
                close()
                moveTo(11.51f, 22.06f)
                curveToRelative(-0.25f, -0.33f, -0.25f, -0.65f, 0.0f, -0.98f)
                lineToRelative(1.13f, -1.15f)
                curveToRelative(0.14f, -0.12f, 0.31f, -0.18f, 0.52f, -0.18f)
                curveToRelative(0.19f, 0.0f, 0.34f, 0.06f, 0.46f, 0.18f)
                curveToRelative(0.12f, 0.12f, 0.18f, 0.28f, 0.18f, 0.47f)
                curveToRelative(0.0f, 0.2f, -0.06f, 0.36f, -0.18f, 0.48f)
                lineToRelative(-1.14f, 1.18f)
                curveToRelative(-0.12f, 0.12f, -0.29f, 0.19f, -0.49f, 0.19f)
                curveTo(11.79f, 22.25f, 11.63f, 22.18f, 11.51f, 22.06f)
                close()
                moveTo(14.9f, 17.04f)
                curveToRelative(0.21f, 0.54f, 0.56f, 0.97f, 1.04f, 1.3f)
                curveToRelative(0.48f, 0.33f, 1.01f, 0.5f, 1.6f, 0.5f)
                curveToRelative(0.77f, 0.0f, 1.43f, -0.28f, 1.97f, -0.83f)
                curveToRelative(0.54f, -0.56f, 0.81f, -1.23f, 0.81f, -2.02f)
                curveToRelative(0.0f, -0.39f, -0.06f, -0.74f, -0.19f, -1.05f)
                curveToRelative(-0.33f, 0.61f, -0.8f, 1.11f, -1.39f, 1.49f)
                curveToRelative(-0.6f, 0.38f, -1.25f, 0.58f, -1.96f, 0.61f)
                horizontalLineTo(14.9f)
                close()
                moveTo(16.85f, 22.23f)
                curveToRelative(0.0f, -0.19f, 0.07f, -0.34f, 0.2f, -0.47f)
                curveToRelative(0.13f, -0.12f, 0.3f, -0.19f, 0.48f, -0.19f)
                curveToRelative(0.18f, 0.0f, 0.35f, 0.07f, 0.5f, 0.21f)
                curveToRelative(0.12f, 0.12f, 0.19f, 0.27f, 0.19f, 0.45f)
                verticalLineToRelative(1.64f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.35f, -0.2f, 0.49f)
                curveToRelative(-0.13f, 0.14f, -0.3f, 0.21f, -0.48f, 0.21f)
                reflectiveCurveToRelative(-0.35f, -0.07f, -0.48f, -0.21f)
                curveToRelative(-0.13f, -0.14f, -0.2f, -0.3f, -0.2f, -0.49f)
                verticalLineTo(22.23f)
                close()
                moveTo(21.26f, 20.4f)
                curveToRelative(0.0f, -0.18f, 0.06f, -0.33f, 0.19f, -0.46f)
                curveToRelative(0.13f, -0.12f, 0.29f, -0.19f, 0.47f, -0.19f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.06f, 0.47f, 0.18f)
                lineToRelative(1.18f, 1.15f)
                curveToRelative(0.13f, 0.14f, 0.2f, 0.3f, 0.2f, 0.48f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.35f, -0.2f, 0.48f)
                curveToRelative(-0.13f, 0.13f, -0.3f, 0.2f, -0.49f, 0.2f)
                curveToRelative(-0.21f, 0.0f, -0.37f, -0.06f, -0.5f, -0.19f)
                lineToRelative(-1.13f, -1.18f)
                curveTo(21.32f, 20.73f, 21.26f, 20.57f, 21.26f, 20.4f)
                close()
                moveTo(21.26f, 11.59f)
                curveToRelative(0.0f, -0.19f, 0.06f, -0.35f, 0.19f, -0.47f)
                lineToRelative(1.13f, -1.18f)
                curveToRelative(0.14f, -0.12f, 0.3f, -0.19f, 0.5f, -0.19f)
                curveToRelative(0.19f, 0.0f, 0.35f, 0.06f, 0.5f, 0.19f)
                curveToRelative(0.13f, 0.15f, 0.2f, 0.32f, 0.2f, 0.51f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.33f, -0.2f, 0.48f)
                lineToRelative(-1.18f, 1.15f)
                curveToRelative(-0.12f, 0.12f, -0.28f, 0.19f, -0.47f, 0.19f)
                reflectiveCurveToRelative(-0.35f, -0.06f, -0.47f, -0.19f)
                curveTo(21.32f, 11.94f, 21.26f, 11.78f, 21.26f, 11.59f)
                close()
                moveTo(23.08f, 15.99f)
                curveToRelative(0.0f, -0.19f, 0.06f, -0.35f, 0.19f, -0.48f)
                curveToRelative(0.12f, -0.13f, 0.28f, -0.2f, 0.47f, -0.2f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.19f, 0.0f, 0.36f, 0.07f, 0.5f, 0.2f)
                reflectiveCurveToRelative(0.21f, 0.29f, 0.21f, 0.48f)
                curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.21f, 0.49f)
                curveToRelative(-0.14f, 0.13f, -0.3f, 0.2f, -0.5f, 0.2f)
                horizontalLineToRelative(-1.62f)
                curveToRelative(-0.19f, 0.0f, -0.34f, -0.07f, -0.47f, -0.2f)
                curveTo(23.14f, 16.35f, 23.08f, 16.19f, 23.08f, 15.99f)
                close()
            }
        }
        .build()
        return _dayCloudyHigh!!
    }

private var _dayCloudyHigh: ImageVector? = null
