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

public val WeatherIcons.Hail: ImageVector
    get() {
        if (_hail != null) {
            return _hail!!
        }
        _hail = Builder(name = "Hail", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.64f, 16.9f)
                curveToRelative(0.0f, 1.33f, 0.46f, 2.47f, 1.39f, 3.43f)
                curveToRelative(0.93f, 0.96f, 2.06f, 1.47f, 3.4f, 1.53f)
                curveToRelative(0.11f, 0.0f, 0.17f, -0.06f, 0.17f, -0.17f)
                verticalLineToRelative(-1.34f)
                curveToRelative(0.0f, -0.11f, -0.06f, -0.17f, -0.17f, -0.17f)
                curveToRelative(-0.86f, -0.04f, -1.58f, -0.38f, -2.18f, -1.02f)
                curveToRelative(-0.6f, -0.64f, -0.9f, -1.39f, -0.9f, -2.26f)
                curveToRelative(0.0f, -0.83f, 0.28f, -1.54f, 0.84f, -2.16f)
                curveToRelative(0.56f, -0.61f, 1.26f, -0.97f, 2.09f, -1.07f)
                lineToRelative(0.53f, -0.03f)
                curveToRelative(0.13f, 0.0f, 0.2f, -0.06f, 0.2f, -0.19f)
                lineToRelative(0.06f, -0.53f)
                curveToRelative(0.11f, -1.08f, 0.56f, -1.99f, 1.37f, -2.71f)
                curveToRelative(0.81f, -0.73f, 1.76f, -1.09f, 2.85f, -1.09f)
                curveToRelative(1.09f, 0.0f, 2.04f, 0.36f, 2.85f, 1.09f)
                curveToRelative(0.81f, 0.73f, 1.27f, 1.63f, 1.39f, 2.71f)
                lineToRelative(0.08f, 0.58f)
                curveToRelative(0.0f, 0.11f, 0.06f, 0.17f, 0.18f, 0.17f)
                horizontalLineToRelative(1.61f)
                curveToRelative(0.89f, 0.0f, 1.66f, 0.32f, 2.31f, 0.96f)
                curveToRelative(0.65f, 0.64f, 0.98f, 1.39f, 0.98f, 2.27f)
                curveToRelative(0.0f, 0.87f, -0.3f, 1.62f, -0.9f, 2.26f)
                curveToRelative(-0.6f, 0.64f, -1.33f, 0.98f, -2.18f, 1.02f)
                curveToRelative(-0.13f, 0.0f, -0.2f, 0.06f, -0.2f, 0.17f)
                verticalLineToRelative(1.34f)
                curveToRelative(0.0f, 0.11f, 0.07f, 0.17f, 0.2f, 0.17f)
                curveToRelative(0.87f, -0.02f, 1.67f, -0.26f, 2.4f, -0.71f)
                curveToRelative(0.73f, -0.45f, 1.31f, -1.05f, 1.73f, -1.8f)
                curveToRelative(0.42f, -0.75f, 0.63f, -1.57f, 0.63f, -2.44f)
                curveToRelative(0.0f, -0.89f, -0.22f, -1.72f, -0.67f, -2.47f)
                curveToRelative(-0.44f, -0.75f, -1.05f, -1.35f, -1.81f, -1.78f)
                reflectiveCurveTo(21.29f, 12.0f, 20.4f, 12.0f)
                horizontalLineToRelative(-0.32f)
                curveToRelative(-0.32f, -1.34f, -1.03f, -2.43f, -2.1f, -3.28f)
                reflectiveCurveToRelative(-2.3f, -1.28f, -3.68f, -1.28f)
                curveToRelative(-1.41f, 0.0f, -2.66f, 0.44f, -3.75f, 1.31f)
                curveToRelative(-1.09f, 0.87f, -1.79f, 1.99f, -2.1f, 3.35f)
                curveToRelative(-1.11f, 0.26f, -2.02f, 0.83f, -2.73f, 1.73f)
                reflectiveCurveTo(4.64f, 15.75f, 4.64f, 16.9f)
                close()
                moveTo(10.09f, 24.1f)
                curveToRelative(0.09f, 0.21f, 0.25f, 0.37f, 0.46f, 0.46f)
                curveToRelative(0.2f, 0.1f, 0.41f, 0.11f, 0.62f, 0.02f)
                curveToRelative(0.22f, -0.09f, 0.36f, -0.24f, 0.45f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.11f, -0.43f, 0.02f, -0.64f)
                curveToRelative(-0.08f, -0.21f, -0.24f, -0.35f, -0.45f, -0.44f)
                curveToRelative(-0.2f, -0.11f, -0.4f, -0.12f, -0.61f, -0.03f)
                curveToRelative(-0.21f, 0.09f, -0.36f, 0.24f, -0.46f, 0.47f)
                curveTo(10.01f, 23.66f, 10.01f, 23.86f, 10.09f, 24.1f)
                close()
                moveTo(10.72f, 21.28f)
                curveToRelative(0.0f, 0.16f, 0.05f, 0.31f, 0.15f, 0.45f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.25f, 0.46f, 0.32f)
                curveToRelative(0.19f, 0.11f, 0.4f, 0.12f, 0.62f, 0.01f)
                curveToRelative(0.22f, -0.1f, 0.37f, -0.3f, 0.44f, -0.6f)
                lineToRelative(0.9f, -3.38f)
                curveToRelative(0.06f, -0.25f, 0.04f, -0.47f, -0.08f, -0.67f)
                curveToRelative(-0.12f, -0.2f, -0.29f, -0.32f, -0.53f, -0.36f)
                curveToRelative(-0.08f, -0.02f, -0.16f, -0.03f, -0.24f, -0.03f)
                curveToRelative(-0.16f, 0.0f, -0.32f, 0.05f, -0.47f, 0.15f)
                curveToRelative(-0.15f, 0.1f, -0.26f, 0.25f, -0.32f, 0.44f)
                lineToRelative(-0.88f, 3.39f)
                curveTo(10.73f, 21.16f, 10.72f, 21.25f, 10.72f, 21.28f)
                close()
                moveTo(12.58f, 26.87f)
                curveToRelative(0.0f, 0.12f, 0.02f, 0.22f, 0.06f, 0.29f)
                curveToRelative(0.09f, 0.22f, 0.24f, 0.37f, 0.45f, 0.45f)
                curveToRelative(0.09f, 0.05f, 0.2f, 0.08f, 0.33f, 0.08f)
                curveToRelative(0.06f, 0.0f, 0.16f, -0.02f, 0.3f, -0.06f)
                curveToRelative(0.22f, -0.08f, 0.38f, -0.23f, 0.47f, -0.45f)
                curveToRelative(0.1f, -0.22f, 0.1f, -0.44f, 0.0f, -0.66f)
                curveToRelative(-0.1f, -0.22f, -0.25f, -0.37f, -0.45f, -0.46f)
                curveToRelative(-0.2f, -0.09f, -0.4f, -0.09f, -0.62f, 0.0f)
                curveToRelative(-0.19f, 0.08f, -0.32f, 0.2f, -0.41f, 0.36f)
                curveTo(12.62f, 26.58f, 12.58f, 26.73f, 12.58f, 26.87f)
                close()
                moveTo(13.31f, 24.26f)
                curveToRelative(0.0f, 0.37f, 0.21f, 0.61f, 0.63f, 0.73f)
                curveToRelative(0.11f, 0.03f, 0.19f, 0.04f, 0.24f, 0.04f)
                curveToRelative(0.15f, 0.0f, 0.28f, -0.03f, 0.38f, -0.08f)
                curveToRelative(0.21f, -0.08f, 0.35f, -0.27f, 0.42f, -0.57f)
                lineToRelative(1.67f, -6.29f)
                curveToRelative(0.06f, -0.24f, 0.04f, -0.45f, -0.06f, -0.65f)
                curveToRelative(-0.1f, -0.19f, -0.27f, -0.32f, -0.49f, -0.38f)
                curveToRelative(-0.08f, -0.02f, -0.17f, -0.03f, -0.27f, -0.03f)
                curveToRelative(-0.16f, 0.0f, -0.32f, 0.05f, -0.48f, 0.15f)
                curveToRelative(-0.16f, 0.1f, -0.26f, 0.25f, -0.3f, 0.44f)
                lineToRelative(-1.71f, 6.34f)
                curveTo(13.32f, 24.1f, 13.31f, 24.2f, 13.31f, 24.26f)
                close()
                moveTo(16.74f, 23.8f)
                curveToRelative(0.0f, 0.12f, 0.02f, 0.23f, 0.08f, 0.32f)
                curveToRelative(0.08f, 0.19f, 0.23f, 0.34f, 0.44f, 0.44f)
                curveToRelative(0.11f, 0.04f, 0.23f, 0.07f, 0.35f, 0.07f)
                curveToRelative(0.06f, 0.0f, 0.16f, -0.02f, 0.3f, -0.06f)
                curveToRelative(0.21f, -0.08f, 0.37f, -0.23f, 0.46f, -0.44f)
                curveToRelative(0.07f, -0.22f, 0.07f, -0.43f, -0.01f, -0.63f)
                curveToRelative(-0.08f, -0.2f, -0.22f, -0.35f, -0.42f, -0.45f)
                curveToRelative(-0.23f, -0.11f, -0.44f, -0.12f, -0.65f, -0.03f)
                curveToRelative(-0.21f, 0.09f, -0.36f, 0.24f, -0.46f, 0.47f)
                curveTo(16.77f, 23.59f, 16.74f, 23.69f, 16.74f, 23.8f)
                close()
                moveTo(17.47f, 21.23f)
                curveToRelative(0.0f, 0.14f, 0.05f, 0.29f, 0.16f, 0.45f)
                curveToRelative(0.11f, 0.16f, 0.26f, 0.27f, 0.45f, 0.33f)
                curveToRelative(0.16f, 0.03f, 0.25f, 0.05f, 0.27f, 0.05f)
                curveToRelative(0.09f, 0.0f, 0.22f, -0.03f, 0.37f, -0.1f)
                curveToRelative(0.2f, -0.09f, 0.33f, -0.27f, 0.4f, -0.52f)
                lineToRelative(0.9f, -3.34f)
                curveToRelative(0.02f, -0.17f, 0.03f, -0.26f, 0.03f, -0.26f)
                curveToRelative(0.0f, -0.16f, -0.05f, -0.31f, -0.15f, -0.46f)
                curveToRelative(-0.1f, -0.15f, -0.25f, -0.25f, -0.45f, -0.31f)
                curveToRelative(-0.09f, -0.02f, -0.18f, -0.03f, -0.26f, -0.03f)
                curveToRelative(-0.16f, 0.0f, -0.32f, 0.05f, -0.47f, 0.15f)
                reflectiveCurveToRelative(-0.25f, 0.25f, -0.31f, 0.45f)
                lineToRelative(-0.9f, 3.36f)
                lineTo(17.47f, 21.23f)
                close()
            }
        }
        .build()
        return _hail!!
    }

private var _hail: ImageVector? = null
