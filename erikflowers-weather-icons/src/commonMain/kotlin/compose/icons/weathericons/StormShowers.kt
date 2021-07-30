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

public val WeatherIcons.StormShowers: ImageVector
    get() {
        if (_stormShowers != null) {
            return _stormShowers!!
        }
        _stormShowers = Builder(name = "StormShowers", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.63f, 16.91f)
                curveToRelative(0.0f, 1.11f, 0.33f, 2.1f, 0.99f, 2.97f)
                reflectiveCurveToRelative(1.51f, 1.47f, 2.56f, 1.79f)
                lineToRelative(-0.65f, 1.68f)
                curveToRelative(-0.03f, 0.14f, 0.02f, 0.22f, 0.14f, 0.22f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.04f, 3.78f)
                horizontalLineToRelative(0.28f)
                lineToRelative(3.97f, -5.22f)
                curveToRelative(0.04f, -0.04f, 0.04f, -0.09f, 0.02f, -0.14f)
                reflectiveCurveToRelative(-0.07f, -0.07f, -0.14f, -0.07f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(2.48f, -4.64f)
                curveToRelative(0.06f, -0.14f, 0.02f, -0.21f, -0.14f, -0.21f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.09f, 0.0f, -0.17f, 0.05f, -0.22f, 0.14f)
                lineTo(8.8f, 20.08f)
                curveToRelative(-0.71f, -0.18f, -1.3f, -0.57f, -1.77f, -1.16f)
                curveToRelative(-0.47f, -0.59f, -0.7f, -1.26f, -0.7f, -2.01f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.55f, 0.84f, -2.16f)
                reflectiveCurveToRelative(1.26f, -0.96f, 2.1f, -1.06f)
                lineToRelative(0.52f, -0.07f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.17f)
                lineToRelative(0.07f, -0.52f)
                curveToRelative(0.1f, -1.08f, 0.55f, -1.99f, 1.36f, -2.72f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.1f, 2.85f, -1.1f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.37f, 2.85f, 1.1f)
                curveToRelative(0.82f, 0.73f, 1.28f, 1.64f, 1.4f, 2.72f)
                lineToRelative(0.06f, 0.58f)
                curveToRelative(0.0f, 0.12f, 0.06f, 0.18f, 0.19f, 0.18f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.91f, 0.0f, 1.68f, 0.32f, 2.32f, 0.95f)
                curveToRelative(0.64f, 0.63f, 0.96f, 1.39f, 0.96f, 2.28f)
                curveToRelative(0.0f, 0.85f, -0.3f, 1.59f, -0.89f, 2.21f)
                curveToRelative(-0.59f, 0.62f, -1.32f, 0.96f, -2.19f, 1.03f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.19f)
                verticalLineToRelative(1.37f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.65f, -0.02f, 1.27f, -0.17f, 1.86f, -0.44f)
                curveToRelative(0.59f, -0.27f, 1.1f, -0.63f, 1.52f, -1.07f)
                curveToRelative(0.42f, -0.44f, 0.76f, -0.96f, 1.01f, -1.57f)
                curveToRelative(0.25f, -0.6f, 0.38f, -1.23f, 0.38f, -1.88f)
                curveToRelative(0.0f, -0.9f, -0.22f, -1.73f, -0.67f, -2.49f)
                curveToRelative(-0.45f, -0.76f, -1.05f, -1.36f, -1.81f, -1.8f)
                curveToRelative(-0.76f, -0.44f, -1.59f, -0.66f, -2.48f, -0.66f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.33f, -1.33f, -1.03f, -2.42f, -2.11f, -3.26f)
                curveToRelative(-1.08f, -0.84f, -2.3f, -1.27f, -3.68f, -1.27f)
                curveToRelative(-1.41f, 0.0f, -2.67f, 0.44f, -3.76f, 1.31f)
                reflectiveCurveToRelative(-1.79f, 1.99f, -2.1f, 3.36f)
                curveToRelative(-1.1f, 0.26f, -2.01f, 0.83f, -2.73f, 1.73f)
                reflectiveCurveTo(4.63f, 15.76f, 4.63f, 16.91f)
                close()
                moveTo(12.79f, 26.77f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.31f, 0.15f, 0.46f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.26f, 0.46f, 0.32f)
                curveToRelative(0.14f, 0.03f, 0.22f, 0.05f, 0.25f, 0.05f)
                curveToRelative(0.09f, 0.0f, 0.21f, -0.03f, 0.38f, -0.1f)
                curveToRelative(0.21f, -0.09f, 0.35f, -0.27f, 0.42f, -0.52f)
                lineToRelative(0.28f, -1.05f)
                curveToRelative(0.06f, -0.22f, 0.04f, -0.43f, -0.08f, -0.63f)
                reflectiveCurveToRelative(-0.29f, -0.33f, -0.53f, -0.4f)
                curveToRelative(-0.22f, -0.06f, -0.43f, -0.04f, -0.63f, 0.08f)
                curveToRelative(-0.2f, 0.12f, -0.34f, 0.29f, -0.41f, 0.53f)
                lineToRelative(-0.27f, 1.0f)
                curveTo(12.8f, 26.68f, 12.79f, 26.77f, 12.79f, 26.77f)
                close()
                moveTo(14.13f, 22.0f)
                curveToRelative(0.0f, 0.14f, 0.05f, 0.29f, 0.15f, 0.44f)
                curveToRelative(0.1f, 0.15f, 0.25f, 0.26f, 0.45f, 0.33f)
                curveToRelative(0.22f, 0.07f, 0.44f, 0.06f, 0.64f, -0.05f)
                reflectiveCurveToRelative(0.33f, -0.28f, 0.4f, -0.52f)
                lineToRelative(0.3f, -1.04f)
                curveToRelative(0.06f, -0.22f, 0.03f, -0.43f, -0.08f, -0.63f)
                curveToRelative(-0.12f, -0.2f, -0.3f, -0.34f, -0.53f, -0.41f)
                curveToRelative(-0.23f, -0.06f, -0.44f, -0.04f, -0.65f, 0.08f)
                reflectiveCurveToRelative(-0.34f, 0.29f, -0.41f, 0.52f)
                lineToRelative(-0.24f, 1.01f)
                curveTo(14.14f, 21.9f, 14.13f, 21.99f, 14.13f, 22.0f)
                close()
                moveTo(16.95f, 23.65f)
                curveToRelative(0.0f, 0.17f, 0.05f, 0.34f, 0.16f, 0.51f)
                curveToRelative(0.11f, 0.17f, 0.27f, 0.28f, 0.47f, 0.35f)
                curveToRelative(0.02f, 0.0f, 0.06f, 0.01f, 0.12f, 0.02f)
                curveToRelative(0.05f, 0.01f, 0.09f, 0.02f, 0.12f, 0.02f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.02f, 0.38f, -0.08f)
                curveToRelative(0.19f, -0.07f, 0.33f, -0.26f, 0.41f, -0.57f)
                lineToRelative(0.25f, -1.01f)
                curveToRelative(0.07f, -0.23f, 0.05f, -0.45f, -0.06f, -0.66f)
                curveToRelative(-0.11f, -0.21f, -0.28f, -0.35f, -0.5f, -0.42f)
                curveToRelative(-0.25f, -0.06f, -0.48f, -0.03f, -0.68f, 0.08f)
                curveToRelative(-0.2f, 0.12f, -0.33f, 0.3f, -0.37f, 0.53f)
                lineToRelative(-0.27f, 1.03f)
                curveTo(16.96f, 23.51f, 16.95f, 23.58f, 16.95f, 23.65f)
                close()
                moveTo(18.31f, 18.86f)
                curveToRelative(-0.01f, 0.16f, 0.04f, 0.31f, 0.15f, 0.47f)
                curveToRelative(0.11f, 0.16f, 0.27f, 0.28f, 0.49f, 0.38f)
                curveToRelative(0.08f, 0.04f, 0.16f, 0.06f, 0.26f, 0.06f)
                curveToRelative(0.11f, 0.0f, 0.22f, -0.03f, 0.34f, -0.08f)
                curveToRelative(0.21f, -0.1f, 0.35f, -0.29f, 0.44f, -0.57f)
                lineToRelative(0.29f, -1.03f)
                curveToRelative(0.02f, -0.13f, 0.03f, -0.2f, 0.03f, -0.22f)
                curveToRelative(0.0f, -0.17f, -0.05f, -0.33f, -0.16f, -0.49f)
                reflectiveCurveToRelative(-0.27f, -0.27f, -0.49f, -0.33f)
                curveToRelative(-0.02f, 0.0f, -0.06f, -0.01f, -0.11f, -0.02f)
                curveTo(19.49f, 17.0f, 19.45f, 17.0f, 19.42f, 17.0f)
                curveToRelative(-0.17f, 0.0f, -0.33f, 0.05f, -0.49f, 0.15f)
                curveToRelative(-0.16f, 0.1f, -0.27f, 0.26f, -0.33f, 0.48f)
                lineToRelative(-0.27f, 1.01f)
                curveTo(18.32f, 18.72f, 18.31f, 18.79f, 18.31f, 18.86f)
                close()
            }
        }
        .build()
        return _stormShowers!!
    }

private var _stormShowers: ImageVector? = null
