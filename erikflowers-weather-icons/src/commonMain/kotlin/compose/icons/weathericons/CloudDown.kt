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

public val WeatherIcons.CloudDown: ImageVector
    get() {
        if (_cloudDown != null) {
            return _cloudDown!!
        }
        _cloudDown = Builder(name = "CloudDown", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.61f, 16.88f)
                curveToRelative(0.0f, 1.34f, 0.47f, 2.48f, 1.4f, 3.44f)
                curveToRelative(0.93f, 0.96f, 2.07f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.12f, -0.06f, -0.18f, -0.17f, -0.18f)
                curveToRelative(-0.86f, -0.04f, -1.59f, -0.38f, -2.19f, -1.02f)
                curveToRelative(-0.6f, -0.64f, -0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.85f, -2.17f)
                curveToRelative(0.57f, -0.62f, 1.27f, -0.97f, 2.1f, -1.07f)
                lineTo(9.8f, 13.6f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.08f, -0.55f)
                curveToRelative(0.1f, -1.08f, 0.55f, -1.99f, 1.36f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.09f, 2.86f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.36f, 2.86f, 1.09f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.63f, 1.4f, 2.71f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.17f, 0.17f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.89f, 0.0f, 1.66f, 0.32f, 2.31f, 0.97f)
                curveToRelative(0.65f, 0.64f, 0.98f, 1.4f, 0.98f, 2.28f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.91f, 2.26f)
                curveToRelative(-0.61f, 0.64f, -1.34f, 0.98f, -2.19f, 1.02f)
                curveToRelative(-0.13f, 0.0f, -0.19f, 0.06f, -0.19f, 0.18f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.19f, 0.17f)
                curveToRelative(0.88f, -0.02f, 1.68f, -0.26f, 2.41f, -0.72f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.05f, 1.73f, -1.8f)
                reflectiveCurveToRelative(0.63f, -1.57f, 0.63f, -2.45f)
                curveToRelative(0.0f, -0.9f, -0.22f, -1.73f, -0.67f, -2.48f)
                curveToRelative(-0.44f, -0.76f, -1.05f, -1.35f, -1.81f, -1.79f)
                reflectiveCurveToRelative(-1.59f, -0.65f, -2.49f, -0.65f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-0.33f, -1.34f, -1.03f, -2.43f, -2.1f, -3.29f)
                reflectiveCurveToRelative(-2.31f, -1.28f, -3.69f, -1.28f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.11f, 3.37f)
                curveToRelative(-1.1f, 0.26f, -2.01f, 0.84f, -2.73f, 1.74f)
                reflectiveCurveTo(4.61f, 15.73f, 4.61f, 16.88f)
                close()
                moveTo(11.58f, 18.4f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.44f, 0.24f, 0.6f)
                lineToRelative(2.59f, 2.61f)
                curveToRelative(0.12f, 0.16f, 0.32f, 0.23f, 0.57f, 0.23f)
                curveToRelative(0.28f, 0.0f, 0.48f, -0.08f, 0.61f, -0.23f)
                lineToRelative(2.6f, -2.61f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.38f, 0.24f, -0.6f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.24f, -0.58f)
                reflectiveCurveToRelative(-0.36f, -0.23f, -0.6f, -0.23f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.62f, 0.23f)
                lineToRelative(-1.12f, 1.11f)
                verticalLineToRelative(-3.98f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.43f, -0.25f, -0.59f)
                curveToRelative(-0.17f, -0.16f, -0.37f, -0.23f, -0.61f, -0.23f)
                reflectiveCurveToRelative(-0.43f, 0.08f, -0.59f, 0.23f)
                curveToRelative(-0.16f, 0.16f, -0.23f, 0.35f, -0.23f, 0.59f)
                verticalLineToRelative(3.98f)
                lineToRelative(-1.1f, -1.11f)
                curveToRelative(-0.18f, -0.16f, -0.38f, -0.23f, -0.63f, -0.23f)
                curveToRelative(-0.25f, 0.0f, -0.45f, 0.08f, -0.61f, 0.23f)
                curveTo(11.66f, 17.97f, 11.58f, 18.17f, 11.58f, 18.4f)
                close()
            }
        }
        .build()
        return _cloudDown!!
    }

private var _cloudDown: ImageVector? = null
