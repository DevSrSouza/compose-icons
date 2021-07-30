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

public val WeatherIcons.SnowWind: ImageVector
    get() {
        if (_snowWind != null) {
            return _snowWind!!
        }
        _snowWind = Builder(name = "SnowWind", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 16.95f)
                curveToRelative(0.0f, -1.16f, 0.35f, -2.18f, 1.06f, -3.08f)
                reflectiveCurveToRelative(1.62f, -1.48f, 2.74f, -1.76f)
                curveToRelative(0.31f, -1.36f, 1.01f, -2.48f, 2.1f, -3.36f)
                reflectiveCurveToRelative(2.34f, -1.31f, 3.75f, -1.31f)
                curveToRelative(1.38f, 0.0f, 2.6f, 0.43f, 3.68f, 1.28f)
                curveToRelative(1.08f, 0.85f, 1.78f, 1.95f, 2.1f, 3.29f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.89f, 0.0f, 1.72f, 0.22f, 2.48f, 0.66f)
                curveToRelative(0.76f, 0.44f, 1.37f, 1.04f, 1.81f, 1.8f)
                curveToRelative(0.44f, 0.76f, 0.67f, 1.59f, 0.67f, 2.48f)
                curveToRelative(0.0f, 1.32f, -0.46f, 2.47f, -1.39f, 3.42f)
                curveToRelative(-0.92f, 0.96f, -2.05f, 1.46f, -3.38f, 1.5f)
                curveToRelative(-0.13f, 0.0f, -0.2f, -0.06f, -0.2f, -0.17f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, 0.07f, -0.18f, 0.2f, -0.18f)
                curveToRelative(0.85f, -0.04f, 1.58f, -0.38f, 2.18f, -1.02f)
                reflectiveCurveToRelative(0.9f, -1.38f, 0.9f, -2.23f)
                curveToRelative(0.0f, -0.89f, -0.32f, -1.65f, -0.97f, -2.3f)
                reflectiveCurveToRelative(-1.42f, -0.97f, -2.32f, -0.97f)
                horizontalLineToRelative(-1.61f)
                curveToRelative(-0.12f, 0.0f, -0.18f, -0.06f, -0.18f, -0.17f)
                lineToRelative(-0.08f, -0.58f)
                curveToRelative(-0.11f, -1.08f, -0.58f, -1.99f, -1.39f, -2.72f)
                curveToRelative(-0.82f, -0.73f, -1.76f, -1.1f, -2.85f, -1.1f)
                curveToRelative(-1.1f, 0.0f, -2.05f, 0.37f, -2.86f, 1.11f)
                curveToRelative(-0.81f, 0.74f, -1.27f, 1.65f, -1.37f, 2.75f)
                lineToRelative(-0.06f, 0.5f)
                curveToRelative(0.0f, 0.12f, -0.07f, 0.19f, -0.2f, 0.19f)
                lineToRelative(-0.53f, 0.07f)
                curveToRelative(-0.83f, 0.07f, -1.53f, 0.41f, -2.1f, 1.04f)
                reflectiveCurveToRelative(-0.85f, 1.35f, -0.85f, 2.19f)
                curveToRelative(0.0f, 0.85f, 0.3f, 1.59f, 0.9f, 2.23f)
                reflectiveCurveToRelative(1.33f, 0.97f, 2.18f, 1.02f)
                curveToRelative(0.11f, 0.0f, 0.17f, 0.06f, 0.17f, 0.18f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.11f, -0.06f, 0.17f, -0.17f, 0.17f)
                curveToRelative(-1.34f, -0.04f, -2.47f, -0.54f, -3.4f, -1.5f)
                curveTo(5.1f, 19.42f, 4.64f, 18.27f, 4.64f, 16.95f)
                close()
                moveTo(10.14f, 24.65f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.25f, -0.6f)
                curveToRelative(0.16f, -0.15f, 0.35f, -0.23f, 0.57f, -0.23f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.08f, 0.59f, 0.23f)
                reflectiveCurveToRelative(0.24f, 0.35f, 0.24f, 0.59f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.43f, -0.24f, 0.59f)
                curveToRelative(-0.16f, 0.16f, -0.35f, 0.23f, -0.59f, 0.23f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.59f, -0.23f)
                curveTo(10.22f, 25.08f, 10.14f, 24.88f, 10.14f, 24.65f)
                close()
                moveTo(11.0f, 21.02f)
                curveToRelative(0.0f, -0.22f, 0.08f, -0.42f, 0.24f, -0.58f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.24f, 0.59f, -0.24f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.08f, 0.59f, 0.24f)
                curveToRelative(0.16f, 0.16f, 0.24f, 0.36f, 0.24f, 0.58f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.24f, 0.6f)
                curveToRelative(-0.16f, 0.17f, -0.35f, 0.25f, -0.59f, 0.25f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.59f, -0.25f)
                curveTo(11.08f, 21.46f, 11.0f, 21.26f, 11.0f, 21.02f)
                close()
                moveTo(12.9f, 26.61f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.25f, -0.61f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.24f, 0.57f, -0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.61f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.37f, 0.25f, 0.6f)
                reflectiveCurveToRelative(-0.08f, 0.43f, -0.25f, 0.59f)
                curveToRelative(-0.17f, 0.16f, -0.37f, 0.24f, -0.61f, 0.24f)
                curveToRelative(-0.23f, 0.0f, -0.42f, -0.08f, -0.58f, -0.24f)
                curveTo(12.99f, 27.03f, 12.9f, 26.84f, 12.9f, 26.61f)
                close()
                moveTo(13.77f, 22.95f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.24f, -0.62f)
                curveToRelative(0.16f, -0.16f, 0.36f, -0.24f, 0.58f, -0.24f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.08f, 0.6f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.37f, 0.25f, 0.61f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.43f, -0.25f, 0.6f)
                reflectiveCurveToRelative(-0.37f, 0.25f, -0.6f, 0.25f)
                curveToRelative(-0.23f, 0.0f, -0.42f, -0.08f, -0.58f, -0.25f)
                curveTo(13.85f, 23.38f, 13.77f, 23.18f, 13.77f, 22.95f)
                close()
                moveTo(14.19f, 19.33f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.25f, -0.6f)
                curveToRelative(0.18f, -0.16f, 0.37f, -0.24f, 0.57f, -0.24f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.08f, 0.61f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.36f, 0.25f, 0.6f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.43f, -0.25f, 0.59f)
                curveToRelative(-0.17f, 0.16f, -0.37f, 0.24f, -0.61f, 0.24f)
                curveToRelative(-0.23f, 0.0f, -0.42f, -0.08f, -0.58f, -0.24f)
                curveTo(14.27f, 19.76f, 14.19f, 19.56f, 14.19f, 19.33f)
                close()
                moveTo(16.56f, 24.65f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.24f, -0.6f)
                curveToRelative(0.16f, -0.15f, 0.36f, -0.23f, 0.6f, -0.23f)
                curveToRelative(0.24f, 0.0f, 0.43f, 0.08f, 0.59f, 0.23f)
                curveToRelative(0.16f, 0.16f, 0.23f, 0.35f, 0.23f, 0.59f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.43f, -0.23f, 0.59f)
                curveToRelative(-0.16f, 0.16f, -0.35f, 0.23f, -0.59f, 0.23f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.24f)
                curveTo(16.64f, 25.07f, 16.56f, 24.88f, 16.56f, 24.65f)
                close()
                moveTo(17.41f, 21.02f)
                curveToRelative(0.0f, -0.22f, 0.08f, -0.41f, 0.25f, -0.58f)
                curveToRelative(0.17f, -0.17f, 0.37f, -0.25f, 0.6f, -0.25f)
                curveToRelative(0.23f, 0.0f, 0.43f, 0.08f, 0.59f, 0.24f)
                curveToRelative(0.16f, 0.16f, 0.24f, 0.36f, 0.24f, 0.58f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.24f, 0.6f)
                curveToRelative(-0.16f, 0.17f, -0.35f, 0.25f, -0.59f, 0.25f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.08f, -0.6f, -0.25f)
                curveTo(17.5f, 21.45f, 17.41f, 21.25f, 17.41f, 21.02f)
                close()
            }
        }
        .build()
        return _snowWind!!
    }

private var _snowWind: ImageVector? = null
