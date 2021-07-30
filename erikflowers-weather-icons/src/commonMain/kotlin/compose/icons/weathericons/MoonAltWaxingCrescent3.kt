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

public val WeatherIcons.MoonAltWaxingCrescent3: ImageVector
    get() {
        if (_moonAltWaxingCrescent3 != null) {
            return _moonAltWaxingCrescent3!!
        }
        _moonAltWaxingCrescent3 = Builder(name = "MoonAltWaxingCrescent3", defaultWidth = 30.0.dp,
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
                moveTo(15.58f, 4.41f)
                curveToRelative(1.28f, 1.1f, 2.32f, 2.51f, 3.13f, 4.22f)
                reflectiveCurveToRelative(1.22f, 3.65f, 1.22f, 5.82f)
                curveToRelative(0.0f, 4.64f, -1.39f, 7.99f, -4.16f, 10.05f)
                curveToRelative(1.28f, -0.1f, 2.49f, -0.43f, 3.63f, -1.0f)
                reflectiveCurveToRelative(2.13f, -1.29f, 2.96f, -2.18f)
                reflectiveCurveToRelative(1.49f, -1.93f, 1.97f, -3.13f)
                reflectiveCurveToRelative(0.73f, -2.44f, 0.73f, -3.74f)
                curveToRelative(0.0f, -1.75f, -0.42f, -3.38f, -1.26f, -4.89f)
                reflectiveCurveToRelative(-1.99f, -2.72f, -3.44f, -3.64f)
                reflectiveCurveTo(17.31f, 4.5f, 15.58f, 4.41f)
                close()
            }
        }
        .build()
        return _moonAltWaxingCrescent3!!
    }

private var _moonAltWaxingCrescent3: ImageVector? = null
