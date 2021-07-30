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

public val WeatherIcons.MoonAltWaxingGibbous6: ImageVector
    get() {
        if (_moonAltWaxingGibbous6 != null) {
            return _moonAltWaxingGibbous6!!
        }
        _moonAltWaxingGibbous6 = Builder(name = "MoonAltWaxingGibbous6", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.44f)
                curveToRelative(0.0f, -1.53f, 0.3f, -3.0f, 0.89f, -4.39f)
                reflectiveCurveToRelative(1.4f, -2.59f, 2.4f, -3.6f)
                reflectiveCurveToRelative(2.2f, -1.81f, 3.6f, -2.4f)
                reflectiveCurveToRelative(2.85f, -0.89f, 4.37f, -0.89f)
                curveToRelative(1.53f, 0.0f, 3.0f, 0.3f, 4.39f, 0.89f)
                reflectiveCurveToRelative(2.59f, 1.4f, 3.6f, 2.4f)
                reflectiveCurveToRelative(1.81f, 2.2f, 2.4f, 3.6f)
                reflectiveCurveToRelative(0.89f, 2.85f, 0.89f, 4.39f)
                curveToRelative(0.0f, 1.52f, -0.3f, 2.98f, -0.89f, 4.37f)
                reflectiveCurveToRelative(-1.4f, 2.59f, -2.4f, 3.6f)
                reflectiveCurveToRelative(-2.2f, 1.81f, -3.6f, 2.4f)
                reflectiveCurveToRelative(-2.85f, 0.89f, -4.39f, 0.89f)
                curveToRelative(-1.52f, 0.0f, -2.98f, -0.3f, -4.37f, -0.89f)
                reflectiveCurveToRelative(-2.59f, -1.4f, -3.6f, -2.4f)
                reflectiveCurveToRelative(-1.81f, -2.2f, -2.4f, -3.6f)
                reflectiveCurveTo(3.74f, 15.97f, 3.74f, 14.44f)
                close()
                moveTo(6.42f, 14.44f)
                curveToRelative(0.0f, 0.78f, 0.05f, 1.5f, 0.15f, 2.15f)
                curveToRelative(0.1f, 0.65f, 0.29f, 1.35f, 0.57f, 2.09f)
                reflectiveCurveToRelative(0.66f, 1.41f, 1.13f, 2.03f)
                reflectiveCurveToRelative(1.09f, 1.24f, 1.88f, 1.86f)
                reflectiveCurveToRelative(1.7f, 1.2f, 2.77f, 1.71f)
                curveToRelative(0.67f, 0.15f, 1.37f, 0.22f, 2.09f, 0.22f)
                curveToRelative(1.37f, 0.0f, 2.67f, -0.27f, 3.91f, -0.8f)
                reflectiveCurveToRelative(2.31f, -1.25f, 3.22f, -2.15f)
                reflectiveCurveToRelative(1.62f, -1.97f, 2.15f, -3.22f)
                reflectiveCurveToRelative(0.8f, -2.55f, 0.8f, -3.9f)
                curveToRelative(0.0f, -1.82f, -0.45f, -3.5f, -1.35f, -5.05f)
                reflectiveCurveToRelative(-2.13f, -2.77f, -3.68f, -3.68f)
                reflectiveCurveToRelative(-3.23f, -1.35f, -5.05f, -1.35f)
                curveToRelative(-0.85f, 0.0f, -1.62f, 0.09f, -2.31f, 0.26f)
                curveTo(11.81f, 5.05f, 11.03f, 5.51f, 10.35f, 6.0f)
                reflectiveCurveTo(9.1f, 7.01f, 8.66f, 7.54f)
                reflectiveCurveTo(7.84f, 8.62f, 7.53f, 9.16f)
                reflectiveCurveToRelative(-0.54f, 1.12f, -0.69f, 1.74f)
                reflectiveCurveToRelative(-0.26f, 1.2f, -0.32f, 1.75f)
                reflectiveCurveTo(6.42f, 13.8f, 6.42f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaxingGibbous6!!
    }

private var _moonAltWaxingGibbous6: ImageVector? = null
