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

public val WeatherIcons.MoonWaxingCrescent4: ImageVector
    get() {
        if (_moonWaxingCrescent4 != null) {
            return _moonWaxingCrescent4!!
        }
        _moonWaxingCrescent4 = Builder(name = "MoonWaxingCrescent4", defaultWidth = 30.0.dp,
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
                curveToRelative(1.29f, 1.39f, 2.24f, 3.07f, 2.84f, 5.05f)
                reflectiveCurveToRelative(0.91f, 4.05f, 0.91f, 6.2f)
                curveToRelative(0.0f, 0.88f, -0.03f, 1.69f, -0.08f, 2.44f)
                reflectiveCurveToRelative(-0.16f, 1.55f, -0.32f, 2.41f)
                reflectiveCurveToRelative(-0.38f, 1.65f, -0.64f, 2.37f)
                reflectiveCurveToRelative(-0.63f, 1.43f, -1.09f, 2.15f)
                reflectiveCurveTo(15.62f, 25.15f, 15.01f, 25.71f)
                close()
            }
        }
        .build()
        return _moonWaxingCrescent4!!
    }

private var _moonWaxingCrescent4: ImageVector? = null
