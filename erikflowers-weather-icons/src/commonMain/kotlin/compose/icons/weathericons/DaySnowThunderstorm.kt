package compose.icons.weathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.WeatherIcons

public val WeatherIcons.DaySnowThunderstorm: ImageVector
    get() {
        if (_daySnowThunderstorm != null) {
            return _daySnowThunderstorm!!
        }
        _daySnowThunderstorm = Builder(name = "DaySnowThunderstorm", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.49f, 16.88f)
                curveToRelative(0.0f, 1.12f, 0.33f, 2.12f, 1.0f, 3.0f)
                reflectiveCurveToRelative(1.53f, 1.47f, 2.58f, 1.76f)
                lineToRelative(-0.66f, 1.7f)
                curveToRelative(-0.05f, 0.14f, 0.0f, 0.22f, 0.14f, 0.22f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.43f, 4.21f)
                horizontalLineToRelative(0.29f)
                lineToRelative(4.36f, -5.66f)
                curveToRelative(0.04f, -0.04f, 0.04f, -0.09f, 0.02f, -0.14f)
                curveTo(9.9f, 21.92f, 9.85f, 21.9f, 9.78f, 21.9f)
                horizontalLineTo(7.59f)
                lineToRelative(2.49f, -4.65f)
                curveToRelative(0.07f, -0.14f, 0.03f, -0.22f, -0.14f, -0.22f)
                horizontalLineTo(6.98f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.05f, -0.23f, 0.15f)
                lineToRelative(-1.07f, 2.88f)
                curveTo(4.96f, 19.88f, 4.36f, 19.5f, 3.9f, 18.9f)
                curveToRelative(-0.47f, -0.59f, -0.7f, -1.26f, -0.7f, -2.02f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.84f, -2.18f)
                curveToRelative(0.56f, -0.61f, 1.27f, -0.97f, 2.11f, -1.07f)
                lineToRelative(0.51f, -0.03f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.05f, 0.22f, -0.14f)
                lineToRelative(0.07f, -0.59f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                reflectiveCurveToRelative(1.76f, -1.1f, 2.86f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                reflectiveCurveToRelative(1.29f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.08f, 0.59f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.89f, 0.0f, 1.66f, 0.32f, 2.31f, 0.96f)
                reflectiveCurveToRelative(0.97f, 1.4f, 0.97f, 2.29f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                reflectiveCurveToRelative(-1.32f, 0.98f, -2.18f, 1.03f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.18f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.88f, -0.02f, 1.69f, -0.26f, 2.42f, -0.72f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.06f, 1.74f, -1.81f)
                reflectiveCurveToRelative(0.64f, -1.57f, 0.64f, -2.45f)
                curveToRelative(0.0f, -0.73f, -0.14f, -1.4f, -0.43f, -2.02f)
                curveToRelative(0.76f, -0.96f, 1.14f, -2.06f, 1.14f, -3.29f)
                curveToRelative(0.0f, -0.95f, -0.24f, -1.83f, -0.71f, -2.64f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.45f, -1.92f, -1.92f)
                curveToRelative(-0.81f, -0.47f, -1.69f, -0.71f, -2.64f, -0.71f)
                curveToRelative(-0.72f, 0.0f, -1.42f, 0.15f, -2.1f, 0.45f)
                curveToRelative(-0.68f, 0.3f, -1.26f, 0.72f, -1.76f, 1.25f)
                curveToRelative(-0.81f, -0.43f, -1.71f, -0.65f, -2.72f, -0.65f)
                curveToRelative(-1.42f, 0.0f, -2.68f, 0.44f, -3.77f, 1.32f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.1f, 3.37f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.74f, 1.74f)
                curveTo(1.85f, 14.7f, 1.49f, 15.73f, 1.49f, 16.88f)
                close()
                moveTo(9.9f, 4.59f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.43f, 0.25f, 0.6f)
                lineToRelative(0.65f, 0.66f)
                curveToRelative(0.16f, 0.16f, 0.34f, 0.24f, 0.55f, 0.26f)
                curveToRelative(0.21f, 0.03f, 0.41f, -0.04f, 0.61f, -0.23f)
                curveToRelative(0.2f, -0.18f, 0.3f, -0.39f, 0.3f, -0.64f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.6f)
                lineToRelative(-0.63f, -0.66f)
                curveToRelative(-0.16f, -0.16f, -0.36f, -0.24f, -0.6f, -0.24f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.08f, -0.63f, 0.24f)
                curveTo(9.99f, 4.16f, 9.9f, 4.36f, 9.9f, 4.59f)
                close()
                moveTo(11.08f, 22.96f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.24f, 0.59f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.58f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.24f)
                reflectiveCurveToRelative(0.25f, -0.36f, 0.25f, -0.59f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.25f, -0.61f)
                reflectiveCurveToRelative(-0.37f, -0.26f, -0.61f, -0.26f)
                curveToRelative(-0.22f, 0.0f, -0.41f, 0.09f, -0.58f, 0.26f)
                reflectiveCurveTo(11.08f, 22.72f, 11.08f, 22.96f)
                close()
                moveTo(11.08f, 19.32f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.43f, 0.24f, 0.58f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.58f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.45f, -0.08f, 0.61f, -0.23f)
                reflectiveCurveToRelative(0.25f, -0.35f, 0.25f, -0.59f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.25f, -0.6f)
                reflectiveCurveToRelative(-0.37f, -0.25f, -0.61f, -0.25f)
                curveToRelative(-0.23f, 0.0f, -0.42f, 0.08f, -0.58f, 0.25f)
                reflectiveCurveTo(11.08f, 19.09f, 11.08f, 19.32f)
                close()
                moveTo(11.08f, 26.63f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.41f, 0.24f, 0.57f)
                curveToRelative(0.17f, 0.17f, 0.36f, 0.25f, 0.58f, 0.25f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.24f)
                curveToRelative(0.17f, -0.16f, 0.25f, -0.35f, 0.25f, -0.59f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.25f, -0.61f)
                curveToRelative(-0.17f, -0.17f, -0.37f, -0.26f, -0.61f, -0.26f)
                curveToRelative(-0.22f, 0.0f, -0.41f, 0.09f, -0.58f, 0.26f)
                curveTo(11.16f, 26.19f, 11.08f, 26.4f, 11.08f, 26.63f)
                close()
                moveTo(14.31f, 21.02f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.25f, 0.6f)
                reflectiveCurveToRelative(0.36f, 0.25f, 0.6f, 0.25f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.6f)
                curveToRelative(0.0f, -0.22f, -0.08f, -0.42f, -0.24f, -0.58f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.24f, -0.59f, -0.24f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.6f, 0.24f)
                reflectiveCurveTo(14.31f, 20.79f, 14.31f, 21.02f)
                close()
                moveTo(14.31f, 24.66f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.42f, 0.24f, 0.58f)
                curveToRelative(0.16f, 0.16f, 0.36f, 0.24f, 0.6f, 0.24f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.24f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.59f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.43f, -0.23f, -0.59f)
                curveToRelative(-0.16f, -0.16f, -0.35f, -0.23f, -0.59f, -0.23f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.23f)
                curveTo(14.39f, 24.22f, 14.31f, 24.42f, 14.31f, 24.66f)
                close()
                moveTo(15.31f, 9.02f)
                curveToRelative(0.67f, -0.64f, 1.48f, -0.97f, 2.45f, -0.97f)
                curveToRelative(0.98f, 0.0f, 1.82f, 0.34f, 2.51f, 1.03f)
                curveToRelative(0.69f, 0.68f, 1.04f, 1.52f, 1.04f, 2.5f)
                curveToRelative(0.0f, 0.66f, -0.16f, 1.26f, -0.47f, 1.81f)
                curveToRelative(-0.96f, -0.96f, -2.13f, -1.44f, -3.52f, -1.44f)
                horizontalLineToRelative(-0.31f)
                curveTo(16.72f, 10.76f, 16.15f, 9.78f, 15.31f, 9.02f)
                close()
                moveTo(16.91f, 3.75f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.25f, 0.61f)
                reflectiveCurveToRelative(0.37f, 0.25f, 0.6f, 0.25f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.6f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.61f)
                verticalLineTo(1.69f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.45f, -0.24f, -0.61f)
                curveTo(18.2f, 0.91f, 18.0f, 0.82f, 17.76f, 0.82f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.25f)
                reflectiveCurveToRelative(-0.25f, 0.37f, -0.25f, 0.61f)
                verticalLineTo(3.75f)
                close()
                moveTo(22.49f, 6.04f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.23f, 0.6f)
                curveToRelative(0.14f, 0.16f, 0.32f, 0.24f, 0.55f, 0.26f)
                curveToRelative(0.23f, 0.02f, 0.44f, -0.07f, 0.63f, -0.26f)
                lineToRelative(1.44f, -1.44f)
                curveToRelative(0.18f, -0.16f, 0.26f, -0.36f, 0.26f, -0.6f)
                reflectiveCurveToRelative(-0.09f, -0.44f, -0.26f, -0.6f)
                curveToRelative(-0.16f, -0.18f, -0.36f, -0.26f, -0.6f, -0.26f)
                curveToRelative(-0.23f, 0.0f, -0.42f, 0.09f, -0.58f, 0.26f)
                lineToRelative(-1.44f, 1.44f)
                curveTo(22.56f, 5.59f, 22.49f, 5.79f, 22.49f, 6.04f)
                close()
                moveTo(23.26f, 17.95f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.43f, 0.25f, 0.6f)
                lineToRelative(0.65f, 0.63f)
                curveToRelative(0.18f, 0.17f, 0.39f, 0.25f, 0.62f, 0.25f)
                lineToRelative(0.02f, 0.02f)
                curveToRelative(0.22f, 0.0f, 0.4f, -0.09f, 0.54f, -0.27f)
                curveToRelative(0.18f, -0.16f, 0.26f, -0.36f, 0.26f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.09f, -0.43f, -0.26f, -0.61f)
                lineToRelative(-0.62f, -0.62f)
                curveToRelative(-0.18f, -0.18f, -0.38f, -0.27f, -0.61f, -0.27f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.09f, -0.6f, 0.26f)
                curveTo(23.35f, 17.51f, 23.26f, 17.72f, 23.26f, 17.95f)
                close()
                moveTo(24.73f, 11.58f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.44f, 0.26f, 0.59f)
                curveToRelative(0.16f, 0.18f, 0.36f, 0.26f, 0.6f, 0.26f)
                horizontalLineToRelative(2.06f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.61f, -0.25f)
                curveToRelative(0.17f, -0.17f, 0.25f, -0.37f, 0.25f, -0.6f)
                reflectiveCurveToRelative(-0.08f, -0.44f, -0.25f, -0.6f)
                curveToRelative(-0.17f, -0.16f, -0.37f, -0.24f, -0.61f, -0.24f)
                horizontalLineToRelative(-2.06f)
                curveToRelative(-0.24f, 0.0f, -0.45f, 0.08f, -0.61f, 0.24f)
                curveTo(24.81f, 11.14f, 24.73f, 11.34f, 24.73f, 11.58f)
                close()
            }
        }
        .build()
        return _daySnowThunderstorm!!
    }

private var _daySnowThunderstorm: ImageVector? = null
