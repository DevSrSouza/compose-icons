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

public val WeatherIcons.MoonWaxingGibbous5: ImageVector
    get() {
        if (_moonWaxingGibbous5 != null) {
            return _moonWaxingGibbous5!!
        }
        _moonWaxingGibbous5 = Builder(name = "MoonWaxingGibbous5", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.65f, 14.43f)
                curveToRelative(0.0f, 1.24f, 0.08f, 2.38f, 0.25f, 3.41f)
                reflectiveCurveToRelative(0.44f, 2.05f, 0.83f, 3.04f)
                reflectiveCurveToRelative(0.95f, 1.89f, 1.67f, 2.71f)
                reflectiveCurveToRelative(1.6f, 1.52f, 2.62f, 2.12f)
                curveToRelative(1.52f, 0.0f, 2.98f, -0.3f, 4.37f, -0.89f)
                reflectiveCurveToRelative(2.59f, -1.4f, 3.6f, -2.4f)
                reflectiveCurveToRelative(1.81f, -2.2f, 2.4f, -3.6f)
                reflectiveCurveToRelative(0.89f, -2.85f, 0.89f, -4.39f)
                reflectiveCurveToRelative(-0.3f, -2.99f, -0.89f, -4.38f)
                reflectiveCurveToRelative(-1.4f, -2.58f, -2.4f, -3.59f)
                reflectiveCurveToRelative(-2.2f, -1.81f, -3.6f, -2.4f)
                reflectiveCurveToRelative(-2.85f, -0.89f, -4.37f, -0.89f)
                curveToRelative(-1.67f, 1.14f, -2.98f, 2.72f, -3.94f, 4.74f)
                reflectiveCurveTo(9.65f, 12.09f, 9.65f, 14.43f)
                close()
            }
        }
        .build()
        return _moonWaxingGibbous5!!
    }

private var _moonWaxingGibbous5: ImageVector? = null
