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

public val WeatherIcons.MoonAltWaningCrescent5: ImageVector
    get() {
        if (_moonAltWaningCrescent5 != null) {
            return _moonAltWaningCrescent5!!
        }
        _moonAltWaningCrescent5 = Builder(name = "MoonAltWaningCrescent5", defaultWidth = 30.0.dp,
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
                curveToRelative(0.0f, 1.27f, 0.23f, 2.49f, 0.7f, 3.66f)
                reflectiveCurveToRelative(1.09f, 2.2f, 1.89f, 3.08f)
                reflectiveCurveToRelative(1.75f, 1.61f, 2.85f, 2.19f)
                reflectiveCurveToRelative(2.28f, 0.94f, 3.52f, 1.08f)
                curveToRelative(-1.75f, -1.04f, -2.98f, -2.39f, -3.7f, -4.07f)
                reflectiveCurveToRelative(-1.08f, -3.66f, -1.08f, -5.93f)
                curveToRelative(0.0f, -2.07f, 0.44f, -4.0f, 1.32f, -5.78f)
                reflectiveCurveToRelative(2.1f, -3.2f, 3.66f, -4.24f)
                curveToRelative(-1.26f, 0.11f, -2.46f, 0.45f, -3.59f, 1.02f)
                reflectiveCurveToRelative(-2.1f, 1.3f, -2.92f, 2.19f)
                reflectiveCurveToRelative(-1.46f, 1.92f, -1.93f, 3.11f)
                reflectiveCurveTo(4.94f, 13.15f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningCrescent5!!
    }

private var _moonAltWaningCrescent5: ImageVector? = null
