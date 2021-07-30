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

public val WeatherIcons.MoonAltWaningCrescent6: ImageVector
    get() {
        if (_moonAltWaningCrescent6 != null) {
            return _moonAltWaningCrescent6!!
        }
        _moonAltWaningCrescent6 = Builder(name = "MoonAltWaningCrescent6", defaultWidth = 30.0.dp,
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
                curveToRelative(0.0f, 2.48f, 0.8f, 4.66f, 2.41f, 6.53f)
                reflectiveCurveToRelative(3.62f, 3.01f, 6.03f, 3.41f)
                curveToRelative(-1.01f, -0.5f, -1.86f, -1.1f, -2.56f, -1.82f)
                reflectiveCurveToRelative(-1.25f, -1.5f, -1.63f, -2.37f)
                reflectiveCurveToRelative(-0.66f, -1.77f, -0.83f, -2.7f)
                reflectiveCurveToRelative(-0.26f, -1.95f, -0.26f, -3.06f)
                curveToRelative(0.0f, -2.11f, 0.5f, -4.06f, 1.49f, -5.84f)
                reflectiveCurveToRelative(2.37f, -3.16f, 4.12f, -4.12f)
                curveToRelative(-1.63f, 0.21f, -3.11f, 0.77f, -4.45f, 1.7f)
                reflectiveCurveTo(6.87f, 8.3f, 6.1f, 9.76f)
                reflectiveCurveTo(4.94f, 12.77f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningCrescent6!!
    }

private var _moonAltWaningCrescent6: ImageVector? = null
