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

public val WeatherIcons.MoonAltWaxingCrescent1: ImageVector
    get() {
        if (_moonAltWaxingCrescent1 != null) {
            return _moonAltWaxingCrescent1!!
        }
        _moonAltWaxingCrescent1 = Builder(name = "MoonAltWaxingCrescent1", defaultWidth = 30.0.dp,
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
                moveTo(16.38f, 4.48f)
                curveToRelative(1.64f, 0.9f, 2.99f, 2.2f, 4.04f, 3.9f)
                reflectiveCurveToRelative(1.57f, 3.72f, 1.57f, 6.06f)
                curveToRelative(0.0f, 4.9f, -1.72f, 8.2f, -5.16f, 9.89f)
                curveToRelative(2.35f, -0.44f, 4.31f, -1.59f, 5.87f, -3.44f)
                reflectiveCurveToRelative(2.34f, -4.0f, 2.34f, -6.45f)
                curveToRelative(0.0f, -1.66f, -0.38f, -3.21f, -1.14f, -4.66f)
                reflectiveCurveToRelative(-1.8f, -2.63f, -3.13f, -3.57f)
                reflectiveCurveTo(18.0f, 4.71f, 16.38f, 4.48f)
                close()
            }
        }
        .build()
        return _moonAltWaxingCrescent1!!
    }

private var _moonAltWaxingCrescent1: ImageVector? = null
