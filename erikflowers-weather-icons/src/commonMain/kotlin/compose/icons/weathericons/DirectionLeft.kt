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

public val WeatherIcons.DirectionLeft: ImageVector
    get() {
        if (_directionLeft != null) {
            return _directionLeft!!
        }
        _directionLeft = Builder(name = "DirectionLeft", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.09f, 14.96f)
                curveToRelative(0.0f, 0.37f, 0.12f, 0.68f, 0.37f, 0.92f)
                lineToRelative(3.84f, 3.75f)
                curveToRelative(0.22f, 0.25f, 0.51f, 0.38f, 0.85f, 0.38f)
                curveToRelative(0.35f, 0.0f, 0.65f, -0.12f, 0.89f, -0.35f)
                reflectiveCurveToRelative(0.37f, -0.53f, 0.37f, -0.88f)
                reflectiveCurveToRelative(-0.12f, -0.65f, -0.37f, -0.89f)
                lineToRelative(-1.64f, -1.64f)
                horizontalLineToRelative(10.3f)
                curveToRelative(0.35f, 0.0f, 0.64f, -0.12f, 0.87f, -0.37f)
                reflectiveCurveToRelative(0.34f, -0.55f, 0.34f, -0.9f)
                reflectiveCurveToRelative(-0.11f, -0.65f, -0.34f, -0.9f)
                reflectiveCurveToRelative(-0.52f, -0.38f, -0.87f, -0.39f)
                horizontalLineTo(11.4f)
                lineToRelative(1.64f, -1.66f)
                curveToRelative(0.24f, -0.24f, 0.37f, -0.53f, 0.37f, -0.86f)
                curveToRelative(0.0f, -0.35f, -0.12f, -0.65f, -0.37f, -0.89f)
                reflectiveCurveTo(12.5f, 9.9f, 12.14f, 9.9f)
                curveToRelative(-0.32f, 0.0f, -0.61f, 0.14f, -0.85f, 0.41f)
                lineToRelative(-3.84f, 3.75f)
                curveTo(7.21f, 14.31f, 7.09f, 14.6f, 7.09f, 14.96f)
                close()
            }
        }
        .build()
        return _directionLeft!!
    }

private var _directionLeft: ImageVector? = null
