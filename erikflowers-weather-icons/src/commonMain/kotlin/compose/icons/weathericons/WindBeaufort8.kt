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

public val WeatherIcons.WindBeaufort8: ImageVector
    get() {
        if (_windBeaufort8 != null) {
            return _windBeaufort8!!
        }
        _windBeaufort8 = Builder(name = "WindBeaufort8", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.99f, 13.5f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.31f, 0.17f, 0.4f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.17f, 0.42f, 0.17f)
                horizontalLineToRelative(10.4f)
                curveToRelative(0.18f, 0.0f, 0.33f, 0.06f, 0.46f, 0.19f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.28f, 0.2f, 0.46f)
                reflectiveCurveToRelative(-0.07f, 0.34f, -0.2f, 0.47f)
                reflectiveCurveToRelative(-0.28f, 0.2f, -0.46f, 0.2f)
                curveToRelative(-0.18f, 0.0f, -0.34f, -0.07f, -0.47f, -0.21f)
                curveToRelative(-0.13f, -0.11f, -0.26f, -0.16f, -0.4f, -0.16f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.05f, -0.41f, 0.16f)
                curveToRelative(-0.11f, 0.11f, -0.16f, 0.24f, -0.16f, 0.39f)
                curveToRelative(0.0f, 0.16f, 0.06f, 0.3f, 0.17f, 0.41f)
                curveToRelative(0.36f, 0.36f, 0.78f, 0.53f, 1.28f, 0.53f)
                curveToRelative(0.49f, 0.0f, 0.91f, -0.17f, 1.26f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.92f, -0.52f, -1.27f)
                curveToRelative(-0.35f, -0.35f, -0.77f, -0.53f, -1.26f, -0.53f)
                horizontalLineTo(5.58f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(5.05f, 13.21f, 4.99f, 13.34f, 4.99f, 13.5f)
                close()
                moveTo(4.99f, 11.48f)
                curveToRelative(0.0f, 0.17f, 0.06f, 0.3f, 0.17f, 0.39f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.16f, 0.42f, 0.16f)
                horizontalLineToRelative(13.81f)
                curveToRelative(0.49f, 0.0f, 0.92f, -0.18f, 1.27f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.91f, -0.52f, -1.26f)
                reflectiveCurveToRelative(-0.77f, -0.52f, -1.27f, -0.52f)
                curveToRelative(-0.49f, 0.0f, -0.91f, 0.17f, -1.27f, 0.51f)
                curveToRelative(-0.11f, 0.12f, -0.16f, 0.27f, -0.16f, 0.42f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.3f, 0.16f, 0.4f)
                curveToRelative(0.11f, 0.1f, 0.24f, 0.15f, 0.4f, 0.15f)
                curveToRelative(0.15f, 0.0f, 0.29f, -0.05f, 0.41f, -0.16f)
                curveToRelative(0.12f, -0.12f, 0.27f, -0.18f, 0.45f, -0.18f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.18f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.27f, 0.2f, 0.45f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.28f, 0.2f, -0.46f, 0.2f)
                horizontalLineTo(5.58f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(5.05f, 11.18f, 4.99f, 11.32f, 4.99f, 11.48f)
                close()
                moveTo(17.99f, 19.67f)
                curveToRelative(0.0f, 0.73f, 0.29f, 1.29f, 0.86f, 1.66f)
                curveToRelative(0.57f, 0.38f, 1.34f, 0.57f, 2.31f, 0.57f)
                curveToRelative(0.59f, 0.0f, 1.12f, -0.06f, 1.57f, -0.18f)
                curveToRelative(0.46f, -0.12f, 0.81f, -0.27f, 1.07f, -0.44f)
                reflectiveCurveToRelative(0.46f, -0.38f, 0.62f, -0.62f)
                curveToRelative(0.16f, -0.24f, 0.26f, -0.46f, 0.31f, -0.66f)
                curveToRelative(0.05f, -0.2f, 0.08f, -0.4f, 0.08f, -0.61f)
                curveToRelative(0.0f, -0.41f, -0.12f, -0.77f, -0.36f, -1.06f)
                curveToRelative(-0.24f, -0.3f, -0.55f, -0.49f, -0.94f, -0.57f)
                lineToRelative(0.02f, -0.03f)
                verticalLineToRelative(0.01f)
                curveToRelative(0.45f, -0.06f, 0.82f, -0.26f, 1.12f, -0.6f)
                curveToRelative(0.29f, -0.33f, 0.44f, -0.73f, 0.44f, -1.19f)
                curveToRelative(0.0f, -0.38f, -0.09f, -0.71f, -0.26f, -0.98f)
                reflectiveCurveToRelative(-0.41f, -0.48f, -0.71f, -0.61f)
                curveToRelative(-0.3f, -0.14f, -0.61f, -0.24f, -0.92f, -0.3f)
                curveToRelative(-0.31f, -0.06f, -0.65f, -0.09f, -1.01f, -0.09f)
                curveToRelative(-0.48f, 0.0f, -0.9f, 0.05f, -1.28f, 0.14f)
                curveToRelative(-0.38f, 0.09f, -0.69f, 0.22f, -0.93f, 0.37f)
                curveToRelative(-0.24f, 0.15f, -0.43f, 0.33f, -0.59f, 0.53f)
                reflectiveCurveToRelative(-0.27f, 0.4f, -0.33f, 0.6f)
                curveToRelative(-0.06f, 0.2f, -0.09f, 0.41f, -0.09f, 0.62f)
                curveToRelative(0.0f, 0.34f, 0.09f, 0.64f, 0.27f, 0.9f)
                curveToRelative(0.18f, 0.26f, 0.43f, 0.43f, 0.75f, 0.53f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.56f, 0.06f, -1.04f, 0.27f, -1.42f, 0.61f)
                curveTo(18.18f, 18.67f, 17.99f, 19.12f, 17.99f, 19.67f)
                close()
                moveTo(20.1f, 19.44f)
                curveToRelative(0.0f, -0.35f, 0.14f, -0.61f, 0.42f, -0.77f)
                reflectiveCurveToRelative(0.62f, -0.24f, 1.01f, -0.24f)
                curveToRelative(0.41f, 0.0f, 0.7f, 0.09f, 0.89f, 0.28f)
                curveToRelative(0.18f, 0.18f, 0.28f, 0.38f, 0.28f, 0.6f)
                verticalLineToRelative(0.13f)
                curveToRelative(0.0f, 0.28f, -0.13f, 0.49f, -0.38f, 0.64f)
                curveToRelative(-0.25f, 0.14f, -0.58f, 0.22f, -0.97f, 0.22f)
                lineToRelative(0.03f, -0.01f)
                curveToRelative(-0.14f, 0.0f, -0.27f, -0.01f, -0.4f, -0.03f)
                reflectiveCurveToRelative(-0.27f, -0.06f, -0.41f, -0.11f)
                curveToRelative(-0.14f, -0.06f, -0.25f, -0.14f, -0.34f, -0.26f)
                curveTo(20.15f, 19.76f, 20.1f, 19.61f, 20.1f, 19.44f)
                close()
                moveTo(20.86f, 16.37f)
                curveToRelative(0.0f, -0.32f, 0.12f, -0.55f, 0.37f, -0.69f)
                reflectiveCurveToRelative(0.55f, -0.22f, 0.9f, -0.22f)
                curveToRelative(0.3f, 0.0f, 0.55f, 0.07f, 0.76f, 0.2f)
                reflectiveCurveToRelative(0.31f, 0.35f, 0.31f, 0.63f)
                curveToRelative(0.0f, 0.07f, -0.02f, 0.15f, -0.05f, 0.23f)
                curveToRelative(-0.03f, 0.08f, -0.09f, 0.17f, -0.17f, 0.27f)
                curveToRelative(-0.08f, 0.1f, -0.21f, 0.18f, -0.39f, 0.24f)
                curveToRelative(-0.18f, 0.06f, -0.4f, 0.09f, -0.66f, 0.09f)
                curveToRelative(-0.4f, 0.0f, -0.68f, -0.08f, -0.84f, -0.23f)
                curveTo(20.94f, 16.75f, 20.86f, 16.57f, 20.86f, 16.37f)
                close()
            }
        }
        .build()
        return _windBeaufort8!!
    }

private var _windBeaufort8: ImageVector? = null
