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

public val WeatherIcons.CloudyGusts: ImageVector
    get() {
        if (_cloudyGusts != null) {
            return _cloudyGusts!!
        }
        _cloudyGusts = Builder(name = "CloudyGusts", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.62f, 21.01f)
                curveToRelative(0.0f, -0.25f, 0.08f, -0.46f, 0.25f, -0.63f)
                curveToRelative(0.17f, -0.16f, 0.37f, -0.24f, 0.6f, -0.24f)
                horizontalLineToRelative(5.42f)
                curveToRelative(0.74f, 0.0f, 1.37f, 0.26f, 1.89f, 0.79f)
                curveToRelative(0.52f, 0.53f, 0.78f, 1.16f, 0.78f, 1.9f)
                curveToRelative(0.0f, 0.74f, -0.26f, 1.38f, -0.78f, 1.9f)
                curveToRelative(-0.52f, 0.52f, -1.15f, 0.78f, -1.89f, 0.78f)
                reflectiveCurveToRelative(-1.38f, -0.26f, -1.9f, -0.79f)
                curveToRelative(-0.16f, -0.16f, -0.23f, -0.36f, -0.23f, -0.6f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.45f, 0.23f, -0.6f)
                curveToRelative(0.15f, -0.16f, 0.35f, -0.24f, 0.6f, -0.24f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.08f, 0.61f, 0.24f)
                curveToRelative(0.2f, 0.19f, 0.43f, 0.29f, 0.69f, 0.29f)
                reflectiveCurveToRelative(0.49f, -0.1f, 0.68f, -0.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.42f, 0.29f, -0.7f)
                curveToRelative(0.0f, -0.26f, -0.1f, -0.49f, -0.29f, -0.68f)
                reflectiveCurveToRelative(-0.42f, -0.29f, -0.68f, -0.29f)
                horizontalLineTo(4.47f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.6f, -0.25f)
                reflectiveCurveTo(3.62f, 21.25f, 3.62f, 21.01f)
                close()
                moveTo(3.62f, 17.97f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.45f, 0.25f, -0.62f)
                curveToRelative(0.17f, -0.16f, 0.37f, -0.24f, 0.6f, -0.24f)
                horizontalLineToRelative(10.55f)
                curveToRelative(0.26f, 0.0f, 0.49f, -0.1f, 0.68f, -0.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.43f, 0.29f, -0.69f)
                reflectiveCurveToRelative(-0.1f, -0.5f, -0.29f, -0.69f)
                curveToRelative(-0.19f, -0.19f, -0.42f, -0.29f, -0.68f, -0.29f)
                curveToRelative(-0.28f, 0.0f, -0.5f, 0.09f, -0.68f, 0.28f)
                curveToRelative(-0.18f, 0.15f, -0.39f, 0.23f, -0.64f, 0.23f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.23f)
                curveToRelative(-0.15f, -0.15f, -0.23f, -0.35f, -0.23f, -0.6f)
                curveToRelative(0.0f, -0.25f, 0.07f, -0.45f, 0.23f, -0.61f)
                curveToRelative(0.51f, -0.51f, 1.15f, -0.76f, 1.92f, -0.76f)
                curveToRelative(0.74f, 0.0f, 1.38f, 0.26f, 1.9f, 0.78f)
                curveToRelative(0.52f, 0.52f, 0.78f, 1.15f, 0.78f, 1.88f)
                reflectiveCurveToRelative(-0.26f, 1.37f, -0.78f, 1.89f)
                curveToRelative(-0.52f, 0.52f, -1.15f, 0.78f, -1.9f, 0.78f)
                horizontalLineTo(4.47f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.24f)
                curveTo(3.7f, 18.4f, 3.62f, 18.2f, 3.62f, 17.97f)
                close()
                moveTo(5.77f, 15.61f)
                curveToRelative(0.0f, 0.08f, 0.05f, 0.12f, 0.16f, 0.12f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.08f, 0.0f, 0.15f, -0.05f, 0.22f, -0.15f)
                curveToRelative(0.22f, -0.54f, 0.58f, -0.99f, 1.05f, -1.35f)
                curveToRelative(0.48f, -0.36f, 1.01f, -0.56f, 1.59f, -0.6f)
                lineToRelative(0.53f, -0.08f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                reflectiveCurveToRelative(1.76f, -1.1f, 2.86f, -1.1f)
                curveToRelative(1.11f, 0.0f, 2.07f, 0.36f, 2.88f, 1.09f)
                curveToRelative(0.81f, 0.73f, 1.27f, 1.64f, 1.39f, 2.73f)
                lineToRelative(0.07f, 0.59f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.17f, 0.17f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.33f, 0.96f)
                curveToRelative(0.65f, 0.64f, 0.97f, 1.4f, 0.97f, 2.3f)
                curveToRelative(0.0f, 0.89f, -0.32f, 1.66f, -0.97f, 2.3f)
                curveToRelative(-0.65f, 0.64f, -1.42f, 0.96f, -2.33f, 0.96f)
                horizontalLineToRelative(-6.91f)
                curveToRelative(-0.12f, 0.0f, -0.19f, 0.06f, -0.19f, 0.17f)
                verticalLineToRelative(1.39f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.19f, 0.17f)
                horizontalLineToRelative(6.91f)
                curveToRelative(0.91f, 0.0f, 1.74f, -0.22f, 2.51f, -0.67f)
                curveToRelative(0.77f, -0.44f, 1.37f, -1.05f, 1.82f, -1.81f)
                curveToRelative(0.45f, -0.77f, 0.67f, -1.6f, 0.67f, -2.5f)
                curveToRelative(0.0f, -0.91f, -0.22f, -1.74f, -0.67f, -2.5f)
                curveToRelative(-0.45f, -0.76f, -1.05f, -1.37f, -1.82f, -1.81f)
                curveToRelative(-0.77f, -0.44f, -1.6f, -0.67f, -2.51f, -0.67f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.31f, -1.33f, -1.01f, -2.42f, -2.1f, -3.27f)
                curveToRelative(-1.08f, -0.85f, -2.33f, -1.27f, -3.73f, -1.27f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.32f)
                reflectiveCurveToRelative(-1.78f, 2.0f, -2.07f, 3.37f)
                curveToRelative(-0.86f, 0.2f, -1.62f, 0.61f, -2.28f, 1.23f)
                reflectiveCurveToRelative(-1.12f, 1.36f, -1.38f, 2.21f)
                verticalLineToRelative(0.04f)
                curveTo(5.77f, 15.56f, 5.77f, 15.58f, 5.77f, 15.61f)
                close()
            }
        }
        .build()
        return _cloudyGusts!!
    }

private var _cloudyGusts: ImageVector? = null
