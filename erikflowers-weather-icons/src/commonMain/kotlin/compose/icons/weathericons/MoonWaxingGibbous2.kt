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

public val WeatherIcons.MoonWaxingGibbous2: ImageVector
    get() {
        if (_moonWaxingGibbous2 != null) {
            return _moonWaxingGibbous2!!
        }
        _moonWaxingGibbous2 = Builder(name = "MoonWaxingGibbous2", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.85f, 14.44f)
                curveToRelative(0.0f, 4.77f, 0.71f, 8.52f, 2.14f, 11.26f)
                curveToRelative(2.04f, 0.0f, 3.93f, -0.5f, 5.65f, -1.51f)
                reflectiveCurveToRelative(3.1f, -2.37f, 4.1f, -4.1f)
                reflectiveCurveToRelative(1.51f, -3.61f, 1.51f, -5.65f)
                reflectiveCurveToRelative(-0.5f, -3.92f, -1.51f, -5.65f)
                reflectiveCurveToRelative(-2.37f, -3.09f, -4.1f, -4.09f)
                reflectiveCurveToRelative(-3.61f, -1.51f, -5.65f, -1.51f)
                curveTo(13.57f, 6.61f, 12.85f, 10.36f, 12.85f, 14.44f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous2!!
    }

private var _moonWaxingGibbous2: ImageVector? = null
