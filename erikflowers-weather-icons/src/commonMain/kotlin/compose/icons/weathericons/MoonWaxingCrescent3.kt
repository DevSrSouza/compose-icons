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

public val WeatherIcons.MoonWaxingCrescent3: ImageVector
    get() {
        if (_moonWaxingCrescent3 != null) {
            return _moonWaxingCrescent3!!
        }
        _moonWaxingCrescent3 = Builder(name = "MoonWaxingCrescent3", defaultWidth = 30.0.dp,
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
                curveToRelative(1.71f, 1.26f, 2.97f, 2.9f, 3.78f, 4.91f)
                reflectiveCurveTo(20.0f, 12.24f, 20.0f, 14.44f)
                curveToRelative(0.0f, 0.9f, -0.03f, 1.73f, -0.1f, 2.5f)
                reflectiveCurveToRelative(-0.21f, 1.59f, -0.43f, 2.47f)
                reflectiveCurveToRelative(-0.51f, 1.68f, -0.86f, 2.4f)
                reflectiveCurveToRelative(-0.83f, 1.42f, -1.45f, 2.12f)
                reflectiveCurveTo(15.83f, 25.21f, 15.01f, 25.71f)
                close()
            }
        }
        .build()
        return _moonWaxingCrescent3!!
    }

private var _moonWaxingCrescent3: ImageVector? = null
