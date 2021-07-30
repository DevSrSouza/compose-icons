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

public val WeatherIcons.WindBeaufort10: ImageVector
    get() {
        if (_windBeaufort10 != null) {
            return _windBeaufort10!!
        }
        _windBeaufort10 = Builder(name = "WindBeaufort10", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.15f, 13.5f)
                curveToRelative(0.0f, 0.18f, 0.06f, 0.31f, 0.17f, 0.4f)
                curveToRelative(0.12f, 0.11f, 0.26f, 0.17f, 0.42f, 0.17f)
                horizontalLineToRelative(10.4f)
                curveToRelative(0.18f, 0.0f, 0.33f, 0.06f, 0.46f, 0.19f)
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
                reflectiveCurveToRelative(0.52f, -0.77f, 0.52f, -1.27f)
                curveToRelative(0.0f, -0.49f, -0.17f, -0.92f, -0.52f, -1.27f)
                curveToRelative(-0.35f, -0.35f, -0.77f, -0.53f, -1.26f, -0.53f)
                horizontalLineTo(3.75f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(3.21f, 13.21f, 3.15f, 13.34f, 3.15f, 13.5f)
                close()
                moveTo(3.15f, 11.48f)
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
                horizontalLineTo(3.75f)
                curveToRelative(-0.16f, 0.0f, -0.3f, 0.06f, -0.42f, 0.17f)
                curveTo(3.21f, 11.18f, 3.15f, 11.32f, 3.15f, 11.48f)
                close()
                moveTo(15.97f, 21.8f)
                horizontalLineToRelative(2.46f)
                lineToRelative(1.64f, -7.94f)
                horizontalLineToRelative(-2.45f)
                lineTo(15.97f, 21.8f)
                close()
                moveTo(20.16f, 18.88f)
                curveToRelative(0.0f, 0.52f, 0.08f, 0.98f, 0.24f, 1.38f)
                reflectiveCurveToRelative(0.38f, 0.72f, 0.66f, 0.95f)
                curveToRelative(0.27f, 0.23f, 0.58f, 0.4f, 0.9f, 0.52f)
                reflectiveCurveToRelative(0.68f, 0.17f, 1.05f, 0.17f)
                curveToRelative(0.61f, 0.0f, 1.16f, -0.12f, 1.64f, -0.38f)
                curveToRelative(0.48f, -0.25f, 0.86f, -0.56f, 1.13f, -0.93f)
                curveToRelative(0.27f, -0.37f, 0.5f, -0.79f, 0.68f, -1.25f)
                curveToRelative(0.18f, -0.47f, 0.3f, -0.89f, 0.37f, -1.27f)
                curveToRelative(0.06f, -0.38f, 0.09f, -0.73f, 0.09f, -1.05f)
                curveToRelative(0.0f, -0.97f, -0.27f, -1.72f, -0.8f, -2.25f)
                reflectiveCurveToRelative(-1.24f, -0.8f, -2.13f, -0.8f)
                curveToRelative(-1.03f, 0.0f, -1.93f, 0.46f, -2.7f, 1.37f)
                curveTo(20.54f, 16.26f, 20.16f, 17.44f, 20.16f, 18.88f)
                close()
                moveTo(22.21f, 18.98f)
                curveToRelative(0.0f, -0.16f, 0.01f, -0.35f, 0.04f, -0.59f)
                curveToRelative(0.03f, -0.23f, 0.08f, -0.51f, 0.16f, -0.84f)
                curveToRelative(0.08f, -0.32f, 0.18f, -0.62f, 0.3f, -0.9f)
                curveToRelative(0.12f, -0.27f, 0.29f, -0.5f, 0.52f, -0.69f)
                curveToRelative(0.22f, -0.19f, 0.47f, -0.29f, 0.75f, -0.29f)
                curveToRelative(0.27f, 0.0f, 0.48f, 0.09f, 0.65f, 0.27f)
                curveToRelative(0.16f, 0.18f, 0.24f, 0.44f, 0.24f, 0.79f)
                curveToRelative(0.0f, 0.96f, -0.17f, 1.78f, -0.5f, 2.45f)
                reflectiveCurveToRelative(-0.75f, 1.01f, -1.23f, 1.01f)
                curveTo(22.52f, 20.19f, 22.21f, 19.79f, 22.21f, 18.98f)
                close()
            }
        }
        .build()
        return _windBeaufort10!!
    }

private var _windBeaufort10: ImageVector? = null
