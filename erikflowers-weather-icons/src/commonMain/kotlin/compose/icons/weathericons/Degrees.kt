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

public val WeatherIcons.Degrees: ImageVector
    get() {
        if (_degrees != null) {
            return _degrees!!
        }
        _degrees = Builder(name = "Degrees", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.19f, 9.21f)
                curveToRelative(0.0f, -0.5f, 0.18f, -0.93f, 0.53f, -1.28f)
                curveToRelative(0.36f, -0.36f, 0.78f, -0.53f, 1.28f, -0.53f)
                curveToRelative(0.49f, 0.0f, 0.92f, 0.18f, 1.27f, 0.53f)
                curveToRelative(0.35f, 0.36f, 0.53f, 0.78f, 0.53f, 1.28f)
                reflectiveCurveToRelative(-0.18f, 0.93f, -0.53f, 1.29f)
                curveToRelative(-0.35f, 0.36f, -0.78f, 0.54f, -1.27f, 0.54f)
                curveToRelative(-0.49f, 0.0f, -0.92f, -0.18f, -1.28f, -0.54f)
                reflectiveCurveTo(13.19f, 9.71f, 13.19f, 9.21f)
                close()
                moveTo(14.07f, 9.21f)
                curveToRelative(0.0f, 0.26f, 0.09f, 0.48f, 0.27f, 0.67f)
                curveToRelative(0.19f, 0.19f, 0.41f, 0.28f, 0.67f, 0.28f)
                curveToRelative(0.26f, 0.0f, 0.48f, -0.09f, 0.67f, -0.28f)
                reflectiveCurveToRelative(0.28f, -0.41f, 0.28f, -0.67f)
                curveToRelative(0.0f, -0.26f, -0.09f, -0.48f, -0.28f, -0.66f)
                curveToRelative(-0.19f, -0.18f, -0.41f, -0.28f, -0.67f, -0.28f)
                curveToRelative(-0.26f, 0.0f, -0.48f, 0.09f, -0.67f, 0.27f)
                curveTo(14.16f, 8.72f, 14.07f, 8.94f, 14.07f, 9.21f)
                close()
            }
        }
        .build()
        return _degrees!!
    }

private var _degrees: ImageVector? = null
