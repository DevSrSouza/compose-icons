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

public val WeatherIcons.MoonWaxingGibbous3: ImageVector
    get() {
        if (_moonWaxingGibbous3 != null) {
            return _moonWaxingGibbous3!!
        }
        _moonWaxingGibbous3 = Builder(name = "MoonWaxingGibbous3", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.8f, 14.43f)
                curveToRelative(0.0f, 2.39f, 0.24f, 4.52f, 0.71f, 6.39f)
                reflectiveCurveToRelative(1.31f, 3.5f, 2.51f, 4.89f)
                curveToRelative(1.52f, 0.0f, 2.98f, -0.3f, 4.37f, -0.89f)
                reflectiveCurveToRelative(2.59f, -1.4f, 3.6f, -2.4f)
                reflectiveCurveToRelative(1.81f, -2.2f, 2.4f, -3.6f)
                reflectiveCurveToRelative(0.89f, -2.85f, 0.89f, -4.39f)
                reflectiveCurveToRelative(-0.3f, -2.99f, -0.89f, -4.38f)
                reflectiveCurveToRelative(-1.4f, -2.58f, -2.4f, -3.59f)
                reflectiveCurveToRelative(-2.2f, -1.81f, -3.6f, -2.4f)
                reflectiveCurveToRelative(-2.85f, -0.89f, -4.37f, -0.89f)
                curveToRelative(-1.02f, 1.46f, -1.81f, 3.16f, -2.37f, 5.13f)
                reflectiveCurveTo(11.8f, 12.3f, 11.8f, 14.43f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous3!!
    }

private var _moonWaxingGibbous3: ImageVector? = null
