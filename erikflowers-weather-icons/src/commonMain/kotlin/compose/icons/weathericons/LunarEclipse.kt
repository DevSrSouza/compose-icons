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

public val WeatherIcons.LunarEclipse: ImageVector
    get() {
        if (_lunarEclipse != null) {
            return _lunarEclipse!!
        }
        _lunarEclipse = Builder(name = "LunarEclipse", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8f, 14.62f)
                curveToRelative(0.0f, -0.93f, 0.23f, -1.8f, 0.7f, -2.6f)
                reflectiveCurveToRelative(1.1f, -1.44f, 1.9f, -1.91f)
                reflectiveCurveToRelative(1.67f, -0.7f, 2.6f, -0.7f)
                curveToRelative(0.94f, 0.0f, 1.81f, 0.23f, 2.61f, 0.7f)
                curveToRelative(0.8f, 0.47f, 1.43f, 1.1f, 1.9f, 1.9f)
                curveToRelative(0.47f, 0.8f, 0.7f, 1.67f, 0.7f, 2.61f)
                reflectiveCurveToRelative(-0.23f, 1.81f, -0.7f, 2.61f)
                curveToRelative(-0.47f, 0.8f, -1.1f, 1.43f, -1.9f, 1.9f)
                curveToRelative(-0.8f, 0.47f, -1.67f, 0.7f, -2.61f, 0.7f)
                reflectiveCurveToRelative(-1.8f, -0.23f, -2.6f, -0.7f)
                curveToRelative(-0.8f, -0.47f, -1.43f, -1.1f, -1.9f, -1.9f)
                curveTo(10.03f, 16.43f, 9.8f, 15.56f, 9.8f, 14.62f)
                close()
                moveTo(14.25f, 11.22f)
                curveToRelative(0.87f, 0.11f, 1.6f, 0.49f, 2.19f, 1.15f)
                curveToRelative(0.59f, 0.66f, 0.89f, 1.44f, 0.89f, 2.33f)
                curveToRelative(0.0f, 0.83f, -0.26f, 1.56f, -0.78f, 2.2f)
                reflectiveCurveToRelative(-1.18f, 1.04f, -1.98f, 1.21f)
                curveToRelative(0.2f, 0.02f, 0.34f, 0.04f, 0.43f, 0.04f)
                curveToRelative(0.98f, 0.0f, 1.81f, -0.35f, 2.5f, -1.04f)
                curveToRelative(0.69f, -0.69f, 1.04f, -1.52f, 1.04f, -2.5f)
                curveToRelative(0.0f, -0.96f, -0.35f, -1.78f, -1.04f, -2.47f)
                curveToRelative(-0.69f, -0.68f, -1.53f, -1.02f, -2.5f, -1.02f)
                curveTo(14.74f, 11.14f, 14.49f, 11.17f, 14.25f, 11.22f)
                close()
            }
        }
        .build()
        return _lunarEclipse!!
    }

private var _lunarEclipse: ImageVector? = null
