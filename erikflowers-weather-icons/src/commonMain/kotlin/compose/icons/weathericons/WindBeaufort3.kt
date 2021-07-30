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

public val WeatherIcons.WindBeaufort3: ImageVector
    get() {
        if (_windBeaufort3 != null) {
            return _windBeaufort3!!
        }
        _windBeaufort3 = Builder(name = "WindBeaufort3", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.03f, 13.5f)
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
                horizontalLineTo(5.62f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(5.09f, 13.21f, 5.03f, 13.34f, 5.03f, 13.5f)
                close()
                moveTo(5.03f, 11.48f)
                curveToRelative(0.0f, 0.17f, 0.06f, 0.3f, 0.17f, 0.39f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.16f, 0.42f, 0.16f)
                horizontalLineToRelative(13.81f)
                curveToRelative(0.49f, 0.0f, 0.92f, -0.18f, 1.27f, -0.52f)
                curveToRelative(0.35f, -0.35f, 0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.91f, -0.52f, -1.26f)
                reflectiveCurveToRelative(-0.77f, -0.52f, -1.27f, -0.52f)
                curveToRelative(-0.49f, 0.0f, -0.91f, 0.17f, -1.27f, 0.51f)
                curveTo(18.06f, 9.09f, 18.0f, 9.23f, 18.0f, 9.38f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.3f, 0.16f, 0.4f)
                curveToRelative(0.11f, 0.1f, 0.24f, 0.15f, 0.4f, 0.15f)
                curveToRelative(0.15f, 0.0f, 0.29f, -0.05f, 0.41f, -0.16f)
                curveToRelative(0.12f, -0.12f, 0.27f, -0.18f, 0.45f, -0.18f)
                curveToRelative(0.17f, 0.0f, 0.33f, 0.06f, 0.46f, 0.18f)
                curveToRelative(0.13f, 0.12f, 0.2f, 0.27f, 0.2f, 0.45f)
                curveToRelative(0.0f, 0.18f, -0.07f, 0.34f, -0.2f, 0.47f)
                curveToRelative(-0.13f, 0.13f, -0.28f, 0.2f, -0.46f, 0.2f)
                horizontalLineTo(5.62f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(5.09f, 11.18f, 5.03f, 11.32f, 5.03f, 11.48f)
                close()
                moveTo(18.12f, 19.52f)
                curveToRelative(0.0f, 0.27f, 0.05f, 0.53f, 0.16f, 0.79f)
                curveToRelative(0.11f, 0.26f, 0.27f, 0.5f, 0.5f, 0.75f)
                curveToRelative(0.23f, 0.24f, 0.55f, 0.43f, 0.96f, 0.58f)
                reflectiveCurveToRelative(0.9f, 0.22f, 1.46f, 0.22f)
                curveToRelative(1.21f, 0.0f, 2.08f, -0.24f, 2.63f, -0.72f)
                curveToRelative(0.55f, -0.48f, 0.82f, -1.13f, 0.82f, -1.95f)
                curveToRelative(0.0f, -0.36f, -0.1f, -0.69f, -0.3f, -0.99f)
                curveToRelative(-0.2f, -0.3f, -0.47f, -0.47f, -0.79f, -0.51f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.43f, -0.08f, 0.79f, -0.27f, 1.07f, -0.58f)
                curveToRelative(0.28f, -0.31f, 0.43f, -0.69f, 0.43f, -1.12f)
                curveToRelative(0.0f, -0.31f, -0.06f, -0.58f, -0.17f, -0.82f)
                curveToRelative(-0.11f, -0.24f, -0.26f, -0.43f, -0.44f, -0.58f)
                curveToRelative(-0.18f, -0.15f, -0.39f, -0.27f, -0.64f, -0.37f)
                curveToRelative(-0.25f, -0.1f, -0.5f, -0.16f, -0.75f, -0.2f)
                curveToRelative(-0.25f, -0.04f, -0.52f, -0.06f, -0.8f, -0.06f)
                curveToRelative(-0.92f, 0.0f, -1.68f, 0.22f, -2.28f, 0.67f)
                curveToRelative(-0.59f, 0.45f, -0.96f, 1.12f, -1.1f, 2.01f)
                horizontalLineToRelative(2.03f)
                curveToRelative(0.04f, -0.31f, 0.17f, -0.55f, 0.38f, -0.72f)
                curveToRelative(0.21f, -0.17f, 0.47f, -0.26f, 0.78f, -0.26f)
                curveToRelative(0.29f, 0.0f, 0.51f, 0.06f, 0.68f, 0.18f)
                reflectiveCurveTo(23.0f, 16.11f, 23.0f, 16.32f)
                curveToRelative(0.0f, 0.47f, -0.42f, 0.7f, -1.27f, 0.7f)
                horizontalLineToRelative(-0.47f)
                lineToRelative(-0.29f, 1.4f)
                horizontalLineToRelative(0.44f)
                curveToRelative(0.68f, 0.0f, 1.02f, 0.23f, 1.02f, 0.7f)
                curveToRelative(0.0f, 0.31f, -0.11f, 0.55f, -0.34f, 0.72f)
                curveToRelative(-0.23f, 0.17f, -0.5f, 0.25f, -0.83f, 0.25f)
                curveToRelative(-0.38f, 0.0f, -0.66f, -0.11f, -0.83f, -0.34f)
                curveToRelative(-0.17f, -0.21f, -0.24f, -0.51f, -0.21f, -0.89f)
                horizontalLineToRelative(-2.07f)
                curveTo(18.13f, 19.06f, 18.12f, 19.27f, 18.12f, 19.52f)
                close()
            }
        }
        .build()
        return _windBeaufort3!!
    }

private var _windBeaufort3: ImageVector? = null
