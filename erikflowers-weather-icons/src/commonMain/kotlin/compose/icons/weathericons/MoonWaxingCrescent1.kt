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

public val WeatherIcons.MoonWaxingCrescent1: ImageVector
    get() {
        if (_moonWaxingCrescent1 != null) {
            return _moonWaxingCrescent1!!
        }
        _moonWaxingCrescent1 = Builder(name = "MoonWaxingCrescent1", defaultWidth = 30.0.dp,
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
                curveToRelative(1.32f, 0.52f, 2.48f, 1.2f, 3.47f, 2.06f)
                reflectiveCurveToRelative(1.78f, 1.79f, 2.35f, 2.82f)
                reflectiveCurveToRelative(0.99f, 2.07f, 1.27f, 3.13f)
                reflectiveCurveToRelative(0.41f, 2.14f, 0.41f, 3.24f)
                curveToRelative(0.0f, 0.64f, -0.02f, 1.26f, -0.07f, 1.84f)
                curveToRelative(-0.05f, 0.58f, -0.15f, 1.2f, -0.29f, 1.87f)
                reflectiveCurveToRelative(-0.33f, 1.28f, -0.56f, 1.86f)
                reflectiveCurveToRelative(-0.54f, 1.15f, -0.92f, 1.74f)
                reflectiveCurveToRelative(-0.83f, 1.11f, -1.35f, 1.58f)
                reflectiveCurveToRelative(-1.14f, 0.92f, -1.87f, 1.33f)
                reflectiveCurveTo(15.9f, 25.42f, 15.01f, 25.71f)
                close()
            }
        }
        .build()
        return _moonWaxingCrescent1!!
    }

private var _moonWaxingCrescent1: ImageVector? = null
