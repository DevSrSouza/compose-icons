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

public val WeatherIcons.MoonAltWaxingCrescent5: ImageVector
    get() {
        if (_moonAltWaxingCrescent5 != null) {
            return _moonAltWaxingCrescent5!!
        }
        _moonAltWaxingCrescent5 = Builder(name = "MoonAltWaxingCrescent5", defaultWidth = 30.0.dp,
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
                moveTo(15.15f, 4.39f)
                curveToRelative(1.83f, 3.22f, 2.74f, 6.57f, 2.74f, 10.05f)
                curveToRelative(0.0f, 4.16f, -0.88f, 7.51f, -2.65f, 10.06f)
                curveToRelative(1.34f, -0.03f, 2.61f, -0.32f, 3.82f, -0.86f)
                reflectiveCurveToRelative(2.25f, -1.27f, 3.13f, -2.16f)
                reflectiveCurveToRelative(1.57f, -1.95f, 2.09f, -3.18f)
                reflectiveCurveToRelative(0.78f, -2.51f, 0.78f, -3.86f)
                curveToRelative(0.0f, -1.8f, -0.44f, -3.46f, -1.33f, -5.0f)
                reflectiveCurveToRelative(-2.08f, -2.75f, -3.6f, -3.65f)
                reflectiveCurveTo(16.95f, 4.42f, 15.15f, 4.39f)
                close()
            }
        }
        .build()
        return _moonAltWaxingCrescent5!!
    }

private var _moonAltWaxingCrescent5: ImageVector? = null
