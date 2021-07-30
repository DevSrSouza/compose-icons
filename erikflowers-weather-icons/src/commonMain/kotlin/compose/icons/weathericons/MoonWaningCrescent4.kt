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

public val WeatherIcons.MoonWaningCrescent4: ImageVector
    get() {
        if (_moonWaningCrescent4 != null) {
            return _moonWaningCrescent4!!
        }
        _moonWaningCrescent4 = Builder(name = "MoonWaningCrescent4", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.44f)
                curveToRelative(0.0f, 2.04f, 0.5f, 3.93f, 1.51f, 5.65f)
                reflectiveCurveToRelative(2.37f, 3.1f, 4.1f, 4.1f)
                reflectiveCurveToRelative(3.61f, 1.51f, 5.65f, 1.51f)
                curveToRelative(-2.07f, -1.01f, -3.59f, -2.45f, -4.56f, -4.33f)
                reflectiveCurveTo(9.0f, 17.19f, 9.0f, 14.44f)
                curveToRelative(0.0f, -2.53f, 0.56f, -4.78f, 1.69f, -6.75f)
                reflectiveCurveToRelative(2.57f, -3.47f, 4.31f, -4.5f)
                curveToRelative(-2.04f, 0.0f, -3.93f, 0.5f, -5.65f, 1.51f)
                reflectiveCurveToRelative(-3.1f, 2.37f, -4.1f, 4.09f)
                reflectiveCurveTo(3.74f, 12.4f, 3.74f, 14.44f)
                close()
            }
        }
        .build()
        return _moonWaningCrescent4!!
    }

private var _moonWaningCrescent4: ImageVector? = null
