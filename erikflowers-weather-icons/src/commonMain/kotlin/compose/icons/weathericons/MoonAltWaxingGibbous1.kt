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

public val WeatherIcons.MoonAltWaxingGibbous1: ImageVector
    get() {
        if (_moonAltWaxingGibbous1 != null) {
            return _moonAltWaxingGibbous1!!
        }
        _moonAltWaxingGibbous1 = Builder(name = "MoonAltWaxingGibbous1", defaultWidth = 30.0.dp,
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
                moveTo(13.38f, 14.44f)
                curveToRelative(0.0f, 3.81f, 0.41f, 7.16f, 1.23f, 10.06f)
                horizontalLineToRelative(0.38f)
                curveToRelative(1.37f, 0.0f, 2.67f, -0.27f, 3.91f, -0.8f)
                reflectiveCurveToRelative(2.31f, -1.25f, 3.21f, -2.15f)
                reflectiveCurveToRelative(1.61f, -1.97f, 2.15f, -3.21f)
                reflectiveCurveToRelative(0.8f, -2.54f, 0.8f, -3.91f)
                curveToRelative(0.0f, -1.36f, -0.27f, -2.66f, -0.8f, -3.9f)
                reflectiveCurveToRelative(-1.25f, -2.31f, -2.15f, -3.21f)
                reflectiveCurveToRelative(-1.97f, -1.61f, -3.21f, -2.15f)
                reflectiveCurveToRelative(-2.54f, -0.8f, -3.91f, -0.8f)
                horizontalLineToRelative(-0.34f)
                curveTo(13.81f, 7.99f, 13.38f, 11.34f, 13.38f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaxingGibbous1!!
    }

private var _moonAltWaxingGibbous1: ImageVector? = null
