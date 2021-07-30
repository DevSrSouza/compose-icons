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

public val WeatherIcons.DirectionDownLeft: ImageVector
    get() {
        if (_directionDownLeft != null) {
            return _directionDownLeft!!
        }
        _directionDownLeft = Builder(name = "DirectionDownLeft", defaultWidth = 30.0.dp,
                defaultHeight = 30.0.dp, viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.83f, 16.77f)
                curveToRelative(0.0f, 0.19f, 0.06f, 0.35f, 0.19f, 0.48f)
                curveToRelative(0.13f, 0.13f, 0.29f, 0.19f, 0.47f, 0.19f)
                horizontalLineToRelative(2.87f)
                curveToRelative(0.19f, 0.0f, 0.35f, -0.06f, 0.47f, -0.19f)
                curveToRelative(0.13f, -0.13f, 0.19f, -0.29f, 0.19f, -0.48f)
                curveToRelative(0.0f, -0.19f, -0.06f, -0.34f, -0.19f, -0.46f)
                curveToRelative(-0.13f, -0.12f, -0.29f, -0.18f, -0.47f, -0.18f)
                horizontalLineToRelative(-1.24f)
                lineTo(18.0f, 12.24f)
                curveToRelative(0.12f, -0.14f, 0.18f, -0.3f, 0.18f, -0.5f)
                curveToRelative(0.0f, -0.18f, -0.06f, -0.33f, -0.18f, -0.46f)
                curveToRelative(-0.12f, -0.12f, -0.29f, -0.18f, -0.5f, -0.18f)
                curveToRelative(-0.2f, 0.0f, -0.36f, 0.06f, -0.48f, 0.18f)
                lineToRelative(-3.86f, 3.87f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0.0f, -0.19f, -0.06f, -0.35f, -0.19f, -0.48f)
                curveToRelative(-0.13f, -0.13f, -0.29f, -0.19f, -0.48f, -0.19f)
                curveToRelative(-0.19f, 0.0f, -0.35f, 0.07f, -0.47f, 0.2f)
                curveToRelative(-0.13f, 0.13f, -0.19f, 0.29f, -0.19f, 0.48f)
                verticalLineTo(16.77f)
                close()
            }
        }
        .build()
        return _directionDownLeft!!
    }

private var _directionDownLeft: ImageVector? = null
