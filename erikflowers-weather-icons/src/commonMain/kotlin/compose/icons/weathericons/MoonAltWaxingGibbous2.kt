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

public val WeatherIcons.MoonAltWaxingGibbous2: ImageVector
    get() {
        if (_moonAltWaxingGibbous2 != null) {
            return _moonAltWaxingGibbous2!!
        }
        _moonAltWaxingGibbous2 = Builder(name = "MoonAltWaxingGibbous2", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.44f)
                curveToRelative(0.0f, -1.52f, 0.3f, -2.98f, 0.89f, -4.37f)
                reflectiveCurveToRelative(1.4f, -2.58f, 2.4f, -3.59f)
                reflectiveCurveToRelative(2.2f, -1.81f, 3.59f, -2.4f)
                reflectiveCurveToRelative(2.84f, -0.89f, 4.37f, -0.89f)
                reflectiveCurveToRelative(2.98f, 0.3f, 4.37f, 0.89f)
                reflectiveCurveToRelative(2.59f, 1.4f, 3.6f, 2.4f)
                reflectiveCurveToRelative(1.81f, 2.2f, 2.4f, 3.59f)
                reflectiveCurveToRelative(0.89f, 2.84f, 0.89f, 4.37f)
                reflectiveCurveToRelative(-0.3f, 2.98f, -0.89f, 4.37f)
                reflectiveCurveToRelative(-1.4f, 2.59f, -2.4f, 3.6f)
                reflectiveCurveToRelative(-2.2f, 1.81f, -3.6f, 2.4f)
                reflectiveCurveToRelative(-2.85f, 0.89f, -4.37f, 0.89f)
                reflectiveCurveToRelative(-2.98f, -0.3f, -4.37f, -0.89f)
                reflectiveCurveToRelative(-2.58f, -1.4f, -3.59f, -2.4f)
                reflectiveCurveToRelative(-1.81f, -2.2f, -2.4f, -3.6f)
                reflectiveCurveTo(3.74f, 15.97f, 3.74f, 14.44f)
                close()
                moveTo(11.96f, 14.44f)
                curveToRelative(0.0f, 4.15f, 0.81f, 7.5f, 2.42f, 10.05f)
                curveToRelative(0.15f, 0.01f, 0.35f, 0.01f, 0.62f, 0.01f)
                curveToRelative(1.37f, 0.0f, 2.67f, -0.27f, 3.91f, -0.8f)
                reflectiveCurveToRelative(2.31f, -1.25f, 3.21f, -2.15f)
                reflectiveCurveToRelative(1.61f, -1.97f, 2.15f, -3.21f)
                reflectiveCurveToRelative(0.8f, -2.54f, 0.8f, -3.91f)
                curveToRelative(0.0f, -1.36f, -0.27f, -2.66f, -0.8f, -3.9f)
                reflectiveCurveToRelative(-1.25f, -2.31f, -2.15f, -3.21f)
                reflectiveCurveToRelative(-1.97f, -1.61f, -3.21f, -2.15f)
                reflectiveCurveToRelative(-2.54f, -0.8f, -3.91f, -0.8f)
                curveToRelative(-0.23f, 0.0f, -0.42f, 0.0f, -0.54f, 0.01f)
                curveTo(12.79f, 7.55f, 11.96f, 10.9f, 11.96f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaxingGibbous2!!
    }

private var _moonAltWaxingGibbous2: ImageVector? = null
