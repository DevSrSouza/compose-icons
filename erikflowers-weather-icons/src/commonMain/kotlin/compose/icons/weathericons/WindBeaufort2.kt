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

public val WeatherIcons.WindBeaufort2: ImageVector
    get() {
        if (_windBeaufort2 != null) {
            return _windBeaufort2!!
        }
        _windBeaufort2 = Builder(name = "WindBeaufort2", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.94f, 13.5f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.31f, 0.17f, 0.4f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.17f, 0.42f, 0.17f)
                horizontalLineToRelative(10.4f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.19f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.28f, 0.2f, 0.46f)
                reflectiveCurveToRelative(-0.07f, 0.34f, -0.2f, 0.47f)
                reflectiveCurveToRelative(-0.28f, 0.2f, -0.46f, 0.2f)
                curveToRelative(-0.18f, 0.0f, -0.34f, -0.07f, -0.47f, -0.21f)
                curveToRelative(-0.12f, -0.11f, -0.26f, -0.16f, -0.4f, -0.16f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.05f, -0.41f, 0.16f)
                curveToRelative(-0.11f, 0.11f, -0.16f, 0.24f, -0.16f, 0.39f)
                curveToRelative(0.0f, 0.16f, 0.06f, 0.3f, 0.17f, 0.41f)
                curveToRelative(0.36f, 0.36f, 0.78f, 0.53f, 1.27f, 0.53f)
                reflectiveCurveToRelative(0.91f, -0.17f, 1.26f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.92f, -0.52f, -1.27f)
                curveToRelative(-0.35f, -0.35f, -0.77f, -0.53f, -1.26f, -0.53f)
                horizontalLineTo(5.53f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(4.99f, 13.21f, 4.94f, 13.34f, 4.94f, 13.5f)
                close()
                moveTo(4.94f, 11.48f)
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
                curveTo(19.0f, 9.66f, 19.15f, 9.6f, 19.34f, 9.6f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.18f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.27f, 0.2f, 0.45f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.28f, 0.2f, -0.46f, 0.2f)
                horizontalLineTo(5.53f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(4.99f, 11.18f, 4.94f, 11.32f, 4.94f, 11.48f)
                close()
                moveTo(17.66f, 21.85f)
                horizontalLineToRelative(6.62f)
                lineToRelative(0.4f, -1.89f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-0.03f)
                curveToRelative(0.2f, -0.09f, 0.49f, -0.22f, 0.86f, -0.37f)
                curveToRelative(0.38f, -0.15f, 0.69f, -0.28f, 0.95f, -0.38f)
                reflectiveCurveToRelative(0.55f, -0.25f, 0.87f, -0.44f)
                reflectiveCurveToRelative(0.57f, -0.38f, 0.77f, -0.57f)
                curveToRelative(0.19f, -0.19f, 0.36f, -0.44f, 0.5f, -0.75f)
                reflectiveCurveToRelative(0.21f, -0.64f, 0.21f, -1.0f)
                curveToRelative(0.0f, -0.56f, -0.14f, -1.02f, -0.43f, -1.4f)
                reflectiveCurveToRelative(-0.65f, -0.65f, -1.08f, -0.81f)
                curveToRelative(-0.43f, -0.16f, -0.92f, -0.24f, -1.45f, -0.24f)
                curveToRelative(-0.97f, 0.0f, -1.76f, 0.26f, -2.38f, 0.78f)
                curveToRelative(-0.62f, 0.52f, -0.98f, 1.29f, -1.1f, 2.31f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.0f, -0.37f, 0.11f, -0.68f, 0.32f, -0.94f)
                curveToRelative(0.22f, -0.26f, 0.52f, -0.38f, 0.91f, -0.38f)
                curveToRelative(0.3f, 0.0f, 0.52f, 0.08f, 0.67f, 0.24f)
                reflectiveCurveToRelative(0.23f, 0.34f, 0.23f, 0.54f)
                curveToRelative(0.0f, 0.12f, -0.01f, 0.23f, -0.03f, 0.32f)
                reflectiveCurveToRelative(-0.07f, 0.19f, -0.15f, 0.28f)
                reflectiveCurveToRelative(-0.15f, 0.16f, -0.21f, 0.22f)
                reflectiveCurveToRelative(-0.17f, 0.13f, -0.34f, 0.23f)
                curveToRelative(-0.17f, 0.09f, -0.3f, 0.17f, -0.4f, 0.22f)
                curveToRelative(-0.1f, 0.05f, -0.27f, 0.13f, -0.53f, 0.25f)
                curveToRelative(-0.88f, 0.43f, -1.43f, 0.71f, -1.64f, 0.83f)
                curveToRelative(-0.8f, 0.48f, -1.35f, 1.07f, -1.66f, 1.78f)
                curveTo(17.82f, 21.01f, 17.71f, 21.41f, 17.66f, 21.85f)
                close()
            }
        }
        .build()
        return _windBeaufort2!!
    }

private var _windBeaufort2: ImageVector? = null
