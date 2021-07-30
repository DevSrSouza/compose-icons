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

public val WeatherIcons.Hurricane: ImageVector
    get() {
        if (_hurricane != null) {
            return _hurricane!!
        }
        _hurricane = Builder(name = "Hurricane", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.08f, 14.53f)
                verticalLineToRelative(-0.02f)
                curveToRelative(-0.01f, -0.08f, 0.0f, -0.2f, 0.0f, -0.37f)
                curveToRelative(0.01f, -0.16f, 0.04f, -0.43f, 0.1f, -0.81f)
                curveToRelative(0.06f, -0.38f, 0.14f, -0.76f, 0.25f, -1.15f)
                reflectiveCurveToRelative(0.28f, -0.84f, 0.51f, -1.35f)
                curveToRelative(0.23f, -0.51f, 0.5f, -0.99f, 0.82f, -1.44f)
                curveTo(13.08f, 8.94f, 13.5f, 8.47f, 14.02f, 8.0f)
                curveToRelative(0.52f, -0.47f, 1.1f, -0.89f, 1.73f, -1.24f)
                curveToRelative(0.16f, -0.09f, 0.32f, -0.11f, 0.49f, -0.06f)
                reflectiveCurveToRelative(0.3f, 0.15f, 0.38f, 0.31f)
                curveToRelative(0.09f, 0.16f, 0.11f, 0.32f, 0.06f, 0.5f)
                curveToRelative(-0.05f, 0.17f, -0.15f, 0.31f, -0.3f, 0.39f)
                curveToRelative(-1.31f, 0.72f, -2.32f, 1.73f, -3.03f, 3.05f)
                curveToRelative(0.54f, -0.25f, 1.08f, -0.38f, 1.63f, -0.38f)
                curveToRelative(1.07f, 0.0f, 2.0f, 0.38f, 2.77f, 1.15f)
                curveToRelative(0.77f, 0.77f, 1.15f, 1.69f, 1.15f, 2.76f)
                curveToRelative(0.0f, 0.08f, 0.0f, 0.16f, 0.0f, 0.24f)
                curveToRelative(0.0f, 0.08f, -0.02f, 0.25f, -0.04f, 0.52f)
                curveToRelative(-0.02f, 0.27f, -0.06f, 0.52f, -0.11f, 0.77f)
                curveToRelative(-0.05f, 0.25f, -0.13f, 0.56f, -0.23f, 0.93f)
                curveToRelative(-0.11f, 0.37f, -0.23f, 0.73f, -0.38f, 1.06f)
                curveToRelative(-0.15f, 0.33f, -0.34f, 0.7f, -0.58f, 1.1f)
                reflectiveCurveToRelative(-0.51f, 0.77f, -0.81f, 1.12f)
                curveToRelative(-0.3f, 0.35f, -0.66f, 0.7f, -1.08f, 1.05f)
                curveToRelative(-0.43f, 0.35f, -0.89f, 0.67f, -1.39f, 0.95f)
                curveToRelative(-0.09f, 0.06f, -0.2f, 0.08f, -0.31f, 0.08f)
                curveToRelative(-0.26f, 0.0f, -0.45f, -0.12f, -0.58f, -0.35f)
                curveToRelative(-0.09f, -0.16f, -0.11f, -0.32f, -0.06f, -0.49f)
                curveToRelative(0.05f, -0.17f, 0.15f, -0.3f, 0.31f, -0.38f)
                curveToRelative(1.34f, -0.75f, 2.36f, -1.78f, 3.06f, -3.08f)
                curveToRelative(-0.54f, 0.26f, -1.11f, 0.38f, -1.71f, 0.38f)
                curveToRelative(-0.69f, 0.0f, -1.34f, -0.17f, -1.94f, -0.52f)
                curveToRelative(-0.6f, -0.34f, -1.07f, -0.81f, -1.43f, -1.41f)
                curveTo(11.27f, 15.87f, 11.09f, 15.23f, 11.08f, 14.53f)
                close()
                moveTo(12.78f, 14.48f)
                curveToRelative(0.0f, 0.61f, 0.22f, 1.13f, 0.65f, 1.57f)
                curveToRelative(0.43f, 0.43f, 0.95f, 0.65f, 1.56f, 0.65f)
                curveToRelative(0.57f, 0.0f, 1.06f, -0.19f, 1.49f, -0.57f)
                curveToRelative(0.42f, -0.38f, 0.66f, -0.85f, 0.73f, -1.41f)
                lineToRelative(0.01f, -0.23f)
                curveToRelative(0.0f, -0.02f, 0.0f, -0.04f, 0.01f, -0.05f)
                curveToRelative(-0.01f, -0.6f, -0.23f, -1.11f, -0.66f, -1.52f)
                curveToRelative(-0.43f, -0.42f, -0.96f, -0.62f, -1.57f, -0.62f)
                curveToRelative(-0.56f, 0.0f, -1.04f, 0.18f, -1.46f, 0.54f)
                reflectiveCurveToRelative(-0.66f, 0.82f, -0.73f, 1.36f)
                lineToRelative(-0.02f, 0.25f)
                verticalLineTo(14.48f)
                close()
            }
        }
        .build()
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
