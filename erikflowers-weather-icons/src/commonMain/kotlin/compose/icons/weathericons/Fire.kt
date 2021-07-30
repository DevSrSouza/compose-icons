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

public val WeatherIcons.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.38f, 21.83f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.55f, 0.29f, -0.76f)
                curveToRelative(0.19f, -0.21f, 0.43f, -0.31f, 0.7f, -0.31f)
                verticalLineToRelative(-0.02f)
                lineToRelative(13.16f, 0.04f)
                curveToRelative(0.06f, -0.01f, 0.1f, -0.02f, 0.1f, -0.02f)
                curveToRelative(0.27f, 0.01f, 0.51f, 0.12f, 0.7f, 0.33f)
                curveToRelative(0.19f, 0.21f, 0.29f, 0.47f, 0.28f, 0.77f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.55f, -0.29f, 0.76f)
                curveToRelative(-0.19f, 0.21f, -0.43f, 0.31f, -0.7f, 0.31f)
                verticalLineToRelative(0.01f)
                lineTo(8.59f, 22.9f)
                curveToRelative(-0.1f, 0.01f, -0.17f, 0.02f, -0.22f, 0.02f)
                curveToRelative(-0.28f, -0.01f, -0.51f, -0.11f, -0.7f, -0.32f)
                curveTo(7.47f, 22.39f, 7.37f, 22.13f, 7.38f, 21.83f)
                close()
                moveTo(8.2f, 16.37f)
                curveToRelative(-0.01f, -0.43f, 0.04f, -0.93f, 0.16f, -1.52f)
                curveToRelative(0.06f, -0.3f, 0.2f, -0.76f, 0.44f, -1.37f)
                curveToRelative(0.02f, -0.05f, 0.07f, -0.14f, 0.13f, -0.28f)
                curveToRelative(0.01f, 0.02f, 0.03f, 0.03f, 0.04f, 0.05f)
                reflectiveCurveToRelative(0.02f, 0.02f, 0.02f, 0.03f)
                curveToRelative(0.11f, 0.44f, 0.27f, 0.84f, 0.49f, 1.2f)
                curveToRelative(0.21f, 0.32f, 0.48f, 0.56f, 0.82f, 0.69f)
                curveToRelative(0.26f, 0.11f, 0.63f, 0.17f, 1.1f, 0.18f)
                curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.08f, 0.0f)
                curveToRelative(0.03f, 0.0f, 0.06f, 0.0f, 0.08f, 0.0f)
                curveToRelative(-0.33f, -0.33f, -0.59f, -0.67f, -0.79f, -1.0f)
                curveToRelative(-0.3f, -0.52f, -0.49f, -1.12f, -0.57f, -1.81f)
                curveToRelative(-0.06f, -0.54f, -0.03f, -1.19f, 0.09f, -1.96f)
                curveToRelative(0.02f, -0.15f, 0.12f, -0.49f, 0.29f, -1.01f)
                curveToRelative(0.15f, -0.47f, 0.36f, -0.9f, 0.64f, -1.28f)
                curveTo(11.54f, 7.8f, 12.0f, 7.3f, 12.61f, 6.78f)
                curveToRelative(0.37f, -0.31f, 0.89f, -0.67f, 1.56f, -1.07f)
                curveToRelative(0.07f, -0.04f, 0.18f, -0.11f, 0.35f, -0.19f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.04f, 0.0f, 0.05f)
                reflectiveCurveToRelative(0.0f, 0.03f, 0.0f, 0.04f)
                verticalLineToRelative(0.02f)
                curveToRelative(-0.24f, 0.57f, -0.41f, 1.15f, -0.49f, 1.73f)
                curveToRelative(-0.06f, 0.53f, 0.02f, 1.02f, 0.24f, 1.48f)
                curveToRelative(0.17f, 0.36f, 0.48f, 0.75f, 0.92f, 1.15f)
                curveToRelative(0.09f, 0.09f, 0.29f, 0.29f, 0.6f, 0.58f)
                curveToRelative(0.3f, 0.29f, 0.54f, 0.52f, 0.7f, 0.68f)
                lineToRelative(0.25f, 0.25f)
                curveToRelative(0.26f, -0.38f, 0.41f, -0.83f, 0.44f, -1.35f)
                curveToRelative(0.04f, -0.55f, 0.0f, -1.15f, -0.14f, -1.8f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.04f, 0.01f, -0.11f)
                curveToRelative(0.02f, 0.02f, 0.13f, 0.1f, 0.3f, 0.24f)
                curveToRelative(0.56f, 0.5f, 0.98f, 0.95f, 1.28f, 1.34f)
                curveToRelative(0.48f, 0.62f, 0.83f, 1.21f, 1.06f, 1.74f)
                curveToRelative(0.19f, 0.46f, 0.31f, 0.92f, 0.38f, 1.4f)
                curveToRelative(0.06f, 0.42f, 0.08f, 0.77f, 0.07f, 1.05f)
                curveToRelative(-0.01f, 0.78f, -0.1f, 1.43f, -0.25f, 1.96f)
                curveToRelative(-0.07f, 0.21f, -0.13f, 0.38f, -0.19f, 0.52f)
                curveToRelative(0.25f, -0.07f, 0.47f, -0.16f, 0.65f, -0.26f)
                curveToRelative(0.25f, -0.16f, 0.45f, -0.37f, 0.6f, -0.66f)
                curveToRelative(0.16f, -0.29f, 0.29f, -0.62f, 0.38f, -0.98f)
                curveToRelative(0.0f, -0.01f, 0.01f, -0.03f, 0.03f, -0.05f)
                curveToRelative(0.01f, 0.02f, 0.02f, 0.05f, 0.05f, 0.09f)
                curveToRelative(0.02f, 0.04f, 0.04f, 0.07f, 0.05f, 0.1f)
                curveToRelative(0.13f, 0.31f, 0.22f, 0.63f, 0.27f, 0.97f)
                curveToRelative(0.08f, 0.38f, 0.1f, 0.75f, 0.08f, 1.13f)
                curveToRelative(-0.02f, 0.29f, -0.07f, 0.56f, -0.16f, 0.81f)
                curveToRelative(-0.08f, 0.24f, -0.16f, 0.43f, -0.22f, 0.58f)
                curveToRelative(-0.19f, 0.38f, -0.39f, 0.71f, -0.62f, 0.98f)
                curveToRelative(-0.06f, 0.07f, -0.11f, 0.13f, -0.14f, 0.16f)
                horizontalLineTo(9.67f)
                curveToRelative(-0.01f, -0.01f, -0.03f, -0.03f, -0.07f, -0.06f)
                reflectiveCurveToRelative(-0.06f, -0.05f, -0.08f, -0.07f)
                curveTo(9.26f, 18.98f, 8.98f, 18.6f, 8.7f, 18.1f)
                curveToRelative(-0.08f, -0.15f, -0.18f, -0.38f, -0.29f, -0.69f)
                curveTo(8.29f, 17.1f, 8.22f, 16.75f, 8.2f, 16.37f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
