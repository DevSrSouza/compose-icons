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

public val WeatherIcons.Raindrops: ImageVector
    get() {
        if (_raindrops != null) {
            return _raindrops!!
        }
        _raindrops = Builder(name = "Raindrops", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.01f, 12.23f)
                curveToRelative(0.0f, -0.26f, 0.13f, -0.59f, 0.38f, -1.01f)
                curveToRelative(0.25f, -0.42f, 0.5f, -0.77f, 0.73f, -1.04f)
                curveToRelative(0.06f, -0.07f, 0.14f, -0.17f, 0.23f, -0.28f)
                reflectiveCurveToRelative(0.15f, -0.17f, 0.16f, -0.18f)
                lineToRelative(0.37f, 0.43f)
                curveToRelative(0.28f, 0.31f, 0.53f, 0.66f, 0.76f, 1.07f)
                curveToRelative(0.23f, 0.41f, 0.35f, 0.74f, 0.35f, 1.01f)
                curveToRelative(0.0f, 0.41f, -0.14f, 0.77f, -0.43f, 1.06f)
                curveToRelative(-0.28f, 0.29f, -0.63f, 0.44f, -1.05f, 0.44f)
                curveToRelative(-0.41f, 0.0f, -0.77f, -0.15f, -1.06f, -0.44f)
                curveTo(11.16f, 12.99f, 11.01f, 12.64f, 11.01f, 12.23f)
                close()
                moveTo(14.13f, 16.38f)
                curveToRelative(0.0f, -0.29f, 0.08f, -0.62f, 0.24f, -1.01f)
                curveToRelative(0.16f, -0.38f, 0.36f, -0.74f, 0.6f, -1.06f)
                curveToRelative(0.46f, -0.61f, 0.89f, -1.12f, 1.31f, -1.53f)
                curveToRelative(0.04f, -0.03f, 0.13f, -0.11f, 0.26f, -0.24f)
                lineToRelative(0.25f, 0.24f)
                curveToRelative(0.39f, 0.37f, 0.83f, 0.88f, 1.32f, 1.52f)
                curveToRelative(0.26f, 0.34f, 0.46f, 0.7f, 0.62f, 1.08f)
                reflectiveCurveToRelative(0.24f, 0.71f, 0.24f, 1.0f)
                curveToRelative(0.0f, 0.69f, -0.23f, 1.26f, -0.7f, 1.73f)
                curveToRelative(-0.47f, 0.47f, -1.05f, 0.7f, -1.73f, 0.7f)
                curveToRelative(-0.68f, 0.0f, -1.25f, -0.24f, -1.72f, -0.71f)
                reflectiveCurveTo(14.13f, 17.05f, 14.13f, 16.38f)
                close()
                moveTo(15.65f, 9.48f)
                curveToRelative(0.0f, -0.43f, 0.33f, -1.0f, 1.0f, -1.7f)
                lineToRelative(0.25f, 0.28f)
                curveToRelative(0.19f, 0.22f, 0.36f, 0.46f, 0.51f, 0.74f)
                curveToRelative(0.15f, 0.27f, 0.23f, 0.5f, 0.23f, 0.68f)
                curveToRelative(0.0f, 0.28f, -0.1f, 0.5f, -0.29f, 0.69f)
                curveToRelative(-0.19f, 0.18f, -0.42f, 0.28f, -0.7f, 0.28f)
                curveToRelative(-0.29f, 0.0f, -0.53f, -0.09f, -0.72f, -0.28f)
                curveTo(15.75f, 9.98f, 15.65f, 9.75f, 15.65f, 9.48f)
                close()
            }
        }
        .build()
        return _raindrops!!
    }

private var _raindrops: ImageVector? = null
