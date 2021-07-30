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

public val WeatherIcons.MoonAltWaxingCrescent6: ImageVector
    get() {
        if (_moonAltWaxingCrescent6 != null) {
            return _moonAltWaxingCrescent6!!
        }
        _moonAltWaxingCrescent6 = Builder(name = "MoonAltWaxingCrescent6", defaultWidth = 30.0.dp,
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
                moveTo(15.01f, 4.39f)
                curveToRelative(1.23f, 3.54f, 1.85f, 6.89f, 1.85f, 10.05f)
                curveToRelative(0.0f, 3.93f, -0.59f, 7.28f, -1.77f, 10.06f)
                curveToRelative(1.35f, -0.01f, 2.64f, -0.28f, 3.87f, -0.81f)
                reflectiveCurveToRelative(2.3f, -1.25f, 3.19f, -2.15f)
                reflectiveCurveToRelative(1.6f, -1.97f, 2.12f, -3.21f)
                reflectiveCurveToRelative(0.79f, -2.54f, 0.79f, -3.9f)
                reflectiveCurveToRelative(-0.27f, -2.66f, -0.8f, -3.9f)
                reflectiveCurveToRelative(-1.25f, -2.31f, -2.15f, -3.21f)
                reflectiveCurveToRelative(-1.97f, -1.61f, -3.21f, -2.15f)
                reflectiveCurveTo(16.36f, 4.39f, 15.01f, 4.39f)
                close()
            }
        }
        .build()
        return _moonAltWaxingCrescent6!!
    }

private var _moonAltWaxingCrescent6: ImageVector? = null
