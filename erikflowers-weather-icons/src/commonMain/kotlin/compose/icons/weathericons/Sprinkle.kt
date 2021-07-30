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

public val WeatherIcons.Sprinkle: ImageVector
    get() {
        if (_sprinkle != null) {
            return _sprinkle!!
        }
        _sprinkle = Builder(name = "Sprinkle", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 16.91f)
                curveToRelative(0.0f, -1.15f, 0.36f, -2.17f, 1.08f, -3.07f)
                curveToRelative(0.72f, -0.9f, 1.63f, -1.47f, 2.73f, -1.73f)
                curveToRelative(0.31f, -1.36f, 1.01f, -2.48f, 2.1f, -3.35f)
                reflectiveCurveToRelative(2.35f, -1.31f, 3.76f, -1.31f)
                curveToRelative(1.38f, 0.0f, 2.6f, 0.43f, 3.68f, 1.27f)
                curveToRelative(1.07f, 0.85f, 1.78f, 1.94f, 2.11f, 3.28f)
                horizontalLineToRelative(0.31f)
                curveToRelative(0.89f, 0.0f, 1.72f, 0.22f, 2.48f, 0.65f)
                reflectiveCurveToRelative(1.37f, 1.03f, 1.81f, 1.78f)
                curveToRelative(0.44f, 0.75f, 0.67f, 1.58f, 0.67f, 2.47f)
                curveToRelative(0.0f, 1.34f, -0.46f, 2.49f, -1.38f, 3.45f)
                reflectiveCurveToRelative(-2.05f, 1.47f, -3.38f, 1.51f)
                curveToRelative(-0.13f, 0.0f, -0.2f, -0.06f, -0.2f, -0.17f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -0.12f, 0.07f, -0.18f, 0.2f, -0.18f)
                curveToRelative(0.86f, -0.04f, 1.58f, -0.38f, 2.18f, -1.02f)
                reflectiveCurveToRelative(0.9f, -1.39f, 0.9f, -2.26f)
                reflectiveCurveToRelative(-0.32f, -1.62f, -0.98f, -2.26f)
                curveToRelative(-0.65f, -0.64f, -1.42f, -0.96f, -2.31f, -0.96f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(-0.12f, 0.0f, -0.19f, -0.06f, -0.19f, -0.17f)
                lineToRelative(-0.07f, -0.58f)
                curveToRelative(-0.11f, -1.07f, -0.57f, -1.98f, -1.38f, -2.71f)
                curveToRelative(-0.82f, -0.73f, -1.77f, -1.1f, -2.85f, -1.1f)
                curveToRelative(-1.09f, 0.0f, -2.05f, 0.36f, -2.86f, 1.09f)
                curveToRelative(-0.81f, 0.73f, -1.27f, 1.63f, -1.38f, 2.71f)
                lineToRelative(-0.06f, 0.54f)
                curveToRelative(0.0f, 0.12f, -0.07f, 0.18f, -0.2f, 0.18f)
                lineToRelative(-0.53f, 0.03f)
                curveToRelative(-0.82f, 0.04f, -1.51f, 0.37f, -2.09f, 1.0f)
                reflectiveCurveToRelative(-0.86f, 1.37f, -0.86f, 2.22f)
                curveToRelative(0.0f, 0.87f, 0.3f, 1.62f, 0.9f, 2.26f)
                reflectiveCurveToRelative(1.33f, 0.98f, 2.18f, 1.02f)
                curveToRelative(0.11f, 0.0f, 0.17f, 0.06f, 0.17f, 0.18f)
                verticalLineToRelative(1.33f)
                curveToRelative(0.0f, 0.11f, -0.06f, 0.17f, -0.17f, 0.17f)
                curveToRelative(-1.34f, -0.06f, -2.47f, -0.57f, -3.4f, -1.53f)
                reflectiveCurveTo(4.64f, 18.24f, 4.64f, 16.91f)
                close()
                moveTo(10.57f, 17.79f)
                curveToRelative(0.0f, -0.24f, 0.12f, -0.57f, 0.37f, -0.99f)
                curveToRelative(0.24f, -0.42f, 0.47f, -0.75f, 0.68f, -1.01f)
                curveToRelative(0.21f, -0.24f, 0.34f, -0.38f, 0.38f, -0.42f)
                lineToRelative(0.36f, 0.4f)
                curveToRelative(0.26f, 0.28f, 0.5f, 0.61f, 0.72f, 1.02f)
                curveToRelative(0.22f, 0.4f, 0.33f, 0.74f, 0.33f, 1.0f)
                curveToRelative(0.0f, 0.39f, -0.13f, 0.72f, -0.4f, 0.98f)
                curveToRelative(-0.27f, 0.26f, -0.6f, 0.39f, -1.0f, 0.39f)
                curveToRelative(-0.39f, 0.0f, -0.73f, -0.13f, -1.01f, -0.4f)
                curveTo(10.71f, 18.5f, 10.57f, 18.17f, 10.57f, 17.79f)
                close()
                moveTo(13.55f, 21.78f)
                curveToRelative(0.0f, -0.28f, 0.08f, -0.59f, 0.24f, -0.96f)
                reflectiveCurveToRelative(0.35f, -0.7f, 0.59f, -1.02f)
                curveToRelative(0.18f, -0.26f, 0.4f, -0.54f, 0.67f, -0.84f)
                curveToRelative(0.26f, -0.3f, 0.46f, -0.52f, 0.6f, -0.65f)
                curveToRelative(0.07f, -0.06f, 0.15f, -0.14f, 0.24f, -0.23f)
                lineToRelative(0.24f, 0.23f)
                curveToRelative(0.38f, 0.33f, 0.8f, 0.82f, 1.27f, 1.46f)
                curveToRelative(0.24f, 0.33f, 0.43f, 0.68f, 0.59f, 1.04f)
                reflectiveCurveToRelative(0.23f, 0.68f, 0.23f, 0.97f)
                curveToRelative(0.0f, 0.64f, -0.23f, 1.19f, -0.68f, 1.65f)
                reflectiveCurveToRelative(-1.01f, 0.68f, -1.66f, 0.68f)
                curveToRelative(-0.64f, 0.0f, -1.19f, -0.23f, -1.65f, -0.67f)
                curveTo(13.77f, 22.98f, 13.55f, 22.43f, 13.55f, 21.78f)
                close()
                moveTo(15.02f, 15.12f)
                curveToRelative(0.0f, -0.42f, 0.32f, -0.95f, 0.97f, -1.6f)
                lineToRelative(0.24f, 0.25f)
                curveToRelative(0.18f, 0.21f, 0.33f, 0.45f, 0.48f, 0.71f)
                curveToRelative(0.14f, 0.26f, 0.22f, 0.47f, 0.22f, 0.64f)
                curveToRelative(0.0f, 0.26f, -0.09f, 0.48f, -0.28f, 0.66f)
                curveToRelative(-0.18f, 0.18f, -0.4f, 0.28f, -0.66f, 0.28f)
                curveToRelative(-0.27f, 0.0f, -0.5f, -0.09f, -0.69f, -0.28f)
                curveTo(15.11f, 15.6f, 15.02f, 15.38f, 15.02f, 15.12f)
                close()
            }
        }
        .build()
        return _sprinkle!!
    }

private var _sprinkle: ImageVector? = null
