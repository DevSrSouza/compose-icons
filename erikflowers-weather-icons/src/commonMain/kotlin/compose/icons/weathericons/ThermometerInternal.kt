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

public val WeatherIcons.ThermometerInternal: ImageVector
    get() {
        if (_thermometerInternal != null) {
            return _thermometerInternal!!
        }
        _thermometerInternal = Builder(name = "ThermometerInternal", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.48f, 19.56f)
                curveToRelative(0.0f, 0.71f, 0.24f, 1.32f, 0.73f, 1.82f)
                curveToRelative(0.49f, 0.5f, 1.07f, 0.75f, 1.76f, 0.75f)
                reflectiveCurveToRelative(1.28f, -0.25f, 1.79f, -0.75f)
                curveToRelative(0.51f, -0.5f, 0.76f, -1.11f, 0.76f, -1.81f)
                curveToRelative(0.0f, -0.63f, -0.22f, -1.19f, -0.65f, -1.67f)
                curveToRelative(-0.43f, -0.48f, -0.96f, -0.77f, -1.57f, -0.85f)
                verticalLineTo(9.69f)
                curveToRelative(0.0f, -0.06f, -0.03f, -0.13f, -0.1f, -0.19f)
                curveToRelative(-0.07f, -0.07f, -0.14f, -0.1f, -0.22f, -0.1f)
                curveToRelative(-0.09f, 0.0f, -0.16f, 0.03f, -0.21f, 0.08f)
                curveToRelative(-0.05f, 0.06f, -0.08f, 0.12f, -0.08f, 0.21f)
                verticalLineToRelative(7.34f)
                curveToRelative(-0.61f, 0.09f, -1.13f, 0.37f, -1.56f, 0.85f)
                curveTo(12.69f, 18.37f, 12.48f, 18.92f, 12.48f, 19.56f)
                close()
            }
        }
        .build()
        return _thermometerInternal!!
    }

private var _thermometerInternal: ImageVector? = null
