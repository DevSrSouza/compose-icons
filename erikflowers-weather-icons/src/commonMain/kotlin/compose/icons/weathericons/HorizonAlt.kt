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

public val WeatherIcons.HorizonAlt: ImageVector
    get() {
        if (_horizonAlt != null) {
            return _horizonAlt!!
        }
        _horizonAlt = Builder(name = "HorizonAlt", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.11f, 15.9f)
                curveToRelative(0.0f, -0.26f, 0.09f, -0.47f, 0.27f, -0.62f)
                curveToRelative(0.14f, -0.15f, 0.35f, -0.23f, 0.62f, -0.23f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.24f, 0.0f, 0.45f, 0.08f, 0.6f, 0.24f)
                curveToRelative(0.16f, 0.16f, 0.24f, 0.36f, 0.24f, 0.6f)
                curveToRelative(0.0f, 0.24f, -0.08f, 0.44f, -0.24f, 0.61f)
                curveToRelative(-0.16f, 0.17f, -0.36f, 0.25f, -0.6f, 0.25f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.24f, 0.0f, -0.45f, -0.08f, -0.63f, -0.25f)
                curveTo(4.19f, 16.34f, 4.11f, 16.14f, 4.11f, 15.9f)
                close()
                moveTo(5.03f, 20.98f)
                curveToRelative(0.0f, -0.23f, 0.09f, -0.43f, 0.26f, -0.61f)
                curveToRelative(0.16f, -0.16f, 0.37f, -0.23f, 0.61f, -0.23f)
                horizontalLineToRelative(18.21f)
                curveToRelative(0.24f, 0.0f, 0.45f, 0.08f, 0.62f, 0.24f)
                curveToRelative(0.17f, 0.16f, 0.25f, 0.36f, 0.25f, 0.6f)
                curveToRelative(0.0f, 0.24f, -0.09f, 0.44f, -0.26f, 0.61f)
                reflectiveCurveToRelative(-0.38f, 0.26f, -0.61f, 0.26f)
                horizontalLineTo(5.91f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.09f, -0.61f, -0.26f)
                reflectiveCurveTo(5.03f, 21.22f, 5.03f, 20.98f)
                close()
                moveTo(7.08f, 8.81f)
                curveToRelative(0.0f, -0.26f, 0.08f, -0.45f, 0.23f, -0.59f)
                curveToRelative(0.17f, -0.18f, 0.38f, -0.27f, 0.62f, -0.27f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.09f, 0.61f, 0.27f)
                lineToRelative(1.44f, 1.46f)
                curveToRelative(0.18f, 0.16f, 0.26f, 0.36f, 0.26f, 0.6f)
                curveToRelative(0.0f, 0.25f, -0.08f, 0.45f, -0.24f, 0.61f)
                reflectiveCurveToRelative(-0.36f, 0.24f, -0.6f, 0.24f)
                curveToRelative(-0.22f, 0.0f, -0.42f, -0.08f, -0.6f, -0.24f)
                lineTo(7.31f, 9.42f)
                curveTo(7.16f, 9.28f, 7.08f, 9.08f, 7.08f, 8.81f)
                close()
                moveTo(9.68f, 15.9f)
                curveToRelative(0.0f, 0.87f, 0.18f, 1.65f, 0.53f, 2.33f)
                curveToRelative(0.03f, 0.09f, 0.11f, 0.14f, 0.24f, 0.14f)
                horizontalLineToRelative(1.67f)
                curveToRelative(0.07f, 0.0f, 0.12f, -0.02f, 0.14f, -0.06f)
                curveToRelative(0.02f, -0.04f, -0.01f, -0.1f, -0.07f, -0.16f)
                curveToRelative(-0.53f, -0.65f, -0.8f, -1.4f, -0.8f, -2.25f)
                curveToRelative(0.0f, -0.99f, 0.36f, -1.84f, 1.07f, -2.54f)
                curveToRelative(0.71f, -0.7f, 1.56f, -1.05f, 2.55f, -1.05f)
                curveToRelative(0.99f, 0.0f, 1.84f, 0.35f, 2.55f, 1.05f)
                reflectiveCurveToRelative(1.05f, 1.55f, 1.05f, 2.54f)
                curveToRelative(0.0f, 0.86f, -0.27f, 1.61f, -0.8f, 2.25f)
                curveToRelative(-0.04f, 0.06f, -0.06f, 0.1f, -0.06f, 0.12f)
                curveToRelative(-0.01f, 0.03f, 0.0f, 0.06f, 0.03f, 0.07f)
                curveToRelative(0.02f, 0.02f, 0.06f, 0.03f, 0.1f, 0.03f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.09f, 0.0f, 0.16f, -0.05f, 0.21f, -0.14f)
                curveToRelative(0.38f, -0.71f, 0.56f, -1.48f, 0.56f, -2.33f)
                curveToRelative(0.0f, -0.96f, -0.24f, -1.85f, -0.72f, -2.67f)
                curveToRelative(-0.48f, -0.82f, -1.13f, -1.47f, -1.95f, -1.95f)
                reflectiveCurveToRelative(-1.71f, -0.72f, -2.67f, -0.72f)
                reflectiveCurveToRelative(-1.85f, 0.24f, -2.67f, 0.72f)
                curveToRelative(-0.82f, 0.48f, -1.47f, 1.13f, -1.95f, 1.95f)
                curveTo(9.91f, 14.05f, 9.68f, 14.94f, 9.68f, 15.9f)
                close()
                moveTo(14.15f, 7.97f)
                verticalLineTo(5.88f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.25f, -0.62f)
                curveTo(14.57f, 5.08f, 14.77f, 5.0f, 15.01f, 5.0f)
                curveToRelative(0.24f, 0.0f, 0.44f, 0.09f, 0.62f, 0.26f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.38f, 0.26f, 0.62f)
                verticalLineToRelative(2.09f)
                curveToRelative(0.0f, 0.24f, -0.09f, 0.44f, -0.26f, 0.62f)
                curveToRelative(-0.18f, 0.18f, -0.38f, 0.26f, -0.62f, 0.26f)
                curveToRelative(-0.24f, 0.0f, -0.44f, -0.09f, -0.61f, -0.26f)
                curveTo(14.23f, 8.41f, 14.15f, 8.21f, 14.15f, 7.97f)
                close()
                moveTo(19.77f, 10.28f)
                curveToRelative(0.0f, -0.24f, 0.08f, -0.44f, 0.24f, -0.6f)
                lineToRelative(1.44f, -1.46f)
                curveToRelative(0.17f, -0.18f, 0.38f, -0.27f, 0.62f, -0.27f)
                curveToRelative(0.25f, 0.0f, 0.46f, 0.08f, 0.62f, 0.25f)
                curveToRelative(0.17f, 0.17f, 0.25f, 0.37f, 0.25f, 0.61f)
                curveToRelative(0.0f, 0.26f, -0.08f, 0.46f, -0.23f, 0.61f)
                lineToRelative(-1.51f, 1.47f)
                curveToRelative(-0.16f, 0.15f, -0.36f, 0.22f, -0.59f, 0.22f)
                curveToRelative(-0.25f, 0.01f, -0.45f, -0.07f, -0.61f, -0.22f)
                curveTo(19.85f, 10.74f, 19.77f, 10.53f, 19.77f, 10.28f)
                close()
                moveTo(22.1f, 15.9f)
                curveToRelative(0.0f, -0.27f, 0.08f, -0.47f, 0.24f, -0.62f)
                curveToRelative(0.14f, -0.15f, 0.34f, -0.23f, 0.59f, -0.23f)
                horizontalLineToRelative(2.09f)
                curveToRelative(0.24f, 0.0f, 0.45f, 0.08f, 0.62f, 0.24f)
                curveToRelative(0.17f, 0.16f, 0.26f, 0.36f, 0.26f, 0.6f)
                curveToRelative(0.0f, 0.24f, -0.09f, 0.44f, -0.26f, 0.61f)
                curveToRelative(-0.18f, 0.17f, -0.38f, 0.25f, -0.62f, 0.25f)
                horizontalLineToRelative(-2.09f)
                curveToRelative(-0.23f, 0.0f, -0.43f, -0.08f, -0.59f, -0.25f)
                curveTo(22.18f, 16.34f, 22.1f, 16.14f, 22.1f, 15.9f)
                close()
            }
        }
        .build()
        return _horizonAlt!!
    }

private var _horizonAlt: ImageVector? = null
