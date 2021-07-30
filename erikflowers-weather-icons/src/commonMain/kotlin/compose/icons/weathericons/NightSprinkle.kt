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

public val WeatherIcons.NightSprinkle: ImageVector
    get() {
        if (_nightSprinkle != null) {
            return _nightSprinkle!!
        }
        _nightSprinkle = Builder(name = "NightSprinkle", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.22f, 16.89f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.44f)
                reflectiveCurveToRelative(2.06f, 1.47f, 3.41f, 1.53f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.37f)
                curveToRelative(0.0f, -0.13f, -0.06f, -0.19f, -0.17f, -0.19f)
                curveToRelative(-0.88f, -0.06f, -1.61f, -0.41f, -2.21f, -1.03f)
                curveToRelative(-0.6f, -0.62f, -0.9f, -1.36f, -0.9f, -2.21f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.58f, 0.85f, -2.2f)
                curveToRelative(0.57f, -0.62f, 1.27f, -0.97f, 2.11f, -1.04f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.12f, 0.0f, 0.19f, -0.06f, 0.19f, -0.19f)
                lineToRelative(0.07f, -0.5f)
                curveToRelative(0.11f, -1.08f, 0.57f, -1.99f, 1.38f, -2.72f)
                reflectiveCurveToRelative(1.77f, -1.1f, 2.87f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.05f, 0.36f, 2.86f, 1.09f)
                curveToRelative(0.81f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.06f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.97f, 1.4f, 0.97f, 2.28f)
                curveToRelative(0.0f, 0.85f, -0.3f, 1.59f, -0.89f, 2.21f)
                curveToRelative(-0.59f, 0.62f, -1.33f, 0.97f, -2.19f, 1.03f)
                curveToRelative(-0.14f, 0.0f, -0.21f, 0.06f, -0.21f, 0.19f)
                verticalLineToRelative(1.37f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.21f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.39f, -1.51f)
                curveToRelative(0.93f, -0.97f, 1.39f, -2.12f, 1.39f, -3.45f)
                curveToRelative(0.0f, -0.74f, -0.14f, -1.41f, -0.43f, -2.01f)
                curveToRelative(0.79f, -0.96f, 1.18f, -2.07f, 1.18f, -3.36f)
                curveToRelative(0.0f, -0.94f, -0.24f, -1.82f, -0.71f, -2.63f)
                reflectiveCurveToRelative(-1.11f, -1.45f, -1.92f, -1.92f)
                curveToRelative(-0.81f, -0.47f, -1.68f, -0.71f, -2.62f, -0.71f)
                curveToRelative(-1.52f, 0.0f, -2.83f, 0.58f, -3.93f, 1.75f)
                curveTo(15.74f, 7.61f, 14.85f, 7.4f, 13.9f, 7.4f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.1f, 3.37f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.74f, 1.74f)
                curveTo(4.58f, 14.71f, 4.22f, 15.74f, 4.22f, 16.89f)
                close()
                moveTo(10.15f, 17.77f)
                curveToRelative(0.0f, 0.38f, 0.14f, 0.7f, 0.43f, 0.98f)
                curveToRelative(0.28f, 0.27f, 0.62f, 0.41f, 1.02f, 0.41f)
                reflectiveCurveToRelative(0.73f, -0.13f, 1.0f, -0.4f)
                curveToRelative(0.27f, -0.27f, 0.41f, -0.6f, 0.41f, -0.98f)
                curveToRelative(0.0f, -0.26f, -0.12f, -0.6f, -0.35f, -1.02f)
                curveToRelative(-0.23f, -0.42f, -0.45f, -0.76f, -0.66f, -1.0f)
                curveToRelative(-0.02f, -0.02f, -0.08f, -0.09f, -0.18f, -0.2f)
                curveToRelative(-0.1f, -0.11f, -0.17f, -0.19f, -0.21f, -0.24f)
                lineToRelative(-0.36f, 0.4f)
                curveToRelative(-0.28f, 0.3f, -0.53f, 0.65f, -0.75f, 1.05f)
                curveTo(10.27f, 17.17f, 10.15f, 17.51f, 10.15f, 17.77f)
                close()
                moveTo(13.14f, 21.76f)
                curveToRelative(0.0f, 0.63f, 0.23f, 1.18f, 0.69f, 1.64f)
                curveToRelative(0.46f, 0.46f, 1.01f, 0.69f, 1.65f, 0.69f)
                curveToRelative(0.64f, 0.0f, 1.2f, -0.23f, 1.66f, -0.69f)
                curveToRelative(0.46f, -0.46f, 0.69f, -1.01f, 0.69f, -1.64f)
                curveToRelative(0.0f, -0.27f, -0.08f, -0.59f, -0.23f, -0.97f)
                curveToRelative(-0.16f, -0.38f, -0.34f, -0.72f, -0.56f, -1.04f)
                curveToRelative(-0.46f, -0.59f, -0.89f, -1.09f, -1.29f, -1.49f)
                curveToRelative(-0.06f, -0.04f, -0.14f, -0.13f, -0.26f, -0.24f)
                lineTo(14.9f, 18.6f)
                curveToRelative(-0.44f, 0.42f, -0.85f, 0.95f, -1.21f, 1.56f)
                curveTo(13.32f, 20.78f, 13.14f, 21.31f, 13.14f, 21.76f)
                close()
                moveTo(14.62f, 15.06f)
                curveToRelative(0.0f, 0.27f, 0.09f, 0.49f, 0.28f, 0.67f)
                reflectiveCurveToRelative(0.43f, 0.27f, 0.71f, 0.27f)
                curveToRelative(0.26f, 0.0f, 0.48f, -0.09f, 0.66f, -0.27f)
                reflectiveCurveToRelative(0.27f, -0.4f, 0.27f, -0.67f)
                curveToRelative(0.0f, -0.41f, -0.31f, -0.94f, -0.93f, -1.61f)
                lineToRelative(-0.25f, 0.26f)
                curveToRelative(-0.19f, 0.2f, -0.36f, 0.43f, -0.51f, 0.7f)
                curveTo(14.69f, 14.67f, 14.62f, 14.89f, 14.62f, 15.06f)
                close()
                moveTo(18.01f, 9.02f)
                curveToRelative(0.67f, -0.66f, 1.5f, -0.99f, 2.48f, -0.99f)
                curveToRelative(0.98f, 0.0f, 1.81f, 0.34f, 2.49f, 1.02f)
                reflectiveCurveToRelative(1.03f, 1.51f, 1.03f, 2.48f)
                curveToRelative(0.0f, 0.63f, -0.17f, 1.25f, -0.51f, 1.85f)
                curveToRelative(-1.0f, -0.96f, -2.17f, -1.44f, -3.51f, -1.44f)
                horizontalLineTo(19.7f)
                curveTo(19.42f, 10.76f, 18.85f, 9.79f, 18.01f, 9.02f)
                close()
            }
        }
        .build()
        return _nightSprinkle!!
    }

private var _nightSprinkle: ImageVector? = null
