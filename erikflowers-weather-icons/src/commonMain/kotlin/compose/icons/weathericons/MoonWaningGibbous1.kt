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

public val WeatherIcons.MoonWaningGibbous1: ImageVector
    get() {
        if (_moonWaningGibbous1 != null) {
            return _moonWaningGibbous1!!
        }
        _moonWaningGibbous1 = Builder(name = "MoonWaningGibbous1", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.49f)
                curveToRelative(0.0f, 1.22f, 0.19f, 2.4f, 0.56f, 3.54f)
                reflectiveCurveToRelative(0.91f, 2.17f, 1.6f, 3.09f)
                reflectiveCurveToRelative(1.5f, 1.72f, 2.42f, 2.42f)
                reflectiveCurveToRelative(1.95f, 1.23f, 3.09f, 1.6f)
                reflectiveCurveToRelative(2.32f, 0.56f, 3.54f, 0.56f)
                curveToRelative(5.03f, -1.4f, 7.54f, -5.14f, 7.54f, -11.22f)
                curveToRelative(0.0f, -1.18f, -0.14f, -2.3f, -0.42f, -3.37f)
                reflectiveCurveToRelative(-0.65f, -2.01f, -1.13f, -2.83f)
                reflectiveCurveToRelative(-1.04f, -1.57f, -1.68f, -2.24f)
                reflectiveCurveToRelative(-1.34f, -1.24f, -2.06f, -1.68f)
                reflectiveCurveToRelative(-1.47f, -0.81f, -2.26f, -1.07f)
                curveToRelative(-1.52f, 0.0f, -2.98f, 0.3f, -4.37f, 0.89f)
                reflectiveCurveTo(8.02f, 5.57f, 7.02f, 6.57f)
                reflectiveCurveToRelative(-1.8f, 2.19f, -2.39f, 3.57f)
                reflectiveCurveTo(3.74f, 12.97f, 3.74f, 14.49f)
                close()
            }
        }
        .build()
        return _moonWaningGibbous1!!
    }

private var _moonWaningGibbous1: ImageVector? = null
