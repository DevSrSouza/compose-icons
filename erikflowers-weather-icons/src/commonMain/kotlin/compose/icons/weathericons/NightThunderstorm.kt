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

public val WeatherIcons.NightThunderstorm: ImageVector
    get() {
        if (_nightThunderstorm != null) {
            return _nightThunderstorm!!
        }
        _nightThunderstorm = Builder(name = "NightThunderstorm", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.28f, 16.89f)
                curveToRelative(0.0f, 1.11f, 0.33f, 2.11f, 0.99f, 2.98f)
                reflectiveCurveToRelative(1.52f, 1.46f, 2.56f, 1.75f)
                lineToRelative(-0.64f, 1.68f)
                curveToRelative(-0.05f, 0.14f, 0.0f, 0.22f, 0.14f, 0.22f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-1.04f, 4.19f)
                horizontalLineToRelative(0.28f)
                lineToRelative(3.97f, -5.62f)
                curveToRelative(0.04f, -0.04f, 0.04f, -0.09f, 0.01f, -0.14f)
                curveToRelative(-0.03f, -0.05f, -0.08f, -0.07f, -0.15f, -0.07f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(2.47f, -4.61f)
                curveToRelative(0.07f, -0.14f, 0.02f, -0.22f, -0.14f, -0.22f)
                horizontalLineTo(9.74f)
                curveToRelative(-0.09f, 0.0f, -0.16f, 0.05f, -0.23f, 0.14f)
                lineToRelative(-1.07f, 2.87f)
                curveToRelative(-0.71f, -0.17f, -1.3f, -0.56f, -1.77f, -1.14f)
                reflectiveCurveToRelative(-0.7f, -1.26f, -0.7f, -2.02f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.84f, -2.16f)
                reflectiveCurveToRelative(1.26f, -0.96f, 2.1f, -1.06f)
                lineToRelative(0.53f, -0.04f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.18f)
                lineToRelative(0.07f, -0.53f)
                curveToRelative(0.07f, -0.71f, 0.3f, -1.35f, 0.69f, -1.94f)
                curveToRelative(0.39f, -0.58f, 0.9f, -1.04f, 1.52f, -1.37f)
                reflectiveCurveToRelative(1.29f, -0.5f, 2.01f, -0.5f)
                curveToRelative(1.08f, 0.0f, 2.03f, 0.37f, 2.84f, 1.1f)
                curveToRelative(0.81f, 0.73f, 1.27f, 1.63f, 1.39f, 2.71f)
                lineToRelative(0.08f, 0.56f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.19f, 0.17f, 0.19f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.89f, 0.0f, 1.65f, 0.32f, 2.3f, 0.96f)
                reflectiveCurveToRelative(0.97f, 1.39f, 0.97f, 2.27f)
                curveToRelative(0.0f, 0.86f, -0.3f, 1.61f, -0.9f, 2.25f)
                reflectiveCurveToRelative(-1.33f, 0.97f, -2.18f, 1.02f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.18f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.87f, -0.02f, 1.67f, -0.26f, 2.4f, -0.72f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.05f, 1.72f, -1.8f)
                reflectiveCurveToRelative(0.63f, -1.56f, 0.63f, -2.43f)
                curveToRelative(0.0f, -0.73f, -0.14f, -1.4f, -0.42f, -2.01f)
                curveToRelative(0.78f, -0.93f, 1.17f, -2.03f, 1.17f, -3.31f)
                curveToRelative(0.0f, -0.71f, -0.14f, -1.38f, -0.42f, -2.02f)
                curveToRelative(-0.28f, -0.64f, -0.65f, -1.2f, -1.12f, -1.67f)
                curveToRelative(-0.47f, -0.47f, -1.02f, -0.84f, -1.67f, -1.12f)
                curveToRelative(-0.64f, -0.28f, -1.32f, -0.42f, -2.02f, -0.42f)
                curveToRelative(-1.54f, 0.0f, -2.83f, 0.58f, -3.86f, 1.73f)
                curveToRelative(-0.81f, -0.43f, -1.71f, -0.65f, -2.7f, -0.65f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.31f)
                reflectiveCurveToRelative(-1.79f, 1.99f, -2.1f, 3.35f)
                curveToRelative(-1.1f, 0.26f, -2.01f, 0.83f, -2.73f, 1.73f)
                reflectiveCurveTo(4.28f, 15.74f, 4.28f, 16.89f)
                close()
                moveTo(12.21f, 26.77f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.32f, 0.15f, 0.46f)
                reflectiveCurveToRelative(0.25f, 0.25f, 0.45f, 0.31f)
                lineToRelative(0.25f, 0.03f)
                curveToRelative(0.42f, 0.0f, 0.68f, -0.2f, 0.8f, -0.6f)
                lineToRelative(2.43f, -8.89f)
                curveToRelative(0.06f, -0.23f, 0.04f, -0.45f, -0.07f, -0.64f)
                curveToRelative(-0.11f, -0.2f, -0.27f, -0.33f, -0.49f, -0.4f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.06f)
                curveToRelative(-0.2f, 0.11f, -0.34f, 0.28f, -0.4f, 0.5f)
                lineToRelative(-2.45f, 8.9f)
                curveTo(12.22f, 26.67f, 12.21f, 26.76f, 12.21f, 26.77f)
                close()
                moveTo(16.35f, 23.74f)
                curveToRelative(0.0f, 0.4f, 0.21f, 0.67f, 0.62f, 0.8f)
                curveToRelative(0.17f, 0.02f, 0.26f, 0.03f, 0.26f, 0.03f)
                curveToRelative(0.11f, 0.0f, 0.23f, -0.02f, 0.35f, -0.08f)
                curveToRelative(0.2f, -0.09f, 0.34f, -0.27f, 0.42f, -0.55f)
                lineToRelative(1.64f, -5.85f)
                curveToRelative(0.06f, -0.23f, 0.04f, -0.45f, -0.08f, -0.64f)
                curveToRelative(-0.11f, -0.2f, -0.28f, -0.33f, -0.51f, -0.4f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.06f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.28f, -0.39f, 0.5f)
                lineToRelative(-1.62f, 5.89f)
                curveTo(16.37f, 23.64f, 16.35f, 23.72f, 16.35f, 23.74f)
                close()
                moveTo(18.02f, 9.04f)
                curveToRelative(0.68f, -0.64f, 1.5f, -0.96f, 2.48f, -0.96f)
                curveToRelative(0.97f, 0.0f, 1.8f, 0.34f, 2.48f, 1.02f)
                curveToRelative(0.69f, 0.68f, 1.03f, 1.51f, 1.03f, 2.48f)
                curveToRelative(0.0f, 0.63f, -0.17f, 1.25f, -0.51f, 1.85f)
                curveToRelative(-0.96f, -0.96f, -2.12f, -1.44f, -3.48f, -1.44f)
                horizontalLineToRelative(-0.32f)
                curveTo(19.42f, 10.84f, 18.86f, 9.86f, 18.02f, 9.04f)
                close()
            }
        }
        .build()
        return _nightThunderstorm!!
    }

private var _nightThunderstorm: ImageVector? = null
