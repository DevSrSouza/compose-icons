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

public val WeatherIcons.MoonWaningGibbous3: ImageVector
    get() {
        if (_moonWaningGibbous3 != null) {
            return _moonWaningGibbous3!!
        }
        _moonWaningGibbous3 = Builder(name = "MoonWaningGibbous3", defaultWidth = 30.0.dp,
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
                curveToRelative(3.61f, -2.07f, 5.42f, -5.81f, 5.42f, -11.22f)
                curveToRelative(0.0f, -1.31f, -0.15f, -2.56f, -0.45f, -3.74f)
                reflectiveCurveToRelative(-0.71f, -2.24f, -1.23f, -3.17f)
                reflectiveCurveToRelative(-1.1f, -1.75f, -1.72f, -2.46f)
                reflectiveCurveToRelative(-1.3f, -1.33f, -2.02f, -1.86f)
                curveToRelative(-1.52f, 0.0f, -2.98f, 0.3f, -4.37f, 0.89f)
                reflectiveCurveToRelative(-2.58f, 1.39f, -3.58f, 2.4f)
                reflectiveCurveToRelative(-1.8f, 2.2f, -2.39f, 3.59f)
                reflectiveCurveTo(3.74f, 12.96f, 3.74f, 14.49f)
                close()
            }
        }
        .build()
        return _moonWaningGibbous3!!
    }

private var _moonWaningGibbous3: ImageVector? = null
