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

public val WeatherIcons.Horizon: ImageVector
    get() {
        if (_horizon != null) {
            return _horizon!!
        }
        _horizon = Builder(name = "Horizon", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.93f, 20.97f)
                curveToRelative(0.0f, -0.26f, 0.09f, -0.47f, 0.28f, -0.62f)
                curveToRelative(0.14f, -0.16f, 0.35f, -0.23f, 0.63f, -0.23f)
                horizontalLineToRelative(18.34f)
                curveToRelative(0.25f, 0.0f, 0.46f, 0.08f, 0.64f, 0.24f)
                curveToRelative(0.18f, 0.16f, 0.26f, 0.37f, 0.26f, 0.61f)
                curveToRelative(0.0f, 0.24f, -0.09f, 0.45f, -0.27f, 0.62f)
                reflectiveCurveToRelative(-0.39f, 0.27f, -0.63f, 0.27f)
                horizontalLineTo(5.84f)
                curveToRelative(-0.25f, 0.0f, -0.46f, -0.09f, -0.64f, -0.27f)
                curveTo(5.02f, 21.42f, 4.93f, 21.21f, 4.93f, 20.97f)
                close()
                moveTo(6.9f, 12.68f)
                curveToRelative(0.0f, -0.26f, 0.08f, -0.47f, 0.23f, -0.63f)
                curveToRelative(0.17f, -0.18f, 0.38f, -0.26f, 0.65f, -0.26f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.09f, 0.6f, 0.26f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.18f, 0.18f, 0.27f, 0.39f, 0.27f, 0.63f)
                curveToRelative(0.0f, 0.23f, -0.09f, 0.44f, -0.27f, 0.62f)
                curveToRelative(-0.15f, 0.18f, -0.35f, 0.27f, -0.6f, 0.27f)
                reflectiveCurveToRelative(-0.47f, -0.09f, -0.64f, -0.27f)
                lineToRelative(-1.5f, -1.5f)
                curveTo(6.98f, 13.15f, 6.9f, 12.95f, 6.9f, 12.68f)
                close()
                moveTo(9.83f, 18.27f)
                curveToRelative(-0.04f, 0.16f, 0.01f, 0.23f, 0.15f, 0.23f)
                horizontalLineToRelative(1.49f)
                curveToRelative(0.07f, 0.0f, 0.14f, -0.06f, 0.22f, -0.17f)
                curveToRelative(0.3f, -0.64f, 0.74f, -1.14f, 1.33f, -1.52f)
                reflectiveCurveToRelative(1.24f, -0.56f, 1.96f, -0.56f)
                curveToRelative(0.73f, 0.0f, 1.39f, 0.19f, 1.99f, 0.56f)
                reflectiveCurveToRelative(1.05f, 0.88f, 1.35f, 1.52f)
                curveToRelative(0.08f, 0.11f, 0.16f, 0.17f, 0.23f, 0.17f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.13f, 0.0f, 0.18f, -0.08f, 0.15f, -0.23f)
                curveToRelative(-0.34f, -1.13f, -0.99f, -2.05f, -1.95f, -2.76f)
                curveToRelative(-0.96f, -0.71f, -2.04f, -1.06f, -3.25f, -1.06f)
                curveToRelative(-1.2f, 0.0f, -2.28f, 0.35f, -3.23f, 1.06f)
                curveTo(10.82f, 16.22f, 10.17f, 17.14f, 9.83f, 18.27f)
                close()
                moveTo(14.14f, 11.81f)
                verticalLineTo(9.68f)
                curveToRelative(0.0f, -0.25f, 0.08f, -0.46f, 0.24f, -0.64f)
                curveToRelative(0.16f, -0.18f, 0.37f, -0.26f, 0.61f, -0.26f)
                curveToRelative(0.25f, 0.0f, 0.46f, 0.09f, 0.63f, 0.26f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.39f, 0.25f, 0.64f)
                verticalLineToRelative(2.14f)
                curveToRelative(0.0f, 0.26f, -0.08f, 0.47f, -0.25f, 0.64f)
                curveToRelative(-0.17f, 0.17f, -0.38f, 0.25f, -0.63f, 0.25f)
                curveToRelative(-0.24f, 0.0f, -0.45f, -0.09f, -0.61f, -0.26f)
                reflectiveCurveTo(14.14f, 12.06f, 14.14f, 11.81f)
                close()
                moveTo(19.86f, 14.18f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.45f, 0.25f, -0.63f)
                lineToRelative(1.54f, -1.5f)
                curveToRelative(0.16f, -0.18f, 0.36f, -0.26f, 0.62f, -0.26f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.6f, 0.25f)
                reflectiveCurveToRelative(0.23f, 0.38f, 0.23f, 0.64f)
                curveToRelative(0.0f, 0.26f, -0.08f, 0.47f, -0.23f, 0.62f)
                lineToRelative(-1.48f, 1.5f)
                curveToRelative(-0.17f, 0.17f, -0.36f, 0.26f, -0.56f, 0.28f)
                curveToRelative(-0.23f, 0.02f, -0.44f, -0.06f, -0.65f, -0.24f)
                reflectiveCurveTo(19.86f, 14.43f, 19.86f, 14.18f)
                close()
            }
        }
        .build()
        return _horizon!!
    }

private var _horizon: ImageVector? = null
