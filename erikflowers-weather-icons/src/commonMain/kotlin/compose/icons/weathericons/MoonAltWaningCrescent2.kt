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

public val WeatherIcons.MoonAltWaningCrescent2: ImageVector
    get() {
        if (_moonAltWaningCrescent2 != null) {
            return _moonAltWaningCrescent2!!
        }
        _moonAltWaningCrescent2 = Builder(name = "MoonAltWaningCrescent2", defaultWidth = 30.0.dp,
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
                curveToRelative(0.0f, 1.36f, 0.26f, 2.65f, 0.79f, 3.89f)
                reflectiveCurveToRelative(1.24f, 2.3f, 2.12f, 3.2f)
                reflectiveCurveToRelative(1.95f, 1.62f, 3.17f, 2.15f)
                reflectiveCurveToRelative(2.52f, 0.81f, 3.87f, 0.82f)
                curveToRelative(-1.16f, -2.47f, -1.74f, -5.83f, -1.74f, -10.06f)
                curveToRelative(0.0f, -3.61f, 0.6f, -6.96f, 1.8f, -10.05f)
                curveToRelative(-1.36f, 0.0f, -2.65f, 0.27f, -3.89f, 0.81f)
                reflectiveCurveToRelative(-2.3f, 1.25f, -3.19f, 2.15f)
                reflectiveCurveToRelative(-1.61f, 1.97f, -2.14f, 3.2f)
                reflectiveCurveTo(4.94f, 13.09f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningCrescent2!!
    }

private var _moonAltWaningCrescent2: ImageVector? = null
