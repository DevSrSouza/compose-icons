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

public val WeatherIcons.MoonAltWaningGibbous1: ImageVector
    get() {
        if (_moonAltWaningGibbous1 != null) {
            return _moonAltWaningGibbous1!!
        }
        _moonAltWaningGibbous1 = Builder(name = "MoonAltWaningGibbous1", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.43f)
                curveToRelative(0.0f, -2.04f, 0.51f, -3.92f, 1.52f, -5.65f)
                reflectiveCurveTo(7.64f, 5.7f, 9.37f, 4.69f)
                reflectiveCurveToRelative(3.61f, -1.5f, 5.65f, -1.5f)
                reflectiveCurveToRelative(3.92f, 0.5f, 5.65f, 1.5f)
                reflectiveCurveToRelative(3.09f, 2.36f, 4.09f, 4.09f)
                reflectiveCurveToRelative(1.5f, 3.61f, 1.5f, 5.65f)
                reflectiveCurveToRelative(-0.5f, 3.93f, -1.5f, 5.65f)
                reflectiveCurveToRelative(-2.36f, 3.1f, -4.09f, 4.11f)
                reflectiveCurveToRelative(-3.61f, 1.52f, -5.65f, 1.52f)
                reflectiveCurveToRelative(-3.93f, -0.51f, -5.65f, -1.52f)
                reflectiveCurveToRelative(-3.1f, -2.38f, -4.11f, -4.11f)
                reflectiveCurveTo(3.74f, 16.47f, 3.74f, 14.43f)
                close()
                moveTo(4.94f, 14.43f)
                curveToRelative(0.0f, 1.36f, 0.27f, 2.66f, 0.81f, 3.9f)
                reflectiveCurveTo(7.0f, 20.65f, 7.9f, 21.55f)
                reflectiveCurveToRelative(1.97f, 1.62f, 3.22f, 2.15f)
                reflectiveCurveToRelative(2.55f, 0.81f, 3.9f, 0.81f)
                curveToRelative(0.86f, 0.0f, 1.62f, -0.09f, 2.29f, -0.28f)
                curveToRelative(0.83f, -0.44f, 1.55f, -0.96f, 2.17f, -1.57f)
                reflectiveCurveToRelative(1.1f, -1.22f, 1.46f, -1.85f)
                reflectiveCurveToRelative(0.64f, -1.33f, 0.86f, -2.09f)
                reflectiveCurveToRelative(0.36f, -1.48f, 0.43f, -2.14f)
                reflectiveCurveToRelative(0.1f, -1.37f, 0.1f, -2.15f)
                curveToRelative(0.0f, -0.93f, -0.1f, -1.84f, -0.3f, -2.74f)
                reflectiveCurveTo(21.52f, 9.9f, 21.1f, 9.02f)
                reflectiveCurveToRelative(-0.99f, -1.72f, -1.72f, -2.5f)
                reflectiveCurveToRelative(-1.57f, -1.45f, -2.54f, -1.99f)
                curveToRelative(-0.4f, -0.09f, -1.01f, -0.13f, -1.82f, -0.13f)
                curveToRelative(-1.36f, 0.0f, -2.66f, 0.26f, -3.9f, 0.79f)
                reflectiveCurveTo(8.8f, 6.43f, 7.9f, 7.32f)
                reflectiveCurveToRelative(-1.62f, 1.97f, -2.15f, 3.2f)
                reflectiveCurveTo(4.94f, 13.06f, 4.94f, 14.43f)
                close()
            }
        }
        .build()
        return _moonAltWaningGibbous1!!
    }

private var _moonAltWaningGibbous1: ImageVector? = null
