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

public val WeatherIcons.MoonWaxingGibbous6: ImageVector
    get() {
        if (_moonWaxingGibbous6 != null) {
            return _moonWaxingGibbous6!!
        }
        _moonWaxingGibbous6 = Builder(name = "MoonWaxingGibbous6", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.58f, 14.43f)
                curveToRelative(0.0f, 1.03f, 0.06f, 1.97f, 0.18f, 2.83f)
                reflectiveCurveToRelative(0.32f, 1.73f, 0.62f, 2.59f)
                reflectiveCurveToRelative(0.69f, 1.65f, 1.16f, 2.34f)
                reflectiveCurveToRelative(1.1f, 1.35f, 1.85f, 1.96f)
                reflectiveCurveToRelative(1.63f, 1.12f, 2.63f, 1.55f)
                curveToRelative(1.53f, 0.0f, 2.99f, -0.3f, 4.38f, -0.89f)
                reflectiveCurveToRelative(2.58f, -1.4f, 3.59f, -2.4f)
                reflectiveCurveToRelative(1.81f, -2.2f, 2.4f, -3.6f)
                reflectiveCurveToRelative(0.89f, -2.85f, 0.89f, -4.39f)
                curveToRelative(0.0f, -2.04f, -0.5f, -3.93f, -1.51f, -5.65f)
                reflectiveCurveToRelative(-2.37f, -3.1f, -4.1f, -4.1f)
                reflectiveCurveToRelative(-3.61f, -1.51f, -5.65f, -1.51f)
                curveToRelative(-1.99f, 1.0f, -3.56f, 2.51f, -4.72f, 4.55f)
                reflectiveCurveTo(8.58f, 11.99f, 8.58f, 14.43f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous6!!
    }

private var _moonWaxingGibbous6: ImageVector? = null
