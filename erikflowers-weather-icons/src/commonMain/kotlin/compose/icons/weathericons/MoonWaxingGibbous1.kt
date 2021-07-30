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

public val WeatherIcons.MoonWaxingGibbous1: ImageVector
    get() {
        if (_moonWaxingGibbous1 != null) {
            return _moonWaxingGibbous1!!
        }
        _moonWaxingGibbous1 = Builder(name = "MoonWaxingGibbous1", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.93f, 14.44f)
                curveToRelative(-0.02f, 4.53f, 0.33f, 8.29f, 1.04f, 11.27f)
                curveToRelative(2.04f, 0.01f, 3.93f, -0.49f, 5.65f, -1.49f)
                reflectiveCurveToRelative(3.1f, -2.36f, 4.11f, -4.08f)
                reflectiveCurveToRelative(1.52f, -3.61f, 1.53f, -5.65f)
                curveToRelative(0.01f, -2.04f, -0.49f, -3.93f, -1.49f, -5.65f)
                curveToRelative(-1.0f, -1.73f, -2.36f, -3.1f, -4.08f, -4.11f)
                reflectiveCurveToRelative(-3.6f, -1.52f, -5.64f, -1.53f)
                curveTo(14.32f, 6.91f, 13.94f, 10.66f, 13.93f, 14.44f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous1!!
    }

private var _moonWaxingGibbous1: ImageVector? = null
