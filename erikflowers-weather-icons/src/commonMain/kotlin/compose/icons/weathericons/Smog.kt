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

public val WeatherIcons.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.35f, 12.46f)
                curveToRelative(0.0f, -0.94f, 0.3f, -1.77f, 0.9f, -2.5f)
                reflectiveCurveToRelative(1.37f, -1.21f, 2.31f, -1.43f)
                curveToRelative(0.23f, -1.11f, 0.79f, -2.03f, 1.7f, -2.75f)
                curveToRelative(0.91f, -0.72f, 1.95f, -1.08f, 3.12f, -1.08f)
                curveToRelative(1.12f, 0.0f, 2.13f, 0.35f, 3.0f, 1.04f)
                curveToRelative(0.88f, 0.69f, 1.45f, 1.59f, 1.72f, 2.7f)
                horizontalLineToRelative(0.28f)
                curveToRelative(0.76f, 0.0f, 1.46f, 0.16f, 2.12f, 0.49f)
                reflectiveCurveToRelative(1.18f, 0.77f, 1.57f, 1.34f)
                curveToRelative(0.39f, 0.57f, 0.59f, 1.18f, 0.59f, 1.84f)
                curveToRelative(0.0f, 1.12f, -0.43f, 2.08f, -1.29f, 2.86f)
                curveToRelative(0.0f, 0.35f, -0.11f, 0.75f, -0.32f, 1.2f)
                curveToRelative(-0.22f, 0.45f, -0.5f, 0.86f, -0.87f, 1.23f)
                curveToRelative(-0.36f, 0.37f, -0.73f, 0.59f, -1.1f, 0.68f)
                curveToRelative(-0.12f, 0.62f, -0.41f, 1.14f, -0.86f, 1.57f)
                reflectiveCurveToRelative(-0.99f, 0.71f, -1.63f, 0.85f)
                curveToRelative(0.3f, 0.3f, 0.45f, 0.65f, 0.45f, 1.06f)
                curveToRelative(0.0f, 0.49f, -0.17f, 0.91f, -0.52f, 1.26f)
                curveToRelative(-0.35f, 0.35f, -0.77f, 0.52f, -1.27f, 0.52f)
                curveToRelative(-0.49f, 0.0f, -0.91f, -0.17f, -1.26f, -0.52f)
                curveToRelative(-0.35f, -0.35f, -0.53f, -0.77f, -0.53f, -1.26f)
                curveToRelative(0.0f, -0.06f, 0.01f, -0.14f, 0.04f, -0.26f)
                reflectiveCurveToRelative(0.04f, -0.21f, 0.04f, -0.27f)
                horizontalLineToRelative(-0.08f)
                curveToRelative(-0.59f, 0.0f, -1.09f, -0.21f, -1.51f, -0.63f)
                curveToRelative(-0.42f, -0.42f, -0.63f, -0.93f, -0.63f, -1.51f)
                curveToRelative(0.0f, -0.23f, 0.12f, -0.58f, 0.37f, -1.06f)
                curveToRelative(-0.49f, -0.26f, -0.88f, -0.67f, -1.17f, -1.26f)
                horizontalLineToRelative(-1.25f)
                curveToRelative(-1.09f, -0.09f, -2.02f, -0.53f, -2.78f, -1.3f)
                curveTo(6.73f, 14.49f, 6.35f, 13.55f, 6.35f, 12.46f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
