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

public val WeatherIcons.NightStormShowers: ImageVector
    get() {
        if (_nightStormShowers != null) {
            return _nightStormShowers!!
        }
        _nightStormShowers = Builder(name = "NightStormShowers", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 16.86f)
                curveToRelative(0.0f, 1.1f, 0.33f, 2.09f, 1.0f, 2.98f)
                curveToRelative(0.67f, 0.88f, 1.52f, 1.48f, 2.57f, 1.8f)
                lineToRelative(-0.65f, 1.66f)
                curveToRelative(-0.04f, 0.14f, 0.0f, 0.21f, 0.14f, 0.21f)
                horizontalLineToRelative(2.12f)
                lineToRelative(-1.14f, 4.09f)
                horizontalLineToRelative(0.29f)
                lineToRelative(4.08f, -5.49f)
                curveToRelative(0.04f, -0.04f, 0.04f, -0.09f, 0.01f, -0.14f)
                curveToRelative(-0.03f, -0.05f, -0.08f, -0.07f, -0.15f, -0.07f)
                horizontalLineToRelative(-2.17f)
                lineToRelative(2.47f, -4.67f)
                curveToRelative(0.07f, -0.14f, 0.03f, -0.22f, -0.13f, -0.22f)
                horizontalLineTo(9.73f)
                curveToRelative(-0.09f, 0.0f, -0.16f, 0.05f, -0.19f, 0.14f)
                lineToRelative(-1.11f, 2.93f)
                curveToRelative(-0.71f, -0.18f, -1.3f, -0.57f, -1.78f, -1.17f)
                curveToRelative(-0.47f, -0.6f, -0.71f, -1.27f, -0.71f, -2.02f)
                curveToRelative(0.0f, -0.84f, 0.28f, -1.57f, 0.85f, -2.19f)
                reflectiveCurveToRelative(1.27f, -0.97f, 2.1f, -1.05f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.11f, -1.09f, 0.56f, -2.0f, 1.37f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.09f, 2.86f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.05f, 0.36f, 2.86f, 1.09f)
                curveToRelative(0.81f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.07f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.62f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.33f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.97f, 1.4f, 0.97f, 2.28f)
                curveToRelative(0.0f, 0.86f, -0.3f, 1.6f, -0.9f, 2.23f)
                curveToRelative(-0.6f, 0.63f, -1.33f, 0.97f, -2.2f, 1.04f)
                curveToRelative(-0.12f, 0.0f, -0.19f, 0.06f, -0.19f, 0.18f)
                verticalLineToRelative(1.38f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.19f, 0.17f)
                curveToRelative(1.33f, -0.04f, 2.46f, -0.55f, 3.39f, -1.52f)
                curveToRelative(0.93f, -0.97f, 1.39f, -2.12f, 1.39f, -3.47f)
                curveToRelative(0.0f, -0.73f, -0.14f, -1.39f, -0.41f, -2.0f)
                curveToRelative(0.76f, -1.0f, 1.14f, -2.1f, 1.14f, -3.29f)
                curveToRelative(0.0f, -0.71f, -0.14f, -1.39f, -0.42f, -2.04f)
                curveToRelative(-0.28f, -0.65f, -0.66f, -1.2f, -1.12f, -1.67f)
                reflectiveCurveToRelative(-1.03f, -0.84f, -1.68f, -1.12f)
                curveToRelative(-0.65f, -0.28f, -1.33f, -0.42f, -2.03f, -0.42f)
                curveToRelative(-0.74f, 0.0f, -1.44f, 0.15f, -2.12f, 0.45f)
                curveToRelative(-0.67f, 0.3f, -1.26f, 0.72f, -1.74f, 1.26f)
                curveToRelative(-0.82f, -0.44f, -1.72f, -0.66f, -2.7f, -0.66f)
                curveToRelative(-1.42f, 0.0f, -2.68f, 0.44f, -3.77f, 1.31f)
                reflectiveCurveToRelative(-1.8f, 2.0f, -2.11f, 3.37f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.83f, -2.74f, 1.73f)
                reflectiveCurveTo(4.25f, 15.71f, 4.25f, 16.86f)
                close()
                moveTo(12.42f, 26.73f)
                curveToRelative(0.0f, 0.18f, 0.05f, 0.35f, 0.16f, 0.51f)
                curveToRelative(0.11f, 0.17f, 0.26f, 0.27f, 0.46f, 0.3f)
                curveToRelative(0.02f, 0.0f, 0.05f, 0.0f, 0.08f, 0.01f)
                reflectiveCurveToRelative(0.07f, 0.01f, 0.09f, 0.01f)
                reflectiveCurveToRelative(0.05f, 0.0f, 0.08f, 0.0f)
                curveToRelative(0.43f, -0.03f, 0.69f, -0.23f, 0.8f, -0.61f)
                lineToRelative(0.29f, -1.06f)
                curveToRelative(0.06f, -0.22f, 0.03f, -0.43f, -0.09f, -0.63f)
                curveToRelative(-0.12f, -0.2f, -0.3f, -0.34f, -0.53f, -0.41f)
                curveToRelative(-0.22f, -0.06f, -0.43f, -0.03f, -0.63f, 0.08f)
                curveToRelative(-0.2f, 0.12f, -0.34f, 0.3f, -0.41f, 0.53f)
                lineToRelative(-0.25f, 1.0f)
                curveTo(12.44f, 26.64f, 12.42f, 26.72f, 12.42f, 26.73f)
                close()
                moveTo(13.76f, 21.96f)
                curveToRelative(0.0f, 0.15f, 0.05f, 0.3f, 0.15f, 0.45f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.26f, 0.46f, 0.34f)
                curveToRelative(0.22f, 0.08f, 0.43f, 0.06f, 0.63f, -0.05f)
                curveToRelative(0.2f, -0.11f, 0.33f, -0.29f, 0.4f, -0.53f)
                lineToRelative(0.3f, -1.04f)
                curveToRelative(0.06f, -0.25f, 0.04f, -0.48f, -0.08f, -0.68f)
                reflectiveCurveToRelative(-0.29f, -0.32f, -0.53f, -0.37f)
                curveToRelative(-0.22f, -0.07f, -0.44f, -0.05f, -0.64f, 0.07f)
                reflectiveCurveToRelative(-0.34f, 0.29f, -0.42f, 0.53f)
                lineToRelative(-0.25f, 1.02f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.05f, -0.01f, 0.08f)
                reflectiveCurveToRelative(-0.01f, 0.07f, -0.01f, 0.09f)
                curveTo(13.76f, 21.9f, 13.76f, 21.93f, 13.76f, 21.96f)
                close()
                moveTo(16.59f, 23.58f)
                curveToRelative(0.0f, 0.19f, 0.05f, 0.36f, 0.16f, 0.52f)
                curveToRelative(0.11f, 0.16f, 0.26f, 0.27f, 0.47f, 0.32f)
                curveToRelative(0.16f, 0.03f, 0.25f, 0.05f, 0.27f, 0.05f)
                curveToRelative(0.39f, 0.0f, 0.65f, -0.2f, 0.77f, -0.6f)
                lineToRelative(0.24f, -1.06f)
                curveToRelative(0.07f, -0.22f, 0.05f, -0.43f, -0.06f, -0.63f)
                curveToRelative(-0.11f, -0.2f, -0.27f, -0.34f, -0.5f, -0.41f)
                curveToRelative(-0.25f, -0.06f, -0.48f, -0.03f, -0.68f, 0.09f)
                curveToRelative(-0.21f, 0.12f, -0.33f, 0.3f, -0.38f, 0.53f)
                lineToRelative(-0.28f, 0.99f)
                curveTo(16.6f, 23.43f, 16.59f, 23.5f, 16.59f, 23.58f)
                close()
                moveTo(17.95f, 18.83f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.32f, 0.16f, 0.47f)
                curveToRelative(0.11f, 0.15f, 0.27f, 0.27f, 0.49f, 0.34f)
                curveToRelative(0.17f, 0.02f, 0.26f, 0.03f, 0.26f, 0.03f)
                curveToRelative(0.12f, 0.0f, 0.24f, -0.03f, 0.38f, -0.08f)
                curveToRelative(0.19f, -0.1f, 0.33f, -0.27f, 0.39f, -0.52f)
                lineToRelative(0.29f, -1.04f)
                curveToRelative(0.06f, -0.22f, 0.03f, -0.43f, -0.09f, -0.63f)
                curveToRelative(-0.12f, -0.2f, -0.3f, -0.34f, -0.53f, -0.41f)
                curveToRelative(-0.23f, -0.07f, -0.44f, -0.05f, -0.64f, 0.07f)
                reflectiveCurveToRelative(-0.33f, 0.29f, -0.4f, 0.53f)
                lineToRelative(-0.28f, 1.02f)
                curveTo(17.96f, 18.7f, 17.95f, 18.77f, 17.95f, 18.83f)
                close()
                moveTo(18.06f, 8.98f)
                curveToRelative(0.66f, -0.64f, 1.48f, -0.96f, 2.45f, -0.96f)
                curveToRelative(0.98f, 0.0f, 1.82f, 0.35f, 2.5f, 1.04f)
                curveToRelative(0.69f, 0.69f, 1.03f, 1.53f, 1.03f, 2.51f)
                curveToRelative(0.0f, 0.63f, -0.16f, 1.22f, -0.49f, 1.78f)
                curveToRelative(-0.99f, -0.96f, -2.15f, -1.44f, -3.49f, -1.44f)
                horizontalLineToRelative(-0.32f)
                curveTo(19.44f, 10.75f, 18.88f, 9.77f, 18.06f, 8.98f)
                close()
            }
        }
        .build()
        return _nightStormShowers!!
    }

private var _nightStormShowers: ImageVector? = null
