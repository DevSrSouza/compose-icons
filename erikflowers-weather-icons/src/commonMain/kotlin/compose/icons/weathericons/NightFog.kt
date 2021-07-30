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

public val WeatherIcons.NightFog: ImageVector
    get() {
        if (_nightFog != null) {
            return _nightFog!!
        }
        _nightFog = Builder(name = "NightFog", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.66f, 20.92f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.42f, 0.25f, 0.57f)
                curveToRelative(0.17f, 0.16f, 0.38f, 0.23f, 0.62f, 0.23f)
                horizontalLineToRelative(18.61f)
                curveToRelative(0.24f, 0.0f, 0.44f, -0.08f, 0.6f, -0.23f)
                curveToRelative(0.17f, -0.16f, 0.25f, -0.35f, 0.25f, -0.57f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.45f, -0.24f, -0.61f)
                curveToRelative(-0.16f, -0.17f, -0.37f, -0.25f, -0.61f, -0.25f)
                horizontalLineTo(3.53f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.61f, 0.25f)
                curveTo(2.75f, 20.48f, 2.66f, 20.69f, 2.66f, 20.92f)
                close()
                moveTo(5.27f, 17.81f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.43f, 0.26f, 0.59f)
                curveToRelative(0.14f, 0.18f, 0.33f, 0.27f, 0.59f, 0.27f)
                horizontalLineToRelative(18.61f)
                curveToRelative(0.23f, 0.0f, 0.42f, -0.08f, 0.58f, -0.25f)
                reflectiveCurveToRelative(0.23f, -0.37f, 0.23f, -0.61f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.43f, -0.23f, -0.58f)
                curveTo(25.16f, 17.08f, 24.96f, 17.0f, 24.73f, 17.0f)
                horizontalLineTo(6.12f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.23f)
                curveTo(5.35f, 17.39f, 5.27f, 17.58f, 5.27f, 17.81f)
                close()
                moveTo(5.42f, 15.39f)
                verticalLineToRelative(-0.05f)
                curveToRelative(-0.04f, 0.15f, 0.0f, 0.22f, 0.12f, 0.22f)
                horizontalLineToRelative(1.44f)
                curveToRelative(0.06f, 0.0f, 0.12f, -0.05f, 0.19f, -0.15f)
                curveToRelative(0.24f, -0.52f, 0.59f, -0.94f, 1.06f, -1.27f)
                curveToRelative(0.47f, -0.33f, 0.99f, -0.52f, 1.55f, -0.56f)
                lineToRelative(0.53f, -0.08f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.06f, 0.19f, -0.18f)
                lineToRelative(0.06f, -0.5f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.97f, 1.36f, -2.7f)
                curveToRelative(0.8f, -0.72f, 1.75f, -1.08f, 2.84f, -1.08f)
                curveToRelative(1.07f, 0.0f, 2.02f, 0.36f, 2.82f, 1.07f)
                reflectiveCurveToRelative(1.27f, 1.6f, 1.38f, 2.67f)
                lineToRelative(0.07f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.07f, 0.18f, 0.21f, 0.18f)
                horizontalLineToRelative(1.58f)
                curveToRelative(0.64f, 0.0f, 1.23f, 0.17f, 1.75f, 0.52f)
                curveToRelative(0.52f, 0.34f, 0.92f, 0.8f, 1.17f, 1.36f)
                curveToRelative(0.07f, 0.1f, 0.14f, 0.15f, 0.22f, 0.15f)
                horizontalLineToRelative(1.42f)
                curveToRelative(0.12f, 0.0f, 0.17f, -0.07f, 0.15f, -0.22f)
                curveToRelative(-0.22f, -0.56f, -0.37f, -0.91f, -0.46f, -1.06f)
                curveToRelative(0.72f, -0.65f, 1.23f, -1.51f, 1.5f, -2.57f)
                lineToRelative(0.17f, -0.66f)
                curveToRelative(0.03f, -0.06f, 0.02f, -0.12f, -0.01f, -0.16f)
                curveToRelative(-0.03f, -0.04f, -0.07f, -0.07f, -0.12f, -0.07f)
                lineToRelative(-0.62f, -0.22f)
                curveToRelative(-0.89f, -0.26f, -1.57f, -0.78f, -2.04f, -1.58f)
                curveToRelative(-0.47f, -0.8f, -0.59f, -1.65f, -0.37f, -2.56f)
                lineToRelative(0.13f, -0.58f)
                curveToRelative(0.05f, -0.09f, 0.01f, -0.17f, -0.13f, -0.23f)
                lineToRelative(-0.84f, -0.23f)
                curveToRelative(-1.09f, -0.27f, -2.17f, -0.18f, -3.22f, 0.26f)
                curveToRelative(-1.05f, 0.44f, -1.87f, 1.15f, -2.47f, 2.12f)
                curveToRelative(-0.79f, -0.31f, -1.56f, -0.46f, -2.29f, -0.46f)
                curveToRelative(-1.39f, 0.0f, -2.62f, 0.44f, -3.71f, 1.31f)
                reflectiveCurveToRelative(-1.78f, 1.99f, -2.1f, 3.35f)
                curveToRelative(-0.84f, 0.2f, -1.58f, 0.6f, -2.22f, 1.21f)
                reflectiveCurveTo(5.67f, 14.55f, 5.42f, 15.39f)
                close()
                moveTo(7.0f, 23.97f)
                curveToRelative(0.0f, 0.24f, 0.09f, 0.43f, 0.26f, 0.59f)
                curveToRelative(0.17f, 0.18f, 0.37f, 0.27f, 0.59f, 0.27f)
                horizontalLineTo(26.5f)
                curveToRelative(0.23f, 0.0f, 0.43f, -0.08f, 0.59f, -0.25f)
                curveToRelative(0.16f, -0.17f, 0.24f, -0.37f, 0.24f, -0.61f)
                curveToRelative(0.0f, -0.23f, -0.08f, -0.42f, -0.24f, -0.58f)
                reflectiveCurveToRelative(-0.36f, -0.23f, -0.59f, -0.23f)
                horizontalLineTo(7.86f)
                curveToRelative(-0.24f, 0.0f, -0.44f, 0.08f, -0.6f, 0.23f)
                curveTo(7.09f, 23.55f, 7.0f, 23.74f, 7.0f, 23.97f)
                close()
                moveTo(18.51f, 8.7f)
                curveToRelative(0.35f, -0.57f, 0.82f, -1.02f, 1.41f, -1.33f)
                curveToRelative(0.59f, -0.31f, 1.21f, -0.44f, 1.87f, -0.38f)
                curveToRelative(-0.07f, 1.04f, 0.17f, 2.02f, 0.7f, 2.93f)
                curveToRelative(0.54f, 0.91f, 1.28f, 1.58f, 2.22f, 2.02f)
                curveToRelative(-0.15f, 0.35f, -0.4f, 0.71f, -0.75f, 1.07f)
                curveToRelative(-0.92f, -0.76f, -1.97f, -1.13f, -3.14f, -1.13f)
                horizontalLineTo(20.5f)
                curveTo(20.18f, 10.57f, 19.52f, 9.51f, 18.51f, 8.7f)
                close()
            }
        }
        .build()
        return _nightFog!!
    }

private var _nightFog: ImageVector? = null
