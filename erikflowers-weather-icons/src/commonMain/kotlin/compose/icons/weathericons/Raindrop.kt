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

public val WeatherIcons.Raindrop: ImageVector
    get() {
        if (_raindrop != null) {
            return _raindrop!!
        }
        _raindrop = Builder(name = "Raindrop", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.81f, 15.25f)
                curveToRelative(0.0f, 0.92f, 0.23f, 1.78f, 0.7f, 2.57f)
                reflectiveCurveToRelative(1.1f, 1.43f, 1.9f, 1.9f)
                curveToRelative(0.8f, 0.47f, 1.66f, 0.71f, 2.59f, 0.71f)
                curveToRelative(0.93f, 0.0f, 1.8f, -0.24f, 2.61f, -0.71f)
                curveToRelative(0.81f, -0.47f, 1.45f, -1.11f, 1.92f, -1.9f)
                curveToRelative(0.47f, -0.8f, 0.71f, -1.65f, 0.71f, -2.57f)
                curveToRelative(0.0f, -0.6f, -0.17f, -1.31f, -0.52f, -2.14f)
                curveToRelative(-0.35f, -0.83f, -0.77f, -1.6f, -1.26f, -2.3f)
                curveToRelative(-0.44f, -0.57f, -0.96f, -1.2f, -1.56f, -1.88f)
                curveToRelative(-0.6f, -0.68f, -1.65f, -1.73f, -1.89f, -1.97f)
                lineToRelative(-1.28f, 1.29f)
                curveToRelative(-0.62f, 0.6f, -1.22f, 1.29f, -1.79f, 2.08f)
                curveToRelative(-0.57f, 0.79f, -1.07f, 1.64f, -1.49f, 2.55f)
                curveTo(10.01f, 13.79f, 9.81f, 14.58f, 9.81f, 15.25f)
                close()
            }
        }
        .build()
        return _raindrop!!
    }

private var _raindrop: ImageVector? = null
