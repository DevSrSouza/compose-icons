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

public val WeatherIcons.MoonWaningCrescent1: ImageVector
    get() {
        if (_moonWaningCrescent1 != null) {
            return _moonWaningCrescent1!!
        }
        _moonWaningCrescent1 = Builder(name = "MoonWaningCrescent1", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.74f, 14.44f)
                curveToRelative(0.0f, 2.04f, 0.5f, 3.93f, 1.51f, 5.65f)
                reflectiveCurveToRelative(2.37f, 3.1f, 4.09f, 4.1f)
                reflectiveCurveToRelative(3.61f, 1.51f, 5.65f, 1.51f)
                curveToRelative(-1.0f, -3.14f, -1.49f, -6.9f, -1.49f, -11.26f)
                curveToRelative(0.0f, -3.43f, 0.5f, -7.18f, 1.49f, -11.25f)
                curveToRelative(-2.04f, 0.0f, -3.92f, 0.5f, -5.65f, 1.51f)
                reflectiveCurveTo(6.26f, 7.07f, 5.25f, 8.8f)
                reflectiveCurveTo(3.74f, 12.4f, 3.74f, 14.44f)
                close()
            }
        }
        .build()
        return _moonWaningCrescent1!!
    }

private var _moonWaningCrescent1: ImageVector? = null
