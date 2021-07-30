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

public val WeatherIcons.MoonAltWaningGibbous4: ImageVector
    get() {
        if (_moonAltWaningGibbous4 != null) {
            return _moonAltWaningGibbous4!!
        }
        _moonAltWaningGibbous4 = Builder(name = "MoonAltWaningGibbous4", defaultWidth = 30.0.dp,
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
                horizontalLineToRelative(0.38f)
                curveToRelative(0.6f, -0.64f, 1.1f, -1.37f, 1.5f, -2.19f)
                reflectiveCurveToRelative(0.71f, -1.67f, 0.9f, -2.58f)
                reflectiveCurveToRelative(0.33f, -1.77f, 0.41f, -2.59f)
                reflectiveCurveToRelative(0.12f, -1.73f, 0.12f, -2.7f)
                curveToRelative(0.0f, -1.88f, -0.24f, -3.7f, -0.73f, -5.46f)
                reflectiveCurveToRelative(-1.25f, -3.28f, -2.3f, -4.59f)
                horizontalLineToRelative(-0.28f)
                curveToRelative(-1.36f, 0.0f, -2.66f, 0.27f, -3.9f, 0.8f)
                reflectiveCurveTo(8.79f, 6.44f, 7.89f, 7.34f)
                reflectiveCurveToRelative(-1.61f, 1.97f, -2.15f, 3.21f)
                reflectiveCurveTo(4.94f, 13.09f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningGibbous4!!
    }

private var _moonAltWaningGibbous4: ImageVector? = null
