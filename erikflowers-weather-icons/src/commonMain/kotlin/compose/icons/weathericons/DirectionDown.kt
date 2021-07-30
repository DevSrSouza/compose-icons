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

public val WeatherIcons.DirectionDown: ImageVector
    get() {
        if (_directionDown != null) {
            return _directionDown!!
        }
        _directionDown = Builder(name = "DirectionDown", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.77f, 16.47f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.4f, 0.25f, 0.55f)
                lineToRelative(2.4f, 2.45f)
                curveToRelative(0.16f, 0.16f, 0.35f, 0.23f, 0.58f, 0.23f)
                curveToRelative(0.24f, 0.0f, 0.43f, -0.08f, 0.59f, -0.23f)
                lineToRelative(2.4f, -2.45f)
                curveToRelative(0.16f, -0.14f, 0.24f, -0.33f, 0.24f, -0.55f)
                curveToRelative(0.0f, -0.22f, -0.08f, -0.41f, -0.23f, -0.57f)
                reflectiveCurveToRelative(-0.34f, -0.23f, -0.56f, -0.23f)
                reflectiveCurveToRelative(-0.42f, 0.08f, -0.57f, 0.23f)
                lineToRelative(-1.06f, 1.05f)
                verticalLineToRelative(-6.59f)
                curveToRelative(0.0f, -0.22f, -0.08f, -0.41f, -0.24f, -0.56f)
                curveTo(15.42f, 9.66f, 15.23f, 9.58f, 15.0f, 9.58f)
                reflectiveCurveToRelative(-0.42f, 0.07f, -0.58f, 0.22f)
                curveToRelative(-0.16f, 0.15f, -0.24f, 0.34f, -0.24f, 0.56f)
                verticalLineToRelative(6.59f)
                lineToRelative(-1.06f, -1.05f)
                curveToRelative(-0.16f, -0.16f, -0.34f, -0.23f, -0.55f, -0.23f)
                curveToRelative(-0.22f, 0.0f, -0.42f, 0.08f, -0.57f, 0.23f)
                reflectiveCurveTo(11.77f, 16.25f, 11.77f, 16.47f)
                close()
            }
        }
        .build()
        return _directionDown!!
    }

private var _directionDown: ImageVector? = null
