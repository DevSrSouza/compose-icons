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

public val WeatherIcons.DirectionUpLeft: ImageVector
    get() {
        if (_directionUpLeft != null) {
            return _directionUpLeft!!
        }
        _directionUpLeft = Builder(name = "DirectionUpLeft", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.03f, 14.31f)
                verticalLineTo(9.84f)
                curveToRelative(0.0f, -0.3f, 0.1f, -0.55f, 0.3f, -0.75f)
                reflectiveCurveToRelative(0.45f, -0.3f, 0.74f, -0.3f)
                horizontalLineToRelative(4.48f)
                curveToRelative(0.29f, 0.0f, 0.54f, 0.1f, 0.74f, 0.3f)
                reflectiveCurveToRelative(0.3f, 0.45f, 0.3f, 0.75f)
                curveToRelative(0.0f, 0.29f, -0.1f, 0.53f, -0.3f, 0.73f)
                reflectiveCurveToRelative(-0.45f, 0.29f, -0.74f, 0.29f)
                horizontalLineToRelative(-1.95f)
                lineToRelative(6.06f, 6.06f)
                curveToRelative(0.18f, 0.21f, 0.26f, 0.46f, 0.26f, 0.78f)
                curveToRelative(0.0f, 0.29f, -0.09f, 0.53f, -0.26f, 0.72f)
                curveToRelative(-0.2f, 0.19f, -0.46f, 0.28f, -0.79f, 0.28f)
                curveToRelative(-0.3f, 0.0f, -0.55f, -0.09f, -0.73f, -0.28f)
                lineToRelative(-6.02f, -6.05f)
                verticalLineToRelative(1.95f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.55f, -0.3f, 0.75f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.3f, -0.75f, 0.3f)
                curveToRelative(-0.29f, 0.0f, -0.54f, -0.1f, -0.74f, -0.31f)
                reflectiveCurveTo(10.03f, 14.6f, 10.03f, 14.31f)
                close()
            }
        }
        .build()
        return _directionUpLeft!!
    }

private var _directionUpLeft: ImageVector? = null
