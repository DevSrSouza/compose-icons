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

public val WeatherIcons.WindDeg: ImageVector
    get() {
        if (_windDeg != null) {
            return _windDeg!!
        }
        _windDeg = Builder(name = "WindDeg", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.5f)
                curveToRelative(0.0f, -2.04f, 0.51f, -3.93f, 1.52f, -5.66f)
                reflectiveCurveToRelative(2.38f, -3.1f, 4.11f, -4.11f)
                reflectiveCurveToRelative(3.61f, -1.51f, 5.64f, -1.51f)
                curveToRelative(1.52f, 0.0f, 2.98f, 0.3f, 4.37f, 0.89f)
                reflectiveCurveToRelative(2.58f, 1.4f, 3.59f, 2.4f)
                reflectiveCurveToRelative(1.81f, 2.2f, 2.4f, 3.6f)
                reflectiveCurveToRelative(0.89f, 2.85f, 0.89f, 4.39f)
                curveToRelative(0.0f, 1.52f, -0.3f, 2.98f, -0.89f, 4.37f)
                reflectiveCurveToRelative(-1.4f, 2.59f, -2.4f, 3.59f)
                reflectiveCurveToRelative(-2.2f, 1.8f, -3.59f, 2.39f)
                reflectiveCurveToRelative(-2.84f, 0.89f, -4.37f, 0.89f)
                curveToRelative(-1.53f, 0.0f, -3.0f, -0.3f, -4.39f, -0.89f)
                reflectiveCurveToRelative(-2.59f, -1.4f, -3.6f, -2.4f)
                reflectiveCurveToRelative(-1.8f, -2.2f, -2.4f, -3.58f)
                reflectiveCurveTo(3.74f, 16.03f, 3.74f, 14.5f)
                close()
                moveTo(6.22f, 14.5f)
                curveToRelative(0.0f, 2.37f, 0.86f, 4.43f, 2.59f, 6.18f)
                curveToRelative(1.73f, 1.73f, 3.79f, 2.59f, 6.2f, 2.59f)
                curveToRelative(1.58f, 0.0f, 3.05f, -0.39f, 4.39f, -1.18f)
                reflectiveCurveToRelative(2.42f, -1.85f, 3.21f, -3.2f)
                reflectiveCurveToRelative(1.19f, -2.81f, 1.19f, -4.39f)
                reflectiveCurveToRelative(-0.4f, -3.05f, -1.19f, -4.4f)
                reflectiveCurveToRelative(-1.86f, -2.42f, -3.21f, -3.21f)
                reflectiveCurveToRelative(-2.81f, -1.18f, -4.39f, -1.18f)
                reflectiveCurveToRelative(-3.05f, 0.39f, -4.39f, 1.18f)
                reflectiveCurveTo(8.2f, 8.75f, 7.4f, 10.1f)
                reflectiveCurveTo(6.22f, 12.92f, 6.22f, 14.5f)
                close()
                moveTo(11.11f, 20.35f)
                lineToRelative(3.75f, -13.11f)
                curveToRelative(0.01f, -0.1f, 0.06f, -0.15f, 0.15f, -0.15f)
                reflectiveCurveToRelative(0.14f, 0.05f, 0.15f, 0.15f)
                lineToRelative(3.74f, 13.11f)
                curveToRelative(0.04f, 0.11f, 0.03f, 0.19f, -0.02f, 0.25f)
                reflectiveCurveToRelative(-0.13f, 0.06f, -0.24f, 0.0f)
                lineToRelative(-3.47f, -1.3f)
                curveToRelative(-0.1f, -0.04f, -0.2f, -0.04f, -0.29f, 0.0f)
                lineToRelative(-3.5f, 1.3f)
                curveToRelative(-0.1f, 0.06f, -0.17f, 0.06f, -0.21f, 0.0f)
                reflectiveCurveTo(11.09f, 20.45f, 11.11f, 20.35f)
                close()
            }
        }
        .build()
        return _windDeg!!
    }

private var _windDeg: ImageVector? = null
