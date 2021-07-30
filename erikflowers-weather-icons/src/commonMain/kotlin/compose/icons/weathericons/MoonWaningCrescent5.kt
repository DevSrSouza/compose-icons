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

public val WeatherIcons.MoonWaningCrescent5: ImageVector
    get() {
        if (_moonWaningCrescent5 != null) {
            return _moonWaningCrescent5!!
        }
        _moonWaningCrescent5 = Builder(name = "MoonWaningCrescent5", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.44f)
                curveToRelative(0.0f, 2.04f, 0.5f, 3.93f, 1.51f, 5.65f)
                reflectiveCurveToRelative(2.37f, 3.1f, 4.09f, 4.1f)
                reflectiveCurveToRelative(3.61f, 1.51f, 5.65f, 1.51f)
                curveToRelative(-2.59f, -0.79f, -4.48f, -2.13f, -5.69f, -4.02f)
                reflectiveCurveToRelative(-1.81f, -4.3f, -1.81f, -7.24f)
                curveToRelative(0.0f, -1.39f, 0.2f, -2.7f, 0.6f, -3.95f)
                curveToRelative(0.4f, -1.25f, 0.94f, -2.34f, 1.63f, -3.27f)
                reflectiveCurveToRelative(1.48f, -1.75f, 2.37f, -2.44f)
                reflectiveCurveToRelative(1.86f, -1.22f, 2.89f, -1.59f)
                curveToRelative(-2.04f, 0.0f, -3.92f, 0.5f, -5.65f, 1.51f)
                reflectiveCurveTo(6.26f, 7.07f, 5.25f, 8.8f)
                reflectiveCurveTo(3.74f, 12.4f, 3.74f, 14.44f)
                close()
            }
        }
        .build()
        return _moonWaningCrescent5!!
    }

private var _moonWaningCrescent5: ImageVector? = null
