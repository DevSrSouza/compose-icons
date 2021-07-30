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

public val WeatherIcons.NightLightning: ImageVector
    get() {
        if (_nightLightning != null) {
            return _nightLightning!!
        }
        _nightLightning = Builder(name = "NightLightning", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.29f, 16.93f)
                curveToRelative(0.0f, 0.66f, 0.12f, 1.28f, 0.38f, 1.88f)
                reflectiveCurveToRelative(0.59f, 1.11f, 1.02f, 1.55f)
                reflectiveCurveToRelative(0.94f, 0.79f, 1.52f, 1.05f)
                reflectiveCurveToRelative(1.21f, 0.42f, 1.87f, 0.45f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.18f, -0.17f)
                curveToRelative(-0.87f, -0.06f, -1.6f, -0.41f, -2.19f, -1.03f)
                curveToRelative(-0.59f, -0.62f, -0.89f, -1.37f, -0.89f, -2.22f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.85f, -2.18f)
                curveToRelative(0.57f, -0.62f, 1.26f, -0.97f, 2.1f, -1.04f)
                lineToRelative(0.52f, -0.06f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.06f, 0.19f, -0.18f)
                lineToRelative(0.08f, -0.52f)
                curveToRelative(0.07f, -0.71f, 0.3f, -1.36f, 0.69f, -1.94f)
                reflectiveCurveToRelative(0.9f, -1.04f, 1.52f, -1.36f)
                reflectiveCurveToRelative(1.29f, -0.49f, 2.02f, -0.49f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.36f, 2.85f, 1.08f)
                curveToRelative(0.81f, 0.72f, 1.27f, 1.62f, 1.39f, 2.69f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.19f, 0.17f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.9f, 0.0f, 1.67f, 0.32f, 2.32f, 0.96f)
                curveToRelative(0.64f, 0.64f, 0.97f, 1.4f, 0.97f, 2.29f)
                curveToRelative(0.0f, 0.86f, -0.3f, 1.6f, -0.89f, 2.22f)
                curveToRelative(-0.59f, 0.62f, -1.33f, 0.97f, -2.19f, 1.03f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(1.34f, -0.06f, 2.47f, -0.57f, 3.38f, -1.51f)
                curveTo(24.54f, 19.4f, 25.0f, 18.26f, 25.0f, 16.93f)
                curveToRelative(0.0f, -0.64f, -0.16f, -1.32f, -0.47f, -2.06f)
                curveToRelative(0.79f, -0.99f, 1.19f, -2.08f, 1.19f, -3.27f)
                curveToRelative(0.0f, -0.95f, -0.24f, -1.83f, -0.71f, -2.63f)
                curveToRelative(-0.47f, -0.81f, -1.11f, -1.44f, -1.91f, -1.91f)
                reflectiveCurveToRelative(-1.68f, -0.7f, -2.62f, -0.7f)
                curveToRelative(-1.59f, 0.0f, -2.88f, 0.58f, -3.87f, 1.73f)
                curveToRelative(-0.81f, -0.43f, -1.7f, -0.64f, -2.66f, -0.64f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.32f)
                reflectiveCurveToRelative(-1.79f, 2.0f, -2.1f, 3.37f)
                curveToRelative(-1.12f, 0.26f, -2.03f, 0.83f, -2.74f, 1.72f)
                curveTo(4.64f, 14.75f, 4.29f, 15.77f, 4.29f, 16.93f)
                close()
                moveTo(11.94f, 21.55f)
                curveToRelative(-0.02f, 0.14f, 0.02f, 0.21f, 0.14f, 0.21f)
                horizontalLineToRelative(2.17f)
                lineToRelative(-1.32f, 4.17f)
                horizontalLineToRelative(0.29f)
                lineToRelative(4.18f, -5.58f)
                curveToRelative(0.04f, -0.04f, 0.05f, -0.09f, 0.02f, -0.14f)
                reflectiveCurveToRelative(-0.07f, -0.07f, -0.14f, -0.07f)
                horizontalLineTo(15.1f)
                lineToRelative(2.3f, -4.24f)
                curveToRelative(0.07f, -0.14f, 0.03f, -0.22f, -0.14f, -0.22f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.08f, 0.0f, -0.14f, 0.05f, -0.21f, 0.14f)
                lineTo(11.94f, 21.55f)
                close()
                moveTo(18.0f, 9.05f)
                curveToRelative(0.67f, -0.66f, 1.49f, -0.99f, 2.47f, -0.99f)
                curveToRelative(0.98f, 0.0f, 1.81f, 0.34f, 2.5f, 1.03f)
                curveTo(23.66f, 9.77f, 24.0f, 10.61f, 24.0f, 11.6f)
                curveToRelative(0.0f, 0.59f, -0.17f, 1.19f, -0.52f, 1.8f)
                curveToRelative(-0.97f, -0.93f, -2.12f, -1.4f, -3.45f, -1.4f)
                horizontalLineToRelative(-0.31f)
                curveTo(19.44f, 10.81f, 18.86f, 9.83f, 18.0f, 9.05f)
                close()
            }
        }
        .build()
        return _nightLightning!!
    }

private var _nightLightning: ImageVector? = null
