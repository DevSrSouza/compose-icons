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

public val WeatherIcons.Fahrenheit: ImageVector
    get() {
        if (_fahrenheit != null) {
            return _fahrenheit!!
        }
        _fahrenheit = Builder(name = "Fahrenheit", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.67f, 11.01f)
                curveToRelative(0.0f, -0.5f, 0.18f, -0.93f, 0.53f, -1.28f)
                reflectiveCurveToRelative(0.78f, -0.53f, 1.28f, -0.53f)
                curveToRelative(0.49f, 0.0f, 0.92f, 0.18f, 1.27f, 0.53f)
                curveToRelative(0.35f, 0.36f, 0.53f, 0.78f, 0.53f, 1.28f)
                curveToRelative(0.0f, 0.5f, -0.18f, 0.93f, -0.53f, 1.29f)
                curveToRelative(-0.35f, 0.36f, -0.78f, 0.54f, -1.27f, 0.54f)
                reflectiveCurveToRelative(-0.92f, -0.18f, -1.28f, -0.54f)
                curveTo(9.85f, 11.94f, 9.67f, 11.51f, 9.67f, 11.01f)
                close()
                moveTo(10.55f, 11.01f)
                curveToRelative(0.0f, 0.26f, 0.09f, 0.48f, 0.27f, 0.67f)
                curveToRelative(0.19f, 0.19f, 0.41f, 0.28f, 0.67f, 0.28f)
                reflectiveCurveToRelative(0.48f, -0.09f, 0.67f, -0.28f)
                reflectiveCurveToRelative(0.28f, -0.41f, 0.28f, -0.67f)
                curveToRelative(0.0f, -0.26f, -0.09f, -0.48f, -0.28f, -0.66f)
                curveToRelative(-0.19f, -0.18f, -0.41f, -0.28f, -0.67f, -0.28f)
                curveToRelative(-0.26f, 0.0f, -0.48f, 0.09f, -0.67f, 0.27f)
                curveTo(10.64f, 10.52f, 10.55f, 10.74f, 10.55f, 11.01f)
                close()
                moveTo(14.96f, 17.9f)
                curveToRelative(0.0f, 0.14f, 0.05f, 0.27f, 0.15f, 0.37f)
                reflectiveCurveToRelative(0.23f, 0.15f, 0.37f, 0.15f)
                curveToRelative(0.14f, 0.0f, 0.27f, -0.05f, 0.37f, -0.15f)
                curveToRelative(0.1f, -0.1f, 0.15f, -0.23f, 0.15f, -0.37f)
                verticalLineToRelative(-3.79f)
                horizontalLineToRelative(2.86f)
                curveToRelative(0.14f, 0.0f, 0.27f, -0.05f, 0.37f, -0.16f)
                reflectiveCurveToRelative(0.15f, -0.23f, 0.15f, -0.38f)
                curveToRelative(0.0f, -0.15f, -0.05f, -0.27f, -0.15f, -0.38f)
                curveToRelative(-0.1f, -0.1f, -0.23f, -0.15f, -0.38f, -0.15f)
                horizontalLineToRelative(-2.86f)
                verticalLineToRelative(-2.73f)
                horizontalLineToRelative(3.82f)
                curveToRelative(0.14f, 0.0f, 0.26f, -0.05f, 0.36f, -0.15f)
                reflectiveCurveToRelative(0.14f, -0.23f, 0.14f, -0.38f)
                reflectiveCurveToRelative(-0.05f, -0.27f, -0.14f, -0.38f)
                reflectiveCurveToRelative(-0.21f, -0.15f, -0.36f, -0.15f)
                horizontalLineToRelative(-4.77f)
                curveToRelative(-0.07f, 0.0f, -0.1f, 0.04f, -0.1f, 0.11f)
                verticalLineTo(17.9f)
                close()
            }
        }
        .build()
        return _fahrenheit!!
    }

private var _fahrenheit: ImageVector? = null
