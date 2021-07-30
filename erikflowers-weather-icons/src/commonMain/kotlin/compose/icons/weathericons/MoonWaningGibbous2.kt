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

public val WeatherIcons.MoonWaningGibbous2: ImageVector
    get() {
        if (_moonWaningGibbous2 != null) {
            return _moonWaningGibbous2!!
        }
        _moonWaningGibbous2 = Builder(name = "MoonWaningGibbous2", defaultWidth = 30.0.dp,
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
                curveToRelative(4.33f, -1.73f, 6.49f, -5.47f, 6.49f, -11.22f)
                curveToRelative(0.0f, -1.39f, -0.18f, -2.7f, -0.54f, -3.93f)
                reflectiveCurveToRelative(-0.85f, -2.31f, -1.47f, -3.23f)
                reflectiveCurveToRelative(-1.31f, -1.71f, -2.06f, -2.39f)
                reflectiveCurveToRelative(-1.56f, -1.23f, -2.42f, -1.66f)
                curveToRelative(-2.03f, 0.0f, -3.91f, 0.5f, -5.63f, 1.5f)
                reflectiveCurveTo(6.25f, 7.14f, 5.24f, 8.86f)
                reflectiveCurveTo(3.74f, 12.46f, 3.74f, 14.49f)
                close()
            }
        }
        .build()
        return _moonWaningGibbous2!!
    }

private var _moonWaningGibbous2: ImageVector? = null
