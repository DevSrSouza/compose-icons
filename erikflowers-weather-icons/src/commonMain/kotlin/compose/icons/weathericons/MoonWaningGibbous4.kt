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

public val WeatherIcons.MoonWaningGibbous4: ImageVector
    get() {
        if (_moonWaningGibbous4 != null) {
            return _moonWaningGibbous4!!
        }
        _moonWaningGibbous4 = Builder(name = "MoonWaningGibbous4", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.47f)
                curveToRelative(0.0f, 1.52f, 0.3f, 2.98f, 0.89f, 4.37f)
                reflectiveCurveToRelative(1.39f, 2.58f, 2.4f, 3.59f)
                reflectiveCurveToRelative(2.2f, 1.8f, 3.59f, 2.4f)
                reflectiveCurveToRelative(2.84f, 0.89f, 4.37f, 0.89f)
                curveToRelative(2.89f, -2.39f, 4.34f, -6.14f, 4.34f, -11.24f)
                curveToRelative(0.0f, -2.34f, -0.41f, -4.47f, -1.22f, -6.36f)
                reflectiveCurveToRelative(-1.85f, -3.52f, -3.11f, -4.87f)
                curveToRelative(-2.03f, 0.0f, -3.91f, 0.5f, -5.64f, 1.51f)
                reflectiveCurveTo(6.25f, 7.12f, 5.24f, 8.84f)
                reflectiveCurveTo(3.74f, 12.44f, 3.74f, 14.47f)
                close()
            }
        }
        .build()
        return _moonWaningGibbous4!!
    }

private var _moonWaningGibbous4: ImageVector? = null
