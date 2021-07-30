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

public val WeatherIcons.MoonAltWaningCrescent3: ImageVector
    get() {
        if (_moonAltWaningCrescent3 != null) {
            return _moonAltWaningCrescent3!!
        }
        _moonAltWaningCrescent3 = Builder(name = "MoonAltWaningCrescent3", defaultWidth = 30.0.dp,
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
                curveToRelative(0.0f, 1.34f, 0.26f, 2.62f, 0.77f, 3.85f)
                reflectiveCurveToRelative(1.21f, 2.29f, 2.08f, 3.19f)
                reflectiveCurveToRelative(1.92f, 1.62f, 3.13f, 2.16f)
                reflectiveCurveToRelative(2.48f, 0.83f, 3.81f, 0.87f)
                curveToRelative(-1.71f, -2.32f, -2.56f, -5.68f, -2.56f, -10.06f)
                curveToRelative(0.0f, -1.87f, 0.23f, -3.67f, 0.69f, -5.41f)
                reflectiveCurveToRelative(1.11f, -3.29f, 1.95f, -4.64f)
                curveToRelative(-1.8f, 0.03f, -3.45f, 0.5f, -4.96f, 1.41f)
                reflectiveCurveToRelative(-2.7f, 2.13f, -3.58f, 3.65f)
                reflectiveCurveTo(4.94f, 12.65f, 4.94f, 14.44f)
                close()
            }
        }
        .build()
        return _moonAltWaningCrescent3!!
    }

private var _moonAltWaningCrescent3: ImageVector? = null
