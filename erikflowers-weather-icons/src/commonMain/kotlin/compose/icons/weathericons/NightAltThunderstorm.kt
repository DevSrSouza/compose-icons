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

public val WeatherIcons.NightAltThunderstorm: ImageVector
    get() {
        if (_nightAltThunderstorm != null) {
            return _nightAltThunderstorm!!
        }
        _nightAltThunderstorm = Builder(name = "NightAltThunderstorm", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.08f, 16.88f)
                curveToRelative(0.0f, 1.11f, 0.33f, 2.1f, 0.99f, 2.98f)
                reflectiveCurveToRelative(1.52f, 1.47f, 2.58f, 1.79f)
                lineToRelative(-0.66f, 1.69f)
                curveToRelative(-0.03f, 0.14f, 0.02f, 0.21f, 0.15f, 0.21f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-0.97f, 3.51f)
                horizontalLineToRelative(0.29f)
                lineToRelative(3.91f, -4.94f)
                curveToRelative(0.04f, -0.05f, 0.04f, -0.1f, 0.01f, -0.15f)
                curveToRelative(-0.03f, -0.05f, -0.08f, -0.07f, -0.15f, -0.07f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(2.48f, -4.63f)
                curveToRelative(0.07f, -0.14f, 0.03f, -0.22f, -0.13f, -0.22f)
                horizontalLineTo(9.56f)
                curveToRelative(-0.09f, 0.0f, -0.16f, 0.05f, -0.23f, 0.14f)
                lineToRelative(-1.07f, 2.88f)
                curveToRelative(-0.72f, -0.18f, -1.31f, -0.57f, -1.78f, -1.17f)
                curveToRelative(-0.47f, -0.6f, -0.7f, -1.27f, -0.7f, -2.01f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.85f, -2.17f)
                curveToRelative(0.57f, -0.62f, 1.27f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.52f, -0.08f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.72f)
                reflectiveCurveToRelative(1.76f, -1.1f, 2.85f, -1.1f)
                curveToRelative(1.08f, 0.0f, 2.03f, 0.37f, 2.85f, 1.1f)
                reflectiveCurveToRelative(1.29f, 1.64f, 1.41f, 2.71f)
                lineToRelative(0.07f, 0.59f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.33f, 0.95f)
                reflectiveCurveToRelative(0.97f, 1.4f, 0.97f, 2.29f)
                curveToRelative(0.0f, 0.85f, -0.3f, 1.59f, -0.9f, 2.21f)
                curveToRelative(-0.6f, 0.62f, -1.33f, 0.97f, -2.2f, 1.04f)
                curveToRelative(-0.12f, 0.0f, -0.19f, 0.06f, -0.19f, 0.17f)
                verticalLineToRelative(1.38f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                curveToRelative(0.88f, -0.03f, 1.68f, -0.27f, 2.41f, -0.72f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.05f, 1.73f, -1.8f)
                curveToRelative(0.42f, -0.75f, 0.63f, -1.57f, 0.63f, -2.45f)
                curveToRelative(0.0f, -0.87f, -0.22f, -1.68f, -0.66f, -2.45f)
                curveToRelative(0.79f, -0.76f, 1.31f, -1.63f, 1.56f, -2.62f)
                lineToRelative(0.14f, -0.72f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.04f, 0.02f, -0.07f)
                curveToRelative(0.0f, -0.07f, -0.05f, -0.12f, -0.16f, -0.15f)
                lineToRelative(-0.56f, -0.18f)
                curveToRelative(-0.57f, -0.16f, -1.06f, -0.44f, -1.46f, -0.82f)
                curveToRelative(-0.41f, -0.38f, -0.7f, -0.8f, -0.87f, -1.23f)
                curveToRelative(-0.17f, -0.44f, -0.26f, -0.88f, -0.26f, -1.32f)
                curveToRelative(0.0f, -0.26f, 0.03f, -0.53f, 0.08f, -0.8f)
                lineToRelative(0.14f, -0.61f)
                curveToRelative(0.04f, -0.1f, 0.0f, -0.18f, -0.14f, -0.23f)
                curveToRelative(-0.21f, -0.09f, -0.51f, -0.17f, -0.9f, -0.26f)
                curveToRelative(-0.39f, -0.09f, -0.77f, -0.13f, -1.15f, -0.13f)
                curveToRelative(-0.36f, 0.0f, -0.73f, 0.04f, -1.12f, 0.13f)
                curveToRelative(-0.38f, 0.09f, -0.78f, 0.22f, -1.19f, 0.41f)
                curveToRelative(-0.41f, 0.18f, -0.81f, 0.45f, -1.2f, 0.8f)
                curveToRelative(-0.39f, 0.35f, -0.72f, 0.75f, -1.0f, 1.22f)
                curveToRelative(-0.82f, -0.3f, -1.62f, -0.45f, -2.38f, -0.45f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.8f, 1.99f, -2.11f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.74f, 1.74f)
                curveTo(4.44f, 14.69f, 4.08f, 15.72f, 4.08f, 16.88f)
                close()
                moveTo(12.18f, 26.7f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.32f, 0.15f, 0.46f)
                curveToRelative(0.1f, 0.15f, 0.25f, 0.25f, 0.45f, 0.3f)
                curveToRelative(0.11f, 0.02f, 0.21f, 0.03f, 0.3f, 0.03f)
                curveToRelative(0.41f, 0.0f, 0.66f, -0.21f, 0.76f, -0.63f)
                lineToRelative(2.32f, -8.79f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.45f, -0.07f, -0.65f)
                curveToRelative(-0.11f, -0.2f, -0.28f, -0.33f, -0.5f, -0.39f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.06f)
                curveToRelative(-0.2f, 0.11f, -0.34f, 0.27f, -0.4f, 0.49f)
                lineToRelative(-2.32f, 8.84f)
                curveTo(12.19f, 26.52f, 12.18f, 26.61f, 12.18f, 26.7f)
                close()
                moveTo(16.35f, 23.68f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.32f, 0.15f, 0.46f)
                curveToRelative(0.1f, 0.14f, 0.25f, 0.25f, 0.46f, 0.31f)
                curveToRelative(0.03f, 0.0f, 0.08f, 0.0f, 0.15f, 0.01f)
                curveToRelative(0.07f, 0.01f, 0.13f, 0.01f, 0.16f, 0.01f)
                curveToRelative(0.38f, 0.0f, 0.62f, -0.21f, 0.72f, -0.63f)
                lineToRelative(1.5f, -5.77f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.46f, -0.08f, -0.66f)
                curveToRelative(-0.11f, -0.19f, -0.28f, -0.32f, -0.51f, -0.38f)
                curveToRelative(-0.23f, -0.07f, -0.45f, -0.05f, -0.65f, 0.06f)
                curveToRelative(-0.2f, 0.11f, -0.33f, 0.27f, -0.39f, 0.5f)
                lineToRelative(-1.5f, 5.82f)
                curveTo(16.36f, 23.51f, 16.35f, 23.6f, 16.35f, 23.68f)
                close()
                moveTo(17.59f, 8.75f)
                curveToRelative(0.33f, -0.57f, 0.77f, -1.0f, 1.33f, -1.3f)
                curveToRelative(0.55f, -0.3f, 1.14f, -0.45f, 1.76f, -0.45f)
                curveToRelative(0.12f, 0.0f, 0.22f, 0.0f, 0.27f, 0.01f)
                verticalLineToRelative(0.32f)
                curveToRelative(0.0f, 0.96f, 0.26f, 1.87f, 0.78f, 2.73f)
                reflectiveCurveToRelative(1.25f, 1.51f, 2.17f, 1.97f)
                curveToRelative(-0.18f, 0.42f, -0.44f, 0.77f, -0.79f, 1.07f)
                curveToRelative(-0.92f, -0.79f, -1.99f, -1.18f, -3.22f, -1.18f)
                horizontalLineToRelative(-0.32f)
                curveTo(19.29f, 10.66f, 18.63f, 9.61f, 17.59f, 8.75f)
                close()
            }
        }
        .build()
        return _nightAltThunderstorm!!
    }

private var _nightAltThunderstorm: ImageVector? = null
