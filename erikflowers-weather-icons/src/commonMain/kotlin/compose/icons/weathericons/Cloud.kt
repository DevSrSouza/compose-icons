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

public val WeatherIcons.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 30.0.dp, defaultHeight = 30.0.dp,
                viewportWidth = 30.0f, viewportHeight = 30.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.61f, 16.88f)
                curveToRelative(0.0f, -1.15f, 0.36f, -2.17f, 1.08f, -3.07f)
                curveToRelative(0.72f, -0.9f, 1.63f, -1.48f, 2.74f, -1.73f)
                curveToRelative(0.31f, -1.37f, 1.02f, -2.49f, 2.11f, -3.37f)
                reflectiveCurveToRelative(2.35f, -1.32f, 3.76f, -1.32f)
                curveToRelative(1.38f, 0.0f, 2.61f, 0.43f, 3.69f, 1.28f)
                reflectiveCurveToRelative(1.78f, 1.95f, 2.1f, 3.29f)
                horizontalLineToRelative(0.33f)
                curveToRelative(0.9f, 0.0f, 1.73f, 0.22f, 2.49f, 0.65f)
                reflectiveCurveToRelative(1.37f, 1.03f, 1.81f, 1.79f)
                curveToRelative(0.44f, 0.76f, 0.67f, 1.58f, 0.67f, 2.48f)
                curveToRelative(0.0f, 0.88f, -0.21f, 1.7f, -0.63f, 2.45f)
                reflectiveCurveToRelative(-1.0f, 1.35f, -1.73f, 1.8f)
                curveToRelative(-0.73f, 0.45f, -1.54f, 0.69f, -2.41f, 0.72f)
                horizontalLineTo(9.41f)
                curveToRelative(-1.34f, -0.06f, -2.47f, -0.57f, -3.4f, -1.53f)
                curveTo(5.08f, 19.37f, 4.61f, 18.22f, 4.61f, 16.88f)
                close()
                moveTo(6.32f, 16.88f)
                curveToRelative(0.0f, 0.87f, 0.3f, 1.62f, 0.9f, 2.26f)
                reflectiveCurveToRelative(1.33f, 0.98f, 2.19f, 1.03f)
                horizontalLineToRelative(11.19f)
                curveToRelative(0.86f, -0.04f, 1.59f, -0.39f, 2.19f, -1.03f)
                curveToRelative(0.61f, -0.64f, 0.91f, -1.4f, 0.91f, -2.26f)
                curveToRelative(0.0f, -0.88f, -0.33f, -1.63f, -0.98f, -2.27f)
                curveToRelative(-0.65f, -0.64f, -1.42f, -0.96f, -2.32f, -0.96f)
                horizontalLineTo(18.8f)
                curveToRelative(-0.11f, 0.0f, -0.17f, -0.06f, -0.17f, -0.18f)
                lineToRelative(-0.07f, -0.57f)
                curveToRelative(-0.11f, -1.08f, -0.58f, -1.99f, -1.4f, -2.72f)
                curveToRelative(-0.82f, -0.73f, -1.77f, -1.1f, -2.86f, -1.1f)
                curveToRelative(-1.09f, 0.0f, -2.05f, 0.37f, -2.85f, 1.1f)
                curveToRelative(-0.81f, 0.73f, -1.27f, 1.64f, -1.37f, 2.72f)
                lineToRelative(-0.08f, 0.57f)
                curveToRelative(0.0f, 0.12f, -0.07f, 0.18f, -0.2f, 0.18f)
                horizontalLineTo(9.27f)
                curveToRelative(-0.84f, 0.1f, -1.54f, 0.46f, -2.1f, 1.07f)
                reflectiveCurveTo(6.32f, 16.05f, 6.32f, 16.88f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
