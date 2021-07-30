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

public val WeatherIcons.WindBeaufort12: ImageVector
    get() {
        if (_windBeaufort12 != null) {
            return _windBeaufort12!!
        }
        _windBeaufort12 = Builder(name = "WindBeaufort12", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.07f, 13.5f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.31f, 0.17f, 0.4f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.17f, 0.42f, 0.17f)
                horizontalLineToRelative(10.4f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.19f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.28f, 0.2f, 0.46f)
                reflectiveCurveToRelative(-0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.28f, 0.2f, -0.46f, 0.2f)
                curveToRelative(-0.18f, 0.0f, -0.34f, -0.07f, -0.47f, -0.21f)
                curveToRelative(-0.13f, -0.11f, -0.26f, -0.16f, -0.4f, -0.16f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.05f, -0.41f, 0.16f)
                curveToRelative(-0.11f, 0.11f, -0.16f, 0.24f, -0.16f, 0.39f)
                curveToRelative(0.0f, 0.16f, 0.06f, 0.3f, 0.17f, 0.41f)
                curveToRelative(0.36f, 0.36f, 0.78f, 0.53f, 1.28f, 0.53f)
                reflectiveCurveToRelative(0.91f, -0.17f, 1.26f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.92f, -0.52f, -1.27f)
                curveToRelative(-0.35f, -0.35f, -0.77f, -0.53f, -1.26f, -0.53f)
                horizontalLineTo(3.66f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(3.13f, 13.21f, 3.07f, 13.34f, 3.07f, 13.5f)
                close()
                moveTo(3.07f, 11.48f)
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
                horizontalLineTo(3.66f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(3.13f, 11.18f, 3.07f, 11.32f, 3.07f, 11.48f)
                close()
                moveTo(15.96f, 21.9f)
                horizontalLineToRelative(2.47f)
                lineToRelative(1.65f, -7.99f)
                horizontalLineToRelative(-2.47f)
                lineTo(15.96f, 21.9f)
                close()
                moveTo(19.51f, 21.9f)
                horizontalLineToRelative(6.62f)
                lineToRelative(0.4f, -1.9f)
                horizontalLineToRelative(-3.67f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.2f, -0.09f, 0.49f, -0.22f, 0.86f, -0.37f)
                curveToRelative(0.38f, -0.15f, 0.69f, -0.28f, 0.95f, -0.38f)
                reflectiveCurveToRelative(0.54f, -0.25f, 0.86f, -0.44f)
                curveToRelative(0.32f, -0.19f, 0.58f, -0.38f, 0.77f, -0.58f)
                reflectiveCurveToRelative(0.36f, -0.45f, 0.5f, -0.75f)
                reflectiveCurveToRelative(0.21f, -0.64f, 0.21f, -1.0f)
                curveToRelative(0.0f, -0.56f, -0.14f, -1.02f, -0.43f, -1.4f)
                curveToRelative(-0.29f, -0.38f, -0.65f, -0.64f, -1.08f, -0.8f)
                curveToRelative(-0.43f, -0.16f, -0.92f, -0.23f, -1.45f, -0.23f)
                curveToRelative(-0.97f, 0.0f, -1.76f, 0.26f, -2.37f, 0.78f)
                curveToRelative(-0.61f, 0.52f, -0.98f, 1.29f, -1.1f, 2.31f)
                horizontalLineToRelative(2.07f)
                curveToRelative(0.0f, -0.38f, 0.11f, -0.69f, 0.33f, -0.95f)
                curveToRelative(0.22f, -0.26f, 0.53f, -0.38f, 0.93f, -0.38f)
                curveToRelative(0.3f, 0.0f, 0.52f, 0.08f, 0.67f, 0.24f)
                curveToRelative(0.15f, 0.16f, 0.22f, 0.34f, 0.22f, 0.55f)
                curveToRelative(0.0f, 0.32f, -0.11f, 0.58f, -0.33f, 0.76f)
                curveToRelative(-0.22f, 0.18f, -0.63f, 0.42f, -1.25f, 0.72f)
                curveToRelative(-0.04f, 0.01f, -0.07f, 0.02f, -0.08f, 0.04f)
                curveToRelative(-0.89f, 0.43f, -1.44f, 0.7f, -1.65f, 0.83f)
                curveToRelative(-0.79f, 0.47f, -1.34f, 1.06f, -1.65f, 1.74f)
                curveTo(19.68f, 21.03f, 19.57f, 21.44f, 19.51f, 21.9f)
                close()
            }
        }
        .build()
        return _windBeaufort12!!
    }

private var _windBeaufort12: ImageVector? = null
