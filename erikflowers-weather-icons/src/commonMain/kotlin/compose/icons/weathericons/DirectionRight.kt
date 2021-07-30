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

public val WeatherIcons.DirectionRight: ImageVector
    get() {
        if (_directionRight != null) {
            return _directionRight!!
        }
        _directionRight = Builder(name = "DirectionRight", defaultWidth = 30.0.dp, defaultHeight =
                30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.94f, 14.36f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.42f, 0.23f, 0.57f)
                reflectiveCurveToRelative(0.34f, 0.22f, 0.56f, 0.2f)
                horizontalLineToRelative(6.58f)
                lineToRelative(-1.03f, 1.08f)
                curveToRelative(-0.16f, 0.16f, -0.24f, 0.35f, -0.24f, 0.55f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.42f, 0.24f, 0.57f)
                curveToRelative(0.16f, 0.16f, 0.35f, 0.23f, 0.58f, 0.23f)
                curveToRelative(0.21f, -0.01f, 0.39f, -0.1f, 0.53f, -0.27f)
                lineToRelative(2.45f, -2.41f)
                curveToRelative(0.16f, -0.16f, 0.23f, -0.35f, 0.23f, -0.58f)
                curveToRelative(-0.01f, -0.24f, -0.09f, -0.43f, -0.24f, -0.58f)
                lineToRelative(-2.47f, -2.39f)
                curveToRelative(-0.15f, -0.16f, -0.33f, -0.24f, -0.54f, -0.23f)
                curveToRelative(-0.23f, 0.0f, -0.42f, 0.07f, -0.57f, 0.22f)
                curveToRelative(-0.16f, 0.15f, -0.23f, 0.34f, -0.23f, 0.56f)
                curveToRelative(0.0f, 0.23f, 0.08f, 0.42f, 0.23f, 0.57f)
                lineToRelative(1.06f, 1.08f)
                horizontalLineToRelative(-6.59f)
                curveToRelative(-0.23f, 0.01f, -0.41f, 0.09f, -0.56f, 0.25f)
                curveTo(10.01f, 13.95f, 9.94f, 14.14f, 9.94f, 14.36f)
                close()
            }
        }
        .build()
        return _directionRight!!
    }

private var _directionRight: ImageVector? = null
