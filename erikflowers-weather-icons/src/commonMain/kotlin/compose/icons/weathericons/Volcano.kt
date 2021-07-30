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

public val WeatherIcons.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.39f, 22.61f)
                curveToRelative(-0.12f, -0.27f, -0.09f, -0.54f, 0.09f, -0.81f)
                lineToRelative(1.4f, -2.67f)
                curveToRelative(0.01f, -0.04f, 0.05f, -0.09f, 0.11f, -0.15f)
                curveToRelative(0.04f, -0.04f, 0.17f, -0.14f, 0.38f, -0.29f)
                curveToRelative(0.02f, -0.01f, 0.25f, -0.18f, 0.68f, -0.5f)
                curveToRelative(0.48f, -0.32f, 1.03f, -0.72f, 1.68f, -1.19f)
                lineToRelative(1.8f, -2.98f)
                curveToRelative(0.17f, -0.27f, 0.41f, -0.41f, 0.72f, -0.41f)
                horizontalLineToRelative(0.7f)
                curveToRelative(-0.16f, 0.19f, -0.31f, 0.39f, -0.45f, 0.6f)
                curveToRelative(-0.14f, 0.21f, -0.27f, 0.5f, -0.38f, 0.85f)
                curveToRelative(-0.12f, 0.36f, -0.18f, 0.71f, -0.18f, 1.07f)
                curveToRelative(0.0f, 0.36f, 0.09f, 0.77f, 0.28f, 1.25f)
                curveToRelative(0.19f, 0.47f, 0.48f, 0.94f, 0.88f, 1.39f)
                curveToRelative(0.27f, 0.31f, 0.44f, 0.62f, 0.5f, 0.93f)
                reflectiveCurveToRelative(0.02f, 0.58f, -0.1f, 0.83f)
                curveToRelative(-0.12f, 0.25f, -0.32f, 0.5f, -0.59f, 0.74f)
                curveToRelative(-0.27f, 0.24f, -0.56f, 0.45f, -0.88f, 0.63f)
                curveToRelative(-0.32f, 0.18f, -0.68f, 0.35f, -1.07f, 0.52f)
                curveToRelative(-0.39f, 0.17f, -0.75f, 0.3f, -1.05f, 0.41f)
                curveToRelative(-0.31f, 0.1f, -0.62f, 0.2f, -0.93f, 0.29f)
                horizontalLineTo(8.16f)
                curveToRelative(-0.16f, 0.0f, -0.32f, -0.05f, -0.46f, -0.14f)
                curveTo(7.55f, 22.89f, 7.45f, 22.77f, 7.39f, 22.61f)
                close()
                moveTo(10.14f, 7.74f)
                curveToRelative(0.0f, -0.46f, 0.15f, -0.88f, 0.45f, -1.24f)
                curveToRelative(0.3f, -0.37f, 0.69f, -0.6f, 1.16f, -0.72f)
                curveToRelative(0.11f, -0.56f, 0.4f, -1.02f, 0.85f, -1.38f)
                reflectiveCurveToRelative(0.98f, -0.54f, 1.56f, -0.54f)
                curveToRelative(0.56f, 0.0f, 1.06f, 0.17f, 1.5f, 0.52f)
                reflectiveCurveToRelative(0.73f, 0.8f, 0.86f, 1.35f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.57f, 0.0f, 1.07f, 0.18f, 1.5f, 0.54f)
                curveToRelative(0.42f, 0.36f, 0.64f, 0.79f, 0.64f, 1.3f)
                curveToRelative(0.0f, 0.56f, -0.22f, 1.03f, -0.65f, 1.43f)
                curveToRelative(0.0f, 0.27f, -0.12f, 0.59f, -0.36f, 0.93f)
                curveToRelative(-0.24f, 0.35f, -0.5f, 0.55f, -0.78f, 0.61f)
                curveToRelative(-0.06f, 0.31f, -0.21f, 0.57f, -0.43f, 0.78f)
                curveToRelative(-0.23f, 0.22f, -0.5f, 0.36f, -0.82f, 0.43f)
                curveToRelative(0.15f, 0.16f, 0.22f, 0.34f, 0.22f, 0.54f)
                curveToRelative(0.0f, 0.25f, -0.09f, 0.46f, -0.26f, 0.63f)
                curveToRelative(-0.18f, 0.17f, -0.39f, 0.25f, -0.64f, 0.25f)
                curveToRelative(-0.24f, 0.0f, -0.45f, -0.09f, -0.63f, -0.26f)
                curveToRelative(-0.18f, -0.17f, -0.26f, -0.38f, -0.26f, -0.62f)
                curveToRelative(0.0f, -0.03f, 0.01f, -0.08f, 0.02f, -0.14f)
                reflectiveCurveToRelative(0.02f, -0.11f, 0.02f, -0.13f)
                horizontalLineTo(14.2f)
                curveToRelative(-0.29f, 0.0f, -0.54f, -0.11f, -0.75f, -0.32f)
                curveToRelative(-0.21f, -0.21f, -0.32f, -0.46f, -0.32f, -0.75f)
                curveToRelative(0.0f, -0.12f, 0.06f, -0.3f, 0.18f, -0.53f)
                curveToRelative(-0.24f, -0.12f, -0.43f, -0.33f, -0.57f, -0.63f)
                horizontalLineToRelative(-0.63f)
                curveToRelative(-0.54f, -0.05f, -1.01f, -0.27f, -1.39f, -0.65f)
                curveTo(10.34f, 8.76f, 10.14f, 8.29f, 10.14f, 7.74f)
                close()
                moveTo(14.76f, 15.48f)
                curveToRelative(0.0f, -0.16f, 0.02f, -0.34f, 0.07f, -0.54f)
                curveToRelative(0.05f, -0.2f, 0.11f, -0.35f, 0.16f, -0.47f)
                curveToRelative(0.05f, -0.12f, 0.12f, -0.27f, 0.21f, -0.45f)
                curveToRelative(0.09f, -0.18f, 0.15f, -0.31f, 0.19f, -0.41f)
                horizontalLineToRelative(0.38f)
                curveToRelative(0.28f, 0.0f, 0.49f, 0.11f, 0.66f, 0.32f)
                lineToRelative(0.07f, 0.1f)
                lineToRelative(1.31f, 2.48f)
                lineToRelative(4.65f, 5.23f)
                lineToRelative(0.04f, 0.03f)
                curveToRelative(0.21f, 0.27f, 0.24f, 0.56f, 0.08f, 0.88f)
                curveToRelative(-0.15f, 0.31f, -0.4f, 0.46f, -0.75f, 0.46f)
                horizontalLineTo(16.2f)
                curveToRelative(0.17f, -0.16f, 0.32f, -0.29f, 0.44f, -0.39f)
                curveToRelative(0.12f, -0.11f, 0.27f, -0.27f, 0.45f, -0.49f)
                reflectiveCurveToRelative(0.33f, -0.43f, 0.42f, -0.61f)
                reflectiveCurveToRelative(0.17f, -0.42f, 0.23f, -0.69f)
                curveToRelative(0.06f, -0.27f, 0.07f, -0.53f, 0.01f, -0.79f)
                curveToRelative(-0.06f, -0.25f, -0.18f, -0.53f, -0.38f, -0.84f)
                curveToRelative(-0.19f, -0.31f, -0.46f, -0.61f, -0.81f, -0.91f)
                curveToRelative(-0.34f, -0.3f, -0.64f, -0.59f, -0.88f, -0.88f)
                curveToRelative(-0.24f, -0.28f, -0.43f, -0.54f, -0.56f, -0.76f)
                curveToRelative(-0.13f, -0.22f, -0.23f, -0.45f, -0.29f, -0.68f)
                curveTo(14.79f, 15.84f, 14.76f, 15.64f, 14.76f, 15.48f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
