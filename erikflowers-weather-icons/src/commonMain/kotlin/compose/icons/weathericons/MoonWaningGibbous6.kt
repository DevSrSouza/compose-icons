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

public val WeatherIcons.MoonWaningGibbous6: ImageVector
    get() {
        if (_moonWaningGibbous6 != null) {
            return _moonWaningGibbous6!!
        }
        _moonWaningGibbous6 = Builder(name = "MoonWaningGibbous6", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.46f)
                curveToRelative(0.0f, 2.04f, 0.5f, 3.92f, 1.51f, 5.65f)
                reflectiveCurveToRelative(2.37f, 3.09f, 4.09f, 4.09f)
                reflectiveCurveToRelative(3.61f, 1.51f, 5.65f, 1.51f)
                curveToRelative(1.44f, -3.08f, 2.15f, -6.83f, 2.15f, -11.25f)
                curveToRelative(0.0f, -3.46f, -0.72f, -7.2f, -2.15f, -11.24f)
                curveToRelative(-1.52f, 0.0f, -2.98f, 0.3f, -4.37f, 0.89f)
                reflectiveCurveTo(8.03f, 5.5f, 7.03f, 6.5f)
                reflectiveCurveToRelative(-1.8f, 2.2f, -2.4f, 3.59f)
                reflectiveCurveTo(3.74f, 12.93f, 3.74f, 14.46f)
                close()
            }
        }
        .build()
        return _moonWaningGibbous6!!
    }

private var _moonWaningGibbous6: ImageVector? = null
