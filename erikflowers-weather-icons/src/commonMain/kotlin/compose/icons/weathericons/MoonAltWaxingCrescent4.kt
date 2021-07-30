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

public val WeatherIcons.MoonAltWaxingCrescent4: ImageVector
    get() {
        if (_moonAltWaxingCrescent4 != null) {
            return _moonAltWaxingCrescent4!!
        }
        _moonAltWaxingCrescent4 = Builder(name = "MoonAltWaxingCrescent4", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 14.44f)
                curveToRelative(0.0f, -1.52f, 0.3f, -2.98f, 0.89f, -4.37f)
                reflectiveCurveToRelative(1.4f, -2.58f, 2.4f, -3.59f)
                reflectiveCurveToRelative(2.2f, -1.81f, 3.59f, -2.4f)
                reflectiveCurveTo(13.48f, 3.19f, 15.0f, 3.19f)
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
                reflectiveCurveTo(3.75f, 15.97f, 3.75f, 14.44f)
                close()
                moveTo(15.35f, 4.39f)
                curveToRelative(1.05f, 1.27f, 1.91f, 2.75f, 2.57f, 4.44f)
                reflectiveCurveToRelative(0.99f, 3.56f, 0.99f, 5.61f)
                curveToRelative(0.0f, 4.39f, -1.14f, 7.75f, -3.43f, 10.06f)
                curveToRelative(1.31f, -0.06f, 2.55f, -0.37f, 3.74f, -0.92f)
                reflectiveCurveToRelative(2.2f, -1.28f, 3.05f, -2.18f)
                reflectiveCurveToRelative(1.53f, -1.95f, 2.04f, -3.16f)
                reflectiveCurveToRelative(0.75f, -2.48f, 0.75f, -3.81f)
                curveToRelative(0.0f, -1.78f, -0.43f, -3.43f, -1.3f, -4.94f)
                reflectiveCurveToRelative(-2.04f, -2.73f, -3.53f, -3.65f)
                reflectiveCurveTo(17.12f, 4.45f, 15.35f, 4.39f)
                close()
            }
        }
        .build()
        return _moonAltWaxingCrescent4!!
    }

private var _moonAltWaxingCrescent4: ImageVector? = null
