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

public val WeatherIcons.NightClear: ImageVector
    get() {
        if (_nightClear != null) {
            return _nightClear!!
        }
        _nightClear = Builder(name = "NightClear", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.91f, 14.48f)
                curveToRelative(0.0f, -0.96f, 0.19f, -1.87f, 0.56f, -2.75f)
                reflectiveCurveToRelative(0.88f, -1.63f, 1.51f, -2.26f)
                curveToRelative(0.63f, -0.63f, 1.39f, -1.14f, 2.27f, -1.52f)
                curveToRelative(0.88f, -0.38f, 1.8f, -0.57f, 2.75f, -0.57f)
                horizontalLineToRelative(1.14f)
                curveToRelative(0.16f, 0.04f, 0.23f, 0.14f, 0.23f, 0.28f)
                lineToRelative(0.05f, 0.88f)
                curveToRelative(0.04f, 1.27f, 0.49f, 2.35f, 1.37f, 3.24f)
                curveToRelative(0.88f, 0.89f, 1.94f, 1.37f, 3.19f, 1.42f)
                lineToRelative(0.82f, 0.07f)
                curveToRelative(0.16f, 0.0f, 0.24f, 0.08f, 0.24f, 0.23f)
                verticalLineToRelative(0.98f)
                curveToRelative(0.01f, 1.28f, -0.3f, 2.47f, -0.93f, 3.56f)
                curveToRelative(-0.63f, 1.09f, -1.48f, 1.95f, -2.57f, 2.59f)
                curveToRelative(-1.08f, 0.63f, -2.27f, 0.95f, -3.55f, 0.95f)
                curveToRelative(-0.97f, 0.0f, -1.9f, -0.19f, -2.78f, -0.56f)
                reflectiveCurveToRelative(-1.63f, -0.88f, -2.26f, -1.51f)
                curveToRelative(-0.63f, -0.63f, -1.13f, -1.39f, -1.5f, -2.26f)
                curveTo(8.1f, 16.37f, 7.91f, 15.45f, 7.91f, 14.48f)
                close()
                moveTo(9.74f, 14.48f)
                curveToRelative(0.0f, 0.76f, 0.15f, 1.48f, 0.45f, 2.16f)
                curveToRelative(0.3f, 0.67f, 0.7f, 1.24f, 1.19f, 1.7f)
                curveToRelative(0.49f, 0.46f, 1.05f, 0.82f, 1.69f, 1.08f)
                curveToRelative(0.63f, 0.27f, 1.28f, 0.4f, 1.94f, 0.4f)
                curveToRelative(0.58f, 0.0f, 1.17f, -0.11f, 1.76f, -0.34f)
                curveToRelative(0.59f, -0.23f, 1.14f, -0.55f, 1.65f, -0.96f)
                curveToRelative(0.51f, -0.41f, 0.94f, -0.93f, 1.31f, -1.57f)
                curveToRelative(0.37f, -0.64f, 0.6f, -1.33f, 0.71f, -2.09f)
                curveToRelative(-1.63f, -0.34f, -2.94f, -1.04f, -3.92f, -2.1f)
                reflectiveCurveToRelative(-1.55f, -2.3f, -1.7f, -3.74f)
                curveTo(13.86f, 9.08f, 13.0f, 9.37f, 12.21f, 9.9f)
                curveToRelative(-0.78f, 0.53f, -1.39f, 1.2f, -1.82f, 2.02f)
                curveTo(9.96f, 12.74f, 9.74f, 13.59f, 9.74f, 14.48f)
                close()
            }
        }
        .build()
        return _nightClear!!
    }

private var _nightClear: ImageVector? = null
