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

public val WeatherIcons.MoonWaxingCrescent5: ImageVector
    get() {
        if (_moonWaxingCrescent5 != null) {
            return _moonWaxingCrescent5!!
        }
        _moonWaxingCrescent5 = Builder(name = "MoonWaxingCrescent5", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.99f, 25.71f)
                curveToRelative(2.04f, 0.0f, 3.93f, -0.5f, 5.65f, -1.51f)
                reflectiveCurveToRelative(3.1f, -2.37f, 4.1f, -4.1f)
                reflectiveCurveToRelative(1.51f, -3.61f, 1.51f, -5.65f)
                reflectiveCurveToRelative(-0.5f, -3.92f, -1.51f, -5.65f)
                reflectiveCurveToRelative(-2.37f, -3.09f, -4.1f, -4.09f)
                reflectiveCurveToRelative(-3.61f, -1.51f, -5.65f, -1.51f)
                curveToRelative(1.67f, 2.9f, 2.5f, 6.65f, 2.5f, 11.25f)
                curveToRelative(0.0f, 2.33f, -0.17f, 4.43f, -0.52f, 6.3f)
                reflectiveCurveTo(15.97f, 24.26f, 14.99f, 25.71f)
                close()
            }
        }
        .build()
        return _moonWaxingCrescent5!!
    }

private var _moonWaxingCrescent5: ImageVector? = null
