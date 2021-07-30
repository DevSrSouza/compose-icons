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

public val WeatherIcons.RefreshAlt: ImageVector
    get() {
        if (_refreshAlt != null) {
            return _refreshAlt!!
        }
        _refreshAlt = Builder(name = "RefreshAlt", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.78f, 14.91f)
                curveToRelative(0.0f, 0.79f, 0.19f, 1.51f, 0.57f, 2.17f)
                curveToRelative(0.38f, 0.66f, 0.9f, 1.19f, 1.57f, 1.57f)
                curveToRelative(0.67f, 0.38f, 1.39f, 0.58f, 2.18f, 0.58f)
                curveToRelative(0.19f, 0.0f, 0.35f, -0.07f, 0.48f, -0.22f)
                curveToRelative(0.13f, -0.14f, 0.2f, -0.31f, 0.2f, -0.51f)
                curveToRelative(0.0f, -0.19f, -0.07f, -0.35f, -0.2f, -0.48f)
                reflectiveCurveToRelative(-0.29f, -0.19f, -0.49f, -0.19f)
                curveToRelative(-0.81f, 0.0f, -1.5f, -0.28f, -2.07f, -0.85f)
                curveToRelative(-0.57f, -0.57f, -0.85f, -1.26f, -0.85f, -2.07f)
                curveToRelative(0.0f, -0.78f, 0.27f, -1.45f, 0.8f, -2.02f)
                reflectiveCurveToRelative(1.16f, -0.86f, 1.88f, -0.86f)
                lineToRelative(-0.33f, 0.32f)
                curveToRelative(-0.15f, 0.15f, -0.22f, 0.31f, -0.21f, 0.49f)
                curveToRelative(0.0f, 0.18f, 0.07f, 0.34f, 0.2f, 0.48f)
                curveToRelative(0.13f, 0.14f, 0.29f, 0.21f, 0.49f, 0.21f)
                curveToRelative(0.2f, 0.0f, 0.37f, -0.07f, 0.51f, -0.21f)
                lineToRelative(1.51f, -1.5f)
                curveToRelative(0.13f, -0.11f, 0.2f, -0.27f, 0.2f, -0.51f)
                curveToRelative(0.0f, -0.22f, -0.07f, -0.38f, -0.2f, -0.47f)
                lineToRelative(-1.51f, -1.53f)
                curveToRelative(-0.13f, -0.14f, -0.29f, -0.21f, -0.49f, -0.21f)
                reflectiveCurveToRelative(-0.36f, 0.07f, -0.5f, 0.21f)
                reflectiveCurveToRelative(-0.21f, 0.3f, -0.21f, 0.5f)
                curveToRelative(0.0f, 0.21f, 0.07f, 0.38f, 0.22f, 0.51f)
                lineToRelative(0.3f, 0.28f)
                curveToRelative(-1.15f, 0.08f, -2.11f, 0.53f, -2.89f, 1.35f)
                curveTo(12.17f, 12.77f, 11.78f, 13.76f, 11.78f, 14.91f)
                close()
            }
        }
        .build()
        return _refreshAlt!!
    }

private var _refreshAlt: ImageVector? = null
