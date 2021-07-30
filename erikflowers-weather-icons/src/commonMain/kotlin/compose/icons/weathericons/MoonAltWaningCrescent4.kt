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

public val WeatherIcons.MoonAltWaningCrescent4: ImageVector
    get() {
        if (_moonAltWaningCrescent4 != null) {
            return _moonAltWaningCrescent4!!
        }
        _moonAltWaningCrescent4 = Builder(name = "MoonAltWaningCrescent4", defaultWidth = 30.0.dp,
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
                curveToRelative(0.0f, 1.33f, 0.25f, 2.6f, 0.75f, 3.81f)
                reflectiveCurveToRelative(1.18f, 2.26f, 2.03f, 3.15f)
                reflectiveCurveToRelative(1.87f, 1.61f, 3.05f, 2.17f)
                reflectiveCurveToRelative(2.43f, 0.87f, 3.74f, 0.94f)
                curveToRelative(-1.24f, -1.19f, -2.11f, -2.63f, -2.61f, -4.31f)
                reflectiveCurveToRelative(-0.75f, -3.6f, -0.75f, -5.76f)
                curveToRelative(0.0f, -1.93f, 0.31f, -3.78f, 0.92f, -5.54f)
                reflectiveCurveToRelative(1.47f, -3.26f, 2.56f, -4.5f)
                curveToRelative(-1.77f, 0.07f, -3.39f, 0.56f, -4.88f, 1.47f)
                reflectiveCurveTo(7.09f, 8.0f, 6.23f, 9.51f)
                reflectiveCurveTo(4.94f, 12.68f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningCrescent4!!
    }

private var _moonAltWaningCrescent4: ImageVector? = null
