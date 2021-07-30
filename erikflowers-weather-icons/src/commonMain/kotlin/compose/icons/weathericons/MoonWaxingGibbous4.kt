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

public val WeatherIcons.MoonWaxingGibbous4: ImageVector
    get() {
        if (_moonWaxingGibbous4 != null) {
            return _moonWaxingGibbous4!!
        }
        _moonWaxingGibbous4 = Builder(name = "MoonWaxingGibbous4", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.73f, 14.43f)
                curveToRelative(0.0f, 1.19f, 0.07f, 2.29f, 0.2f, 3.3f)
                reflectiveCurveToRelative(0.35f, 2.0f, 0.67f, 2.99f)
                reflectiveCurveToRelative(0.76f, 1.9f, 1.33f, 2.75f)
                reflectiveCurveToRelative(1.27f, 1.59f, 2.09f, 2.25f)
                curveToRelative(1.53f, 0.0f, 2.99f, -0.3f, 4.38f, -0.89f)
                reflectiveCurveToRelative(2.58f, -1.4f, 3.59f, -2.4f)
                reflectiveCurveToRelative(1.81f, -2.2f, 2.4f, -3.6f)
                reflectiveCurveToRelative(0.89f, -2.85f, 0.89f, -4.39f)
                curveToRelative(0.0f, -2.04f, -0.5f, -3.93f, -1.51f, -5.65f)
                reflectiveCurveToRelative(-2.37f, -3.1f, -4.1f, -4.1f)
                reflectiveCurveToRelative(-3.61f, -1.51f, -5.65f, -1.51f)
                curveToRelative(-1.35f, 1.3f, -2.4f, 2.94f, -3.16f, 4.93f)
                reflectiveCurveTo(10.73f, 12.19f, 10.73f, 14.43f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous4!!
    }

private var _moonWaxingGibbous4: ImageVector? = null
