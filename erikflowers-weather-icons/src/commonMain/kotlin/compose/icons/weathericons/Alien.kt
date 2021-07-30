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

public val WeatherIcons.Alien: ImageVector
    get() {
        if (_alien != null) {
            return _alien!!
        }
        _alien = Builder(name = "Alien", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 15.54f)
                curveToRelative(-1.12f, -2.4f, -0.95f, -4.66f, 0.52f, -6.79f)
                curveToRelative(1.03f, -1.48f, 2.6f, -2.39f, 4.73f, -2.72f)
                curveToRelative(0.16f, -0.04f, 0.34f, -0.07f, 0.54f, -0.08f)
                horizontalLineToRelative(0.63f)
                curveToRelative(2.91f, 0.09f, 5.05f, 1.38f, 6.4f, 3.88f)
                curveToRelative(0.64f, 1.18f, 0.8f, 2.48f, 0.48f, 3.91f)
                curveToRelative(-0.26f, 1.13f, -0.68f, 2.19f, -1.28f, 3.17f)
                curveToRelative(-1.29f, 2.01f, -2.63f, 3.64f, -4.0f, 4.88f)
                curveToRelative(-0.07f, 0.07f, -0.17f, 0.16f, -0.3f, 0.26f)
                curveToRelative(-0.46f, 0.35f, -0.89f, 0.53f, -1.28f, 0.54f)
                reflectiveCurveToRelative(-0.83f, -0.14f, -1.31f, -0.45f)
                curveToRelative(-0.29f, -0.17f, -0.53f, -0.37f, -0.74f, -0.59f)
                curveTo(11.18f, 19.55f, 9.71f, 17.55f, 8.75f, 15.54f)
                close()
                moveTo(8.86f, 13.33f)
                curveToRelative(0.02f, 0.11f, 0.05f, 0.25f, 0.09f, 0.44f)
                reflectiveCurveToRelative(0.07f, 0.32f, 0.09f, 0.4f)
                curveToRelative(0.28f, 1.26f, 0.86f, 2.23f, 1.73f, 2.93f)
                curveToRelative(0.88f, 0.7f, 1.96f, 1.11f, 3.26f, 1.23f)
                curveToRelative(0.29f, 0.03f, 0.46f, 0.02f, 0.51f, -0.03f)
                reflectiveCurveToRelative(0.08f, -0.23f, 0.09f, -0.52f)
                curveToRelative(-0.01f, -0.08f, -0.03f, -0.21f, -0.05f, -0.39f)
                curveToRelative(-0.02f, -0.18f, -0.04f, -0.31f, -0.06f, -0.39f)
                curveToRelative(-0.25f, -1.34f, -0.88f, -2.32f, -1.9f, -2.93f)
                curveToRelative(-0.18f, -0.11f, -0.39f, -0.22f, -0.62f, -0.34f)
                reflectiveCurveToRelative(-0.44f, -0.2f, -0.61f, -0.27f)
                curveToRelative(-0.17f, -0.07f, -0.4f, -0.16f, -0.69f, -0.27f)
                curveToRelative(-0.29f, -0.11f, -0.5f, -0.19f, -0.63f, -0.25f)
                curveToRelative(-0.16f, -0.06f, -0.42f, -0.1f, -0.8f, -0.11f)
                curveTo(8.95f, 12.83f, 8.81f, 13.0f, 8.86f, 13.33f)
                close()
                moveTo(15.66f, 17.73f)
                curveToRelative(-0.02f, 0.31f, 0.0f, 0.49f, 0.06f, 0.56f)
                curveToRelative(0.07f, 0.07f, 0.25f, 0.08f, 0.55f, 0.04f)
                curveToRelative(0.38f, -0.04f, 0.78f, -0.12f, 1.2f, -0.22f)
                curveToRelative(1.07f, -0.27f, 1.94f, -0.84f, 2.62f, -1.71f)
                curveToRelative(0.34f, -0.41f, 0.6f, -0.86f, 0.77f, -1.34f)
                reflectiveCurveToRelative(0.34f, -1.05f, 0.47f, -1.72f)
                curveToRelative(0.05f, -0.23f, 0.04f, -0.38f, -0.03f, -0.46f)
                curveToRelative(-0.07f, -0.08f, -0.22f, -0.11f, -0.44f, -0.08f)
                curveToRelative(-0.59f, 0.1f, -1.12f, 0.23f, -1.59f, 0.4f)
                curveToRelative(-1.15f, 0.43f, -2.02f, 1.01f, -2.62f, 1.74f)
                curveTo(16.05f, 15.68f, 15.72f, 16.6f, 15.66f, 17.73f)
                close()
            }
        }
        .build()
        return _alien!!
    }

private var _alien: ImageVector? = null
