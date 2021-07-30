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

public val WeatherIcons.MoonWaningGibbous5: ImageVector
    get() {
        if (_moonWaningGibbous5 != null) {
            return _moonWaningGibbous5!!
        }
        _moonWaningGibbous5 = Builder(name = "MoonWaningGibbous5", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.47f)
                curveToRelative(0.0f, 2.03f, 0.5f, 3.91f, 1.51f, 5.63f)
                reflectiveCurveToRelative(2.37f, 3.09f, 4.09f, 4.09f)
                reflectiveCurveToRelative(3.6f, 1.51f, 5.63f, 1.51f)
                curveToRelative(2.17f, -2.75f, 3.25f, -6.5f, 3.25f, -11.24f)
                curveToRelative(0.0f, -3.96f, -1.08f, -7.71f, -3.25f, -11.24f)
                curveToRelative(-2.03f, 0.0f, -3.91f, 0.5f, -5.63f, 1.5f)
                reflectiveCurveTo(6.26f, 7.1f, 5.25f, 8.83f)
                reflectiveCurveTo(3.74f, 12.44f, 3.74f, 14.47f)
                close()
            }
        }
        .build()
        return _moonWaningGibbous5!!
    }

private var _moonWaningGibbous5: ImageVector? = null
