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

public val WeatherIcons.MoonAltWaningGibbous2: ImageVector
    get() {
        if (_moonAltWaningGibbous2 != null) {
            return _moonAltWaningGibbous2!!
        }
        _moonAltWaningGibbous2 = Builder(name = "MoonAltWaningGibbous2", defaultWidth = 30.0.dp,
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
                curveToRelative(0.36f, 0.0f, 0.76f, -0.02f, 1.2f, -0.07f)
                curveToRelative(0.93f, -0.57f, 1.71f, -1.24f, 2.35f, -2.03f)
                reflectiveCurveToRelative(1.12f, -1.64f, 1.43f, -2.56f)
                reflectiveCurveToRelative(0.53f, -1.8f, 0.65f, -2.65f)
                reflectiveCurveToRelative(0.18f, -1.77f, 0.18f, -2.75f)
                curveToRelative(0.0f, -1.25f, -0.15f, -2.46f, -0.46f, -3.64f)
                reflectiveCurveToRelative(-0.84f, -2.34f, -1.59f, -3.49f)
                reflectiveCurveToRelative(-1.69f, -2.11f, -2.81f, -2.89f)
                curveToRelative(-0.41f, -0.02f, -0.73f, -0.03f, -0.95f, -0.03f)
                curveToRelative(-1.36f, 0.0f, -2.66f, 0.27f, -3.9f, 0.8f)
                reflectiveCurveTo(8.79f, 6.44f, 7.89f, 7.34f)
                reflectiveCurveToRelative(-1.61f, 1.97f, -2.15f, 3.21f)
                reflectiveCurveTo(4.94f, 13.09f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningGibbous2!!
    }

private var _moonAltWaningGibbous2: ImageVector? = null
