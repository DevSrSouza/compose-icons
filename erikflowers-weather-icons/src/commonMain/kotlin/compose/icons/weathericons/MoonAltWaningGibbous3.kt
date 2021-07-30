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

public val WeatherIcons.MoonAltWaningGibbous3: ImageVector
    get() {
        if (_moonAltWaningGibbous3 != null) {
            return _moonAltWaningGibbous3!!
        }
        _moonAltWaningGibbous3 = Builder(name = "MoonAltWaningGibbous3", defaultWidth = 30.0.dp,
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
                moveTo(4.94f, 14.44f)
                curveToRelative(0.0f, 1.37f, 0.27f, 2.67f, 0.8f, 3.91f)
                reflectiveCurveToRelative(1.25f, 2.31f, 2.15f, 3.21f)
                reflectiveCurveToRelative(1.97f, 1.61f, 3.21f, 2.15f)
                reflectiveCurveToRelative(2.54f, 0.8f, 3.9f, 0.8f)
                curveToRelative(0.33f, 0.0f, 0.58f, 0.0f, 0.73f, -0.01f)
                curveToRelative(0.78f, -0.61f, 1.44f, -1.31f, 1.96f, -2.11f)
                reflectiveCurveToRelative(0.92f, -1.66f, 1.18f, -2.57f)
                reflectiveCurveToRelative(0.44f, -1.79f, 0.54f, -2.63f)
                reflectiveCurveToRelative(0.15f, -1.75f, 0.15f, -2.74f)
                curveToRelative(0.0f, -1.91f, -0.32f, -3.76f, -0.97f, -5.54f)
                reflectiveCurveToRelative(-1.65f, -3.28f, -3.02f, -4.49f)
                curveToRelative(-0.13f, -0.01f, -0.32f, -0.01f, -0.59f, -0.01f)
                curveToRelative(-1.36f, 0.0f, -2.66f, 0.27f, -3.9f, 0.8f)
                reflectiveCurveTo(8.79f, 6.44f, 7.89f, 7.34f)
                reflectiveCurveToRelative(-1.61f, 1.97f, -2.15f, 3.21f)
                reflectiveCurveTo(4.94f, 13.09f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningGibbous3!!
    }

private var _moonAltWaningGibbous3: ImageVector? = null
