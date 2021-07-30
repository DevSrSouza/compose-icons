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

public val WeatherIcons.MoonWaningCrescent6: ImageVector
    get() {
        if (_moonWaningCrescent6 != null) {
            return _moonWaningCrescent6!!
        }
        _moonWaningCrescent6 = Builder(name = "MoonWaningCrescent6", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.44f)
                curveToRelative(0.0f, 2.04f, 0.5f, 3.93f, 1.51f, 5.65f)
                reflectiveCurveToRelative(2.37f, 3.1f, 4.09f, 4.1f)
                reflectiveCurveToRelative(3.61f, 1.51f, 5.65f, 1.51f)
                curveToRelative(-1.46f, -0.56f, -2.72f, -1.18f, -3.79f, -1.88f)
                reflectiveCurveToRelative(-1.93f, -1.39f, -2.57f, -2.1f)
                reflectiveCurveToRelative(-1.15f, -1.49f, -1.53f, -2.34f)
                reflectiveCurveToRelative(-0.64f, -1.66f, -0.77f, -2.42f)
                reflectiveCurveToRelative(-0.2f, -1.6f, -0.2f, -2.52f)
                curveToRelative(0.0f, -0.65f, 0.03f, -1.26f, 0.08f, -1.81f)
                reflectiveCurveToRelative(0.16f, -1.14f, 0.32f, -1.77f)
                reflectiveCurveToRelative(0.38f, -1.21f, 0.64f, -1.75f)
                reflectiveCurveToRelative(0.63f, -1.09f, 1.08f, -1.66f)
                reflectiveCurveToRelative(0.98f, -1.1f, 1.59f, -1.57f)
                reflectiveCurveToRelative(1.34f, -0.95f, 2.21f, -1.42f)
                reflectiveCurveToRelative(1.85f, -0.89f, 2.93f, -1.27f)
                curveToRelative(-2.04f, 0.0f, -3.92f, 0.5f, -5.65f, 1.51f)
                reflectiveCurveTo(6.26f, 7.07f, 5.25f, 8.8f)
                reflectiveCurveTo(3.74f, 12.4f, 3.74f, 14.44f)
                close()
            }
        }
        .build()
        return _moonWaningCrescent6!!
    }

private var _moonWaningCrescent6: ImageVector? = null
