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

public val WeatherIcons.Time11: ImageVector
    get() {
        if (_time11 != null) {
            return _time11!!
        }
        _time11 = Builder(name = "Time11", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.47f)
                curveToRelative(0.0f, -2.04f, 0.51f, -3.93f, 1.52f, -5.66f)
                reflectiveCurveToRelative(2.38f, -3.1f, 4.11f, -4.11f)
                reflectiveCurveToRelative(3.61f, -1.51f, 5.64f, -1.51f)
                curveToRelative(1.52f, 0.0f, 2.98f, 0.3f, 4.37f, 0.89f)
                reflectiveCurveToRelative(2.58f, 1.4f, 3.59f, 2.4f)
                reflectiveCurveToRelative(1.81f, 2.2f, 2.4f, 3.6f)
                reflectiveCurveToRelative(0.89f, 2.85f, 0.89f, 4.39f)
                curveToRelative(0.0f, 1.52f, -0.3f, 2.98f, -0.89f, 4.37f)
                reflectiveCurveToRelative(-1.4f, 2.59f, -2.4f, 3.59f)
                reflectiveCurveToRelative(-2.2f, 1.8f, -3.59f, 2.39f)
                reflectiveCurveToRelative(-2.84f, 0.89f, -4.37f, 0.89f)
                curveToRelative(-1.53f, 0.0f, -3.0f, -0.3f, -4.39f, -0.89f)
                reflectiveCurveToRelative(-2.59f, -1.4f, -3.6f, -2.4f)
                reflectiveCurveToRelative(-1.8f, -2.2f, -2.4f, -3.58f)
                reflectiveCurveTo(3.74f, 16.0f, 3.74f, 14.47f)
                close()
                moveTo(6.22f, 14.47f)
                curveToRelative(0.0f, 2.37f, 0.86f, 4.43f, 2.59f, 6.18f)
                curveToRelative(1.73f, 1.73f, 3.79f, 2.59f, 6.2f, 2.59f)
                curveToRelative(1.58f, 0.0f, 3.05f, -0.39f, 4.39f, -1.18f)
                reflectiveCurveToRelative(2.42f, -1.85f, 3.21f, -3.2f)
                reflectiveCurveToRelative(1.19f, -2.81f, 1.19f, -4.39f)
                reflectiveCurveToRelative(-0.4f, -3.05f, -1.19f, -4.4f)
                reflectiveCurveToRelative(-1.86f, -2.42f, -3.21f, -3.21f)
                curveToRelative(-1.35f, -0.79f, -2.81f, -1.18f, -4.39f, -1.18f)
                reflectiveCurveToRelative(-3.05f, 0.39f, -4.39f, 1.18f)
                curveTo(9.27f, 7.65f, 8.2f, 8.72f, 7.4f, 10.07f)
                reflectiveCurveTo(6.22f, 12.89f, 6.22f, 14.47f)
                close()
                moveTo(11.84f, 10.24f)
                curveToRelative(0.06f, -0.22f, 0.19f, -0.39f, 0.38f, -0.5f)
                curveToRelative(0.2f, -0.12f, 0.41f, -0.15f, 0.64f, -0.09f)
                reflectiveCurveToRelative(0.4f, 0.19f, 0.51f, 0.38f)
                lineToRelative(0.78f, 1.3f)
                verticalLineTo(7.81f)
                curveToRelative(0.0f, -0.23f, 0.08f, -0.43f, 0.24f, -0.59f)
                reflectiveCurveToRelative(0.36f, -0.24f, 0.59f, -0.24f)
                reflectiveCurveToRelative(0.43f, 0.08f, 0.59f, 0.24f)
                reflectiveCurveToRelative(0.24f, 0.36f, 0.24f, 0.59f)
                verticalLineToRelative(6.67f)
                curveToRelative(0.0f, 0.23f, -0.08f, 0.43f, -0.24f, 0.59f)
                reflectiveCurveToRelative(-0.36f, 0.24f, -0.59f, 0.24f)
                curveToRelative(-0.4f, 0.0f, -0.66f, -0.18f, -0.79f, -0.53f)
                lineToRelative(-2.26f, -3.91f)
                curveTo(11.81f, 10.67f, 11.78f, 10.46f, 11.84f, 10.24f)
                close()
            }
        }
        .build()
        return _time11!!
    }

private var _time11: ImageVector? = null