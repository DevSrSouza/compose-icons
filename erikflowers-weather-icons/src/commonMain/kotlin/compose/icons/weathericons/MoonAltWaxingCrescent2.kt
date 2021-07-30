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

public val WeatherIcons.MoonAltWaxingCrescent2: ImageVector
    get() {
        if (_moonAltWaxingCrescent2 != null) {
            return _moonAltWaxingCrescent2!!
        }
        _moonAltWaxingCrescent2 = Builder(name = "MoonAltWaxingCrescent2", defaultWidth = 30.0.dp,
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
                moveTo(15.9f, 4.42f)
                curveToRelative(1.48f, 0.99f, 2.7f, 2.34f, 3.65f, 4.05f)
                reflectiveCurveToRelative(1.42f, 3.7f, 1.42f, 5.97f)
                curveToRelative(0.0f, 4.8f, -1.6f, 8.13f, -4.79f, 9.99f)
                curveToRelative(1.65f, -0.2f, 3.15f, -0.76f, 4.5f, -1.68f)
                reflectiveCurveToRelative(2.42f, -2.12f, 3.2f, -3.58f)
                reflectiveCurveToRelative(1.17f, -3.03f, 1.17f, -4.72f)
                curveToRelative(0.0f, -1.72f, -0.41f, -3.32f, -1.22f, -4.8f)
                reflectiveCurveToRelative(-1.91f, -2.69f, -3.31f, -3.61f)
                reflectiveCurveTo(17.59f, 4.57f, 15.9f, 4.42f)
                close()
            }
        }
        .build()
        return _moonAltWaxingCrescent2!!
    }

private var _moonAltWaxingCrescent2: ImageVector? = null
