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

public val WeatherIcons.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.77f, 15.53f)
                curveToRelative(0.0f, 0.94f, 0.24f, 1.82f, 0.71f, 2.62f)
                curveToRelative(0.47f, 0.8f, 1.11f, 1.44f, 1.91f, 1.9f)
                curveToRelative(0.8f, 0.47f, 1.67f, 0.7f, 2.61f, 0.7f)
                curveToRelative(0.96f, 0.0f, 1.83f, -0.23f, 2.63f, -0.69f)
                curveToRelative(0.8f, -0.46f, 1.43f, -1.09f, 1.89f, -1.89f)
                curveToRelative(0.46f, -0.8f, 0.69f, -1.68f, 0.69f, -2.63f)
                curveToRelative(0.0f, -0.24f, -0.08f, -0.44f, -0.24f, -0.61f)
                curveToRelative(-0.16f, -0.17f, -0.35f, -0.25f, -0.59f, -0.25f)
                curveToRelative(-0.23f, 0.0f, -0.43f, 0.08f, -0.6f, 0.25f)
                curveToRelative(-0.17f, 0.17f, -0.25f, 0.37f, -0.25f, 0.61f)
                curveToRelative(0.0f, 0.98f, -0.35f, 1.82f, -1.04f, 2.51f)
                curveToRelative(-0.69f, 0.69f, -1.53f, 1.04f, -2.51f, 1.04f)
                curveToRelative(-0.97f, 0.0f, -1.79f, -0.35f, -2.47f, -1.04f)
                curveToRelative(-0.68f, -0.69f, -1.02f, -1.53f, -1.02f, -2.51f)
                curveToRelative(0.0f, -0.85f, 0.26f, -1.62f, 0.79f, -2.31f)
                reflectiveCurveToRelative(1.14f, -1.06f, 1.84f, -1.1f)
                lineToRelative(-0.38f, 0.37f)
                curveToRelative(-0.16f, 0.18f, -0.24f, 0.37f, -0.24f, 0.58f)
                curveToRelative(0.0f, 0.22f, 0.08f, 0.42f, 0.24f, 0.6f)
                curveToRelative(0.36f, 0.35f, 0.77f, 0.35f, 1.21f, 0.0f)
                lineToRelative(1.84f, -1.82f)
                curveToRelative(0.16f, -0.12f, 0.24f, -0.33f, 0.24f, -0.62f)
                curveToRelative(0.0f, -0.26f, -0.08f, -0.45f, -0.24f, -0.57f)
                lineTo(14.97f, 8.8f)
                curveToRelative(-0.18f, -0.16f, -0.37f, -0.24f, -0.57f, -0.24f)
                curveToRelative(-0.25f, 0.0f, -0.46f, 0.08f, -0.63f, 0.25f)
                curveToRelative(-0.17f, 0.17f, -0.25f, 0.37f, -0.25f, 0.6f)
                curveToRelative(0.0f, 0.24f, 0.08f, 0.45f, 0.24f, 0.61f)
                lineToRelative(0.38f, 0.36f)
                curveToRelative(-1.25f, 0.22f, -2.29f, 0.82f, -3.12f, 1.8f)
                reflectiveCurveTo(9.77f, 14.27f, 9.77f, 15.53f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
