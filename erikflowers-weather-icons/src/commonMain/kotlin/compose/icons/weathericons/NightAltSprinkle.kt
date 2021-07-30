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

public val WeatherIcons.NightAltSprinkle: ImageVector
    get() {
        if (_nightAltSprinkle != null) {
            return _nightAltSprinkle!!
        }
        _nightAltSprinkle = Builder(name = "NightAltSprinkle", defaultWidth = 30.0.dp, defaultHeight
                = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.11f, 16.89f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.48f, 1.39f, 3.43f)
                curveToRelative(0.93f, 0.96f, 2.06f, 1.47f, 3.4f, 1.54f)
                curveToRelative(0.12f, 0.0f, 0.18f, -0.06f, 0.18f, -0.18f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, -0.06f, -0.18f, -0.18f, -0.18f)
                curveToRelative(-0.86f, -0.04f, -1.58f, -0.38f, -2.18f, -1.02f)
                curveToRelative(-0.6f, -0.64f, -0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.84f, -2.17f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.97f, 2.1f, -1.07f)
                lineToRelative(0.52f, -0.04f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.18f)
                lineToRelative(0.07f, -0.54f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.09f, 2.85f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.86f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.63f, 1.4f, 2.71f)
                lineToRelative(0.07f, 0.57f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.19f, 0.18f, 0.19f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.89f, 0.0f, 1.65f, 0.32f, 2.3f, 0.96f)
                reflectiveCurveToRelative(0.97f, 1.4f, 0.97f, 2.27f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.18f, 1.02f)
                curveToRelative(-0.12f, 0.0f, -0.19f, 0.06f, -0.19f, 0.18f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                curveToRelative(0.88f, -0.03f, 1.68f, -0.27f, 2.41f, -0.72f)
                reflectiveCurveToRelative(1.31f, -1.05f, 1.73f, -1.8f)
                reflectiveCurveToRelative(0.63f, -1.57f, 0.63f, -2.44f)
                curveToRelative(0.0f, -0.87f, -0.23f, -1.68f, -0.68f, -2.45f)
                curveToRelative(0.78f, -0.74f, 1.29f, -1.6f, 1.54f, -2.58f)
                lineToRelative(0.14f, -0.73f)
                curveToRelative(0.01f, -0.01f, 0.02f, -0.03f, 0.02f, -0.07f)
                curveToRelative(0.0f, -0.07f, -0.05f, -0.13f, -0.16f, -0.16f)
                lineToRelative(-0.57f, -0.17f)
                curveToRelative(-0.57f, -0.16f, -1.06f, -0.44f, -1.46f, -0.82f)
                curveToRelative(-0.41f, -0.38f, -0.7f, -0.79f, -0.87f, -1.21f)
                curveToRelative(-0.17f, -0.43f, -0.26f, -0.85f, -0.26f, -1.28f)
                curveToRelative(0.0f, -0.29f, 0.04f, -0.57f, 0.11f, -0.85f)
                lineToRelative(0.13f, -0.61f)
                curveToRelative(0.02f, -0.1f, -0.02f, -0.18f, -0.13f, -0.23f)
                lineToRelative(-0.8f, -0.24f)
                curveToRelative(-0.45f, -0.1f, -0.87f, -0.15f, -1.27f, -0.15f)
                curveToRelative(-0.36f, 0.0f, -0.73f, 0.04f, -1.12f, 0.13f)
                curveToRelative(-0.38f, 0.09f, -0.78f, 0.22f, -1.19f, 0.4f)
                reflectiveCurveToRelative(-0.81f, 0.44f, -1.2f, 0.79f)
                reflectiveCurveToRelative(-0.72f, 0.74f, -1.0f, 1.2f)
                curveToRelative(-0.81f, -0.31f, -1.59f, -0.46f, -2.33f, -0.46f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.32f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.11f, 3.36f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.84f, -2.73f, 1.74f)
                curveTo(4.47f, 14.71f, 4.11f, 15.74f, 4.11f, 16.89f)
                close()
                moveTo(10.05f, 17.77f)
                curveToRelative(0.0f, 0.38f, 0.14f, 0.71f, 0.42f, 0.98f)
                curveToRelative(0.28f, 0.27f, 0.62f, 0.4f, 1.02f, 0.4f)
                curveToRelative(0.4f, 0.0f, 0.73f, -0.13f, 1.0f, -0.4f)
                curveToRelative(0.27f, -0.27f, 0.4f, -0.59f, 0.4f, -0.98f)
                curveToRelative(0.0f, -0.26f, -0.12f, -0.6f, -0.35f, -1.02f)
                curveToRelative(-0.23f, -0.42f, -0.45f, -0.75f, -0.65f, -0.98f)
                curveToRelative(-0.11f, -0.12f, -0.24f, -0.26f, -0.41f, -0.43f)
                lineToRelative(-0.35f, 0.41f)
                curveToRelative(-0.27f, 0.29f, -0.52f, 0.64f, -0.75f, 1.04f)
                reflectiveCurveTo(10.05f, 17.51f, 10.05f, 17.77f)
                close()
                moveTo(13.04f, 21.76f)
                curveToRelative(0.0f, 0.66f, 0.23f, 1.21f, 0.68f, 1.66f)
                curveToRelative(0.46f, 0.45f, 1.01f, 0.67f, 1.65f, 0.67f)
                curveToRelative(0.66f, 0.0f, 1.21f, -0.23f, 1.66f, -0.68f)
                curveToRelative(0.45f, -0.46f, 0.68f, -1.01f, 0.68f, -1.65f)
                curveToRelative(0.0f, -0.55f, -0.27f, -1.22f, -0.8f, -2.0f)
                curveToRelative(-0.44f, -0.58f, -0.87f, -1.08f, -1.28f, -1.49f)
                curveToRelative(-0.08f, -0.06f, -0.17f, -0.13f, -0.26f, -0.23f)
                lineToRelative(-0.23f, 0.23f)
                curveToRelative(-0.39f, 0.36f, -0.82f, 0.86f, -1.28f, 1.48f)
                curveToRelative(-0.24f, 0.33f, -0.43f, 0.68f, -0.59f, 1.04f)
                curveTo(13.11f, 21.16f, 13.04f, 21.48f, 13.04f, 21.76f)
                close()
                moveTo(14.51f, 15.09f)
                curveToRelative(0.0f, 0.26f, 0.1f, 0.47f, 0.29f, 0.66f)
                reflectiveCurveToRelative(0.42f, 0.27f, 0.7f, 0.27f)
                curveToRelative(0.26f, 0.0f, 0.47f, -0.09f, 0.66f, -0.27f)
                curveToRelative(0.18f, -0.18f, 0.27f, -0.4f, 0.27f, -0.66f)
                curveToRelative(0.0f, -0.43f, -0.31f, -0.97f, -0.93f, -1.62f)
                lineToRelative(-0.25f, 0.27f)
                curveToRelative(-0.18f, 0.2f, -0.35f, 0.43f, -0.5f, 0.7f)
                curveTo(14.58f, 14.71f, 14.51f, 14.93f, 14.51f, 15.09f)
                close()
                moveTo(17.56f, 8.77f)
                curveToRelative(0.35f, -0.57f, 0.8f, -1.0f, 1.34f, -1.29f)
                curveToRelative(0.54f, -0.29f, 1.12f, -0.44f, 1.72f, -0.44f)
                curveToRelative(0.12f, 0.0f, 0.21f, 0.01f, 0.27f, 0.02f)
                verticalLineToRelative(0.3f)
                curveToRelative(0.0f, 0.96f, 0.26f, 1.87f, 0.79f, 2.74f)
                reflectiveCurveToRelative(1.25f, 1.52f, 2.18f, 1.97f)
                curveToRelative(-0.16f, 0.38f, -0.41f, 0.72f, -0.75f, 1.03f)
                curveToRelative(-0.93f, -0.76f, -1.99f, -1.14f, -3.21f, -1.14f)
                horizontalLineToRelative(-0.33f)
                curveTo(19.27f, 10.65f, 18.6f, 9.59f, 17.56f, 8.77f)
                close()
            }
        }
        .build()
        return _nightAltSprinkle!!
    }

private var _nightAltSprinkle: ImageVector? = null
