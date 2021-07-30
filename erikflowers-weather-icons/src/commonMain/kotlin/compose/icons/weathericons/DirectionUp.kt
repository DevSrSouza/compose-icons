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

public val WeatherIcons.DirectionUp: ImageVector
    get() {
        if (_directionUp != null) {
            return _directionUp!!
        }
        _directionUp = Builder(name = "DirectionUp", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.95f, 10.87f)
                curveToRelative(-0.01f, 0.35f, 0.1f, 0.65f, 0.34f, 0.9f)
                reflectiveCurveToRelative(0.53f, 0.37f, 0.89f, 0.36f)
                curveToRelative(0.34f, 0.02f, 0.63f, -0.1f, 0.88f, -0.37f)
                lineToRelative(1.66f, -1.64f)
                verticalLineToRelative(10.3f)
                curveToRelative(-0.01f, 0.35f, 0.11f, 0.64f, 0.36f, 0.88f)
                reflectiveCurveToRelative(0.55f, 0.35f, 0.92f, 0.34f)
                curveToRelative(0.34f, 0.02f, 0.64f, -0.09f, 0.89f, -0.32f)
                reflectiveCurveToRelative(0.39f, -0.53f, 0.4f, -0.88f)
                verticalLineToRelative(-10.3f)
                lineToRelative(1.64f, 1.64f)
                curveToRelative(0.23f, 0.24f, 0.53f, 0.37f, 0.88f, 0.37f)
                curveToRelative(0.36f, 0.0f, 0.66f, -0.12f, 0.9f, -0.36f)
                reflectiveCurveToRelative(0.36f, -0.53f, 0.36f, -0.89f)
                curveToRelative(-0.02f, -0.36f, -0.15f, -0.64f, -0.4f, -0.85f)
                lineToRelative(-3.74f, -3.84f)
                curveToRelative(-0.24f, -0.23f, -0.55f, -0.37f, -0.92f, -0.4f)
                curveToRelative(-0.37f, 0.02f, -0.68f, 0.16f, -0.92f, 0.41f)
                lineToRelative(-3.75f, 3.81f)
                curveTo(10.08f, 10.25f, 9.95f, 10.53f, 9.95f, 10.87f)
                close()
            }
        }
        .build()
        return _directionUp!!
    }

private var _directionUp: ImageVector? = null
