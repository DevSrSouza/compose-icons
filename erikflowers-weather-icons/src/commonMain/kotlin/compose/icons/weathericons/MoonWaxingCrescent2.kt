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

public val WeatherIcons.MoonWaxingCrescent2: ImageVector
    get() {
        if (_moonWaxingCrescent2 != null) {
            return _moonWaxingCrescent2!!
        }
        _moonWaxingCrescent2 = Builder(name = "MoonWaxingCrescent2", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.01f, 25.71f)
                curveToRelative(2.04f, 0.0f, 3.92f, -0.5f, 5.65f, -1.51f)
                reflectiveCurveToRelative(3.09f, -2.37f, 4.09f, -4.1f)
                reflectiveCurveToRelative(1.51f, -3.61f, 1.51f, -5.65f)
                reflectiveCurveToRelative(-0.5f, -3.92f, -1.51f, -5.65f)
                reflectiveCurveToRelative(-2.37f, -3.09f, -4.09f, -4.09f)
                reflectiveCurveToRelative(-3.61f, -1.51f, -5.65f, -1.51f)
                curveToRelative(1.1f, 0.59f, 2.07f, 1.32f, 2.89f, 2.19f)
                reflectiveCurveToRelative(1.47f, 1.82f, 1.95f, 2.83f)
                reflectiveCurveToRelative(0.83f, 2.03f, 1.05f, 3.07f)
                reflectiveCurveToRelative(0.34f, 2.09f, 0.34f, 3.16f)
                curveToRelative(0.0f, 0.91f, -0.04f, 1.76f, -0.13f, 2.54f)
                reflectiveCurveToRelative(-0.27f, 1.63f, -0.53f, 2.53f)
                reflectiveCurveToRelative(-0.62f, 1.71f, -1.06f, 2.43f)
                reflectiveCurveToRelative(-1.04f, 1.42f, -1.82f, 2.09f)
                reflectiveCurveTo(16.03f, 25.26f, 15.01f, 25.71f)
                close()
            }
        }
        .build()
        return _moonWaxingCrescent2!!
    }

private var _moonWaxingCrescent2: ImageVector? = null
