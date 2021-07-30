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

public val WeatherIcons.NightCloudy: ImageVector
    get() {
        if (_nightCloudy != null) {
            return _nightCloudy!!
        }
        _nightCloudy = Builder(name = "NightCloudy", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3f, 16.89f)
                curveToRelative(0.0f, 0.89f, 0.22f, 1.72f, 0.66f, 2.48f)
                reflectiveCurveToRelative(1.03f, 1.36f, 1.79f, 1.8f)
                reflectiveCurveToRelative(1.58f, 0.67f, 2.48f, 0.67f)
                horizontalLineToRelative(10.81f)
                curveToRelative(0.89f, 0.0f, 1.72f, -0.22f, 2.48f, -0.67f)
                reflectiveCurveToRelative(1.36f, -1.05f, 1.8f, -1.8f)
                curveToRelative(0.44f, -0.76f, 0.67f, -1.59f, 0.67f, -2.48f)
                curveToRelative(0.0f, -0.64f, -0.14f, -1.3f, -0.42f, -2.0f)
                curveToRelative(0.76f, -0.93f, 1.13f, -2.03f, 1.13f, -3.3f)
                curveToRelative(0.0f, -0.95f, -0.23f, -1.83f, -0.69f, -2.63f)
                curveToRelative(-0.46f, -0.8f, -1.1f, -1.44f, -1.9f, -1.91f)
                curveToRelative(-0.8f, -0.47f, -1.68f, -0.7f, -2.63f, -0.7f)
                curveToRelative(-1.49f, 0.0f, -2.78f, 0.58f, -3.87f, 1.74f)
                curveToRelative(-0.76f, -0.43f, -1.66f, -0.65f, -2.69f, -0.65f)
                curveToRelative(-1.41f, 0.0f, -2.65f, 0.43f, -3.73f, 1.3f)
                reflectiveCurveToRelative(-1.77f, 1.98f, -2.08f, 3.35f)
                curveToRelative(-1.12f, 0.25f, -2.03f, 0.82f, -2.74f, 1.72f)
                curveTo(4.66f, 14.71f, 4.3f, 15.74f, 4.3f, 16.89f)
                close()
                moveTo(6.01f, 16.89f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.83f, -2.16f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.96f, 2.1f, -1.06f)
                lineToRelative(0.68f, -0.03f)
                lineToRelative(0.07f, -0.72f)
                curveToRelative(0.14f, -1.08f, 0.61f, -1.99f, 1.41f, -2.71f)
                curveToRelative(0.8f, -0.73f, 1.74f, -1.09f, 2.81f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.05f, 0.37f, 2.86f, 1.1f)
                reflectiveCurveToRelative(1.27f, 1.63f, 1.38f, 2.71f)
                lineToRelative(0.1f, 0.75f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.88f, 0.0f, 1.64f, 0.32f, 2.28f, 0.95f)
                reflectiveCurveToRelative(0.96f, 1.39f, 0.96f, 2.26f)
                curveToRelative(0.0f, 0.9f, -0.32f, 1.67f, -0.95f, 2.32f)
                reflectiveCurveToRelative(-1.4f, 0.97f, -2.28f, 0.97f)
                horizontalLineTo(9.23f)
                curveToRelative(-0.87f, 0.0f, -1.62f, -0.32f, -2.26f, -0.97f)
                curveTo(6.33f, 18.55f, 6.01f, 17.78f, 6.01f, 16.89f)
                close()
                moveTo(18.04f, 9.06f)
                curveToRelative(0.69f, -0.66f, 1.5f, -0.99f, 2.44f, -0.99f)
                curveToRelative(0.99f, 0.0f, 1.83f, 0.34f, 2.52f, 1.03f)
                curveToRelative(0.69f, 0.68f, 1.04f, 1.52f, 1.04f, 2.51f)
                curveToRelative(0.0f, 0.62f, -0.17f, 1.23f, -0.52f, 1.84f)
                curveTo(22.56f, 12.48f, 21.4f, 12.0f, 20.03f, 12.0f)
                horizontalLineToRelative(-0.31f)
                curveTo(19.45f, 10.89f, 18.89f, 9.91f, 18.04f, 9.06f)
                close()
            }
        }
        .build()
        return _nightCloudy!!
    }

private var _nightCloudy: ImageVector? = null
