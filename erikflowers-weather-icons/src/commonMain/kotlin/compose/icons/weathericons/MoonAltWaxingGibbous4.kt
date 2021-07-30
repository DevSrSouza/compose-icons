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

public val WeatherIcons.MoonAltWaxingGibbous4: ImageVector
    get() {
        if (_moonAltWaxingGibbous4 != null) {
            return _moonAltWaxingGibbous4!!
        }
        _moonAltWaxingGibbous4 = Builder(name = "MoonAltWaxingGibbous4", defaultWidth = 30.0.dp,
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
                moveTo(9.13f, 14.43f)
                curveToRelative(0.0f, 4.68f, 1.48f, 8.0f, 4.45f, 9.98f)
                curveToRelative(0.44f, 0.07f, 0.91f, 0.1f, 1.42f, 0.1f)
                curveToRelative(1.37f, 0.0f, 2.67f, -0.27f, 3.91f, -0.8f)
                reflectiveCurveToRelative(2.31f, -1.25f, 3.22f, -2.15f)
                reflectiveCurveToRelative(1.62f, -1.97f, 2.15f, -3.22f)
                reflectiveCurveToRelative(0.8f, -2.55f, 0.8f, -3.9f)
                curveToRelative(0.0f, -1.82f, -0.45f, -3.5f, -1.35f, -5.05f)
                reflectiveCurveToRelative(-2.13f, -2.77f, -3.68f, -3.68f)
                reflectiveCurveToRelative(-3.23f, -1.35f, -5.05f, -1.35f)
                curveToRelative(-0.45f, 0.0f, -0.84f, 0.02f, -1.19f, 0.06f)
                curveToRelative(-1.4f, 1.06f, -2.53f, 2.46f, -3.39f, 4.2f)
                reflectiveCurveTo(9.13f, 12.29f, 9.13f, 14.43f)
                close()
            }
        }
        .build()
        return _moonAltWaxingGibbous4!!
    }

private var _moonAltWaxingGibbous4: ImageVector? = null
